package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dbyu  reason: default package */
/* loaded from: classes5.dex */
abstract class dbyu<R, C, V> implements dcou<R, C, V> {
    public transient Collection<V> a;
    private transient Set<dcot<R, C, V>> b;

    @Override // defpackage.dcou
    public boolean a(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.dcou
    public V b(Object obj, Object obj2) {
        Map map = (Map) dcjz.A(p(), obj);
        if (map == null) {
            return null;
        }
        return (V) dcjz.A(map, obj2);
    }

    public final boolean c() {
        return l() == 0;
    }

    public void d() {
        throw null;
    }

    @Override // defpackage.dcou
    public V e(R r, C c, V v) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dcou) {
            return f().equals(((dcou) obj).f());
        }
        return false;
    }

    @Override // defpackage.dcou
    public Set<dcot<R, C, V>> f() {
        Set<dcot<R, C, V>> set = this.b;
        if (set == null) {
            Set<dcot<R, C, V>> g = g();
            this.b = g;
            return g;
        }
        return set;
    }

    public Set<dcot<R, C, V>> g() {
        return new dbyt(this);
    }

    public abstract Iterator<dcot<R, C, V>> h();

    public final int hashCode() {
        return f().hashCode();
    }

    public Collection<V> i() {
        throw null;
    }

    public final String toString() {
        return p().toString();
    }
}
