package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqst  reason: default package */
/* loaded from: classes2.dex */
public final class aqst extends ges {
    public cqkj a;
    public btlu ad;
    private cqkf<aquv> ae;
    private crzp<btlu> af;
    public aqvj b;
    public efg c;
    public apyu d;
    public akfa e;
    public Executor f;
    public dehq g;

    @Override // defpackage.ges
    protected final void Nv() {
        ((aqsu) btsx.b(aqsu.class, this)).cf(this);
    }

    @Override // defpackage.ges, defpackage.ggg
    public final List<gfs> aO() {
        return dcdc.e();
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cqkf<aquv> e = this.a.e(new aquc());
        this.ae = e;
        return e.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        if (bundle2 != null) {
            bundle2.getString("business_listing_id", "");
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxv.bG;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        aqvj aqvjVar = this.b;
        Runnable runnable = new Runnable(this) { // from class: aqsp
            private final aqst a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aqst aqstVar = this.a;
                aqstVar.Q().g(aqstVar.bc(), 1);
            }
        };
        Runnable runnable2 = new Runnable(this) { // from class: aqsq
            private final aqst a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aqst aqstVar = this.a;
                apyu apyuVar = aqstVar.d;
                dbsk.s(aqstVar.ad);
                apzy apzyVar = ((apwn) apyuVar).c;
                deha.q(deha.c(), new aqss(aqstVar.J(), aqstVar.bc()), aqstVar.g);
            }
        };
        Activity activity = (Activity) ((dxjd) aqvjVar.a).a;
        aqvj.a(activity, 1);
        apzy a = aqvjVar.b.a();
        aqvj.a(a, 2);
        aqvj.a(runnable, 3);
        aqvj.a(runnable2, 4);
        aqvi aqviVar = new aqvi(activity, a, runnable, runnable2);
        cqkf<aquv> cqkfVar = this.ae;
        dbsk.s(cqkfVar);
        cqkfVar.e(aqviVar);
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ag(null);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        this.c.a(egjVar.a());
        if (this.af == null) {
            this.af = new crzp(this) { // from class: aqsr
                private final aqst a;

                {
                    this.a = this;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    this.a.ad = (btlu) crzmVar.l();
                }
            };
            crzm<btlu> C = this.e.C();
            crzp<btlu> crzpVar = this.af;
            dbsk.s(crzpVar);
            C.d(crzpVar, this.f);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        this.ae.e(null);
        if (this.af != null) {
            crzm<btlu> C = this.e.C();
            crzp<btlu> crzpVar = this.af;
            dbsk.s(crzpVar);
            C.c(crzpVar);
            this.af = null;
        }
    }
}
