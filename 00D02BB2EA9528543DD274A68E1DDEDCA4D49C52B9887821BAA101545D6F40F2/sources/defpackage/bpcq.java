package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bpcq  reason: default package */
/* loaded from: classes3.dex */
public class bpcq implements bpvt {
    public static final dcqe a = dcqe.c("bpcq");
    private final bond A;
    private final bond B;
    private final bpcc C;
    private final boxs D;
    private final dkyr E;
    private final bowv F;
    private final dzsj<boxa> G;
    private final bpsw H;
    private final akpm I;
    private final Executor J;
    private final eeu K;
    private bpcp L;
    private final bptn M;
    private bonv N;
    private final bpcn O;
    private final bomp P;
    private final bpvm Q;
    bpbz b;
    public final bopt c;
    public final bopt d;
    public final bopt e;
    public final bpbw f;
    public final Activity g;
    public final bnyc h;
    public boolean i;
    public final bomp j = new bomp(new bpcg(this));
    public final bomp k;
    private final bopt t;
    private final bopt u;
    private final bonh v;
    private final boqc w;
    private final bope x;
    private final bonr y;
    private final bosr z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04fe  */
    /* JADX WARN: Type inference failed for: r0v43, types: [bopt] */
    /* JADX WARN: Type inference failed for: r0v46, types: [bopt] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v13, types: [bond] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boqc] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6, types: [bopt] */
    /* JADX WARN: Type inference failed for: r54v0, types: [bpto] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bpcq(defpackage.bpbw r39, defpackage.bowv r40, defpackage.bwrs<defpackage.ilo> r41, defpackage.bomt r42, java.lang.String r43, java.lang.String r44, defpackage.jmx r45, defpackage.btvo r46, defpackage.cqkj r47, defpackage.bwqv r48, defpackage.bbtk r49, defpackage.bbul r50, defpackage.dzsj<defpackage.boxa> r51, defpackage.dzsj<defpackage.bbut> r52, defpackage.eeu r53, defpackage.bpto r54, defpackage.akfa r55, defpackage.bpsw r56, defpackage.bpca r57, defpackage.boss r58, defpackage.bnxt r59, defpackage.bnxx r60, defpackage.akpm r61, defpackage.bnyd r62, defpackage.bonw r63, java.util.concurrent.Executor r64) {
        /*
            Method dump skipped, instructions count: 1291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpcq.<init>(bpbw, bowv, bwrs, bomt, java.lang.String, java.lang.String, jmx, btvo, cqkj, bwqv, bbtk, bbul, dzsj, dzsj, eeu, bpto, akfa, bpsw, bpca, boss, bnxt, bnxx, akpm, bnyd, bonw, java.util.concurrent.Executor):void");
    }

    public static boolean F(bowv bowvVar) {
        if (bowvVar.k() || !(bowvVar.a.be() == iln.BUSINESS || bowvVar.a.be() == iln.AD)) {
            return false;
        }
        if (!bowvVar.n.d()) {
            return V(bowvVar, dqgh.BUSINESS_HOURS);
        }
        return !Q(bowvVar);
    }

    private static bopt N(boolean z, Activity activity, bokk bokkVar, cqjg cqjgVar, bomt bomtVar) {
        if (!z) {
            return null;
        }
        boolean d = dbsj.d(bokkVar.d());
        int i = true != d ? R.string.RAP_TYPE_CORRECT_NAME_IN_LANGUAGE : R.string.RAP_TYPE_CORRECT_NAME;
        int i2 = true != d ? R.string.AAP_NAME_IN_LANGUAGE_HINT : R.string.AAP_NAME_HINT;
        ddho ddhoVar = dtya.ac;
        String d2 = bokkVar.d();
        return new bopt(activity, bokkVar, activity.getString(R.string.RMI_NAME), activity.getString(i, new Object[]{d2}), activity.getString(i2, new Object[]{d2}), activity.getString(i2, new Object[]{d2}), 8193, 2131231754, ddhoVar, null, true, true, true, bomtVar, cqjgVar, false, null, false, 3);
    }

    private final void O() {
        this.M.a(this.H.c(this.F, cjqm.a), this.F.l());
    }

    private static boolean P(boqs boqsVar) {
        return boqsVar != null && boqsVar.n().booleanValue() && boqsVar.w().booleanValue();
    }

    private static boolean Q(bowv bowvVar) {
        dnqb b = dnqb.b(bowvVar.i().b);
        if (b == null) {
            b = dnqb.UNKNOWN_ENTRY_POINT;
        }
        return b == dnqb.ADD_INFO_LINK;
    }

    private static boolean R(bokk bokkVar, bokk bokkVar2) {
        return bokkVar.g.equals(bokkVar2.g) || bokkVar.d().equals(bokkVar2.d());
    }

    private final boolean S() {
        if (!this.F.k() && this.F.q.a.booleanValue()) {
            if (this.F.q.b() == null) {
                return V(this.F, dqgh.CATEGORY);
            }
            return !Q(this.F);
        }
        return false;
    }

    private final boolean T() {
        return F(this.F);
    }

    private final boolean U() {
        dkyr dkyrVar = this.E;
        dbsk.s(dkyrVar);
        return dkyrVar.s() && T();
    }

    private static boolean V(bowv bowvVar, dqgh dqghVar) {
        if (!bowvVar.A.contains(dqghVar)) {
            dobr cy = bowvVar.a.cy();
            if (cy == null) {
                return false;
            }
            for (dobf dobfVar : cy.a) {
                dqgh b = dqgh.b(dobfVar.b);
                if (b == null) {
                    b = dqgh.UNDEFINED;
                    continue;
                }
                if (b == dqghVar) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    private static final cqkl W(cqjg cqjgVar, View view) {
        View a2 = cqhu.a(view, cqjgVar);
        Context context = view.getContext();
        if (a2 == null) {
            bvoo.h("focusOnTextField() couldn't find corresponding view for token %s", cqjgVar);
            return cqkl.a;
        }
        a2.post(new bpcm(a2, context));
        return cqkl.a;
    }

    @Override // defpackage.bpvt
    public Boolean A() {
        return Boolean.valueOf(!Q(this.F));
    }

    @Override // defpackage.bpvt
    public Boolean B() {
        return Boolean.valueOf(!this.F.f());
    }

    @Override // defpackage.bpvt
    public cqkl C() {
        dnps bZ = dnqe.i.bZ();
        dnqb dnqbVar = dnqb.REPORT_SOMETHING_ELSE;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        dnqe dnqeVar2 = (dnqe) bZ.b;
        dnqeVar2.c = 2;
        dnqeVar2.a = 2 | dnqeVar2.a;
        this.G.a().I(null, bZ.bK());
        return cqkl.a;
    }

    @Override // defpackage.bpvt
    public cjtd D() {
        return cjtd.a(dtya.cZ);
    }

    public cqkl E(bomu bomuVar, boolean z, View view) {
        bomu bomuVar2 = bomu.ADDRESS;
        dqgh dqghVar = dqgh.UNDEFINED;
        int ordinal = bomuVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    boqc boqcVar = this.w;
                    if (boqcVar == null) {
                        bvoo.h("Tried to focus on category field but categoryViewModel was null (showCategoryField() = %s)", Boolean.valueOf(S()));
                        return cqkl.a;
                    }
                    return boqcVar.a();
                } else if (ordinal == 5) {
                    return W(bpvt.p, view);
                } else {
                    if (ordinal == 7) {
                        return W(bpvt.o, view);
                    }
                    bvoo.h("focusOnField() expected a FocusableField but got %s", bomuVar);
                    return cqkl.a;
                }
            } else if (this.y == null) {
                bvoo.h("Tried to focus on business hours field but businessHoursViewModel was null (showBusinessHoursField() = %s)", Boolean.valueOf(T()));
                return cqkl.a;
            } else if (this.F.n.d() || U()) {
                cqjg cqjgVar = bpvt.q;
                View a2 = cqhu.a(view, cqjgVar);
                ScrollView scrollView = (ScrollView) cqkx.e(view, bpvt.r, ScrollView.class);
                if (a2 == null || scrollView == null) {
                    bvoo.h("scrollToField() couldn't find corresponding view for token %s", cqjgVar);
                    return cqkl.a;
                }
                View view2 = a2;
                int i = 0;
                while (true) {
                    i += view2.getTop();
                    view2 = (View) view2.getParent();
                    if (view2 != null) {
                        if (view2 == scrollView) {
                            break;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i != -1) {
                    scrollView.scrollTo(0, i);
                }
                a2.requestFocus();
                return cqkl.a;
            } else {
                return this.y.n();
            }
        }
        return W(bopw.f, view);
    }

    public void G() {
        bonr bonrVar = this.y;
        if (bonrVar != null) {
            bonrVar.p();
        }
    }

    public void H(List<bbtm> list) {
        bond bondVar = this.A;
        if (bondVar != null) {
            bondVar.q(list);
        }
    }

    public void I(List<bbtm> list) {
        bosr bosrVar = this.z;
        if (bosrVar != null) {
            bosrVar.g(list);
        }
    }

    @Override // defpackage.bpvt
    public bopv J() {
        return this.A;
    }

    public boolean K() {
        AlertDialog alertDialog;
        bonv bonvVar = this.N;
        if (bonvVar == null || (alertDialog = bonvVar.g) == null || !alertDialog.isShowing()) {
            return false;
        }
        this.N.a();
        return true;
    }

    public final void a() {
        bpcp bpcpVar = this.L;
        boolean z = false;
        if (u(false) && t()) {
            z = true;
        }
        bpcpVar.d(z);
    }

    public boolean b() {
        return this.h.a(u(true));
    }

    public void c() {
        this.b.a();
        this.j.b();
        this.k.b();
        this.P.b();
    }

    public void d() {
        dehn<Boolean> a2;
        bonr bonrVar;
        byee a3;
        bonv bonvVar;
        if (!this.f.aD) {
            return;
        }
        this.i = false;
        jcd jcdVar = null;
        if (this.C.e().booleanValue() || this.F.n() || (bonvVar = this.N) == null || bonvVar.h || !bonvVar.i || bonvVar.d.j().booleanValue()) {
            if (!t()) {
                return;
            }
            if (u(false)) {
                if (T() && (bonrVar = this.y) != null && bonrVar.f().booleanValue()) {
                    bowv bowvVar = this.F;
                    if (this.y.u().booleanValue()) {
                        a3 = bonk.d(this.y.h(), this.F.a.aT());
                    } else {
                        a3 = bonk.a(this.y.g(), this.F.a.aT());
                    }
                    bowvVar.x = a3;
                }
                bonh bonhVar = this.v;
                if (bonhVar == null || !bonhVar.n().booleanValue() || !this.v.C()) {
                    O();
                    return;
                }
                bope bopeVar = this.x;
                akqq g = bopeVar != null ? bopeVar.g() : null;
                Iterable<View> n = cqkx.n(this);
                if (!this.K.b() || !n.iterator().hasNext()) {
                    a2 = deha.a(false);
                } else {
                    Iterator<View> it = n.iterator();
                    while (it.hasNext() && (jcdVar = (jcd) cqkx.e(it.next(), bopw.f, jcd.class)) == null) {
                    }
                    if (jcdVar == null) {
                        bvoo.h("Attempted to verify address with no address widget present!", new Object[0]);
                        a2 = deha.b(new RuntimeException("Attempted to verify address with no address widget present!"));
                    } else {
                        cpmk cpmkVar = jcdVar.b;
                        if (g != null) {
                            cpmkVar.e(g.n());
                        }
                        bowv bowvVar2 = this.F;
                        if (bowvVar2 != null) {
                            bowvVar2.e.c = cpmkVar.a.toString();
                        }
                        a2 = cpmkVar.b();
                    }
                }
                this.M.b();
                deha.q(a2, new bpcl(this), this.J);
                return;
            }
            bpcc bpccVar = this.C;
            if (bpccVar != null) {
                if (bpccVar.b().booleanValue()) {
                    jmw.g(this.g, R.string.REPORT_A_PROBLEM, R.string.REPORT_A_PROBLEM_NO_REASON_FOR_PLACE_OPEN);
                    return;
                } else if (this.C.e().booleanValue()) {
                    jmw.g(this.g, R.string.REPORT_A_PROBLEM, R.string.REPORT_A_PROBLEM_NO_REASON_FOR_PLACE_CLOSED);
                    return;
                }
            }
            jmw.g(this.g, R.string.REPORT_A_PROBLEM, R.string.REPORT_A_PROBLEM_NO_INFORMATION_SELECTED);
            return;
        }
        cqkj cqkjVar = bonvVar.b;
        boqr boqrVar = bonvVar.c;
        cqkf<boqr> c = cqkjVar.c(new bofz(), null);
        c.e(boqrVar);
        bonvVar.f = c;
        bonvVar.g = new AlertDialog.Builder(bonvVar.a).setView(bonvVar.f.c()).setPositiveButton(R.string.PROMPT_MARKER_MOVE_DIALOG_LOOKS_OK, new bonu(bonvVar)).setNegativeButton(R.string.PROMPT_MARKER_MOVE_DIALOG_EDIT, new bonu(bonvVar)).create();
        bonvVar.g.show();
        bonvVar.a();
        bonvVar.h = true;
        this.i = true;
    }

    public final void e(boolean z) {
        if (!z) {
            this.M.c();
        } else {
            O();
        }
    }

    @Override // defpackage.bpvt
    public boqs f() {
        return this.c;
    }

    @Override // defpackage.bpvt
    public boqs g() {
        return this.t;
    }

    @Override // defpackage.bpvt
    public boqs h() {
        return this.u;
    }

    @Override // defpackage.bpvt
    public bopw i() {
        return this.v;
    }

    public bnxs j() {
        bonh bonhVar = this.v;
        if (bonhVar == null) {
            return null;
        }
        return bonhVar.K();
    }

    @Override // defpackage.bpvt
    public boqs k() {
        return this.d;
    }

    @Override // defpackage.bpvt
    public boqs l() {
        return this.e;
    }

    @Override // defpackage.bpvt
    public boqa m() {
        return this.y;
    }

    @Override // defpackage.bpvt
    /* renamed from: n */
    public bosr M() {
        return this.z;
    }

    @Override // defpackage.bpvt
    public boqc o() {
        return this.w;
    }

    @Override // defpackage.bpvt
    public bpvr p() {
        return this.C;
    }

    @Override // defpackage.bpvt
    public bpvq q() {
        return this.b;
    }

    @Override // defpackage.bpvt
    public CharSequence r() {
        return this.G.a().P();
    }

    @Override // defpackage.bpvt
    /* renamed from: s */
    public ivn L() {
        return this.L;
    }

    final boolean t() {
        if (this.D.d()) {
            return true;
        }
        bopt boptVar = this.c;
        if (boptVar != null && boptVar.n().booleanValue() && !this.c.l().booleanValue()) {
            return false;
        }
        bonh bonhVar = this.v;
        if (bonhVar != null) {
            boolean z = bonhVar.n().booleanValue() || this.F.h();
            boolean z2 = bonhVar.l().booleanValue() && bonhVar.H().booleanValue();
            if (z && !z2) {
                return false;
            }
        }
        return this.x == null || !bpuo.b(this.F.a) || this.x.j().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean u(boolean z) {
        bonh bonhVar;
        bope bopeVar;
        boqc boqcVar;
        bond bondVar;
        bond bondVar2;
        bonr bonrVar;
        bond bondVar3;
        if (!x().booleanValue() || !this.C.f().booleanValue() || !this.C.e().booleanValue()) {
            return (T() && (bonrVar = this.y) != null && (bonrVar.f().booleanValue() || this.y.d().booleanValue())) || P(this.c) || P(this.t) || P(this.u) || ((bonhVar = this.v) != null && bonhVar.n().booleanValue() && this.v.H().booleanValue()) || (((bopeVar = this.x) != null && bopeVar.h().booleanValue()) || P(this.d) || P(this.e) || this.C.e().booleanValue() || (((boqcVar = this.w) != null && boqcVar.n().booleanValue() && boqcVar.l().booleanValue()) || ((z && (bondVar2 = this.A) != null && bondVar2.n().booleanValue()) || (((bondVar = this.B) != null && bondVar.n().booleanValue()) || this.D.d()))));
        } else if (this.C.b().booleanValue()) {
            return true;
        } else {
            return (this.b.b().booleanValue() || (z && (bondVar3 = this.A) != null && bondVar3.n().booleanValue())) && !this.b.c().booleanValue();
        }
    }

    public void v(akqq akqqVar) {
        bope bopeVar = this.x;
        if (bopeVar != null) {
            bopeVar.f(akqqVar, true, dory.USER_PROVIDED);
            bonh bonhVar = this.v;
            if (bonhVar == null) {
                return;
            }
            bonhVar.I(this.x.p(this.I), alao.a(this.I));
        }
    }

    @Override // defpackage.bpvt
    public boqn w() {
        return this.x;
    }

    @Override // defpackage.bpvt
    public Boolean x() {
        boolean z = false;
        if (p().c().booleanValue() && !Q(this.F)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bpvt
    public Boolean y() {
        boolean z = false;
        if (!x().booleanValue() || (!this.C.b().booleanValue() && !this.C.e().booleanValue())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bpvt
    public Boolean z() {
        boolean z = false;
        if (x().booleanValue() && !this.C.b().booleanValue() && this.C.e().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
