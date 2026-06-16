package co.kr.inventis.apidog.user;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    @Operation(summary = "회원 생성")
    @PostMapping
    public CreateUserResponse create(
            @Valid @RequestBody CreateUserRequest request) {
        return new CreateUserResponse(request.name(), request.email());
    }
}
