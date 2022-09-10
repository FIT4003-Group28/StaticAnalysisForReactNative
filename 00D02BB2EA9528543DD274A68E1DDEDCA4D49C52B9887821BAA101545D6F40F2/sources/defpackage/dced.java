package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dced  reason: default package */
/* loaded from: classes.dex */
public abstract class dced<K, V> extends dbyx<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient dcdn<K, ? extends dccr<V>> b;
    public final transient int c;

    public dced(dcdn<K, ? extends dccr<V>> dcdnVar, int i) {
        this.b = dcdnVar;
        this.c = i;
    }

    public static <K, V> dcdz<K, V> j() {
        return new dcdz<>();
    }

    public static <K, V> dced<K, V> k(dcka<? extends K, ? extends V> dckaVar) {
        if (dckaVar instanceof dced) {
            dced<K, V> dcedVar = (dced) dckaVar;
            if (!dcedVar.o()) {
                return dcedVar;
            }
        }
        return dcde.b(dckaVar);
    }

    @Override // defpackage.dbyn
    public final boolean E(Object obj) {
        return obj != null && super.E(obj);
    }

    @Override // defpackage.dbyn, defpackage.dcka
    @Deprecated
    public final boolean G(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dbyn, defpackage.dcka
    @Deprecated
    public final boolean H(dcka<? extends K, ? extends V> dckaVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dbyn, defpackage.dcka
    public final /* bridge */ /* synthetic */ Map L() {
        return this.b;
    }

    @Override // defpackage.dbyn, defpackage.dcka
    @Deprecated
    public final void M(K k, Iterable<? extends V> iterable) {
        throw null;
    }

    @Override // defpackage.dcka
    public /* bridge */ /* synthetic */ Collection f(Object obj) {
        throw null;
    }

    public abstract dccr<V> h(K k);

    @Override // defpackage.dcka
    public final int l() {
        return this.c;
    }

    @Override // defpackage.dcka
    public final boolean m(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // defpackage.dbyn, defpackage.dcka
    @Deprecated
    public final boolean n(K k, V v) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean o() {
        return this.b.c();
    }

    @Override // defpackage.dcka
    @Deprecated
    public final void p() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dbyn, defpackage.dcka
    /* renamed from: q */
    public final dcep<K> J() {
        return this.b.keySet();
    }

    @Override // defpackage.dbyn
    public final Set<K> r() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.dbyn, defpackage.dcka
    /* renamed from: s */
    public dccr<Map.Entry<K, V>> I() {
        return (dccr) super.I();
    }

    @Override // defpackage.dbyn
    public final /* bridge */ /* synthetic */ Collection t() {
        return new dcec(this);
    }

    @Override // defpackage.dbyn
    public final /* bridge */ /* synthetic */ Collection v() {
        return new dcea(this);
    }

    @Override // defpackage.dbyn
    public final Map<K, Collection<V>> x() {
        throw new AssertionError("should never be called");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.dbyn
    /* renamed from: y */
    public final dcpd<Map.Entry<K, V>> w() {
        return new dcdx(this);
    }

    @Override // defpackage.dbyn, defpackage.dcka
    /* renamed from: z */
    public final dccr<V> K() {
        return (dccr) super.K();
    }
}
