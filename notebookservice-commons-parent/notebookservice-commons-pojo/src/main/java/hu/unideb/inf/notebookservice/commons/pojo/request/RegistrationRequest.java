package hu.unideb.inf.notebookservice.commons.pojo.request;

import hu.unideb.inf.notebookservice.commons.pojo.enumeration.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationRequest {

    private String username;

    private String password;

    private String passwordConfirm;

    private String userRole;
}
