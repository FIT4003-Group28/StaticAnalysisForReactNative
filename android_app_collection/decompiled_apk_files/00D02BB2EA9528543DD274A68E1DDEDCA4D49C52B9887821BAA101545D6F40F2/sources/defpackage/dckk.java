package defpackage;

import java.util.Collection;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dckk  reason: default package */
/* loaded from: classes5.dex */
public abstract class dckk<K0> {
    public abstract <K extends K0, V> Map<K, Collection<V>> a();

    public final dckg<K0, Object> b() {
        dbzb.d(2, "expectedValuesPerKey");
        return new dckh(this);
    }

    public final dckl<K0, Object> c() {
        dbzb.d(2, "expectedValuesPerKey");
        return new dcki(this);
    }
}
