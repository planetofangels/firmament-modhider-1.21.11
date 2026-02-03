package name.modid;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PresencefootstepsClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("presencefootsteps-client");

    @Override
    public void onInitializeClient() {
        LOGGER.info("[Estrogen Lite] ModHider Client Loading");
    }
}
