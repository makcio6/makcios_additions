package net.makcio.makciomod.item;

import net.makcio.makciomod.MakcioMod;
import net.makcio.makciomod.item.custom.ExtradimensionalActivatorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MakcioMod.MOD_ID);

    public static final RegistryObject<Item> EXTRADIMENSIONAL_ACTIVATOR = ITEMS.register("extradimensional_activator",
            () -> new ExtradimensionalActivatorItem(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
