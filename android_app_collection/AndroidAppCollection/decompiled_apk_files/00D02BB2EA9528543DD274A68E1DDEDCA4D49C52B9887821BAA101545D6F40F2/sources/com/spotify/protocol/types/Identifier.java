package com.spotify.protocol.types;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Identifier implements Item {
    @dgto(a = "id")
    public final String id;

    private Identifier() {
        this(null);
    }

    public Identifier(String str) {
        this.id = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.id;
        String str2 = ((Identifier) obj).id;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str = this.id;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17);
        sb.append("Identifier{id='");
        sb.append(str);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
