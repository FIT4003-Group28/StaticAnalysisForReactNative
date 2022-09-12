package defpackage;
/* compiled from: PG */
/* renamed from: clsb  reason: default package */
/* loaded from: classes5.dex */
public final class clsb {
    public final int a = 0;
    public final float b = 0.0f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            clsb clsbVar = (clsb) obj;
            if (Float.compare(0.0f, 0.0f) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + 16337;
    }
}
