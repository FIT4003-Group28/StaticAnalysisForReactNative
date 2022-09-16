package c.e.a.b.d.e;

import java.util.Iterator;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class d0<E> extends x<E> implements Set<E> {

    /* renamed from: c  reason: collision with root package name */
    private transient w<E> f3883c;

    public w<E> b() {
        w<E> wVar = this.f3883c;
        if (wVar == null) {
            w<E> f2 = f();
            this.f3883c = f2;
            return f2;
        }
        return wVar;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return i0.a(this, obj);
    }

    w<E> f() {
        return w.a(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return i0.a(this);
    }

    @Override // c.e.a.b.d.e.x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
