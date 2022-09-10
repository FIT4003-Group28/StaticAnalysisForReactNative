package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dczo  reason: default package */
/* loaded from: classes.dex */
public final class dczo extends dcyp implements Serializable {
    public static final dcza a = new dczo(0);
    static final dcza b = new dczo(dcze.a);
    private static final long serialVersionUID = 0;
    private final int c;

    public dczo(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dczo) && this.c == ((dczo) obj).c;
    }

    @Override // defpackage.dcza
    public final dczb f() {
        return new dczn(this.c);
    }

    public final int hashCode() {
        return getClass().hashCode() ^ this.c;
    }

    public final String toString() {
        int i = this.c;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Hashing.murmur3_128(");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
