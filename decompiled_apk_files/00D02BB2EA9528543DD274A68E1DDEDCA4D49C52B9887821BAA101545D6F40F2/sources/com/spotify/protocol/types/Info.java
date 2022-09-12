package com.spotify.protocol.types;

import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Info implements Item {
    @dgto(a = "category")
    public final String category;
    @dgto(a = "default_image_height")
    public final int defaultImageHeight;
    @dgto(a = "default_image_width")
    public final int defaultImageWidth;
    @dgto(a = "default_thumbnail_image_height")
    public final int defaultThumbnailImageHeight;
    @dgto(a = "default_thumbnail_image_width")
    public final int defaultThumbnailImageWidth;
    @dgto(a = "id")
    public final String id;
    @dgto(a = "image_type")
    public final String imageType;
    @dgto(a = "model")
    public final String model;
    @dgto(a = "name")
    public final String name;
    @dgto(a = "protocol_version")
    public final int protocolVersion;
    @dgto(a = "required_features")
    public final List<String> requiredFeatures;
    @dgto(a = "version")
    public final String version;

    private Info() {
        this(0, null, null, null, null, null, null, null, 0, 0, 0, 0);
    }

    public Info(int i, List<String> list, String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, int i4, int i5) {
        this.protocolVersion = i;
        this.id = str;
        this.name = str2;
        this.model = str3;
        this.category = str4;
        this.version = str5;
        this.imageType = str6;
        this.requiredFeatures = list;
        this.defaultImageHeight = i3;
        this.defaultImageWidth = i2;
        this.defaultThumbnailImageHeight = i5;
        this.defaultThumbnailImageWidth = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Info info = (Info) obj;
        if (this.protocolVersion != info.protocolVersion || this.defaultImageHeight != info.defaultImageHeight || this.defaultImageWidth != info.defaultImageWidth || this.defaultThumbnailImageHeight != info.defaultThumbnailImageHeight || this.defaultThumbnailImageWidth != info.defaultThumbnailImageWidth) {
            return false;
        }
        String str = this.id;
        if (str == null ? info.id != null : !str.equals(info.id)) {
            return false;
        }
        String str2 = this.name;
        if (str2 == null ? info.name != null : !str2.equals(info.name)) {
            return false;
        }
        String str3 = this.model;
        if (str3 == null ? info.model != null : !str3.equals(info.model)) {
            return false;
        }
        String str4 = this.category;
        if (str4 == null ? info.category != null : !str4.equals(info.category)) {
            return false;
        }
        String str5 = this.version;
        if (str5 == null ? info.version != null : !str5.equals(info.version)) {
            return false;
        }
        String str6 = this.imageType;
        if (str6 == null ? info.imageType != null : !str6.equals(info.imageType)) {
            return false;
        }
        List<String> list = this.requiredFeatures;
        return list == null ? info.requiredFeatures == null : list.equals(info.requiredFeatures);
    }

    public int hashCode() {
        int i = this.protocolVersion * 31;
        String str = this.id;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.model;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.category;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.version;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.imageType;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<String> list = this.requiredFeatures;
        if (list != null) {
            i2 = list.hashCode();
        }
        return ((((((((hashCode6 + i2) * 31) + this.defaultImageHeight) * 31) + this.defaultImageWidth) * 31) + this.defaultThumbnailImageHeight) * 31) + this.defaultThumbnailImageWidth;
    }

    public String toString() {
        int i = this.protocolVersion;
        String str = this.id;
        String str2 = this.name;
        String str3 = this.model;
        String str4 = this.category;
        String str5 = this.version;
        String str6 = this.imageType;
        String valueOf = String.valueOf(this.requiredFeatures);
        int i2 = this.defaultImageHeight;
        int i3 = this.defaultImageWidth;
        int i4 = this.defaultThumbnailImageHeight;
        int i5 = this.defaultThumbnailImageWidth;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        int length5 = String.valueOf(str5).length();
        StringBuilder sb = new StringBuilder(length + 261 + length2 + length3 + length4 + length5 + String.valueOf(str6).length() + String.valueOf(valueOf).length());
        sb.append("Info{protocolVersion=");
        sb.append(i);
        sb.append(", id='");
        sb.append(str);
        sb.append('\'');
        sb.append(", name='");
        sb.append(str2);
        sb.append('\'');
        sb.append(", model='");
        sb.append(str3);
        sb.append('\'');
        sb.append(", category='");
        sb.append(str4);
        sb.append('\'');
        sb.append(", version='");
        sb.append(str5);
        sb.append('\'');
        sb.append(", imageType='");
        sb.append(str6);
        sb.append('\'');
        sb.append(", requiredFeatures=");
        sb.append(valueOf);
        sb.append(", defaultImageHeight=");
        sb.append(i2);
        sb.append(", defaultImageWidth=");
        sb.append(i3);
        sb.append(", defaultThumbnailImageHeight=");
        sb.append(i4);
        sb.append(", defaultThumbnailImageWidth=");
        sb.append(i5);
        sb.append('}');
        return sb.toString();
    }
}
