package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateInventory() {
        for (Item item : items) {
            InventoryItem inventoryItem = new InventoryItem(item);
            updateItem(item, inventoryItem);
        }
    }

    private static void updateItem(Item item, InventoryItem inventoryItem) {
        updateQuality(item, inventoryItem);
        updateExpiration(item, inventoryItem);

        if (isExpired(item, inventoryItem)) {
            processExpired(item, inventoryItem);
        }
    }

    private static void updateQuality(Item item, InventoryItem inventoryItem) {
        if (item.name.equals("Aged Brie")) {
            increaseQuality(item, inventoryItem);
        }
        else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            increaseQuality(item, inventoryItem);

                if (item.sellIn < 11) {
                    increaseQuality(item, inventoryItem);
                }

                if (item.sellIn < 6) {
                    increaseQuality(item, inventoryItem);
                }
            }
        else if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        }
        else decreaseQuality(item, inventoryItem);
    }

    private static void updateExpiration(Item item, InventoryItem inventoryItem) {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        }
        item.sellIn--;
    }

    private static boolean isExpired(Item item, InventoryItem inventoryItem) {
        return item.sellIn < 0;
    }

    private static void processExpired(Item item, InventoryItem inventoryItem) {
        if (item.name.equals("Aged Brie")) {
            increaseQuality(item, inventoryItem);
        }
        else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            item.quality = 0;
        }
        else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        }
        else {
            decreaseQuality(item, inventoryItem);
        }
    }

    private static void increaseQuality(Item item, InventoryItem inventoryItem) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    private static void decreaseQuality(Item item, InventoryItem inventoryItem) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }
}
