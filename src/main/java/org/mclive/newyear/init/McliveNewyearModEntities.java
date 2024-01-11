
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.mclive.newyear.init;

import org.mclive.newyear.entity.DropBianPaoEntity;
import org.mclive.newyear.McliveNewyearMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class McliveNewyearModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, McliveNewyearMod.MODID);
	public static final RegistryObject<EntityType<DropBianPaoEntity>> DROP_BIAN_PAO = register("projectile_drop_bian_pao",
			EntityType.Builder.<DropBianPaoEntity>of(DropBianPaoEntity::new, MobCategory.MISC).setCustomClientFactory(DropBianPaoEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
