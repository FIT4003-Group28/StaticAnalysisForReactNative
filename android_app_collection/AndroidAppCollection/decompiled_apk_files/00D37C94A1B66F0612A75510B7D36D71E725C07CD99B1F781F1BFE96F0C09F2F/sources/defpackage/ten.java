package defpackage;
/* compiled from: PG */
/* renamed from: ten  reason: default package */
/* loaded from: classes4.dex */
public final class ten {
    public final int a;
    public final float b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ten() {
    }

    public ten(int i, float f, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = f;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public static tem a() {
        tem temVar = new tem();
        temVar.a = -1;
        temVar.b(4.0f);
        temVar.b = false;
        temVar.c = false;
        temVar.c(false);
        return temVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ten) {
            ten tenVar = (ten) obj;
            if (this.a == tenVar.a && Float.floatToIntBits(this.b) == Float.floatToIntBits(tenVar.b) && this.c == tenVar.c && this.d == tenVar.d && this.e == tenVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int floatToIntBits = (((((((this.a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * (-721379959);
        if (true == this.e) {
            i = 1231;
        }
        return floatToIntBits ^ i;
    }

    public final String toString() {
        int i = this.a;
        float f = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        boolean z3 = this.e;
        StringBuilder sb = new StringBuilder("null".length() + 180);
        sb.append("RecyclerConfig{initRangeSize=");
        sb.append(i);
        sb.append(", rangeRatio=");
        sb.append(f);
        sb.append(", computeRangeOnSyncLayout=");
        sb.append(z);
        sb.append(", recyclerViewItemPrefetch=");
        sb.append(z2);
        sb.append(", layoutHandlerFactory=");
        sb.append("null");
        sb.append(", useLegacyVisible=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
