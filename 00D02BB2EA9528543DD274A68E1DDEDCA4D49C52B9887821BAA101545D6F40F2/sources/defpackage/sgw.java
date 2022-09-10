package defpackage;

import android.app.Activity;
import android.app.Application;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: sgw  reason: default package */
/* loaded from: classes7.dex */
public class sgw implements sbb {
    private static final dcqe b = dcqe.c("sgw");
    public final ros a;
    private final Activity c;
    private final sfc d;
    private final eeu e;
    private final sgt f;
    private final dxio<ckcw> g;
    private final dxio<bvjj> h;
    private final boolean i;
    private final boolean j;
    private final shb k;

    public sgw(Activity activity, cqhn cqhnVar, qqh qqhVar, sfd sfdVar, eeu eeuVar, shc shcVar, sgt sgtVar, dxio<ckcw> dxioVar, dxio<bvjj> dxioVar2, ros rosVar, btvo btvoVar, rzp rzpVar, dndr dndrVar, dndr dndrVar2) {
        ddho ddhoVar;
        dbsk.a(dndrVar.equals(dndr.HOME) || dndrVar.equals(dndr.WORK));
        dbsk.a(dndrVar2.equals(dndr.HOME) || dndrVar2.equals(dndr.WORK));
        dbsk.a(dndrVar != dndrVar2);
        this.c = activity;
        this.e = eeuVar;
        this.f = sgtVar;
        this.g = dxioVar;
        this.h = dxioVar2;
        this.a = rosVar;
        boolean z = dndrVar == dndr.HOME && dndrVar2 == dndr.WORK;
        this.i = z;
        Application a = shcVar.a.a();
        shc.a(a, 1);
        cqhn a2 = shcVar.b.a();
        shc.a(a2, 2);
        qjk a3 = shcVar.c.a();
        shc.a(a3, 3);
        shu a4 = shcVar.d.a();
        shc.a(a4, 4);
        sic a5 = shcVar.e.a();
        shc.a(a5, 5);
        sdz a6 = shcVar.f.a();
        shc.a(a6, 6);
        qsm a7 = shcVar.g.a();
        shc.a(a7, 7);
        vox a8 = shcVar.h.a();
        shc.a(a8, 8);
        sgc a9 = shcVar.i.a();
        shc.a(a9, 9);
        akox a10 = shcVar.j.a();
        boolean z2 = z;
        shc.a(a10, 10);
        rln a11 = shcVar.k.a();
        shc.a(a11, 11);
        btvo a12 = shcVar.l.a();
        shc.a(a12, 12);
        shc.a(dndrVar, 13);
        shc.a(dndrVar2, 14);
        this.k = new shb(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, dndrVar, dndrVar2);
        int i = true != z2 ? R.string.TRANSIT_ROUTE_TO_HOME_PAGE_TITLE : R.string.TRANSIT_ROUTE_TO_WORK_PAGE_TITLE;
        ddho ddhoVar2 = z2 ? dtxl.dO : dtxl.dL;
        if (z2) {
            ddhoVar = dtxl.dP;
        } else {
            ddhoVar = dtxl.dM;
        }
        this.d = sfdVar.a(i, ddhoVar2, ddhoVar, rzpVar);
        this.j = btvoVar.getCommuteSetupParameters().m;
    }

    private final void f(int i) {
        ckgz ckgzVar;
        if (this.i) {
            ckgzVar = ckeo.k;
        } else {
            ckgzVar = ckeo.l;
        }
        ((ckco) this.g.a().a(ckgzVar)).a(i - 1);
    }

    private final void g(int i) {
        ((ckco) this.g.a().a(ckeo.h)).a(i - 1);
    }

    @Override // defpackage.jbk
    public jib NC() {
        jhz e = this.d.e();
        e.x = true;
        return e.b();
    }

    @Override // defpackage.sbb
    public sbd b() {
        return this.k;
    }

    public void c() {
        this.k.g();
    }

    public void d() {
        this.k.q(new sbc(this) { // from class: sgu
            private final sgw a;

            {
                this.a = this;
            }

            @Override // defpackage.sbc
            public final void a() {
                cqkx.p(this.a);
            }
        });
        this.k.i();
    }

    public void e() {
        this.k.k();
        this.k.q(null);
    }

    @Override // defpackage.sav
    public Boolean l() {
        return Boolean.valueOf(!this.d.c());
    }

    @Override // defpackage.sav
    public Boolean m() {
        return false;
    }

    @Override // defpackage.sav
    public Boolean n() {
        boolean z = true;
        if (!this.k.c().booleanValue() && !this.k.b().booleanValue() && this.k.o() == null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.sav
    public cqkl o() {
        ror rorVar;
        ckgz ckgzVar;
        dcdc<amub> e;
        if (!this.e.b()) {
            return cqkl.a;
        }
        boolean z = this.i;
        int i = z ? 1 : 2;
        if (z) {
            rorVar = ror.TRANSIT_ROUTE_BUILDER_TO_WORK;
        } else {
            rorVar = ror.TRANSIT_ROUTE_BUILDER_TO_HOME;
        }
        if (this.k.b().booleanValue()) {
            this.f.b(i, this.d);
            f(4);
        } else {
            int i2 = 5;
            if (this.k.c().booleanValue()) {
                this.f.b(i, this.d);
                f(5);
            } else {
                amte l = this.k.l();
                sbe o = this.k.o();
                if (l == null || o == null) {
                    return cqkl.a;
                }
                if (o == this.k.n()) {
                    this.f.b(i, this.d);
                    f(1);
                    sfc sfcVar = this.d;
                    return sfcVar.a(sfcVar.b());
                } else if (o == this.k.m()) {
                    this.f.b(i, this.d);
                    f(3);
                    this.h.a().S(this.i ? bvjk.il : bvjk.ik, true);
                    sfc sfcVar2 = this.d;
                    return sfcVar2.a(sfcVar2.b().f(rzo.b(rorVar)));
                } else {
                    int g = o.g();
                    dnlc b2 = qqh.b(2);
                    amsy amsyVar = l.a;
                    dbsk.e(g >= 0 && g < amsyVar.n(), "Invalid index %s", g);
                    dnlg a = qqh.a(b2, amsyVar.m(g));
                    amub b3 = l.b(g, this.c);
                    this.f.a(i, this.d, a, b3 == null ? dcdc.e() : dcdc.f(b3));
                    if (b3 == null) {
                        bvoo.h("Could not find directions with index %d", Integer.valueOf(g));
                        return cqkl.a;
                    }
                    if (this.i) {
                        ckgzVar = ckeo.m;
                    } else {
                        ckgzVar = ckeo.n;
                    }
                    ((ckco) this.g.a().a(ckgzVar)).a(g);
                    f(2);
                    if (this.j && i == 1) {
                        dbsg<Future<rlm>> p = this.k.p();
                        if (p.a()) {
                            Future<rlm> b4 = p.b();
                            if (b4.isDone()) {
                                try {
                                    dbsg<dnlg> a2 = b4.get().a();
                                    rll c = b4.get().c();
                                    rll rllVar = rll.SUCCESS;
                                    switch (c.ordinal()) {
                                        case 0:
                                            i2 = 2;
                                            break;
                                        case 1:
                                            break;
                                        case 2:
                                            i2 = 6;
                                            break;
                                        case 3:
                                            i2 = 7;
                                            break;
                                        case 4:
                                            i2 = 8;
                                            break;
                                        case 5:
                                            i2 = 9;
                                            break;
                                        case 6:
                                            i2 = 10;
                                            break;
                                        case 7:
                                            i2 = 11;
                                            break;
                                        case 8:
                                            i2 = 12;
                                            break;
                                        default:
                                            bvoo.h("Unknown RouteReverser status: %s", c);
                                            i2 = 1;
                                            break;
                                    }
                                    g(i2);
                                    if (a2.a()) {
                                        dbsg<amub> b5 = b4.get().b();
                                        if (!b5.a()) {
                                            e = dcdc.e();
                                        } else {
                                            e = dcdc.f(b5.b());
                                        }
                                        this.f.a(2, this.d, a2.b(), e);
                                        dafk b6 = ckos.b(this.c.findViewById(16908290), R.string.COMMUTE_SETUP_AUTO_REVERSED_ROUTE_MESSAGE, 0);
                                        b6.t(R.string.COMMUTE_SETUP_AUTO_REVERSED_ROUTE_ACTION_LABEL, new View.OnClickListener(this) { // from class: sgv
                                            private final sgw a;

                                            {
                                                this.a = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                this.a.a.n(ror.TRANSIT_ROUTE_TO_HOME);
                                            }
                                        });
                                        b6.c();
                                        sfc sfcVar3 = this.d;
                                        return sfcVar3.a(sfcVar3.b().f(rzo.b(rorVar, ror.TRANSIT_ROUTE_BUILDER_TO_HOME, ror.TRANSIT_ROUTE_TO_HOME)));
                                    }
                                } catch (InterruptedException | ExecutionException unused) {
                                    g(4);
                                }
                            } else {
                                g(3);
                            }
                        }
                    }
                }
            }
        }
        sfc sfcVar4 = this.d;
        return sfcVar4.a(sfcVar4.b().f(rzo.b(rorVar)));
    }

    @Override // defpackage.sav
    public cjtd p() {
        return this.d.b;
    }

    @Override // defpackage.sav
    public cqkl q() {
        return this.d.d();
    }

    @Override // defpackage.sav
    public cjtd r() {
        return this.d.a;
    }

    @Override // defpackage.sav
    public Boolean s() {
        return sau.a();
    }

    @Override // defpackage.sav
    public rzp t() {
        return this.d.c;
    }
}
