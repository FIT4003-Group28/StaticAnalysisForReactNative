package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.shared.util.io.ProtoBufUtil$ParcelableProtoList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axfc  reason: default package */
/* loaded from: classes3.dex */
public final class axfc extends ges implements gfv {
    public cqkj a;
    private List<dpzz> ad;
    public efg b;
    public axox c;
    public akfa d;
    public bvjj e;
    private axow f;
    private cqkf<axol> g;

    private final dqfc g() {
        if (this.e.o(bvjk.hL, this.d.j(), true)) {
            return dqfc.PUBLIC;
        }
        return dqfc.PRIVATE;
    }

    @Override // defpackage.ges
    protected final void Nv() {
        ((axfd) btsx.b(axfd.class, this)).cs(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.g.e(null);
        super.Qe();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<axol> e = this.a.e(new axki());
        this.g = e;
        e.e(this.f);
        return this.g.c();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        gga ggaVar = this.aE;
        if (this.aD && ggaVar != null) {
            ggaVar.g().f();
        }
        Nw(axfa.a);
        return true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        ProtoBufUtil$ParcelableProtoList protoBufUtil$ParcelableProtoList = (ProtoBufUtil$ParcelableProtoList) this.o.getParcelable("onboardingDataList");
        dbsk.s(protoBufUtil$ParcelableProtoList);
        this.ad = protoBufUtil$ParcelableProtoList.a((dssr) dpzz.g.cu(7));
        axox axoxVar = this.c;
        dqfc g = g();
        List<dpzz> list = this.ad;
        Runnable runnable = new Runnable(this) { // from class: axez
            private final axfc a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                axfc axfcVar = this.a;
                axfcVar.Nw(axfb.a);
                gga ggaVar = axfcVar.aE;
                if (!axfcVar.aD || ggaVar == null) {
                    return;
                }
                ggaVar.g().f();
            }
        };
        dzsj<gga> dzsjVar = axoxVar.a;
        bsvn a = axoxVar.b.a();
        axox.a(a, 2);
        bvjj a2 = axoxVar.c.a();
        axox.a(a2, 3);
        akfa a3 = axoxVar.d.a();
        axox.a(a3, 4);
        cjqy a4 = axoxVar.e.a();
        axox.a(a4, 5);
        cqhn a5 = axoxVar.f.a();
        axox.a(a5, 6);
        Executor a6 = axoxVar.g.a();
        axox.a(a6, 7);
        cqat a7 = axoxVar.h.a();
        axox.a(a7, 8);
        axoi a8 = axoxVar.i.a();
        axox.a(a8, 9);
        axox.a(g, 10);
        axox.a(list, 11);
        axox.a(runnable, 12);
        this.f = new axow(dzsjVar, a, a2, a3, a4, a5, a6, a7, a8, g, list, runnable);
        this.e.T(bvjk.gW, this.d.j(), true);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        axow axowVar = this.f;
        dbsk.s(axowVar);
        axowVar.k(g());
        cqkx.p(this.f);
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egjVar.w(this.P);
        egjVar.e(this);
        this.b.a(egjVar.a());
    }
}
