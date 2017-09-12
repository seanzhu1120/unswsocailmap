package com.example.eliza.socialmap;

/**
 * Created by Jay on 2015/10/8 0008.
 */
public class Item {

    private int iconId;
    private String iconName;

    public Item() {
    }

    public Item(int iconId, String iconName) {
        this.iconId = iconId;
        this.iconName = iconName;
    }

    public int getIconId() {
        return iconId;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }
}

