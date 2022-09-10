package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zgy  reason: default package */
/* loaded from: classes7.dex */
public class zgy implements izk {
    public final cqhn a;
    public final Activity b;
    public final pot c;
    public final Runnable d;
    @dzsi
    public amub e;
    public List<dqtx> f = dcdc.e();
    public boolean g = false;
    public boolean h = false;
    private final bvjj i;
    private final cjqq j;
    private final pnq k;
    private final pnw l;
    @dzsi
    private final String m;

    public zgy(btvo btvoVar, bvjj bvjjVar, cqhn cqhnVar, cjqq cjqqVar, Activity activity, pnq pnqVar, pnw pnwVar, pot potVar, Runnable runnable) {
        this.i = bvjjVar;
        this.a = cqhnVar;
        this.j = cjqqVar;
        this.b = activity;
        this.d = runnable;
        this.k = pnqVar;
        this.l = pnwVar;
        this.c = potVar;
        dvdz M = btvoVar.getNavigationParameters().M();
        this.m = (M.a & 1) != 0 ? M.b : null;
    }

    private final dbsg<dvdy> i() {
        return this.c.d(this.f);
    }

    private final boolean j() {
        return pot.c(this.i.s(bvjk.jm, 0));
    }

    private final void k() {
        this.i.P(bvjk.jm);
        this.i.P(bvjk.jn);
        this.k.u();
    }

    private final boolean l() {
        amub amubVar = this.e;
        return amubVar != null && (amubVar.h == dqvj.DRIVE || this.e.h == dqvj.TWO_WHEELER);
    }

    private final boolean m() {
        if (i().a()) {
            dvdx dvdxVar = i().b().k;
            if (dvdxVar == null) {
                dvdxVar = dvdx.c;
            }
            return (dvdxVar.a & 1) != 0;
        }
        return false;
    }

    @Override // defpackage.izk
    @dzsi
    public jic b() {
        if (!a().booleanValue()) {
            return null;
        }
        return new jic(i().b().h, ckqc.FULLY_QUALIFIED, 0);
    }

    @Override // defpackage.izk
    public cqkl c() {
        h(i());
        return cqkl.a;
    }

    @Override // defpackage.izk
    @dzsi
    public cjtd d() {
        return cjtd.a(dtxl.iw);
    }

    @Override // defpackage.izk
    public Boolean e() {
        boolean z = false;
        if (!j() || m()) {
            return false;
        }
        if (!this.c.a(this.i.s(bvjk.jm, 0)).a()) {
            k();
            return false;
        }
        amub amubVar = this.e;
        if (amubVar != null && amubVar.j().k() && i().a() && l()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.izk
    public cqkl f() {
        k();
        cqkx.p(this);
        ckos.a(this.b.findViewById(16908290), this.b.getResources().getString(R.string.CUSTOM_CHEVRON_PROMO_OPT_OUT_CONFIRMATION), 0).c();
        return cqkl.a;
    }

    @Override // defpackage.izk
    @dzsi
    public cjtd g() {
        return cjtd.a(dtxl.ix);
    }

    public final void h(dbsg<dvdy> dbsgVar) {
        if (this.m == null || !dbsgVar.a() || (dbsgVar.b().a & 8192) == 0) {
            return;
        }
        this.g = true;
        if (m()) {
            pnw pnwVar = this.l;
            dvdx dvdxVar = dbsgVar.b().k;
            if (dvdxVar == null) {
                dvdxVar = dvdx.c;
            }
            pnwVar.b(dvdxVar.b, this.m, dbsgVar.b().i, dbsgVar.b().b, new Runnable(this) { // from class: zgw
                private final zgy a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zgy zgyVar = this.a;
                    cqkx.p(zgyVar);
                    zgyVar.d.run();
                }
            });
            return;
        }
        this.l.a(this.m, i().b(), new Runnable(this) { // from class: zgx
            private final zgy a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zgy zgyVar = this.a;
                cqkx.p(zgyVar);
                zgyVar.d.run();
            }
        });
    }

    @Override // defpackage.izk
    public Boolean a() {
        amub amubVar = this.e;
        if (amubVar == null || !this.h || !amubVar.j().k() || !l() || this.m == null) {
            return false;
        }
        if (j() && !m()) {
            return false;
        }
        boolean a = i().a();
        if (!a) {
            cjqp g = this.j.g();
            cjta b = cjtd.b();
            b.d = dtxl.iw;
            b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
            g.d(b.a());
        }
        return Boolean.valueOf(a);
    }
}
