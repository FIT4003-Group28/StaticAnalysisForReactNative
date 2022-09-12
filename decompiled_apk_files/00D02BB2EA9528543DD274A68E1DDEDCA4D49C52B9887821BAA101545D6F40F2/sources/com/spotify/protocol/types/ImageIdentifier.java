package com.spotify.protocol.types;

import com.spotify.protocol.types.Image;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ImageIdentifier implements Item {
    public final int height;
    public final String id;
    public final int width;

    public ImageIdentifier(String str, Image.Dimension dimension) {
        this.id = str;
        this.width = dimension.getValue();
        this.height = dimension.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageIdentifier imageIdentifier = (ImageIdentifier) obj;
        String str = this.id;
        if (str == null ? imageIdentifier.id != null : !str.equals(imageIdentifier.id)) {
            return false;
        }
        return this.height == imageIdentifier.height && this.width == imageIdentifier.width;
    }

    public int hashCode() {
        String str = this.id;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.height) * 31) + this.width;
    }
}
