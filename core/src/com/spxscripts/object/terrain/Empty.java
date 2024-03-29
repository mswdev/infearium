package com.spxscripts.object.terrain;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.spxscripts.BlockObject;
import com.spxscripts.data.Vars;

/**
 * Created by Sphiinx on 3/6/2016.
 */
public class Empty extends BlockObject {

   // private Rectangle hitBox;
    private Sprite sprite;

    public Empty(int x, int y) {
        //hitBox = new Rectangle(x, y, Vars.get().blockSize, Vars.get().blockSize);
        sprite = new Sprite(TerrainManager.empty, 0, 0, Vars.get().blockSize, Vars.get().blockSize);
        setPosition(x, y);
    }

    @Override
    public boolean isColliding(Rectangle r) {
        return false;
    }

    @Override
    public void action(int type, float x, float y) {

    }

    @Override
    public void update(float delta) {

    }

    @Override
    public void setPosition(float x, float y) {

    }

    @Override
    public float getX() {
        return 0;
    }

    @Override
    public float getY() {
        return 0;
    }

    @Override
    public void draw(SpriteBatch batch) {
        sprite.draw(batch);
    }

    @Override
    public int hitAction(int side) {
        return 1;
    }

    @Override
    public Rectangle getHitBox() {
        return null;
    }

}

