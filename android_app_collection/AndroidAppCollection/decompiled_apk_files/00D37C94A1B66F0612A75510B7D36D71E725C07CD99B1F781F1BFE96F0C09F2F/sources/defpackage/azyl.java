package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
/* compiled from: PG */
/* renamed from: azyl  reason: default package */
/* loaded from: classes2.dex */
public final class azyl implements Executor, Closeable {
    public static final azyg a = new azyg("NOT_IN_STACK");
    public final int b;
    public final int c;
    public final long d;
    public final String e = "DefaultDispatcher";
    public final aztt f;
    public final AtomicReferenceArray g;
    public final aztt h;
    public final azxx i;
    public final azxx j;
    private final aztr k;

    public static /* synthetic */ void e(azyl azylVar, Runnable runnable) {
        azylVar.a(runnable, azyp.a, false);
    }

    public static final void f(azyq azyqVar) {
        azyqVar.getClass();
        try {
            azyqVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    public static final azyq g(Runnable runnable, azyr azyrVar) {
        long j = azyt.a;
        long nanoTime = System.nanoTime();
        if (runnable instanceof azyq) {
            azyq azyqVar = (azyq) runnable;
            azyqVar.g = nanoTime;
            azyqVar.h = azyrVar;
            return azyqVar;
        }
        return new azys(runnable, nanoTime, azyrVar);
    }

    private final int h() {
        synchronized (this.g) {
            if (d()) {
                return -1;
            }
            long j = this.h.b;
            int i = (int) (j & 2097151);
            int f = azst.f(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (f >= this.b) {
                return 0;
            }
            if (i >= this.c) {
                return 0;
            }
            int i2 = ((int) (this.h.b & 2097151)) + 1;
            if (this.g.get(i2) == null) {
                azyk azykVar = new azyk(this, i2);
                this.g.set(i2, azykVar);
                aztt azttVar = this.h;
                int i3 = aztv.a;
                if (i2 != ((int) (2097151 & aztt.a.incrementAndGet(azttVar)))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                azykVar.start();
                return f + 1;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private final azyk i() {
        Thread currentThread = Thread.currentThread();
        azyk azykVar = currentThread instanceof azyk ? (azyk) currentThread : null;
        if (azykVar != null && azst.c(azykVar.d, this)) {
            return azykVar;
        }
        return null;
    }

    private final boolean j(long j) {
        if (azst.f(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.b) {
            int h = h();
            if (h == 1) {
                if (this.b > 1) {
                    h();
                }
            } else if (h <= 0) {
            }
            return true;
        }
        return false;
    }

    private final boolean k() {
        azyk azykVar;
        do {
            aztt azttVar = this.f;
            while (true) {
                long j = azttVar.b;
                azykVar = (azyk) this.g.get((int) (2097151 & j));
                if (azykVar != null) {
                    long j2 = (2097152 + j) & (-2097152);
                    int l = l(azykVar);
                    if (l >= 0 && this.f.b(j, j2 | l)) {
                        azykVar.nextParkedWorker = a;
                        break;
                    }
                } else {
                    azykVar = null;
                    break;
                }
            }
            if (azykVar == null) {
                return false;
            }
        } while (!azykVar.b.c(-1, 0));
        LockSupport.unpark(azykVar);
        return true;
    }

    private static final int l(azyk azykVar) {
        Object obj = azykVar.nextParkedWorker;
        while (obj != a) {
            if (obj == null) {
                return 0;
            }
            azyk azykVar2 = (azyk) obj;
            int i = azykVar2.indexInArray;
            if (i != 0) {
                return i;
            }
            obj = azykVar2.nextParkedWorker;
        }
        return -1;
    }

    public final void a(Runnable runnable, azyr azyrVar, boolean z) {
        azyq azyqVar;
        boolean d;
        azyrVar.getClass();
        azyq g = g(runnable, azyrVar);
        azyk i = i();
        boolean z2 = true;
        if (i == null || i.e == 5 || (g.h.e() == 0 && i.e == 2)) {
            azyqVar = g;
        } else {
            i.c = true;
            azyqVar = i.a.c(g, z);
        }
        if (azyqVar != null) {
            if (azyqVar.h.e() == 1) {
                d = this.j.d(azyqVar);
            } else {
                d = this.i.d(azyqVar);
            }
            if (!d) {
                throw new RejectedExecutionException(azst.a(this.e, " was terminated"));
            }
        }
        if (!z || i == null) {
            z2 = false;
        }
        if (g.h.e() == 0) {
            if (z2) {
                return;
            }
            c();
            return;
        }
        long a2 = this.h.a(2097152L);
        if (z2 || k() || j(a2)) {
            return;
        }
        k();
    }

    public final void b(azyk azykVar, int i, int i2) {
        aztt azttVar = this.f;
        while (true) {
            long j = azttVar.b;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                i3 = i2 == 0 ? l(azykVar) : i2;
            }
            if (i3 >= 0 && this.f.b(j, j2 | i3)) {
                return;
            }
        }
    }

    public final void c() {
        if (k() || j(this.h.b)) {
            return;
        }
        k();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        if (!this.k.b()) {
            return;
        }
        azyk i2 = i();
        synchronized (this.g) {
            i = (int) (this.h.b & 2097151);
        }
        if (i > 0) {
            int i3 = 1;
            while (true) {
                int i4 = i3 + 1;
                azyk azykVar = (azyk) this.g.get(i3);
                azykVar.getClass();
                if (azykVar != i2) {
                    while (azykVar.isAlive()) {
                        LockSupport.unpark(azykVar);
                        azykVar.join(10000L);
                    }
                    boolean z = azuy.a;
                    azyu azyuVar = azykVar.a;
                    azxx azxxVar = this.j;
                    azxxVar.getClass();
                    azyq azyqVar = (azyq) azyuVar.b.a(null);
                    if (azyqVar != null) {
                        azxxVar.d(azyqVar);
                    }
                    while (true) {
                        azyq e = azyuVar.e();
                        if (e == null) {
                            break;
                        }
                        azxxVar.d(e);
                    }
                }
                if (i3 == i) {
                    break;
                }
                i3 = i4;
            }
        }
        this.j.c();
        this.i.c();
        while (true) {
            azyq b = i2 == null ? null : i2.b(true);
            if (b == null) {
                b = (azyq) this.i.b();
            }
            if (b == null && (b = (azyq) this.j.b()) == null) {
                break;
            }
            f(b);
        }
        if (i2 != null) {
            i2.d(5);
        }
        boolean z2 = azuy.a;
        aztt azttVar = this.f;
        int i5 = aztv.a;
        azttVar.b = 0L;
        this.h.b = 0L;
    }

    public final boolean d() {
        return this.k.a();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        e(this, runnable);
    }

    public final String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = new ArrayList();
        int length = this.g.length();
        int i5 = 0;
        if (length > 1) {
            int i6 = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            int i7 = 1;
            while (true) {
                int i8 = i7 + 1;
                azyk azykVar = (azyk) this.g.get(i7);
                if (azykVar != null) {
                    azyu azyuVar = azykVar.a;
                    int a2 = azyuVar.b.a != null ? azyuVar.a() + 1 : azyuVar.a();
                    int i9 = azykVar.e;
                    int i10 = i9 - 1;
                    if (i9 == 0) {
                        throw null;
                    }
                    if (i10 == 0) {
                        i6++;
                        StringBuilder sb = new StringBuilder();
                        sb.append(a2);
                        sb.append('c');
                        arrayList.add(sb.toString());
                    } else if (i10 == 1) {
                        i5++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(a2);
                        sb2.append('b');
                        arrayList.add(sb2.toString());
                    } else if (i10 == 2) {
                        i4++;
                    } else if (i10 == 3) {
                        i2++;
                        if (a2 > 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(a2);
                            sb3.append('d');
                            arrayList.add(sb3.toString());
                        }
                    } else if (i10 == 4) {
                        i3++;
                    }
                }
                if (i8 >= length) {
                    i = i5;
                    i5 = i6;
                    break;
                }
                i7 = i8;
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        long j = this.h.b;
        return this.e + '@' + banl.k(this) + "[Pool Size {core = " + this.b + ", max = " + this.c + "}, Worker States {CPU = " + i5 + ", blocking = " + i + ", parked = " + i4 + ", dormant = " + i2 + ", terminated = " + i3 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.i.a() + ", global blocking queue size = " + this.j.a() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.b - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    public azyl(int i, int i2, long j) {
        this.b = i;
        this.c = i2;
        this.d = j;
        if (i <= 0) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        } else if (i2 < i) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        } else if (i2 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        } else if (j > 0) {
            this.i = new azxx();
            this.j = new azxx();
            this.f = ayme.e(0L);
            this.g = new AtomicReferenceArray(i2 + 1);
            this.h = ayme.e(i << 42);
            this.k = ayme.d(false);
        } else {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
    }
}
