
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.mclive.newyear.init;

import org.mclive.newyear.item.RedPackItem;
import org.mclive.newyear.item.BianPaoItem;
import org.mclive.newyear.McliveNewyearMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class McliveNewyearModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McliveNewyearMod.MODID);
	public static final RegistryObject<Item> RED_PACK = REGISTRY.register("red_pack", () -> new RedPackItem());
	public static final RegistryObject<Item> BLACK_FU = block(McliveNewyearModBlocks.BLACK_FU);
	public static final RegistryObject<Item> STONE_TOWER_LAMP = block(McliveNewyearModBlocks.STONE_TOWER_LAMP);
	public static final RegistryObject<Item> GOLD_FU = block(McliveNewyearModBlocks.GOLD_FU);
	public static final RegistryObject<Item> LANTERN = block(McliveNewyearModBlocks.LANTERN);
	public static final RegistryObject<Item> YAO_QIAN_SHU = block(McliveNewyearModBlocks.YAO_QIAN_SHU);
	public static final RegistryObject<Item> BIAN_PAO = REGISTRY.register("bian_pao", () -> new BianPaoItem());
	public static final RegistryObject<Item> DAO_BLACK_FU = block(McliveNewyearModBlocks.DAO_BLACK_FU);
	public static final RegistryObject<Item> DAO_GOLD_FU = block(McliveNewyearModBlocks.DAO_GOLD_FU);
	public static final RegistryObject<Item> SHANG_LIAN_A = block(McliveNewyearModBlocks.SHANG_LIAN_A);
	public static final RegistryObject<Item> XIA_LIAN_A = block(McliveNewyearModBlocks.XIA_LIAN_A);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
