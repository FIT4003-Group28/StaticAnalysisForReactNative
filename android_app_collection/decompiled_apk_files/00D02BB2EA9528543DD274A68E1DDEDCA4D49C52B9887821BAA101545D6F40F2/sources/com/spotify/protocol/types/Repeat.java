package com.spotify.protocol.types;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Repeat implements Item {
    public static final int ALL = 2;
    public static final int OFF = 0;
    public static final int ONE = 1;
    @dgto(a = "repeat")
    public final int repeat;

    private Repeat() {
        this(0);
    }

    public Repeat(int i) {
        this.repeat = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.repeat == ((Repeat) obj).repeat;
    }

    public int hashCode() {
        return this.repeat;
    }

    public String toString() {
        int i = this.repeat;
        StringBuilder sb = new StringBuilder(26);
        sb.append("Repeat{repeat=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}
