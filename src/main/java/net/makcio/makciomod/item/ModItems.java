package net.makcio.makciomod.item;

import net.makcio.makciomod.MakcioMod;
import net.makcio.makciomod.item.custom.ExtradimensionalActivatorItem;
import net.makcio.makciomod.item.custom.MeatKnifeItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MakcioMod.MOD_ID);
    public static final RegistryObject<Item> COW_CORPSE = ITEMS.register("cow_corpse",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIG_CORPSE = ITEMS.register("pig_corpse",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHEEP_CORPSE = ITEMS.register("sheep_corpse",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHICKEN_CORPSE = ITEMS.register("chicken_corpse",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RABBIT_CORPSE = ITEMS.register("rabbit_corpse",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_RABBIT_FOOT = ITEMS.register("gold_rabbit_foot",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> FLAYING_KNIFE = ITEMS.register("flaying_knife",
            () -> new MeatKnifeItem(new Item.Properties()
                    .stacksTo(1)
                    .defaultDurability(128)));
    public static final RegistryObject<Item> CLEAVER = ITEMS.register("cleaver",
            () -> new MeatKnifeItem(new Item.Properties()
                    .stacksTo(1)
                    .defaultDurability(128)));

    public static final RegistryObject<Item> EXTRADIMENSIONAL_ACTIVATOR = ITEMS.register("extradimensional_activator",
            () -> new ExtradimensionalActivatorItem(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
