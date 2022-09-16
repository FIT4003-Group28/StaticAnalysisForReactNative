package defpackage;
/* compiled from: PG */
/* renamed from: izk  reason: default package */
/* loaded from: classes3.dex */
public final class izk {
    public final float a;

    public izk() {
    }

    public izk(float f) {
        this.a = f;
    }

    public final boolean a() {
        return this.a == 1.0f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof izk) && Float.floatToIntBits(this.a) == Float.floatToIntBits(((izk) obj).a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a) ^ 1000003;
    }

    public final String toString() {
        float f = this.a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("MdxWatchDrawerState{openRatio=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
