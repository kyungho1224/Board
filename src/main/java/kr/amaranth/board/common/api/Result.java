package kr.amaranth.board.common.api;

import kr.amaranth.board.common.error.ErrorCode;
import kr.amaranth.board.common.error.ErrorCodeImpl;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by KimKyungHo on 2024-01-09(009)
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Result {

    private Integer resultCode;

    private String resultMessage;

    private String resultDescription;

    public static Result OK() {
        return Result.builder()
                .resultCode(ErrorCode.OK.getErrorCode())
                .resultMessage(ErrorCode.OK.getDescription())
                .resultDescription("성공")
                .build();
    }

    public static Result ERROR(ErrorCodeImpl errorCodeImpl) {
        return Result.builder()
                .resultCode(errorCodeImpl.getErrorCode())
                .resultMessage(errorCodeImpl.getDescription())
                .resultDescription("실패")
                .build();
    }

    public static Result ERROR(ErrorCodeImpl errorCodeImpl, String description) {
        return Result.builder()
                .resultCode(errorCodeImpl.getErrorCode())
                .resultMessage(errorCodeImpl.getDescription())
                .resultDescription(description)
                .build();
    }

    public static Result ERROR(ErrorCodeImpl errorCodeImpl, Throwable throwable) {
        return Result.builder()
                .resultCode(errorCodeImpl.getErrorCode())
                .resultMessage(errorCodeImpl.getDescription())
                .resultDescription(throwable.getLocalizedMessage())
                .build();
    }

}
