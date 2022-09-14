package defpackage;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dwz  reason: default package */
/* loaded from: classes6.dex */
public final class dwz implements dfeo {
    public final dirl a;
    public final czw b;
    public final Map<dbsi<dfgu, dwy>, dfgu> h;
    private final ScheduledExecutorService i;
    private final v<dad> j;
    private boolean l;
    @dzsi
    private ScheduledFuture<?> m;
    private final aa<dad> n;
    public final Object c = new Object();
    private int k = 0;
    public final Set<dfeq<dfgv>> d = new LinkedHashSet();
    public dfgv e = i(dfgu.STOPPED);
    public boolean f = false;
    public boolean g = false;

    public dwz(btvo btvoVar, dehq dehqVar, czw czwVar, v<dad> vVar) {
        HashMap hashMap = new HashMap();
        this.h = hashMap;
        this.n = new dwx(this);
        dhlz dhlzVar = btvoVar.getNavigationParametersProto().aJ;
        dirl dirlVar = (dhlzVar == null ? dhlz.n : dhlzVar).k;
        this.a = dirlVar == null ? dirl.h : dirlVar;
        this.i = dehqVar;
        this.b = czwVar;
        this.j = vVar;
        hashMap.put(dbsi.a(dfgu.STOPPED, dwy.HIGH_ACCURACY), dfgu.LOCALIZED);
        hashMap.put(dbsi.a(dfgu.RECALIBRATION, dwy.LOW_ACCURACY), dfgu.RECALIBRATION);
        hashMap.put(dbsi.a(dfgu.RECALIBRATION, dwy.HIGH_ACCURACY), dfgu.LOCALIZED);
        hashMap.put(dbsi.a(dfgu.FULL_CALIBRATION, dwy.LOW_ACCURACY), dfgu.FULL_CALIBRATION);
        hashMap.put(dbsi.a(dfgu.FULL_CALIBRATION, dwy.HIGH_ACCURACY), dfgu.LOCALIZED);
        hashMap.put(dbsi.a(dfgu.LOCALIZED, dwy.LOW_ACCURACY), dfgu.RECALIBRATION);
        hashMap.put(dbsi.a(dfgu.LOCALIZED, dwy.HIGH_ACCURACY), dfgu.LOCALIZED);
        hashMap.put(dbsi.a(dfgu.FAILED, dwy.LOW_ACCURACY), dfgu.FAILED);
        hashMap.put(dbsi.a(dfgu.FAILED, dwy.HIGH_ACCURACY), dfgu.FAILED);
    }

    public static dfgv i(dfgu dfguVar) {
        dfgr bZ = dfgv.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfgv dfgvVar = (dfgv) bZ.b;
        dfgvVar.b = dfguVar.g;
        dfgvVar.a |= 1;
        if (dfguVar == dfgu.FAILED) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfgv dfgvVar2 = (dfgv) bZ.b;
            dfgvVar2.c = 1;
            dfgvVar2.a |= 2;
        }
        return bZ.bK();
    }

    private final void j() {
        if (!this.f) {
            return;
        }
        this.j.d(this.n);
        this.f = false;
        h(i(dfgu.STOPPED));
    }

    private final void k(final dfgv dfgvVar, long j) {
        dbsk.l(this.m == null);
        this.m = this.i.schedule(new Runnable(this, dfgvVar) { // from class: dwv
            private final dwz a;
            private final dfgv b;

            {
                this.a = this;
                this.b = dfgvVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.h(this.b);
            }
        }, j, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.dfeo
    public final void a() {
        this.l = true;
        if (this.k == 0 && !this.f) {
            this.f = true;
            this.j.c(this.n);
        }
    }

    @Override // defpackage.dfeo
    public final void b() {
        this.l = false;
        j();
    }

    @Override // defpackage.dfeo
    public final void c() {
        int i = this.k + 1;
        this.k = i;
        if (i == 1) {
            j();
        }
    }

    @Override // defpackage.dfeo
    public final void d() {
        int i = this.k - 1;
        this.k = i;
        dbsk.l(i >= 0);
        if (this.k != 0 || !this.l) {
            return;
        }
        a();
    }

    @Override // defpackage.dfeo
    public final void e(final dfeq<dfgv> dfeqVar) {
        final dfgv dfgvVar = this.e;
        synchronized (this.c) {
            if (this.d.add(dfeqVar)) {
                this.i.execute(new Runnable(dfeqVar, dfgvVar) { // from class: dwu
                    private final dfeq a;
                    private final dfgv b;

                    {
                        this.a = dfeqVar;
                        this.b = dfgvVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.n(this.b);
                    }
                });
            }
        }
    }

    @Override // defpackage.dfeo
    public final void f(dfeq<dfgv> dfeqVar) {
        synchronized (this.c) {
            this.d.remove(dfeqVar);
        }
    }

    @Override // defpackage.dfeo
    public final void g() {
        this.g = false;
    }

    public final void h(dfgv dfgvVar) {
        bvrj.UI_THREAD.c();
        dfgv dfgvVar2 = this.e;
        dfgu b = dfgu.b(dfgvVar2.b);
        if (b == null) {
            b = dfgu.NONE;
        }
        dfgu b2 = dfgu.b(dfgvVar.b);
        if (b2 == null) {
            b2 = dfgu.NONE;
        }
        if (b == b2) {
            return;
        }
        this.e = dfgvVar;
        dfgu b3 = dfgu.b(dfgvVar.b);
        if (b3 == null) {
            b3 = dfgu.NONE;
        }
        if (b3 == dfgu.LOCALIZED) {
            this.g = true;
        } else {
            dfgu b4 = dfgu.b(this.e.b);
            if (b4 == null) {
                b4 = dfgu.NONE;
            }
            if (b4 == dfgu.FAILED) {
                this.g = false;
            }
        }
        ScheduledFuture<?> scheduledFuture = this.m;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.m = null;
        dfgu b5 = dfgu.b(this.e.b);
        if (b5 == null) {
            b5 = dfgu.NONE;
        }
        if (b5 == dfgu.RECALIBRATION) {
            k(i(dfgu.FULL_CALIBRATION), 6000L);
        } else {
            dfgu b6 = dfgu.b(this.e.b);
            if (b6 == null) {
                b6 = dfgu.NONE;
            }
            if (b6 == dfgu.FULL_CALIBRATION) {
                k(i(dfgu.FAILED), 20000L);
            }
        }
        dfgu b7 = dfgu.b(dfgvVar2.b);
        if (b7 == null) {
            b7 = dfgu.NONE;
        }
        b7.name();
        dfgu b8 = dfgu.b(dfgvVar.b);
        if (b8 == null) {
            b8 = dfgu.NONE;
        }
        b8.name();
        final dfgv dfgvVar3 = this.e;
        this.i.execute(new Runnable(this, dfgvVar3) { // from class: dww
            private final dwz a;
            private final dfgv b;

            {
                this.a = this;
                this.b = dfgvVar3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dwz dwzVar = this.a;
                dfgv dfgvVar4 = this.b;
                synchronized (dwzVar.c) {
                    dcpd it = dcep.K(dwzVar.d).iterator();
                    while (it.hasNext()) {
                        ((dfeq) it.next()).n(dfgvVar4);
                    }
                }
            }
        });
    }
}
