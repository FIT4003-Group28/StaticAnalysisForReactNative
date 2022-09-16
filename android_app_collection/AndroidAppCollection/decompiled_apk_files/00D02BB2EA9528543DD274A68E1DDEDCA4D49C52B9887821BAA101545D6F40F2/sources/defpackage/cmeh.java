package defpackage;
/* compiled from: PG */
/* renamed from: cmeh  reason: default package */
/* loaded from: classes5.dex */
public final class cmeh {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public cmeh(Object obj) {
        this(obj, -1, -1, -1L, -1);
    }

    public cmeh(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final cmeh a(Object obj) {
        return this.a.equals(obj) ? this : new cmeh(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cmeh cmehVar = (cmeh) obj;
            if (this.a.equals(cmehVar.a) && this.b == cmehVar.b && this.c == cmehVar.c && this.d == cmehVar.d && this.e == cmehVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public cmeh(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
