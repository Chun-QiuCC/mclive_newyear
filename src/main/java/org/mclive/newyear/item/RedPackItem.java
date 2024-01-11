
package org.mclive.newyear.item;

import org.mclive.newyear.procedures.UseRedPackProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import java.util.List;

public class RedPackItem extends Item {
	public RedPackItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7c\u00A7l\u4E00\u4E2A\u539A\u5B9E\u7684\u5927\u7EA2\u5305"));
		list.add(Component.literal("\u00A7c\u00A7l\u5305\u542B\u7740\u65B0\u7684\u4E00\u5E74\u7684\u795D\u798F"));
		list.add(Component.literal("\u00A7f\u53F3\u952E\u6765\u62C6\u5F00\u7EA2\u5305\uFF08\u968F\u673A\u83B7\u5F971~8\u4E2A\u91D1\u952D\uFF09"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		UseRedPackProcedure.execute(entity);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		UseRedPackProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
