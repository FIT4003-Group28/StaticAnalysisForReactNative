package com.spotify.protocol.types;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ListItem implements Item {
    @dgto(a = "has_children")
    public final boolean hasChildren;
    @dgto(a = "id")
    public final String id;
    @dgto(a = "image_id")
    public final ImageUri imageUri;
    @dgto(a = "playable")
    public final boolean playable;
    @dgto(a = "subtitle")
    public final String subtitle;
    @dgto(a = "title")
    public final String title;
    @dgto(a = "uri")
    public final String uri;

    private ListItem() {
        this(null, null, null, null, null, false, false);
    }

    public ListItem(String str, String str2, ImageUri imageUri, String str3, String str4, boolean z, boolean z2) {
        this.id = str;
        this.uri = str2;
        this.imageUri = imageUri;
        this.title = str3;
        this.subtitle = str4;
        this.playable = z;
        this.hasChildren = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListItem listItem = (ListItem) obj;
        if (this.playable != listItem.playable || this.hasChildren != listItem.hasChildren) {
            return false;
        }
        String str = this.id;
        if (str == null ? listItem.id != null : !str.equals(listItem.id)) {
            return false;
        }
        String str2 = this.uri;
        if (str2 == null ? listItem.uri != null : !str2.equals(listItem.uri)) {
            return false;
        }
        ImageUri imageUri = this.imageUri;
        if (imageUri == null ? listItem.imageUri != null : !imageUri.equals(listItem.imageUri)) {
            return false;
        }
        String str3 = this.title;
        if (str3 == null ? listItem.title != null : !str3.equals(listItem.title)) {
            return false;
        }
        String str4 = this.subtitle;
        String str5 = listItem.subtitle;
        return str4 != null ? str4.equals(str5) : str5 == null;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.uri;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ImageUri imageUri = this.imageUri;
        int hashCode3 = (hashCode2 + (imageUri != null ? imageUri.hashCode() : 0)) * 31;
        String str3 = this.title;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.subtitle;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((((hashCode4 + i) * 31) + (this.playable ? 1 : 0)) * 31) + (this.hasChildren ? 1 : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.uri;
        String valueOf = String.valueOf(this.imageUri);
        String str3 = this.title;
        String str4 = this.subtitle;
        boolean z = this.playable;
        boolean z2 = this.hasChildren;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 93 + length2 + length3 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("ListItem{id='");
        sb.append(str);
        sb.append('\'');
        sb.append(", uri='");
        sb.append(str2);
        sb.append('\'');
        sb.append(", imageId='");
        sb.append(valueOf);
        sb.append('\'');
        sb.append(", title='");
        sb.append(str3);
        sb.append('\'');
        sb.append(", subtitle='");
        sb.append(str4);
        sb.append('\'');
        sb.append(", playable=");
        sb.append(z);
        sb.append(", hasChildren=");
        sb.append(z2);
        sb.append('}');
        return sb.toString();
    }
}
