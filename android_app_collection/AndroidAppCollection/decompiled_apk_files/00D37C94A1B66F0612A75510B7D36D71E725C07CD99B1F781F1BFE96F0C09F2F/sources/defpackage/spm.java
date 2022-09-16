package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: spm  reason: default package */
/* loaded from: classes4.dex */
public final class spm {
    private static final amzy c = amzy.l("com/google/android/libraries/concurrent/monitoring/ThreadMonitoring");
    public final ampq a;
    public final spo b;
    private final boolean d;
    private final ankx e;

    public spm(ampq ampqVar, spo spoVar, ampq ampqVar2, ankx ankxVar) {
        this.a = ampqVar;
        this.b = spoVar;
        this.d = ((Boolean) ampqVar2.e(false)).booleanValue();
        this.e = ankxVar;
    }

    public static void b(spn spnVar, ArrayList arrayList, final RuntimeException runtimeException) {
        if (arrayList.size() > 20) {
            for (int i = 0; i < 20; i++) {
                Collections.swap(arrayList, i, ThreadLocalRandom.current().nextInt(arrayList.size() - i) + i);
            }
        }
        int min = Math.min(arrayList.size(), 20);
        for (int i2 = 0; i2 < min; i2++) {
            Thread thread = (Thread) arrayList.get(i2);
            sop sopVar = new sop(thread);
            RuntimeException b = ammu.b(thread);
            if (b.getStackTrace().length > 0) {
                sopVar.initCause(b);
            }
        }
        spn spnVar2 = spn.LOG_ERROR;
        int ordinal = spnVar.ordinal();
        if (ordinal == 0) {
            ((amzw) ((amzw) ((amzw) c.f()).h(runtimeException)).i("com/google/android/libraries/concurrent/monitoring/ThreadMonitoring", "reportUnhealthyThreadPool", 424, "ThreadMonitoring.java")).o();
        } else if (ordinal == 1) {
            uwp.h(new Runnable() { // from class: spb
                @Override // java.lang.Runnable
                public final void run() {
                    throw runtimeException;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean c() {
        return ThreadLocalRandom.current().nextInt(1000) <= 0;
    }

    public final ExecutorService a(spl splVar, ExecutorService executorService, spg spgVar) {
        return new spe((spn) this.a.c(), this.b, this.d, this.e, splVar, executorService, spgVar);
    }
}
