package defpackage;

import android.app.Application;
import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: sgl  reason: default package */
/* loaded from: classes7.dex */
public class sgl extends sbw implements saz {
    public boolean a;
    public final Context b;
    public final sdz c;
    @dzsi
    public final cqkn<sgl> d;
    public final rzr e;
    @dzsi
    public sbe f;
    @dzsi
    public amte g;
    private boolean h;
    private final boolean i;
    private final qjk j;
    private final shu k;
    private final qsm l;
    private final sgk m;
    private final sgk n;
    private boolean o;
    private final degu<amte> p;
    private int q;

    public sgl(Application application, cqhn cqhnVar, qjk qjkVar, shu shuVar, qsm qsmVar, sdz sdzVar, boolean z, CharSequence charSequence, @dzsi cqtd cqtdVar, @dzsi cqkn<sap> cqknVar, boolean z2, @dzsi final cqkn<saz> cqknVar2, @dzsi final cqkn<saz> cqknVar3, @dzsi cqkn<sgl> cqknVar4, CharSequence charSequence2, boolean z3, @dzsi cqkn<sap> cqknVar5, rzr rzrVar) {
        super(application, domy.TRANSIT, charSequence, cqtdVar, cqknVar, z2, charSequence2, z3, cqknVar5);
        this.q = 1;
        this.p = new sgi(this);
        this.b = application;
        this.i = z;
        this.j = qjkVar;
        this.k = shuVar;
        this.l = qsmVar;
        this.c = sdzVar;
        this.d = cqknVar4;
        this.e = rzrVar;
        this.m = new sgk(this, O(application, true), dtxl.cL, dtxl.cP, new cqkn(this, cqknVar2) { // from class: sgd
            private final sgl a;
            private final cqkn b;

            {
                this.a = this;
                this.b = cqknVar2;
            }

            @Override // defpackage.cqkn
            public final void a(cqkp cqkpVar, View view) {
                say sayVar = (say) cqkpVar;
                this.b.a(this.a, view);
            }
        });
        this.n = new sgk(this, O(application, false), dtxl.cJ, dtxl.cN, new cqkn(this, cqknVar3) { // from class: sge
            private final sgl a;
            private final cqkn b;

            {
                this.a = this;
                this.b = cqknVar3;
            }

            @Override // defpackage.cqkn
            public final void a(cqkp cqkpVar, View view) {
                say sayVar = (say) cqkpVar;
                this.b.a(this.a, view);
            }
        });
    }

    private static String O(Context context, boolean z) {
        return context.getString(true != z ? R.string.COMMUTE_MULTIMODAL_ADD_END_STATION : R.string.COMMUTE_MULTIMODAL_ADD_START_STATION);
    }

    @Override // defpackage.sbw
    @dzsi
    public rzk D() {
        sbe sbeVar;
        if (this.q == 2 && (sbeVar = this.f) != null && this.g != null) {
            int g = sbeVar.g();
            amte amteVar = this.g;
            dbsk.s(amteVar);
            amsy amsyVar = amteVar.a;
            boolean z = false;
            if (g >= 0 && g < amsyVar.n()) {
                z = true;
            }
            dbsk.e(z, "Invalid index %s", g);
            amve m = amsyVar.m(g);
            if (m.v()) {
                dpie dpieVar = m.a;
                if ((dpieVar.a & 64) != 0) {
                    dspd dspdVar = dpieVar.g;
                    dopk g2 = r().g();
                    dbsk.s(g2);
                    rzl b = rzl.b(akqi.b(g2.d));
                    dopk g3 = s().g();
                    dbsk.s(g3);
                    return rzk.f(dspdVar, b, rzl.b(akqi.b(g3.d)));
                }
            }
        }
        return null;
    }

    public void E(@dzsi sbe sbeVar) {
        this.f = sbeVar;
        cqkx.p(this);
        C();
    }

    public amte F() {
        amte amteVar = this.g;
        dbsk.s(amteVar);
        return amteVar;
    }

    public dcdc<amvh> G() {
        dopk dopkVar = this.m.b;
        dbsk.s(dopkVar);
        amvh x = sht.x(dopkVar);
        dopk dopkVar2 = this.n.b;
        dbsk.s(dopkVar2);
        return dcdc.g(x, sht.x(dopkVar2));
    }

    public void H(boolean z) {
        this.o = z;
    }

    public final void I() {
        if (!this.h || !this.a) {
            return;
        }
        this.a = false;
        J();
    }

    public final void J() {
        if (!this.m.d().booleanValue() || !this.n.d().booleanValue()) {
            return;
        }
        dopk g = this.m.g();
        dbsk.s(g);
        dopk g2 = this.n.g();
        dbsk.s(g2);
        dcep<Integer> j = this.j.j();
        if (j.isEmpty()) {
            return;
        }
        this.f = null;
        this.g = null;
        N(3);
        List<amvh> asList = Arrays.asList(sht.x(g), sht.x(g2));
        if (this.i) {
            this.l.h(asList, this.k.a(j, this.j.l()), this.p);
        } else {
            this.l.i(asList, this.k.a(j, this.j.n()), this.p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void K(@dzsi dopk dopkVar) {
        this.m.j(dopkVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void L(@dzsi dopk dopkVar) {
        this.n.j(dopkVar);
    }

    @dzsi
    public amub M() {
        if (this.q != 2) {
            return null;
        }
        return F().a(this.b).get(0);
    }

    public final void N(int i) {
        this.q = i;
        cqkx.p(this);
        C();
    }

    @Override // defpackage.san
    public void a() {
        this.l.e();
        this.h = true;
        I();
    }

    @Override // defpackage.san
    public void b() {
        this.h = false;
        this.l.f();
    }

    @Override // defpackage.sap
    public Boolean h() {
        int i = this.q;
        if (i != 0) {
            boolean z = false;
            if (i == 2 && this.f != null) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        throw null;
    }

    @Override // defpackage.sap
    public Boolean k() {
        return Boolean.valueOf(this.o);
    }

    @Override // defpackage.saz
    public say r() {
        return this.m;
    }

    @Override // defpackage.saz
    public say s() {
        return this.n;
    }

    @Override // defpackage.saz
    public Boolean t() {
        int i = this.q;
        boolean z = i == 3;
        if (i != 0) {
            return Boolean.valueOf(z);
        }
        throw null;
    }

    @Override // defpackage.saz
    @dzsi
    public sbe u() {
        return this.f;
    }

    @Override // defpackage.saz
    public Boolean v() {
        int i = this.q;
        boolean z = i == 4;
        if (i != 0) {
            return Boolean.valueOf(z);
        }
        throw null;
    }

    @Override // defpackage.saz
    public Boolean w() {
        int i = this.q;
        boolean z = i == 5;
        if (i != 0) {
            return Boolean.valueOf(z);
        }
        throw null;
    }

    @Override // defpackage.saz
    @dzsi
    public View.OnClickListener x() {
        if (this.d == null) {
            return null;
        }
        return new View.OnClickListener(this) { // from class: sgf
            private final sgl a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sgl sglVar = this.a;
                cqkn<sgl> cqknVar = sglVar.d;
                dbsk.s(cqknVar);
                cqknVar.a(sglVar, view);
            }
        };
    }

    @Override // defpackage.saz
    public cjtd y() {
        return cjtd.a(dtxl.cO);
    }
}
