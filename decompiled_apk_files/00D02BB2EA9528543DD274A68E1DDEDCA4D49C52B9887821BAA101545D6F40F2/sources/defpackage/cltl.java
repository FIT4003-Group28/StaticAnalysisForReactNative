package defpackage;
/* compiled from: PG */
/* renamed from: cltl  reason: default package */
/* loaded from: classes5.dex */
public final class cltl {
    public final int a = 0;
    public final int b;
    public final int c;

    static {
        new cltl(0, 0);
    }

    public cltl(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cltl)) {
            return false;
        }
        cltl cltlVar = (cltl) obj;
        int i = cltlVar.a;
        return this.b == cltlVar.b && this.c == cltlVar.c;
    }

    public final int hashCode() {
        return ((this.b + 16337) * 31) + this.c;
    }
}
