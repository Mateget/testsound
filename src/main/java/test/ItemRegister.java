package test;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class ItemRegister {

    private static SoundEvent makeSound(String name){
        ResourceLocation location = new ResourceLocation(Test.MODID, name);
        return new SoundEvent(location).setRegistryName(location);
    }

    @SubscribeEvent
    public static void onRegItem(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
	    SoundEvent newSound = makeSound("diggy");
	    DiscItem newDisc = new DiscItem("Diggy Diggy Hole", newSound);
	    registry.register(newDisc);

    }
    
}
