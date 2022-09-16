package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
/* compiled from: PG */
/* renamed from: acuq  reason: default package */
/* loaded from: classes.dex */
public final class acuq implements tee {
    public final acti a;
    public final SparseArray b;
    public final SparseIntArray c;
    public acum d;

    public acuq(acti actiVar) {
        this(actiVar, null);
    }

    public static int c(awoc awocVar) {
        asvv b = acun.b(f(awocVar));
        if (b == null || (b.c & 8) == 0) {
            return -1;
        }
        apxf apxfVar = b.h;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        if ((apxfVar.b & 1) == 0) {
            return -1;
        }
        apxf apxfVar2 = b.h;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        return apxfVar2.c;
    }

    public static awhc f(awoc awocVar) {
        awoe awoeVar = awocVar.c;
        if (awoeVar == null) {
            awoeVar = awoe.a;
        }
        return (awhc) awoeVar.qm(awhc.b);
    }

    public static boolean g(awoc awocVar) {
        asvv asvvVar = f(awocVar).e;
        if (asvvVar == null) {
            asvvVar = asvv.b;
        }
        apxf apxfVar = asvvVar.h;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        return (apxfVar.b & 2) != 0;
    }

    public static boolean h(awoc awocVar) {
        asvv b = acun.b(f(awocVar));
        return (b == null || (b.c & 8) == 0) ? false : true;
    }

    @Override // defpackage.tee
    public final void a(awoc awocVar, int i) {
        if (i == 2 && j(awocVar)) {
            acum d = d(awocVar);
            if (!f(awocVar).d || d == null) {
                return;
            }
            this.a.H(3, d, null);
        }
    }

    @Override // defpackage.tee
    public final void b(amuk amukVar, int i) {
        acum d;
        int i2 = ((amxx) amukVar).c;
        for (int i3 = 0; i3 < i2; i3++) {
            awoc awocVar = (awoc) amukVar.get(i3);
            if (j(awocVar) && (d = d(awocVar)) != null) {
                if (i != 2) {
                    this.a.q(d, null);
                } else {
                    this.a.u(d, null);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000b, B:9:0x0015, B:11:0x001b, B:13:0x0021, B:15:0x0025, B:16:0x0027, B:18:0x002b, B:19:0x002d, B:23:0x0035, B:33:0x007b, B:25:0x003e, B:27:0x0044, B:29:0x004a, B:30:0x004c, B:31:0x0071, B:20:0x0030), top: B:43:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.acum d(defpackage.awoc r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r7.d     // Catch: java.lang.Throwable -> L86
            acum r0 = r6.e(r0)     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto Lb
            monitor-exit(r6)
            return r0
        Lb:
            awhc r0 = f(r7)     // Catch: java.lang.Throwable -> L86
            boolean r1 = r6.i()     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L30
            boolean r1 = h(r7)     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L30
            boolean r1 = g(r7)     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L30
            asvv r1 = r0.e     // Catch: java.lang.Throwable -> L86
            if (r1 != 0) goto L27
            asvv r1 = defpackage.asvv.b     // Catch: java.lang.Throwable -> L86
        L27:
            apxf r1 = r1.h     // Catch: java.lang.Throwable -> L86
            if (r1 != 0) goto L2d
            apxf r1 = defpackage.apxf.a     // Catch: java.lang.Throwable -> L86
        L2d:
            int r1 = r1.d     // Catch: java.lang.Throwable -> L86
            goto L32
        L30:
            int r1 = r7.d     // Catch: java.lang.Throwable -> L86
        L32:
            r2 = 0
            if (r0 != 0) goto L3e
            java.lang.String r0 = "INTERACTIONLOGGINGBUG->"
            java.lang.String r1 = "LoggingProperties is null when creating visual element container!"
            defpackage.zep.m(r0, r1)     // Catch: java.lang.Throwable -> L86
        L3c:
            r3 = r2
            goto L79
        L3e:
            int r3 = r0.c     // Catch: java.lang.Throwable -> L86
            r3 = r3 & 2
            if (r3 == 0) goto L71
            acte r3 = new acte     // Catch: java.lang.Throwable -> L86
            asvv r0 = r0.e     // Catch: java.lang.Throwable -> L86
            if (r0 != 0) goto L4c
            asvv r0 = defpackage.asvv.b     // Catch: java.lang.Throwable -> L86
        L4c:
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L86
            awbs r0 = r3.a     // Catch: java.lang.Throwable -> L86
            aopa r0 = r0.mo52toBuilder()     // Catch: java.lang.Throwable -> L86
            int r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Throwable -> L86
            r0.copyOnWrite()     // Catch: java.lang.Throwable -> L86
            aopi r4 = r0.instance     // Catch: java.lang.Throwable -> L86
            awbs r4 = (defpackage.awbs) r4     // Catch: java.lang.Throwable -> L86
            int r5 = r4.b     // Catch: java.lang.Throwable -> L86
            r5 = r5 | 8
            r4.b = r5     // Catch: java.lang.Throwable -> L86
            r4.f = r1     // Catch: java.lang.Throwable -> L86
            aopi r0 = r0.mo39build()     // Catch: java.lang.Throwable -> L86
            awbs r0 = (defpackage.awbs) r0     // Catch: java.lang.Throwable -> L86
            r3.a = r0     // Catch: java.lang.Throwable -> L86
            goto L79
        L71:
            java.lang.String r0 = "INTERACTIONLOGGINGBUG->"
            java.lang.String r1 = "LoggingProperties is missing LoggingDirectives when creating visual element container!"
            defpackage.zep.m(r0, r1)     // Catch: java.lang.Throwable -> L86
            goto L3c
        L79:
            if (r3 == 0) goto L84
            android.util.SparseArray r0 = r6.b     // Catch: java.lang.Throwable -> L86
            int r7 = r7.d     // Catch: java.lang.Throwable -> L86
            r0.put(r7, r3)     // Catch: java.lang.Throwable -> L86
            monitor-exit(r6)
            return r3
        L84:
            monitor-exit(r6)
            return r2
        L86:
            r7 = move-exception
            monitor-exit(r6)
            goto L8a
        L89:
            throw r7
        L8a:
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acuq.d(awoc):acum");
    }

    public final synchronized acum e(int i) {
        return (acum) this.b.get(i);
    }

    public final boolean i() {
        Boolean bool;
        if (this.a.a() != null) {
            aqxe aqxeVar = this.a.a().a.b.b().C;
            if (aqxeVar == null) {
                aqxeVar = aqxe.a;
            }
            if (aqxeVar.a(45357300L)) {
                aoqp aoqpVar = aqxeVar.b;
                if (!aoqpVar.containsKey(45357300L)) {
                    throw new IllegalArgumentException();
                }
                aqxf aqxfVar = (aqxf) aoqpVar.get(45357300L);
                bool = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : false);
            } else {
                bool = false;
            }
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(awoc awocVar) {
        awoe awoeVar = awocVar.c;
        if (awoeVar == null) {
            awoeVar = awoe.a;
        }
        if (!awoeVar.qn(awhc.b)) {
            int i = awocVar.e;
            while (true) {
                int i2 = this.c.get(i, -1);
                if (i2 == -1) {
                    break;
                }
                i = i2;
            }
            if (this.b.get(i) == null) {
                return false;
            }
            this.c.put(awocVar.d, i);
            return false;
        }
        return true;
    }

    public acuq(acti actiVar, acum acumVar) {
        this.b = new SparseArray();
        this.c = new SparseIntArray();
        this.a = actiVar;
        if (acumVar != null) {
            this.d = acumVar;
        }
    }
}
