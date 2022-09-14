package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cewc  reason: default package */
/* loaded from: classes4.dex */
public class cewc implements cesu {
    @dzsi
    private cexq B;
    @dzsi
    private cewb C;
    public final gga a;
    public final bvrb b;
    public final bwft c;
    public final axjh d;
    public final afzv e;
    public final bvnt f;
    public final cexk g;
    public final cetx h;
    public final cevz i;
    public final cfli j;
    public final axhs k;
    public final cjot l;
    public final acyp m;
    public jib o;
    @dzsi
    public String p;
    private final akfa u;
    private final cetk v;
    private final cexr x;
    private final cese z;
    private final List<cesi> w = new ArrayList();
    private final cewa y = new cewa(this);
    private final cqfd A = new cevw(this);
    final crzp<dqaw> n = new cevx(this);
    public boolean q = true;
    public boolean r = false;
    public int s = 0;
    public dfqe t = dfqe.UNDEFINED_STATE;

    public cewc(gga ggaVar, bvrb bvrbVar, cqhn cqhnVar, cqhu cqhuVar, ceun ceunVar, bjgl bjglVar, bwft bwftVar, axjh axjhVar, afzv afzvVar, bvnt bvntVar, akfa akfaVar, cfli cfliVar, cexl cexlVar, cetk cetkVar, cetx cetxVar, cexr cexrVar, axhs axhsVar, cjot cjotVar, acyp acypVar, cese ceseVar, cevz cevzVar, @dzsi String str) {
        this.a = ggaVar;
        this.b = bvrbVar;
        this.c = bwftVar;
        this.f = bvntVar;
        this.d = axjhVar;
        this.e = afzvVar;
        this.u = akfaVar;
        this.j = cfliVar;
        gga a = cexlVar.a.a();
        cexl.a(a, 1);
        cqhn a2 = cexlVar.b.a();
        cexl.a(a2, 2);
        Executor a3 = cexlVar.c.a();
        cexl.a(a3, 3);
        dxio a4 = ((dxjh) cexlVar.d).a();
        cexl.a(a4, 4);
        cavs a5 = cexlVar.e.a();
        cexl.a(a5, 5);
        axjh a6 = cexlVar.f.a();
        cexl.a(a6, 6);
        ceet a7 = cexlVar.g.a();
        cexl.a(a7, 7);
        cetx a8 = cexlVar.h.a();
        cexl.a(a8, 8);
        cetz a9 = cexlVar.i.a();
        cexl.a(a9, 9);
        cexn a10 = cexlVar.j.a();
        cexl.a(a10, 10);
        ceyw a11 = cexlVar.k.a();
        cexl.a(a11, 11);
        cetv a12 = cexlVar.l.a();
        cexl.a(a12, 12);
        axni a13 = cexlVar.m.a();
        cexl.a(a13, 13);
        cese a14 = cexlVar.n.a();
        cexl.a(a14, 14);
        cexl.a(cevzVar, 15);
        this.g = new cexk(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, cevzVar, str);
        this.v = cetkVar;
        this.h = cetxVar;
        this.x = cexrVar;
        this.k = axhsVar;
        this.l = cjotVar;
        this.m = acypVar;
        this.z = ceseVar;
        this.i = cevzVar;
        this.p = str;
        this.o = z(ggaVar);
    }

    private static jib z(gga ggaVar) {
        jhz e = jib.g(ggaVar, "").e();
        e.x = false;
        e.o = cjtd.a(dtxl.eM);
        return e.b();
    }

    @Override // defpackage.jbk
    public jib NC() {
        return this.o;
    }

    @Override // defpackage.cesu
    public cete b() {
        return this.g;
    }

    @Override // defpackage.cesu
    public List<cesi> c() {
        bvrj.UI_THREAD.c();
        return this.w;
    }

    @Override // defpackage.cesu
    @dzsi
    public cetf d() {
        return this.B;
    }

    @Override // defpackage.cesu
    public jam e() {
        return this.y;
    }

    @Override // defpackage.cesu
    public Boolean f() {
        return Boolean.valueOf(this.q);
    }

    @Override // defpackage.cesu
    @dzsi
    public cest g() {
        return this.C;
    }

    @Override // defpackage.cesu
    public cqfd h() {
        return this.A;
    }

    @Override // defpackage.cesu
    public cjtd i() {
        if (this.p == null) {
            return cjtd.a(dtxl.fu);
        }
        return cjtd.a(dtxl.fv);
    }

    @Override // defpackage.cesu
    public Boolean j() {
        return Boolean.valueOf(this.z.b());
    }

    public void k() {
        ceyc ceycVar = (ceyc) y(ceyc.class);
        if (ceycVar != null) {
            ceycVar.k();
        }
    }

    public void l() {
        ceyc ceycVar = (ceyc) y(ceyc.class);
        if (ceycVar != null) {
            ceycVar.l();
        }
    }

    public void m() {
        ceyc ceycVar = (ceyc) y(ceyc.class);
        if (ceycVar != null) {
            ceycVar.m();
        }
    }

    public void n(bqje bqjeVar) {
        int i = bqjeVar.c;
        if (i == 1 || i == 2) {
            u();
        }
    }

    public void o(cdjh cdjhVar) {
        int d = cdjhVar.d();
        int i = d - 1;
        if (d != 0) {
            if (i != 0 && i != 1 && i != 2) {
                return;
            }
            u();
            return;
        }
        throw null;
    }

    public void p(bkpe bkpeVar) {
        ceyc ceycVar = (ceyc) y(ceyc.class);
        if (ceycVar != null) {
            ceycVar.n(bkpeVar);
        }
    }

    public void q(azrb azrbVar) {
        int i = azrbVar.b;
        if (i == 1 || i == 2 || i == 3) {
            baad baadVar = azrbVar.a;
            cevl cevlVar = (cevl) y(cevl.class);
            if (baadVar == null || cevlVar == null) {
                u();
                return;
            }
            int i2 = i - 1;
            if (i2 == 0) {
                cevlVar.k(baadVar);
            } else if (i2 != 1) {
                cevlVar.m(baadVar);
            } else {
                cevlVar.l(baadVar);
            }
        }
    }

    public void r(azrc azrcVar) {
        baad baadVar = azrcVar.a;
        cevl cevlVar = (cevl) y(cevl.class);
        if (cevlVar == null) {
            u();
        } else if (baadVar.x()) {
            cevlVar.k(baadVar);
        } else {
            cevlVar.m(baadVar);
        }
    }

    public void s(diak diakVar) {
        cewb cewbVar;
        dhsy dhsyVar;
        cesi ceycVar;
        bvrj.UI_THREAD.c();
        this.q = false;
        this.g.x(diakVar);
        axne r = this.g.r();
        if (r != null) {
            r.m().e(this.n, this.b.h());
        }
        int i = 2;
        if ((diakVar.a & 2) != 0) {
            dkfl dkflVar = diakVar.d;
            if (dkflVar == null) {
                dkflVar = dkfl.d;
            }
            cewbVar = new cewb(this, dkflVar);
        } else {
            cewbVar = null;
        }
        this.C = cewbVar;
        dhtc dhtcVar = diakVar.b;
        if (dhtcVar == null) {
            dhtcVar = dhtc.l;
        }
        dsrj<dhsy> dsrjVar = diakVar.c;
        l();
        this.w.clear();
        for (dhsy dhsyVar2 : dsrjVar) {
            cetk cetkVar = this.v;
            String str = this.p;
            cevz cevzVar = this.i;
            drds drdsVar = drds.UNKNOWN_CREATOR_CONTRIBUTION_TYPE;
            drds b = drds.b(dhsyVar2.c);
            if (b == null) {
                b = drds.UNKNOWN_CREATOR_CONTRIBUTION_TYPE;
            }
            switch (b.ordinal()) {
                case 1:
                case 7:
                    ceyd ceydVar = cetkVar.b;
                    Activity activity = (Activity) ((dxjd) ceydVar.a).a;
                    ceyd.a(activity, 1);
                    ceet a = ceydVar.b.a();
                    ceyd.a(a, 2);
                    bqji a2 = ceydVar.c.a();
                    ceyd.a(a2, 3);
                    ceyb a3 = ceydVar.d.a();
                    ceyd.a(a3, 4);
                    cese a4 = ceydVar.e.a();
                    ceyd.a(a4, 5);
                    cebr a5 = ceydVar.f.a();
                    ceyd.a(a5, 6);
                    ceyd.a(dhtcVar, 7);
                    ceyd.a(dhsyVar2, 8);
                    ceyd.a(cevzVar, 10);
                    dhsyVar = dhsyVar2;
                    ceycVar = new ceyc(activity, a, a2, a3, a4, a5, dhtcVar, dhsyVar2, str, cevzVar);
                    break;
                case 2:
                    cewk cewkVar = cetkVar.a;
                    Activity activity2 = (Activity) ((dxjd) cewkVar.a).a;
                    cewk.a(activity2, 1);
                    akzh a6 = cewkVar.b.a();
                    cewk.a(a6, 2);
                    ceet a7 = cewkVar.c.a();
                    cewk.a(a7, 3);
                    bbut a8 = cewkVar.d.a();
                    cewk.a(a8, 4);
                    cewg a9 = cewkVar.e.a();
                    cewk.a(a9, 5);
                    cese a10 = cewkVar.f.a();
                    cewk.a(a10, 6);
                    cewk.a(dhsyVar2, 7);
                    cewk.a(cevzVar, 9);
                    ceycVar = new cewj(activity2, a6, a7, a8, a9, a10, dhsyVar2, str, cevzVar);
                    dhsyVar = dhsyVar2;
                    break;
                case 3:
                    cevm cevmVar = cetkVar.c;
                    gga a11 = cevmVar.a.a();
                    cevm.a(a11, 1);
                    cqhn a12 = cevmVar.b.a();
                    cevm.a(a12, i);
                    ceet a13 = cevmVar.c.a();
                    cevm.a(a13, 3);
                    axwo a14 = cevmVar.d.a();
                    cevm.a(a14, 4);
                    cevj a15 = cevmVar.e.a();
                    cevm.a(a15, 5);
                    cese a16 = cevmVar.f.a();
                    cevm.a(a16, 6);
                    cevm.a(dhsyVar2, 7);
                    cevm.a(cevzVar, 9);
                    ceycVar = new cevl(a11, a12, a13, a14, a15, a16, dhsyVar2, str, cevzVar);
                    dhsyVar = dhsyVar2;
                    break;
                case 4:
                case 5:
                case 6:
                    ceet a17 = cetkVar.d.a.a();
                    ceyu.a(a17, 1);
                    ceyu.a(dhtcVar, i);
                    ceyu.a(dhsyVar2, 3);
                    ceyu.a(cevzVar, 5);
                    ceycVar = new ceyt(a17, dhtcVar, dhsyVar2, str, cevzVar);
                    dhsyVar = dhsyVar2;
                    break;
                default:
                    dhsyVar = dhsyVar2;
                    drds b2 = drds.b(dhsyVar.c);
                    if (b2 == null) {
                        b2 = drds.UNKNOWN_CREATOR_CONTRIBUTION_TYPE;
                    }
                    b2.name();
                    ceycVar = null;
                    break;
            }
            if (ceycVar == null) {
                drds b3 = drds.b(dhsyVar.c);
                if (b3 == null) {
                    b3 = drds.UNKNOWN_CREATOR_CONTRIBUTION_TYPE;
                }
                b3.name();
            } else {
                int i2 = dhsyVar.c;
                this.w.add(ceycVar);
            }
            i = 2;
        }
        k();
        dhtc dhtcVar2 = diakVar.b;
        if (dhtcVar2 == null) {
            dhtcVar2 = dhtc.l;
        }
        dqkn dqknVar = dhtcVar2.b;
        if (dqknVar == null) {
            dqknVar = dqkn.e;
        }
        final String str2 = dqknVar.b;
        jhz e = jib.g(this.a, str2).e();
        e.r = j().booleanValue() ? 255 : this.s;
        int i3 = this.s;
        e.s = i3;
        boolean z = i3 > 0;
        e.x = z;
        e.h = z;
        e.o = cjtd.a(dtxl.eM);
        e.F = 4;
        jhm a18 = jhm.a();
        a18.h = 1;
        a18.c = cqrt.f(2131231745);
        a18.d = ibm.p();
        a18.a = this.a.getString(R.string.PROFILE_SHARE_HINT);
        a18.b = this.a.getString(R.string.PROFILE_SHARE_HINT);
        a18.f = cjtd.a(dtxl.fH);
        a18.d(new View.OnClickListener(this) { // from class: cevq
            private final cewc a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string;
                cewc cewcVar = this.a;
                dhtc C = cewcVar.g.C();
                if (C.equals(dhtc.l)) {
                    return;
                }
                dqkn dqknVar2 = C.b;
                if (dqknVar2 == null) {
                    dqknVar2 = dqkn.e;
                }
                String str3 = dqknVar2.d;
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 37);
                sb.append("https://www.google.com/maps/contrib/");
                sb.append(str3);
                sb.append("/");
                String sb2 = sb.toString();
                dqwa dqwaVar = C.e;
                if (dqwaVar == null) {
                    dqwaVar = dqwa.g;
                }
                dqvy dqvyVar = dqwaVar.c;
                if (dqvyVar == null) {
                    dqvyVar = dqvy.h;
                }
                int i4 = dqvyVar.d;
                bwft bwftVar = cewcVar.c;
                boolean z2 = true;
                if (cewcVar.p == null) {
                    string = cewcVar.a.getString(R.string.CONTRIBUTIONS_SHARE_TITLE_CURRENT_USER);
                } else {
                    gga ggaVar = cewcVar.a;
                    Object[] objArr = new Object[1];
                    dqkn dqknVar3 = C.b;
                    if (dqknVar3 == null) {
                        dqknVar3 = dqkn.e;
                    }
                    objArr[0] = dqknVar3.b;
                    string = ggaVar.getString(R.string.CONTRIBUTIONS_SHARE_TITLE_OTHER_USER, objArr);
                }
                if (i4 <= 0) {
                    z2 = false;
                }
                bwftVar.e(string, sb2, z2, i4, str3, dtxl.fH);
            }
        });
        e.c(a18.c());
        e.l = this.a.getString(R.string.PROFILE_OVERALL_OVERFLOW_BUTTON_DESCRIPTION);
        if (this.p == null && j().booleanValue()) {
            jhm a19 = jhm.a();
            a19.a = this.a.getString(R.string.PROFILE_SETTINGS_BUTTON_TITLE);
            a19.f = cjtd.a(dtxl.fG);
            a19.d(new View.OnClickListener(this) { // from class: cevr
                private final cewc a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bszv.ba(this.a.a, btki.aU(3));
                }
            });
            e.c(a19.c());
        }
        final btlu j = this.u.j();
        String str3 = this.p;
        if (str3 != null && (j == null || !str3.equals(j.j()))) {
            jhm a20 = jhm.a();
            a20.a = this.a.getString(R.string.PROFILE_REPORT_HINT_SHORT_CHAR_LIMIT);
            a20.d(new View.OnClickListener(this) { // from class: cevs
                private final cewc a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cewc cewcVar = this.a;
                    cfli cfliVar = cewcVar.j;
                    String str4 = cewcVar.p;
                    dbsk.s(str4);
                    cplz cplzVar = cfliVar.c;
                    cplzVar.a = "MAPS_PROFILE";
                    cplzVar.b = Locale.getDefault().getLanguage();
                    cplzVar.b(str4);
                    String o = cfliVar.b.a().o();
                    if (o != null) {
                        cfliVar.c.c(o);
                    }
                    gga ggaVar = cfliVar.a;
                    cfliVar.d.a().f(ggaVar, cfliVar.c.a(ggaVar), 1);
                }
            });
            e.c(a20.c());
            if (this.d.e() && btlu.i(j) == btlt.GOOGLE) {
                final String string = this.a.getString(R.string.PEOPLE_FOLLOW_BLOCKING_DIALOG_TEXT);
                String string2 = this.a.getString(R.string.BLOCK_USER_ACTION);
                jhm a21 = jhm.a();
                a21.a = string2;
                a21.b = string2;
                a21.d(new View.OnClickListener(this, j, str2, string) { // from class: cevt
                    private final cewc a;
                    private final btlu b;
                    private final String c;
                    private final String d;

                    {
                        this.a = this;
                        this.b = j;
                        this.c = str2;
                        this.d = string;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        cewc cewcVar = this.a;
                        btlu btluVar = this.b;
                        String str4 = this.c;
                        String str5 = this.d;
                        bvnt bvntVar = cewcVar.f;
                        dbsk.s(btluVar);
                        String str6 = cewcVar.p;
                        dbsk.s(str6);
                        bvntVar.e(btluVar, str6, str4, str5, dtxy.l, new cevy(cewcVar.i, cewcVar.k, cewcVar.p));
                    }
                });
                a21.f = cjtd.a(dtxl.fh);
                e.c(a21.c());
            }
        }
        this.o = e.b();
        cqkx.p(this);
    }

    public void t() {
        this.t = dfqe.UNDEFINED_STATE;
        this.g.A();
    }

    public void u() {
        this.r = false;
        this.q = true;
        this.B = null;
        this.o = z(this.a);
        this.i.i();
        cqkx.p(this);
    }

    public void v() {
        this.q = false;
        this.r = true;
        this.B = null;
        this.o = z(this.a);
        cqkx.p(this);
    }

    public void w(String str) {
        this.p = str;
        this.g.v(str);
        u();
    }

    public void x() {
        cetc a;
        cetu cetuVar = (cetu) this.g.u();
        if (cetuVar != null) {
            axfk h = cetuVar.a.a.h();
            dbsk.s(h);
            boolean z = false;
            if (h.a().c(0).intValue() > 0) {
                z = true;
            }
            if (!Boolean.valueOf(z).booleanValue() || (a = cetuVar.a()) == null) {
                return;
            }
            cexr cexrVar = this.x;
            String string = this.a.getString(R.string.PROFILE_FOLLOWER_TOOLTIP_TEXT);
            Activity activity = (Activity) ((dxjd) cexrVar.a).a;
            cexr.a(activity, 1);
            cexr.a(cexrVar.b.a(), 2);
            cexr.a(cexrVar.c.a(), 3);
            cexr.a(a, 4);
            cexr.a(string, 6);
            this.B = new cexq(activity, a, string);
            cqkx.p(this);
        }
    }

    @dzsi
    final <T extends cesi> T y(Class<T> cls) {
        for (cesi cesiVar : this.w) {
            if (cls.isInstance(cesiVar)) {
                return cls.cast(cesiVar);
            }
        }
        return null;
    }
}
