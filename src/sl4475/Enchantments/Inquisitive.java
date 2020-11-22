package sl4475.Enchantments;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;


public class Inquisitive extends Enchantment implements Listener {

	public Inquisitive(int id) {
		super(id);
	}

	@EventHandler
	public void onMobKill(EntityDeathEvent event) {
		
		if(event.getEntity().getKiller() instanceof Player) {
			Player player = event.getEntity().getKiller();
			ItemStack item = player.getItemInHand();
			if(item.getType().toString().toLowerCase().contains("sword")&&item.containsEnchantment(this)) {
				event.setDroppedExp(event.getDroppedExp()*2);
			}
		}
	}
	

	@Override
	public int getId() {
		return 106;
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
		return "Inquisitive";
	}

	@Override
	public int getStartLevel() {
		return 1;
	}

}