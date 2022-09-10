package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: anct  reason: default package */
/* loaded from: classes2.dex */
public class anct implements jap, anfa {
    protected boolean c;
    protected String d;
    final /* synthetic */ ancv f;
    private final anee g;
    private final cjtd h;
    private final cjtd i;
    private final cqtd j;
    public boolean a = false;
    protected boolean b = true;
    protected String e = "";

    /* JADX INFO: Access modifiers changed from: protected */
    public anct(ancv ancvVar, anee aneeVar) {
        this.f = ancvVar;
        this.c = false;
        this.d = "";
        this.g = aneeVar;
        this.i = cjtd.a(aneeVar.s());
        this.h = cjtd.a(aneeVar.t());
        int e = aneeVar.e();
        this.j = new anck(new Object[]{Integer.valueOf(e)}, e);
        this.c = aneeVar.i();
        if (aneeVar.j() != null) {
            String j = aneeVar.j();
            dbsk.s(j);
            this.d = j;
        }
    }

    private final boolean G() {
        return this.g.w().c(aned.QUANTUM_TOOLBAR) == aned.QUANTUM_TOOLBAR;
    }

    private final void H(cjqm cjqmVar) {
        akqq d = d();
        if (d != null) {
            ancv ancvVar = this.f;
            ancvVar.Nw(aneh.c(d, cjqmVar));
            ancvVar.Nz(null);
            ancvVar.aU();
        }
    }

    @Override // defpackage.jap
    public cjtd A() {
        return this.i;
    }

    @Override // defpackage.jap
    public cjtd B() {
        return this.h;
    }

    @Override // defpackage.jap
    @dzsi
    public cjtd C() {
        return null;
    }

    @Override // defpackage.jap
    @dzsi
    public String D() {
        if (this.f.ah.c()) {
            return this.f.aJ().m();
        }
        return null;
    }

    @Override // defpackage.jap
    public Integer E() {
        return Integer.valueOf(this.f.ah.c() ? ancv.d : ancv.c);
    }

    @Override // defpackage.jap
    public View.OnClickListener F() {
        return new View.OnClickListener(this) { // from class: ancr
            private final anct a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ff J;
                anct anctVar = this.a;
                if (anctVar.f.e() || (J = anctVar.f.J()) == null) {
                    return;
                }
                J.onBackPressed();
            }
        };
    }

    public String a() {
        ancv ancvVar;
        andd anddVar;
        if (!b() || (anddVar = (ancvVar = this.f).as) == null) {
            return this.g.c();
        }
        anby anbyVar = (anby) anddVar.d;
        int i = anbyVar.b - 1;
        if (i == 2) {
            return anbyVar.a;
        }
        if (i == 3) {
            String str = ancvVar.Rn().getConfiguration().orientation == 2 ? "" : "\n";
            String valueOf = String.valueOf(this.f.Rp(R.string.LOADING_REVERSE_GEOCODED_ADDRESS_TEXT));
            return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        }
        return this.g.c();
    }

    public boolean b() {
        return this.g.n();
    }

    public void c(boolean z) {
        this.b = z;
        cqkx.p(this);
    }

    @dzsi
    public akqq d() {
        akpm akpmVar;
        alad n;
        ancv ancvVar = this.f;
        if (!ancvVar.aD || (akpmVar = ancvVar.ai) == null || (n = akpmVar.n()) == null) {
            return null;
        }
        if (alae.a.equals(n.n)) {
            return n.i;
        }
        akzh l = akpmVar.l();
        akra akraVar = new akra();
        int z = l.z();
        float C = l.C();
        float n2 = l.n();
        float B = l.B();
        if (n.n == alae.a) {
            akraVar.aa(n.j);
        }
        akyx.i(n, C, n2, z, B, 0.0f, n.n.c * (z / 2.0f), akraVar);
        return akraVar.S();
    }

    @Override // defpackage.anfa
    public cqtd e() {
        return this.j;
    }

    public void f(boolean z) {
        this.c = z;
        cqkx.p(this);
    }

    @Override // defpackage.jap
    public cqkl g(cjqm cjqmVar) {
        ancv ancvVar = this.f;
        ancvVar.Nz(null);
        ancvVar.aU();
        return cqkl.a;
    }

    @Override // defpackage.jap
    public Boolean h() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.jap
    public String i() {
        String f = this.g.f();
        return f == null ? this.f.Rp(R.string.OK_BUTTON) : f;
    }

    @Override // defpackage.jap
    public cqkl k() {
        return cqkl.a;
    }

    @Override // defpackage.anfa
    public String l() {
        return this.d;
    }

    @Override // defpackage.jap
    public Boolean m() {
        return false;
    }

    @Override // defpackage.jap
    public cqkl n() {
        return cqkl.a;
    }

    @Override // defpackage.jap
    public String o() {
        return this.g.a();
    }

    @Override // defpackage.anfa
    public anez p() {
        return new anez();
    }

    @Override // defpackage.jap
    public jib q() {
        jhz a;
        if (G()) {
            a = new jhz();
            a.q = ibm.x();
        } else {
            a = jhz.a();
            a.q = ibm.Z();
        }
        String i = i();
        jhm jhmVar = new jhm();
        jhmVar.a = i;
        jhmVar.b = i;
        jhmVar.h = 2;
        jhmVar.f = B();
        jhmVar.d(new View.OnClickListener(this) { // from class: ancs
            private final anct a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.j(cjqm.a);
            }
        });
        jhmVar.n = this.b;
        if (!G()) {
            jhmVar.d = ibm.p();
        }
        a.c(jhmVar.c());
        a.a = o();
        a.C = this.g.b();
        a.b = a();
        a.D = this.g.d();
        a.f(new View.OnClickListener(this) { // from class: ancq
            private final anct a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.g(cjqm.a);
            }
        });
        a.o = this.i;
        return a.b();
    }

    @Override // defpackage.jap
    public Integer r() {
        return Integer.valueOf(this.g.w().c(aned.QUANTUM_TOOLBAR).d);
    }

    @Override // defpackage.anfa
    public Boolean s() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.jap
    public Boolean t() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.jap
    public Boolean u() {
        return false;
    }

    @Override // defpackage.jap
    public String v() {
        return "";
    }

    @Override // defpackage.jap
    public Boolean w() {
        return false;
    }

    @Override // defpackage.jap
    @dzsi
    public String x() {
        return null;
    }

    @Override // defpackage.jap
    @dzsi
    public String y() {
        return null;
    }

    @Override // defpackage.jap
    @dzsi
    public cjtd z() {
        return cjtd.a(dtxv.D);
    }

    @Override // defpackage.jap
    public cqkl j(cjqm cjqmVar) {
        ancv ancvVar = this.f;
        if (!ancvVar.af) {
            H(cjqmVar);
        } else if (ancvVar.ag) {
            ancvVar.bs();
            H(cjqmVar);
        } else {
            ancvVar.br();
        }
        return cqkl.a;
    }
}
