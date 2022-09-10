package defpackage;

import android.support.v4.widget.NestedScrollView;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: cgdh  reason: default package */
/* loaded from: classes4.dex */
final class cgdh implements Runnable {
    final /* synthetic */ cgdv a;

    public cgdh(cgdv cgdvVar) {
        this.a = cgdvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean b;
        cgdv cgdvVar = this.a;
        if (cgdvVar.aD) {
            NestedScrollView bM = cgdv.bM(cgdvVar.e.H());
            if (bM != null) {
                bM.scrollTo(0, cgdvVar.ag);
            }
            if (this.a.at.l().L().b()) {
                this.a.by();
            } else {
                cged cgedVar = this.a.ad;
                alad aladVar = cgedVar.e;
                cgem cgemVar = cgedVar.i;
                if (aladVar == null || (cgemVar != cgem.URL_INTENT && !cgdv.bL(cgemVar))) {
                    if (this.a.bD()) {
                        cgdv cgdvVar2 = this.a;
                        GmmLocation a = cgdvVar2.bc.a().a();
                        if (a != null) {
                            alad aladVar2 = cgdvVar2.ad.e;
                            if (aladVar2 != null) {
                                b = akyx.m(cgdvVar2.bj.d.Y(aladVar2)).b(a.B());
                            } else {
                                akqs a2 = alao.a(cgdvVar2.bj.d);
                                if (a2 != null) {
                                    b = a2.b(a.B());
                                }
                            }
                            if (b) {
                                this.a.bj.c().l();
                            }
                        }
                    }
                    this.a.bF();
                } else {
                    this.a.bK(aladVar.i, aladVar.k);
                }
            }
        }
        cgwg cgwgVar = this.a.af;
        if (cgwgVar != null && cgwgVar.I().booleanValue()) {
            this.a.af.u(cgwf.EDIT_COMPLETED);
        }
        this.a.e.E().f().booleanValue();
    }
}
