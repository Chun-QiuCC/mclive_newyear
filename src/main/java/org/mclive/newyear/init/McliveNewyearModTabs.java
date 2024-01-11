
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.mclive.newyear.init;

import org.mclive.newyear.McliveNewyearMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class McliveNewyearModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, McliveNewyearMod.MODID);
	public static final RegistryObject<CreativeModeTab> MCLIVE_YEAR = REGISTRY.register("mclive_year",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mclive_newyear.mclive_year")).icon(() -> new ItemStack(McliveNewyearModItems.RED_PACK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(McliveNewyearModItems.RED_PACK.get());
				tabData.accept(McliveNewyearModBlocks.BLACK_FU.get().asItem());
				tabData.accept(McliveNewyearModBlocks.STONE_TOWER_LAMP.get().asItem());
				tabData.accept(McliveNewyearModBlocks.GOLD_FU.get().asItem());
				tabData.accept(McliveNewyearModBlocks.LANTERN.get().asItem());
				tabData.accept(McliveNewyearModBlocks.YAO_QIAN_SHU.get().asItem());
				tabData.accept(McliveNewyearModItems.BIAN_PAO.get());
				tabData.accept(McliveNewyearModBlocks.DAO_BLACK_FU.get().asItem());
				tabData.accept(McliveNewyearModBlocks.DAO_GOLD_FU.get().asItem());
				tabData.accept(McliveNewyearModBlocks.SHANG_LIAN_A.get().asItem());
				tabData.accept(McliveNewyearModBlocks.XIA_LIAN_A.get().asItem());
			})

					.build());
}
