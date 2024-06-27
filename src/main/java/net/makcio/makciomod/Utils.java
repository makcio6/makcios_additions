package net.makcio.makciomod;

import net.minecraft.util.RandomSource;

import java.util.Random;

public class Utils {
    public static final Random RANDOM = new Random();

    public static final RandomSource RANDOM_SOURCE = RandomSource.createNewThreadLocalInstance();
}
