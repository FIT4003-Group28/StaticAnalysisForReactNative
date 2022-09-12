package defpackage;
/* compiled from: PG */
/* renamed from: cwia  reason: default package */
/* loaded from: classes5.dex */
public final class cwia extends cwie {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public cwia(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // defpackage.cwie
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cwie
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cwie
    public final int c() {
        return this.c;
    }

    @Override // defpackage.cwie
    public final int d() {
        return this.d;
    }

    @Override // defpackage.cwie
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwie) {
            cwie cwieVar = (cwie) obj;
            if (this.a == cwieVar.a() && this.b == cwieVar.b() && this.c == cwieVar.c() && this.d == cwieVar.d() && cwieVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ 1231;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        StringBuilder sb = new StringBuilder(179);
        sb.append("ActionViewHolderAttributes{iconColor=");
        sb.append(i);
        sb.append(", actionTextColor=");
        sb.append(i2);
        sb.append(", highlightChipBackgroundColor=");
        sb.append(i3);
        sb.append(", highlightChipTextColor=");
        sb.append(i4);
        sb.append(", isEnlargedDiscs=");
        sb.append(true);
        sb.append("}");
        return sb.toString();
    }
}
