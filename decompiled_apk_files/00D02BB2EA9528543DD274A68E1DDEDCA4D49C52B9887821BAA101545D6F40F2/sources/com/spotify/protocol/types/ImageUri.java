package com.spotify.protocol.types;

import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ImageUri implements Item {
    public final String raw;

    private ImageUri() {
        this(null);
    }

    public ImageUri(String str) {
        this.raw = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return dbsd.a(this.raw, ((ImageUri) obj).raw);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.raw});
    }

    public String toString() {
        return "ImageId{" + this.raw + "'}";
    }
}
