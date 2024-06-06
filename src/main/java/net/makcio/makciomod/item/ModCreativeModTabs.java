package net.makcio.makciomod.item;

import net.makcio.makciomod.MakcioMod;
import net.makcio.makciomod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MakcioMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAKCIO_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EXTRADIMENSIONAL_ACTIVATOR.get()))
                    .title(Component.translatable("creativetab.makciotab"))
                    .displayItems((itemDisplayParameters, output) -> {


                        output.accept(ModItems.EXTRADIMENSIONAL_ACTIVATOR.get());

                        output.accept(ModBlocks.EXTRADIMENSIONAL_MANIPULATOR.get());



                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
