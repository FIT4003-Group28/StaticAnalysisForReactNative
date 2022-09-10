package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
/* compiled from: PG */
/* renamed from: dcon  reason: default package */
/* loaded from: classes5.dex */
public class dcon<K, V> extends dcoo implements dcka<K, V> {
    private static final long serialVersionUID = 0;
    transient Set<K> a;
    transient Collection<Map.Entry<K, V>> b;
    transient Map<K, Collection<V>> c;

    public dcon(dcka<K, V> dckaVar, Object obj) {
        super(dckaVar, obj);
    }

    @Override // defpackage.dcka
    public final boolean D() {
        boolean D;
        synchronized (this.g) {
            D = b().D();
        }
        return D;
    }

    @Override // defpackage.dcka
    public final boolean F(Object obj, Object obj2) {
        boolean F;
        synchronized (this.g) {
            F = b().F(obj, obj2);
        }
        return F;
    }

    @Override // defpackage.dcka
    public final boolean G(Object obj, Object obj2) {
        boolean G;
        synchronized (this.g) {
            G = b().G(obj, obj2);
        }
        return G;
    }

    @Override // defpackage.dcka
    public final boolean H(dcka<? extends K, ? extends V> dckaVar) {
        boolean H;
        synchronized (this.g) {
            H = b().H(dckaVar);
        }
        return H;
    }

    @Override // defpackage.dcka
    public final Collection<Map.Entry<K, V>> I() {
        Collection<Map.Entry<K, V>> collection;
        synchronized (this.g) {
            if (this.b == null) {
                this.b = dcos.e(b().I(), this.g);
            }
            collection = this.b;
        }
        return collection;
    }

    @Override // defpackage.dcka
    public final Set<K> J() {
        Set<K> set;
        Set<K> b;
        synchronized (this.g) {
            if (this.a == null) {
                Set<K> J = b().J();
                Object obj = this.g;
                if (J instanceof SortedSet) {
                    b = dcos.c((SortedSet) J, obj);
                } else {
                    b = dcos.b(J, obj);
                }
                this.a = b;
            }
            set = this.a;
        }
        return set;
    }

    @Override // defpackage.dcka
    public final Collection<V> K() {
        throw null;
    }

    @Override // defpackage.dcka
    public final Map<K, Collection<V>> L() {
        Map<K, Collection<V>> map;
        synchronized (this.g) {
            if (this.c == null) {
                this.c = new dcod(b().L(), this.g);
            }
            map = this.c;
        }
        return map;
    }

    @Override // defpackage.dcka
    public final void M(K k, Iterable<? extends V> iterable) {
        throw null;
    }

    public dcka<K, V> b() {
        return (dcka) this.f;
    }

    @Override // defpackage.dcka
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            equals = b().equals(obj);
        }
        return equals;
    }

    public Collection<V> f(K k) {
        Collection<V> e;
        synchronized (this.g) {
            e = dcos.e(b().f(k), this.g);
        }
        return e;
    }

    @Override // defpackage.dcka
    public final int hashCode() {
        int hashCode;
        synchronized (this.g) {
            hashCode = b().hashCode();
        }
        return hashCode;
    }

    @Override // defpackage.dcka
    public final int l() {
        int l;
        synchronized (this.g) {
            l = b().l();
        }
        return l;
    }

    @Override // defpackage.dcka
    public final boolean m(Object obj) {
        boolean m;
        synchronized (this.g) {
            m = b().m(obj);
        }
        return m;
    }

    @Override // defpackage.dcka
    public final boolean n(K k, V v) {
        boolean n;
        synchronized (this.g) {
            n = b().n(k, v);
        }
        return n;
    }

    @Override // defpackage.dcka
    public final void p() {
        synchronized (this.g) {
            b().p();
        }
    }
}
