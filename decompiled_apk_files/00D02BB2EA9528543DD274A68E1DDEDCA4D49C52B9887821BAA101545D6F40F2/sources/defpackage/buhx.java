package defpackage;

import com.google.android.apps.gmm.location.model.QuantizedDeviceLocation;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: buhx  reason: default package */
/* loaded from: classes4.dex */
public final class buhx implements buae<List<ahnc>> {
    private deig<buab<List<ahnc>>> a;
    @dzsi
    private QuantizedDeviceLocation b;
    private final cqat c;
    private final btrm d;
    private final AtomicBoolean e = new AtomicBoolean(false);

    public buhx(cqat cqatVar, btrm btrmVar) {
        this.c = cqatVar;
        this.d = btrmVar;
    }

    private final void d() {
        if (!this.e.getAndSet(true)) {
            btrm btrmVar = this.d;
            dceq a = dcet.a();
            a.b(ahmo.class, new buhy(0, ahmo.class, this));
            a.b(ahms.class, new buhy(1, ahms.class, this));
            btrmVar.g(this, a.a());
        }
    }

    private final buab<List<ahnc>> e() {
        QuantizedDeviceLocation quantizedDeviceLocation = this.b;
        if (quantizedDeviceLocation != null) {
            if (ahnb.c(quantizedDeviceLocation, quantizedDeviceLocation.a, this.c)) {
                return null;
            }
            return b();
        }
        return null;
    }

    @Override // defpackage.buae
    public final dehn<buab<List<ahnc>>> a() {
        d();
        synchronized (this) {
            buab<List<ahnc>> e = e();
            if (e != null) {
                return deha.a(e);
            }
            deig<buab<List<ahnc>>> deigVar = this.a;
            if (deigVar == null) {
                deig<buab<List<ahnc>>> d = deig.d();
                this.a = d;
                return deha.o(d);
            }
            return deha.o(deigVar);
        }
    }

    @dzsi
    public final buab<List<ahnc>> b() {
        d();
        synchronized (this) {
            QuantizedDeviceLocation quantizedDeviceLocation = this.b;
            if (quantizedDeviceLocation != null) {
                return buab.c("X-Geo", dchl.b(quantizedDeviceLocation));
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r0.getTime() < r7.getTime()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.apps.gmm.location.model.QuantizedDeviceLocation r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.apps.gmm.location.model.QuantizedDeviceLocation r0 = r6.b     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L6
            goto L38
        L6:
            boolean r1 = r0.d()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L1f
            boolean r1 = r7.d()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L1f
            long r1 = r0.b()     // Catch: java.lang.Throwable -> L4d
            long r3 = r7.b()     // Catch: java.lang.Throwable -> L4d
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L38
            goto L37
        L1f:
            boolean r1 = r0.c()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L37
            boolean r1 = r7.c()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L37
            long r1 = r0.getTime()     // Catch: java.lang.Throwable -> L4d
            long r3 = r7.getTime()     // Catch: java.lang.Throwable -> L4d
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L38
        L37:
            r7 = r0
        L38:
            r6.b = r7     // Catch: java.lang.Throwable -> L4d
            buab r7 = r6.e()     // Catch: java.lang.Throwable -> L4d
            r0 = 0
            if (r7 == 0) goto L46
            deig<buab<java.util.List<ahnc>>> r1 = r6.a     // Catch: java.lang.Throwable -> L4d
            r6.a = r0     // Catch: java.lang.Throwable -> L4d
            r0 = r1
        L46:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L4c
            r0.j(r7)
        L4c:
            return
        L4d:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4d
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buhx.c(com.google.android.apps.gmm.location.model.QuantizedDeviceLocation):void");
    }
}
