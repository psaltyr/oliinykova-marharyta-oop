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
        item.sellIn--;
    }

    protected boolean isExpired() {
        return item.sellIn < 0;
    }

    protected void processExpired() {
        decreaseQuality();
    }

    protected void increaseQuality() {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    protected void decreaseQuality() {
        if (item.quality > 0) {
            item.quality--;
        }
    }
}
