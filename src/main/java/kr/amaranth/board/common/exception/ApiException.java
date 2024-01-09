package kr.amaranth.board.common.exception;

import kr.amaranth.board.common.error.ErrorCodeImpl;
import lombok.Getter;

/**
 * Created by KimKyungHo on 2024-01-09(009)
 */

@Getter
public class ApiException extends RuntimeException implements ApiExceptionImpl {

    private final ErrorCodeImpl errorCodeImpl;
    private final String errorDescription;

    public ApiException(ErrorCodeImpl errorCodeImpl) {
        super(errorCodeImpl.getDescription());
        this.errorCodeImpl = errorCodeImpl;
        this.errorDescription = errorCodeImpl.getDescription();
    }

    public ApiException(ErrorCodeImpl errorCodeImpl, String errorDescription) {
        super(errorDescription);
        this.errorCodeImpl = errorCodeImpl;
        this.errorDescription = errorDescription;
    }

    public ApiException(ErrorCodeImpl errorCodeImpl, Throwable throwable) {
        super(throwable);
        this.errorCodeImpl = errorCodeImpl;
        this.errorDescription = errorCodeImpl.getDescription();
    }

    public ApiException(ErrorCodeImpl errorCodeImpl, Throwable throwable, String errorDescription) {
        super(throwable);
        this.errorCodeImpl = errorCodeImpl;
        this.errorDescription = errorDescription;
    }

}
