package com.deco2800.iguanachase;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/**
 * DesktopLauncher
 * Launches the MOOS game engine in LibGDX
 * @Author Tim Hadwen
 */
public class GameLauncher {

	/**
	 * Private constructor to hide the implicit constructor
	 */
	private GameLauncher () {
		//Private constructor to hide the implicit one.
	}

	/**
	 * Main function for the game
	 * @param arg Command line arguments (we wont use these)
	 */
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		LwjglApplication app;
		config.width = 1280;
		config.height = 720;
		config.title = "DECO2800 2017: Iguana Chase";
		app = new LwjglApplication(new IguanaChase(), config);
	}
}
