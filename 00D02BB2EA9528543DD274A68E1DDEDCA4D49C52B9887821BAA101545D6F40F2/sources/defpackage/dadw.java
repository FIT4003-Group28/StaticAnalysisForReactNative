package defpackage;
/* compiled from: PG */
/* renamed from: dadw  reason: default package */
/* loaded from: classes.dex */
public final class dadw {
    public dadl a;
    public dadl b;
    public dadl c;
    public dadl d;
    public dadk e;
    public dadk f;
    public dadk g;
    public dadk h;
    public dadn i;
    public dadn j;
    public dadn k;
    public dadn l;

    public dadw() {
        this.a = dads.b();
        this.b = dads.b();
        this.c = dads.b();
        this.d = dads.b();
        this.e = new dadi(0.0f);
        this.f = new dadi(0.0f);
        this.g = new dadi(0.0f);
        this.h = new dadi(0.0f);
        this.i = dads.c();
        this.j = dads.c();
        this.k = dads.c();
        this.l = dads.c();
    }

    public static float a(dadl dadlVar) {
        if (dadlVar instanceof dadv) {
            dadv dadvVar = (dadv) dadlVar;
            return -1.0f;
        }
        if (dadlVar instanceof dadm) {
            dadm dadmVar = (dadm) dadlVar;
        }
        return -1.0f;
    }

    public final dadx b() {
        return new dadx(this);
    }

    public final void c(float f) {
        this.h = new dadi(f);
    }

    public final void d(float f) {
        this.g = new dadi(f);
    }

    public final void e(dadl dadlVar) {
        this.a = dadlVar;
        a(dadlVar);
    }

    public final void f(float f) {
        this.e = new dadi(f);
    }

    public final void g(dadl dadlVar) {
        this.b = dadlVar;
        a(dadlVar);
    }

    public final void h(float f) {
        this.f = new dadi(f);
    }

    public final void i(float f) {
        f(f);
        h(f);
        d(f);
        c(f);
    }

    public final void j(float f) {
        e(dads.a(0));
        f(f);
    }

    public final void k(float f) {
        g(dads.a(0));
        h(f);
    }

    public dadw(dadx dadxVar) {
        this.a = dads.b();
        this.b = dads.b();
        this.c = dads.b();
        this.d = dads.b();
        this.e = new dadi(0.0f);
        this.f = new dadi(0.0f);
        this.g = new dadi(0.0f);
        this.h = new dadi(0.0f);
        this.i = dads.c();
        this.j = dads.c();
        this.k = dads.c();
        this.l = dads.c();
        this.a = dadxVar.b;
        this.b = dadxVar.c;
        this.c = dadxVar.d;
        this.d = dadxVar.e;
        this.e = dadxVar.f;
        this.f = dadxVar.g;
        this.g = dadxVar.h;
        this.h = dadxVar.i;
        this.i = dadxVar.j;
        this.j = dadxVar.k;
        this.k = dadxVar.l;
        this.l = dadxVar.m;
    }
}
