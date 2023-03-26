package com.isep.hpah.core.system;
import lombok.*;
import java.util.Random;


@Getter
@Setter
public class sorting_hat {
        @Getter@Setter
        public static String selectedhouse;
        public static String sorting_hat() {
                house[] values = house.values();
                int length = values.length;
                int randIndex = new Random().nextInt(length);
                selectedhouse = String.valueOf(house.values()[randIndex]);
                return selectedhouse;
        }

        public static String getSelectedhouse() {
                return selectedhouse;
        }
}