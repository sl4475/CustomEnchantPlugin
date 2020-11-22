package sl4475.Enchantments;


import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import com.gmail.nossr50.api.ExperienceAPI;


public class AutoSmelt extends Enchantment implements Listener {

	public AutoSmelt(int id) {
		super(id);
	}

	@EventHandler
	public void onOreMine(BlockBreakEvent event) {
		Material block= event.getBlock().getType();
		if(block.equals(Material.IRON_ORE) && event.getPlayer() instanceof Player) {
			Player player = event.getPlayer();
			ItemStack item = player.getItemInHand();
			if(item.getType().toString().toLowerCase().contains("pickaxe")&&item.containsEnchantment(this)) {
				player.sendMessage("penis1:" + event.getBlock().getDrops());
				event.getBlock().setType(Material.AIR);
				double level = ExperienceAPI.getLevel(player, "mining");
				player.sendMessage("level1:" + level);
				double check = Math.random();
				if(check<level/1000) {
					event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.IRON_INGOT));
				}
	            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.IRON_INGOT));
				
				
			}
		}
		else if( block.equals(Material.GOLD_ORE) && event.getPlayer() instanceof Player) {
			Player player = event.getPlayer();
			ItemStack item = player.getItemInHand();
			if(item.getType().toString().toLowerCase().contains("pickaxe")&&item.containsEnchantment(this)) {
				player.sendMessage("penis2:" + event.getBlock().getDrops());
				event.getBlock().setType(Material.AIR);
				double level = ExperienceAPI.getLevel(player, "mining");
				player.sendMessage("level2:" + level);
				double check = Math.random();
				if(check<level/1000) {
					event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.GOLD_INGOT));
				}
	            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.GOLD_INGOT));
				
			}
		}
	}
	

	@Override
	public int getId() {
		return 108;
	}

	@Override
	public boolean canEnchantItem(ItemStack arg0) {
		return true;
	}

	@Override
	public boolean conflictsWith(Enchantment arg0) {
		return false;
	}

	@Override
	public EnchantmentTarget getItemTarget() {
		return null;
	}

	@Override
	public int getMaxLevel() {
		return 1;
	}

	@Override
	public String getName() {
		return "Auto Smelt";
	}

	@Override
	public int getStartLevel() {
		return 1;
	}

}