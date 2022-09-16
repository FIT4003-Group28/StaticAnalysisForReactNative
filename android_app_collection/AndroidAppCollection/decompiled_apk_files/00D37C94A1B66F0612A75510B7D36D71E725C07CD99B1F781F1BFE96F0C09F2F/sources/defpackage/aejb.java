package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
/* compiled from: PG */
/* renamed from: aejb  reason: default package */
/* loaded from: classes.dex */
final class aejb extends PhoneStateListener {
    final /* synthetic */ aejc a;
    private final TelephonyManager b;
    private final zdt c;

    public aejb(aejc aejcVar, TelephonyManager telephonyManager, zdt zdtVar) {
        this.a = aejcVar;
        this.b = telephonyManager;
        this.c = zdtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r3.contains("nrState=NOT_RESTRICTED") != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.telephony.PhoneStateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onServiceStateChanged(android.telephony.ServiceState r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L19
            java.lang.String r3 = r3.toString()     // Catch: java.lang.RuntimeException -> L1c
            java.lang.String r0 = "nrState=CONNECTED"
            boolean r0 = r3.contains(r0)     // Catch: java.lang.RuntimeException -> L1c
            if (r0 != 0) goto L16
            java.lang.String r0 = "nrState=NOT_RESTRICTED"
            boolean r3 = r3.contains(r0)     // Catch: java.lang.RuntimeException -> L1c
            if (r3 == 0) goto L19
        L16:
            java.lang.String r3 = "5g"
            goto L20
        L19:
            java.lang.String r3 = "n"
            goto L20
        L1c:
            afki r3 = defpackage.afki.ABR
            java.lang.String r3 = "e"
        L20:
            zdt r0 = r2.c
            r0.a(r3)
            android.telephony.TelephonyManager r3 = r2.b
            r0 = 0
            r3.listen(r2, r0)
            aejc r3 = r2.a
            monitor-enter(r3)
            aejc r1 = r2.a     // Catch: java.lang.Throwable -> L34
            r1.c = r0     // Catch: java.lang.Throwable -> L34
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aejb.onServiceStateChanged(android.telephony.ServiceState):void");
    }
}
