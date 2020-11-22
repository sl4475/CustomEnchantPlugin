package sl4475.Enchantments;


import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.gmail.nossr50.api.ExperienceAPI;


public class Magnetism extends Enchantment implements Listener {

	public Magnetism(int id) {
		super(id);
	}

	@EventHandler
	public void onSugarCaneMine(BlockBreakEvent event) {
		Block block= event.getBlock();
		if(block.getType().equals(Material.SUGAR_CANE_BLOCK) && event.getPlayer() instanceof Player) {
			Player player = event.getPlayer();
			ItemStack item = player.getItemInHand();
			if(item!=null && item.getType().toString().toLowerCase().contains("hoe")&&item.containsEnchantment(this)) {
				event.setCancelled(true);
				double level = ExperienceAPI.getLevel(player, "herbalism");
				
				
                int sugarCane = 0;
                int newY = 0;
                for (int y = block.getY(); y != 255; y++) {
                    // get the block relative to that height
                    Location newLoc = new Location(block.getWorld(), block.getX(), y, block.getZ());
                    //player.sendMessage(""+newLoc.getBlock().getType());
                    if(newLoc.getBlock().getType().equals(Material.SUGAR_CANE_BLOCK))
                    {
                    	double check = Math.random();
    					if(check<level/1000) {
    						//player.sendMessage("BONUS");
    						sugarCane++;
    					}
                        sugarCane++;
                    }
                    else {
                        newY = y;
                        player.getInventory().addItem(new ItemStack(Material.SUGAR_CANE, sugarCane));
                        break;
                    }
                }
                //set sugar canes to air
                for(int y = newY; y != block.getY(); y--)
                {
                	Location newLoc = new Location(block.getWorld(), block.getX(), y, block.getZ());
                    if(newLoc.getBlock().getType().equals(Material.SUGAR_CANE_BLOCK)) {
                    	newLoc.getBlock().setType(Material.AIR);
                    }
                }
                block.setType(Material.AIR);
                
                
				
			}
		}
		
	}
	

	@Override
	public int getId() {
		return 125;
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
		return "Magnetism";
	}

	@Override
	public int getStartLevel() {
		return 1;
	}

}