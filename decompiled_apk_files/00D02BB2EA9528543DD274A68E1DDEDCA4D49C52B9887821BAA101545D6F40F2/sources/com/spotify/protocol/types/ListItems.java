package com.spotify.protocol.types;

import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ListItems implements Item {
    @dgto(a = "items")
    public final ListItem[] items;
    @dgto(a = "limit")
    public final int limit;
    @dgto(a = "offset")
    public final int offset;
    @dgto(a = "total")
    public final int total;

    private ListItems() {
        this(0, 0, 0, null);
    }

    public ListItems(int i, int i2, int i3, ListItem[] listItemArr) {
        this.limit = i;
        this.offset = i2;
        this.total = i3;
        this.items = listItemArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListItems listItems = (ListItems) obj;
        if (this.limit != listItems.limit || this.offset != listItems.offset || this.total != listItems.total) {
            return false;
        }
        return Arrays.equals(this.items, listItems.items);
    }

    public int hashCode() {
        return (((((this.limit * 31) + this.offset) * 31) + this.total) * 31) + Arrays.hashCode(this.items);
    }

    public String toString() {
        int i = this.limit;
        int i2 = this.offset;
        int i3 = this.total;
        String arrays = Arrays.toString(this.items);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 75);
        sb.append("ListItems{limit=");
        sb.append(i);
        sb.append(", offset=");
        sb.append(i2);
        sb.append(", total=");
        sb.append(i3);
        sb.append(", items=");
        sb.append(arrays);
        sb.append('}');
        return sb.toString();
    }
}
