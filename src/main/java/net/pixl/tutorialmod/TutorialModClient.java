package net.pixl.tutorialmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.pixl.tutorialmod.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;
import net.pixl.tutorialmod.block.entity.ModBlockEntities;
import net.pixl.tutorialmod.block.entity.client.AnimatedBlockRenderer;
import net.pixl.tutorialmod.entity.ModEntities;
import net.pixl.tutorialmod.entity.client.TigerRenderer;

public class TutorialModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_MAPLE_LEAVES, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_MAPLE_SAPLING, RenderLayer.getCutout());

		EntityRendererRegistry.register(ModEntities.TIGER, TigerRenderer::new);

		BlockEntityRendererFactories.register(ModBlockEntities.ANIMATED_BLOCK_ENTITY, AnimatedBlockRenderer::new);
	}
}