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
        InventoryItem.updateQuality(item, inventoryItem);
        InventoryItem.updateExpiration(item, inventoryItem);

        if (InventoryItem.isExpired(item, inventoryItem)) {
            InventoryItem.processExpired(item, inventoryItem);
        }
    }

}
