package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dcdd  reason: default package */
/* loaded from: classes.dex */
public final class dcdd<K, V> extends dcdz<K, V> {
    public final dcde<K, V> a() {
        return (dcde) super.f();
    }

    public final void b(K k, V v) {
        super.h(k, v);
    }

    public final void c(K k, Iterable<? extends V> iterable) {
        super.g(k, iterable);
    }

    public final void d(K k, V... vArr) {
        g(k, Arrays.asList(vArr));
    }
}
