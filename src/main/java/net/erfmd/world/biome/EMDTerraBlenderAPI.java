package net.erfmd.world.biome;

import net.erfmd.EMDUniverse;
import net.erfmd.world.biome.surface.EMDMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class EMDTerraBlenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new EMDOverworldRegion(new Identifier(EMDUniverse.MOD_ID, "overworld"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, EMDUniverse.MOD_ID, EMDMaterialRules.makeRules());
    }
}