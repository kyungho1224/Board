package kr.amaranth.board.common.error;

/**
 * Created by KimKyungHo on 2024-01-09(009)
 */
public interface ErrorCodeImpl {

    Integer getHttpStatusCode();

    Integer getErrorCode();

    String getErrorDescription();

}
