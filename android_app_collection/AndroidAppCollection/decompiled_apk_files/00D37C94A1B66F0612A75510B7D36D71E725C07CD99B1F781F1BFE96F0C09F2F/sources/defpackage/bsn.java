package defpackage;
/* compiled from: PG */
/* renamed from: bsn  reason: default package */
/* loaded from: classes2.dex */
public final class bsn {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public bsn(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsn)) {
            return false;
        }
        bsn bsnVar = (bsn) obj;
        return this.a == bsnVar.a && this.b == bsnVar.b && this.c == bsnVar.c && this.d == bsnVar.d;
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
