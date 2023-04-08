package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Market {
    private long id;
    private String name;
    private String city;
    private String street;
    private int house;
    private int timeOfopen;
    private int timeOfclosed;
}
