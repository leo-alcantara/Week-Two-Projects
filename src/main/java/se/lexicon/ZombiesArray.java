package se.lexicon;

import java.util.Random;

public class ArraysZombies {

    public static void main(String[] args) {
        String weapons[] = {"Glock", "Shotgun", "Sniper Rifle", "Grenade"};
        String zombies[] = {"Crawler", "Runner", "Wanderer"};
        int ammo[] = {48, 32, 26, 4};
        //System.out.println(weapons[2]);
        //System.out.println("To kill " + zombies[1] + " zombies.");

        String randomZombie0 = "Crawler";
        String randomZombie1 = "Runner";
        String randomZombie2 = "Wanderer";

        Random weaponGenerator = new Random();
        int randomWeapon = weaponGenerator.nextInt(ammo.length);
        //System.out.println(randomWeapon);

        Random ammoGenerator = new Random();
        int randomAmmo = ammoGenerator.nextInt(ammo.length);
        //System.out.println(randomAmmo);

        Random zombieGenerator = new Random();
        int randomZombie = zombieGenerator.nextInt(zombies.length);
        //System.out.println(randomZombie);


        if (randomZombie == 0) {
            System.out.println("Watch for the " + randomZombie0 + ".");
            System.out.println("You need your " + weapons[0] + " or your " + weapons[1] + ". Hurry!");
        }
        if (randomZombie == 1) {
            System.out.println("Watch for the " + randomZombie1 + ".");
            System.out.println("You need your " + weapons[0] + " or your " + weapons[1] + ". Hurry!");
        }
        if (randomZombie == 2) {
            System.out.println("Watch for the " + randomZombie2 + ".");
            System.out.println("You need your " + weapons[2] + " or a " + weapons[3] + ". Hurry!");
        }
    }


}



