package net.erfmd.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.item.*;
import net.minecraft.registry.tag.BlockTags;

public class ChainsawItem extends SwordItem {
    public ChainsawItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        return state.isIn(BlockTags.AXE_MINEABLE) ? 12.0f : 1.0f;
    }
}
