package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: anlz  reason: default package */
/* loaded from: classes.dex */
public class anlz {
    public static ThreadPoolExecutor a;
    private static alti b;

    public static void A(ankt anktVar, ankb ankbVar, Executor executor) {
        ankbVar.getClass();
        anktVar.qY(new anke(anktVar, ankbVar), executor);
    }

    public static void B(ankt anktVar, Future future) {
        if (anktVar instanceof anie) {
            ((anie) anktVar).n(future);
        } else if (anktVar == null || !anktVar.isCancelled() || future == null) {
        } else {
            future.cancel(false);
        }
    }

    public static synchronized alti C(Context context) {
        alti altiVar;
        synchronized (anlz.class) {
            if (b == null) {
                alta altaVar = new alta();
                altaVar.a = new altr(akpq.m(context));
                axzl.n(altaVar.a, altr.class);
                b = new altb(altaVar.a);
            }
            altiVar = b;
        }
        return altiVar;
    }

    public static alms D(alms almsVar, float f) {
        return almsVar instanceof almz ? almsVar : new almr(f, almsVar);
    }

    private static int E(int i, int i2) {
        int i3 = 1 << (i2 - 1);
        while ((i & i3) != 0) {
            i3 >>= 1;
        }
        return (i & (i3 - 1)) + i3;
    }

    private static void F(int[] iArr, int i, int i2, int i3, int i4) {
        do {
            i3 -= i2;
            iArr[i + i3] = i4;
        } while (i3 > 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int[] iArr, int i, int i2, int[] iArr2, int i3) {
        int i4;
        int i5 = iArr[i];
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i4 = 1;
            if (i7 >= i3) {
                break;
            }
            int i8 = iArr2[i7];
            iArr4[i8] = iArr4[i8] + 1;
            i7++;
        }
        iArr5[1] = 0;
        int i9 = 1;
        while (i9 < 15) {
            int i10 = i9 + 1;
            iArr5[i10] = iArr5[i9] + iArr4[i9];
            i9 = i10;
        }
        for (int i11 = 0; i11 < i3; i11++) {
            int i12 = iArr2[i11];
            if (i12 != 0) {
                int i13 = iArr5[i12];
                iArr5[i12] = i13 + 1;
                iArr3[i13] = i11;
            }
        }
        int i14 = 1 << i2;
        if (iArr5[15] == 1) {
            for (int i15 = 0; i15 < i14; i15++) {
                iArr[i5 + i15] = iArr3[0];
            }
            return i14;
        }
        int i16 = 0;
        int i17 = 1;
        int i18 = 2;
        while (i17 <= i2) {
            while (iArr4[i17] > 0) {
                F(iArr, i5 + i16, i18, i14, (i17 << 16) | iArr3[i6]);
                i16 = E(i16, i17);
                iArr4[i17] = iArr4[i17] - 1;
                i6++;
            }
            i17++;
            i18 += i18;
        }
        int i19 = i14 - 1;
        int i20 = i5;
        int i21 = i16;
        int i22 = i2 + 1;
        int i23 = 2;
        int i24 = -1;
        int i25 = i6;
        int i26 = i14;
        while (i22 <= 15) {
            int i27 = i24;
            while (iArr4[i22] > 0) {
                int i28 = i21 & i19;
                if (i28 != i27) {
                    i20 += i26;
                    int i29 = i4 << (i22 - i2);
                    int i30 = i22;
                    while (i30 < 15) {
                        int i31 = i29 - iArr4[i30];
                        if (i31 <= 0) {
                            break;
                        }
                        i30++;
                        i29 = i31 + i31;
                    }
                    int i32 = i30 - i2;
                    i26 = i4 << i32;
                    i14 += i26;
                    iArr[i5 + i28] = ((i32 + i2) << 16) | ((i20 - i5) - i28);
                    i27 = i28;
                }
                F(iArr, i20 + (i21 >> i2), i23, i26, ((i22 - i2) << 16) | iArr3[i25]);
                i21 = E(i21, i22);
                iArr4[i22] = iArr4[i22] - 1;
                i25++;
                i4 = 1;
            }
            i22++;
            i23 += i23;
            i24 = i27;
            i4 = 1;
        }
        return i14;
    }

    public static Object c(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(java.util.concurrent.Future r4, long r5, java.util.concurrent.TimeUnit r7) {
        /*
            r0 = 1
            r1 = 0
            long r5 = r7.toNanos(r5)     // Catch: java.lang.Throwable -> L28
            long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L28
            long r2 = r2 + r5
        Lb:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1e
            java.lang.Object r4 = r4.get(r5, r7)     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1e
            if (r1 == 0) goto L1a
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L1a:
            return r4
        L1b:
            r4 = move-exception
            r0 = r1
            goto L2a
        L1e:
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L26
            long r5 = r2 - r5
            r1 = 1
            goto Lb
        L26:
            r4 = move-exception
            goto L2a
        L28:
            r4 = move-exception
            r0 = 0
        L2a:
            if (r0 == 0) goto L33
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L33:
            goto L35
        L34:
            throw r4
        L35:
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anlz.d(java.util.concurrent.Future, long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public static ankw e(ExecutorService executorService) {
        ankw anlbVar;
        if (executorService instanceof ankw) {
            return (ankw) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            anlbVar = new anle((ScheduledExecutorService) executorService);
        } else {
            anlbVar = new anlb(executorService);
        }
        return anlbVar;
    }

    public static ankx f(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService instanceof ankx) {
            return (ankx) scheduledExecutorService;
        }
        return new anle(scheduledExecutorService);
    }

    public static Executor g(Executor executor) {
        return new anli(executor);
    }

    public static Executor h(Executor executor, anie anieVar) {
        executor.getClass();
        return executor == anjk.a ? executor : new anky(executor, anieVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static amuk i(Iterable iterable) {
        boolean z = iterable instanceof Collection;
        amuk amukVar = iterable;
        if (!z) {
            amukVar = amuk.n(iterable);
        }
        ankt[] anktVarArr = (ankt[]) amukVar.toArray(new ankt[0]);
        anki ankiVar = new anki(anktVarArr);
        amuf h = amuk.h(anktVarArr.length);
        for (int i = 0; i < anktVarArr.length; i++) {
            h.h(new ankh(ankiVar));
        }
        amuk g = h.g();
        for (int i2 = 0; i2 < anktVarArr.length; i2++) {
            anktVarArr[i2].qY(new ankd(ankiVar, g, i2), anjk.a);
        }
        return g;
    }

    public static ankg j(Iterable iterable) {
        return new ankg(false, amuk.n(iterable));
    }

    @SafeVarargs
    public static ankg k(ankt... anktVarArr) {
        return new ankg(false, amuk.p(anktVarArr));
    }

    public static ankg l(Iterable iterable) {
        return new ankg(true, amuk.n(iterable));
    }

    @SafeVarargs
    public static ankg m(ankt... anktVarArr) {
        return new ankg(true, amuk.p(anktVarArr));
    }

    public static ankt n(Iterable iterable) {
        return new anjf(amuk.n(iterable), true);
    }

    public static ankt o() {
        return new ankp();
    }

    public static ankt p(Throwable th) {
        th.getClass();
        return new ankp(th);
    }

    public static ankt q(Object obj) {
        if (obj == null) {
            return ankq.a;
        }
        return new ankq(obj);
    }

    public static ankt r(ankt anktVar) {
        if (anktVar.isDone()) {
            return anktVar;
        }
        ankj ankjVar = new ankj(anktVar);
        anktVar.qY(ankjVar, anjk.a);
        return ankjVar;
    }

    public static ankt s(aniq aniqVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        anlq f = anlq.f(aniqVar);
        f.qY(new ankc(scheduledExecutorService.schedule(f, j, timeUnit)), anjk.a);
        return f;
    }

    public static ankt t(Runnable runnable, Executor executor) {
        anlq h = anlq.h(runnable, null);
        executor.execute(h);
        return h;
    }

    public static ankt u(Callable callable, Executor executor) {
        anlq g = anlq.g(callable);
        executor.execute(g);
        return g;
    }

    public static ankt v(aniq aniqVar, Executor executor) {
        anlq f = anlq.f(aniqVar);
        executor.execute(f);
        return f;
    }

    public static ankt w(Iterable iterable) {
        return new anjf(amuk.n(iterable), false);
    }

    public static ankt x(ankt anktVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (anktVar.isDone()) {
            return anktVar;
        }
        anln anlnVar = new anln(anktVar);
        anll anllVar = new anll(anlnVar);
        anlnVar.b = scheduledExecutorService.schedule(anllVar, j, timeUnit);
        anktVar.qY(anllVar, anjk.a);
        return anlnVar;
    }

    public static Object y(Future future) {
        aqxo.B(future.isDone(), "Future was expected to be done: %s", future);
        return c(future);
    }

    public static Object z(Future future) {
        try {
            return c(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new anjl((Error) cause);
            }
            throw new anlr(cause);
        }
    }

    public void a(alnm alnmVar, float f, float f2) {
    }
}
