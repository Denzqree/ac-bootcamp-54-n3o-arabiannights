package org.academiadecodigo.gnunas.arabiannights;

/**
 * Created by codecadet on 30/09/2020.
 */
public class Main {

    private static Genie[] genies;

    public static void main(String[] args) {

        MagicLamp magicLamp = new MagicLamp(5);

        genies = new Genie[]{
                magicLamp.rub(2),
                magicLamp.rub(3),
                magicLamp.rub(4),
                magicLamp.rub(5),
                magicLamp.rub(1)
        };

        geniesInfo();

        wish();
        wish();
        wish();
        wish();

        System.out.println("Recycling a demon");
        magicLamp.recharge((Demon) genies[4]);

        Genie extraGenie = magicLamp.rub(7);
        System.out.println(extraGenie);

        MagicLamp newLamp = new MagicLamp(4);
        System.out.println("The lamps are" + (magicLamp.equals(newLamp) ? " " : " not ") + "equal");

    }

    public static void wish(){

        for(Genie genie : genies){
            genie.grantWish();
        }

        geniesInfo();
    }

    public static void geniesInfo(){
        for(Genie genie: genies){
            System.out.println(genie.getClass().getSimpleName());
        }
    }
}