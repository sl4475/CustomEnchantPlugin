package sl4475.Enchantments;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

public class Teleportation extends Enchantment implements Listener {

	public Teleportation(int id) {
		super(id);
	}

	@EventHandler
	public void onHit(EntityDamageByEntityEvent event) {
		
		if (event.getDamager() instanceof Arrow && event.getEntity() instanceof Player ) {
			Arrow arrow =(Arrow)event.getDamager();
			Player player2= (Player) event.getEntity();
			if(arrow.getShooter() instanceof Player) {
				Player player=(Player) arrow.getShooter();
				ItemStack mainhand = player.getInventory().getItemInHand();
				if(mainhand==null|| !mainhand.getType().toString().toLowerCase().contains("bow")) {
					return;
				}
				if (mainhand.containsEnchantment(this)) {
					player.teleport(player2.getLocation());
					event.setCancelled(true);
				}
			}
		}
	}
	

	@Override
	public int getId() {
		return 119;
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
		return "Teleportation";
	}

	@Override
	public int getStartLevel() {
		return 1;
	}

}