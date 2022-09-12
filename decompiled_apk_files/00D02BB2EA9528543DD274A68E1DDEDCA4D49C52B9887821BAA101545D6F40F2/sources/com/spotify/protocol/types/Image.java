package com.spotify.protocol.types;

import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Image implements Item {
    @dgto(a = "height")
    public final int height;
    @dgto(a = "image_data")
    public final byte[] imageData;
    @dgto(a = "width")
    public final int width;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum Dimension {
        LARGE(720),
        MEDIUM(480),
        SMALL(360),
        X_SMALL(240),
        THUMBNAIL(144);
        
        private final int mValue;

        Dimension(int i) {
            this.mValue = i;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    private Image() {
        this(null, 0, 0);
    }

    public Image(byte[] bArr, int i, int i2) {
        this.imageData = bArr;
        this.width = i;
        this.height = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Image image = (Image) obj;
        if (this.width != image.width || this.height != image.height) {
            return false;
        }
        return Arrays.equals(this.imageData, image.imageData);
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.imageData) * 31) + this.width) * 31) + this.height;
    }

    public String toString() {
        String arrays = Arrays.toString(this.imageData);
        int i = this.width;
        int i2 = this.height;
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 56);
        sb.append("Image{imageData=");
        sb.append(arrays);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append('}');
        return sb.toString();
    }
}
