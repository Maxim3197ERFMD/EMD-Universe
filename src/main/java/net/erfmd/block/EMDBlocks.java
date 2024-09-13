package net.erfmd.block;

import net.erfmd.EMDUniverse;
import net.erfmd.block.custom.ChocolateCakeBlock;
import net.erfmd.block.custom.Experiment_115_Block;
import net.erfmd.block.custom.Experiment_803S_Block;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class EMDBlocks {

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)));
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_GOLD_ORE)));
    public static final Block NETHER_RUBY_ORE = registerBlock("nether_ruby_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_QUARTZ_ORE)));
    public static final Block NETHER_IRON_ORE = registerBlock("nether_iron_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE)));
    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_GOLD_BLOCK)));
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block ROSE_GOLD_BLOCK = registerBlock("rose_gold_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));



    public static final Block STONE_TILES = registerBlock("stone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block CRACKED_STONE_TILES = registerBlock("cracked_stone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_TILES = registerBlock("polished_blackstone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_TILES = registerBlock("cracked_polished_blackstone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block SMOOTH_END_STONE = registerBlock("smooth_end_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block END_STONE_TILES = registerBlock("end_stone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));



    public static final Block STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            new StairsBlock(EMDBlocks.STONE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block POLISHED_BLACKSTONE_TILE_STAIRS = registerBlock("polished_blackstone_tile_stairs",
            new StairsBlock(EMDBlocks.POLISHED_BLACKSTONE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS)));
    public static final Block POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("polished_blackstone_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)));
    public static final Block SMOOTH_END_STONE_STAIRS = registerBlock("smooth_end_stone_stairs",
            new StairsBlock(EMDBlocks.STONE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.END_STONE_BRICK_STAIRS)));
    public static final Block SMOOTH_END_STONE_SLAB = registerBlock("smooth_end_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICK_SLAB)));
    public static final Block END_STONE_TILE_STAIRS = registerBlock("end_stone_tile_stairs",
            new StairsBlock(EMDBlocks.STONE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.END_STONE_BRICK_STAIRS)));
    public static final Block END_STONE_TILE_SLAB = registerBlock("end_stone_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICK_SLAB)));



    public static final Block STONE_TILE_WALL = registerBlock("stone_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block POLISHED_BLACKSTONE_TILE_WALL = registerBlock("polished_blackstone_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICK_WALL)));
    public static final Block END_STONE_TILE_WALL = registerBlock("end_stone_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICK_WALL)));



    public static final Block REDSTONE_HEART = registerBlock("redstone_heart",
            new RedstoneBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).luminance(15)));



    public static final Block BLACK_REDSTONE_LAMP = registerBlock("black_redstone_lamp",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block BLUE_REDSTONE_LAMP = registerBlock("blue_redstone_lamp",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block BROWN_REDSTONE_LAMP = registerBlock("brown_redstone_lamp",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block CYAN_REDSTONE_LAMP = registerBlock("cyan_redstone_lamp",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block GRAY_REDSTONE_LAMP = registerBlock("gray_redstone_lamp",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block GREEN_REDSTONE_LAMP = registerBlock("green_redstone_lamp",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block LIGHT_BLUE_REDSTONE_LAMP = registerBlock("light_blue_redstone_lamp",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block LIGHT_GRAY_REDSTONE_LAMP = registerBlock("light_gray_redstone_lamp",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block LIME_REDSTONE_LAMP = registerBlock("lime_redstone_lamp",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block MAGENTA_REDSTONE_LAMP = registerBlock("magenta_redstone_lamp",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block ORANGE_REDSTONE_LAMP = registerBlock("orange_redstone_lamp",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block PINK_REDSTONE_LAMP = registerBlock("pink_redstone_lamp",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block PURPLE_REDSTONE_LAMP = registerBlock("purple_redstone_lamp",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block RED_REDSTONE_LAMP = registerBlock("red_redstone_lamp",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block WHITE_REDSTONE_LAMP = registerBlock("white_redstone_lamp",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block YELLOW_REDSTONE_LAMP = registerBlock("yellow_redstone_lamp",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block COLORED_REDSTONE_LAMP = registerBlock("colored_redstone_lamp",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));



    public static final Block IRON_BAR_DOOR = registerBlock("iron_bar_door",
            new DoorBlock(BlockSetType.BAMBOO, FabricBlockSettings.copyOf(Blocks.IRON_DOOR).nonOpaque()));
    public static final Block IRON_BAR_TRAPDOOR = registerBlock("iron_bar_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, FabricBlockSettings.copyOf(Blocks.CHAIN)
                    .sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block IRON_BAR_BLOCK = registerBlock("iron_bar_block",
            new Block(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.METAL)));
    public static final Block IRON_BAR_SLAB = registerBlock("iron_bar_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).sounds(BlockSoundGroup.METAL)));



    public static final Block CHOCOLATE_CAKE = registerBlock("chocolate_cake",
            new ChocolateCakeBlock(AbstractBlock.Settings.copy(Blocks.CAKE)));
    public static final Block EXPERIMENT_115 = registerBlock("experiment_115",
            new Experiment_115_Block(AbstractBlock.Settings.copy(Blocks.CAKE)));
    public static final Block EXPERIMENT_803S = registerBlock("experiment_803-s",
            new Experiment_803S_Block(AbstractBlock.Settings.copy(Blocks.CAKE)));



    public static final Block POTATO_BLOCK = registerBlock("potato_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_WART_BLOCK)));
    public static final Block POISONOUS_POTATO_BLOCK = registerBlock("poisonous_potato_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_WART_BLOCK)));



    public static final Block POLISHED_STONE = registerBlock("polished_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
    public static final Block POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            new StairsBlock(EMDBlocks.POLISHED_STONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
    public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
    public static final Block POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
    public static final Block POLISHED_STONE_PILLAR = registerBlock("polished_stone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE)));
    public static final Block CHISELED_SANDSTONE_BRICKS = registerBlock("chiseled_sandstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE)));
    public static final Block SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
            new StairsBlock(EMDBlocks.SANDSTONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS)));
    public static final Block SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB)));
    public static final Block SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL)));

    public static final Block POLISHED_NETHER_BRICKS = registerBlock("polished_nether_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block POLISHED_NETHER_BRICK_STAIRS = registerBlock("polished_nether_brick_stairs",
            new StairsBlock(EMDBlocks.POLISHED_NETHER_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_STAIRS)));
    public static final Block POLISHED_NETHER_BRICK_SLAB = registerBlock("polished_nether_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_SLAB)));

    public static final Block WARP_NETHER_BRICKS = registerBlock("warp_nether_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS)));
    public static final Block WARP_NETHER_BRICK_STAIRS = registerBlock("warp_nether_brick_stairs",
            new StairsBlock(EMDBlocks.WARP_NETHER_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICK_STAIRS)));
    public static final Block WARP_NETHER_BRICK_SLAB = registerBlock("warp_nether_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICK_SLAB)));
    public static final Block WARP_NETHER_BRICK_WALL = registerBlock("warp_nether_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICK_WALL)));



    public static final Block SNOW_BRICKS = registerBlock("snow_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)));
    public static final Block SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
            new StairsBlock(EMDBlocks.SNOW_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)));
    public static final Block SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)));
    public static final Block SNOW_BRICK_WALL = registerBlock("snow_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)));



    public static final Block OBSIDIAN_BRICKS = registerBlock("obsidian_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    public static final Block OBSIDIAN_BRICK_STAIRS = registerBlock("obsidian_brick_stairs",
            new StairsBlock(EMDBlocks.OBSIDIAN_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    public static final Block OBSIDIAN_BRICK_SLAB = registerBlock("obsidian_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    public static final Block OBSIDIAN_BRICK_WALL = registerBlock("obsidian_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));

    public static final Block POLISHED_OBSIDIAN = registerBlock("polished_obsidian",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    public static final Block POLISHED_OBSIDIAN_STAIRS = registerBlock("polished_obsidian_stairs",
            new StairsBlock(EMDBlocks.POLISHED_OBSIDIAN.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    public static final Block POLISHED_OBSIDIAN_SLAB = registerBlock("polished_obsidian_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    public static final Block POLISHED_OBSIDIAN_WALL = registerBlock("polished_obsidian_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    public static final Block CHISELED_OBSIDIAN = registerBlock("chiseled_obsidian",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    public static final Block OBSIDIAN_PILLAR = registerBlock("obsidian_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));



    public static final Block TERRACOTTA_BRICKS = registerBlock("terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_BRICKS = registerBlock("white_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlock("light_gray_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_BRICKS = registerBlock("gray_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_BRICKS = registerBlock("black_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_BRICKS = registerBlock("brown_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_BRICKS = registerBlock("red_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_BRICKS = registerBlock("orange_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_BRICKS = registerBlock("yellow_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_BRICKS = registerBlock("lime_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_BRICKS = registerBlock("green_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_BRICKS = registerBlock("cyan_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlock("light_blue_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_BRICKS = registerBlock("blue_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_BRICKS = registerBlock("purple_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_BRICKS = registerBlock("magenta_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_BRICKS = registerBlock("pink_terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(EMDUniverse.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(EMDUniverse.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        EMDUniverse.LOGGER.info("Registering Mod Items for EMD Universe" + EMDUniverse.MOD_ID);
    }
}