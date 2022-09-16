package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: axlh  reason: default package */
/* loaded from: classes2.dex */
public final class axlh {
    public static final axlh a = new axlh(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final axlh b = new axlh(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final axlh c = new axlh(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final axlh d = new axlh(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;
    public final double j;
    public final double k;
    public final double l;
    public final double m;

    public axlh(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.e = d6;
        this.f = d7;
        this.g = d8;
        this.h = d2;
        this.i = d3;
        this.j = d4;
        this.k = d5;
        this.l = d9;
        this.m = d10;
    }

    public static axlh a(ByteBuffer byteBuffer) {
        double C = hy.C(byteBuffer);
        double C2 = hy.C(byteBuffer);
        double B = hy.B(byteBuffer);
        return new axlh(C, C2, hy.C(byteBuffer), hy.C(byteBuffer), B, hy.B(byteBuffer), hy.B(byteBuffer), hy.C(byteBuffer), hy.C(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        hy.u(byteBuffer, this.h);
        hy.u(byteBuffer, this.i);
        hy.t(byteBuffer, this.e);
        hy.u(byteBuffer, this.j);
        hy.u(byteBuffer, this.k);
        hy.t(byteBuffer, this.f);
        hy.u(byteBuffer, this.l);
        hy.u(byteBuffer, this.m);
        hy.t(byteBuffer, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axlh axlhVar = (axlh) obj;
        return Double.compare(axlhVar.h, this.h) == 0 && Double.compare(axlhVar.i, this.i) == 0 && Double.compare(axlhVar.j, this.j) == 0 && Double.compare(axlhVar.k, this.k) == 0 && Double.compare(axlhVar.l, this.l) == 0 && Double.compare(axlhVar.m, this.m) == 0 && Double.compare(axlhVar.e, this.e) == 0 && Double.compare(axlhVar.f, this.f) == 0 && Double.compare(axlhVar.g, this.g) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.e);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f);
        long doubleToLongBits3 = Double.doubleToLongBits(this.g);
        long doubleToLongBits4 = Double.doubleToLongBits(this.h);
        long doubleToLongBits5 = Double.doubleToLongBits(this.i);
        long doubleToLongBits6 = Double.doubleToLongBits(this.j);
        long doubleToLongBits7 = Double.doubleToLongBits(this.k);
        long doubleToLongBits8 = Double.doubleToLongBits(this.l);
        long doubleToLongBits9 = Double.doubleToLongBits(this.m);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4))) * 31) + ((int) ((doubleToLongBits5 >>> 32) ^ doubleToLongBits5))) * 31) + ((int) ((doubleToLongBits6 >>> 32) ^ doubleToLongBits6))) * 31) + ((int) ((doubleToLongBits7 >>> 32) ^ doubleToLongBits7))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(a)) {
            return "Rotate 0°";
        }
        if (equals(b)) {
            return "Rotate 90°";
        }
        if (equals(c)) {
            return "Rotate 180°";
        }
        if (equals(d)) {
            return "Rotate 270°";
        }
        double d2 = this.e;
        double d3 = this.f;
        double d4 = this.g;
        double d5 = this.h;
        double d6 = this.i;
        double d7 = this.j;
        double d8 = this.k;
        double d9 = this.l;
        double d10 = this.m;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d2);
        sb.append(", v=");
        sb.append(d3);
        sb.append(", w=");
        sb.append(d4);
        sb.append(", a=");
        sb.append(d5);
        sb.append(", b=");
        sb.append(d6);
        sb.append(", c=");
        sb.append(d7);
        sb.append(", d=");
        sb.append(d8);
        sb.append(", tx=");
        sb.append(d9);
        sb.append(", ty=");
        sb.append(d10);
        sb.append("}");
        return sb.toString();
    }
}
