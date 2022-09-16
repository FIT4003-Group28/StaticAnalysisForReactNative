package defpackage;

import android.view.View;
import android.widget.PopupMenu;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bkja  reason: default package */
/* loaded from: classes3.dex */
public class bkja implements bkiw, bega {
    public final btvo a;
    public final bcri b;
    @dzsi
    public bwrs<ilo> c;
    @dzsi
    public bvip d;
    private final gga e;
    private final dxio<cafi> f;
    private final bviq g;
    private final isd h;
    private final bbut i;
    private final begg j;
    @dzsi
    private List<dggo> k;
    @dzsi
    private jhm l;

    public bkja(gga ggaVar, btvo btvoVar, dxio<cafi> dxioVar, bviq bviqVar, isd isdVar, bbut bbutVar, begg beggVar, bcri bcriVar) {
        this.e = ggaVar;
        this.a = btvoVar;
        this.f = dxioVar;
        this.g = bviqVar;
        this.h = isdVar;
        this.i = bbutVar;
        this.j = beggVar;
        this.b = bcriVar;
    }

    private final dggu A() {
        List<dggo> list = this.k;
        dbsk.s(list);
        bvip bvipVar = this.d;
        dbsk.s(bvipVar);
        dggu dgguVar = list.get(bvipVar.k().intValue()).b;
        return dgguVar == null ? dggu.f : dgguVar;
    }

    @Override // defpackage.bkiw
    public bvhu a() {
        bvip bvipVar = this.d;
        dbsk.s(bvipVar);
        return bvipVar;
    }

    @Override // defpackage.bkiw
    public Boolean b() {
        List<dggo> list = this.k;
        boolean z = true;
        if (list == null || list.size() <= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bkiw
    public cqkl c() {
        if (this.c == null || this.k == null || this.d == null) {
            return cqkl.a;
        }
        dccx F = dcdc.F();
        List<dggo> list = this.k;
        dbsk.s(list);
        for (dggo dggoVar : list) {
            F.g(z(dggoVar));
        }
        ckne ckneVar = new ckne(F.f());
        bbut bbutVar = this.i;
        bvip bvipVar = this.d;
        dbsk.s(bvipVar);
        int intValue = bvipVar.k().intValue();
        bbtv v = bbty.v();
        v.k(true);
        v.p(afyb.i(this.a, afyc.LATEST_PHOTOS));
        bbty a = v.a();
        bwrs<ilo> bwrsVar = this.c;
        dbsk.s(bwrsVar);
        bbutVar.p(ckneVar, intValue, a, bwrsVar, null);
        return cqkl.a;
    }

    @Override // defpackage.bkiw
    @dzsi
    public jic d() {
        if (!h().booleanValue()) {
            return null;
        }
        dggm dggmVar = A().c;
        if (dggmVar == null) {
            dggmVar = dggm.b;
        }
        dghm dghmVar = dggmVar.a;
        if (dghmVar == null) {
            dghmVar = dghm.f;
        }
        return new jic(dghmVar.c, ckqc.FIFE_MERGE, 2131232998, (ckqf) null);
    }

    @Override // defpackage.bkiw
    public Boolean e() {
        return false;
    }

    @Override // defpackage.bkiw
    @dzsi
    public CharSequence f() {
        if (!h().booleanValue()) {
            return null;
        }
        dggm dggmVar = A().c;
        if (dggmVar == null) {
            dggmVar = dggm.b;
        }
        dghm dghmVar = dggmVar.a;
        if (dghmVar == null) {
            dghmVar = dghm.f;
        }
        return dghmVar.b;
    }

    @Override // defpackage.bkiw
    @dzsi
    public CharSequence g() {
        return null;
    }

    @Override // defpackage.bkiw
    @dzsi
    public String i() {
        if (this.k == null || this.d == null) {
            return null;
        }
        dggk dggkVar = A().d;
        if (dggkVar == null) {
            dggkVar = dggk.c;
        }
        dgga dggaVar = dggkVar.b;
        if (dggaVar == null) {
            dggaVar = dgga.b;
        }
        return dggaVar.a;
    }

    @Override // defpackage.bkiw
    @dzsi
    public CharSequence j() {
        if (this.k == null || this.d == null) {
            return null;
        }
        dghc dghcVar = A().b;
        if (dghcVar == null) {
            dghcVar = dghc.c;
        }
        return dghcVar.b;
    }

    @Override // defpackage.bkiw
    public Boolean l() {
        return false;
    }

    @Override // defpackage.bkiw
    public cjtd n(ddho ddhoVar) {
        cjtd cjtdVar;
        bwrs<ilo> bwrsVar = this.c;
        if (bwrsVar != null) {
            ilo c = bwrsVar.c();
            dbsk.s(c);
            cjtdVar = c.bZ();
        } else {
            cjtdVar = null;
        }
        cjta c2 = cjtd.c(cjtdVar);
        c2.d = ddhoVar;
        return c2.a();
    }

    @Override // defpackage.bkiw
    public cjtd o() {
        return n(dtxu.bd);
    }

    @Override // defpackage.bkiw
    public cqkl p() {
        if (this.c == null || this.k == null || this.d == null) {
            return cqkl.a;
        }
        dggm dggmVar = A().c;
        if (dggmVar == null) {
            dggmVar = dggm.b;
        }
        dghm dghmVar = dggmVar.a;
        if (dghmVar == null) {
            dghmVar = dghm.f;
        }
        this.f.a().k(dghmVar.e, dkcp.PHOTO);
        return cqkl.a;
    }

    @Override // defpackage.bkiw
    public cqkl q(View view) {
        List<dggo> list;
        bvip bvipVar;
        isc a = this.h.a(view);
        if (this.c == null || (list = this.k) == null || (bvipVar = this.d) == null || this.l == null) {
            return cqkl.a;
        }
        dbsk.s(bvipVar);
        final dggo dggoVar = list.get(bvipVar.k().intValue());
        if (dggoVar == null) {
            return cqkl.a;
        }
        jhm jhmVar = this.l;
        dbsk.s(jhmVar);
        jhmVar.d(new View.OnClickListener(this, dggoVar) { // from class: bkiy
            private final bkja a;
            private final dggo b;

            {
                this.a = this;
                this.b = dggoVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                bkja bkjaVar = this.a;
                dggo dggoVar2 = this.b;
                bcri bcriVar = bkjaVar.b;
                bbvn bbvnVar = bbvn.d;
                btvo btvoVar = bkjaVar.a;
                bwrs<ilo> bwrsVar = bkjaVar.c;
                dbsk.s(bwrsVar);
                bcriVar.a(bbvnVar, btvoVar, bwrsVar.c()).a(bkjaVar.z(dggoVar2));
            }
        });
        a.a(dcdc.f(jhmVar.c()));
        a.show();
        bvip bvipVar2 = this.d;
        dbsk.s(bvipVar2);
        bvipVar2.o();
        a.setOnDismissListener(new PopupMenu.OnDismissListener(this) { // from class: bkiz
            private final bkja a;

            {
                this.a = this;
            }

            @Override // android.widget.PopupMenu.OnDismissListener
            public final void onDismiss(PopupMenu popupMenu) {
                bvip bvipVar3 = this.a.d;
                dbsk.s(bvipVar3);
                bvipVar3.n();
            }
        });
        return cqkl.a;
    }

    @Override // defpackage.bkiw
    @dzsi
    public CharSequence r() {
        return null;
    }

    @Override // defpackage.bkiw
    public cqkl s(cjqm cjqmVar) {
        return cqkl.a;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        if (c != null && c.cT().a()) {
            dggs b = c.cT().b();
            if (b.a.size() == 0) {
                return;
            }
            this.c = bwrsVar;
            this.k = b.a;
            cjtd ca = c.ca();
            bvim g = bvin.g();
            cjta c2 = cjtd.c(ca);
            c2.d = dtxu.bc;
            g.g(c2.a());
            g.f(true);
            g.e(true);
            g.c(this.e.getText(R.string.RECENT_PHOTOS_SHOW_NEXT_CONTENT_DESCRIPTION));
            g.b(this.e.getText(R.string.RECENT_PHOTOS_SHOW_PREVIOUS_CONTENT_DESCRIPTION));
            g.d(true);
            bvin a = g.a();
            bviq bviqVar = this.g;
            List<dggo> list = this.k;
            dbsk.s(list);
            dccx F = dcdc.F();
            for (dggo dggoVar : list) {
                dggq dggqVar = dggoVar.a;
                if (dggqVar == null) {
                    dggqVar = dggq.d;
                }
                dggc b2 = dggc.b(dggqVar.c);
                if (b2 == null) {
                    b2 = dggc.UNKNOWN;
                }
                if (b2 == dggc.PHOTO) {
                    String str = dggqVar.a;
                    F.g(new bvir("", new jic(str, jfv.a(str), ibm.p(), 250, true, null, new ckql())));
                }
            }
            this.d = bviqVar.a(F.f(), 0, new bvio(3000L), new bvil(this) { // from class: bkix
                private final bkja a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvil
                public final void a() {
                    cqkx.p(this.a);
                }
            }, a);
            jhm jhmVar = new jhm();
            jhmVar.l = R.string.RECENT_PHOTOS_REPORT;
            jhmVar.a = this.e.getText(R.string.RECENT_PHOTOS_REPORT);
            cjta c3 = cjtd.c(ca);
            c3.d = dtxu.bg;
            jhmVar.f = c3.a();
            this.l = jhmVar;
            bvip bvipVar = this.d;
            dbsk.s(bvipVar);
            bvipVar.n();
        }
    }

    @Override // defpackage.bega
    public void u() {
        this.c = null;
        this.k = null;
        this.l = null;
    }

    @Override // defpackage.bkiw
    public void v() {
        bvip bvipVar = this.d;
        if (bvipVar != null) {
            bvipVar.o();
        }
    }

    @Override // defpackage.bega
    public Boolean w() {
        List<dggo> list;
        boolean z = false;
        if (this.c != null && (list = this.k) != null && !list.isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bkiw
    public void x() {
        bvip bvipVar = this.d;
        if (bvipVar != null) {
            bvipVar.n();
        }
    }

    @Override // defpackage.bkiw
    public void y() {
        if (this.j.j() == bege.OVERVIEW) {
            x();
        } else {
            v();
        }
    }

    public final dwfl z(dggo dggoVar) {
        dwfi bZ = dwfl.w.bZ();
        dggq dggqVar = dggoVar.a;
        if (dggqVar == null) {
            dggqVar = dggq.d;
        }
        String str = dggqVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfl dwflVar = (dwfl) bZ.b;
        str.getClass();
        dwflVar.a |= 128;
        dwflVar.h = str;
        dggu dgguVar = dggoVar.b;
        if (dgguVar == null) {
            dgguVar = dggu.f;
        }
        dghc dghcVar = dgguVar.b;
        if (dghcVar == null) {
            dghcVar = dghc.c;
        }
        String str2 = dghcVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfl dwflVar2 = (dwfl) bZ.b;
        str2.getClass();
        dwflVar2.a |= 32;
        dwflVar2.g = str2;
        dwfg bZ2 = dwfh.d.bZ();
        dnpp bZ3 = dnpq.g.bZ();
        dggu dgguVar2 = dggoVar.b;
        if (dgguVar2 == null) {
            dgguVar2 = dggu.f;
        }
        dggm dggmVar = dgguVar2.c;
        if (dggmVar == null) {
            dggmVar = dggm.b;
        }
        dghm dghmVar = dggmVar.a;
        if (dghmVar == null) {
            dghmVar = dghm.f;
        }
        String str3 = dghmVar.b;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnpq dnpqVar = (dnpq) bZ3.b;
        str3.getClass();
        dnpqVar.a |= 8;
        dnpqVar.d = str3;
        dggu dgguVar3 = dggoVar.b;
        if (dgguVar3 == null) {
            dgguVar3 = dggu.f;
        }
        dggm dggmVar2 = dgguVar3.c;
        if (dggmVar2 == null) {
            dggmVar2 = dggm.b;
        }
        dghm dghmVar2 = dggmVar2.a;
        if (dghmVar2 == null) {
            dghmVar2 = dghm.f;
        }
        String str4 = dghmVar2.c;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnpq dnpqVar2 = (dnpq) bZ3.b;
        str4.getClass();
        dnpqVar2.a |= 16;
        dnpqVar2.e = str4;
        dggu dgguVar4 = dggoVar.b;
        if (dgguVar4 == null) {
            dgguVar4 = dggu.f;
        }
        dggm dggmVar3 = dgguVar4.c;
        if (dggmVar3 == null) {
            dggmVar3 = dggm.b;
        }
        dghm dghmVar3 = dggmVar3.a;
        if (dghmVar3 == null) {
            dghmVar3 = dghm.f;
        }
        dgbo dgboVar = dghmVar3.d;
        if (dgboVar == null) {
            dgboVar = dgbo.e;
        }
        String str5 = dgboVar.c;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnpq dnpqVar3 = (dnpq) bZ3.b;
        str5.getClass();
        dnpqVar3.a |= 2;
        dnpqVar3.c = str5;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwfh dwfhVar = (dwfh) bZ2.b;
        dnpq bK = bZ3.bK();
        bK.getClass();
        dwfhVar.c = bK;
        dwfhVar.a |= 2;
        dwfh bK2 = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfl dwflVar3 = (dwfl) bZ.b;
        bK2.getClass();
        dwflVar3.k = bK2;
        dwflVar3.a |= 1024;
        dizg bZ4 = dizh.j.bZ();
        dggq dggqVar2 = dggoVar.a;
        if (dggqVar2 == null) {
            dggqVar2 = dggq.d;
        }
        dggg dgggVar = dggqVar2.b;
        if (dgggVar == null) {
            dgggVar = dggg.d;
        }
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dizh dizhVar = (dizh) bZ4.b;
        dgggVar.getClass();
        dizhVar.b = dgggVar;
        dizhVar.a |= 1;
        diys bZ5 = diyt.c.bZ();
        djry bZ6 = djrz.c.bZ();
        dggu dgguVar5 = dggoVar.b;
        if (dgguVar5 == null) {
            dgguVar5 = dggu.f;
        }
        dggm dggmVar4 = dgguVar5.c;
        if (dggmVar4 == null) {
            dggmVar4 = dggm.b;
        }
        dghm dghmVar4 = dggmVar4.a;
        if (dghmVar4 == null) {
            dghmVar4 = dghm.f;
        }
        String str6 = dghmVar4.e;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        djrz djrzVar = (djrz) bZ6.b;
        str6.getClass();
        djrzVar.a |= 4;
        djrzVar.b = str6;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        diyt diytVar = (diyt) bZ5.b;
        djrz bK3 = bZ6.bK();
        bK3.getClass();
        dsrj<djrz> dsrjVar = diytVar.a;
        if (!dsrjVar.a()) {
            diytVar.a = dsqw.cl(dsrjVar);
        }
        diytVar.a.add(bK3);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dizh dizhVar2 = (dizh) bZ4.b;
        diyt bK4 = bZ5.bK();
        bK4.getClass();
        dizhVar2.e = bK4;
        dizhVar2.a |= 8;
        dkng dkngVar = this.a.getLensParameters().i;
        if (dkngVar == null) {
            dkngVar = dkng.c;
        }
        dknf dknfVar = dkngVar.a;
        if (dknfVar == null) {
            dknfVar = dknf.h;
        }
        if (dknfVar.g) {
            dggu dgguVar6 = dggoVar.b;
            if (dgguVar6 == null) {
                dgguVar6 = dggu.f;
            }
            if ((dgguVar6.a & 16) != 0) {
                dizk bZ7 = dizl.e.bZ();
                dggu dgguVar7 = dggoVar.b;
                if (dgguVar7 == null) {
                    dgguVar7 = dggu.f;
                }
                dgha dghaVar = dgguVar7.e;
                if (dghaVar == null) {
                    dghaVar = dgha.d;
                }
                for (dggz dggzVar : dghaVar.a) {
                    dizm bZ8 = dizn.c.bZ();
                    String str7 = dggzVar.a;
                    if (bZ8.c) {
                        bZ8.bF();
                        bZ8.c = false;
                    }
                    dizn diznVar = (dizn) bZ8.b;
                    str7.getClass();
                    diznVar.a |= 1;
                    diznVar.b = str7;
                    dizn bK5 = bZ8.bK();
                    if (bZ7.c) {
                        bZ7.bF();
                        bZ7.c = false;
                    }
                    dizl dizlVar = (dizl) bZ7.b;
                    bK5.getClass();
                    dsrj<dizn> dsrjVar2 = dizlVar.b;
                    if (!dsrjVar2.a()) {
                        dizlVar.b = dsqw.cl(dsrjVar2);
                    }
                    dizlVar.b.add(bK5);
                }
                dizi bZ9 = dizj.g.bZ();
                dggx dggxVar = dghaVar.c;
                if (dggxVar == null) {
                    dggxVar = dggx.f;
                }
                float f = dggxVar.a;
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                dizj dizjVar = (dizj) bZ9.b;
                dizjVar.a |= 1;
                dizjVar.b = f;
                dggx dggxVar2 = dghaVar.c;
                if (dggxVar2 == null) {
                    dggxVar2 = dggx.f;
                }
                float f2 = dggxVar2.b;
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                dizj dizjVar2 = (dizj) bZ9.b;
                dizjVar2.a |= 2;
                dizjVar2.c = f2;
                dggx dggxVar3 = dghaVar.c;
                if (dggxVar3 == null) {
                    dggxVar3 = dggx.f;
                }
                float f3 = dggxVar3.d;
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                dizj dizjVar3 = (dizj) bZ9.b;
                dizjVar3.a |= 8;
                dizjVar3.e = f3;
                dggx dggxVar4 = dghaVar.c;
                if (dggxVar4 == null) {
                    dggxVar4 = dggx.f;
                }
                float f4 = dggxVar4.c;
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                dizj dizjVar4 = (dizj) bZ9.b;
                dizjVar4.a |= 4;
                dizjVar4.d = f4;
                dggx dggxVar5 = dghaVar.c;
                if (dggxVar5 == null) {
                    dggxVar5 = dggx.f;
                }
                float f5 = dggxVar5.e;
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                dizj dizjVar5 = (dizj) bZ9.b;
                dizjVar5.a |= 16;
                dizjVar5.f = f5;
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                dizl dizlVar2 = (dizl) bZ7.b;
                dizj bK6 = bZ9.bK();
                bK6.getClass();
                dizlVar2.d = bK6;
                dizlVar2.a |= 2;
                float f6 = dghaVar.b;
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                dizl dizlVar3 = (dizl) bZ7.b;
                dizlVar3.a |= 1;
                dizlVar3.c = f6;
                dizl bK7 = bZ7.bK();
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dizh dizhVar3 = (dizh) bZ4.b;
                bK7.getClass();
                dizhVar3.i = bK7;
                dizhVar3.a |= 64;
            }
        }
        dizh bK8 = bZ4.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfl dwflVar4 = (dwfl) bZ.b;
        bK8.getClass();
        dwflVar4.p = bK8;
        dwflVar4.a |= 32768;
        dwfl dwflVar5 = (dwfl) bZ.b;
        dwflVar5.f = 3;
        dwflVar5.a |= 16;
        return bZ.bK();
    }

    @Override // defpackage.bkiw
    public Boolean h() {
        boolean z = false;
        if (this.k == null || this.d == null) {
            return false;
        }
        dggm dggmVar = A().c;
        if (dggmVar == null) {
            dggmVar = dggm.b;
        }
        dghm dghmVar = dggmVar.a;
        if (dghmVar == null) {
            dghmVar = dghm.f;
        }
        if (1 == (dghmVar.a & 1)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bkiw
    public Boolean k() {
        boolean z = false;
        if (this.k == null || this.d == null) {
            return false;
        }
        dggk dggkVar = A().d;
        if (dggkVar == null) {
            dggkVar = dggk.c;
        }
        if (1 == (dggkVar.a & 1)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bkiw
    public Boolean m() {
        boolean z = false;
        if (this.k == null || this.d == null) {
            return false;
        }
        dghc dghcVar = A().b;
        if (dghcVar == null) {
            dghcVar = dghc.c;
        }
        if ((dghcVar.a & 1) != 0) {
            dghc dghcVar2 = A().b;
            if (dghcVar2 == null) {
                dghcVar2 = dghc.c;
            }
            if (!dghcVar2.b.isEmpty()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
