package sl4475.Enchantments;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

public class DemonicLifesteal extends Enchantment implements Listener {

	public DemonicLifesteal(int id) {
		super(id);
	}

	@EventHandler
	public void onHit(EntityDamageByEntityEvent event) {
		if(event.isCancelled()) {
			return;
		}
		if (event.getDamager() instanceof Player && event.getEntity() instanceof Player) {
			Player player = (Player) event.getDamager();
			Player player2= (Player) event.getEntity();
			ItemStack mainhand = player.getInventory().getItemInHand();

			double check = Math.random();
			if (mainhand.containsEnchantment(this)&& check<.20) {
				if(player.getHealth()+1.0>player.getMaxHealth()) {
					player.setHealth(player.getMaxHealth());
				}
				else {
					player.setHealth(player.getHealth()+2.0);//give a heart
				}
				
				player2.setHealth(player2.getHealth()-2.0);//takes a heart
				
			}
		}
	}
	

	@Override
	public int getId() {
		return 124;
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
		return "Demonic Lifesteal";
	}

	@Override
	public int getStartLevel() {
		return 1;
	}

}