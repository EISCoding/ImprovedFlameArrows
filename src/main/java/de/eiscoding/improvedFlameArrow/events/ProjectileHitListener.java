package de.eiscoding.improvedFlameArrow.events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.block.data.type.Fire;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class ProjectileHitListener implements Listener {

    @EventHandler
    public void onProjectileHit(ProjectileHitEvent event) {
        Projectile projectile = event.getEntity();

        if (projectile instanceof Arrow) {
            Arrow arrow = (Arrow) projectile;
            Block block = event.getHitBlock();
            BlockFace blockFace = event.getHitBlockFace();
            Block relativeBlock = block.getRelative(blockFace);

            if (arrow.getFireTicks() > 0) {
                if (block != null && blockFace != null){
                    if (relativeBlock.getType().isAir()){
                        BlockState blockState = relativeBlock.getState();
                        blockState.setType(Material.FIRE);
                        if (e.getHitBlockFace().getOppositeFace() != BlockFace.DOWN) 
                        {                                
                            Fire fire = (Fire) blockState.getBlockData();
                            fire.setFace(e.getHitBlockFace().getOppositeFace(), true);
                            blockState.setBlockData(fire);
                        }
                        blockState.update(true);
                    }
                }
            }
        }
    }



}
