package defpackage;
/* compiled from: PG */
/* renamed from: amvo  reason: default package */
/* loaded from: classes2.dex */
abstract class amvo {
    final akra a;
    final akra b;

    public amvo(akra akraVar, akra akraVar2) {
        this.a = akraVar;
        this.b = akraVar2;
    }

    public abstract double a(double d);

    public abstract void b(double d, akra akraVar);

    public final double c() {
        double y = this.a.y(this.b);
        double r = this.a.r();
        Double.isNaN(y);
        return y / r;
    }
}
