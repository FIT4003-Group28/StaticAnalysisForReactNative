package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cqqe  reason: default package */
/* loaded from: classes.dex */
public final class cqqe<K, V> {
    public static final ReferenceQueue<Object> a = new ReferenceQueue<>();
    private static final Thread c;
    public final Map<cqqb<K>, V> b = new aif();
    private final cqqc<K> d = new cqqc<>();

    static {
        Thread thread = new Thread(new cqqa(), "weak-identity-map-cleanup-thread");
        c = thread;
        thread.start();
    }

    public static boolean a(cqqb<?> cqqbVar, cqqb<?> cqqbVar2) {
        Object obj = cqqbVar.get();
        return obj != null && obj == cqqbVar2.get();
    }

    public final void b(K k, V v) {
        synchronized (this.b) {
            Map<cqqb<K>, V> map = this.b;
            map.put(new cqqd(k, map), v);
        }
    }

    @dzsi
    public final V c(@dzsi K k) {
        V v;
        if (k == null) {
            return null;
        }
        synchronized (this.b) {
            Map<cqqb<K>, V> map = this.b;
            cqqc<K> cqqcVar = this.d;
            cqqcVar.a = k;
            v = map.get(cqqcVar);
            this.d.a();
        }
        return v;
    }

    public final void d() {
        synchronized (this.b) {
            this.b.clear();
        }
    }
}
