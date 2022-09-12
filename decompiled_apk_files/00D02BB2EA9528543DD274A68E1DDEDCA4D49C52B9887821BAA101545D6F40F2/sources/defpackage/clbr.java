package defpackage;
/* compiled from: PG */
/* renamed from: clbr  reason: default package */
/* loaded from: classes5.dex */
public final class clbr {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public clbr(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a() {
        return ((this.c - this.a) + 1) * ((this.d - this.b) + 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof clbr)) {
            return false;
        }
        clbr clbrVar = (clbr) obj;
        return this.a == clbrVar.a && this.b == clbrVar.b && this.c == clbrVar.c && this.d == clbrVar.d;
    }

    public final int hashCode() {
        return ((((((this.d + 31) * 31) + this.a) * 31) + this.c) * 31) + this.b;
    }

    public final String toString() {
        return String.format("Area [%d tiles] (%d %d - %d %d)", Integer.valueOf(a()), Integer.valueOf(this.b), Integer.valueOf(this.a), Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
