package defpackage;

import com.facebook.yoga.YogaUnit;
/* compiled from: PG */
/* renamed from: dnc  reason: default package */
/* loaded from: classes3.dex */
public final class dnc {
    public final float a;
    public final YogaUnit b;

    static {
        new dnc(Float.NaN, YogaUnit.UNDEFINED);
        new dnc(0.0f, YogaUnit.POINT);
        new dnc(Float.NaN, YogaUnit.AUTO);
    }

    public dnc(float f, YogaUnit yogaUnit) {
        this.a = f;
        this.b = yogaUnit;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dnc) {
            dnc dncVar = (dnc) obj;
            YogaUnit yogaUnit = this.b;
            if (yogaUnit == dncVar.b) {
                return yogaUnit == YogaUnit.UNDEFINED || this.b == YogaUnit.AUTO || Float.compare(this.a, dncVar.a) == 0;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a) + this.b.e;
    }

    public final String toString() {
        YogaUnit yogaUnit = YogaUnit.UNDEFINED;
        int ordinal = this.b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return Float.toString(this.a);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new IllegalStateException();
                }
                return "auto";
            }
            float f = this.a;
            StringBuilder sb = new StringBuilder(16);
            sb.append(f);
            sb.append("%");
            return sb.toString();
        }
        return "undefined";
    }
}
