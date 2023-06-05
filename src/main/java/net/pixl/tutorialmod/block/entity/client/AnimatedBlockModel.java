package net.pixl.tutorialmod.block.entity.client;

import net.pixl.tutorialmod.TutorialMod;
import net.minecraft.util.Identifier;
import net.pixl.tutorialmod.block.entity.AnimatedBlockEntity;
import software.bernie.geckolib.model.GeoModel;

public class AnimatedBlockModel extends GeoModel<AnimatedBlockEntity> {
    @Override
    public Identifier getModelResource(AnimatedBlockEntity animatable) {
        return new Identifier(TutorialMod.MOD_ID, "geo/animated_block.geo.json");
    }

    @Override
    public Identifier getTextureResource(AnimatedBlockEntity animatable) {
        return new Identifier(TutorialMod.MOD_ID, "textures/block/animated_block.png");
    }

    @Override
    public Identifier getAnimationResource(AnimatedBlockEntity animatable) {
        return new Identifier(TutorialMod.MOD_ID, "animations/animated_block.animation.json");
    }
}
