package defpackage;
/* compiled from: PG */
/* renamed from: clck  reason: default package */
/* loaded from: classes5.dex */
public final class clck {
    public final float a;
    public final int b;
    public final int c;
    public final boolean d;

    public clck(float f, int i, int i2, boolean z) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            clck clckVar = (clck) obj;
            if (this.b == clckVar.b && this.c == clckVar.c && this.d == clckVar.d && Float.floatToIntBits(this.a) == Float.floatToIntBits(clckVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b + 31) * 31) + this.c) * 31) + (true != this.d ? 1237 : 1231)) * 31) + Float.floatToIntBits(this.a);
    }

    public final String toString() {
        String valueOf = String.valueOf(String.format("Position: zoom: %.2f; scroll: %d, %d; ", Float.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)));
        String str = true != this.d ? "(transient)" : "(stable)";
        return str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }
}
