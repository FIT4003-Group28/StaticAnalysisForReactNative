package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: mrl  reason: default package */
/* loaded from: classes7.dex */
public final class mrl extends nor {
    public final kdi a;
    public final nop b;
    public final not c;
    public final asmp d;
    public final mtp e;
    public final msx f;
    public final nti g;
    private final kxu h;
    private final cqkf<mtg> i;
    private final msv j;
    @dzsi
    private kxs k;

    public mrl(kdi kdiVar, nop nopVar, not notVar, ksr ksrVar, lzf lzfVar, dcdc dcdcVar, cqkj cqkjVar, noo nooVar, kxu kxuVar, mtq mtqVar, cjqy cjqyVar, cjqq cjqqVar, asmp asmpVar, mtd mtdVar, msv msvVar) {
        super(cjqyVar, cjqqVar);
        this.a = kdiVar;
        this.b = nopVar;
        this.c = notVar;
        this.h = kxuVar;
        this.d = asmpVar;
        this.j = msvVar;
        Context context = cqkjVar.d;
        mri mriVar = new mri(this);
        mtd.a(dcdcVar, 1);
        mtd.a(lzfVar, 2);
        mtd.a(ksrVar, 3);
        mtd.a(context, 4);
        mtd.a(mriVar, 5);
        mtd.a(msvVar, 6);
        ckcw a = mtdVar.a.a();
        mtd.a(a, 7);
        mtc mtcVar = new mtc(dcdcVar, lzfVar, ksrVar, context, mriVar, msvVar, a);
        this.f = mtcVar;
        bvqg bvqgVar = new bvqg(this) { // from class: mrj
            private final mrl a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                mrl mrlVar = this.a;
                mrlVar.b.k(mrlVar.a.p(mrlVar.c, (ldm) obj, false));
            }
        };
        Context a2 = mtqVar.a.a();
        mtq.a(a2, 1);
        bvsl a3 = mtqVar.b.a();
        mtq.a(a3, 2);
        myg a4 = mtqVar.c.a();
        mtq.a(a4, 3);
        mtq.a(nooVar, 4);
        mtq.a(dcdcVar, 5);
        mtq.a(mtcVar, 6);
        mtq.a(bvqgVar, 7);
        mtq.a(msvVar, 8);
        this.e = new mtp(a2, a3, a4, nooVar, dcdcVar, mtcVar, bvqgVar, msvVar);
        cqkf<mtg> d = cqkjVar.d(new msu(), notVar.a(), false);
        this.i = d;
        View findViewById = d.c().findViewById(R.id.prenav_route_overview_paged_list_view);
        dbsk.s(findViewById);
        this.g = (nti) findViewById;
    }

    @Override // defpackage.nor, defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        mtc mtcVar = (mtc) this.f;
        mtcVar.c.a();
        mtcVar.c.h(mtcVar.f);
        if (mtcVar.b.get(0).u() != 2) {
            mtcVar.f();
        } else {
            mtcVar.h = msw.READY_TO_NAVIGATE;
        }
        this.e.v();
        this.i.e(this.e);
        View c = this.i.c();
        kxn k = kxo.k();
        k.k();
        this.k = new kxs(c, k, this.h);
        this.g.setOnScrollListener(new mrk(this));
        k();
    }

    @Override // defpackage.non
    @dzsi
    public final /* bridge */ /* synthetic */ noq b() {
        s(this.j == msv.INTENT_MULTIPLE_WAYPOINTS ? new cjsz(dtxm.dj) : new cjsz(dtxm.dk));
        kxs kxsVar = this.k;
        dbsk.s(kxsVar);
        kxsVar.a();
        l();
        mtc mtcVar = (mtc) this.f;
        mtcVar.i = true;
        mtcVar.h();
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.i.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        t();
        mtc mtcVar = (mtc) this.f;
        mtcVar.i = false;
        mtcVar.h();
        this.d.B();
        kxs kxsVar = this.k;
        dbsk.s(kxsVar);
        kxsVar.b();
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
        this.d.D(null);
        this.g.setOnScrollListener(null);
        this.k = null;
        this.i.f();
        mtc mtcVar = (mtc) this.f;
        mtcVar.c.i(mtcVar.f);
        mtcVar.c.b();
    }

    @Override // defpackage.non
    public final String g() {
        return "PreNavRouteOverviewOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.c.b(noeVar, this.i.c());
    }

    public final void k() {
        amub b = this.f.b();
        if (b == null) {
            return;
        }
        asmp asmpVar = this.d;
        astf f = astg.f();
        f.e(amuh.d(b));
        f.d(alfa.SHOW_NONE);
        f.f(vuu.c);
        f.c(true);
        f.b(true);
        asmpVar.D(f.a());
    }

    public final void l() {
        amub b = this.f.b();
        if (b == null) {
            return;
        }
        this.d.A(true, new aslo(b, 0, b.D));
    }
}
