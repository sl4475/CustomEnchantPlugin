package sl4475.Enchantments;


import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;


public class Detonate extends Enchantment implements Listener {

	public Detonate(int id) {
		super(id);
	}

	@EventHandler
	public void onBlockMine(BlockBreakEvent event) {
		
		if( event.getPlayer() instanceof Player) {
			Player player = event.getPlayer();
			if(player.getItemInHand()==null) {
				return;
			}
			ItemStack item = player.getItemInHand();
			
			if(item.containsEnchantment(this)&& item.getType().toString().toLowerCase().contains("pickaxe")) {
				double playerx = player.getLocation().getX();
				double playerz = player.getLocation().getZ();
				double blockx = event.getBlock().getLocation().getX();
				double blocky=event.getBlock().getLocation().getY();
				double blockz = event.getBlock().getLocation().getZ();
				double xdis = Math.abs(playerx-blockx );
				double zdis = Math.abs(playerz-blockz);
				Block b1=event.getBlock(), b2=b1, b3=b1,b4=b1,b5=b1,b6=b1,b7=b1,b8=b1;
				
				if(playerx<blockx&&playerz<blockz) {
					//quad nw
					if(xdis<zdis) {
						//north	
						b1 =event.getBlock().getWorld().getBlockAt((int)blockx+1, (int)blocky+1, (int)blockz);
						b2 =event.getBlock().getWorld().getBlockAt((int)blockx+1, (int)blocky, (int)blockz);
						b3 =event.getBlock().getWorld().getBlockAt((int)blockx+1, (int)blocky-1, (int)blockz);
						b4 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky+1, (int)blockz);
						b5 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky-1, (int)blockz);
						b6 =event.getBlock().getWorld().getBlockAt((int)blockx-1, (int)blocky+1, (int)blockz);
						b7 =event.getBlock().getWorld().getBlockAt((int)blockx-1, (int)blocky, (int)blockz);
						b8 =event.getBlock().getWorld().getBlockAt((int)blockx-1, (int)blocky-1, (int)blockz);
					}else {
						//west
						b1 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky+1, (int)blockz+1);
						b2 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky, (int)blockz+1);
						b3 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky-1, (int)blockz+1);
						b4 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky+1, (int)blockz);
						b5 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky-1, (int)blockz);
						b6 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky+1, (int)blockz-1);
						b7 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky, (int)blockz-1);
						b8 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky-1, (int)blockz-1);
					}
				}
				else if(playerx>blockx&&playerz<blockz) {
					//quad ne
					if(xdis<zdis) {
						//north	
						b1 =event.getBlock().getWorld().getBlockAt((int)blockx+1, (int)blocky+1, (int)blockz);
						b2 =event.getBlock().getWorld().getBlockAt((int)blockx+1, (int)blocky, (int)blockz);
						b3 =event.getBlock().getWorld().getBlockAt((int)blockx+1, (int)blocky-1, (int)blockz);
						b4 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky+1, (int)blockz);
						b5 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky-1, (int)blockz);
						b6 =event.getBlock().getWorld().getBlockAt((int)blockx-1, (int)blocky+1, (int)blockz);
						b7 =event.getBlock().getWorld().getBlockAt((int)blockx-1, (int)blocky, (int)blockz);
						b8 =event.getBlock().getWorld().getBlockAt((int)blockx-1, (int)blocky-1, (int)blockz);
					}else {
						//east
						b1 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky+1, (int)blockz+1);
						b2 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky, (int)blockz+1);
						b3 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky-1, (int)blockz+1);
						b4 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky+1, (int)blockz);
						b5 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky-1, (int)blockz);
						b6 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky+1, (int)blockz-1);
						b7 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky, (int)blockz-1);
						b8 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky-1, (int)blockz-1);
					}
				}
				else if(playerx<blockx&&playerz>blockz) {
					//quad sw
					if(xdis<zdis) {
						//north	
						b1 =event.getBlock().getWorld().getBlockAt((int)blockx+1, (int)blocky+1, (int)blockz);
						b2 =event.getBlock().getWorld().getBlockAt((int)blockx+1, (int)blocky, (int)blockz);
						b3 =event.getBlock().getWorld().getBlockAt((int)blockx+1, (int)blocky-1, (int)blockz);
						b4 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky+1, (int)blockz);
						b5 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky-1, (int)blockz);
						b6 =event.getBlock().getWorld().getBlockAt((int)blockx-1, (int)blocky+1, (int)blockz);
						b7 =event.getBlock().getWorld().getBlockAt((int)blockx-1, (int)blocky, (int)blockz);
						b8 =event.getBlock().getWorld().getBlockAt((int)blockx-1, (int)blocky-1, (int)blockz);
					}else {
						//west
						b1 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky+1, (int)blockz+1);
						b2 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky, (int)blockz+1);
						b3 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky-1, (int)blockz+1);
						b4 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky+1, (int)blockz);
						b5 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky-1, (int)blockz);
						b6 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky+1, (int)blockz-1);
						b7 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky, (int)blockz-1);
						b8 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky-1, (int)blockz-1);
					}
				}
				else { //(playerx>blockx&&playerz>blockz) {
					//quad se
					if(xdis<zdis) {
						//north	
						b1 =event.getBlock().getWorld().getBlockAt((int)blockx+1, (int)blocky+1, (int)blockz);
						b2 =event.getBlock().getWorld().getBlockAt((int)blockx+1, (int)blocky, (int)blockz);
						b3 =event.getBlock().getWorld().getBlockAt((int)blockx+1, (int)blocky-1, (int)blockz);
						b4 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky+1, (int)blockz);
						b5 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky-1, (int)blockz);
						b6 =event.getBlock().getWorld().getBlockAt((int)blockx-1, (int)blocky+1, (int)blockz);
						b7 =event.getBlock().getWorld().getBlockAt((int)blockx-1, (int)blocky, (int)blockz);
						b8 =event.getBlock().getWorld().getBlockAt((int)blockx-1, (int)blocky-1, (int)blockz);
					}else {
						//west
						b1 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky+1, (int)blockz+1);
						b2 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky, (int)blockz+1);
						b3 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky-1, (int)blockz+1);
						b4 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky+1, (int)blockz);
						b5 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky-1, (int)blockz);
						b6 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky+1, (int)blockz-1);
						b7 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky, (int)blockz-1);
						b8 =event.getBlock().getWorld().getBlockAt((int)blockx, (int)blocky-1, (int)blockz-1);
					}
				}
				
					player.sendMessage("boom2");
					if(!b1.getType().equals(Material.AIR)) {
						event.getBlock().getWorld().dropItem(event.getBlock().getLocation(), new ItemStack(b1.getType(), 1));
						b1.setType(Material.AIR);
					}
					if(!b2.getType().equals(Material.AIR)) {
						event.getBlock().getWorld().dropItem(event.getBlock().getLocation(), new ItemStack(b2.getType(), 1));
						b2.setType(Material.AIR);
					}
					if(!b3.getType().equals(Material.AIR)) {
						event.getBlock().getWorld().dropItem(event.getBlock().getLocation(), new ItemStack(b3.getType(), 1));
						b3.setType(Material.AIR);
					}
					if(!b4.getType().equals(Material.AIR)) {
						event.getBlock().getWorld().dropItem(event.getBlock().getLocation(), new ItemStack(b4.getType(), 1));
						b4.setType(Material.AIR);
					}
					if(!b5.getType().equals(Material.AIR)) {
						event.getBlock().getWorld().dropItem(event.getBlock().getLocation(), new ItemStack(b5.getType(), 1));
						b5.setType(Material.AIR);
					}
					if(!b6.getType().equals(Material.AIR)) {
						event.getBlock().getWorld().dropItem(event.getBlock().getLocation(), new ItemStack(b6.getType(), 1));
						b6.setType(Material.AIR);
					}
					if(!b7.getType().equals(Material.AIR)) {
						event.getBlock().getWorld().dropItem(event.getBlock().getLocation(), new ItemStack(b7.getType(), 1));
						b7.setType(Material.AIR);
					}
					if(!b8.getType().equals(Material.AIR)) {
						event.getBlock().getWorld().dropItem(event.getBlock().getLocation(), new ItemStack(b8.getType(), 1));
						b8.setType(Material.AIR);
					}
				
			}
		}
		
	}

	@Override
	public int getId() {
		return 110;
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
		return "Detonate";
	}

	@Override
	public int getStartLevel() {
		return 1;
	}

}