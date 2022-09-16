package defpackage;

import android.graphics.Rect;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tkx  reason: default package */
/* loaded from: classes4.dex */
public final class tkx {
    public final double a;
    public final double b;
    public final double c;
    public final Integer d;
    public final amuk e;
    private final double f;
    private final double g;
    private final double h;
    private final double i;
    private final double j;
    private final double k;
    private final Rect l;
    private final Rect m;

    public tkx() {
    }

    public tkx(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, Rect rect, Rect rect2, Integer num, amuk amukVar) {
        this.a = d;
        this.f = d2;
        this.g = d3;
        this.b = d4;
        this.h = d5;
        this.i = d6;
        this.c = d7;
        this.j = d8;
        this.k = d9;
        this.l = rect;
        this.m = rect2;
        this.d = num;
        this.e = amukVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static tkw a() {
        tkw tkwVar = new tkw();
        tkwVar.b(-1.0d);
        tkwVar.c(-1.0d);
        tkwVar.f(-1.0d);
        tkwVar.k(-1.0d);
        tkwVar.e(-1.0d);
        tkwVar.h(-1.0d);
        tkwVar.j(-1.0d);
        tkwVar.d(-1.0d);
        tkwVar.g(-1.0d);
        tkwVar.i(amuk.v(0L, 0L, 0L, 0L, 0L));
        return tkwVar;
    }

    public final Double[] b() {
        return g(this.g, this.a, this.f);
    }

    public final Double[] c() {
        return g(this.k, this.c, this.j);
    }

    public final Double[] d() {
        return g(this.i, this.b, this.h);
    }

    public final Integer[] e() {
        Rect rect = this.m;
        if (rect != null) {
            return new Integer[]{Integer.valueOf(rect.top), Integer.valueOf(rect.left), Integer.valueOf(rect.bottom), Integer.valueOf(rect.right)};
        }
        return null;
    }

    public final boolean equals(Object obj) {
        Rect rect;
        Rect rect2;
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tkx) {
            tkx tkxVar = (tkx) obj;
            if (Double.doubleToLongBits(this.a) == Double.doubleToLongBits(tkxVar.a) && Double.doubleToLongBits(this.f) == Double.doubleToLongBits(tkxVar.f) && Double.doubleToLongBits(this.g) == Double.doubleToLongBits(tkxVar.g) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(tkxVar.b) && Double.doubleToLongBits(this.h) == Double.doubleToLongBits(tkxVar.h) && Double.doubleToLongBits(this.i) == Double.doubleToLongBits(tkxVar.i) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(tkxVar.c) && Double.doubleToLongBits(this.j) == Double.doubleToLongBits(tkxVar.j) && Double.doubleToLongBits(this.k) == Double.doubleToLongBits(tkxVar.k) && ((rect = this.l) != null ? rect.equals(tkxVar.l) : tkxVar.l == null) && ((rect2 = this.m) != null ? rect2.equals(tkxVar.m) : tkxVar.m == null) && ((num = this.d) != null ? num.equals(tkxVar.d) : tkxVar.d == null) && amxp.v(this.e, tkxVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final Integer[] f() {
        Rect rect = this.l;
        return rect != null ? new Integer[]{Integer.valueOf(rect.top), Integer.valueOf(rect.left), Integer.valueOf(rect.bottom), Integer.valueOf(rect.right)} : new Integer[]{0, 0, 0, 0};
    }

    public final int hashCode() {
        int doubleToLongBits = (((((((((((((((((((int) ((Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f) >>> 32) ^ Double.doubleToLongBits(this.f)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.g) >>> 32) ^ Double.doubleToLongBits(this.g)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.h) >>> 32) ^ Double.doubleToLongBits(this.h)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.i) >>> 32) ^ Double.doubleToLongBits(this.i)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.c) >>> 32) ^ Double.doubleToLongBits(this.c)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.j) >>> 32) ^ Double.doubleToLongBits(this.j)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.k) >>> 32) ^ Double.doubleToLongBits(this.k)))) * 1000003;
        Rect rect = this.l;
        int i = 0;
        int hashCode = (doubleToLongBits ^ (rect == null ? 0 : rect.hashCode())) * 1000003;
        Rect rect2 = this.m;
        int hashCode2 = (hashCode ^ (rect2 == null ? 0 : rect2.hashCode())) * 1000003;
        Integer num = this.d;
        if (num != null) {
            i = num.hashCode();
        }
        return this.e.hashCode() ^ ((hashCode2 ^ i) * 1000003);
    }

    public final String toString() {
        double d = this.a;
        double d2 = this.f;
        double d3 = this.g;
        double d4 = this.b;
        double d5 = this.h;
        double d6 = this.i;
        double d7 = this.c;
        double d8 = this.j;
        double d9 = this.k;
        String valueOf = String.valueOf(this.l);
        String valueOf2 = String.valueOf(this.m);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 418 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("QuartileSnapshot{exposure=");
        sb.append(d);
        sb.append(", maxExposure=");
        sb.append(d2);
        sb.append(", minExposure=");
        sb.append(d3);
        sb.append(", volume=");
        sb.append(d4);
        sb.append(", maxVolume=");
        sb.append(d5);
        sb.append(", minVolume=");
        sb.append(d6);
        sb.append(", screenShare=");
        sb.append(d7);
        sb.append(", maxScreenShare=");
        sb.append(d8);
        sb.append(", minScreenShare=");
        sb.append(d9);
        sb.append(", position=");
        sb.append(valueOf);
        sb.append(", containerPosition=");
        sb.append(valueOf2);
        sb.append(", instantaneousState=");
        sb.append(valueOf3);
        sb.append(", mtosBuckets=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }

    private static Double[] g(double d, double d2, double d3) {
        return (d == d2 && d3 == d2) ? new Double[]{Double.valueOf(d2)} : new Double[]{Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3)};
    }
}
