package com.mygdx.wiresgame;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;

public class HorizontalLine extends Line {
	
	
	
	public HorizontalLine(){
		this(new Vector2(), new Vector2());
	}
	
	public HorizontalLine(Vector2 v1, Vector2 v2){
		super(v1, v2, "Horizontal Line");
	}
	
	@Override
	public void draw(GridMouseUtils mouseUtils, WiresGame game, Vector2 gridOffset) {
		game.sr.setColor(super.getDrawColor());
		game.sr.set(ShapeType.Line);
				
		game.sr.line(super.getPixelPos1(mouseUtils).x - gridOffset.x, WiresGame.ORIGINAL_SCREEN_HEIGHT - super.getPixelPos1(mouseUtils).y - gridOffset.y,
				super.getPixelPos2(mouseUtils).x - gridOffset.x, WiresGame.ORIGINAL_SCREEN_HEIGHT - super.getPixelPos2(mouseUtils).y - gridOffset.y);
	}

	@Override
	public void drawToolBar(GridMouseUtils mouseUtils, WiresGame game, ToolBar toolbar, int boxNum) {
		Vector2 pos1 = new Vector2(toolbar.calcXBoxCenter(boxNum) - toolbar.getSingleBoxWidth() / 3, toolbar.calcYBoxCenter());
		Vector2 pos2 = new Vector2(toolbar.calcXBoxCenter(boxNum) + toolbar.getSingleBoxWidth() / 3, toolbar.calcYBoxCenter());
		game.sr.line(pos1, pos2);
	}

}
