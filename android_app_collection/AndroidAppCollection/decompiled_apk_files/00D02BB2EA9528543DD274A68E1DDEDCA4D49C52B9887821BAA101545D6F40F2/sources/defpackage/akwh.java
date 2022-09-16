package defpackage;
/* compiled from: PG */
/* renamed from: akwh  reason: default package */
/* loaded from: classes.dex */
public final class akwh extends akwp {
    private final float a;
    private final boolean b;

    public akwh(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // defpackage.akwp
    public final float a() {
        return this.a;
    }

    @Override // defpackage.akwp
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akwp) {
            akwp akwpVar = (akwp) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(akwpVar.a()) && this.b == akwpVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        float f = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(87);
        sb.append("CameraConfigSettings{maxCameraTilt=");
        sb.append(f);
        sb.append(", animateCameraPositionEnabled=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
