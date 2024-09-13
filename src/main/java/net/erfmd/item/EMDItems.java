package net.erfmd.item;

import net.erfmd.EMDUniverse;
import net.erfmd.block.EMDBlocks;
import net.erfmd.item.custom.ChainsawItem;
import net.erfmd.item.custom.LM85;
import net.erfmd.item.custom.RailgunItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class EMDItems {

    public static final Item EMD_ICON = registerItem("test", new Item(new FabricItemSettings()));
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));
    public static final Item DISSASEMBLY_CHAINSAW = registerItem("dissasembly_chainsaw",
            new ChainsawItem(EMDOtherToolMaterial.SPECIAL_TOOLITEM,4, -2f, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));
    public static final Item COPPER_COIL = registerItem("copper_coil", new Item(new FabricItemSettings()));
    public static final Item COPPER_CABLE = registerItem("copper_cabel", new Item(new FabricItemSettings()));
    public static final Item ACCUMULATOR = registerItem("accumulator", new Item(new FabricItemSettings()));
    public static final Item ENERGY_BALL = registerItem("energy_ball", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item SPECIAL_STORAGE = registerItem("special_storage", new Item(new FabricItemSettings()));
    public static final Item EMERALD_DUST = registerItem("emerald_dust", new Item(new FabricItemSettings()));
    public static final Item DIAMOND_DUST = registerItem("diamond_dust", new Item(new FabricItemSettings()));
    public static final Item METAL_ALLOY = registerItem("metal_alloy", new Item(new FabricItemSettings()));
    public static final Item WARPED_NETHERITE_INGOT = registerItem("warped_netherite_ingot",
            new Item(new FabricItemSettings()));
    public static final Item HIGH_VOLTAGE_BATTERY = registerItem("high_voltage_battery",
            new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.UNCOMMON)));
    public static final Item RAILGUN = registerItem("railgun",
            new RailgunItem(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));



    public static final Item PIECE_OF_CAKE = registerItem("piece_of_cake",
            new Item(new FabricItemSettings().food(EMDFoodComponents.PIECE_OF_CAKE)));
    public static final Item PIECE_OF_CHOCOLATE_CAKE = registerItem("piece_of_chocolate_cake",
            new Item(new FabricItemSettings().food(EMDFoodComponents.PIECE_OF_CHOCOLATE_CAKE)));
    public static final Item PIECE_OF_EXPERIMENT_115 = registerItem("piece_of_experiment_115",
            new Item(new FabricItemSettings().food(EMDFoodComponents.PIECE_OF_EXPERIMENT_115).rarity(Rarity.RARE)));
    public static final Item PIECE_OF_EXPERIMENT_803S = registerItem("piece_of_experiment_803-s",
            new Item(new FabricItemSettings().food(EMDFoodComponents.PIECE_OF_EXPERIMENT_803S).rarity(Rarity.EPIC)));

    public static final Item CHOCOLATE_CAKE = registerItem("chocolate_cake",
            new BlockItem(EMDBlocks.CHOCOLATE_CAKE, new Item.Settings().maxCount(1)));
    public static final Item EXPERIMENT_115 = registerItem("experiment_115",
            new BlockItem(EMDBlocks.EXPERIMENT_115, new Item.Settings().maxCount(1)));
    public static final Item EXPERIMENT_803S = registerItem("experiment_803-s",
            new BlockItem(EMDBlocks.EXPERIMENT_803S, new Item.Settings().maxCount(1)));


    public static final Item CARAMEL = registerItem("caramel",
            new Item(new FabricItemSettings().food(EMDFoodComponents.CARAMEL)));
    public static final Item CARAMEL_APPLE = registerItem("caramel_apple",
            new Item(new FabricItemSettings().food(EMDFoodComponents.CARAMEL_APPLE)));
    public static final Item MEAT_CLUB = registerItem("meat_club",
            new SwordItem(ToolMaterials.IRON,2, -2.0f,
                    new FabricItemSettings().maxCount(1).food(EMDFoodComponents.MEAT_CLUB)));
    public static final Item LOLLICHOP = registerItem("lollichop",
            new SwordItem(ToolMaterials.IRON,3, -2.2f,
                    new FabricItemSettings().maxCount(1).food(EMDFoodComponents.LOLLICHOP)));
    public static final Item CANDY_CANE = registerItem("candy_cane",
            new SwordItem(ToolMaterials.IRON,3, -2.2f,
                    new FabricItemSettings().maxCount(1).food(EMDFoodComponents.CANDY_CANE)));
    public static final Item WORKER_DRONE_ARM = registerItem("worker_drone_arm",
            new SwordItem(ToolMaterials.IRON,3, -2.2f,
                    new FabricItemSettings().maxCount(1).food(EMDFoodComponents.WORKER_DRONE_ARM)));
    public static final Item ROSE_GOLDEN_APPLE = registerItem("rose_golden_apple",
            new Item(new FabricItemSettings().food(EMDFoodComponents.ROSE_GOLDEN_APPLE).rarity(Rarity.RARE)));



    public static final Item ROSE_GOLD_INGOT = registerItem("rose_gold_ingot", new Item(new FabricItemSettings()));
    public static final Item ROSE_GOLDEN_SWORD = registerItem("rose_golden_sword",
            new SwordItem(EMDOtherToolMaterial.ROSE_GOLD,3, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item ROSE_GOLDEN_AXE = registerItem("rose_golden_axe",
            new AxeItem(EMDOtherToolMaterial.ROSE_GOLD,7, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item ROSE_GOLDEN_PICKAXE = registerItem("rose_golden_pickaxe",
            new PickaxeItem(EMDOtherToolMaterial.ROSE_GOLD,1, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item ROSE_GOLDEN_SHOVEL = registerItem("rose_golden_shovel",
            new ShovelItem(EMDOtherToolMaterial.ROSE_GOLD,2, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item ROSE_GOLDEN_HOE = registerItem("rose_golden_hoe",
            new HoeItem(EMDOtherToolMaterial.ROSE_GOLD,-3, 0.0f, new FabricItemSettings().maxCount(1)));



    public static final Item ROSE_GOLDEN_HELMET = registerItem("rose_golden_helmet",
            new ArmorItem(EMDArmorMaterials.ROSE_GOLD, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ROSE_GOLDEN_CHESTPLATE = registerItem("rose_golden_chestplate",
            new ArmorItem(EMDArmorMaterials.ROSE_GOLD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ROSE_GOLDEN_LEGGINGS = registerItem("rose_golden_leggings",
            new ArmorItem(EMDArmorMaterials.ROSE_GOLD, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ROSE_GOLDEN_BOOTS = registerItem("rose_golden_boots",
            new ArmorItem(EMDArmorMaterials.ROSE_GOLD, ArmorItem.Type.BOOTS, new FabricItemSettings()));



    public static final Item CHERRIES = registerItem("cherries",
            new Item(new FabricItemSettings().food(EMDFoodComponents.CHERRIES)));
    public static final Item BANANA = registerItem("banana",
            new Item(new FabricItemSettings().food(EMDFoodComponents.BANANA)));
    public static final Item HONEYSUCKLE = registerItem("honeysuckle",
            new Item(new FabricItemSettings().food(EMDFoodComponents.HONEYSUCKLE)));
    public static final Item CHERRY_PIE = registerItem("cherry_pie",
            new Item(new FabricItemSettings().food(EMDFoodComponents.CHERRY_PIE)));
    public static final Item HONEYSUCKLE_PIE = registerItem("honeysuckle_pie",
            new Item(new FabricItemSettings().food(EMDFoodComponents.HONEYSUCKLE_PIE)));



    public static final Item LM85_BLADE = registerItem("lm85_blade",
            new LM85(EMDOtherToolMaterial.SPECIAL_TOOLITEM,4, -2f, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));



    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {}

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EMDUniverse.MOD_ID, name), item);
    }

    public static void registerModItems(){
        EMDUniverse.LOGGER.info("Registering Mod Items for EMD Universe" + EMDUniverse.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(EMDItems::addItemsToIngredientTabItemGroup);
    }
}

