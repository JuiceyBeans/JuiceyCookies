package com.juiceybeans.cookies.item;

import com.mojang.datafixers.util.Pair;
import net.minecraft.entity.effect.StatusEffectInstance;

import java.util.List;

public class ModCookies {
    public static class Builder{
        private final int hunger;
        private final float saturationModifier;
        private final boolean alwaysEdible;
        private final boolean snack;
        private final List<Pair<StatusEffectInstance, Float>> statusEffect1;
        private final List<Pair<StatusEffectInstance, Float>> statusEffect2;

        public Builder(int hunger, float saturationModifier, boolean meat, boolean alwaysEdible, boolean snack, List<Pair<StatusEffectInstance, Float>> statusEffect1, List<Pair<StatusEffectInstance, Float>> statusEffect2){
            this.hunger = hunger;
            this.saturationModifier = saturationModifier;
            this.alwaysEdible = alwaysEdible;
            this.snack = snack;
            this.statusEffect1 = statusEffect1;
            this.statusEffect2 = statusEffect2;
        }
    }
}
