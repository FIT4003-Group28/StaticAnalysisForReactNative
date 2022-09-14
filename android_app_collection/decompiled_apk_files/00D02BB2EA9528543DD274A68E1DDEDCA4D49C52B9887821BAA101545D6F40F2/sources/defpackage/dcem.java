package defpackage;

import java.io.Serializable;
import java.lang.Comparable;
/* compiled from: PG */
/* renamed from: dcem  reason: default package */
/* loaded from: classes5.dex */
public final class dcem<K extends Comparable, V> implements Serializable, dcmb {
    public static final dcem<Comparable<?>, Object> a = new dcem<>(dcdc.e(), dcdc.e());
    private static final long serialVersionUID = 0;
    public final transient dcdc<dclz<K>> b;
    public final transient dcdc<V> c;

    public dcem(dcdc<dclz<K>> dcdcVar, dcdc<V> dcdcVar2) {
        this.b = dcdcVar;
        this.c = dcdcVar2;
    }

    public static <K extends Comparable<?>, V> dcek<K, V> a() {
        return new dcek<>();
    }

    @Override // defpackage.dcmb
    @Deprecated
    public final void b(dclz<K> dclzVar, V v) {
        throw null;
    }

    @Override // defpackage.dcmb
    @Deprecated
    public final void c(dclz<K> dclzVar, V v) {
        throw null;
    }

    @Override // defpackage.dcmb
    /* renamed from: d */
    public final dcdn<dclz<K>, V> e() {
        return this.b.isEmpty() ? (dcdn<dclz<K>, V>) dcmn.a : new dcey(new dcms(this.b, dclz.c()), this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dcmb) {
            return e().equals(((dcmb) obj).e());
        }
        return false;
    }

    public final int hashCode() {
        return e().hashCode();
    }

    public final String toString() {
        return dcjz.E(e());
    }

    Object writeReplace() {
        return new dcel(e());
    }
}
