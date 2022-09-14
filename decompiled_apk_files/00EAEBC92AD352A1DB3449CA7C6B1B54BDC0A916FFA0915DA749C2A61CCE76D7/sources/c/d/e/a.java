package c.d.e;

import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class a<T> implements c.d.e.c<T> {

    /* renamed from: c  reason: collision with root package name */
    private T f2880c = null;

    /* renamed from: d  reason: collision with root package name */
    private Throwable f2881d = null;

    /* renamed from: e  reason: collision with root package name */
    private float f2882e = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2879b = false;

    /* renamed from: a  reason: collision with root package name */
    private c f2878a = c.IN_PROGRESS;

    /* renamed from: f  reason: collision with root package name */
    private final ConcurrentLinkedQueue<Pair<e<T>, Executor>> f2883f = new ConcurrentLinkedQueue<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c.d.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0073a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f2884b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f2885c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f2886d;

        RunnableC0073a(boolean z, e eVar, boolean z2) {
            this.f2884b = z;
            this.f2885c = eVar;
            this.f2886d = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2884b) {
                this.f2885c.c(a.this);
            } else if (this.f2886d) {
                this.f2885c.a(a.this);
            } else {
                this.f2885c.b(a.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f2888b;

        b(e eVar) {
            this.f2888b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2888b.d(a.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum c {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    private void a(e<T> eVar, Executor executor, boolean z, boolean z2) {
        executor.execute(new RunnableC0073a(z, eVar, z2));
    }

    private synchronized boolean b(float f2) {
        if (!this.f2879b && this.f2878a == c.IN_PROGRESS) {
            if (f2 < this.f2882e) {
                return false;
            }
            this.f2882e = f2;
            return true;
        }
        return false;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0039 -> B:32:0x003a). Please submit an issue!!! */
    private boolean b(T t, boolean z) {
        T t2;
        T t3 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (!this.f2879b && this.f2878a == c.IN_PROGRESS) {
                            if (z) {
                                this.f2878a = c.SUCCESS;
                                this.f2882e = 1.0f;
                            }
                            if (this.f2880c != t) {
                                T t4 = this.f2880c;
                                try {
                                    this.f2880c = t;
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
        boolean z;
        if (!this.f2879b && this.f2878a == c.IN_PROGRESS) {
            this.f2878a = c.FAILURE;
            this.f2881d = th;
            z = true;
        }
        z = false;
        return z;
    }

    private void j() {
        boolean g2 = g();
        boolean k = k();
        Iterator<Pair<e<T>, Executor>> it = this.f2883f.iterator();
        while (it.hasNext()) {
            Pair<e<T>, Executor> next = it.next();
            a((e) next.first, (Executor) next.second, g2, k);
        }
    }

    private synchronized boolean k() {
        boolean z;
        if (h()) {
            if (!d()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // c.d.e.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(c.d.e.e<T> r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            c.d.d.d.i.a(r3)
            c.d.d.d.i.a(r4)
            monitor-enter(r2)
            boolean r0 = r2.f2879b     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto Ld
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            return
        Ld:
            c.d.e.a$c r0 = r2.f2878a     // Catch: java.lang.Throwable -> L41
            c.d.e.a$c r1 = c.d.e.a.c.IN_PROGRESS     // Catch: java.lang.Throwable -> L41
            if (r0 != r1) goto L1c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<c.d.e.e<T>, java.util.concurrent.Executor>> r0 = r2.f2883f     // Catch: java.lang.Throwable -> L41
            android.util.Pair r1 = android.util.Pair.create(r3, r4)     // Catch: java.lang.Throwable -> L41
            r0.add(r1)     // Catch: java.lang.Throwable -> L41
        L1c:
            boolean r0 = r2.c()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L31
            boolean r0 = r2.d()     // Catch: java.lang.Throwable -> L41
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
            boolean r0 = r2.g()
            boolean r1 = r2.k()
            r2.a(r3, r4, r0, r1)
        L40:
            return
        L41:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.e.a.a(c.d.e.e, java.util.concurrent.Executor):void");
    }

    protected void a(T t) {
    }

    @Override // c.d.e.c
    public boolean a() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(float f2) {
        boolean b2 = b(f2);
        if (b2) {
            i();
        }
        return b2;
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

    @Override // c.d.e.c
    /* renamed from: b */
    public synchronized T mo140b() {
        return this.f2880c;
    }

    @Override // c.d.e.c
    public synchronized boolean c() {
        return this.f2880c != null;
    }

    @Override // c.d.e.c
    public boolean close() {
        synchronized (this) {
            if (this.f2879b) {
                return false;
            }
            this.f2879b = true;
            T t = this.f2880c;
            this.f2880c = null;
            if (t != null) {
                a((a<T>) t);
            }
            if (!d()) {
                j();
            }
            synchronized (this) {
                this.f2883f.clear();
            }
            return true;
        }
    }

    @Override // c.d.e.c
    public synchronized boolean d() {
        return this.f2878a != c.IN_PROGRESS;
    }

    @Override // c.d.e.c
    public synchronized Throwable e() {
        return this.f2881d;
    }

    @Override // c.d.e.c
    public synchronized float f() {
        return this.f2882e;
    }

    public synchronized boolean g() {
        return this.f2878a == c.FAILURE;
    }

    public synchronized boolean h() {
        return this.f2879b;
    }

    protected void i() {
        Iterator<Pair<e<T>, Executor>> it = this.f2883f.iterator();
        while (it.hasNext()) {
            Pair<e<T>, Executor> next = it.next();
            ((Executor) next.second).execute(new b((e) next.first));
        }
    }
}
