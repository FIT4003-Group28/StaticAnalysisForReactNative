package defpackage;
/* compiled from: PG */
/* renamed from: sbg  reason: default package */
/* loaded from: classes4.dex */
final class sbg implements sbn {
    public sch a;
    public sgt b;
    public final sek c;
    private final sch d;
    private final sch e;
    private set f;

    public sbg(sch schVar) {
        Float valueOf = Float.valueOf(0.0f);
        this.c = new sek(valueOf, valueOf);
        this.d = schVar;
        this.e = new sck();
        this.a = schVar;
    }

    public final float a(int i) {
        return this.a.h(i);
    }

    public final float b(int i) {
        return this.a.i(i);
    }

    public final float c(int i) {
        return this.a.j(i);
    }

    public final int d(int i) {
        return this.a.k(i);
    }

    public final int e() {
        return this.a.l();
    }

    public final int f(Object obj) {
        return this.a.m(obj);
    }

    public final Object g(int i) {
        return this.a.s(i);
    }

    public final float i() {
        return this.a.d();
    }

    public final float j() {
        return this.a.e();
    }

    @Override // defpackage.sbn
    public final void setAnimationPercent(float f) {
        this.a.g(f);
    }

    public final void h(set setVar, set setVar2, sgp sgpVar, sgt sgtVar, boolean z, float f, float f2, sek sekVar) {
        this.b = sgtVar;
        sch schVar = z ? this.d : this.e;
        sch schVar2 = this.a;
        if (schVar != schVar2) {
            schVar.b(schVar2.a());
            this.a.B();
            schVar.C();
            this.a = schVar;
        }
        this.a.c(f, f2);
        this.a.x(setVar, setVar2, sgpVar, sgtVar);
        if (setVar == null) {
            setVar = this.f;
        }
        this.f = setVar;
        if (setVar == null) {
            sek sekVar2 = this.c;
            Float valueOf = Float.valueOf(0.0f);
            sekVar2.b(valueOf, valueOf);
            return;
        }
        float c = setVar.c();
        this.c.b(Float.valueOf(((Float) sekVar.a).floatValue() - c), Float.valueOf(((Float) sekVar.b).floatValue() + c));
    }
}
