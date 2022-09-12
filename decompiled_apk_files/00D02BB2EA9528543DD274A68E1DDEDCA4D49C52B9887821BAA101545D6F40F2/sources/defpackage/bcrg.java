package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
/* compiled from: PG */
/* renamed from: bcrg  reason: default package */
/* loaded from: classes3.dex */
public final class bcrg extends bcqc implements bcqa {
    private static final dcqe aO = dcqe.c("bcrg");
    public Activity a;
    public dxio<bdes> aA;
    public bbuq aB;
    @dzsi
    public bwrs<ilo> aC;
    private bbty aP;
    private bcrp aQ;
    private bbup aR;
    private bdpk aS;
    private int aT;
    private ckcq aU;
    public dxio<bdbr> ad;
    public dxio<bddk> an;
    public dxio<bddi> ao;
    public dxio<bdbi> ap;
    public dxio<bddt> aq;
    public bdpw ar;
    public buti as;
    public bdch at;
    public dxio<bdcf> au;
    public afxv av;
    public dxio<bcqy> aw;
    public begg ax;
    public dxio<bdez> ay;
    public bgqo az;
    public bwqv b;
    public btvo c;
    public ckcw d;
    public bcri e;
    public dxio<bdew> f;
    public dxio<bdbp> g;

    public static ges aS(btvo btvoVar, bwqv bwqvVar, @dzsi bwrs<ilo> bwrsVar, bbuq bbuqVar, bbty bbtyVar, int i, @dzsi Bitmap bitmap, @dzsi String str) {
        if (bn(btvoVar)) {
            bcrg bcrgVar = new bcrg();
            Bundle aV = aV(i);
            bwqvVar.c(aV, "PHOTO_ACTIONS_KEY", bbtyVar);
            bwqvVar.c(aV, "PHOTO_URL_MANAGER", bbuqVar);
            if (bwrsVar != null) {
                cctq.a(aV, bwqvVar, bwrsVar);
            }
            bbuqVar.p(i);
            bcrgVar.B(aV);
            return bcrgVar;
        }
        bcpz bcpzVar = new bcpz();
        Bundle bundle = new Bundle();
        bundle.putInt("INITIAL_INDEX", i);
        bwqvVar.c(bundle, "PHOTO_ACTIONS_KEY", bbtyVar);
        bwqvVar.c(bundle, "placemark", bwrs.b(bwrsVar));
        bwqvVar.c(bundle, "PHOTO_URL_MANAGER", bbuqVar);
        if (str != null) {
            bundle.putString("CUSTOM_TITLE", str);
        }
        if (bitmap != null) {
            bundle.putParcelable("TRANSITION_BITMAP", bitmap);
        }
        bcpzVar.B(bundle);
        return bcpzVar;
    }

    public static boolean bn(btvo btvoVar) {
        return btvoVar.getEnableFeatureParameters().bv;
    }

    private final void bp() {
        bddf bddfVar = this.al;
        int intValue = bddfVar != null ? bddfVar.e().intValue() : 0;
        if (intValue < this.aB.d()) {
            int d = this.aB.d() - 1;
            dwfl e = this.aB.e(intValue);
            this.aB.i(intValue);
            this.aT++;
            this.aU.a();
            if (e != null) {
                this.ax.C(e);
            }
            if (this.aB.d() == 0) {
                e();
                return;
            }
            if (intValue == d) {
                int d2 = this.aB.d() - 1;
                bddf bddfVar2 = this.al;
                if (bddfVar2 != null) {
                    bddfVar2.l(d2);
                }
            }
            bo();
        }
    }

    private final void bq(int i) {
        bbtz g = bbua.g();
        bbuq bbuqVar = this.aB;
        int d = bbuqVar.d();
        ArrayList arrayList = new ArrayList(d);
        for (int i2 = 0; i2 < d; i2++) {
            dwfl e = bbuqVar.e(i2);
            dbsk.s(e);
            arrayList.add(e);
        }
        g.e(arrayList);
        bbuq bbuqVar2 = this.aB;
        int d2 = bbuqVar2.d();
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < d2; i3++) {
            dwfl e2 = bbuqVar2.e(i3);
            dbsk.s(e2);
            if ((e2.a & 512) != 0) {
                if (bbuqVar2.a.b(e2.h)) {
                    hashSet.add(e2);
                }
            }
        }
        g.d(hashSet);
        g.b(i);
        bbuq bbuqVar3 = this.aB;
        int d3 = bbuqVar3.d();
        HashSet hashSet2 = new HashSet();
        for (int i4 = 0; i4 < d3; i4++) {
            dwfl e3 = bbuqVar3.e(i4);
            dbsk.s(e3);
            String str = e3.d;
            Boolean q = bbuqVar3.q(i4);
            if (q != null && q.booleanValue()) {
                hashSet2.add(str);
            }
        }
        g.g(dcep.K(hashSet2));
        bbuq bbuqVar4 = this.aB;
        int d4 = bbuqVar4.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashSet hashSet3 = new HashSet();
        for (int i5 = 0; i5 < d4; i5++) {
            dwfl e4 = bbuqVar4.e(i5);
            dbsk.s(e4);
            if (!linkedHashMap.containsKey(e4.d)) {
                linkedHashMap.put(e4.d, bbuqVar4.b.a(e4));
            } else {
                hashSet3.add(e4.d);
            }
        }
        linkedHashMap.keySet().removeAll(hashSet3);
        g.c(linkedHashMap);
        if (this.aP.p()) {
            bbuq bbuqVar5 = this.aB;
            int d5 = bbuqVar5.d();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (int i6 = 0; i6 < d5; i6++) {
                dwfl e5 = bbuqVar5.e(i6);
                dbsk.s(e5);
                String str2 = e5.d;
                Boolean o = bbuqVar5.o(str2);
                if (o != null) {
                    linkedHashMap2.put(str2, o);
                }
            }
            g.f(linkedHashMap2);
        }
        Nw(g.a());
        fd fdVar = this.D;
        if (fdVar instanceof bcqw) {
            ((bcqw) fdVar).w();
        } else {
            gfq.l(this);
        }
    }

    @Override // defpackage.bcqc, defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof bdgu) {
            bdgu bdguVar = (bdgu) obj;
            if (bdguVar.a) {
                d(true != bdguVar.b ? R.string.DELETE_USER_PHOTO_SUCCESS : R.string.DELETE_USER_VIDEO_SUCCESS);
                bp();
                return;
            }
            d(true != bdguVar.b ? R.string.DELETE_USER_PHOTO_FAILED : R.string.DELETE_USER_VIDEO_FAILED);
        } else if (obj instanceof anhe) {
            bp();
            Nw(obj);
        } else if (obj instanceof bcbc) {
            bcbc bcbcVar = (bcbc) obj;
            String a = bcbcVar.a();
            this.aB.k(a, bcbcVar.b().a());
            if (!bcbcVar.b().a().isEmpty()) {
                this.aB.n(a, true);
            }
            bo();
        } else if (obj instanceof anhc) {
            e();
            Nw(obj);
        } else if (obj instanceof anhd) {
            Nw(obj);
        } else if (obj instanceof bbuv) {
            bq(2);
        } else if (obj instanceof bdgg) {
            bdgg bdggVar = (bdgg) obj;
            this.aB.l(bdggVar.a(), bdggVar.b());
            bo();
        } else if (obj instanceof bbvf) {
            bbvf bbvfVar = (bbvf) obj;
            this.aB.n(bbvfVar.a(), bbvfVar.b().booleanValue());
            bo();
        } else if (obj instanceof bbsc) {
            this.aB.p(((bbsc) obj).a());
            bo();
        } else {
            super.Qn(obj);
        }
    }

    @Override // defpackage.fd
    public final void Z(int i, int i2, Intent intent) {
        this.aS.d(i, i2, intent);
    }

    @Override // defpackage.bcqa
    public final bdag aJ() {
        return this.aP.t().a() ? this.aA.a().a(this.aP.t().b()) : new bcrf();
    }

    @Override // defpackage.bcqa
    public final bcrp aR() {
        return this.aQ;
    }

    @Override // defpackage.bcqa
    @dzsi
    public final bcrr aT() {
        ilo iloVar = (ilo) bwrs.b(this.aC);
        if (iloVar == null || !iloVar.aX(this.c.getEnableFeatureParameters()) || !this.aP.m() || !this.c.getEnableFeatureParameters().p) {
            return null;
        }
        return this.aw.a().a(iloVar);
    }

    @Override // defpackage.bcqa
    public final bdbm aU() {
        ilo iloVar = (ilo) bwrs.b(this.aC);
        dccx F = dcdc.F();
        if (this.aP.r().a()) {
            bdcf a = this.au.a();
            afyb r = this.aP.r();
            Context a2 = a.a.a();
            bdcf.a(a2, 1);
            afxz a3 = a.b.a();
            bdcf.a(a3, 2);
            bcro a4 = a.c.a();
            bdcf.a(a4, 3);
            bdcf.a(r, 4);
            F.g(new bdce(a2, a3, a4, r, iloVar));
        }
        if (this.aP.e()) {
            F.g(this.f.a());
        }
        if (this.aP.d()) {
            bdbp a5 = this.g.a();
            Activity activity = (Activity) ((dxjd) a5.a).a;
            bdbp.a(activity, 1);
            bwqv a6 = a5.b.a();
            bdbp.a(a6, 2);
            gfw gfwVar = (gfw) ((dxjd) a5.c).a;
            bdbp.a(gfwVar, 3);
            F.g(new bdbo(activity, a6, gfwVar, iloVar));
        }
        if (this.aP.f()) {
            F.g(this.ad.a());
        }
        if (this.aP.h()) {
            F.g(this.an.a());
        }
        if (this.aP.g()) {
            F.g(this.ao.a());
        }
        if (this.aP.i()) {
            F.g(new bdeu(this.a, this.e.a(this.aP.w(), this.c, iloVar)));
        }
        if (this.aP.p()) {
            Activity activity2 = this.a;
            bbuq bbuqVar = this.aB;
            bdez.a(activity2, 1);
            bdez.a(bbuqVar, 2);
            gfw gfwVar2 = (gfw) ((dxjd) this.ay.a().a).a;
            bdez.a(gfwVar2, 3);
            F.g(new bdey(activity2, bbuqVar, gfwVar2));
        }
        return bdbm.a(F.f());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        this.av.m(new Runnable(this) { // from class: bcra
            private final bcrg a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bddf bddfVar = this.a.al;
                if (bddfVar != null) {
                    cqkx.p(bddfVar);
                }
            }
        });
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        this.av.a();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        if (this.aT != 0) {
            this.aU.b();
            ((ckco) this.d.a(ckiu.a)).a(this.aT);
        }
        super.am();
    }

    public final void bo() {
        dccx F = dcdc.F();
        for (int i = 0; i < this.aB.d(); i++) {
            dwfl e = this.aB.e(i);
            dbsk.s(e);
            F.g(bczw.c(e, ""));
        }
        aX(F.f());
    }

    @Override // defpackage.bcqc, defpackage.ges, defpackage.gfo
    public final boolean e() {
        bq(1);
        return true;
    }

    @Override // defpackage.bcqa
    public final bbvl g() {
        return this.aB.a;
    }

    @Override // defpackage.bcqa
    public final bbtx i() {
        return this.aP.n();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.aU = ((ckcr) this.d.a(ckiu.b)).a();
        try {
            bbty bbtyVar = (bbty) this.b.d(bbty.class, this.o, "PHOTO_ACTIONS_KEY");
            dbsk.s(bbtyVar);
            this.aP = bbtyVar;
            bbuq bbuqVar = (bbuq) this.b.d(bbuq.class, this.o, "PHOTO_URL_MANAGER");
            dbsk.s(bbuqVar);
            this.aB = bbuqVar;
            if (cctq.c(this.o)) {
                this.aC = cctq.b(this.o, this.b);
            }
            this.aQ = new bcrp(this) { // from class: bcqz
                private final bcrg a;

                {
                    this.a = this;
                }

                @Override // defpackage.bcrp
                public final void a() {
                    bcrg bcrgVar = this.a;
                    bcrgVar.aB.h(bcrgVar.as);
                }
            };
            this.aR = new bcrd(this);
            this.aS = this.ar.a(this, new bcre(this));
            if (bundle == null) {
                bundle = this.o;
            }
            this.aS.a(bundle);
            bo();
        } catch (IOException e) {
            bvoo.h("Failed to unpack options from getArguments() %s", e);
        }
        bgqo bgqoVar = this.az;
        if (bgqoVar == null) {
            return;
        }
        final bgqn a = bgqoVar.a(new dbty(this) { // from class: bcrb
            private final bcrg a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                bwrs<ilo> bwrsVar = this.a.aC;
                return bwrsVar != null ? bwrsVar : bwrs.a(null);
            }
        });
        bvor.a(bd(), new mw(a) { // from class: bcrc
            private final bgqn a;

            {
                this.a = a;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                ((cjqp) obj).g(this.a);
            }
        });
    }

    @Override // defpackage.bcqa
    public final bbuu q() {
        return this.aB.b;
    }

    @Override // defpackage.bcqc, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.aB.r(this.aR);
    }

    @Override // defpackage.bcqc, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.aS.b(bundle);
    }

    @Override // defpackage.bcqc, defpackage.ges, defpackage.fd
    public final void u() {
        this.aB.s(this.aR);
        super.u();
    }

    @Override // defpackage.bcqa
    public final bdai w() {
        dccx F = dcdc.F();
        F.g(new bdcc(this.at, this.aP.r(), (ilo) bwrs.b(this.aC)));
        if (this.aP.a().a()) {
            F.g(new bdbg(this.ap.a(), this.aP.a().b()));
        } else {
            F.g(new bdbj());
        }
        if (this.aP.b()) {
            F.g(new bddl(this.c, this.aq.a()));
        }
        if (this.aP.k()) {
            F.g(new bdbs(this.aS));
        }
        return bdbl.b(F.f());
    }
}
