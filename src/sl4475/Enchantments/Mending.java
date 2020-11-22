package sl4475.Enchantments;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.inventory.ItemStack;

public class Mending extends Enchantment implements Listener {

	public Mending(int id) {
		super(id);
	}

	@EventHandler
	public void onXPGain(PlayerExpChangeEvent event) {
		Player p = event.getPlayer();
		int xp = event.getAmount();
		ItemStack[] armor = p.getInventory().getArmorContents();
		//Boolean found=false;
		ItemStack hand = p.getItemInHand();
		if(hand!=null && !hand.getType().equals(Material.AIR)) {
			String tool = hand.getType().toString().toLowerCase();
			if((tool.contains("axe")|| tool.contains("shovel") || 
					tool.contains("sword") || tool.contains("bow")) && hand.containsEnchantment(this) &&hand.getDurability()!=0) {
				//found=true;
				//p.sendMessage("dur:" + (int)hand.getDurability() +" = xp " + xp +" ma dur: "+ hand.getType().getMaxDurability());
				if((int)hand.getDurability() -xp <0) {//heal to negative damage
					
					hand.setDurability((short) 0);
				}
				else {
					hand.setDurability((short) (hand.getDurability()-xp));
				}
				
			}
		}
		for(ItemStack item: armor) {
			if(item.containsEnchantment(this)&& item.getDurability()!=0) {
				//found=true;
				
				//p.sendMessage("dur:" + (int)item.getDurability() +" = xp " + xp +" ma dur: "+ item.getType().getMaxDurability());
				if((int)item.getDurability() -xp <0) {//heal to negative damage
					
					item.setDurability((short) 0);
				}
				else {
					item.setDurability((short) (item.getDurability()-xp));
				}
				
			}
		}
		
		//if(found)
		//	event.setAmount(0);
		
		
	}
	public void onLostEnchant() {
		
	}

	@Override
	public int getId() {
		return 114;
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
		return "Mending";
	}

	@Override
	public int getStartLevel() {
		return 1;
	}

}