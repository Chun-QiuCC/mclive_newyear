
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.mclive.newyear.init;

import org.mclive.newyear.block.YaoQianShuBlock;
import org.mclive.newyear.block.XiaLianABlock;
import org.mclive.newyear.block.StoneTowerLampBlock;
import org.mclive.newyear.block.ShangLianABlock;
import org.mclive.newyear.block.LanternBlock;
import org.mclive.newyear.block.GoldFuBlock;
import org.mclive.newyear.block.DaoGoldFUBlock;
import org.mclive.newyear.block.DaoBlackFuBlock;
import org.mclive.newyear.block.BlackFuBlock;
import org.mclive.newyear.McliveNewyearMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class McliveNewyearModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, McliveNewyearMod.MODID);
	public static final RegistryObject<Block> BLACK_FU = REGISTRY.register("black_fu", () -> new BlackFuBlock());
	public static final RegistryObject<Block> STONE_TOWER_LAMP = REGISTRY.register("stone_tower_lamp", () -> new StoneTowerLampBlock());
	public static final RegistryObject<Block> GOLD_FU = REGISTRY.register("gold_fu", () -> new GoldFuBlock());
	public static final RegistryObject<Block> LANTERN = REGISTRY.register("lantern", () -> new LanternBlock());
	public static final RegistryObject<Block> YAO_QIAN_SHU = REGISTRY.register("yao_qian_shu", () -> new YaoQianShuBlock());
	public static final RegistryObject<Block> DAO_BLACK_FU = REGISTRY.register("dao_black_fu", () -> new DaoBlackFuBlock());
	public static final RegistryObject<Block> DAO_GOLD_FU = REGISTRY.register("dao_gold_fu", () -> new DaoGoldFUBlock());
	public static final RegistryObject<Block> SHANG_LIAN_A = REGISTRY.register("shang_lian_a", () -> new ShangLianABlock());
	public static final RegistryObject<Block> XIA_LIAN_A = REGISTRY.register("xia_lian_a", () -> new XiaLianABlock());
}
