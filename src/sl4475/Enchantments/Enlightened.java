package sl4475.Enchantments;


import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

public class Enlightened extends Enchantment implements Listener {

	public Enlightened(int id) {
		super(id);
	}

	@EventHandler
	public void onHit(EntityDamageByEntityEvent event) {
		if(event.isCancelled()) {
			return;
		}
		if (event.getEntity() instanceof Player) {
			Player p = (Player) event.getEntity();
			ItemStack item= p.getInventory().getChestplate();
			
			if(item!=null&&item.containsEnchantment(this)) {
				double rand = Math.random();
				double chance= .15;
				if(rand<chance) {
					//p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, (float)2, (float)1);
					p.setHealth(p.getHealth()+ 1.0);
				}
			}
			
		
		}
		
	}
	

	@Override
	public int getId() {
		return 118;
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
		return "Enlightened";
	}

	@Override
	public int getStartLevel() {
		return 1;
	}

}