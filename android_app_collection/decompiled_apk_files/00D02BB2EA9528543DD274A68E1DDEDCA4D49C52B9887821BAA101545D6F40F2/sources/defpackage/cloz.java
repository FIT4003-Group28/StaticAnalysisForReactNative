package defpackage;
/* compiled from: PG */
/* renamed from: cloz  reason: default package */
/* loaded from: classes5.dex */
public final class cloz {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public cmft f = cmft.a;

    public final long a() {
        return cllt.a(this.e);
    }

    public final long b(int i) {
        return this.f.c[i];
    }

    public final int c(int i) {
        int[] iArr = this.f.d[i].c;
        return 0;
    }

    public final int e(long j) {
        int length;
        cmft cmftVar = this.f;
        long j2 = this.d;
        if (j != Long.MIN_VALUE) {
            int i = 0;
            if (j2 != -9223372036854775807L && j >= j2) {
                return -1;
            }
            while (true) {
                long[] jArr = cmftVar.c;
                length = jArr.length;
                if (i >= length) {
                    break;
                }
                long j3 = jArr[i];
                if (j3 == Long.MIN_VALUE) {
                    break;
                } else if (j < j3) {
                    cmfs cmfsVar = cmftVar.d[i];
                    break;
                } else {
                    i++;
                }
            }
            if (i >= length) {
                return -1;
            }
            return i;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            cloz clozVar = (cloz) obj;
            if (cmny.b(this.a, clozVar.a) && cmny.b(this.b, clozVar.b) && this.c == clozVar.c && this.d == clozVar.d && this.e == clozVar.e && cmny.b(this.f, clozVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i) {
        int i2 = this.f.d[i].a;
    }

    public final void g() {
        long j = this.f.e;
    }

    public final void h(int i) {
        int i2 = this.f.d[i].a;
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        int i2 = this.c;
        long j = this.d;
        long j2 = this.e;
        return ((((((((hashCode + i) * 31) + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.f.hashCode();
    }

    public final void i(Object obj, Object obj2, long j, long j2) {
        cmft cmftVar = cmft.a;
        this.a = obj;
        this.b = obj2;
        this.c = 0;
        this.d = j;
        this.e = j2;
        this.f = cmftVar;
    }

    public final int d(long j) {
        cmft cmftVar = this.f;
        long j2 = this.d;
        int length = cmftVar.c.length - 1;
        while (length >= 0 && j != Long.MIN_VALUE) {
            long j3 = cmftVar.c[length];
            if (j3 != Long.MIN_VALUE) {
                if (j >= j3) {
                    break;
                }
                length--;
            } else {
                if (j2 != -9223372036854775807L && j >= j2) {
                    break;
                }
                length--;
            }
        }
        if (length >= 0) {
            cmfs cmfsVar = cmftVar.d[length];
            return length;
        }
        return -1;
    }
}
