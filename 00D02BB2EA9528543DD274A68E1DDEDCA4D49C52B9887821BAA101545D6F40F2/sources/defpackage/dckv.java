package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dckv  reason: default package */
/* loaded from: classes5.dex */
public class dckv<K, V1, V2> extends dbyn<K, V2> {
    final dcka<K, V1> a;
    final dcjj<? super K, ? super V1, V2> b;

    public dckv(dcka<K, V1> dckaVar, dcjj<? super K, ? super V1, V2> dcjjVar) {
        dbsk.s(dckaVar);
        this.a = dckaVar;
        this.b = dcjjVar;
    }

    @Override // defpackage.dbyn, defpackage.dcka
    public final boolean D() {
        return this.a.D();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dbyn, defpackage.dcka
    public final boolean G(Object obj, Object obj2) {
        return f(obj).remove(obj2);
    }

    @Override // defpackage.dbyn, defpackage.dcka
    public final boolean H(dcka<? extends K, ? extends V2> dckaVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dbyn, defpackage.dcka
    public final void M(K k, Iterable<? extends V2> iterable) {
        throw null;
    }

    public Collection<V2> b(K k, Collection<V1> collection) {
        dbrn v = dcjz.v(this.b, k);
        if (collection instanceof List) {
            return dchl.k((List) collection, v);
        }
        return dbze.d(collection, v);
    }

    @Override // defpackage.dcka
    public Collection<V2> f(K k) {
        return b(k, this.a.f(k));
    }

    @Override // defpackage.dcka
    public final int l() {
        return this.a.l();
    }

    @Override // defpackage.dcka
    public final boolean m(Object obj) {
        return this.a.m(obj);
    }

    @Override // defpackage.dbyn, defpackage.dcka
    public final boolean n(K k, V2 v2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dcka
    public final void p() {
        this.a.p();
    }

    @Override // defpackage.dbyn
    public final Set<K> r() {
        return this.a.J();
    }

    @Override // defpackage.dbyn
    public final Collection<V2> t() {
        return dbze.d(this.a.I(), new dcix(this.b));
    }

    @Override // defpackage.dbyn
    public final Collection<Map.Entry<K, V2>> v() {
        return new dbyk(this);
    }

    @Override // defpackage.dbyn
    public final Iterator<Map.Entry<K, V2>> w() {
        return dcgh.l(this.a.I().iterator(), dcjz.w(this.b));
    }

    @Override // defpackage.dbyn
    public final Map<K, Collection<V2>> x() {
        return dcjz.t(this.a.L(), new dcku(this));
    }
}
