package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: crzd  reason: default package */
/* loaded from: classes5.dex */
public final class crzd<T> {
    private final HashMap<T, Executor> a = new HashMap<>();
    private final WeakHashMap<T, Executor> b = new WeakHashMap<>();

    public final synchronized void a(T t, Executor executor) {
        this.a.put(t, executor);
    }

    public final synchronized void b(T t, Executor executor) {
        this.b.put(t, executor);
    }

    public final synchronized void c(T t) {
        this.a.remove(t);
        this.b.remove(t);
    }

    public final void d(final dbsz<T> dbszVar) {
        dcdn b;
        synchronized (this) {
            b = new dcdg().c(this.a).c(this.b).b();
        }
        dcpd it = b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable(dbszVar, key) { // from class: crzc
                private final dbsz a;
                private final Object b;

                {
                    this.a = dbszVar;
                    this.b = key;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.NU(this.b);
                }
            });
        }
    }

    public final synchronized int e() {
        return this.a.size() + this.b.size();
    }

    public final synchronized void f() {
        this.a.clear();
        this.b.clear();
    }
}
