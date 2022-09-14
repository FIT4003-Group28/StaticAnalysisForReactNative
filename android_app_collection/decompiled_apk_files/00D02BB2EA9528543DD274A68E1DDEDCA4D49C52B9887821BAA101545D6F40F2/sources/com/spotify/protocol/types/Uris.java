package com.spotify.protocol.types;

import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Uris implements Item {
    public final String[] uris;

    public Uris() {
        this(null);
    }

    public Uris(String[] strArr) {
        this.uris = strArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.equals(this.uris, ((Uris) obj).uris);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.uris);
    }

    public String toString() {
        String arrays = Arrays.toString(this.uris);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 11);
        sb.append("Uris{uris=");
        sb.append(arrays);
        sb.append('}');
        return sb.toString();
    }
}
