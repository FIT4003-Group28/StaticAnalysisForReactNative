package defpackage;
/* compiled from: PG */
/* renamed from: amvb  reason: default package */
/* loaded from: classes2.dex */
public final class amvb {
    public final int a;
    public final akrn b;
    public final double c;
    public final int d;
    public final dpgw e;
    public final int f;
    public final float g;

    public amvb(int i, akrn akrnVar, double d, int i2, dpgw dpgwVar, int i3, float f) {
        this.a = i;
        this.b = akrnVar;
        this.c = d;
        this.d = i2;
        this.e = dpgwVar;
        this.f = i3;
        this.g = f;
    }

    public final Integer a() {
        return Integer.valueOf(this.b.d);
    }

    public final akra b() {
        return this.b.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StopMetadata{");
        sb.append("stopIndex=");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", distanceFromPolylineStartMeters=");
        sb.append(this.c);
        sb.append(", stopCount=");
        sb.append(this.d);
        sb.append(", name=");
        sb.append(this.e.b);
        sb.append(", metersOnPolylineFromPrevStop=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
