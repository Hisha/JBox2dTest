package com.hishatech.java.jbox2dtest.base;

import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;

public class BaseConstants {

	public static final String program_Name = "JBox2dTest";
	public static final String program_Version = "0.0.1";

	// Screen width and height
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;

	// Ball radius in pixel
	public static final int BALL_SIZE = 8;

	// Total number of balls
	public final static int NO_OF_BALLS = 400;

	// Ball gradient
	public final static LinearGradient BALL_GRADIENT = new LinearGradient(0.0,
			0.0, 1.0, 0.0, true, CycleMethod.NO_CYCLE, new Stop[] {
					new Stop(0, Color.WHITE), new Stop(1, Color.RED) });

}
