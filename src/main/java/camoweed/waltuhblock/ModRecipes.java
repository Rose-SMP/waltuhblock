package camoweed.waltuhblock;

import net.minecraft.core.item.Item;
//import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;
import net.minecraft.core.block.Block;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.RecipeGroup;
import net.minecraft.core.data.registry.recipe.RecipeNamespace;
import net.minecraft.core.data.registry.recipe.RecipeRegistry;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryCrafting;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryFurnace;
import net.minecraft.core.block.Blocks;

import static camoweed.waltuhblock.mymod.LOGGER;
import static camoweed.waltuhblock.mymod.MOD_ID;

//import static camoweed.waltuhblock.Items.*;
import static camoweed.waltuhblock.Blocks.*;
public class ModRecipes implements RecipeEntrypoint {

    @Override
	public void onRecipesReady() { 

        RecipeBuilder.Shaped(MOD_ID)
        .setShape(
            "DDD",
            "DDD",
            "DDD")
            .addInput('D', Blocks.BLOCK_DIAMOND)
            .create("waltuh_block", new ItemStack(waltuhBlock, 1));
    
        RecipeBuilder.Shapeless(MOD_ID)
        .addInput(waltuhBlock)
        .create("waltuh_block_uncraft", new ItemStack(Blocks.BLOCK_DIAMOND, 9));
        
    LOGGER.info("Recipes initialized.");
    }

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
	}

}