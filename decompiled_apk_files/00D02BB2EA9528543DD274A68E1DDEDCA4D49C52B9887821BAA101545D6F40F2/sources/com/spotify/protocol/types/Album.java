package com.spotify.protocol.types;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Album implements Item {
    @dgto(a = "name")
    public final String name;
    @dgto(a = "uri")
    public final String uri;

    private Album() {
        this(null, null);
    }

    public Album(String str, String str2) {
        this.name = str;
        this.uri = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Album album = (Album) obj;
        String str = this.name;
        if (str == null ? album.name != null : !str.equals(album.name)) {
            return false;
        }
        String str2 = this.uri;
        String str3 = album.uri;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.uri;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.name;
        String str2 = this.uri;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(str2).length());
        sb.append("Album{name='");
        sb.append(str);
        sb.append('\'');
        sb.append(", uri='");
        sb.append(str2);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
