package step2;

import step2.common.Separator;
import step2.model.Input;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringCalculateSeparator {

    private static final Pattern CUSTOM_SEPARATE_PATTERN = Pattern.compile(Separator.CUSTOM_SEPARATOR.getRegexp());
    private static final int CUSTOM_SEPARATOR_INDEX = 1;
    private static final String EMPTY_STRING = "";
    private static final String SEPARATOR_CONCAT_DELIMITER = "|";

    public Input executeSeparator(String input) {

        if (isEmpty(input)) {
            return new Input(input, Collections.emptyList());
        }

        List<String> inputList = Arrays.stream(input.split(concatSeparator(input)))
                .filter(Predicate.not(String::isEmpty))
                .collect(Collectors.toList());

        return new Input(input, inputList);
    }

    private boolean isEmpty(String input) {

        return input == null || input.strip().length() == 0;
    }

    private String concatSeparator(String input) {

        StringJoiner stringJoiner = new StringJoiner(SEPARATOR_CONCAT_DELIMITER)
                .add(Separator.REGULAR_SEPARATOR.getRegexp())
                .add(Separator.CUSTOM_SEPARATOR.getRegexp());

        String extractCustomSeparator = extractCustomSeparator(input);

        if (!extractCustomSeparator.isEmpty()) {
            stringJoiner.add(extractCustomSeparator);
        }

        return stringJoiner.toString();
    }

    private String extractCustomSeparator(String input) {

        Matcher matcher = CUSTOM_SEPARATE_PATTERN.matcher(input);

        if (matcher.find()) {
            return matcher.group(CUSTOM_SEPARATOR_INDEX);
        }

        return EMPTY_STRING;
    }

}
