package com.spotify.protocol.types;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Uri implements Item {
    @dgto(a = "uri")
    public final String uri;

    private Uri() {
        this(null);
    }

    public Uri(String str) {
        this.uri = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.uri;
        String str2 = ((Uri) obj).uri;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.uri;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str = this.uri;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append("Uri{uri='");
        sb.append(str);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
