package kr.amaranth.board.common.api;

import kr.amaranth.board.common.error.ErrorCodeImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by KimKyungHo on 2024-01-09(009)
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Api<T> {

    private Result result;

    private T body;

    public static <T> Api<T> OK(T data) {
        var api = new Api<T>();
        api.result = Result.OK();
        api.body = data;
        return api;
    }

    public static Api<Object> ERROR(Result result) {
        var api = new Api<Object>();
        api.result = result;
        return api;
    }

    public static Api<Object> ERROR(ErrorCodeImpl errorCodeImpl) {
        var api = new Api<Object>();
        api.result = Result.ERROR(errorCodeImpl);
        return api;
    }

    public static Api<Object> ERROR(ErrorCodeImpl errorCodeImpl, Throwable tx) {
        var api = new Api<Object>();
        api.result = Result.ERROR(errorCodeImpl, tx);
        return api;
    }

    public static Api<Object> ERROR(ErrorCodeImpl errorCodeImpl, String description) {
        var api = new Api<Object>();
        api.result = Result.ERROR(errorCodeImpl, description);
        return api;
    }

}
