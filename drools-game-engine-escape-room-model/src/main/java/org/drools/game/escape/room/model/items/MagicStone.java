/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drools.game.escape.room.model.items;

import org.drools.game.model.api.Pickable;

/**
 *
 * @author salaboy
 */
public class MagicStone implements ShineInTheDarkItem, Pickable {

    @Override
    public String getName() {
        return "Magic Stone";
    }

    @Override
    public String toString() {
        return "MagicStone{" + '}';
    }
    
    
    
}
