package defpackage;

import android.app.ProgressDialog;
import android.os.Bundle;
import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bjdi  reason: default package */
/* loaded from: classes3.dex */
public class bjdi implements btzi, bjda {
    public final gga a;
    public final gdc b;
    public final PublicDisclosureLayout$PublicDisclosureViewModelImpl c;
    @dzsi
    public final bjea d;
    public final ilo e;
    public final djap f;
    final ProgressDialog g;
    public final String h;
    String i;
    private final bjhc l;
    private final bvfk m;
    private final btrm n;
    private final bjgh o;
    private final chhr p;
    private final chhs q;
    private final bkaf r;
    private final cjtd s;
    private Boolean t;
    private final bjdf u;
    private final int w;
    public Boolean j = false;
    public boolean k = false;
    private boolean v = false;

    public bjdi(gga ggaVar, bjhc bjhcVar, gdc gdcVar, bvfk bvfkVar, btrm btrmVar, bjgi bjgiVar, chhr chhrVar, chht chhtVar, bkag bkagVar, PublicDisclosureLayout$PublicDisclosureViewModelImpl publicDisclosureLayout$PublicDisclosureViewModelImpl, ilo iloVar, List<dqcq> list, @dzsi bjea bjeaVar, @dzsi djam djamVar) {
        this.a = ggaVar;
        this.l = bjhcVar;
        this.b = gdcVar;
        this.m = bvfkVar;
        this.n = btrmVar;
        this.o = bjgiVar.b(iloVar);
        this.p = chhrVar;
        this.q = chhtVar.a(dhpj.UNKNOWN_CONTRIBUTION_SOURCE);
        this.c = publicDisclosureLayout$PublicDisclosureViewModelImpl;
        this.e = iloVar;
        dcdc.r(list);
        this.d = bjeaVar;
        bwrs a = bwrs.a(iloVar);
        bjde bjdeVar = new bjde(this);
        gga a2 = bkagVar.a.a();
        bkag.a(a2, 1);
        jmx a3 = bkagVar.b.a();
        bkag.a(a3, 2);
        cqhn a4 = bkagVar.c.a();
        bkag.a(a4, 3);
        cqhu a5 = bkagVar.d.a();
        bkag.a(a5, 4);
        bver a6 = bkagVar.e.a();
        bkag.a(a6, 5);
        Executor a7 = bkagVar.f.a();
        bkag.a(a7, 6);
        bjyc a8 = bkagVar.g.a();
        bkag.a(a8, 7);
        bjyj a9 = bkagVar.h.a();
        bkag.a(a9, 8);
        bkag.a(a, 9);
        bkag.a(bjdeVar, 10);
        this.r = new bkaf(a2, a3, a4, a5, a6, a7, a8, a9, a, bjdeVar);
        publicDisclosureLayout$PublicDisclosureViewModelImpl.m(iloVar);
        publicDisclosureLayout$PublicDisclosureViewModelImpl.o(cayd.TOOLTIP);
        publicDisclosureLayout$PublicDisclosureViewModelImpl.n(true);
        cjta c = cjtd.c(iloVar.bZ());
        c.d = dtxy.fV;
        c.a();
        cjta c2 = cjtd.c(iloVar.bZ());
        c2.d = dtxl.P;
        this.s = c2.a();
        this.w = djamVar == null ? 1 : 2;
        djap bZ = djar.l.bZ();
        String o = iloVar.ai().o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djar djarVar = (djar) bZ.b;
        o.getClass();
        djarVar.a |= 4;
        djarVar.d = o;
        String cG = iloVar.cG();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djar djarVar2 = (djar) bZ.b;
        cG.getClass();
        djarVar2.a |= 8;
        djarVar2.e = cG;
        boolean d = bjhcVar.d(iloVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djar djarVar3 = (djar) bZ.b;
        djarVar3.a |= 64;
        djarVar3.i = d;
        djai djaiVar = iloVar.h().bd;
        dqcu dqcuVar = (djaiVar == null ? djai.g : djaiVar).f;
        dqcuVar = dqcuVar == null ? dqcu.c : dqcuVar;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djar djarVar4 = (djar) bZ.b;
        dqcuVar.getClass();
        djarVar4.f = dqcuVar;
        djarVar4.a |= 16;
        if (djamVar == null) {
            djar djarVar5 = (djar) bZ.b;
            djarVar5.b = 1;
            djarVar5.a |= 1;
            djgw a10 = chiw.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djar djarVar6 = (djar) bZ.b;
            a10.getClass();
            djarVar6.k = a10;
            djarVar6.a |= 512;
        } else {
            djar djarVar7 = (djar) bZ.b;
            djarVar7.b = 2;
            int i = djarVar7.a | 1;
            djarVar7.a = i;
            String str = djamVar.b;
            str.getClass();
            djarVar7.a = 2 | i;
            djarVar7.c = str;
        }
        this.f = bZ;
        ProgressDialog progressDialog = new ProgressDialog(ggaVar, 0);
        progressDialog.setMessage(ggaVar.getString(R.string.LOADING));
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        this.g = progressDialog;
        ggaVar.getString(R.string.POSTING_PUBLICLY);
        String str2 = djamVar == null ? "" : djamVar.d;
        this.h = str2;
        this.i = str2;
        this.t = Boolean.valueOf(str2.length() >= 250);
        this.u = new bjdh(this);
    }

    private final Boolean t() {
        return Boolean.valueOf(!this.r.b().isEmpty());
    }

    @Override // defpackage.btzi
    public void QY(final btzr<djar> btzrVar, btzy btzyVar) {
        r(false);
        this.o.b(new Runnable(this, btzrVar) { // from class: bjdb
            private final bjdi a;
            private final btzr b;

            {
                this.a = this;
                this.b = btzrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.s((djar) this.b.a);
            }
        });
    }

    @Override // defpackage.bjda
    public Boolean c() {
        return t();
    }

    @Override // defpackage.bjda
    public CharSequence e() {
        return this.i;
    }

    @Override // defpackage.bjda
    public void f(CharSequence charSequence) {
        this.r.d(charSequence.toString());
        this.i = charSequence.toString();
        this.u.b();
        if (this.t.booleanValue() != (this.i.length() >= 250)) {
            this.t = Boolean.valueOf(!this.t.booleanValue());
            cqkx.p(this);
        }
    }

    @Override // defpackage.bjda
    public Boolean g() {
        return this.t;
    }

    @Override // defpackage.bjfj
    public jbk h() {
        return this.u;
    }

    @Override // defpackage.bjfj
    public void i(Bundle bundle) {
        String string = bundle.getString("entered_text_key");
        if (string != null) {
            f(string);
        }
        if (this.d == null) {
            return;
        }
        djao djaoVar = (djao) bvrs.e(bundle, djao.class, (dssr) djao.i.cu(7));
        bjea bjeaVar = this.d;
        dbsk.s(djaoVar);
        bjeaVar.f(djaoVar.h);
    }

    @Override // defpackage.bjfj
    public void j(Bundle bundle) {
        bundle.putString("entered_text_key", this.i);
        if (this.d == null) {
            return;
        }
        djan bZ = djao.i.bZ();
        bZ.a(this.d.g());
        bvrs.l(bundle, bZ.bK());
    }

    @Override // defpackage.bjda
    public void k(boolean z, boolean z2) {
        boolean z3 = false;
        if (!z && z2) {
            z3 = true;
        }
        this.j = Boolean.valueOf(z3);
        this.u.b();
        p(z);
    }

    @Override // defpackage.bjda
    public Boolean l() {
        return Boolean.valueOf(this.v);
    }

    @Override // defpackage.bjda
    public cjtd m() {
        return this.s;
    }

    @Override // defpackage.bjda
    @dzsi
    public bjdw n() {
        return this.d;
    }

    @Override // defpackage.bjda
    @dzsi
    public bjwz o() {
        if (t().booleanValue()) {
            return this.r;
        }
        return null;
    }

    public final void p(boolean z) {
        this.v = z;
        cqkx.p(this);
    }

    final void r(boolean z) {
        if (z) {
            this.g.show();
        } else {
            this.g.dismiss();
        }
        this.k = z;
        this.u.b();
    }

    public final void s(djar djarVar) {
        if (this.l.a()) {
            this.m.a(djarVar, this, bvrj.UI_THREAD);
            r(true);
            return;
        }
        this.l.c(bjha.a);
    }

    @Override // defpackage.caye
    public cayf x() {
        return this.c;
    }

    @Override // defpackage.btzi
    /* renamed from: q */
    public void QZ(btzr<djar> btzrVar, djav djavVar) {
        djgl bK;
        int a = djau.a(djavVar.b);
        if (a == 0 || a != 2) {
            QY(btzrVar, btzy.j);
            return;
        }
        r(false);
        this.n.b(new bjfg());
        this.n.b(new bjfa(this.w, 1));
        this.a.s();
        if (this.w != 1) {
            return;
        }
        if ((djavVar.a & 8) != 0) {
            bK = djavVar.d;
            if (bK == null) {
                bK = djgl.g;
            }
        } else {
            chhs chhsVar = this.q;
            djgk bZ = djgl.g.bZ();
            djfu bZ2 = djfx.e.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            djfx djfxVar = (djfx) bZ2.b;
            djfxVar.b = 0;
            djfxVar.a |= 1;
            djva bZ3 = djvd.d.bZ();
            djvc djvcVar = djvc.MAJOR_TYPE;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            djvd djvdVar = (djvd) bZ3.b;
            djvdVar.b = djvcVar.d;
            djvdVar.a |= 1;
            String string = chhsVar.b.getString(R.string.PLACE_QA_QUESTION_THANK_YOU_TITLE);
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            djvd djvdVar2 = (djvd) bZ3.b;
            string.getClass();
            djvdVar2.a |= 2;
            djvdVar2.c = string;
            bZ2.c(bZ3);
            djva bZ4 = djvd.d.bZ();
            djvc djvcVar2 = djvc.MINOR_TYPE;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            djvd djvdVar3 = (djvd) bZ4.b;
            djvdVar3.b = djvcVar2.d;
            djvdVar3.a |= 1;
            String string2 = chhsVar.b.getString(R.string.PLACE_QA_QUESTION_THANK_YOU_SUBTITLE);
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            djvd djvdVar4 = (djvd) bZ4.b;
            string2.getClass();
            djvdVar4.a |= 2;
            djvdVar4.c = string2;
            bZ2.c(bZ4);
            djeq bZ5 = djev.h.bZ();
            String string3 = chhsVar.b.getString(R.string.PLACE_QA_QUESTION_THANK_YOU_ASK_ANOTHER);
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            djev djevVar = (djev) bZ5.b;
            string3.getClass();
            djevVar.a |= 1;
            djevVar.b = string3;
            djdo bZ6 = djep.c.bZ();
            djed bZ7 = djee.a.bZ();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            djep djepVar = (djep) bZ6.b;
            djee bK2 = bZ7.bK();
            bK2.getClass();
            djepVar.b = bK2;
            djepVar.a = 7;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            djev djevVar2 = (djev) bZ5.b;
            djep bK3 = bZ6.bK();
            bK3.getClass();
            djevVar2.c = bK3;
            djevVar2.a = 2 | djevVar2.a;
            bZ2.a(bZ5);
            bZ2.b(chhsVar.c);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djgl djglVar = (djgl) bZ.b;
            djfx bK4 = bZ2.bK();
            bK4.getClass();
            djglVar.c = bK4;
            djglVar.b = 1;
            bK = bZ.bK();
        }
        this.p.b(bK, dtxy.gm, dtxy.gn, this.e);
    }

    @Override // defpackage.bjda
    @dzsi
    public String d() {
        if (this.d == null) {
            return this.a.getString((this.e.bf().a & 4194304) != 0 ? R.string.PLACE_QA_ASK_A_QUESTION_PAGE_HINT_TEXT_NO_OWNER : R.string.PLACE_QA_ASK_A_QUESTION_PAGE_HINT_TEXT);
        }
        return this.a.getString(R.string.PLACE_QA_ASK_A_QUESTION_PAGE_HINT_TEXT_CITY_QA, new Object[]{this.e.n()});
    }
}
