/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package rvl.simplify_tool_config;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;

public class FixPickaxeItem extends FixToolItem {
    public FixPickaxeItem(Tier tier, Properties properties) {
        super(tier, BlockTags.MINEABLE_WITH_PICKAXE, properties);
    }
}


