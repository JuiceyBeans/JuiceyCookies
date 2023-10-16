package com.juiceybeans.cookies;

import com.juiceybeans.cookies.event.ModEventHandler;
import com.juiceybeans.cookies.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlyxCookies implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("Alyx's Cookies");
    public static final String MOD_ID = "cookies";

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        //ServerTickEvents.END_WORLD_TICK.register(ModEventHandler::onServerTick);
        UseItemCallback.EVENT.register(ModEventHandler::onUseItem);
    }
}
