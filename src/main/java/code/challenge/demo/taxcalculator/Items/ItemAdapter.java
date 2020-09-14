package code.challenge.demo.taxcalculator.Items;

import code.challenge.demo.taxcalculator.Items.entities.Item;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItemAdapter {
    private static final String ITEM_REGEX_MATCHER = "(\\d+) ([\\w\\s]* )at (\\d+.\\d{2})";

    public static Item createItemFromString(String input) {
        Pattern pattern = Pattern.compile(ITEM_REGEX_MATCHER);
        Matcher matcher = pattern.matcher(input);
        matcher.find();

        return new Item(matcher.group(1), matcher.group(2), matcher.group(3));
    }
}
