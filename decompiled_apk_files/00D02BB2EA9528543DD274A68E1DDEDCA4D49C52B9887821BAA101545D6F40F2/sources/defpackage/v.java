package defpackage;

import android.arch.lifecycle.LiveData$LifecycleBoundObserver;
import android.os.Looper;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: v  reason: default package */
/* loaded from: classes.dex */
public abstract class v<T> {
    static final Object b = new Object();
    final Object a;
    int c;
    public boolean d;
    volatile Object e;
    public int f;
    private aho<aa<? super T>, u> g;
    private volatile Object h;
    private boolean i;
    private boolean j;
    private final Runnable k;

    public v() {
        this.a = new Object();
        this.g = new aho<>();
        this.c = 0;
        Object obj = b;
        this.e = obj;
        this.k = new s(this);
        this.h = obj;
        this.f = -1;
    }

    static void l(String str) {
        if (ahd.a().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void m(u uVar) {
        if (!uVar.d) {
            return;
        }
        if (!uVar.a()) {
            uVar.d(false);
            return;
        }
        int i = uVar.e;
        int i2 = this.f;
        if (i >= i2) {
            return;
        }
        uVar.e = i2;
        uVar.c.m(this.h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(u uVar) {
        if (this.i) {
            this.j = true;
            return;
        }
        this.i = true;
        while (true) {
            this.j = false;
            if (uVar != null) {
                m(uVar);
            } else {
                ahl f = this.g.f();
                while (f.hasNext()) {
                    m((u) ((ahk) f.next()).b);
                    if (this.j) {
                        break;
                    }
                }
            }
            if (!this.j) {
                this.i = false;
                return;
            }
            uVar = null;
        }
    }

    public final void b(m mVar, aa<? super T> aaVar) {
        l("observe");
        if (mVar.Nh().c() == j.DESTROYED) {
            return;
        }
        LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData$LifecycleBoundObserver(this, mVar, aaVar);
        u d = this.g.d(aaVar, liveData$LifecycleBoundObserver);
        if (d != null && !d.b(mVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (d != null) {
            return;
        }
        mVar.Nh().a(liveData$LifecycleBoundObserver);
    }

    public final void c(aa<? super T> aaVar) {
        l("observeForever");
        t tVar = new t(this, aaVar);
        u d = this.g.d(aaVar, tVar);
        if (!(d instanceof LiveData$LifecycleBoundObserver)) {
            if (d != null) {
                return;
            }
            tVar.d(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void d(aa<? super T> aaVar) {
        l("removeObserver");
        u b2 = this.g.b(aaVar);
        if (b2 == null) {
            return;
        }
        b2.c();
        b2.d(false);
    }

    public final void e(m mVar) {
        l("removeObservers");
        Iterator<Map.Entry<aa<? super T>, u>> it = this.g.iterator();
        while (it.hasNext()) {
            Map.Entry<aa<? super T>, u> next = it.next();
            if (next.getValue().b(mVar)) {
                d(next.getKey());
            }
        }
    }

    public void f(T t) {
        Object obj;
        Object obj2;
        synchronized (this.a) {
            obj = this.e;
            obj2 = b;
            this.e = t;
        }
        if (obj != obj2) {
            return;
        }
        ahd a = ahd.a();
        Runnable runnable = this.k;
        ahg ahgVar = a.a;
        ahf ahfVar = (ahf) ahgVar;
        if (ahfVar.c == null) {
            synchronized (ahfVar.a) {
                if (((ahf) ahgVar).c == null) {
                    ((ahf) ahgVar).c = ahf.a(Looper.getMainLooper());
                }
            }
        }
        ahfVar.c.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(T t) {
        l("setValue");
        this.f++;
        this.h = t;
        a(null);
    }

    public final T h() {
        T t = (T) this.h;
        if (t != b) {
            return t;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j() {
    }

    public final boolean k() {
        return this.c > 0;
    }

    public v(T t) {
        this.a = new Object();
        this.g = new aho<>();
        this.c = 0;
        this.e = b;
        this.k = new s(this);
        this.h = t;
        this.f = 0;
    }
}
