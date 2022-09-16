package defpackage;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: snr  reason: default package */
/* loaded from: classes4.dex */
public final class snr {
    public static ThreadFactory a(final int i, final ThreadFactory threadFactory) {
        return new ThreadFactory() { // from class: snq
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                ThreadFactory threadFactory2 = threadFactory;
                final int i2 = i;
                Thread newThread = threadFactory2.newThread(new Runnable() { // from class: snp
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        Runnable runnable2 = runnable;
                        Process.setThreadPriority(i3);
                        runnable2.run();
                    }
                });
                newThread.setPriority(i2 <= 0 ? 5 : i2 <= 10 ? 4 : 3);
                return newThread;
            }
        };
    }

    public static int b(ampq ampqVar) {
        return ((Integer) ampqVar.e(4)).intValue();
    }

    public static int c() {
        return Math.max(2, Runtime.getRuntime().availableProcessors() - 2);
    }

    public static ExecutorService d(int i, boolean z, spm spmVar, ThreadFactory threadFactory) {
        ampq j = !spmVar.a.h() ? amon.a : ampq.j(new spl(threadFactory));
        if (j.h()) {
            threadFactory = (ThreadFactory) j.c();
        }
        ThreadFactory threadFactory2 = threadFactory;
        if (z) {
            final sok sokVar = new sok(i, threadFactory2);
            return j.h() ? spmVar.a((spl) j.c(), sokVar, new spg() { // from class: snf
                @Override // defpackage.spg
                public final int a() {
                    return sok.this.b.get();
                }
            }) : sokVar;
        }
        final ThreadPoolExecutor g = g(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory2);
        return j.h() ? spmVar.a((spl) j.c(), g, new spg() { // from class: sng
            @Override // defpackage.spg
            public final int a() {
                return g.getQueue().size();
            }
        }) : g;
    }

    public static ThreadFactory e(String str, ThreadFactory threadFactory) {
        anlk anlkVar = new anlk();
        anlkVar.c(true);
        anlkVar.d(str.concat(" Thread #%d"));
        anlkVar.e(threadFactory);
        return anlk.b(anlkVar);
    }

    public static ThreadFactory f(final StrictMode.ThreadPolicy threadPolicy, final ThreadFactory threadFactory) {
        return new ThreadFactory() { // from class: snk
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                ThreadFactory threadFactory2 = threadFactory;
                final StrictMode.ThreadPolicy threadPolicy2 = threadPolicy;
                return threadFactory2.newThread(new Runnable() { // from class: snh
                    @Override // java.lang.Runnable
                    public final void run() {
                        StrictMode.ThreadPolicy threadPolicy3 = threadPolicy2;
                        Runnable runnable2 = runnable;
                        StrictMode.setThreadPolicy(threadPolicy3);
                        runnable2.run();
                    }
                });
            }
        };
    }

    public static ThreadPoolExecutor g(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        return new snm(i, i2, j, timeUnit, blockingQueue, threadFactory);
    }

    public static sgt h(String str, List list, List list2) {
        Double valueOf;
        sho.c(list.size() == list2.size(), "domains and measures must be the same length");
        ArrayList arrayList = new ArrayList(list2.size());
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            if (number == null || (number instanceof Double)) {
                arrayList.add((Double) number);
            } else {
                arrayList.add(Double.valueOf(number.doubleValue()));
            }
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        Double valueOf2 = Double.valueOf(Double.NEGATIVE_INFINITY);
        Iterator it2 = list.iterator();
        boolean z = true;
        while (it2.hasNext()) {
            Number number2 = (Number) it2.next();
            if (number2 instanceof Double) {
                valueOf = (Double) number2;
            } else {
                valueOf = Double.valueOf(number2.doubleValue());
            }
            arrayList2.add(valueOf);
            z &= valueOf.doubleValue() > valueOf2.doubleValue();
            valueOf2 = valueOf;
        }
        if (!z) {
            ArrayList f = sbv.f(arrayList2.size());
            for (int i = 0; i < arrayList2.size(); i++) {
                f.add(new shg((Double) arrayList2.get(i), (Double) arrayList.get(i)));
            }
            sgt sgtVar = new sgt(str, f);
            sgw.c(sgtVar);
            Log.w("Aplos.SeriesFactory", String.format("Numeric Series %s is not in domain order. Presort this series for increases performance.", sgtVar.b));
            Collections.sort(sgtVar.a, new shf(sgtVar.c(sgq.c)));
            return sgtVar;
        }
        sgt sgtVar2 = new sgt(str, new shc(new she(arrayList, arrayList2), arrayList2.size()));
        sgw.c(sgtVar2);
        return sgtVar2;
    }

    public static sgt i(String str, List list, List list2) {
        sho.c(list.size() == list2.size(), "domains and measures must be the same length");
        ArrayList arrayList = new ArrayList(list2.size());
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            if (number == null || (number instanceof Double)) {
                arrayList.add((Double) number);
            } else {
                arrayList.add(Double.valueOf(number.doubleValue()));
            }
        }
        sgt sgtVar = new sgt(str, new shc(new sgx(arrayList, list), list.size()));
        sgtVar.f(sgq.d, new sgv(2));
        sgtVar.f(sgq.a, new sgv(3));
        return sgtVar;
    }
}
