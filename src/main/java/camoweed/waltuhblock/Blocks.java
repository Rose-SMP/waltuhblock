package camoweed.waltuhblock;
import static camoweed.waltuhblock.mymod.MOD_ID;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import turniplabs.halplibe.helper.BlockBuilder;


public class Blocks {

private static int startingID = ModConfig.CFG.getInt("IDs.startingBlockID");
private static int nextID() {return startingID++;} // just a little function to increase the id every new item

    public static Block<?> waltuhBlock;
    public static void initBlocks() {
BlockBuilder test_builder = new BlockBuilder(MOD_ID)
            .setHardness(1.0f)
			.setResistance(1.0f)
			.setLuminance(15)
            .setBlockSound(null)
            .addTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PLANTABLE_IN_JAR);

            waltuhBlock = test_builder.build("block.waltuh", "block/waltuh", nextID(), b -> new BlockLogic(b, Material.steel));
    }
}
