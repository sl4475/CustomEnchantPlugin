package sl4475.Enchantments;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

import net.md_5.bungee.api.ChatColor;

public class Enchant extends JavaPlugin implements Listener {

	public IceAspect ice = new IceAspect(101);
	public Drowsy drowsy = new Drowsy(102);
	public Overload overload= new Overload(103);
	public Implants implants = new Implants(104);
	public Gears gears= new Gears(105);
	public Inquisitive inquisitive = new Inquisitive(106);
	public ObsidianShield obsidianshield = new ObsidianShield(107);
	public AutoSmelt autosmelt = new AutoSmelt(108);
	public Haste haste= new Haste(109);
	public Detonate detonate= new Detonate(110);
	public NaturesWrath natures= new NaturesWrath(111);
	public AntiGravity anti = new AntiGravity(112);
	public NightVision nightvision = new NightVision(113);
	public Mending mending = new Mending(114);
	public Venom venom = new Venom(115);
	public GodlyOverload godly= new GodlyOverload(116);
	public Angelic angelic = new Angelic(117);
	public Enlightened enlightened = new Enlightened(118);
	public Teleportation teleportation = new Teleportation(119);
	public Deathbringer db = new Deathbringer(120);
	public DivineEnlightened de = new DivineEnlightened(121);
	public PlanetaryDeathbringer pdb = new PlanetaryDeathbringer(122);
	public Lifesteal lifesteal = new Lifesteal(123);
	public DemonicLifesteal dl = new DemonicLifesteal(124);
	public Magnetism magnet = new Magnetism(125);
	
	public void onEnable() {
		LoadEnchantments();
		this.getServer().getPluginManager().registerEvents(this, this);
		this.getServer().getPluginManager().registerEvents(ice, this);
		this.getServer().getPluginManager().registerEvents(drowsy, this);
		this.getServer().getPluginManager().registerEvents(overload, this);
		this.getServer().getPluginManager().registerEvents(implants, this);
		this.getServer().getPluginManager().registerEvents(gears, this);
		this.getServer().getPluginManager().registerEvents(inquisitive, this);
		this.getServer().getPluginManager().registerEvents(obsidianshield, this);
		this.getServer().getPluginManager().registerEvents(autosmelt, this);
		this.getServer().getPluginManager().registerEvents(haste, this);
		this.getServer().getPluginManager().registerEvents(detonate, this);
		this.getServer().getPluginManager().registerEvents(natures, this);
		this.getServer().getPluginManager().registerEvents(anti, this);
		this.getServer().getPluginManager().registerEvents(nightvision, this);
		this.getServer().getPluginManager().registerEvents(mending, this);
		this.getServer().getPluginManager().registerEvents(venom, this);
		this.getServer().getPluginManager().registerEvents(godly, this);
		this.getServer().getPluginManager().registerEvents(angelic, this);
		this.getServer().getPluginManager().registerEvents(enlightened, this);
		this.getServer().getPluginManager().registerEvents(teleportation, this);
		this.getServer().getPluginManager().registerEvents(db, this);
		this.getServer().getPluginManager().registerEvents(de, this);
		this.getServer().getPluginManager().registerEvents(pdb, this);
		this.getServer().getPluginManager().registerEvents(lifesteal, this);
		this.getServer().getPluginManager().registerEvents(dl, this);
		this.getServer().getPluginManager().registerEvents(magnet, this);
		
		
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		
	}
	
	public int natures(Player p1){
		Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
		@Override
		public void run() {
			p1.sendMessage("heeeeeeee");
			for( Player p : Bukkit.getOnlinePlayers()) {
				if(p!=p1) {
					p.removePotionEffect(PotionEffectType.SLOW);
					p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 4));
					p.getWorld().strikeLightning(p.getLocation());
					p1.sendMessage("hi111111");
				}
			}
		}
		},20 *8);
		return 1;
	}
	@EventHandler
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			if(command.getName().contentEquals("enchants")) {

				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Angelic: regeneration(stackable). All armor. 65.");
				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Anti Gravity: Jump Boost 2. Boots. 50");
				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Auto Smelt: Insta smelts iron and gold ore. Pickaxe. 50.");
				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Deathbringer: Chance for double damage. chestplate. 80.");
				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Detonate: Mines 3 by 3. Pickaxe. 50.");
				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Divine Enlightened: enlightened on steroids(needs enlightened). chestplate. 150.");
				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Drowsy: Mining fatigue. Sword. Free.");
				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Enlightened: heal sometimes when hit. chestplate. 80.");
				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Gears: Speed 2. Boots. 75.");
				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Godly Overload: Health boost(12 hearts. needs overload). Chestplate. 160.");
				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Haste: Haste. Pickaxe. 50.");
				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Ice Aspect: Slowness. Sword. Free.");
				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Implants: Saturation. Sword. 60 .");
				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Inquisitive: Gives double xp from mobs. Sword. 90.");
				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Mending: Repair stuff with xp. armor/tools. 50");
				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Nature's Wrath: Hits nearby players with lightning and slows. Leggings. 160.");
				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Night Vision: Gives night vision Helmet. 40.");
				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Obsidian Shield: Fire res. Leggings. 75.");
				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Overload: Health boost(6 hearts). Chestplate. 100.");
				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Planetary Deathbringer: Deathbringer on steroids(requires deathbringer) chestplate. 160.");
				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Teleportation: shoot players to tp to them(bow does not do damage). bow. 50.");
				sender.sendMessage("------------------------------------------------------");
				sender.sendMessage("Venom: Poison arrows. Bow. 50.");
				sender.sendMessage("------------------------------------------------------");
				
				
			}
			else if(command.getName().equals("ice")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				if(item.getType().toString().toLowerCase().contains("sword")) {
					if(item.containsEnchantment(ice)){
						player.sendMessage("This item already has the enchant");
						return false;
					}
					ArrayList<String> lore = new ArrayList<String>();
					
					ItemMeta meta = item.getItemMeta();
					if(meta.hasLore()) {
						lore = (ArrayList<String>) meta.getLore();
					}
					lore.add(ChatColor.BLUE + ice.getName() );
				
					meta.setLore(lore);
					item.setItemMeta(meta);
				
					item.addUnsafeEnchantment(ice, 1);
					return true;
				}
			}
			else if(command.getName().equals("drowsy")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				if(item.getType().toString().toLowerCase().contains("sword")) {

					if(item.containsEnchantment(drowsy)){
						player.sendMessage("This item already has the enchant");
						return false;
					}
					ArrayList<String> lore = new ArrayList<String>();
					
					ItemMeta meta = item.getItemMeta();
					if(meta.hasLore()) {
						lore = (ArrayList<String>) meta.getLore();
					}
					lore.add(ChatColor.DARK_PURPLE + drowsy.getName() );
				
					meta.setLore(lore);
					item.setItemMeta(meta);
				
					item.addUnsafeEnchantment(drowsy, 1);
					return true;
				}
			}
			else if(command.getName().equals("overload")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				if(item.getType().toString().toLowerCase().contains("chestplate")) {
					if(player.getLevel()>=100){
						if(item.containsEnchantment(overload)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						if(item.containsEnchantment(godly)) {
							player.sendMessage("This item already has an overload");
							return false;
						}
						player.setLevel(player.getLevel()-100);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						lore.add(ChatColor.GOLD + overload.getName() );
				
						meta.setLore(lore);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(overload, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else {
					player.sendMessage("You can only put overload on a chestplate, you monkey looking thing");
				}
			}
			else if(command.getName().equals("implants")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				if(item.getType().toString().toLowerCase().contains("helmet")) {
					if(player.getLevel()>=60){
						if(item.containsEnchantment(implants)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						player.setLevel(player.getLevel()-60);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						lore.add(ChatColor.DARK_AQUA + implants.getName() );
				
						meta.setLore(lore);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(implants, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else{
					player.sendMessage("you can only put implants on a helmet, you monkey looking thing");
				}
			}
			else if(command.getName().equals("gears")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				if(item.getType().toString().toLowerCase().contains("boots")) {
					if(player.getLevel()>=75){
						if(item.containsEnchantment(gears)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						player.setLevel(player.getLevel()-75);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						lore.add(ChatColor.GREEN + gears.getName() );
				
						meta.setLore(lore);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(gears, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else{
					player.sendMessage("you can only put gears on boots, you monkey looking thing");
				}
			}
			else if(command.getName().equals("inquisitive")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				if(item.getType().toString().toLowerCase().contains("sword")) {
					if(player.getLevel()>=90){
						if(item.containsEnchantment(inquisitive)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						player.setLevel(player.getLevel()-90);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						lore.add(ChatColor.GOLD + inquisitive.getName() );
				
						meta.setLore(lore);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(inquisitive, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else{
					player.sendMessage("you can only put inquisitive on a sword, you monkey looking thing");
				}
			}
			else if(command.getName().equals("obsidianshield")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				if(item.getType().toString().toLowerCase().contains("leggings")) {
					if(player.getLevel()>=75){
						if(item.containsEnchantment(obsidianshield)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						player.setLevel(player.getLevel()-75);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						lore.add(ChatColor.YELLOW + obsidianshield.getName() );
				
						meta.setLore(lore);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(obsidianshield, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else{
					player.sendMessage("you can only put obsidian shield on leggings, you monkey looking thing");
				}
			}
			else if(command.getName().equals("autosmelt")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				if(item.getType().toString().toLowerCase().contains("pickaxe")) {
					if(player.getLevel()>=50){
						if(item.containsEnchantment(autosmelt)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						player.setLevel(player.getLevel()-50);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						lore.add(ChatColor.WHITE + autosmelt.getName() );
				
						meta.setLore(lore);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(autosmelt, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else{
					player.sendMessage("you can only put autosmelt on a pickaxe, you monkey looking thing");
				}
			}
			else if(command.getName().equals("haste")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				if(item.getType().toString().toLowerCase().contains("pickaxe")) {
					if(player.getLevel()>=50){
						if(item.containsEnchantment(haste)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						player.setLevel(player.getLevel()-50);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						lore.add(ChatColor.WHITE + haste.getName() );
				
						meta.setLore(lore);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(haste, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else{
					player.sendMessage("you can only put haste on a pickaxe, you monkey looking thing");
				}
			}
			else if(command.getName().equals("detonate")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				if(item.getType().toString().toLowerCase().contains("pickaxe")) {
					if(player.getLevel()>=50){
						if(item.containsEnchantment(detonate)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						player.setLevel(player.getLevel()-50);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						lore.add(ChatColor.YELLOW + detonate.getName() );
				
						meta.setLore(lore);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(detonate, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else{
					player.sendMessage("you can only put detonate on a pickaxe, you monkey looking thing");
				}
			}
			else if(command.getName().equals("natures")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				if(item.getType().toString().toLowerCase().contains("leggings")) {
					if(player.getLevel()>=160){
						if(item.containsEnchantment(natures)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						player.setLevel(player.getLevel()-160);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						lore.add(ChatColor.RED + natures.getName() );
				
						meta.setLore(lore);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(natures, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else{
					player.sendMessage("you can only put natures on leggings, you monkey looking thing");
				}
			}
			else if(command.getName().equals("anti")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				if(item.getType().toString().toLowerCase().contains("boots")) {
					if(player.getLevel()>=50){
						if(item.containsEnchantment(anti)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						player.setLevel(player.getLevel()-50);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						lore.add(ChatColor.BLUE + anti.getName() );
				
						meta.setLore(lore);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(anti, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else{
					player.sendMessage("you can only put antigravity on boots, you monkey looking thing");
				}
			}
			else if(command.getName().equals("nightvision")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				if(item.getType().toString().toLowerCase().contains("helmet")) {
					if(player.getLevel()>=40){
						if(item.containsEnchantment(nightvision)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						player.setLevel(player.getLevel()-40);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						lore.add(ChatColor.BLUE + nightvision.getName() );
				
						meta.setLore(lore);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(nightvision, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else{
					player.sendMessage("you can only put nightvision on a helmet, you monkey looking thing");
				}
			}
			else if(command.getName().equals("mending")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				String name = item.getType().toString().toLowerCase();
				if(name.contains("helmet")||name.contains("chestplate")||name.contains("leggings") || name.contains("boots") 
						|| name.contains("sword")|| name.contains("axe")|| name.contains("shovel") ) {
					if(player.getLevel()>=50){
						if(item.containsEnchantment(mending)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						player.setLevel(player.getLevel()-50);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						lore.add(ChatColor.GREEN + mending.getName() );
				
						meta.setLore(lore);
						item.setItemMeta(meta);
						
						item.addUnsafeEnchantment(mending, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else{
					player.sendMessage("you can only put mending on tools and armor besides bows and hoes, you monkey looking thing");
				}
			}
			else if(command.getName().equals("venom")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				if(item.getType().toString().toLowerCase().contains("bow")) {
					if(player.getLevel()>=50){
						if(item.containsEnchantment(venom)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						player.setLevel(player.getLevel()-50);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						lore.add(ChatColor.DARK_GREEN + venom.getName() );
				
						meta.setLore(lore);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(venom, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else{
					player.sendMessage("you can only put venom on a bow, you monkey looking thing");
				}
			}
			else if(command.getName().equals("godly")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				if(item.getType().toString().toLowerCase().contains("chestplate")) {
					if(player.getLevel()>=160){
						if(item.containsEnchantment(godly)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						if(!item.containsEnchantment(overload)) {
							player.sendMessage("Overload is required for godly overload");
							return false;
						}
						item.removeEnchantment(overload);
						player.setLevel(player.getLevel()-160);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						ArrayList<String> lore2 = new ArrayList<String>();
						for(int i=0;i<lore.size();i++) {
							if(!lore.get(i).toLowerCase().toString().contains("overload")) {
								lore2.add(lore.get(i));
							}
						}
						lore2.add( ChatColor.LIGHT_PURPLE + godly.getName() );
				
						meta.setLore(lore2);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(godly, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else {
					player.sendMessage("You can only put godly overload on a chestplate that already has overload, you monkey looking thing");
				}
			}
			else if(command.getName().equals("angelic")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				String name=item.getType().toString().toLowerCase();
				if(name.contains("helmet")||name.contains("chestplate")||name.contains("leggings")||name.contains("boots")) {
					if(player.getLevel()>=65){
						if(item.containsEnchantment(angelic)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						player.setLevel(player.getLevel()-65);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						lore.add(ChatColor.YELLOW + angelic.getName() );
				
						meta.setLore(lore);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(angelic, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else{
					player.sendMessage("you can only put angelic on armor, you monkey looking thing");
				}
			}
			else if(command.getName().equals("enlightened")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				String name=item.getType().toString().toLowerCase();
				if(name.contains("chestplate")) {
					if(player.getLevel()>=80){
						if(item.containsEnchantment(enlightened)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						player.setLevel(player.getLevel()-80);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						lore.add(ChatColor.GOLD + enlightened.getName() );
				
						meta.setLore(lore);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(enlightened, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else{
					player.sendMessage("you can only put enlightened on a chestplate, you monkey looking thing");
				}
			}
			else if(command.getName().equals("teleportation")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				String name=item.getType().toString().toLowerCase();
				if(name.contains("bow")) {
					if(player.getLevel()>=50){
						if(item.containsEnchantment(teleportation)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						player.setLevel(player.getLevel()-50);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						lore.add(ChatColor.AQUA + teleportation.getName() );
				
						meta.setLore(lore);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(teleportation, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else{
					player.sendMessage("you can only put teleportation on a bow, you monkey looking thing");
				}
			}
			else if(command.getName().equals("deathbringer")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				String name=item.getType().toString().toLowerCase();
				if(name.contains("chestplate")) {
					if(player.getLevel()>=80){
						if(item.containsEnchantment(db)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						player.setLevel(player.getLevel()-80);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						lore.add(ChatColor.GOLD + db.getName() );
				
						meta.setLore(lore);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(db, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else{
					player.sendMessage("you can only put deathbringer on a chestplate, you monkey looking thing");
				}
			}
			else if(command.getName().equals("planetary")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				if(item.getType().toString().toLowerCase().contains("chestplate")) {
					if(player.getLevel()>=160){
						if(item.containsEnchantment(pdb)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						if(!item.containsEnchantment(db)) {
							player.sendMessage("Deathbringer is required for planetary deathbringer");
							return false;
						}
						item.removeEnchantment(db);
						player.setLevel(player.getLevel()-160);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						ArrayList<String> lore2 = new ArrayList<String>();
						for(int i=0;i<lore.size();i++) {
							if(!lore.get(i).toLowerCase().toString().contains("deathbringer")) {
								lore2.add(lore.get(i));
							}
						}
						lore2.add( ChatColor.LIGHT_PURPLE + pdb.getName() );
				
						meta.setLore(lore2);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(pdb, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else {
					player.sendMessage("You can only put planetary deathbringer on a chestplate that already has deathbringer, you monkey looking thing");
				}
			}
			else if(command.getName().equals("divine")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				if(item.getType().toString().toLowerCase().contains("chestplate")) {
					if(player.getLevel()>=160){
						if(item.containsEnchantment(de)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						if(!item.containsEnchantment(enlightened)) {
							player.sendMessage("Enlightened is required for divine enlightened");
							return false;
						}
						item.removeEnchantment(enlightened);
						player.setLevel(player.getLevel()-160);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						ArrayList<String> lore2 = new ArrayList<String>();
						for(int i=0;i<lore.size();i++) {
							if(!lore.get(i).toLowerCase().toString().contains("enlightened")) {
								lore2.add(lore.get(i));
							}
						}
						lore2.add( ChatColor.LIGHT_PURPLE + de.getName() );
				
						meta.setLore(lore2);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(de, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else {
					player.sendMessage("You can only put divine enlightened on a chestplate that already has enlightened, you monkey looking thing");
				}
			}
			else if(command.getName().equals("lifesteal")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				String name=item.getType().toString().toLowerCase();
				if(name.contains("sword")) {
					if(player.getLevel()>=80){
						if(item.containsEnchantment(lifesteal)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						player.setLevel(player.getLevel()-80);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						lore.add(ChatColor.GOLD + lifesteal.getName() );
				
						meta.setLore(lore);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(lifesteal, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else{
					player.sendMessage("you can only put lifesteal on a sword you monkey looking thing");
				}
			}
			else if(command.getName().equals("demonic")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				if(item.getType().toString().toLowerCase().contains("sword")) {
					if(player.getLevel()>=160){
						if(item.containsEnchantment(dl)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						if(!item.containsEnchantment(lifesteal)) {
							player.sendMessage("Lifesteal is required for Demonic Lifsteal");
							return false;
						}
						item.removeEnchantment(lifesteal);
						player.setLevel(player.getLevel()-160);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						ArrayList<String> lore2 = new ArrayList<String>();
						for(int i=0;i<lore.size();i++) {
							if(!lore.get(i).toLowerCase().toString().contains("lifesteal")) {
								lore2.add(lore.get(i));
							}
						}
						lore2.add( ChatColor.LIGHT_PURPLE + dl.getName() );
				
						meta.setLore(lore2);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(dl, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else {
					player.sendMessage("You can only put demonic lifesteal on a sword that already has lifesteal, you monkey looking thing");
				}
			}
			else if(command.getName().equals("magnetism")) {
				Player player= (Player) sender;
				ItemStack item = player.getItemInHand();
				String name=item.getType().toString().toLowerCase();
				if(name.contains("hoe")) {
					if(player.getLevel()>=50){
						if(item.containsEnchantment(magnet)){
							player.sendMessage("This item already has the enchant");
							return false;
						}
						player.setLevel(player.getLevel()-50);
						ArrayList<String> lore = new ArrayList<String>();
					
						ItemMeta meta = item.getItemMeta();
						if(meta.hasLore()) {
							lore = (ArrayList<String>) meta.getLore();
						}
						lore.add(ChatColor.AQUA + magnet.getName() );
				
						meta.setLore(lore);
						item.setItemMeta(meta);
				
						item.addUnsafeEnchantment(magnet, 1);
						return true;
					}
					else {
						player.sendMessage("You do not have enough levels, you monkey looking thing");
					}
				}
				else{
					player.sendMessage("you can only put magnetism on a hoe, you monkey looking thing");
				}
			}
			
			
		
		}
		return false;
	}
	@SuppressWarnings("unchecked")
	public void onDisable() {
		try {
			Field byIdField = Enchantment.class.getDeclaredField("byId");
			Field byNameField = Enchantment.class.getDeclaredField("byName");

			byIdField.setAccessible(true);
			byNameField.setAccessible(true);

			HashMap<Integer, Enchantment> byId = (HashMap<Integer, Enchantment>) byIdField.get(null);
			HashMap<Integer, Enchantment> byName = (HashMap<Integer, Enchantment>) byNameField.get(null);

			if (byId.containsKey(ice.getId())) {
				byId.remove(ice.getId());
			}

			if (byName.containsKey(ice.getName())) {
				byName.remove(ice.getName());
			}
		} catch (Exception ignored) {
		}
	}

	private void LoadEnchantments() {
		try {
			try {
				Field f = Enchantment.class.getDeclaredField("acceptingNew");
				f.setAccessible(true);
				f.set(null, true);
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				Enchantment.registerEnchantment(ice);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}

			try {
				Enchantment.registerEnchantment(drowsy);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(overload);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(implants);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(gears);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(inquisitive);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(obsidianshield);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(autosmelt);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(haste);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(detonate);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(natures);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(anti);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(nightvision);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(mending);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(venom);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(godly);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(angelic);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(enlightened);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(teleportation);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(db);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(de);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(pdb);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(lifesteal);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(magnet);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}