package net.igor.primeiromod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.igor.primeiromod.PrimeiroMod;
import net.igor.primeiromod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import oshi.jna.platform.mac.SystemB;

public class ModItemGroups {

    public static final ItemGroup randomItemsGrupo = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PrimeiroMod.MOD_ID, "random_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.boa_noite_bruno))
                    .displayName(Text.translatable("random items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.yure);
                        entries.add(ModItems.special_stick);
                        entries.add(ModItems.boa_noite_bruno);
                        entries.add(ModBlocks.vs_code_block);
                        entries.add(ModBlocks.inteliji_block);
                    }).build());

    public static void registerItemGroups(){
        PrimeiroMod.LOGGER.info("Registrando grupo de items para " + PrimeiroMod.MOD_ID);

    }
}
