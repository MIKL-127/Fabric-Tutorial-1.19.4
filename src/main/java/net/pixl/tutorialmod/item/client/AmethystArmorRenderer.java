package net.pixl.tutorialmod.item.client;

import net.pixl.tutorialmod.item.custom.AmethystArmorItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AmethystArmorRenderer extends GeoArmorRenderer<AmethystArmorItem> {
    public AmethystArmorRenderer() {
        super(new AmethystArmorModel());
    }
}
