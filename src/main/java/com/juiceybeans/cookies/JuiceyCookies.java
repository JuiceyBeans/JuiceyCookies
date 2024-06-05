package com.juiceybeans.cookies;

import com.juiceybeans.cookies.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JuiceyCookies implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("Juicey's Cookies");
    public static final String MOD_ID = "cookies";

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        //ServerTickEvents.END_WORLD_TICK.register(ModEventHandler::onServerTick);
    }
}
