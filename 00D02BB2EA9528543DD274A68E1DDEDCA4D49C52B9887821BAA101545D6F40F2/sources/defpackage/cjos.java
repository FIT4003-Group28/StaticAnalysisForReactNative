package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment$SavedState;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: cjos  reason: default package */
/* loaded from: classes4.dex */
public final class cjos implements cjot {
    public static final /* synthetic */ int a = 0;
    private static final AtomicInteger b = new AtomicInteger(1);
    private final gga c;
    private final bwqv d;
    private final dxio<akfa> e;
    private final gfq f;
    private final dxio<aedv> g;
    private final ail<Integer, Fragment$SavedState> h = new ail<>(1);
    private final dxio<acyp> i;

    public cjos(gga ggaVar, bwqv bwqvVar, dxio<akfa> dxioVar, gfq gfqVar, dxio<aedv> dxioVar2, dxio<acyp> dxioVar3) {
        this.c = ggaVar;
        this.d = bwqvVar;
        this.e = dxioVar;
        this.f = gfqVar;
        this.g = dxioVar2;
        this.i = dxioVar3;
    }

    private final void g(@dzsi dspd dspdVar, @dzsi apzv apzvVar, @dzsi Fragment$SavedState fragment$SavedState, @dzsi cjpp cjppVar, boolean z) {
        cjpi cjpiVar;
        if (!this.f.e(cjoo.class) || z) {
            dcdc e = dcdc.e();
            if (this.i.a().f()) {
                e = dcdc.f(gfs.HOMETAB);
            }
            bwqv bwqvVar = this.d;
            btlu j = this.e.a().j();
            cjpj bZ = cjpk.e.bZ();
            agyi bZ2 = agyj.d.bZ();
            aciq bZ3 = acir.c.bZ();
            String h = btlu.h(j);
            if (h != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cjpk cjpkVar = (cjpk) bZ.b;
                h.getClass();
                cjpkVar.a |= 1;
                cjpkVar.b = h;
            }
            if (dspdVar != null) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                agyj agyjVar = (agyj) bZ2.b;
                dspdVar.getClass();
                agyjVar.a |= 2;
                agyjVar.c = dspdVar;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                acir acirVar = (acir) bZ3.b;
                dspdVar.getClass();
                acirVar.a |= 2;
                acirVar.b = dspdVar;
            }
            cjpl bZ4 = cjpm.f.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            cjpm cjpmVar = (cjpm) bZ4.b;
            agyj bK = bZ2.bK();
            bK.getClass();
            cjpmVar.b = bK;
            cjpmVar.a |= 1;
            cjpm bK2 = bZ4.bK();
            cjpf bZ5 = cjpg.d.bZ();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            cjpg cjpgVar = (cjpg) bZ5.b;
            acir bK3 = bZ3.bK();
            bK3.getClass();
            cjpgVar.b = bK3;
            cjpgVar.a |= 1;
            cjpg bK4 = bZ5.bK();
            if (apzvVar != null) {
                cjph bZ6 = cjpi.c.bZ();
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                cjpi cjpiVar2 = (cjpi) bZ6.b;
                apzvVar.getClass();
                cjpiVar2.b = apzvVar;
                cjpiVar2.a |= 1;
                cjpiVar = bZ6.bK();
            } else {
                cjpiVar = null;
            }
            Bundle bundle = new Bundle();
            bwqvVar.c(bundle, "us", bvrt.b(bZ.bK()));
            bwqvVar.c(bundle, "uss", bvrt.b(bK2));
            bwqvVar.c(bundle, "uffs", bvrt.b(bK4));
            if (cjpiVar != null) {
                bwqvVar.c(bundle, "ms", bvrt.b(cjpiVar));
            }
            cjoo cjooVar = new cjoo();
            cjooVar.B(bundle);
            cjooVar.E(fragment$SavedState);
            cjooVar.aW = cjppVar;
            cjooVar.aX = e;
            if (z) {
                gfq.m(cjooVar);
            }
            this.g.a().r(cjooVar, dktk.UPDATES);
        }
    }

    @Override // defpackage.cjot
    public final void a() {
        b(apzv.c);
    }

    @Override // defpackage.cjot
    public final void b(apzv apzvVar) {
        g(null, apzvVar, null, cjpp.MESSAGES, true);
    }

    @Override // defpackage.cjot
    public final void c(dspd dspdVar) {
        g(dspdVar, null, null, cjpp.FOR_YOU, true);
    }

    @Override // defpackage.cjot
    public final void d(final List<String> list) {
        g(null, null, null, null, true);
        final fd K = this.c.K();
        if (K instanceof cjoo) {
            new Handler().post(new Runnable(K, list) { // from class: cjor
                private final fd a;
                private final List b;

                {
                    this.a = K;
                    this.b = list;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    fd fdVar = this.a;
                    List<String> list2 = this.b;
                    int i = cjos.a;
                    ahin ahinVar = ((cjoo) fdVar).aR;
                    if (ahinVar != null) {
                        ahinVar.N(list2);
                    }
                }
            });
        }
    }

    @Override // defpackage.cjot
    public final void e(int i) {
        g(null, null, this.h.e(Integer.valueOf(i)), null, false);
    }

    @Override // defpackage.cjot
    public final int f(@dzsi fd fdVar) {
        if (fdVar instanceof cjoo) {
            agyj agyjVar = ((cjpm) ((cjoo) fdVar).aO.b).b;
            if (agyjVar == null) {
                agyjVar = agyj.d;
            }
            if ((agyjVar.a & 2) != 0) {
                return -1;
            }
            int andIncrement = b.getAndIncrement();
            gn gnVar = fdVar.A;
            dbsk.s(gnVar);
            ail<Integer, Fragment$SavedState> ailVar = this.h;
            Integer valueOf = Integer.valueOf(andIncrement);
            Fragment$SavedState r = gnVar.r(fdVar);
            dbsk.s(r);
            ailVar.c(valueOf, r);
            return andIncrement;
        }
        return -1;
    }
}
