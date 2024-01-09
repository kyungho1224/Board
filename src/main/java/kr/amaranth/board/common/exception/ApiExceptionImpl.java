package kr.amaranth.board.common.exception;

import kr.amaranth.board.common.error.ErrorCodeImpl;

/**
 * Created by KimKyungHo on 2024-01-09(009)
 */
public interface ApiExceptionImpl {

    ErrorCodeImpl getErrorCodeImpl();

    String getErrorDescription();

}
