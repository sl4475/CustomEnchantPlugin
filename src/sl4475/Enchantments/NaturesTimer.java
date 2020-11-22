package sl4475.Enchantments;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class NaturesTimer implements Runnable {

	    public Player p1;
	    
	    public NaturesTimer (Player p) {
	    	
	        this.p1 = p;
	    }

	    public void run() {
	        for(int i=0;i<5;i++) {
	        	p1.sendMessage("natures pants");
	        	
	        	
	        	for( Player p : Bukkit.getOnlinePlayers()) {
					if(p!=this.p1) {
						p.removePotionEffect(PotionEffectType.SLOW);
						p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 4));
						p.getWorld().strikeLightning(p.getLocation());
						p1.sendMessage("hi111111");
					}
				}
	        	
	        	
		        try {
					Thread.sleep(2000);
					
				} catch (InterruptedException e) {
			
					e.printStackTrace();
				}
	        }
	        
	    }
	}

