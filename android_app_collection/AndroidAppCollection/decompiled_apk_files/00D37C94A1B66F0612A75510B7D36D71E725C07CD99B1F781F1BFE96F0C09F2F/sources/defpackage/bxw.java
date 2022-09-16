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
/* renamed from: bxw  reason: default package */
/* loaded from: classes2.dex */
public final class bxw {
    public static final Executor a = Executors.newCachedThreadPool();
    public volatile bxt b;
    private final Set c;
    private final Set d;
    private final Handler e;

    public bxw(Callable callable) {
        this(callable, false);
    }

    public final synchronized void a(Throwable th) {
        ArrayList arrayList = new ArrayList(this.d);
        if (arrayList.isEmpty()) {
            cda.b("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bxp) arrayList.get(i)).a(th);
        }
    }

    public final synchronized void b(Object obj) {
        ArrayList arrayList = new ArrayList(this.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bxp) arrayList.get(i)).a(obj);
        }
    }

    public final void c(bxt bxtVar) {
        if (this.b == null) {
            this.b = bxtVar;
            this.e.post(new bxu(this));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public final synchronized void d(bxp bxpVar) {
        if (this.b != null && this.b.b != null) {
            bxpVar.a(this.b.b);
        }
        this.d.add(bxpVar);
    }

    public final synchronized void e(bxp bxpVar) {
        if (this.b != null && this.b.a != null) {
            bxpVar.a(this.b.a);
        }
        this.c.add(bxpVar);
    }

    public final synchronized void f(bxp bxpVar) {
        this.d.remove(bxpVar);
    }

    public final synchronized void g(bxp bxpVar) {
        this.c.remove(bxpVar);
    }

    public bxw(Callable callable, boolean z) {
        this.c = new LinkedHashSet(1);
        this.d = new LinkedHashSet(1);
        this.e = new Handler(Looper.getMainLooper());
        this.b = null;
        if (z) {
            try {
                c((bxt) callable.call());
                return;
            } catch (Throwable th) {
                c(new bxt(th));
                return;
            }
        }
        a.execute(new bxv(this, callable));
    }
}
