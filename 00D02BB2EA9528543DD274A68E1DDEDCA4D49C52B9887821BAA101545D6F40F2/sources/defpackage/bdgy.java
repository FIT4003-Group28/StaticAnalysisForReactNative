package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bdgy  reason: default package */
/* loaded from: classes3.dex */
public final class bdgy extends ges {
    @dzsi
    bwrs<bdhg> a;
    private cqkf<bdim> ad;
    private bbuq ae;
    public bwqv b;
    public cqkj c;
    public efg d;
    public dxio<amfi> e;
    public bdjd f;
    private bdjc g;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<bdim> cqkfVar = this.ad;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        Nw(obj);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<bdim> c = this.c.c(new bdhz(), null);
        this.ad = c;
        c.e(this.g);
        return this.ad.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        View view = this.P;
        if (view != null) {
            this.e.a().g((ViewGroup) view);
        }
        super.am();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        this.g.m();
        return true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ag(null);
        egjVar.e(this);
        egjVar.f(true);
        this.d.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.b.c(bundle, "photoUrlManager", this.ae);
        this.b.c(bundle, "option", this.a);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        Bundle bundle2;
        if (bundle != null) {
            bundle2 = bundle;
        } else {
            try {
                bundle2 = this.o;
            } catch (IOException e) {
                Throwable cause = e.getCause();
                dbsk.s(cause);
                dbue.b(cause);
                Throwable cause2 = e.getCause();
                dbsk.s(cause2);
                throw new RuntimeException(cause2);
            }
        }
        bbuq bbuqVar = (bbuq) this.b.d(bbuq.class, bundle2, "photoUrlManager");
        dbsk.s(bbuqVar);
        this.ae = bbuqVar;
        bwrs<bdhg> e2 = this.b.e(bdhg.class, bundle2, "option");
        dbsk.s(e2);
        this.a = e2;
        super.l(bundle);
        gga ggaVar = this.aE;
        dbsk.s(ggaVar);
        int a = cknv.a(ggaVar.getWindowManager());
        this.ae.a(a, a);
        final bdhg c = this.a.c();
        dbsk.s(c);
        bdjd bdjdVar = this.f;
        bbuq bbuqVar2 = this.ae;
        bdil bdilVar = new bdil(this, c) { // from class: bdgw
            private final bdgy a;
            private final bdhg b;

            {
                this.a = this;
                this.b = c;
            }

            @Override // defpackage.bdil
            public final void a(Map map) {
                this.a.Nw(bdhk.c(map, this.b));
            }
        };
        gga a2 = bdjdVar.a.a();
        bdjd.a(a2, 1);
        cqhn a3 = bdjdVar.b.a();
        bdjd.a(a3, 2);
        buti a4 = bdjdVar.c.a();
        bdjd.a(a4, 3);
        bdis a5 = bdjdVar.d.a();
        bdjd.a(a5, 4);
        bbut a6 = bdjdVar.e.a();
        bdjd.a(a6, 5);
        bdin a7 = bdjdVar.f.a();
        bdjd.a(a7, 6);
        gdc a8 = bdjdVar.g.a();
        bdjd.a(a8, 7);
        Handler a9 = bdjdVar.h.a();
        bdjd.a(a9, 8);
        bdjd.a(bbuqVar2, 9);
        bdjd.a(c, 10);
        bdjd.a(bdilVar, 11);
        bdjd.a(this, 12);
        bdjc bdjcVar = new bdjc(a2, a3, a4, a5, a6, a7, a8, a9, bbuqVar2, c, bdilVar, this);
        this.g = bdjcVar;
        bdjcVar.o();
    }
}
