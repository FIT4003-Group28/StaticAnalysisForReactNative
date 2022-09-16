package defpackage;
/* compiled from: PG */
/* renamed from: alnb  reason: default package */
/* loaded from: classes.dex */
public final class alnb {
    public alms a;
    public alms b;
    public alms c;
    public alms d;
    public almu e;
    public almu f;
    public almu g;
    public almu h;
    public anlz i;
    public anlz j;
    public anlz k;
    public anlz l;

    public alnb() {
        this.i = almu.C();
        this.j = almu.C();
        this.k = almu.C();
        this.l = almu.C();
        this.a = new almq(0.0f);
        this.b = new almq(0.0f);
        this.c = new almq(0.0f);
        this.d = new almq(0.0f);
        this.e = almu.a();
        this.f = almu.a();
        this.g = almu.a();
        this.h = almu.a();
    }

    public static void h(anlz anlzVar) {
        if (anlzVar instanceof alna) {
            alna alnaVar = (alna) anlzVar;
        } else if (!(anlzVar instanceof almt)) {
        } else {
            almt almtVar = (almt) anlzVar;
        }
    }

    public final alnc a() {
        return new alnc(this);
    }

    public final void b(float f) {
        this.d = new almq(f);
    }

    public final void c(float f) {
        this.c = new almq(f);
    }

    public final void d(float f) {
        this.a = new almq(f);
    }

    public final void e(float f) {
        this.b = new almq(f);
    }

    public final void f(anlz anlzVar) {
        this.i = anlzVar;
        h(anlzVar);
    }

    public final void g(anlz anlzVar) {
        this.j = anlzVar;
        h(anlzVar);
    }

    public alnb(alnc alncVar) {
        this.i = almu.C();
        this.j = almu.C();
        this.k = almu.C();
        this.l = almu.C();
        this.a = new almq(0.0f);
        this.b = new almq(0.0f);
        this.c = new almq(0.0f);
        this.d = new almq(0.0f);
        this.e = almu.a();
        this.f = almu.a();
        this.g = almu.a();
        this.h = almu.a();
        this.i = alncVar.j;
        this.j = alncVar.k;
        this.k = alncVar.l;
        this.l = alncVar.m;
        this.a = alncVar.b;
        this.b = alncVar.c;
        this.c = alncVar.d;
        this.d = alncVar.e;
        this.e = alncVar.f;
        this.f = alncVar.g;
        this.g = alncVar.h;
        this.h = alncVar.i;
    }
}
