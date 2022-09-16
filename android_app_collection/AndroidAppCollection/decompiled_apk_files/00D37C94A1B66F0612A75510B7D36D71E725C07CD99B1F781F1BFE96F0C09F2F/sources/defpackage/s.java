package defpackage;

import android.arch.lifecycle.LiveData$LifecycleBoundObserver;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: s  reason: default package */
/* loaded from: classes4.dex */
public class s {
    static final Object a = new Object();
    final Object b;
    int c;
    volatile Object d;
    private acu e;
    private boolean f;
    private volatile Object g;
    private int h;
    private boolean i;
    private boolean j;
    private final Runnable k;

    public s() {
        this.b = new Object();
        this.e = new acu();
        this.c = 0;
        Object obj = a;
        this.d = obj;
        this.k = new p(this);
        this.g = obj;
        this.h = -1;
    }

    static void b(String str) {
        if (acl.a().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void n(r rVar) {
        if (!rVar.d) {
            return;
        }
        if (!rVar.jz()) {
            rVar.d(false);
            return;
        }
        int i = rVar.e;
        int i2 = this.h;
        if (i >= i2) {
            return;
        }
        rVar.e = i2;
        rVar.c.a(this.g);
    }

    public Object a() {
        Object obj = this.g;
        if (obj != a) {
            return obj;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0024 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:7:0x000e, B:19:0x0024, B:21:0x002a), top: B:29:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r5) {
        /*
            r4 = this;
            int r0 = r4.c
            int r5 = r5 + r0
            r4.c = r5
            boolean r5 = r4.f
            if (r5 == 0) goto La
            return
        La:
            r5 = 1
            r4.f = r5
        Ld:
            r1 = 0
            int r2 = r4.c     // Catch: java.lang.Throwable -> L32
            if (r0 == r2) goto L2f
            if (r0 != 0) goto L1a
            if (r2 <= 0) goto L19
            r0 = 0
            r3 = 1
            goto L1b
        L19:
            r0 = 0
        L1a:
            r3 = 0
        L1b:
            if (r0 <= 0) goto L21
            if (r2 != 0) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            if (r3 == 0) goto L28
            r4.g()     // Catch: java.lang.Throwable -> L32
            goto L2d
        L28:
            if (r0 == 0) goto L2d
            r4.h()     // Catch: java.lang.Throwable -> L32
        L2d:
            r0 = r2
            goto Ld
        L2f:
            r4.f = r1
            return
        L32:
            r5 = move-exception
            r4.f = r1
            goto L37
        L36:
            throw r5
        L37:
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s.c(int):void");
    }

    public void d(r rVar) {
        if (this.i) {
            this.j = true;
            return;
        }
        this.i = true;
        while (true) {
            this.j = false;
            if (rVar != null) {
                n(rVar);
            } else {
                acr f = this.e.f();
                while (f.hasNext()) {
                    n((r) ((acq) f.next()).b);
                    if (this.j) {
                        break;
                    }
                }
            }
            if (!this.j) {
                this.i = false;
                return;
            }
            rVar = null;
        }
    }

    public void e(apy apyVar, u uVar) {
        b("observe");
        if (apyVar.getLifecycle().a() == apt.DESTROYED) {
            return;
        }
        LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData$LifecycleBoundObserver(this, apyVar, uVar);
        r rVar = (r) this.e.b(uVar, liveData$LifecycleBoundObserver);
        if (rVar != null && !rVar.c(apyVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (rVar != null) {
            return;
        }
        apyVar.getLifecycle().c(liveData$LifecycleBoundObserver);
    }

    public void f(u uVar) {
        b("observeForever");
        q qVar = new q(this, uVar);
        r rVar = (r) this.e.b(uVar, qVar);
        if (!(rVar instanceof LiveData$LifecycleBoundObserver)) {
            if (rVar != null) {
                return;
            }
            qVar.d(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    protected void g() {
    }

    protected void h() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(Object obj) {
        Object obj2;
        Object obj3;
        synchronized (this.b) {
            obj2 = this.d;
            obj3 = a;
            this.d = obj;
        }
        if (obj2 != obj3) {
            return;
        }
        acl a2 = acl.a();
        Runnable runnable = this.k;
        acx acxVar = a2.b;
        acm acmVar = (acm) acxVar;
        if (acmVar.c == null) {
            synchronized (acmVar.a) {
                if (((acm) acxVar).c == null) {
                    ((acm) acxVar).c = acm.a(Looper.getMainLooper());
                }
            }
        }
        acmVar.c.post(runnable);
    }

    public void j(u uVar) {
        b("removeObserver");
        r rVar = (r) this.e.c(uVar);
        if (rVar == null) {
            return;
        }
        rVar.b();
        rVar.d(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k(Object obj) {
        b("setValue");
        this.h++;
        this.g = obj;
        d(null);
    }

    public boolean l() {
        return this.c > 0;
    }

    public s(Object obj) {
        this.b = new Object();
        this.e = new acu();
        this.c = 0;
        this.d = a;
        this.k = new p(this);
        this.g = obj;
        this.h = 0;
    }
}
