
package org.mclive.newyear.item;

import org.mclive.newyear.procedures.DropBianPao_DoProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import java.util.List;

public class BianPaoItem extends Item {
	public BianPaoItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7c\u00A7l\u8C01\u4E0D\u559C\u6B22\u97AD\u70AE\u5462\uFF1F"));
		list.add(Component.literal("\u00A7f\u53F3\u952E\u6295\u63B7\u51FA\u53BB"));
		list.add(Component.literal("\uFF08\u6CA1\u6709\u7206\u70B8\u4F24\u5BB3\u54E6~\u867D\u7136\u7838\u5230\u4EBA\u8FD8\u662F\u4F1A\u75DB\uFF09"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		DropBianPao_DoProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		return ar;
	}
}
