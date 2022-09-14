package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ggr  reason: default package */
/* loaded from: classes6.dex */
public class ggr implements jap {
    @dzsi
    private cqkf<jap> a;
    private Runnable b;
    private Runnable c;
    private Runnable d;
    private String e;
    private String f;
    private int g;
    private String h;
    private boolean i;
    @dzsi
    private String k;
    private boolean l;
    private boolean m;
    private cjtd n;
    private cjtd o;
    private cjtd p;
    private final cqkj q;
    private String j = "";
    private boolean r = false;

    public ggr(cqkj cqkjVar) {
        this.q = cqkjVar;
    }

    private final void G() {
        cqkf<jap> cqkfVar = this.a;
        if (cqkfVar != null) {
            cqkfVar.e(this);
        }
    }

    @Override // defpackage.jap
    public cjtd A() {
        return this.n;
    }

    @Override // defpackage.jap
    public cjtd B() {
        return this.o;
    }

    @Override // defpackage.jap
    public cjtd C() {
        return this.p;
    }

    @Override // defpackage.jap
    @dzsi
    public String D() {
        return null;
    }

    @Override // defpackage.jap
    public Integer E() {
        return 2132018113;
    }

    @Override // defpackage.jap
    public View.OnClickListener F() {
        return null;
    }

    public View a(String str, String str2, int i, String str3, String str4, Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4, cjtd cjtdVar, cjtd cjtdVar2, cjtd cjtdVar3, cjqy cjqyVar) {
        this.b = runnable;
        this.c = runnable2;
        this.d = runnable3;
        this.e = str;
        this.f = str2;
        this.g = i;
        this.h = str3;
        this.n = cjtdVar;
        this.o = cjtdVar2;
        this.p = cjtdVar3;
        cqkf<jap> c = this.q.c(new gny(), null);
        this.a = c;
        return c.c();
    }

    public void b() {
        G();
    }

    public void c(String str, @dzsi String str2) {
        this.j = str;
        this.k = str2;
        this.i = false;
        G();
    }

    public void d() {
        this.j = "";
        this.k = "";
        this.m = false;
        this.a.e(this);
        G();
    }

    public void e(boolean z) {
        this.i = z;
        G();
    }

    public void f(boolean z) {
        this.l = z;
        G();
    }

    @Override // defpackage.jap
    public cqkl g(cjqm cjqmVar) {
        this.b.run();
        return cqkl.a;
    }

    @Override // defpackage.jap
    public Boolean h() {
        return Boolean.valueOf(this.l);
    }

    @Override // defpackage.jap
    public String i() {
        return this.h;
    }

    @Override // defpackage.jap
    public cqkl j(cjqm cjqmVar) {
        this.c.run();
        return cqkl.a;
    }

    @Override // defpackage.jap
    public cqkl k() {
        return cqkl.a;
    }

    public void l(boolean z) {
        this.m = z;
        G();
    }

    @Override // defpackage.jap
    public Boolean m() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.jap
    public cqkl n() {
        this.d.run();
        return cqkl.a;
    }

    @Override // defpackage.jap
    public String o() {
        return this.e;
    }

    public String p() {
        return this.f;
    }

    @Override // defpackage.jap
    public jib q() {
        jhz a = this.r ? jhz.a() : new jhz();
        if (!this.r) {
            a.q = ibm.x();
        }
        a.a = o();
        a.b = p();
        a.x = this.r;
        a.C = 2;
        a.D = this.g;
        a.f(new ggq(this));
        a.o = this.n;
        String i = i();
        jhm jhmVar = new jhm();
        jhmVar.a = i;
        jhmVar.b = i;
        jhmVar.h = 2;
        jhmVar.f = B();
        jhmVar.d(new View.OnClickListener(this) { // from class: ggp
            private final ggr a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.j(cjqm.a);
            }
        });
        jhmVar.n = this.l;
        jhmVar.d = this.r ? ibm.p() : irg.a();
        a.c(jhmVar.c());
        return a.b();
    }

    @Override // defpackage.jap
    public Integer r() {
        aned anedVar;
        if (this.r) {
            anedVar = aned.GM2_TOOLBAR;
        } else {
            anedVar = aned.QUANTUM_TOOLBAR;
        }
        return Integer.valueOf(anedVar.d);
    }

    public void s(boolean z) {
        this.r = true;
        G();
    }

    @Override // defpackage.jap
    public Boolean t() {
        return Boolean.valueOf(this.i);
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
        boolean z = true;
        if (!this.i && dbsj.d(this.j) && dbsj.d(this.k)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jap
    public String x() {
        return this.j;
    }

    @Override // defpackage.jap
    @dzsi
    public String y() {
        return this.k;
    }

    @Override // defpackage.jap
    @dzsi
    public cjtd z() {
        return null;
    }
}
