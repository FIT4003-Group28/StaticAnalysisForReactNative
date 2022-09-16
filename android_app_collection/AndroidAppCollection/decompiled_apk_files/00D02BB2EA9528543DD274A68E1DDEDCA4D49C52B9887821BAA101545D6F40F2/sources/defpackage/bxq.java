package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bxq  reason: default package */
/* loaded from: classes.dex */
final class bxq<K, V> {
    final K a;
    public List<V> b;
    bxq<K, V> c;
    bxq<K, V> d;

    bxq() {
        this(null);
    }

    public bxq(K k) {
        this.d = this;
        this.c = this;
        this.a = k;
    }

    public final V a() {
        int b = b();
        if (b > 0) {
            return this.b.remove(b - 1);
        }
        return null;
    }

    public final int b() {
        List<V> list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
