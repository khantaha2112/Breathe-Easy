package breatheasy.airqualityindexservice.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Components {
    private Double co;
    private Double no;
    private Double no2;
    private Double o3;
    private Double so2;
    private Double pm2_5;
    private Double pm10;
    private Double nh3;
}
