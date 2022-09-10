package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: yci  reason: default package */
/* loaded from: classes7.dex */
public class yci implements xzp {
    public final amub a;
    public List<xyv> b;
    public final zfl c;
    @dzsi
    public final vmv d;
    public final xkl e;
    public final yac f;
    public final bvrb g;
    public vwh h;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    @dzsi
    private final xzi m;
    @dzsi
    private final qjh n;
    @dzsi
    private final pze o;
    private final gga p;
    private final dxio<afha> q;
    @dzsi
    private final xgv r;
    @dzsi
    private final doxp t;
    final bzgj i = new bzgj();
    private final bzgf s = new bzgf(this) { // from class: ycb
        private final yci a;

        {
            this.a = this;
        }

        @Override // defpackage.bzgf
        public final void a() {
            yci yciVar = this.a;
            yciVar.b = yciVar.f.a(yciVar.a, yciVar.c, yciVar.e, yciVar.d, yciVar.h);
            cqkx.p(yciVar);
        }
    };

    public yci(gga ggaVar, btvo btvoVar, cqhn cqhnVar, yac yacVar, zuz zuzVar, Executor executor, xfc xfcVar, xfd xfdVar, bvjj bvjjVar, dxio<afha> dxioVar, wtw wtwVar, xhh xhhVar, bvrb bvrbVar, ydc ydcVar, dxio<akfa> dxioVar2, dxio<zad> dxioVar3, ckcw ckcwVar, amub amubVar, boolean z, boolean z2, boolean z3, zfl zflVar, @dzsi zfe zfeVar, @dzsi vmv vmvVar, boolean z4, xkl xklVar, vwh vwhVar) {
        pze pzeVar;
        amvd amvdVar;
        zfl zflVar2;
        xhg xhgVar;
        vwh vwhVar2;
        this.p = ggaVar;
        this.a = amubVar;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.c = zflVar;
        this.d = vmvVar;
        this.e = xklVar;
        this.f = yacVar;
        this.q = dxioVar;
        PackageManager packageManager = ggaVar.getPackageManager();
        amve amveVar = amubVar.d;
        if (vyb.v(amveVar)) {
            for (dpgh dpghVar : vyb.w(amveVar)) {
                pzeVar = pzf.a(dpghVar, packageManager);
                if (pzeVar != null) {
                    break;
                }
            }
        }
        pzeVar = null;
        this.o = pzeVar;
        if (amubVar.d.e() == 1) {
            amvd[] f = amubVar.d.d(0).f();
            int length = f.length;
            for (int i = 0; i < length; i++) {
                amvdVar = f[i];
                if (amvdVar.a.b) {
                    break;
                }
            }
        }
        amvdVar = null;
        if (!btvoVar.getTransitPaymentsParameters().a || amvdVar == null) {
            if (btvoVar.getDirectionsPageParameters().o) {
                amve amveVar2 = amubVar.d;
                xgu xguVar = new xgu(this) { // from class: ycc
                    private final yci a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.xgu
                    public final void a() {
                        cqkx.p(this.a);
                    }
                };
                dxio a = ((dxjh) xhhVar.a).a();
                xhh.a(a, 1);
                xhh.a(ggaVar, 2);
                xhh.a(cqhnVar, 3);
                xhh.a(bvjjVar, 4);
                xhh.a(dxioVar, 5);
                xhh.a(amveVar2, 6);
                xhh.a(xfcVar, 7);
                xhh.a(xfdVar, 8);
                xhh.a(btvoVar, 9);
                xhh.a(ckcwVar, 10);
                xhh.a(xguVar, 11);
                xhh.a(executor, 12);
                zflVar2 = zflVar;
                xhgVar = new xhg(a, ggaVar, cqhnVar, bvjjVar, dxioVar, amveVar2, xfcVar, xfdVar, btvoVar, ckcwVar, xguVar, executor);
            } else {
                zflVar2 = zflVar;
                xhgVar = null;
            }
            this.r = xhgVar;
            vwhVar2 = vwhVar;
        } else {
            this.r = new xhr(amvdVar, ggaVar, dxioVar);
            vwhVar2 = vwhVar;
            zflVar2 = zflVar;
        }
        this.h = vwhVar2;
        final List<xyv> a2 = yacVar.a(amubVar, zflVar, xklVar, vmvVar, vwhVar);
        this.b = a2;
        if (z4 && !amubVar.U()) {
            ybi ybiVar = new ybi(dtyb.f, zflVar2);
            ybiVar.c(this);
            this.m = ybiVar;
        } else {
            this.m = null;
        }
        dxioVar2.a().j();
        dbty dbtyVar = new dbty(a2) { // from class: ycd
            private final List a;

            {
                this.a = a2;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(dcbg.b(this.a).p(yce.a));
            }
        };
        this.n = ((Boolean) dbtyVar.a()).booleanValue() ? new qjh(ggaVar, zuzVar, dbtyVar, null) : null;
        bzgg.b(this.s, xklVar, this.i, executor);
        dpie dpieVar = amubVar.d.a;
        duov directionsPageParameters = btvoVar.getDirectionsPageParameters();
        dwbk dwbkVar = amubVar.J.f;
        this.t = yyw.b(dpieVar, directionsPageParameters, (dwbkVar == null ? dwbk.s : dwbkVar).m);
        this.g = bvrbVar;
    }

    @Override // defpackage.xzp
    public Boolean a() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.xzp
    public Boolean b() {
        return Boolean.valueOf(this.k);
    }

    @Override // defpackage.xzp
    public Boolean c() {
        return Boolean.valueOf(this.l);
    }

    @Override // defpackage.xzp
    public void d(Context context) {
        for (xyv xyvVar : f()) {
            xyvVar.a(context);
        }
        qjh qjhVar = this.n;
        if (qjhVar != null) {
            qjhVar.c();
        }
        cqkx.p(this);
    }

    @Override // defpackage.xzp
    public Boolean e() {
        return Boolean.valueOf(!f().isEmpty());
    }

    @Override // defpackage.xzp
    public List<xyv> f() {
        return this.b;
    }

    @Override // defpackage.xzp
    public Boolean g() {
        return Boolean.valueOf(pyy.e(this.a.d));
    }

    @Override // defpackage.xzp
    public cqkl h() {
        this.c.r();
        return cqkl.a;
    }

    @Override // defpackage.xzp
    public cqkl i() {
        if (this.o != null) {
            this.q.a().F(this.p, ((pzd) this.o).a, "Buy tickets activity not found");
        }
        return cqkl.a;
    }

    @Override // defpackage.xzp
    @dzsi
    public CharSequence k() {
        return this.p.getString(R.string.TRANSIT_DETAILS_COST_LABEL);
    }

    @Override // defpackage.xzp
    public Boolean l() {
        boolean z = false;
        if (this.t != null) {
            dqtz dqtzVar = dqtz.IC_FARE;
            dqtz b = dqtz.b(this.t.c);
            if (b == null) {
                b = dqtz.UNKNOWN_FARE;
            }
            if (dqtzVar.equals(b)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.xzp
    @dzsi
    public CharSequence m() {
        doxp doxpVar = this.t;
        if (doxpVar == null) {
            return null;
        }
        dquj dqujVar = doxpVar.d;
        if (dqujVar == null) {
            dqujVar = dquj.f;
        }
        if (!dqujVar.d.isEmpty()) {
            dquj dqujVar2 = this.t.d;
            if (dqujVar2 == null) {
                dqujVar2 = dquj.f;
            }
            return dqujVar2.d;
        }
        dquh dquhVar = this.t.b;
        if (dquhVar == null) {
            dquhVar = dquh.c;
        }
        return dquhVar.b;
    }

    @Override // defpackage.xzp
    @dzsi
    public CharSequence n() {
        CharSequence m;
        doxp doxpVar = this.t;
        if (doxpVar == null) {
            return null;
        }
        dquj dqujVar = doxpVar.d;
        if (dqujVar == null) {
            dqujVar = dquj.f;
        }
        if (!dqujVar.d.isEmpty()) {
            Resources resources = this.p.getResources();
            dquj dqujVar2 = this.t.d;
            if (dqujVar2 == null) {
                dqujVar2 = dquj.f;
            }
            m = vxc.b(resources, dqujVar2);
        } else {
            m = m();
        }
        return (!o().booleanValue() || m == null) ? m : this.p.getString(R.string.ACCESSIBILITY_TAXI_RICKSHAW_FARE_BREAKDOWN_DESCRIPTION, new Object[]{m});
    }

    @Override // defpackage.xzp
    public Boolean o() {
        dpah j = new vxg(this.a.d).j();
        boolean z = false;
        if (j != null && (j.a & 4) != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.xzp
    public cqkl p() {
        dpah j = new vxg(this.a.d).j();
        if (!this.p.g().J() && j != null && (j.a & 4) != 0) {
            drgz drgzVar = j.d;
            if (drgzVar == null) {
                drgzVar = drgz.b;
            }
            wtw.a(drgzVar, j.f).aJ(this.p);
        }
        return cqkl.a;
    }

    @Override // defpackage.xzp
    @dzsi
    public cqtd q() {
        return iup.e(R.raw.ic_ic_fare);
    }

    @Override // defpackage.xzp
    @dzsi
    public String r() {
        return this.p.getString(R.string.TRANSIT_FARE_IC_ICON_DESCRIPTION);
    }

    @Override // defpackage.xzp
    @dzsi
    public xzi s() {
        return this.m;
    }

    @Override // defpackage.xzp
    @dzsi
    public xys t() {
        return null;
    }

    @Override // defpackage.xzp
    @dzsi
    public qjf u() {
        return this.n;
    }

    @Override // defpackage.xzp
    public Boolean v() {
        boolean z = false;
        if (this.r == null && this.o != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.xzp
    public Boolean w() {
        return Boolean.valueOf(s() != null);
    }

    @Override // defpackage.xzp
    @dzsi
    public xgv x() {
        return this.r;
    }

    @Override // defpackage.xzp
    public cjtd y() {
        if (o().booleanValue()) {
            return cjtd.a(dtxn.au);
        }
        return cjtd.b;
    }

    @Override // defpackage.xzp
    public cqfd z() {
        return new ych(this);
    }

    @Override // defpackage.xzp
    public cjtd j() {
        pze pzeVar = this.o;
        String str = pzeVar == null ? "" : ((pzd) pzeVar).b.c;
        cjta b = cjtd.b();
        b.d = dtyc.cE;
        ddes bZ = ddet.D.bZ();
        ddgp bZ2 = ddgr.d.bZ();
        bZ2.a(str);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddgr ddgrVar = (ddgr) bZ2.b;
        ddgrVar.c = 1;
        ddgrVar.a = 1 | ddgrVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddgr bK = bZ2.bK();
        bK.getClass();
        ddetVar.w = bK;
        ddetVar.a |= 536870912;
        b.s(bZ.bK());
        return b.a();
    }
}
