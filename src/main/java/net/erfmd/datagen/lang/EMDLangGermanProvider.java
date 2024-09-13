package net.erfmd.datagen.lang;

import net.erfmd.block.EMDBlocks;
import net.erfmd.item.EMDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class EMDLangGermanProvider extends FabricLanguageProvider {
    public EMDLangGermanProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "de_de");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(EMDItems.RAW_RUBY, "Rohrubin");
        translationBuilder.add(EMDItems.RUBY, "Rubin");

        translationBuilder.add(EMDItems.PIECE_OF_CAKE, "Stück Kuchen");
        translationBuilder.add(EMDItems.PIECE_OF_CHOCOLATE_CAKE, "Stück Schokoladenkuchen");
        translationBuilder.add(EMDItems.PIECE_OF_EXPERIMENT_115, "Experimentstück 115");
        translationBuilder.add(EMDItems.PIECE_OF_EXPERIMENT_803S, "Experimentstück 803-S");
        translationBuilder.add(EMDItems.CARAMEL, "Karamell");
        translationBuilder.add(EMDItems.CARAMEL_APPLE, "Karamel Apfel");

        translationBuilder.add(EMDBlocks.CHOCOLATE_CAKE, "Schokoladenkuchen");
        translationBuilder.add(EMDBlocks.EXPERIMENT_115, "Experiment 115");
        translationBuilder.add(EMDBlocks.EXPERIMENT_803S, "Experiment 803-S");

        translationBuilder.add(EMDItems.ROSE_GOLDEN_APPLE, "Rosegoldener Apfel");

        translationBuilder.add(EMDItems.ROSE_GOLD_INGOT, "Rosegoldbarren");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_SWORD, "Rosegoldschwert");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_AXE, "Rosegoldaxt");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_PICKAXE, "Rosegoldspitzhacke");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_SHOVEL, "Rosegoldschaufel");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_HOE, "Rosegoldhacke");

        translationBuilder.add(EMDItems.ROSE_GOLDEN_HELMET, "Rosegoldhelm");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_CHESTPLATE, "Rosegoldharnisch");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_LEGGINGS, "Rosegoldbeinschutz");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_BOOTS, "Rosegoldstiefel");

        translationBuilder.add(EMDItems.COPPER_COIL, "Kupferspule");
        translationBuilder.add(EMDItems.COPPER_CABLE, "Kupferkabel");
        translationBuilder.add(EMDItems.ACCUMULATOR, "Akkumulator");
        translationBuilder.add(EMDItems.ENERGY_BALL, "Energieball");
        translationBuilder.add(EMDItems.SPECIAL_STORAGE, "Sonderspeicher");
        translationBuilder.add(EMDItems.EMERALD_DUST, "Smaragdstaub");
        translationBuilder.add(EMDItems.DIAMOND_DUST, "Diamantstaub");
        translationBuilder.add(EMDItems.METAL_ALLOY, "Metalllegierung");
        translationBuilder.add(EMDItems.WARPED_NETHERITE_INGOT, "Wirrnetheritbarren");
        translationBuilder.add(EMDItems.HIGH_VOLTAGE_BATTERY, "Hochspannungsbatterie");

        translationBuilder.add(EMDItems.RAILGUN, "Railgun");
        translationBuilder.add(EMDItems.DISSASEMBLY_CHAINSAW, "Demontagedrohne Kettensäge");
        translationBuilder.add(EMDItems.LM85_BLADE, "Klinge LM-85");

        translationBuilder.add(EMDItems.MEAT_CLUB, "Fleischclub");
        translationBuilder.add(EMDItems.LOLLICHOP, "Lutscher");
        translationBuilder.add(EMDItems.CANDY_CANE, "Zuckerstange");
        translationBuilder.add(EMDItems.WORKER_DRONE_ARM, "Arbeiterdrohne Hand");

        translationBuilder.add(EMDItems.CHERRIES, "Kirsche");
        translationBuilder.add(EMDItems.BANANA, "Banane");
        translationBuilder.add(EMDItems.HONEYSUCKLE, "Geißblatt");
        translationBuilder.add(EMDItems.CHERRY_PIE, "Kirschkuchen");
        translationBuilder.add(EMDItems.HONEYSUCKLE_PIE, "Geißblattkuchen");

        translationBuilder.add(EMDBlocks.POTATO_BLOCK, "Kartoffelblock");
        translationBuilder.add(EMDBlocks.POISONOUS_POTATO_BLOCK, "Giftiger-Kartoffelblock");

        translationBuilder.add(EMDBlocks.RUBY_ORE, "Rubyerz");
        translationBuilder.add(EMDBlocks.DEEPSLATE_RUBY_ORE, "Tiefenschiefer-Rubyerz");
        translationBuilder.add(EMDBlocks.NETHER_RUBY_ORE, "Netherrubyerz");
        translationBuilder.add(EMDBlocks.NETHER_IRON_ORE, "Nethereisenerz");
        translationBuilder.add(EMDBlocks.RAW_RUBY_BLOCK, "Rohrubyblock");
        translationBuilder.add(EMDBlocks.RUBY_BLOCK, "Rubyblock");
        translationBuilder.add(EMDBlocks.ROSE_GOLD_BLOCK, "Roségoldblock");

        translationBuilder.add(EMDBlocks.STONE_TILES, "Steinfliesen");
        translationBuilder.add(EMDBlocks.STONE_TILE_SLAB, "Steinfliesenstufe");
        translationBuilder.add(EMDBlocks.STONE_TILE_STAIRS, "Steinfliesentreppe");
        translationBuilder.add(EMDBlocks.STONE_TILE_WALL, "Steinfliesenmauer");
        translationBuilder.add(EMDBlocks.CRACKED_STONE_TILES, "Rissigle Steinfliesen");

        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILES, "Polierter Schwarzsteinfliesen");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_SLAB, "Polierter Schwarzsteinfliesenstufe");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, "Polierter Schwarzsteinfliesentreppe");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_WALL, "Polierter Schwarzsteinfliesenmauer");
        translationBuilder.add(EMDBlocks.CRACKED_POLISHED_BLACKSTONE_TILES, "Rissigle Polierter Schwarzsteinfliesen");

        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE, "Glatter Endstein");
        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE_SLAB, "Glatter Endsteinstufe");
        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE_STAIRS, "Glatter Endsteintreppe");
        translationBuilder.add(EMDBlocks.END_STONE_TILES, "Endsteinfliesen");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_SLAB, "Endsteinfliesenstufe");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_STAIRS, "Endsteinfliesentreppe");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_WALL, "Endsteinfliesenmauer");

        translationBuilder.add(EMDBlocks.POLISHED_STONE, "Polierter Stein");
        translationBuilder.add(EMDBlocks.POLISHED_STONE_SLAB, "Polierter Steinstufe");
        translationBuilder.add(EMDBlocks.POLISHED_STONE_STAIRS, "Polierter Steintreppe");
        translationBuilder.add(EMDBlocks.POLISHED_STONE_WALL, "Polierter Steinmauer");
        translationBuilder.add(EMDBlocks.POLISHED_STONE_PILLAR, "Polierter Steinsäule");

        translationBuilder.add(EMDBlocks.SANDSTONE_BRICKS, "Sandsteinziegel");
        translationBuilder.add(EMDBlocks.SANDSTONE_BRICK_SLAB, "Sandsteinziegelstufe");
        translationBuilder.add(EMDBlocks.SANDSTONE_BRICK_STAIRS, "Sandsteinziegeltreppe");
        translationBuilder.add(EMDBlocks.SANDSTONE_BRICK_WALL, "Sandsteinziegelmauer");
        translationBuilder.add(EMDBlocks.CHISELED_SANDSTONE_BRICKS, "Gemeißelter Sandsteinziegel");

        translationBuilder.add(EMDBlocks.POLISHED_NETHER_BRICKS, "Polierter Netherziegel");
        translationBuilder.add(EMDBlocks.POLISHED_NETHER_BRICK_SLAB, "Polierter Netherziegelstufe");
        translationBuilder.add(EMDBlocks.POLISHED_NETHER_BRICK_STAIRS, "Polierter Netherziegeltreppe");
        translationBuilder.add(EMDBlocks.WARP_NETHER_BRICKS, "Wirr Netherziegel");
        translationBuilder.add(EMDBlocks.WARP_NETHER_BRICK_SLAB, "Wirr Netherziegelstufe");
        translationBuilder.add(EMDBlocks.WARP_NETHER_BRICK_STAIRS, "Wirr Netherziegeltreppe");
        translationBuilder.add(EMDBlocks.WARP_NETHER_BRICK_WALL, "Wirr Netherziegelmauer");

        translationBuilder.add(EMDBlocks.SNOW_BRICKS, "Schneeziegel");
        translationBuilder.add(EMDBlocks.SNOW_BRICK_SLAB, "Schneeziegelstufe");
        translationBuilder.add(EMDBlocks.SNOW_BRICK_STAIRS, "Schneeziegeltreppe");
        translationBuilder.add(EMDBlocks.SNOW_BRICK_WALL, "Schneeziegelmauer");

        translationBuilder.add(EMDBlocks.TERRACOTTA_BRICKS, "Keramikziegel");
        translationBuilder.add(EMDBlocks.WHITE_TERRACOTTA_BRICKS, "Weiß Keramikziegel");
        translationBuilder.add(EMDBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS, "Hellgraue Keramikziegel");
        translationBuilder.add(EMDBlocks.GRAY_TERRACOTTA_BRICKS, "Graue Keramikziegel");
        translationBuilder.add(EMDBlocks.BLACK_TERRACOTTA_BRICKS, "Schwarze Keramikziegel");
        translationBuilder.add(EMDBlocks.BROWN_TERRACOTTA_BRICKS, "Braune Keramikziegel");
        translationBuilder.add(EMDBlocks.RED_TERRACOTTA_BRICKS, "Rote Keramikziegel");
        translationBuilder.add(EMDBlocks.ORANGE_TERRACOTTA_BRICKS, "Orange Keramikziegel");
        translationBuilder.add(EMDBlocks.YELLOW_TERRACOTTA_BRICKS, "Gelbe Keramikziegel");
        translationBuilder.add(EMDBlocks.LIME_TERRACOTTA_BRICKS, "Hellgrüne Keramikziegel");
        translationBuilder.add(EMDBlocks.GREEN_TERRACOTTA_BRICKS, "Grüne Keramikziegel");
        translationBuilder.add(EMDBlocks.CYAN_TERRACOTTA_BRICKS, "Türkise Keramikziegel");
        translationBuilder.add(EMDBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS, "Hellbraue Keramikziegel");
        translationBuilder.add(EMDBlocks.BLUE_TERRACOTTA_BRICKS, "Blaue Keramikziegel");
        translationBuilder.add(EMDBlocks.PURPLE_TERRACOTTA_BRICKS, "Violette Keramikziegel");
        translationBuilder.add(EMDBlocks.MAGENTA_TERRACOTTA_BRICKS, "Magenta Keramikziegel");
        translationBuilder.add(EMDBlocks.PINK_TERRACOTTA_BRICKS, "Rosa Keramikziegel");

        translationBuilder.add(EMDBlocks.OBSIDIAN_BRICKS, "Obsidianziegel");
        translationBuilder.add(EMDBlocks.OBSIDIAN_BRICK_SLAB, "Obsidianziegelstufe");
        translationBuilder.add(EMDBlocks.OBSIDIAN_BRICK_STAIRS, "Obsidianziegeltreppe");
        translationBuilder.add(EMDBlocks.OBSIDIAN_BRICK_WALL, "Obsidianziegelmauer");
        translationBuilder.add(EMDBlocks.POLISHED_OBSIDIAN, "Polierter Obsidian");
        translationBuilder.add(EMDBlocks.POLISHED_OBSIDIAN_SLAB, "Polierter Obsidianstufe");
        translationBuilder.add(EMDBlocks.POLISHED_OBSIDIAN_STAIRS, "Polierter Obsidiantreppe");
        translationBuilder.add(EMDBlocks.POLISHED_OBSIDIAN_WALL, "Polierter Obsidianmauer");
        translationBuilder.add(EMDBlocks.CHISELED_OBSIDIAN, "Gemeißelter Obsidian");
        translationBuilder.add(EMDBlocks.OBSIDIAN_PILLAR, "Obsidiansäule");

        translationBuilder.add(EMDBlocks.IRON_BAR_DOOR, "Eisenstangentür");
        translationBuilder.add(EMDBlocks.IRON_BAR_BLOCK, "Eisenstangenblock");
        translationBuilder.add(EMDBlocks.IRON_BAR_SLAB, "Eisenstangenplatte");
        translationBuilder.add(EMDBlocks.IRON_BAR_TRAPDOOR, "Eisenstangen-Falltür");

        translationBuilder.add(EMDBlocks.REDSTONE_HEART, "Redstone-Herz");

        translationBuilder.add(EMDBlocks.COLORED_REDSTONE_LAMP, "Farbe Redstone-Lampe");
        translationBuilder.add(EMDBlocks.BLACK_REDSTONE_LAMP, "Schwarze Redstone-Lampe");
        translationBuilder.add(EMDBlocks.BLUE_REDSTONE_LAMP, "Blaue Redstone-Lampe");
        translationBuilder.add(EMDBlocks.BROWN_REDSTONE_LAMP, "Braune Redstone-Lampe");
        translationBuilder.add(EMDBlocks.CYAN_REDSTONE_LAMP, "Türkise Redstone-Lampe");
        translationBuilder.add(EMDBlocks.GRAY_REDSTONE_LAMP, "Graue Redstone-Lampe");
        translationBuilder.add(EMDBlocks.GREEN_REDSTONE_LAMP, "Grüne Redstone-Lampe");
        translationBuilder.add(EMDBlocks.LIGHT_BLUE_REDSTONE_LAMP, "Hellbraue Redstone-Lampe");
        translationBuilder.add(EMDBlocks.LIGHT_GRAY_REDSTONE_LAMP, "Hellgraue Redstone-Lampe");
        translationBuilder.add(EMDBlocks.LIME_REDSTONE_LAMP, "Hellgrüne Redstone-Lampe");
        translationBuilder.add(EMDBlocks.MAGENTA_REDSTONE_LAMP, "Magenta Redstone-Lampe");
        translationBuilder.add(EMDBlocks.ORANGE_REDSTONE_LAMP, "Orange Redstone-Lampe");
        translationBuilder.add(EMDBlocks.PINK_REDSTONE_LAMP, "Rosa Redstone-Lampe");
        translationBuilder.add(EMDBlocks.PURPLE_REDSTONE_LAMP, "Violette Redstone-Lampe");
        translationBuilder.add(EMDBlocks.RED_REDSTONE_LAMP, "Rote Redstone-Lampe");
        translationBuilder.add(EMDBlocks.WHITE_REDSTONE_LAMP, "Weiß Redstone-Lampe");
        translationBuilder.add(EMDBlocks.YELLOW_REDSTONE_LAMP, "Gelbe Redstone-Lampe");

        translationBuilder.add("trim_material.emd_universe.rose", "Rosegold");

        translationBuilder.add("itemgroup.test", "Prüfen");
    }
}
