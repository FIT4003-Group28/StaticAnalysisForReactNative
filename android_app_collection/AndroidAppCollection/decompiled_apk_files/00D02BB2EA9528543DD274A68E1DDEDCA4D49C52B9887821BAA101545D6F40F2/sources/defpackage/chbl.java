package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: chbl  reason: default package */
/* loaded from: classes4.dex */
public class chbl implements cgwi, chak, chaq, cgse, cgtu {
    private static final String f = "chbl";
    private cgsh A;
    public final chbg a;
    public final cgtw b;
    public final cjqy c;
    public boolean d;
    public boolean e;
    private final dcdc<cgwg> g;
    private final List<cgwg> h;
    private final List<cgwg> i;
    private final List<cgsk> j;
    private final cgrr k;
    private final cgrp l;
    private final cgrn m;
    private final cgrl n;
    private final gga o;
    private final ges p;
    private final cgsi q;
    private final bvjj r;
    private final cztz s;
    private final dwql t;
    private final cjqq u;
    private final dwqe v;
    private final cgwh w;
    private final boolean x;
    private boolean y;
    @dzsi
    private cgwz z = null;

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0183, code lost:
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public chbl(defpackage.cgsi r23, defpackage.cham r24, defpackage.cgwr r25, defpackage.gga r26, defpackage.cztz r27, defpackage.bvjj r28, defpackage.cjqy r29, defpackage.cjqq r30, defpackage.btvo r31, java.util.List<defpackage.cgsk> r32, defpackage.chbg r33, defpackage.cgrr r34, defpackage.cgrp r35, defpackage.cgrn r36, defpackage.cgrl r37, defpackage.cgtw r38, defpackage.ges r39, java.util.List<defpackage.dwrg> r40, defpackage.dwql r41, defpackage.cgwh r42) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chbl.<init>(cgsi, cham, cgwr, gga, cztz, bvjj, cjqy, cjqq, btvo, java.util.List, chbg, cgrr, cgrp, cgrn, cgrl, cgtw, ges, java.util.List, dwql, cgwh):void");
    }

    private final boolean U() {
        dcdc<cgwg> dcdcVar = this.g;
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (!dcdcVar.get(i).O().booleanValue()) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    private final void V() {
        chbl chblVar;
        if (this.A == null) {
            cgsi cgsiVar = this.q;
            bwrs<ilo> r = this.w.r();
            cgrr cgrrVar = this.k;
            cgrp cgrpVar = this.l;
            cgrn cgrnVar = this.m;
            cgrl cgrlVar = this.n;
            ges gesVar = this.p;
            boolean booleanValue = t().booleanValue();
            Activity activity = (Activity) ((dxjd) cgsiVar.a).a;
            cgsi.a(activity, 1);
            bvrb a = cgsiVar.b.a();
            cgsi.a(a, 2);
            akfa a2 = cgsiVar.c.a();
            cgsi.a(a2, 3);
            cgen a3 = cgsiVar.d.a();
            cgsi.a(a3, 4);
            bbul a4 = cgsiVar.e.a();
            cgsi.a(a4, 5);
            bbtk a5 = cgsiVar.f.a();
            cgsi.a(a5, 6);
            bqji a6 = cgsiVar.g.a();
            cgsi.a(a6, 7);
            buke a7 = cgsiVar.h.a();
            cgsi.a(a7, 8);
            cjqy a8 = cgsiVar.i.a();
            cgsi.a(a8, 9);
            cjqq a9 = cgsiVar.j.a();
            cgsi.a(a9, 10);
            cgsi.a(r, 11);
            cgsi.a(cgrrVar, 12);
            cgsi.a(cgrpVar, 13);
            cgsi.a(cgrnVar, 14);
            cgsi.a(cgrlVar, 15);
            cgsi.a(gesVar, 16);
            cgsi.a(this, 17);
            chblVar = this;
            chblVar.A = new cgsh(activity, a, a2, a3, a4, a5, a6, a7, a8, a9, r, cgrrVar, cgrpVar, cgrnVar, cgrlVar, gesVar, this, booleanValue);
        } else {
            chblVar = this;
        }
        cgsh cgshVar = chblVar.A;
        cgsg cgsgVar = cgshVar.j;
        for (dwpc dwpcVar : cgsgVar.a.keySet()) {
            if (cgsgVar.e(dwpcVar).c()) {
                cgsgVar.d(dwpcVar);
            }
        }
        if (cgshVar.k.c()) {
            cgshVar.g.clear();
            cgshVar.f.clear();
            cgshVar.k = cgsf.NOT_TRACKED;
        }
        if (cgshVar.l.c()) {
            cgshVar.i.clear();
            cgshVar.h.clear();
            cgshVar.l = cgsf.NOT_TRACKED;
        }
        chblVar.A.e = cjqg.b(chblVar.c);
    }

    private final void W(chbj chbjVar, int i) {
        if (this.y) {
            chbjVar.b();
            return;
        }
        String string = this.o.getString(i);
        cztq a = cztt.a(this.s);
        a.d(cztr.MEDIUM);
        a.c = string;
        a.g = new chbe(f, chbjVar);
        a.f(this.o.getString(R.string.UNDO), new chbd(this, chbjVar));
        cztt b = a.b();
        View view = b.c;
        if (view != null) {
            view.setMinimumHeight(cqrp.d(60.0d).e(this.o));
        }
        b.b();
        this.u.g().d(chbjVar.d());
    }

    private static void X(dccx<cgwg> dccxVar, List<cgwg> list) {
        for (cgwg cgwgVar : list) {
            if (cgwgVar.G()) {
                dccxVar.g(cgwgVar);
            }
        }
    }

    @Override // defpackage.cgwi
    public bwrs<ilo> A() {
        return this.w.r();
    }

    @Override // defpackage.cgwi
    public String B() {
        akqi ai = z().ai();
        return ai.equals(akqi.a) ? "" : ai.o();
    }

    @Override // defpackage.cgwi
    public boolean C() {
        return this.e;
    }

    @Override // defpackage.cgwi
    public void D() {
        if (!this.e) {
            return;
        }
        this.b.a(new cgto(cgtv.DELETE_UGC_TASK_PLACE_REMINDER, this.w.p(), new chbf(this)));
        this.w.m(false);
    }

    @Override // defpackage.cgwi
    public void E() {
        dcdc<cgwg> dcdcVar = this.g;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            cgwg cgwgVar = dcdcVar.get(i);
            if (cgwgVar instanceof cgux) {
                ((cgux) cgwgVar).a();
            }
        }
    }

    @Override // defpackage.cgwi
    public void F(boolean z) {
        this.y = z;
    }

    @Override // defpackage.chak
    public void G(cgwg cgwgVar) {
        this.a.I(cgwgVar, this);
        if (cgwgVar.t() == cgwf.EDIT_COMPLETED) {
            if (!this.t.a) {
                Q(dcdc.f(cgwgVar));
            } else {
                W(new chbi(this, cgwgVar), R.string.PLACE_QA_ANSWER_THANK_YOU_TITLE);
            }
            jmw.d(this.o, null);
        }
    }

    @Override // defpackage.chak
    public void H(@dzsi cgwz cgwzVar) {
        this.z = cgwzVar;
    }

    @Override // defpackage.chak
    public void I(cgwg cgwgVar) {
        ges gesVar = this.p;
        fd K = this.o.K();
        boolean z = false;
        if (K != null && gesVar.equals(K)) {
            z = true;
        }
        this.d = z;
        P();
        this.a.J(cgwgVar, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.chak
    public void J(cgwg cgwgVar, String str, boolean z) {
        if (!this.t.a || !z) {
            return;
        }
        cgwgVar.RC(str, cgwf.EDIT_COMPLETED);
        W(new chbh(this, cgwgVar, str), R.string.PLACE_QA_ANSWER_THANK_YOU_TITLE);
    }

    @Override // defpackage.chak
    public <T extends cgwg & cgvq> void K(T t) {
        this.a.I(t, this);
        if (t.t() == cgwf.EDIT_COMPLETED) {
            W(new chbk(this, t), R.string.UGC_TASKS_REPORT_FEEDBACK_TITLE);
        }
    }

    @Override // defpackage.chak
    public void L(cgwg cgwgVar) {
        this.a.I(cgwgVar, this);
        if (cgwgVar.t() == cgwf.EDIT_COMPLETED) {
            if (!this.t.a) {
                Q(dcdc.f(cgwgVar));
            } else {
                W(new chbi(this, cgwgVar), R.string.UGC_TASKS_REPORT_FEEDBACK_TITLE);
            }
        }
    }

    @Override // defpackage.chaq
    public void M() {
        this.a.L(this.w.p());
    }

    @Override // defpackage.chaq
    public void N() {
        this.a.M(this.w.p());
    }

    @Override // defpackage.chaq
    public void O(dwpc dwpcVar, String str) {
        this.a.x(dwpcVar, str);
    }

    public void P() {
        if (!this.x) {
            return;
        }
        Q(dcbg.b(this.g).o(chbb.a).z());
    }

    public void Q(List<cgwg> list) {
        dcdc z = dcbg.b(list).o(chbc.a).z();
        if (z.isEmpty()) {
            return;
        }
        V();
        if (this.A == null) {
            return;
        }
        int size = z.size();
        for (int i = 0; i < size; i++) {
            cgwg cgwgVar = (cgwg) z.get(i);
            cgsh cgshVar = this.A;
            if (cgwgVar instanceof cgvv) {
                cgvv cgvvVar = (cgvv) cgwgVar;
                cgshVar.h.addAll(cgvvVar.b());
                cgshVar.i.add(cgvvVar);
                cgshVar.l = cgsf.QUEUED;
            } else if (cgwgVar instanceof cgvw) {
                ((cgvw) cgwgVar).l(cgshVar.f, cgshVar.g);
                cgshVar.k = cgsf.QUEUED;
            } else if (cgwgVar instanceof cgvp) {
                cgshVar.m = cgwgVar.F();
                cgshVar.j.a(cgwgVar);
            } else if (cgwgVar instanceof cgvr) {
                cgshVar.n = cgwgVar.F();
                cgshVar.j.a(cgwgVar);
            } else if (cgwgVar instanceof cgva) {
                cgshVar.o = cgwgVar.F();
                cgshVar.j.a(cgwgVar);
            } else if (cgwgVar instanceof cgvm) {
                cgshVar.p.add(cgwgVar.F());
                cgshVar.j.a(cgwgVar);
            }
        }
        this.A.d(!this.t.a);
    }

    public void R(cgwg cgwgVar) {
        V();
        cgsh cgshVar = this.A;
        if (cgshVar == null) {
            return;
        }
        cgshVar.b(cgwgVar);
    }

    public void S(cgvv cgvvVar, String str) {
        V();
        cgsh cgshVar = this.A;
        if (cgshVar == null) {
            return;
        }
        cgshVar.a(cgvvVar, str);
    }

    public boolean T() {
        dcdc<cgwg> dcdcVar = this.g;
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (dcdcVar.get(i).G()) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    @Override // defpackage.cgse
    public void a(int i) {
        String quantityString;
        this.a.J(null, this);
        if (this.t.a) {
            return;
        }
        boolean U = U();
        if (U && this.r.m(bvjk.gT, false)) {
            return;
        }
        Resources resources = this.o.getResources();
        if (U) {
            this.r.S(bvjk.gT, true);
            quantityString = resources.getString(R.string.FACTUAL_MODERATION_THANKS_TITLE);
        } else {
            quantityString = resources.getQuantityString(R.plurals.UGC_TASKS_POST_SUBMIT_DIALOG_TITLE, i, Integer.valueOf(i));
        }
        cztq a = cztt.a(this.s);
        a.d(cztr.SHORT);
        a.c = quantityString;
        a.c();
    }

    @Override // defpackage.cgwj
    public void ab(doab doabVar) {
        dcdc<cgwg> dcdcVar = this.g;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).ab(doabVar);
        }
    }

    @Override // defpackage.cgtu
    public void b(dhsm dhsmVar) {
        this.e = true;
    }

    @Override // defpackage.cgtu
    public void c(dhvm dhvmVar) {
        this.e = false;
    }

    @Override // defpackage.cgwi
    public List<cgwg> e() {
        dccx F = dcdc.F();
        X(F, this.h);
        X(F, this.i);
        return F.f();
    }

    @Override // defpackage.cgwi
    public List<cgwg> f() {
        return this.h;
    }

    @Override // defpackage.cgwi, defpackage.chaq
    public Boolean g() {
        boolean z = false;
        if (t().booleanValue() && h(cgwf.EDITABLE).intValue() == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgwi
    public Integer h(final cgwf cgwfVar) {
        return Integer.valueOf(dcbg.b(this.g).o(new dbsl(cgwfVar) { // from class: chaz
            private final cgwf a;

            {
                this.a = cgwfVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((cgwg) obj).t() == this.a;
            }
        }).k());
    }

    @Override // defpackage.cgwi
    public void i(Set<dspd> set) {
        this.h.clear();
        this.i.clear();
        dcdc<cgwg> dcdcVar = this.g;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            cgwg cgwgVar = dcdcVar.get(i);
            if (!cgwgVar.G() || !cgwgVar.x(set).booleanValue()) {
                this.i.add(cgwgVar);
            } else {
                this.h.add(cgwgVar);
            }
        }
        cqkx.p(this);
    }

    @Override // defpackage.cgwi
    public boolean j(Set<dspd> set) {
        if (this.j.isEmpty()) {
            return false;
        }
        if (!set.isEmpty()) {
            return this.j.get(0).d(3, set);
        }
        return true;
    }

    @Override // defpackage.cgwi
    public void k(dwpc dwpcVar) {
        for (cgwg cgwgVar : this.h) {
            if (cgwgVar.F().equals(dwpcVar)) {
                this.z = (cgwz) cgwgVar;
                return;
            }
        }
    }

    @Override // defpackage.cgwi
    @dzsi
    public bxeq l() {
        return this.z;
    }

    @Override // defpackage.cgwi
    public void m() {
        dcdc<cgwg> dcdcVar = this.g;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            cgwg cgwgVar = dcdcVar.get(i);
            if (cgwgVar.t() != cgwf.POSTED && cgwgVar.C().booleanValue()) {
                cgwgVar.B();
            }
        }
        this.a.J(null, this);
    }

    @Override // defpackage.cgwi
    public void n(Object obj) {
        cgww cgwwVar;
        if (obj instanceof bbuf) {
            bbuf bbufVar = (bbuf) obj;
            if (bbufVar.b().startsWith("business_hours_photo")) {
                cgxr cgxrVar = (cgxr) r(cgxr.class);
                if (cgxrVar == null) {
                    return;
                }
                cgxrVar.h(bbufVar.a());
                return;
            }
            cgxz cgxzVar = (cgxz) r(cgxz.class);
            if (cgxzVar == null) {
                return;
            }
            cgxzVar.e(bbufVar);
        } else if (obj instanceof bosj) {
            cgxr cgxrVar2 = (cgxr) r(cgxr.class);
            if (cgxrVar2 == null) {
                return;
            }
            cgxrVar2.i((bosj) obj);
        } else if (!(obj instanceof cgfa) || (cgwwVar = (cgww) r(cgww.class)) == null) {
        } else {
            cgwwVar.ak((cgfa) obj);
        }
    }

    @Override // defpackage.cgwi
    public List<cgwg> o() {
        return dcbg.b(this.g).o(chba.a).z();
    }

    @Override // defpackage.cgwi
    public void p() {
        Q(this.g);
    }

    @Override // defpackage.cgwi
    public void q(ilo iloVar) {
        this.w.r().d(iloVar);
        dcdc<cgwg> dcdcVar = this.g;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).A(iloVar);
        }
    }

    @Override // defpackage.cgwi
    @dzsi
    public <T extends cgwg> T r(Class<T> cls) {
        dcdc<cgwg> dcdcVar = this.g;
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            cgwg cgwgVar = dcdcVar.get(i);
            i++;
            if (cls.isInstance(cgwgVar)) {
                return cls.cast(cgwgVar);
            }
        }
        return null;
    }

    @Override // defpackage.cgwi
    @dzsi
    public cgwg s(dspd dspdVar) {
        dcdc<cgwg> dcdcVar = this.g;
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            cgwg cgwgVar = dcdcVar.get(i);
            i++;
            if (cgwgVar.F().d.equals(dspdVar)) {
                return cgwgVar;
            }
        }
        return null;
    }

    @Override // defpackage.cgwi
    public Boolean t() {
        boolean z = true;
        if (!this.t.a && !U()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgwi
    public Boolean u() {
        boolean z = false;
        if (this.t.a && this.d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgwi
    public dwqe v() {
        return this.v;
    }

    @Override // defpackage.cgwi
    public void w() {
        dcdc<cgwg> dcdcVar = this.g;
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            cgwg cgwgVar = dcdcVar.get(i);
            i++;
            if (cgwgVar.H()) {
                cgwgVar.K();
                return;
            }
        }
    }

    @Override // defpackage.cgwi
    public cgwh x() {
        return this.w;
    }

    @Override // defpackage.cgwi
    public boolean y() {
        dcdc<cgwg> dcdcVar = this.g;
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (dcdcVar.get(i).L()) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    @Override // defpackage.cgwi
    public ilo z() {
        return this.w.q();
    }

    @Override // defpackage.cgtu
    public void d(cgtv cgtvVar, btzy btzyVar) {
        if (btzyVar.p != bttq.HTTP_SERVER_ERROR) {
            ppw.a(btzyVar.p);
        } else {
            this.b.d();
        }
    }
}
