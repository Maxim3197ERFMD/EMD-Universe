package net.erfmd.datagen.lang;

import net.erfmd.block.EMDBlocks;
import net.erfmd.item.EMDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class EMDLangFinnishProvider extends FabricLanguageProvider {
    public EMDLangFinnishProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "fi_fi");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(EMDItems.RAW_RUBY, "Raaka rubiini");
        translationBuilder.add(EMDItems.RUBY, "Rubiini");

        translationBuilder.add(EMDItems.PIECE_OF_CAKE, "Pala kakkua");
        translationBuilder.add(EMDItems.PIECE_OF_CHOCOLATE_CAKE, "Pala suklaakakkua");
        translationBuilder.add(EMDItems.PIECE_OF_EXPERIMENT_115, "Pala \"Kokeesta 115\"");
        translationBuilder.add(EMDItems.PIECE_OF_EXPERIMENT_803S, "Pala \"Kokeesta 803-S\"");
        translationBuilder.add(EMDItems.CARAMEL, "Karamelli");
        translationBuilder.add(EMDItems.CARAMEL_APPLE, "Karamelli omena");

        translationBuilder.add(EMDBlocks.CHOCOLATE_CAKE, "Suklaakakku");
        translationBuilder.add(EMDBlocks.EXPERIMENT_115, "Koe 115");
        translationBuilder.add(EMDBlocks.EXPERIMENT_803S, "Koe 803-S");

        translationBuilder.add(EMDItems.ROSE_GOLDEN_APPLE, "Vaaleanpunainen kultaomena");

        translationBuilder.add(EMDItems.ROSE_GOLD_INGOT, "Vaaleanpunainen kultaharkko");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_SWORD, "Vaaleanpunainen kultamiekka");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_AXE, "Vaaleanpunainen kultakirves");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_PICKAXE, "Vaaleanpunainen kultahakku");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_SHOVEL, "Vaaleanpunainen kultalapio");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_HOE, "Vaaleanpunainen kultakuokka");

        translationBuilder.add(EMDItems.ROSE_GOLDEN_HELMET, "Vaaleanpunainen kultakypärä");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_CHESTPLATE, "Vaaleanpunainen kultarintapanssari");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_LEGGINGS, "Vaaleanpunainen kultahousut");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_BOOTS, "Vaaleanpunainen kultasaappaat");

        translationBuilder.add(EMDItems.COPPER_COIL, "Kuparikela");
        translationBuilder.add(EMDItems.COPPER_CABLE, "Kuparilanka");
        translationBuilder.add(EMDItems.ACCUMULATOR, "Akku");
        translationBuilder.add(EMDItems.ENERGY_BALL, "Energia-ala");
        translationBuilder.add(EMDItems.SPECIAL_STORAGE, "Lastulevy");
        translationBuilder.add(EMDItems.EMERALD_DUST, "Smaragdipöly");
        translationBuilder.add(EMDItems.DIAMOND_DUST, "Timanttipöly");
        translationBuilder.add(EMDItems.METAL_ALLOY, "Metalliseos");
        translationBuilder.add(EMDItems.WARPED_NETHERITE_INGOT, "Kummanetheriitt");
        translationBuilder.add(EMDItems.HIGH_VOLTAGE_BATTERY, "Korkeajänniteakku");

        translationBuilder.add(EMDItems.RAILGUN, "Railgun");
        translationBuilder.add(EMDItems.DISSASEMBLY_CHAINSAW, "Purkaja Drone moottorisaha");
        translationBuilder.add(EMDItems.LM85_BLADE, "Terä LM-85");

        translationBuilder.add(EMDItems.MEAT_CLUB, "Lihaklubi");
        translationBuilder.add(EMDItems.LOLLICHOP, "Kleddenets");
        translationBuilder.add(EMDItems.CANDY_CANE, "Karkkiruoko");
        translationBuilder.add(EMDItems.WORKER_DRONE_ARM, "Toimiva Drone käsi");

        translationBuilder.add(EMDItems.CHERRIES, "Kirsikka");
        translationBuilder.add(EMDItems.BANANA, "Banaani");
        translationBuilder.add(EMDItems.HONEYSUCKLE, "Kuusama");
        translationBuilder.add(EMDItems.CHERRY_PIE, "Kirsikkapiirakka");
        translationBuilder.add(EMDItems.HONEYSUCKLE_PIE, "Kuusamapiirakka");

        translationBuilder.add(EMDBlocks.POTATO_BLOCK, "Perunakuutio");
        translationBuilder.add(EMDBlocks.POISONOUS_POTATO_BLOCK, "Myrkyllinen perunakuutio");

        translationBuilder.add(EMDBlocks.RUBY_ORE, "Rubiinimalmi");
        translationBuilder.add(EMDBlocks.DEEPSLATE_RUBY_ORE, "Pohjaliuskerubiinimalmi");
        translationBuilder.add(EMDBlocks.NETHER_RUBY_ORE, "Nether-rubiinimalmi");
        translationBuilder.add(EMDBlocks.NETHER_IRON_ORE, "Nether-rautamalmi");
        translationBuilder.add(EMDBlocks.RAW_RUBY_BLOCK, "Raaka rubiinikuutio");
        translationBuilder.add(EMDBlocks.RUBY_BLOCK, "Rubiinikuutio");
        translationBuilder.add(EMDBlocks.ROSE_GOLD_BLOCK, "Vaaleanpunainen kultakuutio");

        translationBuilder.add(EMDBlocks.STONE_TILES, "Kivikaakelit");
        translationBuilder.add(EMDBlocks.STONE_TILE_SLAB, "Kivikaakelilaatta");
        translationBuilder.add(EMDBlocks.STONE_TILE_STAIRS, "Kivikaakeliportaat");
        translationBuilder.add(EMDBlocks.STONE_TILE_WALL, "Kivikaakelitmuuri");
        translationBuilder.add(EMDBlocks.CRACKED_STONE_TILES, "Murtuneet kivikaakelit");

        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILES, "Kiillotettu mustakivikaakelit");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_SLAB, "Kiillotettu mustakivikaakelilaatta");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, "Kiillotettu mustakivikaakeliportaat");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_WALL, "Kiillotettu mustakivikaakelitmuuri");
        translationBuilder.add(EMDBlocks.CRACKED_POLISHED_BLACKSTONE_TILES, "Murtuneet kiillotettu mustakivikaakelit");

        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE, "End-sileä kivi");
        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE_SLAB, "End-sileä kivilaatta");
        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE_STAIRS, "End-sileä kiviportaat");
        translationBuilder.add(EMDBlocks.END_STONE_TILES, "End-kivikaakelit");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_SLAB, "End-kivikaakelilaatta");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_STAIRS, "End-kivikaakeliportaat");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_WALL, "End-kivikaakelitmuuri");

        translationBuilder.add(EMDBlocks.POLISHED_STONE, "Kiillotettu kivi");
        translationBuilder.add(EMDBlocks.POLISHED_STONE_SLAB, "Kiillotettu kivilaatta");
        translationBuilder.add(EMDBlocks.POLISHED_STONE_STAIRS, "Kiillotettu kiviportaat");
        translationBuilder.add(EMDBlocks.POLISHED_STONE_WALL, "Kiillotettu kivimuuri");
        translationBuilder.add(EMDBlocks.POLISHED_STONE_PILLAR, "Kiillotettu kivipilari");

        translationBuilder.add(EMDBlocks.SANDSTONE_BRICKS, "Hiekkakivitiili");
        translationBuilder.add(EMDBlocks.SANDSTONE_BRICK_SLAB, "Hiekkakivitiililaatta");
        translationBuilder.add(EMDBlocks.SANDSTONE_BRICK_STAIRS, "Hiekkakivitiiliportaat");
        translationBuilder.add(EMDBlocks.SANDSTONE_BRICK_WALL, "Hiekkakivitiilitmuuri");
        translationBuilder.add(EMDBlocks.CHISELED_SANDSTONE_BRICKS, "Kaiverrettu hiekkakivitiili");

        translationBuilder.add(EMDBlocks.POLISHED_NETHER_BRICKS, "Kiillotettu Nether-tiili");
        translationBuilder.add(EMDBlocks.POLISHED_NETHER_BRICK_SLAB, "Kiillotettu Nether-tiililaatta");
        translationBuilder.add(EMDBlocks.POLISHED_NETHER_BRICK_STAIRS, "Kiillotettu Nether-tiiliportaat");
        translationBuilder.add(EMDBlocks.WARP_NETHER_BRICKS, "Kumma Nether-tiili");
        translationBuilder.add(EMDBlocks.WARP_NETHER_BRICK_SLAB, "Kumma Nether-tiililaatta");
        translationBuilder.add(EMDBlocks.WARP_NETHER_BRICK_STAIRS, "Kumma Nether-tiiliportaat");
        translationBuilder.add(EMDBlocks.WARP_NETHER_BRICK_WALL, "Kumma Nether-tiilitmuuri");

        translationBuilder.add(EMDBlocks.SNOW_BRICKS, "Lumitiili");
        translationBuilder.add(EMDBlocks.SNOW_BRICK_SLAB, "Lumitiililaatta");
        translationBuilder.add(EMDBlocks.SNOW_BRICK_STAIRS, "Lumitiiliportaat");
        translationBuilder.add(EMDBlocks.SNOW_BRICK_WALL, "Lumitiilitmuuri");

        translationBuilder.add(EMDBlocks.TERRACOTTA_BRICKS, "Terrakottatiili");
        translationBuilder.add(EMDBlocks.WHITE_TERRACOTTA_BRICKS, "Valkoinen terrakottatiili");
        translationBuilder.add(EMDBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS, "Vaaleanharmaa terrakottatiili");
        translationBuilder.add(EMDBlocks.GRAY_TERRACOTTA_BRICKS, "Harmaa terrakottatiili");
        translationBuilder.add(EMDBlocks.BLACK_TERRACOTTA_BRICKS, "Musta terrakottatiili");
        translationBuilder.add(EMDBlocks.BROWN_TERRACOTTA_BRICKS, "Ruskea terrakottatiili");
        translationBuilder.add(EMDBlocks.RED_TERRACOTTA_BRICKS, "Punainen terrakottatiili");
        translationBuilder.add(EMDBlocks.ORANGE_TERRACOTTA_BRICKS, "Oranssi terrakottatiili");
        translationBuilder.add(EMDBlocks.YELLOW_TERRACOTTA_BRICKS, "Keltainen terrakottatiili");
        translationBuilder.add(EMDBlocks.LIME_TERRACOTTA_BRICKS, "Limetinvihreä terrakottatiili");
        translationBuilder.add(EMDBlocks.GREEN_TERRACOTTA_BRICKS, "Vihreä terrakottatiili");
        translationBuilder.add(EMDBlocks.CYAN_TERRACOTTA_BRICKS, "Syanani terrakottatiili");
        translationBuilder.add(EMDBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS, "Vaaleansininen terrakottatiili");
        translationBuilder.add(EMDBlocks.BLUE_TERRACOTTA_BRICKS, "Sininen terrakottatiili");
        translationBuilder.add(EMDBlocks.PURPLE_TERRACOTTA_BRICKS, "Violetti terrakottatiili");
        translationBuilder.add(EMDBlocks.MAGENTA_TERRACOTTA_BRICKS, "Purppura terrakottatiili");
        translationBuilder.add(EMDBlocks.PINK_TERRACOTTA_BRICKS, "Vaaleanpunainen terrakottatiili");

        translationBuilder.add(EMDBlocks.OBSIDIAN_BRICKS, "Obsidiaanitiili");
        translationBuilder.add(EMDBlocks.OBSIDIAN_BRICK_SLAB, "Obsidiaanitiililaatta");
        translationBuilder.add(EMDBlocks.OBSIDIAN_BRICK_STAIRS, "Obsidiaanitiiliportaat");
        translationBuilder.add(EMDBlocks.OBSIDIAN_BRICK_WALL, "Obsidiaanitiilitmuuri");
        translationBuilder.add(EMDBlocks.POLISHED_OBSIDIAN, "Kiillotettu obsidiaan");
        translationBuilder.add(EMDBlocks.POLISHED_OBSIDIAN_SLAB, "Kiillotettu obsidiaan");
        translationBuilder.add(EMDBlocks.POLISHED_OBSIDIAN_STAIRS, "Kiillotettu obsidiaan");
        translationBuilder.add(EMDBlocks.POLISHED_OBSIDIAN_WALL, "Kiillotettu obsidiaan");
        translationBuilder.add(EMDBlocks.CHISELED_OBSIDIAN, "Kaiverrettu obsidiaan");
        translationBuilder.add(EMDBlocks.OBSIDIAN_PILLAR, "Obsidiaanpilari");

        translationBuilder.add(EMDBlocks.IRON_BAR_DOOR, "Verkko-ovi");
        translationBuilder.add(EMDBlocks.IRON_BAR_TRAPDOOR, "Verkkoluukku");
        translationBuilder.add(EMDBlocks.IRON_BAR_BLOCK, "Ristikolikko");
        translationBuilder.add(EMDBlocks.IRON_BAR_SLAB, "Ristikkolevy");

        translationBuilder.add(EMDBlocks.REDSTONE_HEART, "Redstone-sydän");

        translationBuilder.add(EMDBlocks.COLORED_REDSTONE_LAMP, "Väri redstone-lampuu");
        translationBuilder.add(EMDBlocks.BLACK_REDSTONE_LAMP, "Musta redstone-lampuu");
        translationBuilder.add(EMDBlocks.BLUE_REDSTONE_LAMP, "Sininen redstone-lampuu");
        translationBuilder.add(EMDBlocks.BROWN_REDSTONE_LAMP, "Ruskea redstone-lampuu");
        translationBuilder.add(EMDBlocks.CYAN_REDSTONE_LAMP, "Syanani redstone-lampuu");
        translationBuilder.add(EMDBlocks.GRAY_REDSTONE_LAMP, "Harmaa redstone-lampuu");
        translationBuilder.add(EMDBlocks.GREEN_REDSTONE_LAMP, "Vihreä redstone-lampuu");
        translationBuilder.add(EMDBlocks.LIGHT_BLUE_REDSTONE_LAMP, "Vaaleansininen redstone-lampuu");
        translationBuilder.add(EMDBlocks.LIGHT_GRAY_REDSTONE_LAMP, "Vaaleanharmaa redstone-lampuu");
        translationBuilder.add(EMDBlocks.LIME_REDSTONE_LAMP, "Limetinvihreä redstone-lampuu");
        translationBuilder.add(EMDBlocks.MAGENTA_REDSTONE_LAMP, "Purppura redstone-lampuu");
        translationBuilder.add(EMDBlocks.ORANGE_REDSTONE_LAMP, "Oranssi redstone-lampuu");
        translationBuilder.add(EMDBlocks.PINK_REDSTONE_LAMP, "Vaaleanpunainen redstone-lampuu");
        translationBuilder.add(EMDBlocks.PURPLE_REDSTONE_LAMP, "Violetti redstone-lampuu");
        translationBuilder.add(EMDBlocks.RED_REDSTONE_LAMP, "Punainen redstone-lampuu");
        translationBuilder.add(EMDBlocks.WHITE_REDSTONE_LAMP, "Valkoinen redstone-lampuu");
        translationBuilder.add(EMDBlocks.YELLOW_REDSTONE_LAMP, "Keltainen redstone-lampuu");

        translationBuilder.add("trim_material.emd_universe.rose", "Vaaleanpunainen kultamateriaali");

        translationBuilder.add("itemgroup.test", "Testata");
    }
}
