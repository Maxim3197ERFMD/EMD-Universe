package net.erfmd.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.erfmd.block.EMDBlocks;
import net.erfmd.item.EMDItems;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

public class EMDModelProvider extends FabricModelProvider {
    public EMDModelProvider(FabricDataOutput output) {
        super(output);
    }

    private void registerCustomRedstoneLamp(Block block, BlockStateModelGenerator blockStateModelGenerator) {
        Identifier offModel = TexturedModel.CUBE_ALL.upload(block, blockStateModelGenerator.modelCollector);
        Identifier onModel = blockStateModelGenerator.createSubModel(block, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block).coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, onModel, offModel)));
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool stonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(EMDBlocks.STONE_TILES);
        BlockStateModelGenerator.BlockTexturePool polished_stonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(EMDBlocks.POLISHED_STONE);
        BlockStateModelGenerator.BlockTexturePool blackstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(EMDBlocks.POLISHED_BLACKSTONE_TILES);
        BlockStateModelGenerator.BlockTexturePool smooth_endstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(EMDBlocks.SMOOTH_END_STONE);
        BlockStateModelGenerator.BlockTexturePool endstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(EMDBlocks.END_STONE_TILES);
        BlockStateModelGenerator.BlockTexturePool ironbarPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EMDBlocks.IRON_BAR_BLOCK);
        BlockStateModelGenerator.BlockTexturePool sandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(EMDBlocks.SANDSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool polished_netherPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EMDBlocks.POLISHED_NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool warpnetherPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EMDBlocks.WARP_NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool snowPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EMDBlocks.SNOW_BRICKS);
        BlockStateModelGenerator.BlockTexturePool obsidianPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EMDBlocks.OBSIDIAN_BRICKS);
        BlockStateModelGenerator.BlockTexturePool polished_obsidianPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EMDBlocks.POLISHED_OBSIDIAN);

        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.RAW_RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.NETHER_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.NETHER_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.CRACKED_STONE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.REDSTONE_HEART);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.POTATO_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.POISONOUS_POTATO_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.ROSE_GOLD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.CHISELED_SANDSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.CHISELED_OBSIDIAN);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.WHITE_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.GRAY_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.BLACK_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.BROWN_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.RED_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.ORANGE_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.YELLOW_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.LIME_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.GREEN_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.CYAN_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.BLUE_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.PURPLE_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.MAGENTA_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(EMDBlocks.PINK_TERRACOTTA_BRICKS);

        stonePool.stairs(EMDBlocks.STONE_TILE_STAIRS);
        polished_stonePool.stairs(EMDBlocks.POLISHED_STONE_STAIRS);
        blackstonePool.stairs(EMDBlocks.POLISHED_BLACKSTONE_TILE_STAIRS);
        smooth_endstonePool.stairs(EMDBlocks.SMOOTH_END_STONE_STAIRS);
        endstonePool.stairs(EMDBlocks.END_STONE_TILE_STAIRS);
        sandstonePool.stairs(EMDBlocks.SANDSTONE_BRICK_STAIRS);
        polished_netherPool.stairs(EMDBlocks.POLISHED_NETHER_BRICK_STAIRS);
        warpnetherPool.stairs(EMDBlocks.WARP_NETHER_BRICK_STAIRS);
        snowPool.stairs(EMDBlocks.SNOW_BRICK_STAIRS);
        obsidianPool.stairs(EMDBlocks.OBSIDIAN_BRICK_STAIRS);
        polished_obsidianPool.stairs(EMDBlocks.POLISHED_OBSIDIAN_STAIRS);

        stonePool.slab(EMDBlocks.STONE_TILE_SLAB);
        polished_stonePool.slab(EMDBlocks.POLISHED_STONE_SLAB);
        blackstonePool.slab(EMDBlocks.POLISHED_BLACKSTONE_TILE_SLAB);
        smooth_endstonePool.slab(EMDBlocks.SMOOTH_END_STONE_SLAB);
        endstonePool.slab(EMDBlocks.END_STONE_TILE_SLAB);
        sandstonePool.slab(EMDBlocks.SANDSTONE_BRICK_SLAB);
        polished_netherPool.slab(EMDBlocks.POLISHED_NETHER_BRICK_SLAB);
        warpnetherPool.slab(EMDBlocks.WARP_NETHER_BRICK_SLAB);
        snowPool.slab(EMDBlocks.SNOW_BRICK_SLAB);
        obsidianPool.slab(EMDBlocks.OBSIDIAN_BRICK_SLAB);
        polished_obsidianPool.slab(EMDBlocks.POLISHED_OBSIDIAN_SLAB);

        ironbarPool.slab(EMDBlocks.IRON_BAR_SLAB);

        stonePool.wall(EMDBlocks.STONE_TILE_WALL);
        polished_stonePool.wall(EMDBlocks.POLISHED_STONE_WALL);
        blackstonePool.wall(EMDBlocks.POLISHED_BLACKSTONE_TILE_WALL);
        endstonePool.wall(EMDBlocks.END_STONE_TILE_WALL);
        sandstonePool.wall(EMDBlocks.SANDSTONE_BRICK_WALL);
        warpnetherPool.wall(EMDBlocks.WARP_NETHER_BRICK_WALL);
        snowPool.wall(EMDBlocks.SNOW_BRICK_WALL);
        obsidianPool.wall(EMDBlocks.OBSIDIAN_BRICK_WALL);
        polished_obsidianPool.wall(EMDBlocks.POLISHED_OBSIDIAN_WALL);

        blockStateModelGenerator.registerDoor(EMDBlocks.IRON_BAR_DOOR);

        blockStateModelGenerator.registerLog(EMDBlocks.OBSIDIAN_PILLAR).log(EMDBlocks.OBSIDIAN_PILLAR);
        blockStateModelGenerator.registerLog(EMDBlocks.POLISHED_STONE_PILLAR).log(EMDBlocks.POLISHED_STONE_PILLAR);

        registerCustomRedstoneLamp(EMDBlocks.BLACK_REDSTONE_LAMP, blockStateModelGenerator);
        registerCustomRedstoneLamp(EMDBlocks.BLUE_REDSTONE_LAMP, blockStateModelGenerator);
        registerCustomRedstoneLamp(EMDBlocks.BROWN_REDSTONE_LAMP, blockStateModelGenerator);
        registerCustomRedstoneLamp(EMDBlocks.CYAN_REDSTONE_LAMP, blockStateModelGenerator);
        registerCustomRedstoneLamp(EMDBlocks.GRAY_REDSTONE_LAMP, blockStateModelGenerator);
        registerCustomRedstoneLamp(EMDBlocks.GREEN_REDSTONE_LAMP, blockStateModelGenerator);
        registerCustomRedstoneLamp(EMDBlocks.LIGHT_BLUE_REDSTONE_LAMP, blockStateModelGenerator);
        registerCustomRedstoneLamp(EMDBlocks.LIGHT_GRAY_REDSTONE_LAMP, blockStateModelGenerator);
        registerCustomRedstoneLamp(EMDBlocks.LIME_REDSTONE_LAMP, blockStateModelGenerator);
        registerCustomRedstoneLamp(EMDBlocks.MAGENTA_REDSTONE_LAMP, blockStateModelGenerator);
        registerCustomRedstoneLamp(EMDBlocks.ORANGE_REDSTONE_LAMP, blockStateModelGenerator);
        registerCustomRedstoneLamp(EMDBlocks.PINK_REDSTONE_LAMP, blockStateModelGenerator);
        registerCustomRedstoneLamp(EMDBlocks.PURPLE_REDSTONE_LAMP, blockStateModelGenerator);
        registerCustomRedstoneLamp(EMDBlocks.RED_REDSTONE_LAMP, blockStateModelGenerator);
        registerCustomRedstoneLamp(EMDBlocks.WHITE_REDSTONE_LAMP, blockStateModelGenerator);
        registerCustomRedstoneLamp(EMDBlocks.YELLOW_REDSTONE_LAMP, blockStateModelGenerator);
        registerCustomRedstoneLamp(EMDBlocks.COLORED_REDSTONE_LAMP, blockStateModelGenerator);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(EMDItems.EMD_ICON, Models.GENERATED);
        itemModelGenerator.register(EMDItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(EMDItems.RAW_RUBY, Models.GENERATED);

        itemModelGenerator.register(EMDItems.COPPER_CABLE, Models.GENERATED);
        itemModelGenerator.register(EMDItems.ENERGY_BALL, Models.GENERATED);
        itemModelGenerator.register(EMDItems.SPECIAL_STORAGE, Models.GENERATED);
        itemModelGenerator.register(EMDItems.EMERALD_DUST, Models.GENERATED);
        itemModelGenerator.register(EMDItems.DIAMOND_DUST, Models.GENERATED);
        itemModelGenerator.register(EMDItems.METAL_ALLOY, Models.GENERATED);
        itemModelGenerator.register(EMDItems.WARPED_NETHERITE_INGOT, Models.GENERATED);

        itemModelGenerator.register(EMDItems.PIECE_OF_CAKE, Models.GENERATED);
        itemModelGenerator.register(EMDItems.PIECE_OF_CHOCOLATE_CAKE, Models.GENERATED);
        itemModelGenerator.register(EMDItems.PIECE_OF_EXPERIMENT_115, Models.GENERATED);
        itemModelGenerator.register(EMDItems.PIECE_OF_EXPERIMENT_803S, Models.GENERATED);
        itemModelGenerator.register(EMDItems.CARAMEL, Models.GENERATED);
        itemModelGenerator.register(EMDItems.CARAMEL_APPLE, Models.GENERATED);

        itemModelGenerator.register(EMDItems.MEAT_CLUB, Models.HANDHELD);
        itemModelGenerator.register(EMDItems.LOLLICHOP, Models.HANDHELD);

        itemModelGenerator.register(EMDItems.ROSE_GOLD_INGOT, Models.GENERATED);
        itemModelGenerator.register(EMDItems.ROSE_GOLDEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(EMDItems.ROSE_GOLDEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(EMDItems.ROSE_GOLDEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(EMDItems.ROSE_GOLDEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(EMDItems.ROSE_GOLDEN_HOE, Models.HANDHELD);

        itemModelGenerator.register(EMDItems.ROSE_GOLDEN_APPLE, Models.GENERATED);

        itemModelGenerator.register(EMDItems.CHERRIES, Models.GENERATED);
        itemModelGenerator.register(EMDItems.BANANA, Models.GENERATED);
        itemModelGenerator.register(EMDItems.HONEYSUCKLE, Models.GENERATED);
        itemModelGenerator.register(EMDItems.CHERRY_PIE, Models.GENERATED);
        itemModelGenerator.register(EMDItems.HONEYSUCKLE_PIE, Models.GENERATED);
    }
}