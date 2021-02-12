package org.academiadecodigo.gnunas.arabiannights;

/**
 * Syntax : TBR ?= To Be Released
 * Created by codecadet on 30/09/2020.
 */
public class MagicLamp {

    private int maxGenies;
    private int rubs;
    private int recycledDemons;

    public MagicLamp(int maxGenies) {
        this.maxGenies = maxGenies;
    }

    public int getMaxGenies() {
        return maxGenies;
    }

    public int getRubs() {
        return rubs;
    }

    public int getRecycledDemons() {
        return recycledDemons;
    }

    public int getRemainingGenies() {
        return getMaxGenies() - getRubs();
    }

    public Genie rub(int wishes) {

        if (getRemainingGenies() == 0) {
            return new Demon(wishes);
        }

        Genie genie;
        if (rubs % 2 == 0) {
            genie = new Friendly(wishes);
        } else {
            genie = new Grumpy((wishes));
        }

        rubs++;
        return genie;

    }

    public void recharge(Demon demon){
        if(demon.isRecycled()){
            return;
        }

        demon.recycleDemon();
        rubs = 0;
        recycledDemons++;
    }

    public boolean equals(MagicLamp lamp){

        return getMaxGenies() == lamp.getMaxGenies() &&
                getRemainingGenies() == lamp.getRemainingGenies() &&
                getRecycledDemons() == lamp.getRecycledDemons();
    }

}
