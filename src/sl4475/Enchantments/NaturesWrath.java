package sl4475.Enchantments;




import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import net.md_5.bungee.api.ChatColor;
public class NaturesWrath extends Enchantment implements Listener {

	public NaturesWrath(int id) {
		super(id);
	}
	Enchant plugin;
	
	@EventHandler
	public void onPlayerHitPlayer(EntityDamageByEntityEvent event) {
		if(event.isCancelled()) {
			return;
		}
		if(event.getEntity() instanceof Player && event.getDamager() instanceof Player) {
			Player p1= (Player)event.getEntity();
			
			double check= Math.random();
			if(p1.getInventory().getLeggings()==null|| p1.getInventory().getLeggings().getType()==Material.AIR) {
				return;
			}
			if(!p1.getInventory().getLeggings().containsEnchantment(this)|| check>.04) {
				return;
			}
			double p1x=p1.getLocation().getX();
			double p1z= p1.getLocation().getZ();
			p1.playSound(p1.getLocation(), Sound.ENDERDRAGON_GROWL, (float)4, (float)1);
			for( Player p : Bukkit.getOnlinePlayers()) {
				double px=p.getLocation().getX();
				double pz=p.getLocation().getZ();
				double distance = Math.sqrt(Math.pow(px-p1x, 2) +Math.pow( pz-p1z, 2));
				if(p!=p1 && distance< 20.0) {
					//Sound.WITHER_SPAWN
					p.playSound(p.getLocation(), Sound.ENDERDRAGON_GROWL, (float)4, (float)1);
					p.sendMessage(ChatColor.DARK_GREEN + "******** NATURES NIGGER ********");
					p.removePotionEffect(PotionEffectType.SLOW);
					p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 120, 7));
					p.setHealth(p.getHealth()-4.0);
					p.getWorld().strikeLightningEffect(p.getLocation());
				}
			}
			
			
			
		}
		
			
		
	}
	

	@Override
	public int getId() {
		return 111;
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
		return "Nature's Wrath";
	}

	@Override
	public int getStartLevel() {
		return 1;
	}

}