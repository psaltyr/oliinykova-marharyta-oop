package com.gildedrose;

public class InventoryItem {
    private final Item item;

    public InventoryItem(Item item) {
        this.item = item;
    }

    protected static void decreaseQuality(Item item, InventoryItem inventoryItem) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    protected static void increaseQuality(Item item, InventoryItem inventoryItem) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    protected static void updateQuality(Item item, InventoryItem inventoryItem) {
        if (item.name.equals("Aged Brie")) {
            increaseQuality(item, inventoryItem);
        } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            increaseQuality(item, inventoryItem);

            if (item.sellIn < 11) {
                increaseQuality(item, inventoryItem);
            }

            if (item.sellIn < 6) {
                increaseQuality(item, inventoryItem);
            }
        } else if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        } else decreaseQuality(item, inventoryItem);
    }

    protected static void updateExpiration(Item item, InventoryItem inventoryItem) {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        }
        item.sellIn--;
    }

    protected static boolean isExpired(Item item, InventoryItem inventoryItem) {
        return item.sellIn < 0;
    }

    protected static void processExpired(Item item, InventoryItem inventoryItem) {
        if (item.name.equals("Aged Brie")) {
            increaseQuality(item, inventoryItem);
        } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            item.quality = 0;
        } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        } else {
            decreaseQuality(item, inventoryItem);
        }
    }
}
