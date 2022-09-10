package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chls  reason: default package */
/* loaded from: classes4.dex */
public class chls implements chmz {
    private final Boolean A;
    private final List<chmx> B;
    private final String C;
    private final dxio<afha> D;
    @dzsi
    private final jbc E;
    @dzsi
    private dcdc<chmt> F;
    @dzsi
    private cqqw G;
    @dzsi
    private cqfc H;
    @dzsi
    private jic I;
    @dzsi
    private cjtd J;
    @dzsi
    private cjtd K;
    @dzsi
    private Toast L;
    private final int O;
    public final chlr a;
    public final Resources b;
    public Integer c;
    public Integer d;
    @dzsi
    public chja e;
    @dzsi
    public djgc f;
    @dzsi
    public String g;
    @dzsi
    public String h;
    @dzsi
    public String i;
    @dzsi
    public dqdk j;
    public boolean k;
    private final Boolean n;
    private final List<chmx> o;
    private final List<chml> p;
    private final List<chmw> q;
    private final chlq r;
    private final Boolean s;
    private final String t;
    private final String u;
    private final ddho v;
    private final btvo w;
    private final Activity x;
    private final dzsj<buzm> y;
    private final Executor z;
    private boolean M = false;
    private boolean N = false;
    public final btzi<duvu, duvx> l = new chlp(this);

    /* JADX WARN: Removed duplicated region for block: B:55:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public chls(defpackage.djgl r23, defpackage.chlr r24, defpackage.ddho r25, defpackage.ddho r26, @defpackage.dzsi defpackage.ilo r27, defpackage.btvo r28, android.app.Activity r29, android.content.res.Resources r30, defpackage.chjb r31, defpackage.cafi r32, defpackage.chla r33, defpackage.chkd r34, defpackage.dzsj<defpackage.bqji> r35, defpackage.cjqy r36, defpackage.dzsj<defpackage.buzm> r37, java.util.concurrent.Executor r38, defpackage.cqre r39, defpackage.cqhn r40, defpackage.cqhu r41, defpackage.dxio<defpackage.afha> r42) {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chls.<init>(djgl, chlr, ddho, ddho, ilo, btvo, android.app.Activity, android.content.res.Resources, chjb, cafi, chla, chkd, dzsj, cjqy, dzsj, java.util.concurrent.Executor, cqre, cqhn, cqhu, dxio):void");
    }

    private final int T() {
        int i = this.O;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                return 2131231788;
            }
            if (i2 == 2) {
                return 2131231569;
            }
            return i2 != 5 ? 2131231318 : 2131231399;
        }
        throw null;
    }

    private final boolean U() {
        return this.q.size() > 2;
    }

    private static void V(List<djvd> list, List<chmx> list2) {
        djvc djvcVar = djvc.UNKNOWN_TYPE;
        for (djvd djvdVar : list) {
            String str = djvdVar.c;
            djvc b = djvc.b(djvdVar.b);
            if (b == null) {
                b = djvc.UNKNOWN_TYPE;
            }
            list2.add(new chlb(str, b, djvcVar));
            djvcVar = djvc.b(djvdVar.b);
            if (djvcVar == null) {
                djvcVar = djvc.UNKNOWN_TYPE;
            }
        }
    }

    private static void W(List<djev> list, ddho ddhoVar, @dzsi ilo iloVar, chla chlaVar, chlr chlrVar, ddho ddhoVar2, String str, List<chmw> list2) {
        for (djev djevVar : list) {
            list2.add(chlaVar.a(chlrVar, djevVar, ddhoVar2, ddhoVar, str, iloVar));
        }
    }

    @Override // defpackage.chmz
    public Boolean A() {
        boolean z = false;
        if (!p().booleanValue() && this.A.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.chmz
    @dzsi
    public String B() {
        djgc djgcVar = this.f;
        if (djgcVar == null) {
            return null;
        }
        return djgcVar.b;
    }

    @Override // defpackage.chmz
    @dzsi
    public String C() {
        djgc djgcVar = this.f;
        if (djgcVar == null) {
            return null;
        }
        return djgcVar.c;
    }

    @Override // defpackage.chmz
    @dzsi
    public jic D() {
        return this.I;
    }

    @Override // defpackage.chmz
    @dzsi
    public cjtd E() {
        return this.J;
    }

    @Override // defpackage.chmz
    @dzsi
    public String F() {
        return this.g;
    }

    @Override // defpackage.chmz
    public Boolean G() {
        return Boolean.valueOf(this.k);
    }

    @Override // defpackage.chmz
    public cqkl H() {
        djgc djgcVar = this.f;
        if (djgcVar == null || this.N || !this.k) {
            return cqkl.a;
        }
        this.N = true;
        cqkx.p(this);
        duvt bZ = duvu.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duvu duvuVar = (duvu) bZ.b;
        duvuVar.b = 5;
        duvuVar.a = 1 | duvuVar.a;
        int b = this.v.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duvu duvuVar2 = (duvu) bZ.b;
        duvuVar2.a |= 8;
        duvuVar2.d = b;
        djdq djdqVar = djgcVar.e;
        if (djdqVar == null) {
            djdqVar = djdq.b;
        }
        String str = djdqVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duvu duvuVar3 = (duvu) bZ.b;
        str.getClass();
        duvuVar3.a |= 32;
        duvuVar3.f = str;
        this.y.a().b(bZ.bK(), this.l, this.z);
        return cqkl.a;
    }

    @Override // defpackage.chmz
    @dzsi
    public String I() {
        return this.h;
    }

    @Override // defpackage.chmz
    @dzsi
    public String J() {
        return this.i;
    }

    @Override // defpackage.chmz
    public cqkl K() {
        String str = this.i;
        if (str != null) {
            P(str);
            cqkx.p(this);
        }
        return cqkl.a;
    }

    @Override // defpackage.chmz
    public Boolean L() {
        return Boolean.valueOf(this.M);
    }

    @Override // defpackage.chmz
    public Boolean M() {
        return Boolean.valueOf(this.j != null);
    }

    @Override // defpackage.chmz
    public cqkl N() {
        if (this.j != null) {
            dqdk dqdkVar = this.j;
            dbsk.s(dqdkVar);
            this.D.a().D(dqdkVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.chmz
    @dzsi
    public cjtd O() {
        return this.K;
    }

    public final void P(String str) {
        try {
            ((ClipboardManager) this.x.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(this.b.getString(R.string.LG_PERK_CLAIM_CODE), str));
            this.M = true;
            Q(R.string.LG_PERK_CODE_COPIED_TOAST);
        } catch (RuntimeException unused) {
        }
    }

    public final void Q(int i) {
        if (this.x.isFinishing()) {
            return;
        }
        Toast toast = this.L;
        if (toast != null) {
            toast.cancel();
        }
        Toast makeText = Toast.makeText(this.x, i, 0);
        this.L = makeText;
        makeText.show();
    }

    @Override // defpackage.chmz
    public cqkl a() {
        this.a.q(true);
        return cqkl.a;
    }

    @Override // defpackage.chmz
    public cjtd b() {
        cjta b = cjtd.b();
        b.g(this.t);
        b.b = this.u;
        b.d = this.v;
        return b.a();
    }

    @Override // defpackage.chmz
    public cjtd c() {
        return cjtd.a(A().booleanValue() ? dtyc.V : dtyc.g);
    }

    @Override // defpackage.chmz
    public List<chmx> d() {
        return this.o;
    }

    @Override // defpackage.chmz
    public jic e() {
        return new jic(null, ckqc.FULLY_QUALIFIED, T());
    }

    @Override // defpackage.chmz
    public jic f() {
        return new jic(null, ckqc.FULLY_QUALIFIED, this.O == 6 ? 2131231397 : T());
    }

    @Override // defpackage.chmz
    public List<chmw> g() {
        if (U()) {
            List<chmw> list = this.q;
            return list.subList(0, list.size() - 1);
        }
        return this.q;
    }

    @Override // defpackage.chmz
    @dzsi
    public chmw h() {
        if (U()) {
            List<chmw> list = this.q;
            return list.get(list.size() - 1);
        }
        return null;
    }

    @Override // defpackage.chmz
    public Boolean i() {
        boolean z = false;
        if (this.n.booleanValue() && !p().booleanValue() && !A().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.chmz
    public List<chml> j() {
        return this.p;
    }

    @Override // defpackage.chmz
    public CharSequence k() {
        if (this.d.intValue() == 1) {
            return this.r.b;
        }
        return this.r.a;
    }

    @Override // defpackage.chmz
    public String l() {
        return this.d.intValue() == 1 ? this.r.c : "";
    }

    @Override // defpackage.chmz
    public Boolean m() {
        return Boolean.valueOf(this.O != 6);
    }

    @Override // defpackage.chmz
    public Boolean n() {
        return this.s;
    }

    @Override // defpackage.chmz
    public String o() {
        return this.w.getUgcContributionStatsParameters().a;
    }

    @Override // defpackage.chmz
    public Boolean p() {
        return Boolean.valueOf(this.e != null);
    }

    @Override // defpackage.chmz
    @dzsi
    public chmz q() {
        return this.e;
    }

    @Override // defpackage.chmz
    @dzsi
    public jbc r() {
        return this.E;
    }

    @Override // defpackage.chmz
    public Integer s() {
        return this.d;
    }

    @Override // defpackage.chmz
    public cqkl t() {
        if (!A().booleanValue() || this.d.intValue() != 1) {
            return cqkl.a;
        }
        this.d = 2;
        this.c = 1;
        cqkx.p(this);
        for (View view : cqkx.n(this)) {
            View a = cqhu.a(view, m);
            if (a instanceof RecyclerView) {
                ((RecyclerView) a).n(1);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.chmz
    public String u() {
        return this.C;
    }

    @Override // defpackage.chmz
    public List<chmt> v() {
        dcdc<chmt> g;
        if (this.F == null) {
            if (!this.A.booleanValue()) {
                g = dcdc.e();
            } else {
                g = dcdc.g(new chlk(this), new chll(this));
            }
            this.F = g;
        }
        dcdc<chmt> dcdcVar = this.F;
        dbsk.s(dcdcVar);
        return dcdcVar;
    }

    @Override // defpackage.chmz
    public Integer w() {
        return this.c;
    }

    @Override // defpackage.chmz
    @dzsi
    public cqqw x() {
        if (this.G == null && A().booleanValue()) {
            this.G = new chlj(this);
        }
        return this.G;
    }

    @Override // defpackage.chmz
    @dzsi
    public cqfc y() {
        if (this.H == null && A().booleanValue()) {
            this.H = new cqfc(this) { // from class: chli
                private final chls a;

                {
                    this.a = this;
                }

                @Override // defpackage.cqfc
                public final void a(View view, boolean z) {
                    chls chlsVar = this.a;
                    if (view instanceof RecyclerView) {
                        ((RecyclerView) view).l(chlsVar.c.intValue());
                    }
                    if (chlsVar.d.intValue() == 1) {
                        view.setTranslationX((true != bvox.a(view) ? 1.0f : -1.0f) * cqsz.c().a(view.getContext()));
                        view.animate().setStartDelay(500L).setDuration(500L).translationX(0.0f).start();
                    }
                }
            };
        }
        return this.H;
    }

    @Override // defpackage.chmz
    public List<chmx> z() {
        return this.B;
    }
}
