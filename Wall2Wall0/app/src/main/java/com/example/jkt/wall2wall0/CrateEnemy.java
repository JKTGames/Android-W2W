package com.example.jkt.wall2wall0;

import com.example.jkt.wall2wall0.math.Rectangle;
import com.example.jkt.wall2wall0.math.Vector2;

/**
 * Created by James on 4/16/2015.
 */
public class CrateEnemy extends falling_enemy {


    public CrateEnemy(float x, float y, float width, float height, int enemy_num) {
        super(x, y, width, height, enemy_num);
        this.velocity = new Vector2(0f, 5.4f);
        this.bounds = new Rectangle(x, y, width, height);
        this.bounds_tsil.add(this.bounds);
    }

    public String getImageName() {
        return "Factory_Cratehighres-95px.png";
    }

}
