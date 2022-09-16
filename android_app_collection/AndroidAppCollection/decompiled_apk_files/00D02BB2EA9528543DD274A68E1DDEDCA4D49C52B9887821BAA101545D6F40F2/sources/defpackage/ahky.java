package defpackage;
/* compiled from: PG */
/* renamed from: ahky  reason: default package */
/* loaded from: classes2.dex */
public final class ahky extends ahlb {
    private final float a;
    private final float b;
    private final long c;

    public ahky(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    @Override // defpackage.ahlb
    public final float a() {
        return this.a;
    }

    @Override // defpackage.ahlb
    public final float b() {
        return this.b;
    }

    @Override // defpackage.ahlb
    public final long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahlb) {
            ahlb ahlbVar = (ahlb) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(ahlbVar.a()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(ahlbVar.b()) && this.c == ahlbVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.a);
        int floatToIntBits2 = Float.floatToIntBits(this.b);
        long j = this.c;
        return ((((floatToIntBits ^ 1000003) * 1000003) ^ floatToIntBits2) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        long j = this.c;
        StringBuilder sb = new StringBuilder(129);
        sb.append("GeoArOrientationEvent{headingDegrees=");
        sb.append(f);
        sb.append(", errorDegrees=");
        sb.append(f2);
        sb.append(", relativeTimestampMillis=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
