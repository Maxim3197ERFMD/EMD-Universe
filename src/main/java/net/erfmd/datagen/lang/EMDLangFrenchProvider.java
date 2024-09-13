package net.erfmd.datagen.lang;

import net.erfmd.block.EMDBlocks;
import net.erfmd.item.EMDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class EMDLangFrenchProvider extends FabricLanguageProvider {
    public EMDLangFrenchProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "fr_fr");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(EMDItems.RAW_RUBY, "Rubis brut");
        translationBuilder.add(EMDItems.RUBY, "Rubis");

        translationBuilder.add(EMDItems.PIECE_OF_CAKE, "Morceau de gâteau");
        translationBuilder.add(EMDItems.PIECE_OF_CHOCOLATE_CAKE, "Morceau de gâteau au chocolat");
        translationBuilder.add(EMDItems.PIECE_OF_EXPERIMENT_115, "Morceau de \"Expérience 115\"");
        translationBuilder.add(EMDItems.PIECE_OF_EXPERIMENT_803S, "Morceau de \"Expérience 803-S\"");
        translationBuilder.add(EMDItems.CARAMEL, "Caramel");
        translationBuilder.add(EMDItems.CARAMEL_APPLE, "Pomme caramel");

        translationBuilder.add(EMDBlocks.CHOCOLATE_CAKE, "Gâteau au chocolat");
        translationBuilder.add(EMDBlocks.EXPERIMENT_115, "Expérience 115");
        translationBuilder.add(EMDBlocks.EXPERIMENT_803S, "Expérience 803-S");

        translationBuilder.add(EMDItems.ROSE_GOLDEN_APPLE, "Pomme dorée rose");

        translationBuilder.add(EMDItems.ROSE_GOLD_INGOT, "Lingot d'or rose");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_SWORD, "Épée en or rose");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_AXE, "Hache en or rose");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_PICKAXE, "Pioche en or rose");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_SHOVEL, "Pelle en or rose");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_HOE, "Houe en or rose");

        translationBuilder.add(EMDItems.ROSE_GOLDEN_HELMET, "Casque en or rose");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_CHESTPLATE, "Plastron en or rose");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_LEGGINGS, "Jambiéres en or rose");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_BOOTS, "Bottes en or rose");

        translationBuilder.add(EMDItems.COPPER_COIL, "Bobine de cuivre");
        translationBuilder.add(EMDItems.COPPER_CABLE, "Cable de cuivre");
        translationBuilder.add(EMDItems.ACCUMULATOR, "Accumulateur");
        translationBuilder.add(EMDItems.ENERGY_BALL, "Balle d'énergie");
        translationBuilder.add(EMDItems.SPECIAL_STORAGE, "Stockage spécial");
        translationBuilder.add(EMDItems.EMERALD_DUST, "Poussière d'émeraude");
        translationBuilder.add(EMDItems.DIAMOND_DUST, "Poussière de diamant");
        translationBuilder.add(EMDItems.METAL_ALLOY, "Alliage métallique");
        translationBuilder.add(EMDItems.WARPED_NETHERITE_INGOT, "Lingot de Netherite biscornue");
        translationBuilder.add(EMDItems.HIGH_VOLTAGE_BATTERY, "Batterie haute tension");

        translationBuilder.add(EMDItems.RAILGUN, "Railgun");
        translationBuilder.add(EMDItems.DISSASEMBLY_CHAINSAW, "Tronçonneuse de Drone de Dêmontage");
        translationBuilder.add(EMDItems.LM85_BLADE, "Lame LM-85");

        translationBuilder.add(EMDItems.MEAT_CLUB, "Club de viande");
        translationBuilder.add(EMDItems.LOLLICHOP, "Sucette");
        translationBuilder.add(EMDItems.CANDY_CANE, "Sucre d'orge");
        translationBuilder.add(EMDItems.WORKER_DRONE_ARM, "Bras de Drone de Ouvrier");

        translationBuilder.add(EMDItems.CHERRIES, "Cerises");
        translationBuilder.add(EMDItems.BANANA, "Banane");
        translationBuilder.add(EMDItems.HONEYSUCKLE, "Chèvrefeuille");
        translationBuilder.add(EMDItems.CHERRY_PIE, "Tarte aux cerises");
        translationBuilder.add(EMDItems.HONEYSUCKLE_PIE, "Tarte aux chèvrefeuilles");

        translationBuilder.add(EMDBlocks.POTATO_BLOCK, "Bloc de pommes de terre");
        translationBuilder.add(EMDBlocks.POISONOUS_POTATO_BLOCK, "Bloc de pomme de terre venimeux");

        translationBuilder.add(EMDBlocks.RUBY_ORE, "Minerai de rubis");
        translationBuilder.add(EMDBlocks.DEEPSLATE_RUBY_ORE, "Minerai de rubis des abîmes");
        translationBuilder.add(EMDBlocks.NETHER_RUBY_ORE, "Minerai de rubis du Nether");
        translationBuilder.add(EMDBlocks.NETHER_IRON_ORE, "Minerai de fer du Nether");
        translationBuilder.add(EMDBlocks.RAW_RUBY_BLOCK, "Bloc de rubis brut");
        translationBuilder.add(EMDBlocks.RUBY_BLOCK, "Bloc de rubis");
        translationBuilder.add(EMDBlocks.ROSE_GOLD_BLOCK, "Bloc d'or rose");

        translationBuilder.add(EMDBlocks.STONE_TILES, "Pierre carreleê");
        translationBuilder.add(EMDBlocks.STONE_TILE_SLAB, "Dalle de pierre carreleê");
        translationBuilder.add(EMDBlocks.STONE_TILE_STAIRS, "Escaliers en pierre carreleê");
        translationBuilder.add(EMDBlocks.STONE_TILE_WALL, "Mur de pierre carreleê");
        translationBuilder.add(EMDBlocks.CRACKED_STONE_TILES, "Pierre carreleê craquelêe");

        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILES, "Pierre noire carreleê");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_SLAB, "Dalle de pierre noire carreleê");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, "Escaliers en pierre noire carreleê");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_WALL, "Mur de pierre noire carreleê");
        translationBuilder.add(EMDBlocks.CRACKED_POLISHED_BLACKSTONE_TILES, "Pierre noire carreleê craquelêe");

        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE, "Pierre lisse de l'End");
        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE_SLAB, "Dalle de pierre lisse de l'End");
        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE_STAIRS, "Escaliers en pierre lisse de l'End");
        translationBuilder.add(EMDBlocks.END_STONE_TILES, "Pierre carreleê de l'End");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_SLAB, "Dalle de pierre carreleê de l'End");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_STAIRS, "Escaliers en pierre carreleê de l'End");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_WALL, "Mur de pierre carreleê de l'End");

        translationBuilder.add(EMDBlocks.POLISHED_STONE, "Roche polie");
        translationBuilder.add(EMDBlocks.POLISHED_STONE_SLAB, "Dalle de roche polie");
        translationBuilder.add(EMDBlocks.POLISHED_STONE_STAIRS, "Escaliers en roche polie");
        translationBuilder.add(EMDBlocks.POLISHED_STONE_WALL, "Mur de roche polie");
        translationBuilder.add(EMDBlocks.POLISHED_STONE_PILLAR, "Pilier de roche polie");

        translationBuilder.add(EMDBlocks.SANDSTONE_BRICKS, "Briques de grès");
        translationBuilder.add(EMDBlocks.SANDSTONE_BRICK_SLAB, "Dalle de briques de grès");
        translationBuilder.add(EMDBlocks.SANDSTONE_BRICK_STAIRS, "Escaliers en briques de grès");
        translationBuilder.add(EMDBlocks.SANDSTONE_BRICK_WALL, "Mur de briques de grès");
        translationBuilder.add(EMDBlocks.CHISELED_SANDSTONE_BRICKS, "Briques de grès sculptêe");

        translationBuilder.add(EMDBlocks.POLISHED_NETHER_BRICKS, "Briques du Nether polie");
        translationBuilder.add(EMDBlocks.POLISHED_NETHER_BRICK_SLAB, "Dalle de briques du Nether polie");
        translationBuilder.add(EMDBlocks.POLISHED_NETHER_BRICK_STAIRS, "Escaliers en briques du Nether polie");
        translationBuilder.add(EMDBlocks.WARP_NETHER_BRICKS, "Briques du Nether biscornue");
        translationBuilder.add(EMDBlocks.WARP_NETHER_BRICK_SLAB, "Dalle de briques du Nether biscornue");
        translationBuilder.add(EMDBlocks.WARP_NETHER_BRICK_STAIRS, "Escaliers en briques du Nether biscornue");
        translationBuilder.add(EMDBlocks.WARP_NETHER_BRICK_WALL, "Mur de briques du Nether biscornue");

        translationBuilder.add(EMDBlocks.SNOW_BRICKS, "Briques de neige");
        translationBuilder.add(EMDBlocks.SNOW_BRICK_SLAB, "Dalle de briques de neige");
        translationBuilder.add(EMDBlocks.SNOW_BRICK_STAIRS, "Escaliers en briques de neige");
        translationBuilder.add(EMDBlocks.SNOW_BRICK_WALL, "Mur de briques de neige");

        translationBuilder.add(EMDBlocks.TERRACOTTA_BRICKS, "Terre cuite taillèe");
        translationBuilder.add(EMDBlocks.WHITE_TERRACOTTA_BRICKS, "Terre cuite blanche taillèe");
        translationBuilder.add(EMDBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS, "Terre cuite grise clair taillèe");
        translationBuilder.add(EMDBlocks.GRAY_TERRACOTTA_BRICKS, "Terre cuite grise taillèe");
        translationBuilder.add(EMDBlocks.BLACK_TERRACOTTA_BRICKS, "Terre cuite noire taillèe");
        translationBuilder.add(EMDBlocks.BROWN_TERRACOTTA_BRICKS, "Terre cuite brun taillèe");
        translationBuilder.add(EMDBlocks.RED_TERRACOTTA_BRICKS, "Terre cuite rouge taillèe");
        translationBuilder.add(EMDBlocks.ORANGE_TERRACOTTA_BRICKS, "Terre cuite orange taillèe");
        translationBuilder.add(EMDBlocks.YELLOW_TERRACOTTA_BRICKS, "Terre cuite jaune taillèe");
        translationBuilder.add(EMDBlocks.LIME_TERRACOTTA_BRICKS, "Terre cuite verte clair taillèe");
        translationBuilder.add(EMDBlocks.GREEN_TERRACOTTA_BRICKS, "Terre cuite verte taillèe");
        translationBuilder.add(EMDBlocks.CYAN_TERRACOTTA_BRICKS, "Terre cuite cyan taillèe");
        translationBuilder.add(EMDBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS, "Terre cuite bleue clair taillèe");
        translationBuilder.add(EMDBlocks.BLUE_TERRACOTTA_BRICKS, "Terre cuite bleue taillèe");
        translationBuilder.add(EMDBlocks.PURPLE_TERRACOTTA_BRICKS, "Terre cuite violette taillèe");
        translationBuilder.add(EMDBlocks.MAGENTA_TERRACOTTA_BRICKS, "Terre cuite magenta taillèe");
        translationBuilder.add(EMDBlocks.PINK_TERRACOTTA_BRICKS, "Terre cuite rose taillèe");

        translationBuilder.add(EMDBlocks.OBSIDIAN_BRICKS, "Obsidienne taillèe");
        translationBuilder.add(EMDBlocks.OBSIDIAN_BRICK_SLAB, "Dalle de obsidienne taillèe");
        translationBuilder.add(EMDBlocks.OBSIDIAN_BRICK_STAIRS, "Escaliers en obsidienne taillèe");
        translationBuilder.add(EMDBlocks.OBSIDIAN_BRICK_WALL, "Mur de obsidienne taillèe");
        translationBuilder.add(EMDBlocks.POLISHED_OBSIDIAN, "Obsidienne polie");
        translationBuilder.add(EMDBlocks.POLISHED_OBSIDIAN_SLAB, "Dalle de obsidienne polie");
        translationBuilder.add(EMDBlocks.POLISHED_OBSIDIAN_STAIRS, "Escaliers en obsidienne polie");
        translationBuilder.add(EMDBlocks.POLISHED_OBSIDIAN_WALL, "Mur de obsidienne polie");
        translationBuilder.add(EMDBlocks.CHISELED_OBSIDIAN, "Obsidienne sculptêe");
        translationBuilder.add(EMDBlocks.OBSIDIAN_PILLAR, "Pilier de obsidienne");

        translationBuilder.add(EMDBlocks.IRON_BAR_DOOR, "Porte à barre de fer");
        translationBuilder.add(EMDBlocks.IRON_BAR_BLOCK, "Bloc de barre de fer");
        translationBuilder.add(EMDBlocks.IRON_BAR_SLAB, "Dalle de barre de fer");
        translationBuilder.add(EMDBlocks.IRON_BAR_TRAPDOOR, "Trappe à barre de fer");

        translationBuilder.add(EMDBlocks.REDSTONE_HEART, "Coeur de redstone");

        translationBuilder.add(EMDBlocks.COLORED_REDSTONE_LAMP, "Lampe colorée à redstone");
        translationBuilder.add(EMDBlocks.BLACK_REDSTONE_LAMP, "Lampe noire à redstone");
        translationBuilder.add(EMDBlocks.BLUE_REDSTONE_LAMP, "Lampe bleue à redstone");
        translationBuilder.add(EMDBlocks.BROWN_REDSTONE_LAMP, "Lampe brun à redstone");
        translationBuilder.add(EMDBlocks.CYAN_REDSTONE_LAMP, "Lampe cyan à redstone");
        translationBuilder.add(EMDBlocks.GRAY_REDSTONE_LAMP, "Lampe grise à redstone");
        translationBuilder.add(EMDBlocks.GREEN_REDSTONE_LAMP, "Lampe verte à redstone");
        translationBuilder.add(EMDBlocks.LIGHT_BLUE_REDSTONE_LAMP, "Lampe bleue clair à redstone");
        translationBuilder.add(EMDBlocks.LIGHT_GRAY_REDSTONE_LAMP, "Lampe grise clair à redstone");
        translationBuilder.add(EMDBlocks.LIME_REDSTONE_LAMP, "Lampe verte clair à redstone");
        translationBuilder.add(EMDBlocks.MAGENTA_REDSTONE_LAMP, "Lampe magenta à redstone");
        translationBuilder.add(EMDBlocks.ORANGE_REDSTONE_LAMP, "Lampe orange à redstone");
        translationBuilder.add(EMDBlocks.PINK_REDSTONE_LAMP, "Lampe rose à redstone");
        translationBuilder.add(EMDBlocks.PURPLE_REDSTONE_LAMP, "Lampe violette à redstone");
        translationBuilder.add(EMDBlocks.RED_REDSTONE_LAMP, "Lampe rouge à redstone");
        translationBuilder.add(EMDBlocks.WHITE_REDSTONE_LAMP, "Lampe blanche à redstone");
        translationBuilder.add(EMDBlocks.YELLOW_REDSTONE_LAMP, "Lampe jaune à redstone");

        translationBuilder.add("trim_material.emd_universe.rose", "En or rose");

        translationBuilder.add("itemgroup.test", "Test");
    }
}
