package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcbp  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcbp<K, V> extends dcbq implements dcka<K, V> {
    @Override // defpackage.dcka
    public final boolean D() {
        return b().D();
    }

    @Override // defpackage.dcka
    public final boolean F(Object obj, Object obj2) {
        return b().F(obj, obj2);
    }

    @Override // defpackage.dcka
    public boolean G(Object obj, Object obj2) {
        return b().G(obj, obj2);
    }

    @Override // defpackage.dcka
    public boolean H(dcka<? extends K, ? extends V> dckaVar) {
        return b().H(dckaVar);
    }

    @Override // defpackage.dcka
    public Collection<Map.Entry<K, V>> I() {
        return b().I();
    }

    @Override // defpackage.dcka
    public Set<K> J() {
        return b().J();
    }

    @Override // defpackage.dcka
    public Collection<V> K() {
        throw null;
    }

    @Override // defpackage.dcka
    public Map<K, Collection<V>> L() {
        return b().L();
    }

    @Override // defpackage.dcka
    public void M(K k, Iterable<? extends V> iterable) {
        throw null;
    }

    @Override // defpackage.dcbq
    protected /* bridge */ /* synthetic */ Object SC() {
        throw null;
    }

    protected abstract dcka<K, V> b();

    @Override // defpackage.dcka
    public final boolean equals(Object obj) {
        return obj == this || b().equals(obj);
    }

    public Collection<V> f(K k) {
        throw null;
    }

    @Override // defpackage.dcka
    public final int hashCode() {
        return b().hashCode();
    }

    @Override // defpackage.dcka
    public final int l() {
        return b().l();
    }

    @Override // defpackage.dcka
    public final boolean m(Object obj) {
        return b().m(obj);
    }

    @Override // defpackage.dcka
    public boolean n(K k, V v) {
        return b().n(k, v);
    }

    @Override // defpackage.dcka
    public void p() {
        b().p();
    }
}
