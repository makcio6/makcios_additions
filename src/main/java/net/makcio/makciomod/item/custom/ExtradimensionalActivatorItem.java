package net.makcio.makciomod.item.custom;

import net.makcio.makciomod.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

public class ExtradimensionalActivatorItem extends Item {
    public ExtradimensionalActivatorItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        BlockPos pos = context.getClickedPos();

        if (!world.isClientSide) {
            if (world.getBlockState(pos).getBlock() == ModBlocks.EXTRADIMENSIONAL_MANIPULATOR.get()) {
                world.setBlock(pos, Blocks.END_PORTAL.defaultBlockState(), 3);
                context.getItemInHand().shrink(1);
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.PASS;
    }
}
