package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: awoy  reason: default package */
/* loaded from: classes3.dex */
public final class awoy implements akzw, awph {
    public final awow a;
    private final akox b;
    private final ammt c;

    public awoy(bvnx bvnxVar, akox akoxVar, awpf awpfVar, Context context) {
        dbsk.s(akoxVar);
        this.b = akoxVar;
        this.c = new ammt(context);
        this.a = new awow(bvnxVar, akoxVar, awpfVar);
    }

    @Override // defpackage.akzw
    public final void a(float[] fArr) {
        akra akraVar = this.b.n().j;
        akra akraVar2 = akyx.g(this.b.k(), this.b.n(), fArr[0], fArr[1]).j;
        awow awowVar = this.a;
        float f = akraVar2.a - akraVar.a;
        float f2 = akraVar2.b - akraVar.b;
        awowVar.c = akra.s(akraVar);
        awowVar.d = akraVar.a;
        awowVar.e = akraVar.b;
        awowVar.f = akraVar.c;
        awowVar.g = f;
        awowVar.h = f2;
        awowVar.i = awowVar.b.a();
        awox awoxVar = awowVar.a;
        float f3 = awowVar.d;
        float f4 = awowVar.e;
        awoxVar.a = f;
        awoxVar.b = f2;
        awoxVar.c = f3;
        awoxVar.d = f4;
        awowVar.j = false;
        awowVar.k = false;
        awowVar.l = false;
        awowVar.m = false;
        this.b.r(this.a);
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        this.c.a(fArr);
    }

    @Override // defpackage.akzw
    public final void b(float[] fArr) {
        this.c.b(fArr);
    }

    @Override // defpackage.akzw
    public final float c() {
        return this.c.a;
    }

    @Override // defpackage.akzw
    public final boolean d() {
        return false;
    }

    @Override // defpackage.akzw
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.akzw
    public final boolean f() {
        return this.c.f();
    }

    @Override // defpackage.akzw
    public final boolean g() {
        return this.c.g();
    }

    @Override // defpackage.akzw
    public final void h() {
        this.a.a();
        this.c.h();
    }

    @Override // defpackage.akzw
    public final void i() {
        this.a.a();
    }

    @Override // defpackage.awph
    public final void k(int i) {
        if (i == 1) {
            this.b.K(null);
        } else {
            this.b.K(this);
        }
    }
}
