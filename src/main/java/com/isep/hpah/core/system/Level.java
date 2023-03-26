package com.isep.hpah.core.system;
import lombok.*;
import java.util.List;
import com.isep.hpah.core.system.wizard.*;
@Getter@Setter
public class Level {
    private String name;
    private String place;
    private String desc1;
    private String desc2;
    private String desc3;
    private String desc4;
    private String desc5;
    private List<character> enemie;
}
