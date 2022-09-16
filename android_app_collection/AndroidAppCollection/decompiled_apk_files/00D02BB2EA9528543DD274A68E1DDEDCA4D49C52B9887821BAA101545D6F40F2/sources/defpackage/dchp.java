package defpackage;

import defpackage.dchv;
/* compiled from: PG */
/* renamed from: dchp  reason: default package */
/* loaded from: classes.dex */
abstract class dchp<K, V, E extends dchv<K, V, E>> implements dchv<K, V, E> {
    final K a;
    final int b;
    final E c;

    public dchp(K k, int i, E e) {
        this.a = k;
        this.b = i;
        this.c = e;
    }

    @Override // defpackage.dchv
    public final K a() {
        return this.a;
    }

    @Override // defpackage.dchv
    public final int b() {
        return this.b;
    }

    @Override // defpackage.dchv
    public final E c() {
        return this.c;
    }
}
