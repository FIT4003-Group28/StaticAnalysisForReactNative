package defpackage;
/* compiled from: PG */
/* renamed from: sci  reason: default package */
/* loaded from: classes4.dex */
public final class sci extends scm implements sch {
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;

    @Override // defpackage.sch
    public final scj a() {
        if (this.a == null) {
            return null;
        }
        return new scj(o(), p(), this.c, this.f);
    }

    @Override // defpackage.sch
    public final synchronized void b(scj scjVar) {
        if (scjVar == null) {
            return;
        }
        v(scjVar.a);
        w(scjVar.b);
        float f = scjVar.c;
        this.d = f;
        this.b = f;
        this.c = f;
        float f2 = scjVar.d;
        this.g = f2;
        this.e = f2;
        this.f = f2;
    }

    @Override // defpackage.sch
    public final void c(float f, float f2) {
        this.b = this.c;
        this.e = this.f;
        this.d = f;
        this.g = f2;
    }

    @Override // defpackage.sch
    public final float d() {
        return this.f;
    }

    @Override // defpackage.sch
    public final float e() {
        return this.c;
    }

    @Override // defpackage.scm
    protected final scl f(sgt sgtVar) {
        return n(sgtVar);
    }

    @Override // defpackage.scm, defpackage.sco
    public final synchronized void g(float f) {
        super.g(f);
        float f2 = this.d;
        float f3 = this.b;
        this.c = ((f2 - f3) * f) + f3;
        float f4 = this.g;
        float f5 = this.e;
        this.f = ((f4 - f5) * f) + f5;
    }
}
