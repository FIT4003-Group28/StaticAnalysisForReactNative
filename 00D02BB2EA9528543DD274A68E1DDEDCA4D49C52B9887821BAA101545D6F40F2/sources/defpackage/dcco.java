package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: dcco  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcco<K, V> extends dcdn<K, V> implements dbyy<K, V> {
    public static <K, V> dcco<K, V> a(K k, V v, K k2, V v2) {
        dbzb.a(k, v);
        dbzb.a(k2, v2);
        return new dcmh(new Object[]{k, v, k2, v2}, 2);
    }

    public static <K, V> dccm<K, V> b() {
        return new dccm<>();
    }

    public abstract dcco<V, K> e();

    @Override // defpackage.dcdn, java.util.Map
    /* renamed from: f */
    public final dcep<V> values() {
        return e().keySet();
    }

    @Override // defpackage.dcdn
    public final /* bridge */ /* synthetic */ dccr g() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.dbyy
    public final /* bridge */ /* synthetic */ dbyy i() {
        throw null;
    }

    @Override // defpackage.dbyy
    public final /* bridge */ /* synthetic */ Set j() {
        throw null;
    }

    @Override // defpackage.dcdn
    Object writeReplace() {
        return new dccn(this);
    }
}
