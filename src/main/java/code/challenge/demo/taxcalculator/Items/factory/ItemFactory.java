package code.challenge.demo.taxcalculator.Items.factory;

import code.challenge.demo.taxcalculator.Items.ItemAdapter;
import code.challenge.demo.taxcalculator.Items.TaxCalculator;
import code.challenge.demo.taxcalculator.Items.entities.Item;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ItemFactory {

    public static List<Item> from(String[] inputs) {
        return Arrays.stream(inputs)
                .map(ItemFactory::from)
                .collect(Collectors.toList());
    }

    private static Item from(String input) {
        Item item = ItemAdapter.createItemFromString(input);
        TaxCalculator.applyTaxes(item);
        return item;
    }

}
