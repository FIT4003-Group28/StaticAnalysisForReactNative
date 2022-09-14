package com.spotify.protocol.types;

import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class UriWithOptionExtras implements Item {
    @dgto(a = "options")
    public final String[] options;
    @dgto(a = "uri")
    public final String uri;

    public UriWithOptionExtras() {
        this(null, null);
    }

    public UriWithOptionExtras(String str, String[] strArr) {
        this.uri = str;
        this.options = strArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UriWithOptionExtras uriWithOptionExtras = (UriWithOptionExtras) obj;
        return this.uri.equals(uriWithOptionExtras.uri) && Arrays.equals(this.options, uriWithOptionExtras.options);
    }

    public int hashCode() {
        return (this.uri.hashCode() * 31) + Arrays.hashCode(this.options);
    }

    public String toString() {
        String str = this.uri;
        String arrays = Arrays.toString(this.options);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(arrays).length());
        sb.append("UriWithOptionExtras{uri='");
        sb.append(str);
        sb.append('\'');
        sb.append(", options=");
        sb.append(arrays);
        sb.append('}');
        return sb.toString();
    }
}
