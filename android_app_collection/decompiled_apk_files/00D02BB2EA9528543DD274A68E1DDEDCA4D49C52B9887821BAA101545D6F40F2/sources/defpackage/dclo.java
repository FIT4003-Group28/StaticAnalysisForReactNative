package defpackage;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dclo  reason: default package */
/* loaded from: classes5.dex */
public final class dclo<T> extends dclu<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final dclu<? super T> a;

    public dclo(dclu<? super T> dcluVar) {
        this.a = dcluVar;
    }

    @Override // defpackage.dclu
    public final <S extends T> dclu<S> St() {
        return this;
    }

    @Override // defpackage.dclu
    public final <S extends T> dclu<S> b() {
        return this.a.b();
    }

    @Override // defpackage.dclu
    public final <S extends T> dclu<S> c() {
        return this.a.c().b();
    }

    @Override // defpackage.dclu, java.util.Comparator
    public final int compare(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 != null) {
            return this.a.compare(t, t2);
        }
        return 1;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dclo)) {
            return false;
        }
        return this.a.equals(((dclo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 957692532;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append(valueOf);
        sb.append(".nullsFirst()");
        return sb.toString();
    }
}
