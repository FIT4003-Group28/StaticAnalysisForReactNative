package defpackage;
/* compiled from: PG */
/* renamed from: cuou  reason: default package */
/* loaded from: classes5.dex */
final class cuou extends cups {
    private final int a;
    private final float b;

    public cuou(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.cups
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cups
    public final float b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cups) {
            cups cupsVar = (cups) obj;
            if (this.a == cupsVar.a() && Float.floatToIntBits(this.b) == Float.floatToIntBits(cupsVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b);
    }

    public final String toString() {
        int i = this.a;
        float f = this.b;
        StringBuilder sb = new StringBuilder(64);
        sb.append("HorizontalLine{lineColor=");
        sb.append(i);
        sb.append(", lineWidth=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
