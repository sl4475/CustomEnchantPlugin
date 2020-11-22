package sl4475.Enchantments;


import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class Haste extends Enchantment implements Listener {

	public Haste(int id) {
		super(id);
	}

	@EventHandler
	public void onOreMine(BlockBreakEvent event) {
		
		if( event.getPlayer() instanceof Player) {
			Player player = event.getPlayer();
			ItemStack item = player.getItemInHand();
			if(item.containsEnchantment(this)&& item.getType().toString().toLowerCase().contains("pickaxe")) {
				player.removePotionEffect(PotionEffectType.FAST_DIGGING);
				player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 60, 1));
				
			}
		}
		
	}

	@Override
	public int getId() {
		return 109;
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
		return "Haste";
	}

	@Override
	public int getStartLevel() {
		return 1;
	}

}