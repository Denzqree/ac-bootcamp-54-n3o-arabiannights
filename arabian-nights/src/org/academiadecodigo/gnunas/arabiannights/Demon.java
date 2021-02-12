package org.academiadecodigo.gnunas.arabiannights;

/**
 * Created by codecadet on 30/09/2020.
 */
public class Demon extends Genie{

    private boolean isRecycled = false;

    public Demon(int wishLimit){
        super(wishLimit);
    }

    public boolean isRecycled(){
        return isRecycled;
    }

    public void recycleDemon(){
        isRecycled = true;
    }

    @Override
    public boolean hasWishes(){
        return !isRecycled;
    }

}
