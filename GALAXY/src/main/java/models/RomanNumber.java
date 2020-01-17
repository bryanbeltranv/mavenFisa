package models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class RomanNumber {
    private String symbol;
    private  int value;
}
