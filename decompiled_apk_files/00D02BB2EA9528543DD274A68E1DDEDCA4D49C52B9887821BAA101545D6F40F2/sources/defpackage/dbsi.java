package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dbsi  reason: default package */
/* loaded from: classes.dex */
public final class dbsi<A, B> implements Serializable {
    private static final long serialVersionUID = 747826592375603043L;
    public final A a;
    public final B b;

    protected dbsi(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public static <A, B> dbsi<A, B> a(A a, B b) {
        return new dbsi<>(a, b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dbsi) {
            dbsi dbsiVar = (dbsi) obj;
            if (dbsd.a(this.a, dbsiVar.a) && dbsd.a(this.b, dbsiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        A a = this.a;
        int i = 0;
        int hashCode = a == null ? 0 : a.hashCode();
        B b = this.b;
        if (b != null) {
            i = b.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(valueOf2).length());
        sb.append("(");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
