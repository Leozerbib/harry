package com.isep.hpah.core.system;
import lombok.*;



@Getter

 public enum Core {
    PHOENIX_FEATHER,
    DRAGON_HEARTSTRING,
    UNICORN_TAIL_HAIR,
    THESTRAL_TAIL_HAIR,
    BASILISK_HORN;
   public static boolean isValidCoreName(String name) {
      for (Core c : values()) {
         if (c.name().equals(name)) {
            return true;
         }
      }
      return false;
   }
}







