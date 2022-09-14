package defpackage;

import java.io.Serializable;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcmx  reason: default package */
/* loaded from: classes5.dex */
public final class dcmx<T> extends dclu<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final dclu<? super T> a;

    public dcmx(dclu<? super T> dcluVar) {
        this.a = dcluVar;
    }

    @Override // defpackage.dclu
    public final <S extends T> dclu<S> c() {
        return (dclu<? super T>) this.a;
    }

    @Override // defpackage.dclu, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.a.compare(t2, t);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dcmx)) {
            return false;
        }
        return this.a.equals(((dcmx) obj).a);
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    @Override // defpackage.dclu
    public final <E extends T> E i(Iterator<E> it) {
        return (E) this.a.l(it);
    }

    @Override // defpackage.dclu
    public final <E extends T> E j(Iterable<E> iterable) {
        return (E) this.a.m(iterable);
    }

    @Override // defpackage.dclu
    public final <E extends T> E k(E e, E e2) {
        return (E) this.a.n(e, e2);
    }

    @Override // defpackage.dclu
    public final <E extends T> E l(Iterator<E> it) {
        return (E) this.a.i(it);
    }

    @Override // defpackage.dclu
    public final <E extends T> E m(Iterable<E> iterable) {
        return (E) this.a.j(iterable);
    }

    @Override // defpackage.dclu
    public final <E extends T> E n(E e, E e2) {
        return (E) this.a.k(e, e2);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
