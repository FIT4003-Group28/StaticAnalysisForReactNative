package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: abvr  reason: default package */
/* loaded from: classes.dex */
public final class abvr implements abto {
    public static final int[] a = {1152000, 512000, 0};
    public static final int[] b = {384000, 128000, 32000};
    public final acbo c;
    public final Handler d = new Handler(Looper.getMainLooper());
    private final acbw e;
    private final Handler f;
    private final abvq g;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public abvr(int r12, int r13, int r14, defpackage.acbo r15, defpackage.acbw r16, java.util.concurrent.ScheduledExecutorService r17, android.os.Handler r18, defpackage.snc r19) {
        /*
            r11 = this;
            r0 = r11
            r7 = r13
            r3 = r15
            r11.<init>()
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.d = r1
            r15.getClass()
            r0.c = r3
            r18.getClass()
            r4 = r18
            r0.f = r4
            r16.getClass()
            r2 = r16
            r0.e = r2
            r1 = 1
            r5 = 0
            r8 = r12
            if (r8 > r7) goto L2e
            r9 = r14
            if (r7 > r9) goto L2f
            r6 = 1
            goto L30
        L2e:
            r9 = r14
        L2f:
            r6 = 0
        L30:
            defpackage.aqxo.p(r6)
            if (r7 <= 0) goto L36
            goto L37
        L36:
            r1 = 0
        L37:
            defpackage.aqxo.p(r1)
            int r1 = r15.b()
            if (r1 == r7) goto L43
            r15.a(r13)
        L43:
            abvq r10 = new abvq
            r1 = r10
            r2 = r16
            r3 = r15
            r4 = r18
            r5 = r17
            r6 = r19
            r7 = r13
            r8 = r12
            r9 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.g = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abvr.<init>(int, int, int, acbo, acbw, java.util.concurrent.ScheduledExecutorService, android.os.Handler, snc):void");
    }

    @Override // defpackage.abto
    public final long a() {
        return this.e.d();
    }

    @Override // defpackage.abto
    public final void b(abug abugVar) {
    }

    @Override // defpackage.abto
    public final void c(final int i, final abxd abxdVar) {
        this.f.post(new Runnable() { // from class: abvn
            @Override // java.lang.Runnable
            public final void run() {
                abvr abvrVar = abvr.this;
                int i2 = i;
                abxd abxdVar2 = abxdVar;
                abvrVar.c.a(i2);
                abvrVar.d.post(new abvm(abxdVar2));
            }
        });
    }

    @Override // defpackage.abto
    public final void d(boolean z) {
        if (!z) {
            abvq abvqVar = this.g;
            ScheduledFuture scheduledFuture = abvqVar.e;
            if (scheduledFuture == null) {
                return;
            }
            scheduledFuture.cancel(true);
            abvqVar.e = null;
            return;
        }
        abvq abvqVar2 = this.g;
        if (abvqVar2.e != null) {
            return;
        }
        abvqVar2.g = abvq.a(abvqVar2.f);
        abvqVar2.c.post(new abvo(abvqVar2));
        if (abvqVar2.e != null) {
            return;
        }
        abvqVar2.e = abvqVar2.d.scheduleWithFixedDelay(abvqVar2, 1L, 1L, TimeUnit.SECONDS);
    }

    @Override // defpackage.abto
    public final void e(int i) {
    }
}
