package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: beih  reason: default package */
/* loaded from: classes3.dex */
public final class beih implements beia {
    public static final dcep<dfzy> a = dcep.C(dfzy.CALL_TRACKING, dfzy.CALL_TRACKING_CONTROL_OPTED_IN);
    public final ckhe b;
    public final btpc c;
    bvpk d;
    public btzc e;
    private final btvo f;
    private final bvrb g;
    private final cjqy h;
    private final buqw i;

    public beih(ckcw ckcwVar, btvo btvoVar, btpc btpcVar, buqw buqwVar, bvrb bvrbVar, cjqy cjqyVar) {
        this.f = btvoVar;
        this.c = btpcVar;
        this.b = (ckhe) ckcwVar.a(ckix.c);
        this.i = buqwVar;
        this.g = bvrbVar;
        this.h = cjqyVar;
    }

    @Override // defpackage.beia
    public final boolean a(ilo iloVar) {
        if (!b() || !iloVar.M().a()) {
            return false;
        }
        dfzy b = dfzy.b(iloVar.M().b().a);
        if (b == null) {
            b = dfzy.UNKNOWN_DYNAMIC_ALLOCATION_SOURCE;
        }
        return b == dfzy.CALL_TRACKING;
    }

    public final boolean b() {
        return this.f.getBusinessCallsParameters().a;
    }

    @Override // defpackage.beia
    public final void c(ilo iloVar, bmdn bmdnVar, dbsg<cjqm> dbsgVar) {
        dies bZ = diet.f.bZ();
        dnqg bZ2 = dnqh.p.bZ();
        int i = ddda.at.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ2.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        dnqh bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        diet dietVar = (diet) bZ.b;
        bK.getClass();
        dietVar.b = bK;
        dietVar.a |= 1;
        String cQ = iloVar.cQ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        diet dietVar2 = (diet) bZ.b;
        cQ.getClass();
        dietVar2.a |= 4;
        dietVar2.c = cQ;
        String L = iloVar.L();
        dbsk.s(L);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        diet dietVar3 = (diet) bZ.b;
        L.getClass();
        dietVar3.a |= 8;
        dietVar3.d = L;
        dpmv b = iloVar.M().b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        diet dietVar4 = (diet) bZ.b;
        b.getClass();
        dietVar4.e = b;
        dietVar4.a |= 16;
        this.e = this.i.b(bZ.bK(), new beig(this, dbsgVar, bmdnVar), this.g.h());
        bvpk a2 = bvpk.a(new Runnable(this) { // from class: beif
            private final beih a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                btzc btzcVar = this.a.e;
                if (btzcVar != null) {
                    btzcVar.a();
                }
            }
        });
        this.d = a2;
        this.g.a(a2, bvrj.UI_THREAD, this.f.getOfflineMapsParameters().K);
        this.b.a();
        final bmdu bmduVar = bmdnVar.a;
        new Handler().postDelayed(new Runnable(bmduVar) { // from class: bmdt
            private final bmdu a;

            {
                this.a = bmduVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bmdu bmduVar2 = this.a;
                if (bmduVar2.c || bmduVar2.a.isFinishing()) {
                    return;
                }
                bmduVar2.b.show();
            }
        }, 300L);
    }

    public final void d(ddda dddaVar, dbsg<cjqm> dbsgVar) {
        cjsx i = cjsy.i();
        i.b(dddaVar);
        cjsy a2 = i.a();
        if (dbsgVar.a()) {
            this.h.K(a2, dbsgVar.b());
        } else {
            this.h.k(a2);
        }
    }
}
