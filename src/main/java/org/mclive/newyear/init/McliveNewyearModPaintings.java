
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.mclive.newyear.init;

import org.mclive.newyear.McliveNewyearMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

public class McliveNewyearModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, McliveNewyearMod.MODID);
	public static final RegistryObject<PaintingVariant> DRAGON_FACE = REGISTRY.register("dragon_face", () -> new PaintingVariant(32, 32));
}
