package net.makcio.makciomod.util;

import net.makcio.makciomod.MakcioMod;
import net.makcio.makciomod.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import java.lang.reflect.Method;

@Mod.EventBusSubscriber(modid = MakcioMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PotionBrewingEvent {

    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            try {
                Method addMixMethod = PotionBrewing.class.getDeclaredMethod("addMix", Potion.class, Item.class, Potion.class);
                addMixMethod.setAccessible(true);
                addMixMethod.invoke(null, Potions.AWKWARD, ModItems.GOLDEN_RABBIT_FOOT.get(), Potions.LUCK);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
