package com.example.jkt.wall2wall0;

import com.example.jkt.wall2wall0.math.Vector2;

/**
 * Created by James on 4/16/2015.
 */
public class AppleEnemy extends falling_enemy {

    public Vector2 velocity = new Vector2(0f, 6.0f);

    public AppleEnemy(float x, float y, float width, float height, int enemy_num) {
        super(x, y, width, height, enemy_num);
    }
}
