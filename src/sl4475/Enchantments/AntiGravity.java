package sl4475.Enchantments;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class AntiGravity extends Enchantment implements Listener {

	public AntiGravity(int id) {
		super(id);
	}

	@EventHandler
	public void onBootsRightClick(PlayerInteractEvent event) {
		if(event.getAction()==Action.LEFT_CLICK_BLOCK||event.getAction()==Action.LEFT_CLICK_AIR) {
			
		}
		else {
			ItemStack item = event.getPlayer().getItemInHand();
			Player player= (Player) event.getPlayer();
			//Bukkit.getLogger().info("hand= " + item.toString());
			
			if(item.getType().toString().toLowerCase().contains("boots")){
				if (player.getInventory().getBoots()==null) {
					if(item.containsEnchantment(this)) {
						player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 1));
						//Bukkit.getLogger().info("add1");
					}
			
					else {
						player.removePotionEffect(PotionEffectType.JUMP);
						//Bukkit.getLogger().info("remove1");
					}
				}
			}
		}
		
			
		
	}
	@EventHandler
	public void onBootsDrag(InventoryClickEvent event) {
		if(event.getInventory()==null|| (event.getCurrentItem()==null || event.getCursor()==null)) {
			return;
		}
		ItemStack item = event.getCurrentItem();
		ItemStack item2 = event.getCursor();
		//Bukkit.getLogger().info("item: " + item.toString());
		//Bukkit.getLogger().info("item2: "+ item2.toString());
		if(item.getType().equals(Material.AIR) && item2.getType().equals(Material.AIR)) {
			return;
		}
		if(item.getType().toString().toLowerCase().contains("boots") || 
				item2.getType().toString().toLowerCase().contains("boots")){
			
			
		
			Player player= (Player) event.getWhoClicked();
			if(event.isShiftClick()){
				if(player.getInventory().getBoots()==null && item.containsEnchantment(this)&& 
						event.getInventory().toString().toLowerCase().contains("crafting")) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 1));
					//Bukkit.getLogger().info("add1");
				}
			}
			if(event.getSlot()==36) {
				if(item2.containsEnchantment(this)) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 1));
					
				}
				else {
					player.removePotionEffect(PotionEffectType.JUMP);
					
				}
			}
		
		
			//PlayerInventory pi= (PlayerInventory)event.getInventory();
			if(player.getInventory().getBoots()!=null&& player.getInventory().getBoots().containsEnchantment(this)) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 1));
				//Bukkit.getLogger().info("add2");
				
			}
			if( player.getInventory().getBoots()!=null&&item.equals(player.getInventory().getBoots())){
				if(item2.containsEnchantment(this)) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 1));
					//Bukkit.getLogger().info("add3");
				}
				else {
					player.removePotionEffect(PotionEffectType.JUMP);
					//Bukkit.getLogger().info("remove2");
				}
			}
			else if( player.getInventory().getBoots()!=null&&item2.equals(player.getInventory().getBoots())){
				if(item2.containsEnchantment(this)) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 1));
					//Bukkit.getLogger().info("add4");
				}
				else {
					player.removePotionEffect(PotionEffectType.JUMP);
					//Bukkit.getLogger().info("remove3");
				}
			}
		}
		
		
			
		
	}
	

	@Override
	public int getId() {
		return 112;
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
		return "AntiGravity";
	}

	@Override
	public int getStartLevel() {
		return 1;
	}

}
