package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: chqx  reason: default package */
/* loaded from: classes4.dex */
final class chqx<K, T> {
    private final HashMap<K, bvqg<T>> a = new HashMap<>();
    private final dbrn<T, K> b;

    public chqx(dbrn<T, K> dbrnVar) {
        this.b = dbrnVar;
    }

    public final synchronized void a(T t, bvqg<T> bvqgVar) {
        this.a.put(this.b.a(t), bvqgVar);
    }

    public final synchronized void b(T t) {
        K a;
        bvqg<T> bvqgVar;
        if (this.a.isEmpty() || (bvqgVar = this.a.get((a = this.b.a(t)))) == null) {
            return;
        }
        bvqgVar.NU(t);
        this.a.remove(a);
    }
}
