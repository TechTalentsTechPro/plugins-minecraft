package plugin;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

public class AutoMiraPlugin extends JavaPlugin implements Listener {
	private boolean activo = false;
	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
	ItemStack lanzaCerdos = new ItemStack(Material.RAW_BEEF);
	ItemMeta ImCerdo = lanzaCerdos.getItemMeta();
	ChatColor oro = ChatColor.GOLD;
	@EventHandler
	public void ProjectileLaunched(ProjectileLaunchEvent e){
		List<Entity> entidades= e.getEntity().getWorld().getEntities();
		for(int i = 0; i < entidades.size(); i++){
			Entity en = entidades.get(i);
			if(!(en.isDead())){
				if(e.getEntity() instanceof Arrow){
					if(e.getEntity().getShooter() instanceof Player){
						Arrow a = (Arrow) e.getEntity();
						Player p = (Player) e.getEntity().getShooter();
						p.setTexturePack("https://github.com/TechTalentsTechPro/plugins-minecraft/blob/master/Huahwi_Pack.zip");
					}
					
				}
			}
			
			
		}
		
		
		
	}
	
	
	

}






