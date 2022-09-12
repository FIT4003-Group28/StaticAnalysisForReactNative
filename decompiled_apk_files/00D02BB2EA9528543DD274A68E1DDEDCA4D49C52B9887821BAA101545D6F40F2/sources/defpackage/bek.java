package defpackage;
/* compiled from: PG */
/* renamed from: bek  reason: default package */
/* loaded from: classes3.dex */
public final class bek {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public bek(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bek)) {
            return false;
        }
        bek bekVar = (bek) obj;
        return this.a == bekVar.a && this.b == bekVar.b && this.c == bekVar.c && this.d == bekVar.d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final int hashCode() {
        ?? r0 = this.a;
        int i = r0;
        if (this.b) {
            i = r0 + 16;
        }
        int i2 = i;
        if (this.c) {
            i2 = i + 256;
        }
        return this.d ? i2 + 4096 : i2;
    }

    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d));
    }
}
