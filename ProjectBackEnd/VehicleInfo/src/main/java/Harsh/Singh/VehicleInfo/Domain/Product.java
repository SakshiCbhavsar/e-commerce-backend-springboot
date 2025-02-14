package Harsh.Singh.VehicleInfo.Domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    private String id;
    private String description;
    private int price;
    private byte[] imageUrl;
    private String brand;
    private String title;
    private String color;
    private double discountedPrice;
    private int discountPercent;
    private String category;
    private String secondCategory;
    private String thirdCategory;

}
