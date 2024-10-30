package com.gildedrose;

public class InventoryItem {

    protected Item item;

    public static InventoryItem create(Item item) {
        return switch (item.name) {
            case AgedBrie.NAME -> new AgedBrie(item);
            case BackstagePasses.NAME -> new BackstagePasses(item);
            case Sulfuras.NAME -> new Sulfuras(item);
            default -> new InventoryItem(item);
        };
    }

    public InventoryItem(Item item) {
        this.item = item;
    }

    public void dailyUpdate() {
        updateQuality();
        updateExpiration();
        if (isExpired()) {
            processExpired();
        }
    }

    protected void updateQuality() {
        decreaseQuality();
    }

    protected void updateExpiration() {
        ItemSellInQuality itemInfo = item.itemSellInQuality;
        itemInfo.sellIn--;
    }

    protected boolean isExpired() {
        ItemSellInQuality itemInfo = item.itemSellInQuality;
        return itemInfo.sellIn < 0;
    }

    protected void processExpired() {
        decreaseQuality();
    }

    protected void increaseQuality() {
        ItemSellInQuality itemInfo = item.itemSellInQuality;
        if (itemInfo.quality < 50) {
            itemInfo.quality++;
        }
    }

    protected void decreaseQuality() {
        ItemSellInQuality itemInfo = item.itemSellInQuality;
        if (itemInfo.quality > 0) {
            itemInfo.quality--;
        }
    }
}
