package io.github.loyodea.rubymod.init;

import io.github.loyodea.rubymod.base.ObiArmorMaterial;
import io.github.loyodea.rubymod.base.RubyArmorMaterial;
import io.github.loyodea.rubymod.rubymod;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.tools.Tool;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, rubymod.MODID);

    //RUBY
    public static final RegistryObject<Item> RUBY_INGOT = ITEMS.register("ruby_ingot",
            () -> new Item(props()));
    //RUBY BLOCK
    public static final RegistryObject<BlockItem> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block",
            () -> new BlockItem(BlockInit.RUBY_BLOCK.get(), props()));


    // RUBY TOOLS
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ToolTiers.RUBY, 8, -2.3f, props()));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ToolTiers.RUBY, 5, -2.5f, props()));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ToolTiers.RUBY, 12, -3f, props()));
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ToolTiers.RUBY, 0, 0f, props()));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ToolTiers.RUBY, 1, -1.25f, props()));

    // RUBY ARMOR
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ArmorTiers.RUBY, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ArmorTiers.RUBY, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ArmorTiers.RUBY, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ArmorTiers.RUBY, EquipmentSlot.FEET, props()));

    // OBSIDIAN INGOT
    public static final RegistryObject<Item> OBI_INGOT = ITEMS.register("obi_ingot",
            () -> new Item(props()));

    //OBSIDIAN TOOLS
    public static final RegistryObject<SwordItem> OBI_SWORD = ITEMS.register("obi_sword",
            () -> new SwordItem(ObiToolTiers.OBI, 12, -3.15f, props()));
    public static final RegistryObject<PickaxeItem> OBI_PICKAXE = ITEMS.register("obi_pickaxe",
            () -> new PickaxeItem(ObiToolTiers.OBI, 8, -2.75f, props()));
    public static final RegistryObject<AxeItem> OBI_AXE = ITEMS.register("obi_axe",
            () -> new AxeItem(ObiToolTiers.OBI, 14, -3.25f, props()));
    public static final RegistryObject<ShovelItem> OBI_SHOVEL = ITEMS.register("obi_shovel",
            () -> new ShovelItem(ObiToolTiers.OBI, 4, -2f, props()));
    public static final RegistryObject<HoeItem> OBI_HOE = ITEMS.register("obi_hoe",
            () -> new HoeItem(ObiToolTiers.OBI, 1, -1f, props()));

    // OBSIDIAN ARMOR
    public static final RegistryObject<ArmorItem> OBI_HELMET = ITEMS.register("obi_helmet",
            () -> new ArmorItem(ObiArmorTiers.OBI, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> OBI_CHESTPLATE = ITEMS.register("obi_chestplate",
            () -> new ArmorItem(ObiArmorTiers.OBI, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> OBI_LEGGINGS = ITEMS.register("obi_leggings",
            () -> new ArmorItem(ObiArmorTiers.OBI, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> OBI_BOOTS = ITEMS.register("obi_boots",
            () -> new ArmorItem(ObiArmorTiers.OBI, EquipmentSlot.FEET, props()));



    public static class ToolTiers {
        public static final Tier RUBY = new ForgeTier(5, 800, 5f, 1, 350, null, () -> Ingredient.of(ItemInit.RUBY_SWORD.get()));
    }
    public static class ObiToolTiers{
        public static final Tier OBI = new ForgeTier(5, 1500, 5f, 1, 350, null, () -> Ingredient.of(ItemInit.RUBY_SWORD.get()));
    }
    private static Item.Properties props() {
        return new Item.Properties().tab(rubymod.TAB);
    }
    public static class ArmorTiers {
        public static final ArmorMaterial RUBY = new RubyArmorMaterial("ruby",
                1500,
                new int[]{4, 6, 8, 4},
                300,
                SoundEvents.ARMOR_EQUIP_DIAMOND,
                0.0f,
                0.05f,
                () -> Ingredient.of(ItemInit.RUBY_SWORD.get()));
    }
    public static class ObiArmorTiers {
        public static final ArmorMaterial OBI = new ObiArmorMaterial("obi",
                1500,
                new int[]{6, 8, 10, 6},
                300,
                SoundEvents.ARMOR_EQUIP_DIAMOND,
                0.0f,
                0.07f,
                () -> Ingredient.of(ItemInit.OBI_SWORD.get()));
    }


}


