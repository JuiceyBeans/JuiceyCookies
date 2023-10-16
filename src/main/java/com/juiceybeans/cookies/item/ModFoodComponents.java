package com.juiceybeans.cookies.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent JUMALU_COOKIE = new FoodComponent.Builder()
            .hunger(3).saturationModifier(1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 0), 0.5F).build();
    public static final FoodComponent LILI_COOKIE = new FoodComponent.Builder()
            .hunger(5).saturationModifier(1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 0), 0.5F).build();

    public static final FoodComponent ROBYN_COOKIE = new FoodComponent.Builder()
            .hunger(5).saturationModifier(1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 60, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 60, 0), 1F)
            .build();

    public static final FoodComponent COOKIE_BASE = new FoodComponent.Builder()
            .hunger(3).saturationModifier(1F)
            .build();
}
