package soupbubbles.vanillaplus.client.gui.config;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.resources.I18n;
import soupbubbles.vanillaplus.lib.Assets;

public class GuiButtonCategory extends GuiButton
{
    public GuiButtonCategory(int buttonId, int x, int y, String text)
    {
        super(buttonId, x, y, 150, 20, text + "...");
    }
}
