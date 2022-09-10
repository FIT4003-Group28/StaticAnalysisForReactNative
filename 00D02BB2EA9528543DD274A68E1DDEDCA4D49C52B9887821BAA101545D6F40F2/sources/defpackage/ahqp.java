package defpackage;
/* compiled from: PG */
/* renamed from: ahqp  reason: default package */
/* loaded from: classes2.dex */
public abstract class ahqp extends bqyh {
    private static final dcqe f = dcqe.c("ahqp");
    @dzsi
    protected final akra a;

    public ahqp(akra akraVar, @dzsi akra akraVar2, akra akraVar3) {
        super(akraVar, akraVar3);
        this.a = akraVar2;
    }

    @Override // defpackage.bqyh
    public final void a(double d, akra akraVar) {
        float c = (float) (d / c());
        akra akraVar2 = this.a;
        if (akraVar2 == null) {
            akra.H(this.b, this.c, c, akraVar);
        } else if (c <= 0.0f) {
            float y = this.b.y(akraVar2);
            double r = this.b.r();
            akra akraVar3 = this.b;
            akra akraVar4 = this.a;
            double d2 = y;
            Double.isNaN(d2);
            akra.H(akraVar3, akraVar4, (float) (d / (d2 / r)), akraVar);
        } else if (c >= 1.0f) {
            double c2 = c();
            float y2 = this.a.y(this.c);
            double r2 = this.b.r();
            akra akraVar5 = this.c;
            akra akraVar6 = this.a;
            double d3 = c2 - d;
            double d4 = y2;
            Double.isNaN(d4);
            akra.H(akraVar5, akraVar6, (float) (d3 / (d4 / r2)), akraVar);
        } else {
            double r3 = this.b.r() * 0.5d;
            akra akraVar7 = this.b;
            akro.b(akraVar7, this.a, this.c, (int) (r3 * r3), d * akraVar7.r(), akraVar);
        }
    }

    @Override // defpackage.bqyh
    public final double b() {
        akra akraVar = this.a;
        if (akraVar == null) {
            return Double.POSITIVE_INFINITY;
        }
        float f2 = -akrb.h((float) akra.G(this.b, akraVar), (float) akra.G(this.a, this.c));
        if (f2 == 0.0f) {
            return Double.POSITIVE_INFINITY;
        }
        double y = this.b.y(this.c) / 2.0f;
        double r = this.b.r();
        Double.isNaN(y);
        return (y / r) / Math.sin(Math.toRadians(f2) / 2.0d);
    }

    @Override // defpackage.bqyh
    public final double c() {
        float f2 = this.e;
        if (f2 == -1.0f) {
            if (this.a == null) {
                double y = this.b.y(this.c);
                double r = this.b.r();
                Double.isNaN(y);
                f2 = (float) (y / r);
                this.e = f2;
            } else {
                double r2 = this.b.r() * 0.5d;
                akra akraVar = this.b;
                akra akraVar2 = this.a;
                akra akraVar3 = this.c;
                f2 = (float) (akro.a(akraVar.a, akraVar.b, akraVar2.a, akraVar2.b, akraVar3.a, akraVar3.b, (int) (r2 * r2)) / this.b.r());
                this.e = f2;
            }
        }
        return f2;
    }

    @Override // defpackage.bqyh
    public boolean equals(@dzsi Object obj) {
        bvoo.h("Equals should be called directly on subclasses.", new Object[0]);
        return this == obj;
    }

    @Override // defpackage.bqyh
    public int hashCode() {
        int hashCode = (this.b.hashCode() * 229) + this.c.hashCode();
        akra akraVar = this.a;
        return akraVar != null ? (hashCode * 233) + akraVar.hashCode() : hashCode;
    }
}
