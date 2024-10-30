package com.gildedrose;

public class BackstagePasses extends InventoryItem {
    public static final String NAME = "Backstage passes to a TAFKAL80ETC concert";

    public BackstagePasses(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {

        ItemSellInQuality itemInfo = item.itemSellInQuality;
        increaseQuality();

        if (itemInfo.sellIn < 11) {
            increaseQuality();
        }

        if (itemInfo.sellIn < 6) {
            increaseQuality();
        }
    }

    @Override
    protected void processExpired() {
        ItemSellInQuality itemInfo = item.itemSellInQuality;
        itemInfo.quality = 0;
    }
}
