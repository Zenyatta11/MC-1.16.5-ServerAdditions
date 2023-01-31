package com.batatas.serveradditions.drops;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ThreadLocalRandom;

import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class AnimalDrops {

    private final World world;

    private final double x;
    private final double y;
    private final double z;

    private Collection<ItemEntity> dropsToAdd = new ArrayList<ItemEntity>();

    public AnimalDrops(World world, double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;

        this.world = world;
    }

    public Collection<ItemEntity> getPigDrops() {
        dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.LEATHER, 1)));
        dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.BONE, randomInt(1,3))));

        return dropsToAdd;
    }

    public Collection<ItemEntity> getHorseDrops() {
        dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.LEATHER, 1)));
        dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.BONE, randomInt(3,8))));

        ItemStack meat = new ItemStack(Items.BEEF, randomInt(3,6));
        meat.setHoverName(new StringTextComponent("Horse Meat"));

        return dropsToAdd;
    }

    public Collection<ItemEntity> getHorseDropsNoLeather() {
        dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.BONE, randomInt(3,8))));

        ItemStack meat = new ItemStack(Items.BEEF, randomInt(3,6));
        meat.setHoverName(new StringTextComponent("Horse Meat"));

        return dropsToAdd;
    }

    public Collection<ItemEntity> getFoxDrops() {
        dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.LEATHER, 1)));
        dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.BONE, randomInt(1,3))));

        ItemStack meat = new ItemStack(Items.BEEF, 1);
        meat.setHoverName(new StringTextComponent("Fox Meat"));

        return dropsToAdd;
    }

    public Collection<ItemEntity> getLlamaDrops() {
        dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.LEATHER, 1)));
        dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.BONE, randomInt(2,6))));
        dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.WHITE_WOOL, randomInt(1,3))));

        ItemStack meat = new ItemStack(Items.BEEF, randomInt(1,4));
        meat.setHoverName(new StringTextComponent("Llama Meat"));

        return dropsToAdd;
    }

    public Collection<ItemEntity> getPolarBearDrops() {
        dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.LEATHER, 1)));
        dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.BONE, randomInt(3,12))));

        ItemStack meat = new ItemStack(Items.BEEF, randomInt(3,8));
        meat.setHoverName(new StringTextComponent("Bear Meat"));

        return dropsToAdd;
    }

    public Collection<ItemEntity> getSheepDrops() {
        dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.LEATHER, 1)));
        dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.BONE, randomInt(3,8))));

        return dropsToAdd;
    }

    public Collection<ItemEntity> getVillagerDrops() {
        dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.BONE, randomInt(2,4))));

        ItemStack meat = new ItemStack(Items.BEEF, randomInt(1,2));
        meat.setHoverName(new StringTextComponent("H U M A N   F L E S H"));

        return dropsToAdd;
    }

    public Collection<ItemEntity> getTraderDrops() {
        dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.BONE, randomInt(2,4))));

        ItemStack meat = new ItemStack(Items.BEEF, randomInt(1,2));
        meat.setHoverName(new StringTextComponent("H U M A N   F L E S H"));

        // Random goodies
        if(randomInt(1,40) == 40) 
            dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.DIAMOND, randomInt(1,5))));
        if(randomInt(1,20) == 20) 
            dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.GOLD_INGOT, randomInt(1,5))));
        if(randomInt(1,75) == 75) 
            dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.GOLDEN_APPLE, randomInt(1,5))));
        if(randomInt(1,10) == 20) 
            dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.COOKED_BEEF, randomInt(1,5))));
        if(randomInt(1,250) == 250) 
            dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.NETHERITE_BLOCK, 1)));
        
        return dropsToAdd;
    }

    public Collection<ItemEntity> getWolfDrops() {
        dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.LEATHER, 1)));
        dropsToAdd.add(new ItemEntity(this.world, this.x, this.y, this.z, new ItemStack(Items.BONE, randomInt(2,6))));

        ItemStack meat = new ItemStack(Items.BEEF, randomInt(1,3));
        meat.setHoverName(new StringTextComponent("Wolf Meat"));

        return dropsToAdd;
    }

    private int randomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

}
