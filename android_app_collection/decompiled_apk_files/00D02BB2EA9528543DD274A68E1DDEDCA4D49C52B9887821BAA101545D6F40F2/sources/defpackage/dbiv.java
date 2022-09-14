package defpackage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
/* compiled from: PG */
/* renamed from: dbiv  reason: default package */
/* loaded from: classes5.dex */
public final class dbiv<T> implements dbit {
    public final Object a = new Object();
    public final Map<Object, WeakReference<T>> b = new HashMap();
    public final Map<Object, CompletableFuture<T>> c = new HashMap();

    public final CompletableFuture<T> a(Object obj) {
        synchronized (this.a) {
            WeakReference<T> weakReference = this.b.get(obj);
            if (weakReference != null) {
                T t = weakReference.get();
                if (t != null) {
                    return CompletableFuture.completedFuture(t);
                }
                this.b.remove(obj);
            }
            return this.c.get(obj);
        }
    }

    @Override // defpackage.dbit
    public final void b() {
        synchronized (this.a) {
            Iterator<Map.Entry<Object, CompletableFuture<T>>> it = this.c.entrySet().iterator();
            while (it.hasNext()) {
                it.remove();
                CompletableFuture<T> value = it.next().getValue();
                if (!value.isDone()) {
                    value.cancel(true);
                }
            }
            this.b.clear();
        }
    }

    @Override // defpackage.dbit
    public final void c() {
    }

    public final void d(final Object obj, final CompletableFuture<T> completableFuture) {
        dbjb.d(completableFuture, "Parameter 'futureResource' was null.");
        if (completableFuture.isDone()) {
            if (completableFuture.isCompletedExceptionally()) {
                return;
            }
            T now = completableFuture.getNow(null);
            dbjb.c(now);
            synchronized (this.a) {
                this.b.put(obj, new WeakReference<>(now));
                this.c.remove(obj);
            }
            return;
        }
        synchronized (this.a) {
            this.c.put(obj, completableFuture);
            this.b.remove(obj);
        }
        completableFuture.handle((BiFunction) new BiFunction(this, obj, completableFuture) { // from class: dbiu
            private final dbiv a;
            private final Object b;
            private final CompletableFuture c;

            {
                this.a = this;
                this.b = obj;
                this.c = completableFuture;
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj2, Object obj3) {
                dbiv dbivVar = this.a;
                Object obj4 = this.b;
                CompletableFuture completableFuture2 = this.c;
                Throwable th = (Throwable) obj3;
                synchronized (dbivVar) {
                    synchronized (dbivVar.a) {
                        if (((CompletableFuture) dbivVar.c.get(obj4)) == completableFuture2) {
                            dbivVar.c.remove(obj4);
                            if (th == null) {
                                dbivVar.b.put(obj4, new WeakReference(obj2));
                            }
                        }
                    }
                }
                return null;
            }
        });
    }
}
