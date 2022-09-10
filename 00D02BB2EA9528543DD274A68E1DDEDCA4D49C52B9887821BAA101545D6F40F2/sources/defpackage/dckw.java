package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: dckw  reason: default package */
/* loaded from: classes5.dex */
public final class dckw<K, V> extends dcky<K, V> implements dcha<K, V> {
    private static final long serialVersionUID = 0;

    public dckw(dcha<K, V> dchaVar) {
        super(dchaVar);
    }

    @Override // defpackage.dcky, defpackage.dcbp, defpackage.dcbq
    public final /* bridge */ /* synthetic */ Object SC() {
        return this.a;
    }

    @Override // defpackage.dcky, defpackage.dcbp
    public final /* bridge */ /* synthetic */ dcka b() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dcha, dcka<K, V>] */
    @Override // defpackage.dcky, defpackage.dcbp, defpackage.dcka
    /* renamed from: c */
    public final List<V> f(K k) {
        return Collections.unmodifiableList(this.a.c(k));
    }

    @Override // defpackage.dcha
    public final List<V> d(Object obj) {
        throw null;
    }

    @Override // defpackage.dcha
    public final List<V> e(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }
}
