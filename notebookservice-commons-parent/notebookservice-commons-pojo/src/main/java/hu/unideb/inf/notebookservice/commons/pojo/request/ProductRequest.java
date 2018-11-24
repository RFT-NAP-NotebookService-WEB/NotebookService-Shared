package hu.unideb.inf.notebookservice.commons.pojo.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {

    private String description;
    private String type;
    private Long brandId;
    private Long clientId;
}
