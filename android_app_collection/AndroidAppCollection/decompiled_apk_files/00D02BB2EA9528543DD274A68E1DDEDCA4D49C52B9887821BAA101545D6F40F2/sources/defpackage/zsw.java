package defpackage;
/* compiled from: PG */
/* renamed from: zsw  reason: default package */
/* loaded from: classes7.dex */
final class zsw extends zwt {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public zsw(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // defpackage.zwt
    public final int a() {
        return this.a;
    }

    @Override // defpackage.zwt
    public final int b() {
        return this.b;
    }

    @Override // defpackage.zwt
    public final int c() {
        return this.c;
    }

    @Override // defpackage.zwt
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zwt) {
            zwt zwtVar = (zwt) obj;
            if (this.a == zwtVar.a() && this.b == zwtVar.b() && this.c == zwtVar.c() && this.d == zwtVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        StringBuilder sb = new StringBuilder(143);
        sb.append("TrainGraphicsConfig{normalCarWidth=");
        sb.append(i);
        sb.append(", headCarWidth=");
        sb.append(i2);
        sb.append(", recommendedCarWidth=");
        sb.append(i3);
        sb.append(", recommendedHeadCarWidth=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
