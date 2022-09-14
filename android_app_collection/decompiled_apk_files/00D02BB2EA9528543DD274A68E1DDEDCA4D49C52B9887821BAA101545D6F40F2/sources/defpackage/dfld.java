package defpackage;
/* compiled from: PG */
/* renamed from: dfld  reason: default package */
/* loaded from: classes6.dex */
final class dfld extends dfle {
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;
    private final double g;
    private final double h;
    private final double i;
    private final int j;

    public dfld(int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.j = i;
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = d7;
        this.h = d8;
        this.i = d9;
    }

    @Override // defpackage.dfle
    public final double a() {
        return this.a;
    }

    @Override // defpackage.dfle
    public final double b() {
        return this.b;
    }

    @Override // defpackage.dfle
    public final double c() {
        return this.c;
    }

    @Override // defpackage.dfle
    public final double d() {
        return this.d;
    }

    @Override // defpackage.dfle
    public final double e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dfle) {
            dfle dfleVar = (dfle) obj;
            if (this.j == dfleVar.j() && Double.doubleToLongBits(this.a) == Double.doubleToLongBits(dfleVar.a()) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(dfleVar.b()) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(dfleVar.c()) && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(dfleVar.d()) && Double.doubleToLongBits(this.e) == Double.doubleToLongBits(dfleVar.e()) && Double.doubleToLongBits(this.f) == Double.doubleToLongBits(dfleVar.f()) && Double.doubleToLongBits(this.g) == Double.doubleToLongBits(dfleVar.g()) && Double.doubleToLongBits(this.h) == Double.doubleToLongBits(dfleVar.h()) && Double.doubleToLongBits(this.i) == Double.doubleToLongBits(dfleVar.i())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dfle
    public final double f() {
        return this.f;
    }

    @Override // defpackage.dfle
    public final double g() {
        return this.g;
    }

    @Override // defpackage.dfle
    public final double h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.j ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.c) >>> 32) ^ Double.doubleToLongBits(this.c)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.d) >>> 32) ^ Double.doubleToLongBits(this.d)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.e) >>> 32) ^ Double.doubleToLongBits(this.e)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f) >>> 32) ^ Double.doubleToLongBits(this.f)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.g) >>> 32) ^ Double.doubleToLongBits(this.g)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.h) >>> 32) ^ Double.doubleToLongBits(this.h)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.i) >>> 32) ^ Double.doubleToLongBits(this.i)));
    }

    @Override // defpackage.dfle
    public final double i() {
        return this.i;
    }

    @Override // defpackage.dfle
    public final int j() {
        return this.j;
    }

    public final String toString() {
        int i = this.j;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "LEVEL_4" : "LEVEL_3" : "LEVEL_2" : "LEVEL_1" : "LEVEL_0";
        double d = this.a;
        double d2 = this.b;
        double d3 = this.c;
        double d4 = this.d;
        double d5 = this.e;
        double d6 = this.f;
        double d7 = this.g;
        double d8 = this.h;
        double d9 = this.i;
        StringBuilder sb = new StringBuilder(str.length() + 410);
        sb.append("GeoARCoreEarthPose{confidence=");
        sb.append(str);
        sb.append(", latitudeDegrees=");
        sb.append(d);
        sb.append(", longitudeDegrees=");
        sb.append(d2);
        sb.append(", altitudeMeters=");
        sb.append(d3);
        sb.append(", locationAccuracyMeters=");
        sb.append(d4);
        sb.append(", headingDegrees=");
        sb.append(d5);
        sb.append(", rollDegrees=");
        sb.append(d6);
        sb.append(", pitchDegrees=");
        sb.append(d7);
        sb.append(", yawDegrees=");
        sb.append(d8);
        sb.append(", headingAccuracyDegrees=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }
}
