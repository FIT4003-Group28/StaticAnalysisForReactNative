package defpackage;

import android.os.Binder;
import java.util.concurrent.locks.LockSupport;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: soj  reason: default package */
/* loaded from: classes4.dex */
public final class soj implements Runnable {
    final int a;
    Thread b;
    volatile Thread c;
    sou d;
    int e;
    long f;
    volatile long g;
    final /* synthetic */ sok h;
    volatile int i = 2;

    public soj(sok sokVar, int i) {
        this.h = sokVar;
        this.a = i;
    }

    private final void d() {
        if (this.h.h) {
            long j = this.f + 1;
            this.f = j;
            this.g = j;
        }
    }

    public final void a() {
        if (this.b != null) {
            this.h.d.incrementAndGet();
        }
        this.b = null;
        this.c = null;
        this.i = 3;
        this.h.i.countDown();
    }

    public final void b() {
        this.h.g.newThread(this).start();
    }

    public final void c(sou souVar) {
        int i = this.e;
        if (i < 5) {
            souVar.a = this.d;
            souVar.b = this.a;
            this.d = souVar;
            this.e = i + 1;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        Thread currentThread = Thread.currentThread();
        this.b = currentThread;
        this.c = currentThread;
        if (this.h.f.get()) {
            a();
            return;
        }
        loop0: while (true) {
            sou souVar = (sou) this.h.a.poll();
            if (souVar != null) {
                this.h.a();
                Runnable runnable = (Runnable) souVar.a;
                c(souVar);
                try {
                    runnable.run();
                    Binder.flushPendingCommands();
                    d();
                    Thread.interrupted();
                    if (this.h.e) {
                        break;
                    }
                } catch (Error | RuntimeException e) {
                    if (this.h.f.get()) {
                        a();
                    } else {
                        b();
                    }
                    throw e;
                }
            } else {
                this.i = 2;
                sov sovVar = this.h.j;
                sou souVar2 = null;
                while (true) {
                    sou souVar3 = (sou) sovVar.c.get();
                    if (souVar3.a == sov.a) {
                        int i3 = souVar3.b;
                        if (i3 == 0) {
                            i = 3;
                            break;
                        } else if (sovVar.c.compareAndSet(souVar3, sovVar.e[i3 - 1])) {
                            if (souVar2 != null) {
                                c(souVar2);
                            }
                        }
                    } else if (souVar3.a != sov.b || (i2 = souVar3.b) <= 0) {
                        if (souVar2 == null) {
                            souVar2 = this.d;
                            if (souVar2 == null) {
                                souVar2 = new sou(null, this.a);
                            } else {
                                this.d = (sou) souVar2.a;
                                this.e--;
                            }
                        }
                        souVar2.a = souVar3;
                        if (sovVar.c.compareAndSet(souVar3, souVar2)) {
                            i = 2;
                            break;
                        }
                    } else if (sovVar.c.compareAndSet(souVar3, sovVar.d[i2 - 1])) {
                        if (souVar2 != null) {
                            c(souVar2);
                        }
                    }
                }
                i = 1;
                int i4 = i - 1;
                if (i4 == 0) {
                    this.i = 1;
                } else if (i4 == 2) {
                    this.i = 3;
                    break;
                } else {
                    boolean z = false;
                    while (true) {
                        LockSupport.park(this.h);
                        int i5 = this.i;
                        int i6 = i5 - 1;
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i6 != 0) {
                            if (i6 == 1) {
                                z |= Thread.interrupted();
                            } else if (i6 == 2) {
                                break loop0;
                            }
                        } else if (z) {
                            this.b.interrupt();
                        }
                    }
                }
            }
        }
        a();
    }
}
