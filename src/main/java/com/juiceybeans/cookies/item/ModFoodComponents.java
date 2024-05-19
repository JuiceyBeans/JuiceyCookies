package com.juiceybeans.cookies.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent JUMALU_COOKIE = new FoodComponent.Builder()
            .hunger(3).saturationModifier(1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20, 8), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 100, 2), 0.5F)
            .build();

    public static final FoodComponent SPIXY_COOKIE = new FoodComponent.Builder()
            .hunger(3).saturationModifier(1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 40, 9), 1F)
            .build();

    public static final FoodComponent ROBYN_COOKIE = new FoodComponent.Builder()
            .hunger(5).saturationModifier(1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 60, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 60, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 10, 0), 0.6F)
            .build();

    public static final FoodComponent SUZY_COOKIE = new FoodComponent.Builder()
            .hunger(4).saturationModifier(1.25F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200, 2), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 200, 2), 0.5F)
            .build();

    public static final FoodComponent VAL_COOKIE = new FoodComponent.Builder()
            .hunger(0).saturationModifier(0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 200, 127), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 120, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 1), 1F)
            .build();

    public static final FoodComponent RAE_GIFT = new FoodComponent.Builder()
            .hunger(1).saturationModifier(1F)
            //.statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 4), 1F)
            .build();
    public static final FoodComponent COOKIE_BASE = new FoodComponent.Builder()
            .hunger(3).saturationModifier(1F)
            .build();
}
