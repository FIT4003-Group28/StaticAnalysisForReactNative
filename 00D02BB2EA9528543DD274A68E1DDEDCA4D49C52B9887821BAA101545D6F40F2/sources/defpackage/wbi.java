package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.directions.routepreview.routefetching.RoutePreviewLauncherParameters;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wbi  reason: default package */
/* loaded from: classes7.dex */
public final class wbi extends ges {
    @dzsi
    wbe ad;
    @dzsi
    private asjt af;
    public dxio<vzi> b;
    public bwqv c;
    public efg d;
    public asjs e;
    public wbf f;
    @dzsi
    public RoutePreviewLauncherParameters g;
    private static final dcqe ae = dcqe.c("wbi");
    public static final String a = String.valueOf(wbi.class.getName()).concat(".Parameters");

    public wbi() {
        bvrj.UI_THREAD.c();
    }

    private static void g() {
        bvoo.h("RoutePreviewLauncherFragment started without valid arguments. Use RoutePreviewLauncherFragment.newInstance() to correctly instantiate a RoutePreviewLauncherFragment.", new Object[0]);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        bvrj.UI_THREAD.c();
        this.af = null;
        super.Qe();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        bvrj.UI_THREAD.c();
        super.ag(layoutInflater, viewGroup, bundle);
        asjs asjsVar = this.e;
        asjt asjtVar = new asjt(asjsVar.c);
        asjtVar.c(asjsVar.a, asjsVar.b, null);
        this.af = asjtVar;
        return null;
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        bvrj.UI_THREAD.c();
        RoutePreviewLauncherParameters routePreviewLauncherParameters = this.g;
        dbsk.s(routePreviewLauncherParameters);
        int i = routePreviewLauncherParameters.d;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                return i2 == 3;
            }
            bvoo.h("Impossible State.START", new Object[0]);
            return false;
        }
        throw null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        bvrj.UI_THREAD.c();
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        if (bundle == null) {
            g();
            return;
        }
        RoutePreviewLauncherParameters routePreviewLauncherParameters = (RoutePreviewLauncherParameters) bundle.getParcelable(a);
        this.g = routePreviewLauncherParameters;
        if (routePreviewLauncherParameters != null) {
            return;
        }
        g();
    }

    @Override // defpackage.ges
    public final ddho p() {
        bvrj.UI_THREAD.c();
        return dtya.eZ;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        bvrj.UI_THREAD.c();
        super.s();
        RoutePreviewLauncherParameters routePreviewLauncherParameters = this.g;
        dbsk.s(routePreviewLauncherParameters);
        if (routePreviewLauncherParameters.b) {
            asjt asjtVar = this.af;
            dbsk.s(asjtVar);
            View a2 = asjtVar.a();
            efg efgVar = this.d;
            egj egjVar = new egj(this);
            egjVar.ag(null);
            egjVar.w(a2);
            egjVar.e(this);
            efgVar.a(egjVar.a());
        }
        if (this.ad == null) {
            wbf wbfVar = this.f;
            wbh wbhVar = new wbh(this);
            Executor a3 = wbfVar.a.a();
            boolean z = true;
            wbf.a(a3, 1);
            btrm a4 = wbfVar.b.a();
            wbf.a(a4, 2);
            dzsj<srv> dzsjVar = wbfVar.c;
            wbf.a(wbhVar, 4);
            wbe wbeVar = new wbe(a3, a4, dzsjVar, wbhVar);
            this.ad = wbeVar;
            bvrj.UI_THREAD.c();
            wbh wbhVar2 = wbeVar.f;
            if (wbhVar2 == null) {
                return;
            }
            int i = wbhVar2.a().d;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                bvoo.h("Impossible State.START", new Object[0]);
            } else if (i2 != 1) {
                if (i2 == 2) {
                    wbeVar.c();
                } else if (i2 != 3) {
                } else {
                    wbeVar.d();
                }
            } else {
                bvrj.UI_THREAD.c();
                wbh wbhVar3 = wbeVar.f;
                if (wbhVar3 == null) {
                    return;
                }
                dbsk.l(wbhVar3.a().d == 2);
                wbh wbhVar4 = wbeVar.f;
                dbsk.s(wbhVar4);
                if (wbhVar4.a().c != null) {
                    z = false;
                }
                dbsk.l(z);
                if (wbeVar.d != null) {
                    return;
                }
                btrm btrmVar = wbeVar.b;
                wbd wbdVar = wbeVar.e;
                dceq a5 = dcet.a();
                a5.b(srf.class, new wbg(srf.class, wbdVar, bvrj.UI_THREAD));
                btrmVar.g(wbdVar, a5.a());
                wbeVar.d = wbeVar.c.a();
                srv srvVar = wbeVar.d;
                wbh wbhVar5 = wbeVar.f;
                dbsk.s(wbhVar5);
                vun vunVar = wbhVar5.a().a;
                dbsk.s(vunVar);
                srvVar.j(vunVar, null);
            }
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        bvrj.UI_THREAD.c();
        super.t(bundle);
        bundle.putParcelable(a, this.g);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        bvrj.UI_THREAD.c();
        wbe wbeVar = this.ad;
        if (wbeVar != null) {
            bvrj.UI_THREAD.c();
            wbeVar.f = null;
            wbeVar.a();
            this.ad = null;
        }
        asjt asjtVar = this.af;
        dbsk.s(asjtVar);
        asjtVar.b();
        super.u();
    }
}
