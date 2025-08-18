package camoweed.waltuhblock;


import static camoweed.waltuhblock.Blocks.*;
import static camoweed.waltuhblock.mymod.MOD_ID;

import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.item.model.ItemModelDispatcher;

import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

public class Models implements ModelEntrypoint{

    @Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {
ModelHelper.setBlockModel(waltuhBlock, () -> new BlockModelStandard<>(waltuhBlock)
				.setTex(0, MOD_ID + ":block/waltuh", Side.sides)
		);
    }


    @Override
	public void initItemModels(ItemModelDispatcher dispatcher) {}

	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {}

}