package player.PKmod;

import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.client.settings.KeyModifier;
import com.mojang.blaze3d.platform.InputConstants;
import org.lwjgl.glfw.GLFW;

public class KeyBindings {
    public static final KeyMapping SPAWN_VILLAGER = new KeyMapping(
            "key.pkmod.spawn_villager", // 键绑定的名称
            KeyConflictContext.IN_GAME, // 键绑定的上下文
            InputConstants.Type.KEYSYM, // 输入类型
            GLFW.GLFW_KEY_P, // 键码
            "category.pkmod.main" // 键绑定所属的类别
    );

    public static final KeyMapping SPAWN_ZOMBIE = new KeyMapping(
            "key.pkmod.spawn_zombie", // 键绑定的名称
            KeyConflictContext.IN_GAME, // 键绑定的上下文
            InputConstants.Type.KEYSYM, // 输入类型
            GLFW.GLFW_KEY_K, // 键码
            "category.pkmod.main" // 键绑定所属的类别
    );
}