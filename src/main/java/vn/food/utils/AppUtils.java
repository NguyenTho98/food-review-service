package vn.food.utils;

import org.springframework.http.HttpStatus;
import vn.food.exception.FoodException;

public final class AppUtils {

    private AppUtils() {
        //do something
    }

    public static void validatePageNumberAndSize(int page, int size) {
        if (page < 0) {
            throw new FoodException(
                HttpStatus.BAD_REQUEST, "Page number cannot be less than zero.");
        }

        if (size < 0) {
            throw new FoodException(
                HttpStatus.BAD_REQUEST, "Size number cannot be less than zero.");
        }

    }
}
