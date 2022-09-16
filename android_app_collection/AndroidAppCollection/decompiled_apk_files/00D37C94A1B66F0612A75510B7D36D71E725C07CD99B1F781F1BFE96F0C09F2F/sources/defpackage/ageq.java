package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ageq  reason: default package */
/* loaded from: classes.dex */
public final class ageq extends agep {
    private final agcp d;
    private final aadd e;
    private volatile boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ageq(defpackage.agcp r14, defpackage.abaj r15, java.util.concurrent.ScheduledExecutorService r16, defpackage.zdz r17, defpackage.agbd r18, android.content.Context r19, defpackage.aadd r20, defpackage.snc r21, defpackage.yrj r22, defpackage.agex r23, defpackage.azqb r24) {
        /*
            r13 = this;
            r12 = r13
            r0 = r23
            agew r10 = new agew
            azqb r1 = r0.a
            java.lang.Object r1 = r1.get()
            r2 = r1
            agcp r2 = (defpackage.agcp) r2
            r2.getClass()
            azqb r1 = r0.b
            java.lang.Object r1 = r1.get()
            r3 = r1
            android.content.Context r3 = (android.content.Context) r3
            r3.getClass()
            azqb r1 = r0.c
            java.lang.Object r1 = r1.get()
            r4 = r1
            snc r4 = (defpackage.snc) r4
            r4.getClass()
            azqb r0 = r0.d
            java.lang.Object r0 = r0.get()
            r5 = r0
            aadd r5 = (defpackage.aadd) r5
            r5.getClass()
            r0 = r10
            r1 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r21
            r8 = r20
            r9 = r22
            r11 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r14
            r12.d = r0
            r0 = r20
            r12.e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ageq.<init>(agcp, abaj, java.util.concurrent.ScheduledExecutorService, zdz, agbd, android.content.Context, aadd, snc, yrj, agex, azqb):void");
    }

    private final boolean i(String str) {
        if (amps.e(str)) {
            return false;
        }
        try {
            ylx.e(this.d.l(str), agix.b, 30L, TimeUnit.SECONDS);
            this.f = true;
        } catch (Exception e) {
            zep.n("Failed to save registration Id for some unknown reason", e);
            this.f = false;
        }
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.agep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ageq.g():boolean");
    }

    @Override // defpackage.aget
    public final void h(String str) {
        String s = this.d.s();
        if (!i(str) || str.equals(s)) {
            return;
        }
        b(ages.FCM_TOKEN_CHANGED);
    }
}
