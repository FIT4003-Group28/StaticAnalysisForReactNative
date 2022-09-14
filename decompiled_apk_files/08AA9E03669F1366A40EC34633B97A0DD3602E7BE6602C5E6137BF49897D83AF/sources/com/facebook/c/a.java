package com.facebook.c;

import android.util.Pair;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
/* compiled from: AbstractDataSource.java */
/* loaded from: classes.dex */
public abstract class a<T> implements c<T> {

    /* renamed from: c  reason: collision with root package name */
    private T f2234c = null;

    /* renamed from: d  reason: collision with root package name */
    private Throwable f2235d = null;
    private float e = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2233b = false;

    /* renamed from: a  reason: collision with root package name */
    private EnumC0044a f2232a = EnumC0044a.IN_PROGRESS;
    private final ConcurrentLinkedQueue<Pair<e<T>, Executor>> f = new ConcurrentLinkedQueue<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractDataSource.java */
    /* renamed from: com.facebook.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0044a {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    protected void a(T t) {
    }

    public synchronized boolean a() {
        return this.f2233b;
    }

    @Override // com.facebook.c.c
    public synchronized boolean b() {
        return this.f2232a != EnumC0044a.IN_PROGRESS;
    }

    @Override // com.facebook.c.c
    public synchronized boolean c() {
        return this.f2234c != null;
    }

    @Override // com.facebook.c.c
    public synchronized T d() {
        return this.f2234c;
    }

    public synchronized boolean e() {
        return this.f2232a == EnumC0044a.FAILURE;
    }

    @Override // com.facebook.c.c
    public synchronized Throwable f() {
        return this.f2235d;
    }

    @Override // com.facebook.c.c
    public synchronized float g() {
        return this.e;
    }

    @Override // com.facebook.c.c
    public boolean h() {
        synchronized (this) {
            if (this.f2233b) {
                return false;
            }
            this.f2233b = true;
            T t = this.f2234c;
            this.f2234c = null;
            if (t != null) {
                a((a<T>) t);
            }
            if (!b()) {
                j();
            }
            synchronized (this) {
                this.f.clear();
            }
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.c.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.facebook.c.e<T> r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            com.facebook.common.d.i.a(r3)
            com.facebook.common.d.i.a(r4)
            monitor-enter(r2)
            boolean r0 = r2.f2233b     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto Ld
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            return
        Ld:
            com.facebook.c.a$a r0 = r2.f2232a     // Catch: java.lang.Throwable -> L41
            com.facebook.c.a$a r1 = com.facebook.c.a.EnumC0044a.IN_PROGRESS     // Catch: java.lang.Throwable -> L41
            if (r0 != r1) goto L1c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.c.e<T>, java.util.concurrent.Executor>> r0 = r2.f     // Catch: java.lang.Throwable -> L41
            android.util.Pair r1 = android.util.Pair.create(r3, r4)     // Catch: java.lang.Throwable -> L41
            r0.add(r1)     // Catch: java.lang.Throwable -> L41
        L1c:
            boolean r0 = r2.c()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L31
            boolean r0 = r2.b()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L31
            boolean r0 = r2.k()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L2f
            goto L31
        L2f:
            r0 = 0
            goto L32
        L31:
            r0 = 1
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L40
            boolean r0 = r2.e()
            boolean r1 = r2.k()
            r2.a(r3, r4, r0, r1)
        L40:
            return
        L41:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.c.a.a(com.facebook.c.e, java.util.concurrent.Executor):void");
    }

    private void j() {
        boolean e = e();
        boolean k = k();
        Iterator<Pair<e<T>, Executor>> it = this.f.iterator();
        while (it.hasNext()) {
            Pair<e<T>, Executor> next = it.next();
            a((e) next.first, (Executor) next.second, e, k);
        }
    }

    private void a(final e<T> eVar, Executor executor, final boolean z, final boolean z2) {
        executor.execute(new Runnable() { // from class: com.facebook.c.a.1
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    eVar.b(a.this);
                } else if (z2) {
                    eVar.c(a.this);
                } else {
                    eVar.a(a.this);
                }
            }
        });
    }

    private synchronized boolean k() {
        boolean z;
        if (a()) {
            if (!b()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(T t, boolean z) {
        boolean b2 = b(t, z);
        if (b2) {
            j();
        }
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(Throwable th) {
        boolean b2 = b(th);
        if (b2) {
            j();
        }
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(float f) {
        boolean b2 = b(f);
        if (b2) {
            i();
        }
        return b2;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0039 -> B:32:0x003a). Please submit an issue!!! */
    private boolean b(T t, boolean z) {
        T t2;
        T t3 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (!this.f2233b && this.f2232a == EnumC0044a.IN_PROGRESS) {
                            if (z) {
                                this.f2232a = EnumC0044a.SUCCESS;
                                this.e = 1.0f;
                            }
                            if (this.f2234c != t) {
                                T t4 = this.f2234c;
                                try {
                                    this.f2234c = t;
                                    t2 = t4;
                                } catch (Throwable th) {
                                    th = th;
                                    t3 = t4;
                                    throw th;
                                }
                            } else {
                                t2 = null;
                            }
                            return true;
                        }
                        if (t != null) {
                            a((a<T>) t);
                        }
                        return false;
                    } catch (Throwable th2) {
                        t3 = t;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } finally {
            if (t3 != null) {
                a((a<T>) t3);
            }
        }
    }

    private synchronized boolean b(Throwable th) {
        if (!this.f2233b && this.f2232a == EnumC0044a.IN_PROGRESS) {
            this.f2232a = EnumC0044a.FAILURE;
            this.f2235d = th;
            return true;
        }
        return false;
    }

    private synchronized boolean b(float f) {
        if (!this.f2233b && this.f2232a == EnumC0044a.IN_PROGRESS) {
            if (f < this.e) {
                return false;
            }
            this.e = f;
            return true;
        }
        return false;
    }

    protected void i() {
        Iterator<Pair<e<T>, Executor>> it = this.f.iterator();
        while (it.hasNext()) {
            Pair<e<T>, Executor> next = it.next();
            final e eVar = (e) next.first;
            ((Executor) next.second).execute(new Runnable() { // from class: com.facebook.c.a.2
                @Override // java.lang.Runnable
                public void run() {
                    eVar.d(a.this);
                }
            });
        }
    }
}
