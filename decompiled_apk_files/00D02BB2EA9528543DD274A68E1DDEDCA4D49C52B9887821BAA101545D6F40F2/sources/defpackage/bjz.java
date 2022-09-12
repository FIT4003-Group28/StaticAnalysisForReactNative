package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: bjz  reason: default package */
/* loaded from: classes3.dex */
public final class bjz<T> {
    public static final Executor a = Executors.newCachedThreadPool();
    private final Set<bjt<T>> c = new LinkedHashSet(1);
    private final Set<bjt<Throwable>> d = new LinkedHashSet(1);
    private final Handler e = new Handler(Looper.getMainLooper());
    public volatile bjw<T> b = null;

    public bjz(Callable<bjw<T>> callable) {
        a.execute(new bjy(this, callable));
    }

    public final void a(bjw<T> bjwVar) {
        if (this.b == null) {
            this.b = bjwVar;
            this.e.post(new bjx(this));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public final synchronized void b(T t) {
        ArrayList arrayList = new ArrayList(this.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bjt) arrayList.get(i)).a(t);
        }
    }

    public final synchronized void c(Throwable th) {
        ArrayList arrayList = new ArrayList(this.d);
        if (arrayList.isEmpty()) {
            bpo.b("Lottie encountered an error but no failure listener was added:");
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bjt) arrayList.get(i)).a(th);
        }
    }

    public final synchronized void d(bjt<Throwable> bjtVar) {
        if (this.b != null && this.b.b != null) {
            bjtVar.a(this.b.b);
        }
        this.d.add(bjtVar);
    }

    public final synchronized void e(bjt<T> bjtVar) {
        if (this.b != null && this.b.a != null) {
            bjtVar.a(this.b.a);
        }
        this.c.add(bjtVar);
    }

    public final synchronized void f(bjt<Throwable> bjtVar) {
        this.d.remove(bjtVar);
    }

    public final synchronized void g(bjt<T> bjtVar) {
        this.c.remove(bjtVar);
    }
}
