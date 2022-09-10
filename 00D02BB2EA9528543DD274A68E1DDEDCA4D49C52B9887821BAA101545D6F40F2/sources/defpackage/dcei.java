package defpackage;

import java.util.Arrays;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcei  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcei<E> extends dcej<E> implements dclb<E> {
    private transient dcdc<E> a;
    private transient dcep<dcla<E>> b;

    @Override // defpackage.dccr
    public final int A(Object[] objArr, int i) {
        dcpd<dcla<E>> it = l().iterator();
        while (it.hasNext()) {
            dcla<E> next = it.next();
            Arrays.fill(objArr, i, next.b() + i, next.a());
            i += next.b();
        }
        return i;
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: SE */
    public final dcpd<E> iterator() {
        return new dcee(l().iterator());
    }

    @Override // defpackage.dclb
    @Deprecated
    public final int b(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public abstract dcep<E> c();

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return a(obj) > 0;
    }

    @Override // defpackage.dclb
    /* renamed from: e */
    public final dcep<dcla<E>> l() {
        dcep<dcla<E>> dcepVar = this.b;
        if (dcepVar == null) {
            if (isEmpty()) {
                dcepVar = dcmr.a;
            } else {
                dcepVar = new dceg(this);
            }
            this.b = dcepVar;
        }
        return dcepVar;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return dclh.a(this, obj);
    }

    @Override // defpackage.dclb
    @Deprecated
    public final void f(E e, int i) {
        throw null;
    }

    public abstract dcla<E> g(int i);

    @Override // defpackage.dclb
    @Deprecated
    public final void h(E e) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return dcnm.r(l());
    }

    @Override // defpackage.dclb
    @Deprecated
    public final boolean i(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dclb
    public /* bridge */ /* synthetic */ Set j() {
        throw null;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return l().toString();
    }

    @Override // defpackage.dccr
    public final dcdc<E> v() {
        dcdc<E> dcdcVar = this.a;
        if (dcdcVar == null) {
            dcdc<E> v = super.v();
            this.a = v;
            return v;
        }
        return dcdcVar;
    }

    @Override // defpackage.dccr
    abstract Object writeReplace();
}
