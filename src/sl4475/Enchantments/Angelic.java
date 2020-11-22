package sl4475.Enchantments;


import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Angelic extends Enchantment implements Listener {

	public Angelic(int id) {
		super(id);
	}

	@EventHandler
	public void onHit(EntityDamageByEntityEvent event) {
		if(event.isCancelled()) {
			return;
		}
		if (event.getEntity() instanceof Player) {
			Player p = (Player) event.getEntity();
			ItemStack[] armor = p.getInventory().getArmorContents();
			double rand = Math.random();
			double chance = 0.0;
			for(ItemStack item: armor) {
				if(item.containsEnchantment(this)) {
					chance+=.05;
					
				}
			}
			if(rand<chance) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 100,1));
			}
		
		}
		
	}
	public void onLostEnchant() {
		
	}

	@Override
	public int getId() {
		return 117;
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
		return "Angelic";
	}

	@Override
	public int getStartLevel() {
		return 1;
	}

}