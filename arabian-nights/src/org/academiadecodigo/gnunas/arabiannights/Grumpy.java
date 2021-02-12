package org.academiadecodigo.gnunas.arabiannights;

/**
 * Created by codecadet on 30/09/2020.
 */
public class Grumpy extends Genie{

    public Grumpy(int wishLimit){
        super(wishLimit);
    }

    @Override
    public boolean hasWishes(){
        return getGrantedWishes() == 0;
    }
}
