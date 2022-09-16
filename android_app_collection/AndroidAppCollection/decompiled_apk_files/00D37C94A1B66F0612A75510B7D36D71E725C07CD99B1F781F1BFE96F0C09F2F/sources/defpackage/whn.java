package defpackage;

import android.accounts.Account;
/* compiled from: PG */
/* renamed from: whn  reason: default package */
/* loaded from: classes4.dex */
public final class whn {
    private final ynz a;

    public whn(ynz ynzVar) {
        this.a = ynzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
        r7 = defpackage.qfl.j(r6);
        r1 = defpackage.qvy.b();
        r1.b = new com.google.android.gms.common.Feature[]{defpackage.qhq.a};
        r1.a = new defpackage.qim(r0);
        r1.c = 1644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007e, code lost:
        r7 = (java.lang.Integer) defpackage.qhz.d(((defpackage.qst) r7).v(r1.a()), "hasCapabilities ");
        defpackage.qhz.j(r7);
        r6 = r7.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008c, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008d, code lost:
        defpackage.qhz.h(r7, "hasCapabilities ");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer a(android.accounts.Account r6, java.lang.String[] r7) {
        /*
            r5 = this;
            com.google.android.gms.auth.HasCapabilitiesRequest r0 = new com.google.android.gms.auth.HasCapabilitiesRequest
            r0.<init>(r6, r7)
            ynz r6 = r5.a
            android.content.Context r6 = r6.a
            defpackage.qnm.b(r6)
            android.accounts.Account r7 = r0.a
            defpackage.qnm.b(r7)
            android.accounts.Account r7 = r0.a
            java.lang.String r7 = r7.name
            defpackage.qnm.l(r7)
            java.lang.String r7 = "This call can involve network request. It is unsafe to call from main thread."
            defpackage.qnm.i(r7)
            defpackage.vbt.g(r6)
            axqt r7 = defpackage.axqt.a
            axqu r7 = r7.get()
            boolean r7 = r7.b()
            if (r7 == 0) goto L90
            android.content.pm.ApplicationInfo r7 = r6.getApplicationInfo()
            java.lang.String r7 = r7.packageName
            axqt r1 = defpackage.axqt.a
            axqu r1 = r1.get()
            aoto r1 = r1.a()
            aopu r1 = r1.b
            java.util.Iterator r1 = r1.iterator()
        L42:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L42
            goto L90
        L55:
            qie r7 = defpackage.qfl.j(r6)
            qvx r1 = defpackage.qvy.b()
            r2 = 1
            com.google.android.gms.common.Feature[] r2 = new com.google.android.gms.common.Feature[r2]
            r3 = 0
            com.google.android.gms.common.Feature r4 = defpackage.qhq.a
            r2[r3] = r4
            r1.b = r2
            qim r2 = new qim
            r2.<init>()
            r1.a = r2
            r2 = 1644(0x66c, float:2.304E-42)
            r1.c = r2
            qvy r1 = r1.a()
            qst r7 = (defpackage.qst) r7
            rve r7 = r7.v(r1)
            java.lang.String r1 = "hasCapabilities "
            java.lang.Object r7 = defpackage.qhz.d(r7, r1)     // Catch: defpackage.qsp -> L8c
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: defpackage.qsp -> L8c
            defpackage.qhz.j(r7)     // Catch: defpackage.qsp -> L8c
            int r6 = r7.intValue()     // Catch: defpackage.qsp -> L8c
            goto La1
        L8c:
            r7 = move-exception
            defpackage.qhz.h(r7, r1)
        L90:
            qht r7 = new qht
            r7.<init>()
            android.content.ComponentName r0 = defpackage.qhz.c
            java.lang.Object r6 = defpackage.qhz.c(r6, r0, r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
        La1:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whn.a(android.accounts.Account, java.lang.String[]):java.lang.Integer");
    }

    public final Account[] b() {
        return qhz.l(this.a.a);
    }

    public final Account[] c(String[] strArr) {
        return qhz.m(this.a.a, strArr);
    }
}
