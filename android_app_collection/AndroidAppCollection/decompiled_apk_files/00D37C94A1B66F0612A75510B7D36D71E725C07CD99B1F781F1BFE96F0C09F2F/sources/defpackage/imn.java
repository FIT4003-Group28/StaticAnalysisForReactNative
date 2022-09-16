package defpackage;
/* compiled from: PG */
/* renamed from: imn  reason: default package */
/* loaded from: classes3.dex */
public final class imn implements imj {
    public final float a;
    public final int b;
    public final int c;
    public final int d;

    public imn() {
    }

    public imn(float f, int i, int i2, int i3) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public static imn a(float f, int i, int i2, int i3) {
        return new imn(f, i, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof imn) {
            imn imnVar = (imn) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(imnVar.a) && this.b == imnVar.b && this.c == imnVar.c && this.d == imnVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        float f = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        StringBuilder sb = new StringBuilder(127);
        sb.append("ProgressState{progress=");
        sb.append(f);
        sb.append(", uploadsInProgress=");
        sb.append(i);
        sb.append(", uploadsCompleted=");
        sb.append(i2);
        sb.append(", uploadsFailed=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
