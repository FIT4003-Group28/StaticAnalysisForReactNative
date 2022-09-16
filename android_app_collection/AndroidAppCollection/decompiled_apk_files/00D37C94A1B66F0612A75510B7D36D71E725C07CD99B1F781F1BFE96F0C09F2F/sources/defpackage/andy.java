package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: andy  reason: default package */
/* loaded from: classes.dex */
public final class andy extends anhc implements Serializable {
    public static final anhc b;
    private static final long serialVersionUID = 0;
    public final int a;

    static {
        new andy(0);
        b = new andy(andw.a);
    }

    public andy(int i) {
        this.a = i;
    }

    public static int a(int i) {
        return Integer.rotateLeft(i * (-862048943), 15) * 461845907;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof andy) && this.a == ((andy) obj).a;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ this.a;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(31);
        sb.append("Hashing.murmur3_32(");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
