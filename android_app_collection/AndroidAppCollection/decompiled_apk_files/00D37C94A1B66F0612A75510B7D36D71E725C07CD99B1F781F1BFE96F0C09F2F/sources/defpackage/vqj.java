package defpackage;
/* compiled from: PG */
/* renamed from: vqj  reason: default package */
/* loaded from: classes4.dex */
public final class vqj implements vqk {
    public float a = 0.0f;
    final /* synthetic */ vqp b;
    private final vql c;
    private final vql d;
    private final vql e;
    private final float f;
    private final float g;
    private final float h;
    private float i;
    private float j;
    private float k;

    public vqj(vqp vqpVar, vql vqlVar, vql vqlVar2, vql vqlVar3) {
        this.b = vqpVar;
        this.c = vqlVar;
        this.d = vqlVar2;
        this.e = vqlVar3;
        this.f = vqlVar.a(vqlVar2.a);
        this.g = vqlVar.a(vqlVar2.b);
        this.h = (float) (vqlVar2.c / vqlVar.c);
        d(this.a);
    }

    @Override // defpackage.vqk
    public final float a(long j) {
        if (this.b.g) {
            return this.e.a(j);
        }
        vql vqlVar = this.d;
        if (j < vqlVar.a) {
            return this.c.a(j) - (this.f - this.i);
        }
        if (j > vqlVar.b) {
            return this.c.a(j) + (this.j - this.g);
        }
        return this.i + (this.k * vqlVar.a(j));
    }

    @Override // defpackage.vqk
    public final long b(float f) {
        return this.e.b(f);
    }

    @Override // defpackage.vqk
    public final long c(float f) {
        if (this.b.g) {
            return this.e.c(f);
        }
        float f2 = this.i;
        if (f < f2) {
            return this.c.c(f + (this.f - f2));
        }
        float f3 = this.j;
        if (f > f3) {
            return this.c.c(f - (f3 - this.g));
        }
        return this.d.c((f - f2) / this.k);
    }

    public final void d(float f) {
        this.a = f;
        this.i = (float) vqp.a(this.f, 0.0d, f);
        this.j = (float) vqp.a(this.g, 1.0d, f);
        this.k = (float) vqp.a(this.h, 1.0d, f);
        this.b.g();
    }
}
