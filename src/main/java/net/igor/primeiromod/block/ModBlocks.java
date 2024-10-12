package net.igor.primeiromod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.igor.primeiromod.PrimeiroMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.ToIntFunction;

public class ModBlocks {

    //ADICIONANDO BLOCOS
    public static final Block vs_code_block = registerBlock("vs_code_block",
            new Block(
                    AbstractBlock.Settings.create()
                            .strength(3f)
                            .sounds(BlockSoundGroup.ANVIL)
                            .pistonBehavior(PistonBehavior.NORMAL)

            ));

    public static final Block inteliji_block = registerBlock("inteliji_block",
            new Block(
                    AbstractBlock.Settings.create()
                            .strength(3f)
                            .sounds(BlockSoundGroup.ANVIL)
                            .pistonBehavior(PistonBehavior.NORMAL)
            ));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(PrimeiroMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(PrimeiroMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    };

    public static void registerModBlocks(){
        PrimeiroMod.LOGGER.info("Registrando blocos do mod para " + PrimeiroMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.vs_code_block);
            fabricItemGroupEntries.add(ModBlocks.inteliji_block);
        });

    }
}
