package com.lladar.yahm;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid =Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

    public static final String MODID = "YAHM";
    public static final String MODNAME = "Yet Another Harvest Mod";
    public static final String VERSION = "0.1";

    @Instance
    public static Main instance = new Main();

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        // Pre-Initialization step for items / blocks
        System.out.println("YAHM Pre-Initialized");
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        // Initialization step for recipes
        System.out.println("YAHM Initialized");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        // Post-Initialization step for mod compatibility
        System.out.println("YAHM Post-Initialized");
    }
}
