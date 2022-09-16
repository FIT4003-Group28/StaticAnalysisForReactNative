package defpackage;
/* compiled from: PG */
/* renamed from: cpsi  reason: default package */
/* loaded from: classes5.dex */
final class cpsi {
    public float a;
    public double b;
    public float c;
    public int d;
    public float e;

    public cpsi() {
        this.a = 0.0f;
        this.b = dcyn.a;
        this.c = 1.0f;
        this.d = 0;
        this.e = 0.0f;
    }

    public cpsi(cpsi cpsiVar) {
        this.a = 0.0f;
        this.b = dcyn.a;
        this.c = 1.0f;
        this.d = 0;
        this.e = 0.0f;
        this.a = cpsiVar.a;
        this.b = cpsiVar.b;
        this.c = cpsiVar.c;
        this.d = cpsiVar.d;
        this.e = cpsiVar.e;
    }

    public final float a(double d) {
        double d2 = d + this.b;
        double d3 = this.c;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        double d5 = this.d;
        Double.isNaN(d5);
        return (float) (d4 + d5);
    }
}
