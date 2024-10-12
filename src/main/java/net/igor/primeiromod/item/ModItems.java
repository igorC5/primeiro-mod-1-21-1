package net.igor.primeiromod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.igor.primeiromod.PrimeiroMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item special_stick = registerItem("special_stick", new Item(new Item.Settings()));
    public static final Item boa_noite_bruno = registerItem("boa_noite_bruno", new Item(new Item.Settings()));
    public static final Item yure = registerItem("yure", new Item(new Item.Settings()));
    public static Item inteliji_stick = registerItem("inteliji_stick", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(PrimeiroMod.MOD_ID, name), item);
    };

    public static void registerModItems(){
        PrimeiroMod.LOGGER.info("Registrando itens do mod para " + PrimeiroMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(special_stick);
            entries.add(boa_noite_bruno);
            entries.add(yure);
            entries.add(inteliji_stick);
        });


    }


}
