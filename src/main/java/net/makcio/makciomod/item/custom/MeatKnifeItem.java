package net.makcio.makciomod.item.custom;

import net.makcio.makciomod.Utils;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class MeatKnifeItem extends Item {
    public MeatKnifeItem(Properties pProperties) {
        super(pProperties);
    }

    @Nonnull
    @Override
    public ItemStack getCraftingRemainingItem(@Nonnull ItemStack stack)
    {
        ItemStack container = stack.copy();
        if(container.hurt(1, Utils.RANDOM_SOURCE, null))
            return ItemStack.EMPTY;
        else
            return container;
    }

    @Override
    public boolean hasCraftingRemainingItem(@Nonnull ItemStack stack)
    {
        return true;
    }
}