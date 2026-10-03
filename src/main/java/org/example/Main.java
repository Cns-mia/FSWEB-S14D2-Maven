package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("Master Bedroom",
                new Wall("NORTH"), new Wall("SOUTH"), new Wall("EAST"), new Wall("WEST"),
                new Ceiling(3, PaintColor.WHITE),
                new Bed("Çift Kişilik", 4, 1, 2, 2),
                new Lamp(LampType.NORMAL, true, 80),
                new Wardrobe(2, 4, 40),
                new Carpet(3, 5, PaintColor.RED));

        bedroom.getWall1().create();
        System.out.println("Wall direction: " + bedroom.getWall1().getDirection());
        bedroom.getCeiling().create();
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
    }
}
