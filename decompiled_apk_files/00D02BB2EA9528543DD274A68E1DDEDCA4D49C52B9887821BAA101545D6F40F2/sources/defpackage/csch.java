package defpackage;
/* compiled from: PG */
/* renamed from: csch  reason: default package */
/* loaded from: classes5.dex */
public final class csch {
    public final cscg a;
    public final csce b;
    public final cscg c;
    public final cscg d;
    public final cscg e;
    public final cscf f;
    public final cscf g;
    public final cscf h;
    public final cscf i;
    public int j;
    public float k;

    public csch(cscg cscgVar, csce csceVar, cscg cscgVar2, cscg cscgVar3, cscg cscgVar4, cscf cscfVar, cscf cscfVar2, cscf cscfVar3, cscf cscfVar4) {
        this.a = cscgVar;
        this.b = csceVar;
        this.c = cscgVar2;
        this.d = cscgVar3;
        this.e = cscgVar4;
        this.f = cscfVar;
        this.g = cscfVar2;
        this.h = cscfVar3;
        this.i = cscfVar4;
    }

    public final void a(float f, float f2, float f3, int i) {
        this.a.e(f);
        this.b.e(f2);
        this.g.e(f3);
        this.c.e(4.0f);
        this.d.e(0.0f);
        this.e.e(0.0f);
        this.h.e(0.0f);
        this.f.e(0.0f);
        this.j = i;
    }

    public final void b(float f) {
        this.a.a(f);
    }

    public final void c(float f) {
        this.b.a(f);
    }

    public final float d() {
        return this.b.c;
    }

    public final void e(boolean z) {
        this.b.a = z;
    }

    public final float f() {
        return this.b.b;
    }

    public final void g(float f) {
        this.b.d(f);
    }

    public final void h(float f, float f2) {
        float f3 = this.a.c;
        double cos = Math.cos(this.b.c);
        float f4 = this.d.c;
        float f5 = this.a.c;
        double sin = Math.sin(this.b.c);
        float f6 = this.e.c;
        this.b.e(f);
        this.a.e(f2);
        float f7 = this.a.c;
        double cos2 = Math.cos(this.b.c);
        float f8 = this.a.c;
        double sin2 = Math.sin(this.b.c);
        this.d.e(((f3 * ((float) cos)) + f4) - (f7 * ((float) cos2)));
        this.e.e(((f5 * ((float) sin)) + f6) - (f8 * ((float) sin2)));
    }

    public final void i(float f) {
        this.c.a(f);
    }

    public final float j() {
        return this.c.c;
    }

    public final void k(float f) {
        this.d.a(f);
    }

    public final void l(float f) {
        this.e.a(f);
    }

    public final float m() {
        return this.e.c;
    }

    public final void n(float f) {
        this.f.a(f);
    }

    public final void o(float f) {
        this.g.a(f);
    }

    public final float p() {
        return this.g.c;
    }

    public final void q(int i) {
        this.h.a(i);
    }

    public final void r(int i) {
        this.i.a(i);
    }

    public final float s() {
        return this.i.c;
    }

    public final boolean t() {
        return this.i.c > 0.001f;
    }

    public final boolean u() {
        return this.g.c > 0.001f;
    }

    public final void v(boolean z) {
        this.a.h(!z);
    }

    public final void w(boolean z) {
        this.c.h(!z);
    }

    public final void x(boolean z) {
        this.b.h(!z);
    }

    public final void y(boolean z) {
        this.e.h(!z);
    }
}
