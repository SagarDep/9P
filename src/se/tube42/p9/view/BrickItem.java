package se.tube42.p9.view;

import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.audio.*;
import com.badlogic.gdx.Input.*;

import se.tube42.lib.tweeny.*;
import se.tube42.lib.ks.*;
import se.tube42.lib.scene.*;
import se.tube42.lib.item.*;
import se.tube42.lib.util.*;
import se.tube42.lib.service.*;


import se.tube42.p9.data.*;
import se.tube42.p9.logic.*;

import static se.tube42.p9.data.Constants.*;


public class BrickItem extends SpriteItem
{
    private BitmapFont font1, font2;
    private String text;
    private char c;
    private int pos;
    private boolean sel;
    
    public BrickItem(int pos)
    {
        super(Assets.tex_rect, 0);
        
        this.font1 = Assets.fonts1[0];
        this.font2 = Assets.fonts1[1];
        this.flags |= BaseItem.FLAG_TOUCHABLE;
        
        setColor(Constants.COLOR_1);
        setChar('?');
        setPosition(pos);
        select(false);
    }
    
    // ----------------------------------------
    
    public boolean free() { return !sel; }
    
    public void select(boolean sel)
    {
        if(this.sel == sel) return;
        this.sel = sel;
        
        final float t = RandomService.get(0.2f, 0.4f);
        
        if(sel) {
            final float r = RandomService.get(-3, +3);
            setRotation(t, r);
        } else {
            setRotation(t, 0);
        }
    }
    
    public int getPosition()
    {
        return pos;
    }
    
    public void setPosition(int pos)
    {
        this.pos = pos;
    }
    
    public char getChar()
    {
        return c;
    }
    
    
    public void setChar(char c)
    {
        this.c = c;
        this.text = Character.toString(c);
    }
    
    public void draw(SpriteBatch sb)
    {
        super.draw(sb);
        
        final BitmapFont font = sel ? font1 : font2;
        final BitmapFont.TextBounds tb = font.getBounds(text);
        final float w0 = tb.width;
        final float h0 = tb.height;
        
        
        ColorHelper.set(font, COLOR_FG, getAlpha());
        font.draw(sb, text,
                  getX() + (w - w0) / 2,
                  getY() + (h + h0) / 2
                  );
    }
    
}