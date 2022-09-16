package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dfrl  reason: default package */
/* loaded from: classes6.dex */
public final class dfrl extends dfrz {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public dfrl(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.dfrz
    public final float a() {
        return this.a;
    }

    @Override // defpackage.dfrz
    public final float b() {
        return this.b;
    }

    @Override // defpackage.dfrz
    public final float c() {
        return this.c;
    }

    @Override // defpackage.dfrz
    public final float d() {
        return this.d;
    }

    @Override // defpackage.dfrz
    public final dfry e() {
        return new dfrk(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dfrz) {
            dfrz dfrzVar = (dfrz) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(dfrzVar.a()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(dfrzVar.b()) && Float.floatToIntBits(this.c) == Float.floatToIntBits(dfrzVar.c()) && Float.floatToIntBits(this.d) == Float.floatToIntBits(dfrzVar.d())) {
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
        StringBuilder sb = new StringBuilder(104);
        sb.append("PhotoMetadata{heading=");
        sb.append(f);
        sb.append(", tilt=");
        sb.append(f2);
        sb.append(", fovX=");
        sb.append(f3);
        sb.append(", fovY=");
        sb.append(f4);
        sb.append("}");
        return sb.toString();
    }
}
