package defpackage;
/* compiled from: PG */
/* renamed from: amvm  reason: default package */
/* loaded from: classes2.dex */
final class amvm extends amvo {
    private final akra c;

    public amvm(akra akraVar, akra akraVar2, akra akraVar3) {
        super(akraVar, akraVar3);
        this.c = akraVar2;
    }

    @Override // defpackage.amvo
    public final double a(double d) {
        double max = Math.max((double) dcyn.a, Math.min(c(), d));
        float G = (float) akra.G(this.a, this.c);
        double d2 = G;
        double h = akrb.h(G, (float) akra.G(this.c, this.b));
        Double.isNaN(h);
        Double.isNaN(d2);
        return d2 + ((max / c()) * h);
    }

    @Override // defpackage.amvo
    public final void b(double d, akra akraVar) {
        double c = d / c();
        if (c <= dcyn.a) {
            akraVar.aa(this.a);
        } else if (c >= 1.0d) {
            akraVar.aa(this.b);
        } else {
            amvp.c(this.a, this.c, this.b, c, akraVar);
        }
    }
}
