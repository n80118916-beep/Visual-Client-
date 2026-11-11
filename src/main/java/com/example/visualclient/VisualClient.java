package com.example.visualclient;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(
        modid = VisualClient.MODID,
        name = "Visual Client",
        version = "1.0.0",
        clientSideOnly = true
)
public class VisualClient {
    public static final String MODID = "visualclient";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // Здесь позже зарегистрируем GUI, клавиши и HUD.
    }
}
