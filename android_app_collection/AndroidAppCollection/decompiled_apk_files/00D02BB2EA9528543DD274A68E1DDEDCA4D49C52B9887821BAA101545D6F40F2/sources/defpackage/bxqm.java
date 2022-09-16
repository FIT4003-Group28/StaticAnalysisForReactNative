package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bxqm  reason: default package */
/* loaded from: classes4.dex */
public class bxqm implements bxoi {
    private static final dcqe a = dcqe.c("bxqm");
    private static final dcdn<ddho, ddhn> b;
    private final cvv A;
    private final btrm B;
    private final dxio<ckcw> C;
    private final bxkt c;
    @dzsi
    private final bxeq d;
    private ivk e;
    private bxko f;
    private bxmh g;
    private int h;
    private boolean l;
    private final gga p;
    private final cjqy q;
    private final cqat r;
    private final dzsj<cqg> s;
    private final dzsj<araj> t;
    private final bvsl u;
    private final dzsj<ahjq> v;
    private final dzsj<axwy> w;
    private final btvo x;
    @dzsi
    private final bxql y;
    private final cyt z;
    @dzsi
    private CharSequence i = null;
    @dzsi
    private cqtd j = null;
    @dzsi
    private cqss k = null;
    @dzsi
    private CharSequence m = null;
    @dzsi
    private bxok n = null;
    @dzsi
    private bxoj o = null;
    private boolean D = false;

    static {
        dcdg p = dcdn.p();
        p.f(dtyb.ev, ddda.fn);
        p.f(dtyb.ew, ddda.fm);
        p.f(dtyb.et, ddda.aA);
        p.f(dtxl.p, ddda.aA);
        p.f(dtyb.eu, ddda.fx);
        b = p.b();
    }

    public bxqm(gga ggaVar, bxkt bxktVar, @dzsi bxeq bxeqVar, ivk ivkVar, bxko bxkoVar, bxmh bxmhVar, int i, @dzsi bxql bxqlVar, cjqy cjqyVar, cqat cqatVar, cqhn cqhnVar, cqhu cqhuVar, bvrb bvrbVar, dzsj<cqg> dzsjVar, dzsj<araj> dzsjVar2, bvsl bvslVar, dzsj<ahjq> dzsjVar3, dzsj<axwy> dzsjVar4, cyt cytVar, cvv cvvVar, btrm btrmVar, dxio<ckcw> dxioVar, btvo btvoVar) {
        this.c = bxktVar;
        this.d = bxeqVar;
        this.p = ggaVar;
        this.q = cjqyVar;
        this.r = cqatVar;
        this.s = dzsjVar;
        this.t = dzsjVar2;
        this.u = bvslVar;
        this.v = dzsjVar3;
        this.w = dzsjVar4;
        this.x = btvoVar;
        this.y = bxqlVar;
        this.z = cytVar;
        this.A = cvvVar;
        this.B = btrmVar;
        this.C = dxioVar;
        this.e = ivkVar;
        this.f = bxkoVar;
        this.g = bxmhVar;
        F(ivkVar, bxkoVar, bxmhVar, i);
    }

    @dzsi
    private final akqi H() {
        dwjj dwjjVar = this.g.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dvzj dvzjVar = dwjjVar.g;
        if (dvzjVar == null) {
            dvzjVar = dvzj.y;
        }
        if ((dvzjVar.a & 1) != 0) {
            String str = dvzjVar.b;
            akqi f = akqi.f(str);
            if (f != null) {
                return f;
            }
            bvoo.h("Invalid feature_id in place_details_request_template: %s", str);
            return null;
        }
        return null;
    }

    private final boolean I() {
        dwjj dwjjVar = this.g.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        int a2 = dxbk.a(dxbpVar.g);
        return a2 != 0 && a2 == 11;
    }

    private final boolean J() {
        dwjj dwjjVar = this.g.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        int a2 = dxbk.a(dxbpVar.g);
        return a2 != 0 && a2 == 16;
    }

    private final boolean K() {
        dwjj dwjjVar = this.g.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        int a2 = dxbk.a(dxbpVar.g);
        return a2 != 0 && a2 == 17;
    }

    private final cjta L(ddho ddhoVar) {
        akqi H;
        cjta b2 = cjtd.b();
        dwjj dwjjVar = this.g.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        b2.g(dxbpVar.p);
        b2.d = ddhoVar;
        decs decsVar = null;
        if (this.f.G() && (H = H()) != null) {
            decsVar = decs.a(H.c);
        }
        b2.g = decsVar;
        return b2;
    }

    private final ddho M() {
        int a2;
        ddho ddhoVar = this.f.b().u;
        if (this.f.b() == bxla.START_LOCATION || this.f.b() == bxla.VIA_LOCATION || this.f.b() == bxla.END_LOCATION) {
            return dtyi.db;
        }
        if (I()) {
            return this.f.b() == bxla.PLACE_PICKER ? dtxj.E : dtxj.O;
        } else if (J()) {
            return dtyb.ex;
        } else {
            if (K()) {
                return dtyb.eu;
            }
            if (ddhoVar != null) {
                return ddhoVar;
            }
            dwjj dwjjVar = this.g.b;
            if (dwjjVar == null) {
                dwjjVar = dwjj.k;
            }
            dxbp dxbpVar = dwjjVar.b;
            if (dxbpVar == null) {
                dxbpVar = dxbp.x;
            }
            int a3 = dxbg.a(dxbpVar.s);
            if (a3 != 0 && a3 == 2 && this.x.getEnableFeatureParameters().aA) {
                return dtyb.ev;
            }
            dwjj dwjjVar2 = this.g.b;
            if (dwjjVar2 == null) {
                dwjjVar2 = dwjj.k;
            }
            dxbp dxbpVar2 = dwjjVar2.b;
            if (dxbpVar2 == null) {
                dxbpVar2 = dxbp.x;
            }
            int a4 = dxbg.a(dxbpVar2.s);
            if (a4 != 0 && a4 == 4) {
                return dtyb.ew;
            }
            return (!this.l || (a2 = dvtz.a(this.x.getSuggestParameters().d)) == 0 || a2 == 1) ? dtyi.da : dtyb.et;
        }
    }

    private final void N(@dzsi bxkv bxkvVar) {
        if (bxkvVar == null || this.c.c()) {
            return;
        }
        bxkvVar.e();
        this.q.u(bxkvVar);
    }

    private final boolean O() {
        dwjj dwjjVar = this.g.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dvuh dvuhVar = dwjjVar.e;
        if (dvuhVar == null) {
            dvuhVar = dvuh.d;
        }
        return dvuhVar.c.contains(39);
    }

    private final void P(int i) {
        bxmh bxmhVar = this.g;
        dsqp dsqpVar = (dsqp) bxmhVar.cu(5);
        dsqpVar.bC(bxmhVar);
        bxme bxmeVar = (bxme) dsqpVar;
        dwjj dwjjVar = this.g.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dsqp dsqpVar2 = (dsqp) dwjjVar.cu(5);
        dsqpVar2.bC(dwjjVar);
        dwji dwjiVar = (dwji) dsqpVar2;
        dwjj dwjjVar2 = this.g.b;
        if (dwjjVar2 == null) {
            dwjjVar2 = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar2.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        dsqp dsqpVar3 = (dsqp) dxbpVar.cu(5);
        dsqpVar3.bC(dxbpVar);
        dxbe dxbeVar = (dxbe) dsqpVar3;
        if (dxbeVar.c) {
            dxbeVar.bF();
            dxbeVar.c = false;
        }
        dxbp dxbpVar2 = (dxbp) dxbeVar.b;
        dxbpVar2.a |= 128;
        dxbpVar2.h = i;
        dxbp bK = dxbeVar.bK();
        if (dwjiVar.c) {
            dwjiVar.bF();
            dwjiVar.c = false;
        }
        dwjj dwjjVar3 = (dwjj) dwjiVar.b;
        bK.getClass();
        dwjjVar3.b = bK;
        dwjjVar3.a |= 1;
        if (bxmeVar.c) {
            bxmeVar.bF();
            bxmeVar.c = false;
        }
        bxmh bxmhVar2 = (bxmh) bxmeVar.b;
        dwjj bK2 = dwjiVar.bK();
        bK2.getClass();
        bxmhVar2.b = bK2;
        bxmhVar2.a |= 1;
        this.g = bxmeVar.bK();
    }

    @Override // defpackage.bxoi
    @dzsi
    public cyg A() {
        if (!K()) {
            return null;
        }
        cys a2 = this.z.a();
        dwjj dwjjVar = this.g.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        dpmh dpmhVar = dxbpVar.w;
        if (dpmhVar == null) {
            dpmhVar = dpmh.c;
        }
        dqmr dqmrVar = dpmhVar.a;
        if (dqmrVar == null) {
            dqmrVar = dqmr.h;
        }
        a2.f(dqmrVar);
        return a2;
    }

    @Override // defpackage.bxoi
    public Boolean B() {
        int a2;
        if (J()) {
            return true;
        }
        int a3 = dvtz.a(this.x.getSuggestParameters().d);
        if (a3 == 0 || a3 != 4) {
            if (!O() || ((a2 = dvtz.a(this.x.getSuggestParameters().d)) != 0 && a2 == 5)) {
                return Boolean.valueOf(this.l);
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.bxoi
    @dzsi
    public jic C() {
        dwjj dwjjVar = this.g.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        if ((dxbpVar.a & 256) != 0) {
            dwjj dwjjVar2 = this.g.b;
            if (dwjjVar2 == null) {
                dwjjVar2 = dwjj.k;
            }
            dxbp dxbpVar2 = dwjjVar2.b;
            if (dxbpVar2 == null) {
                dxbpVar2 = dxbp.x;
            }
            dwfl dwflVar = dxbpVar2.i;
            if (dwflVar == null) {
                dwflVar = dwfl.w;
            }
            return new jic(dwflVar.h, ckqc.FULLY_QUALIFIED, cqui.c(cquh.f(ibl.i()), cquh.a(0)), 0);
        }
        return null;
    }

    @Override // defpackage.bxoi
    public Boolean D() {
        return Boolean.valueOf(C() != null);
    }

    @Override // defpackage.bxoi
    public CharSequence E() {
        return this.p.getString(R.string.ADD_STREET_NUMBER_CONTENT_DESCRIPTION, new Object[]{this.i});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
        if (r9 != 3) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(defpackage.ivk r6, defpackage.bxko r7, defpackage.bxmh r8, int r9) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxqm.F(ivk, bxko, bxmh, int):void");
    }

    @dzsi
    public bxok G() {
        if (o().booleanValue()) {
            return null;
        }
        return this.n;
    }

    @Override // defpackage.bxoi
    public Boolean a() {
        boolean z = false;
        if (!I() && !c().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bxoi
    public Boolean b() {
        return Boolean.valueOf(I());
    }

    @Override // defpackage.bxoi
    public Boolean c() {
        dwjj dwjjVar = this.g.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        int a2 = dxbk.a(dxbpVar.g);
        boolean z = false;
        if (a2 != 0 && a2 == 12) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        return this.j;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    @Override // defpackage.jaf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.cqkl f(defpackage.cjqm r17) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxqm.f(cjqm):cqkl");
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    public cjtd h() {
        if (K() && !this.D) {
            this.D = true;
            if (H() == null) {
                bvoo.h("(sidbhadkamkar)Invalid feature_id for Suggest Ads.", new Object[0]);
            } else {
                btrm btrmVar = this.B;
                dwjj dwjjVar = this.g.b;
                if (dwjjVar == null) {
                    dwjjVar = dwjj.k;
                }
                dxbp dxbpVar = dwjjVar.b;
                if (dxbpVar == null) {
                    dxbpVar = dxbp.x;
                }
                dpmh dpmhVar = dxbpVar.w;
                if (dpmhVar == null) {
                    dpmhVar = dpmh.c;
                }
                dpll dpllVar = dpmhVar.b;
                if (dpllVar == null) {
                    dpllVar = dpll.c;
                }
                btrmVar.b(new becx(dpllVar.a, 8));
                ((ckcn) this.C.a().a(ckke.e)).a();
            }
        }
        return L(M()).a();
    }

    @Override // defpackage.bxoi
    public Boolean i() {
        return false;
    }

    @Override // defpackage.bxoi
    public Boolean j() {
        boolean z = false;
        if (!I() && !c().booleanValue() && !K()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bxoi
    public Boolean k() {
        boolean z = false;
        if (this.m != null && !c().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jbf
    public CharSequence l() {
        int a2;
        bxok G = G();
        if (G == null || !G.f().booleanValue()) {
            if (this.l && (a2 = dvtz.a(this.x.getSuggestParameters().d)) != 0 && a2 == 3) {
                dwjj dwjjVar = this.g.b;
                if (dwjjVar == null) {
                    dwjjVar = dwjj.k;
                }
                dxbp dxbpVar = dwjjVar.b;
                if (dxbpVar == null) {
                    dxbpVar = dxbp.x;
                }
                if ((dxbpVar.a & 4) == 0) {
                    return this.p.getString(R.string.CATEGORICAL_SEARCH_SUGGESTION_ANNOTATION_SEARCH_NEARBY);
                }
            }
            dwjj dwjjVar2 = this.g.b;
            if (dwjjVar2 == null) {
                dwjjVar2 = dwjj.k;
            }
            dxbp dxbpVar2 = dwjjVar2.b;
            if (dxbpVar2 == null) {
                dxbpVar2 = dxbp.x;
            }
            return dxbpVar2.d;
        }
        return "";
    }

    @Override // defpackage.jbi
    @dzsi
    public CharSequence m() {
        return this.i;
    }

    @Override // defpackage.bxoi
    @dzsi
    public CharSequence n() {
        return this.m;
    }

    @Override // defpackage.bxoi
    public Boolean o() {
        dwjj dwjjVar = this.g.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        dqia dqiaVar = dxbpVar.r;
        if (dqiaVar == null) {
            dqiaVar = dqia.c;
        }
        boolean z = true;
        if (!Boolean.valueOf(dqiaVar.b >= 0 && !dqiaVar.a.isEmpty()).booleanValue() || this.f.S()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bxoi
    public cqkl p() {
        if (this.e != null) {
            dwjj dwjjVar = this.g.b;
            if (dwjjVar == null) {
                dwjjVar = dwjj.k;
            }
            dxbp dxbpVar = dwjjVar.b;
            if (dxbpVar == null) {
                dxbpVar = dxbp.x;
            }
            dqia dqiaVar = dxbpVar.r;
            if (dqiaVar == null) {
                dqiaVar = dqia.c;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dqiaVar.a);
            int i = dqiaVar.b;
            spannableStringBuilder.insert(i, (CharSequence) " ");
            bxno bxnoVar = new bxno(this.p.getText(R.string.STREET_NUMBER_LABEL), ibl.q().b(this.p));
            spannableStringBuilder.setSpan(bxnoVar, i, i + 1, 33);
            this.e.J(spannableStringBuilder, i);
            bxql bxqlVar = this.y;
            if (bxqlVar != null) {
                bxqlVar.b(dqiaVar.a, i);
            }
            cqkx.p(this.e);
            for (View view : cqkx.n(this.e)) {
                dbsg<EditText> d = hqv.d(view);
                if (d.a()) {
                    EditText b2 = d.b();
                    b2.bringPointIntoView(Math.min(spannableStringBuilder.getSpanEnd(bxnoVar) + 4, spannableStringBuilder.length()));
                    b2.bringPointIntoView(spannableStringBuilder.getSpanStart(bxnoVar));
                    b2.requestFocus();
                    ((InputMethodManager) this.p.getSystemService("input_method")).showSoftInput(b2, 1);
                }
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.bxoi
    @dzsi
    public cjtd q() {
        return L(dtyb.es).a();
    }

    @Override // defpackage.bxoi
    @dzsi
    public cqss r() {
        return this.k;
    }

    @Override // defpackage.bxoi
    public cqkl s() {
        ivk ivkVar = this.e;
        if (ivkVar != null) {
            CharSequence charSequence = this.i;
            ivkVar.I(charSequence != null ? charSequence.toString() : "");
            cqkx.p(this.e);
        }
        return cqkl.a;
    }

    @Override // defpackage.bxoi
    @dzsi
    public cjtd t() {
        return L(dtyb.eD).a();
    }

    @Override // defpackage.bxoi
    @dzsi
    public CharSequence u() {
        CharSequence m = m();
        gga ggaVar = this.p;
        Object[] objArr = new Object[1];
        if (m == null) {
            m = "";
        }
        objArr[0] = m;
        return ggaVar.getString(R.string.ACCESSIBILITY_SUGGESTION_EDIT_BUTTON, objArr);
    }

    @Override // defpackage.bxoi
    @dzsi
    public bxok v() {
        bxok G = G();
        if (G == null || !G.e().booleanValue()) {
            return null;
        }
        return G;
    }

    @Override // defpackage.bxoi
    @dzsi
    public bxok w() {
        bxok G = G();
        if (G == null || !G.d().booleanValue()) {
            return null;
        }
        return G;
    }

    @Override // defpackage.bxoi
    public String x() {
        bxok G = G();
        return (G == null || dbsj.d(G.c())) ? " " : " · ";
    }

    @Override // defpackage.bxoi
    @dzsi
    public bxoj y() {
        return this.o;
    }

    @Override // defpackage.bxoi
    @dzsi
    public acmv z() {
        if (!K()) {
            return null;
        }
        String string = this.p.getString(R.string.AD);
        this.p.getResources();
        return acpd.a(string);
    }
}
