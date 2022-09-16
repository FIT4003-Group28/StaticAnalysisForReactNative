package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dfrj  reason: default package */
/* loaded from: classes6.dex */
public final class dfrj extends dfrt {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public dfrj(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.dfrt
    public final float a() {
        return this.a;
    }

    @Override // defpackage.dfrt
    public final float b() {
        return this.b;
    }

    @Override // defpackage.dfrt
    public final float c() {
        return this.c;
    }

    @Override // defpackage.dfrt
    public final float d() {
        return this.d;
    }

    @Override // defpackage.dfrt
    public final dfrs e() {
        return new dfri(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dfrt) {
            dfrt dfrtVar = (dfrt) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(dfrtVar.a()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(dfrtVar.b()) && Float.floatToIntBits(this.c) == Float.floatToIntBits(dfrtVar.c()) && Float.floatToIntBits(this.d) == Float.floatToIntBits(dfrtVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ Float.floatToIntBits(this.d);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder sb = new StringBuilder(132);
        sb.append("CameraViewportBounds{heading=");
        sb.append(f);
        sb.append(", headingHalfRange=");
        sb.append(f2);
        sb.append(", tilt=");
        sb.append(f3);
        sb.append(", tiltHalfRange=");
        sb.append(f4);
        sb.append("}");
        return sb.toString();
    }
}
