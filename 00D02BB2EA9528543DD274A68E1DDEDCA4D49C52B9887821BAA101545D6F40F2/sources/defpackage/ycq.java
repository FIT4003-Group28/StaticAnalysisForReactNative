package defpackage;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ycq  reason: default package */
/* loaded from: classes7.dex */
public class ycq implements xzt {
    public final ycu a;
    int b;
    private final Activity c;
    private final btvo d;
    private final btth e;
    private final vwv f;
    private final dxio<dbsg<arkd>> g;
    private final byzd h;
    private final btpc i;
    private final xzb j;
    private final byyp k;
    private final amub l;
    private final cjta m;
    @dzsi
    private final yal n;
    @dzsi
    private final Integer o;
    @dzsi
    private final amvh p;
    private boolean q;
    private final bzgj r;
    private final bzgf s;
    private final bzgf t;

    public ycq(Activity activity, btvo btvoVar, cqhn cqhnVar, byyp byypVar, Executor executor, ahjq ahjqVar, vwv vwvVar, ycu ycuVar, dxio<dbsg<arkd>> dxioVar, byzd byzdVar, btpc btpcVar, xzb xzbVar, amub amubVar, cjta cjtaVar, @dzsi yal yalVar, @dzsi Integer num, @dzsi amvh amvhVar, boolean z) {
        bzgj bzgjVar = new bzgj();
        this.r = bzgjVar;
        bzgf bzgfVar = new bzgf(this) { // from class: yco
            private final ycq a;

            {
                this.a = this;
            }

            @Override // defpackage.bzgf
            public final void a() {
                cqkx.p(this.a);
            }
        };
        this.s = bzgfVar;
        bzgf bzgfVar2 = new bzgf(this) { // from class: ycp
            private final ycq a;

            {
                this.a = this;
            }

            @Override // defpackage.bzgf
            public final void a() {
                ycq ycqVar = this.a;
                ycqVar.b = ycqVar.a.b();
                cqkx.p(ycqVar);
            }
        };
        this.t = bzgfVar2;
        this.c = activity;
        this.d = btvoVar;
        this.k = byypVar;
        this.e = ahjqVar;
        this.f = vwvVar;
        this.a = ycuVar;
        this.g = dxioVar;
        this.h = byzdVar;
        this.i = btpcVar;
        this.j = xzbVar;
        this.l = amubVar;
        this.m = cjtaVar;
        this.n = yalVar;
        this.o = num;
        this.p = amvhVar;
        this.q = z;
        if (yalVar != null) {
            yalVar.g(this);
        }
        bzgg.b(bzgfVar, byypVar, bzgjVar, executor);
        ycuVar.a(amubVar.q(num.intValue()));
        bzgg.b(bzgfVar2, ycuVar, bzgjVar, executor);
        this.b = ycuVar.b();
    }

    private final boolean p() {
        return this.e.y() != null && this.p != null && this.b == 4 && this.i.i();
    }

    @Override // defpackage.xyv
    public void a(Context context) {
    }

    @Override // defpackage.xyv
    public boolean b() {
        return false;
    }

    @Override // defpackage.xyz
    public Boolean c() {
        return Boolean.valueOf(this.q);
    }

    @Override // defpackage.xyz
    public void d(boolean z) {
        this.q = true;
        yal yalVar = this.n;
        if (yalVar != null) {
            yalVar.a = true;
        }
        cqkx.p(this);
    }

    @Override // defpackage.xyz
    @dzsi
    public xyy e() {
        if (this.k.c().a(this.l)) {
            return null;
        }
        return this.n;
    }

    @Override // defpackage.xzt
    public xzb f() {
        return this.j;
    }

    @Override // defpackage.xzt
    public Boolean g() {
        int a;
        int a2 = dwny.a(this.d.getTransitTrackingParameters().A);
        boolean z = false;
        if (a2 != 0 && a2 != 2 && ((a = dwny.a(this.d.getTransitTrackingParameters().A)) == 0 || a != 1)) {
            int a3 = dwny.a(this.d.getTransitTrackingParameters().A);
            if ((a3 == 0 || a3 != 3 || !this.k.c().a(this.l)) && this.e.y() != null) {
                amub amubVar = this.l;
                dbsk.s(amubVar);
                if (zba.g(amubVar, this.o, this.e, this.f)) {
                    if (this.b == 4) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.xzt
    public cqkl h() {
        if (!this.g.a().a()) {
            return cqkl.a;
        }
        Location y = this.e.y();
        if (!p() || y == null) {
            if (!this.i.i()) {
                ckos.b(this.c.findViewById(16908290), R.string.ARWN_SNACKBAR_NO_NETWORK_CONNECTIVITY, 0).c();
            } else {
                ckos.b(this.c.findViewById(16908290), R.string.ARWN_UNAVAILABLE_AREA_DIRECTIONS, 0).c();
            }
            return cqkl.a;
        }
        bzdk c = this.k.c();
        if (c.h() == bzdj.STARTED && !c.c(this.l)) {
            this.k.f(bzdd.d);
        }
        this.h.i();
        akqq akqqVar = new akqq(y.getLatitude(), y.getLongitude());
        qcw x = qcx.x();
        x.r(amvh.g(this.c, akqqVar));
        x.u(this.p);
        x.s(dqvj.WALK);
        duqb bZ = duqc.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duqc.c((duqc) bZ.b);
        x.t(bZ.bK());
        x.d(true);
        qcx a = x.a();
        arke c2 = arkf.c();
        ((arkg) c2).b = a;
        this.g.a().b().a(c2.a());
        return cqkl.a;
    }

    @Override // defpackage.xzt
    public CharSequence i() {
        return this.c.getString(R.string.ARWN_LIVE_VIEW);
    }

    @Override // defpackage.xzt
    public CharSequence j() {
        return this.c.getString(R.string.ARWN_START_AR_DESCRIPTION);
    }

    @Override // defpackage.xzt
    public cqss k() {
        return p() ? ibm.p() : ibm.k();
    }

    @Override // defpackage.xzt
    public cqss l() {
        return p() ? ibm.b() : ibm.g();
    }

    @Override // defpackage.xzt
    public cqss m() {
        return p() ? ibm.j() : ibm.h();
    }

    @Override // defpackage.xzt
    public cjtd n() {
        return this.m.b(dtxn.ai);
    }

    @Override // defpackage.xzt
    @dzsi
    public cqtd o() {
        if (p()) {
            return cqrt.f(2131232778);
        }
        return cqrt.i(cqrt.f(2131232776), ibm.k());
    }
}
