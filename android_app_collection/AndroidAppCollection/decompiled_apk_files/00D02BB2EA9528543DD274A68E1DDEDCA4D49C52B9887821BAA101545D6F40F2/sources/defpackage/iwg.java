package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: iwg  reason: default package */
/* loaded from: classes6.dex */
public class iwg extends ivw implements izg {
    private static final cqtd c = cqrt.g(2131232773, iva.b(ibl.H(), ibl.s()));
    private static final cqtd d = cqrt.g(2131232750, ibm.x());
    private final gga e;
    private final jkf f;
    @dzsi
    private final brmd g;
    private boolean h;
    private boolean i;

    public iwg(gga ggaVar, jkf jkfVar, btvo btvoVar, @dzsi brmd brmdVar) {
        super(ggaVar, ivu.FIXED, jaq.DAY_NIGHT_BLUE_ON_WHITE, cqrt.f(2131232773), "", null, true, 0);
        this.e = ggaVar;
        this.f = jkfVar;
        this.g = brmdVar;
        this.i = !N(ggaVar);
    }

    private static boolean N(gga ggaVar) {
        return btpf.d(ggaVar.getResources().getConfiguration()).e && ggaVar.getResources().getConfiguration().orientation == 2;
    }

    @Override // defpackage.ivw, defpackage.jar
    public Boolean A() {
        boolean z = false;
        if (super.A().booleanValue() && this.i) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ivw, defpackage.jar
    public cqss L() {
        return this.h ? ibm.b() : iva.b(ibl.b(), ibl.E());
    }

    @Override // defpackage.ivw, defpackage.jar
    public cqss M() {
        return this.h ? ibm.x() : iva.b(ibl.H(), ibl.s());
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        return g();
    }

    @Override // defpackage.izg
    public cqkl g() {
        if (this.h) {
            this.g.L(this.f.l(), jjn.HIDDEN, jjn.FULLY_EXPANDED, jkg.AUTOMATED);
        } else {
            this.g.a();
        }
        return cqkl.a;
    }

    @Override // defpackage.izg
    public CharSequence h() {
        return this.e.getString(true != this.h ? R.string.SEARCH_RESULTS_MAP_VIEW_TOGGLE : R.string.SEARCH_RESULTS_LIST_VIEW_TOGGLE);
    }

    public void i(boolean z) {
        this.h = z;
    }

    public boolean j() {
        return this.h;
    }

    public void k() {
        this.i = !N(this.e);
    }

    @Override // defpackage.izg
    public Boolean l() {
        return false;
    }

    @Override // defpackage.ivw, defpackage.jar
    public cqtd r() {
        return this.h ? d : c;
    }

    @Override // defpackage.ivw, defpackage.jar
    public String x() {
        return this.e.getString(true != this.h ? R.string.MAP_VIEW_ACTION_BUTTON_TOGGLE_LABEL : R.string.LIST_VIEW_ACTION_BUTTON_TOGGLE_LABEL);
    }

    @Override // defpackage.ivw, defpackage.jar
    public String y() {
        return h().toString();
    }

    @Override // defpackage.ivw, defpackage.jar
    public cjtd z() {
        if (this.h) {
            return cjtd.a(dtxu.F);
        }
        return cjtd.a(dtyc.fS);
    }
}
