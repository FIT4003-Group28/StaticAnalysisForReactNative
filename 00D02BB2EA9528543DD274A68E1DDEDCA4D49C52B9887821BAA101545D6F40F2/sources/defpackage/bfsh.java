package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
/* compiled from: PG */
/* renamed from: bfsh  reason: default package */
/* loaded from: classes3.dex */
public class bfsh implements bfrr, bega, begs, aelb {
    private static final aekz j;
    private static final aekz k;
    private static final aela l;
    @dzsi
    private View A;
    private int C;
    private boolean F;
    public final dxio<begg> a;
    public final dxio<jkf> b;
    public final aehr c;
    public final aeht d;
    public final aehx e;
    @dzsi
    public dnng f;
    @dzsi
    public aeoe g;
    @dzsi
    public bwrs<ilo> h;
    private final Activity m;
    private final btvo n;
    private final cqhn o;
    private final bwqv p;
    private final bfsa q;
    private final aeof r;
    private final bfsl s;
    private final aeqq t;
    private final bfsr u;
    private final bfrp v;
    @dzsi
    private bfrs w;
    @dzsi
    private cqfd x;
    @dzsi
    private aeqk y;
    @dzsi
    private cjtd z;
    private dcdc<bfrd> B = dcdc.e();
    private boolean D = false;
    private boolean E = false;
    final bfsg i = new bfsg(this);

    static {
        aeky d = aekz.d();
        aekv aekvVar = (aekv) d;
        aekvVar.c = dtxy.dI;
        aekvVar.a = dtxy.dK;
        aekvVar.b = dtxy.dJ;
        aekz a = d.a();
        j = a;
        aeky d2 = aekz.d();
        aekv aekvVar2 = (aekv) d2;
        aekvVar2.c = dtxy.dL;
        aekvVar2.a = dtxy.dN;
        aekvVar2.b = dtxy.dM;
        aekz a2 = d2.a();
        k = a2;
        aekx d3 = aela.d();
        d3.b(a);
        d3.c(a2);
        d3.d();
        l = d3.a();
    }

    public bfsh(cqhn cqhnVar, ff ffVar, btvo btvoVar, bwqv bwqvVar, bfsb bfsbVar, aehr aehrVar, aeht aehtVar, aeof aeofVar, bfsl bfslVar, aehx aehxVar, aeqq aeqqVar, dxio<begg> dxioVar, dxio<jkf> dxioVar2, bfss bfssVar, bfrp bfrpVar, jmx jmxVar) {
        this.m = ffVar;
        this.n = btvoVar;
        this.o = cqhnVar;
        this.p = bwqvVar;
        this.c = aehrVar;
        this.d = aehtVar;
        this.r = aeofVar;
        this.s = bfslVar;
        this.e = aehxVar;
        this.t = aeqqVar;
        bfsq bfsqVar = new bfsq(this) { // from class: bfsc
            private final bfsh a;

            {
                this.a = this;
            }

            @Override // defpackage.bfsq
            public final void a(dqxc dqxcVar) {
                bfsh bfshVar = this.a;
                bfshVar.H(dqxcVar);
                bfshVar.F();
            }
        };
        Activity activity = (Activity) ((dxjd) bfssVar.a).a;
        bfss.a(activity, 1);
        btvo a = bfssVar.b.a();
        bfss.a(a, 2);
        dxio a2 = ((dxjh) bfssVar.c).a();
        bfss.a(a2, 3);
        bfsv a3 = bfssVar.d.a();
        bfss.a(a3, 4);
        bfss.a(bfsqVar, 5);
        this.u = new bfsr(activity, a, a2, a3, bfsqVar);
        this.v = bfrpVar;
        this.a = dxioVar;
        this.b = dxioVar2;
        int a4 = dujv.a(btvoVar.getAdsParameters().b);
        Integer valueOf = Integer.valueOf(acpd.c(a4 == 0 ? 1 : a4, ffVar.getResources()));
        Resources resources = ffVar.getResources();
        gga a5 = bfsbVar.a.a();
        bfsb.a(a5, 1);
        cqkj a6 = bfsbVar.b.a();
        bfsb.a(a6, 2);
        jdj a7 = bfsbVar.c.a();
        bfsb.a(a7, 3);
        aekq a8 = bfsbVar.d.a();
        bfsb.a(a8, 4);
        bfmz a9 = bfsbVar.e.a();
        bfsb.a(a9, 5);
        btvo a10 = bfsbVar.f.a();
        bfsb.a(a10, 6);
        bfsb.a(resources, 7);
        bfsb.a(valueOf, 8);
        this.q = new bfsa(a5, a6, a7, a8, a9, a10, resources, valueOf);
        this.C = btvoVar.getHotelBookingModuleParameters().a();
    }

    private final void J() {
        this.h = null;
        this.f = null;
        this.w = null;
        this.y = null;
        this.g = null;
        this.C = this.n.getHotelBookingModuleParameters().a();
        this.B = dcdc.e();
        this.u.f = null;
        this.q.l();
        this.q.n();
    }

    @Override // defpackage.bfrr
    /* renamed from: A */
    public List<bfrd> c() {
        return this.B;
    }

    @Override // defpackage.bfrr
    @dzsi
    /* renamed from: B */
    public aeoe g() {
        return this.g;
    }

    public void C(@dzsi View view) {
        this.A = view;
    }

    public void D(Configuration configuration) {
        aeoe aeoeVar = this.g;
        if (aeoeVar != null) {
            aeoeVar.e();
        }
        this.q.o();
    }

    public void E() {
        this.D = false;
        this.E = false;
        cqkx.p(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F() {
        if (this.D || this.o == null) {
            return;
        }
        this.D = true;
        cqkx.p(this);
    }

    public final void G() {
        this.E = true;
        cqkx.p(this);
    }

    public final void H(dqxc dqxcVar) {
        dnnn I = I();
        dsqp dsqpVar = (dsqp) I.cu(5);
        dsqpVar.bC(I);
        dnnh dnnhVar = (dnnh) dsqpVar;
        if (dnnhVar.c) {
            dnnhVar.bF();
            dnnhVar.c = false;
        }
        dnnn dnnnVar = (dnnn) dnnhVar.b;
        dnnn dnnnVar2 = dnnn.l;
        dqxcVar.getClass();
        dnnnVar.j = dqxcVar;
        dnnnVar.a |= 4096;
        this.d.b(dnnhVar.bK());
    }

    public final dnnn I() {
        if (this.c.i()) {
            dnng dnngVar = this.f;
            if (dnngVar == null) {
                return aehr.a();
            }
            dnnn dnnnVar = dnngVar.b;
            return dnnnVar == null ? dnnn.l : dnnnVar;
        }
        return this.d.d();
    }

    @Override // defpackage.aelb
    public void a(eapg eapgVar, eapg eapgVar2, ddho ddhoVar, cjqm cjqmVar) {
        F();
        this.d.a(this.c.g(I(), eapgVar, eapgVar2));
    }

    @Override // defpackage.bfrr
    public Boolean d() {
        boolean z = false;
        if (e().booleanValue() && this.B.size() > this.C) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfrr
    public Boolean e() {
        dnng dnngVar = this.f;
        boolean z = false;
        if (dnngVar != null && !dnngVar.f.isEmpty() && !this.B.isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfrr
    public bfrq f() {
        return this.q;
    }

    @Override // defpackage.bfrr
    public String h() {
        dbsg<dqxc> a = this.u.a();
        return a.a() ? this.m.getResources().getString(R.string.OCCUPANCY_SELECTOR_CONTENT_DESCRIPTION, Integer.valueOf(a.b().b)) : "";
    }

    @Override // defpackage.bfrr
    public String i() {
        dbsg<dqxc> a = this.u.a();
        return a.a() ? Integer.toString(a.b().b) : "";
    }

    @Override // defpackage.bfrr
    public Boolean k() {
        return Boolean.valueOf(this.n.getCategoricalSearchParameters().b());
    }

    @Override // defpackage.bfrr
    @dzsi
    public bfrs l() {
        return this.w;
    }

    @Override // defpackage.begs
    public void m(btrm btrmVar) {
        if (!this.F) {
            bfsg bfsgVar = this.i;
            dceq a = dcet.a();
            a.b(aehz.class, new bfsi(aehz.class, bfsgVar));
            btrmVar.g(bfsgVar, a.a());
            this.F = true;
        }
    }

    @Override // defpackage.begs
    public void n(btrm btrmVar) {
        if (this.F) {
            btrmVar.a(this.i);
            this.F = false;
        }
    }

    @Override // defpackage.bfrr
    public Boolean o() {
        dnng dnngVar = this.f;
        boolean z = false;
        if (dnngVar == null || (dnngVar.a & 8388608) == 0 || this.w == null) {
            return false;
        }
        dnob dnobVar = dnngVar.j;
        if (dnobVar == null) {
            dnobVar = dnob.j;
        }
        int a = donw.a(dnobVar.b);
        if (a == 0) {
            a = 1;
        }
        if (a == 15 || a == 3) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfrr
    @dzsi
    public aeqj p() {
        aeqk aeqkVar = this.y;
        if (aeqkVar != null && aeqkVar.d() != null) {
            aeqj d = this.y.d();
            dbsk.s(d);
            if (d.a().intValue() == 1) {
                return d;
            }
        }
        return null;
    }

    @Override // defpackage.bfrr
    @dzsi
    public cqfd q() {
        if (this.f == null) {
            return null;
        }
        if (this.x == null) {
            this.x = new cqfd(this) { // from class: bfse
                private final bfsh a;

                {
                    this.a = this;
                }

                @Override // defpackage.cqfd
                public final boolean a(View view) {
                    bfsh bfshVar = this.a;
                    if (bfshVar.f == null) {
                        return true;
                    }
                    jjn L = bfshVar.b.a().l().L();
                    if (L != jjn.EXPANDED && L != jjn.FULLY_EXPANDED) {
                        return true;
                    }
                    bege j2 = bfshVar.a.a().j();
                    if (j2 != bege.OVERVIEW && j2 != bege.PRICES) {
                        return true;
                    }
                    aehx aehxVar = bfshVar.e;
                    dnng dnngVar = bfshVar.f;
                    dbsk.s(dnngVar);
                    bege begeVar = bege.PRICES;
                    aehxVar.a(dnngVar);
                    if (j2 != begeVar) {
                        return true;
                    }
                    aehxVar.b(dnngVar);
                    return true;
                }
            };
        }
        return this.x;
    }

    @Override // defpackage.bfrr
    @dzsi
    public String r() {
        dnng dnngVar = this.f;
        if (dnngVar == null || (dnngVar.a & 32768) == 0) {
            return null;
        }
        return this.m.getResources().getString(R.string.MORE_PRICES, this.f.e);
    }

    @Override // defpackage.bfrr
    public cqkl s() {
        bwrs<ilo> bwrsVar;
        if (this.a.a().i(bege.PRICES) && (bwrsVar = this.h) != null) {
            this.a.a().l(bege.PRICES, bfso.g(this.p, bwrsVar));
        }
        return cqkl.a;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        int a;
        this.h = bwrsVar;
        if (bwrsVar == null) {
            J();
            return;
        }
        ilo c = bwrsVar.c();
        if (c == null || !c.bS().a()) {
            J();
            return;
        }
        dnng b = c.bS().b();
        this.f = b;
        dbsk.s(b);
        this.q.k(b);
        this.q.m(c.V());
        dnnn dnnnVar = b.b;
        if (dnnnVar == null) {
            dnnnVar = dnnn.l;
        }
        cjtd bZ = c.bZ();
        if (aehr.c(dnnnVar)) {
            aeof aeofVar = this.r;
            aela aelaVar = l;
            aehu d = aehr.d(dnnnVar);
            dqxa dqxaVar = dnnnVar.d;
            if (dqxaVar == null) {
                dqxaVar = dqxa.f;
            }
            Activity activity = (Activity) ((dxjd) aeofVar.a).a;
            aeof.a(activity, 1);
            aenp a2 = aeofVar.b.a();
            aeof.a(a2, 2);
            aeol a3 = aeofVar.c.a();
            aeof.a(a3, 3);
            cqat a4 = aeofVar.d.a();
            aeof.a(a4, 4);
            cqkj a5 = aeofVar.e.a();
            aeof.a(a5, 5);
            btvo a6 = aeofVar.f.a();
            aeof.a(a6, 6);
            cqhu a7 = aeofVar.g.a();
            aeof.a(a7, 7);
            aeqi a8 = aeofVar.h.a();
            aeof.a(a8, 8);
            aeof.a(aelaVar, 9);
            aeof.a(d, 10);
            aeoe aeoeVar = new aeoe(activity, a2, a3, a4, a5, a6, a7, a8, aelaVar, d, dqxaVar);
            this.g = aeoeVar;
            cjta b2 = cjtd.b();
            b2.b = bZ.e;
            b2.g(bZ.d);
            aeoeVar.f(b2);
            this.g.a(this);
        }
        cjtd bZ2 = c.bZ();
        dnnn dnnnVar2 = b.b;
        if (dnnnVar2 == null) {
            dnnnVar2 = dnnn.l;
        }
        dnnn dnnnVar3 = dnnnVar2;
        if ((dnnnVar3.a & 256) != 0) {
            dnnt dnntVar = dnnnVar3.h;
            if (dnntVar == null) {
                dnntVar = dnnt.b;
            }
            this.C = dnntVar.a;
        }
        dccx F = dcdc.F();
        int i = 0;
        for (dnnr dnnrVar : b.f) {
            int i2 = i + 1;
            bfrp bfrpVar = this.v;
            boolean z = b.c;
            int size = b.f.size();
            boolean z2 = i2 == size && size <= this.C;
            Activity activity2 = (Activity) ((dxjd) bfrpVar.a).a;
            bfrp.a(activity2, 1);
            btvo a9 = bfrpVar.b.a();
            bfrp.a(a9, 2);
            bfrl a10 = bfrpVar.c.a();
            bfrp.a(a10, 3);
            bfrj a11 = bfrpVar.d.a();
            bfrp.a(a11, 4);
            afec a12 = bfrpVar.e.a();
            ilo iloVar = c;
            bfrp.a(a12, 5);
            dxio a13 = ((dxjh) bfrpVar.f).a();
            bfrp.a(a13, 6);
            bfrp.a(dnnrVar, 7);
            bfrp.a(dnnnVar3, 8);
            bfrp.a(bZ2, 12);
            dccx dccxVar = F;
            dccxVar.g(new bfro(activity2, a9, a10, a11, a12, a13, dnnrVar, dnnnVar3, z, z2, i2, bZ2));
            F = dccxVar;
            c = iloVar;
            b = b;
            i = i2;
            dnnnVar3 = dnnnVar3;
        }
        ilo iloVar2 = c;
        this.B = F.f();
        dnnn dnnnVar4 = b.b;
        if (dnnnVar4 == null) {
            dnnnVar4 = dnnn.l;
        }
        if ((dnnnVar4.a & 4096) != 0) {
            bfsr bfsrVar = this.u;
            dnnn dnnnVar5 = b.b;
            if (dnnnVar5 == null) {
                dnnnVar5 = dnnn.l;
            }
            dqxc dqxcVar = dnnnVar5.j;
            if (dqxcVar == null) {
                dqxcVar = dqxc.c;
            }
            bfsrVar.f = dqxcVar;
        }
        bfsf bfsfVar = new bfsf(this);
        bfsl bfslVar = this.s;
        dnob dnobVar = b.j;
        if (dnobVar == null) {
            dnobVar = dnob.j;
        }
        bfsq bfsqVar = new bfsq(this) { // from class: bfsd
            private final bfsh a;

            {
                this.a = this;
            }

            @Override // defpackage.bfsq
            public final void a(dqxc dqxcVar2) {
                bfsh bfshVar = this.a;
                bfshVar.H(dqxcVar2);
                bfshVar.G();
            }
        };
        cjtd bZ3 = iloVar2.bZ();
        bfrs bfrsVar = null;
        if (bfsj.d(dnobVar) || bfsj.e(dnobVar)) {
            Context a14 = bfslVar.c.a().a.a();
            bfsm.a(a14, 1);
            bfsm.a(dnobVar, 2);
            bfsm.a(bfsfVar, 3);
            bfsm.a(bZ3, 4);
            bfrsVar = new bfsj(a14, dnobVar, bfsfVar, bZ3);
        } else if (bfslVar.b.getCategoricalSearchParameters().b() && (a = donw.a(dnobVar.b)) != 0 && a == 13 && (dnobVar.a & 2048) != 0) {
            bfrsVar = new bfsk(bfslVar.a, dnobVar, bZ3, bfsqVar);
        }
        this.w = bfrsVar;
        this.y = this.t.a(b, iloVar2.bZ(), iloVar2.n());
        cjta c2 = cjtd.c(iloVar2.a());
        c2.d = dtxr.cy;
        this.z = c2.a();
        View view = this.A;
        if (view == null) {
            return;
        }
        jmw.f(view);
    }

    @Override // defpackage.bega
    public void u() {
        J();
    }

    @Override // defpackage.bfrr
    @dzsi
    public cjtd v() {
        return this.z;
    }

    @Override // defpackage.bega
    public Boolean w() {
        bwrs<ilo> bwrsVar = this.h;
        boolean z = false;
        if (bwrsVar == null) {
            return false;
        }
        ilo c = bwrsVar.c();
        if (c != null && c.bS().a()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfrr
    public Boolean x() {
        return Boolean.valueOf(this.D);
    }

    @Override // defpackage.bfrr
    public Boolean y() {
        return Boolean.valueOf(this.E);
    }

    @Override // defpackage.bfrr
    /* renamed from: z */
    public List<bfrd> b() {
        int min = Math.min(this.C, this.B.size());
        if (!e().booleanValue() || min <= 0) {
            return dcdc.e();
        }
        return this.B.subList(0, min);
    }

    @Override // defpackage.bfrr
    public cqkl j() {
        dbsg i;
        bfsr bfsrVar = this.u;
        if (bfsrVar.f == null) {
            i = dbpy.a;
        } else {
            dcdc r = dcdc.r(bfsrVar.c.getHotelBookingModuleParameters().h());
            dqxc dqxcVar = bfsrVar.f;
            dbsk.s(dqxcVar);
            Integer valueOf = Integer.valueOf(dqxcVar.b);
            if (!r.contains(valueOf)) {
                r.toString();
                i = dbpy.a;
            } else {
                aeqs a = bfsrVar.d.a.a();
                bfsv.a(a, 1);
                bfsv.a(bfsrVar, 2);
                bfsv.a(r, 3);
                bfsv.a(valueOf, 4);
                bfsu bfsuVar = new bfsu(a, bfsrVar, r, valueOf);
                cqkf c = bfsrVar.b.a().c(new gur(), null);
                c.e(bfsuVar);
                i = dbsg.i(c.c());
            }
        }
        if (i.a()) {
            bfsrVar.g = new czwe(bfsrVar.a);
            bfsrVar.g.setContentView((View) i.b());
            View findViewById = bfsrVar.g.findViewById(R.id.design_bottom_sheet);
            if (findViewById != null) {
                BottomSheetBehavior.F(findViewById).y(3);
            }
            czwe czweVar = bfsrVar.g;
            dbsk.s(czweVar);
            czweVar.show();
        }
        return cqkl.a;
    }
}
