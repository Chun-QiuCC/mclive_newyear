package org.mclive.newyear.procedures;

import org.mclive.newyear.init.McliveNewyearModEntities;
import org.mclive.newyear.entity.DropBianPaoEntity;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

public class DropBianPao_DoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, float damage, int knockback) {
					AbstractArrow entityToSpawn = new DropBianPaoEntity(McliveNewyearModEntities.DROP_BIAN_PAO.get(), level);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.setCritArrow(true);
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, 0, 1);
			_entityToSpawn.setPos(x, (y + 1.5), z);
			_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 1, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
	}
}
