package org.academiadecodigo.gnunas.arabiannights;

/**
 * Created by codecadet on 30/09/2020.
 */
public class Genie {

    private int wishLimit;
    private int grantedWishes;

    public Genie(int wishLimit){
        this.wishLimit = wishLimit;
    }

    public int getWishLimit(){
        return wishLimit;
    }

    public int getGrantedWishes() {
        return grantedWishes;
    }

    public int getRemainingWishes() {
        int remainingWishes = getWishLimit() - getGrantedWishes();
        return remainingWishes >= 0 ? remainingWishes : 0;
    }

    public boolean hasWishes() {
        return getRemainingWishes() > 0;
    }

    public void grantingWish() {
        this.grantedWishes++;
        System.out.println("Your wish was granted by "+this.getClass().getSimpleName());
    }

    public boolean grantWish(){

        if(!hasWishes()){
            return false;
        }

        grantingWish();
        return true;
    }


}
