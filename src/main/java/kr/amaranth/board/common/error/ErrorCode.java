package kr.amaranth.board.common.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * Created by KimKyungHo on 2024-01-09(009)
 */

@AllArgsConstructor
@Getter
public enum ErrorCode implements ErrorCodeImpl {

    OK(200, 200, "Success"),
    BAD_REQUEST(HttpStatus.BAD_REQUEST.value(), 400, "Wrong Request"),
    SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR.value(), 500, "Server Error"),
    NULL_POINT(HttpStatus.INTERNAL_SERVER_ERROR.value(), 512, "Null Pointer"),
    ;

    private final Integer httpStatusCode;
    private final Integer errorCode;
    private final String description;

}
