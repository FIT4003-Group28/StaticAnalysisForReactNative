package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dbrk  reason: default package */
/* loaded from: classes5.dex */
public final class dbrk<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final T a;
    private final dbrl<? super T> b;

    public dbrk(dbrl<? super T> dbrlVar, T t) {
        this.b = dbrlVar;
        this.a = t;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dbrk)) {
            return false;
        }
        dbrk dbrkVar = (dbrk) obj;
        if (!this.b.equals(dbrkVar.b)) {
            return false;
        }
        return this.b.c((T) this.a, (T) dbrkVar.a);
    }

    public final int hashCode() {
        return this.b.d((T) this.a);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(".wrap(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
