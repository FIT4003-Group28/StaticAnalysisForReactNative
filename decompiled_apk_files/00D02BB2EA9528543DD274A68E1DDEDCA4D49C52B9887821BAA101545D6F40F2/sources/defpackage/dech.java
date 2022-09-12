package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dech  reason: default package */
/* loaded from: classes6.dex */
public final class dech implements Serializable {
    public static final dech a = new dech(new double[0]);
    private final double[] b;
    private final transient int c;
    private final int d;

    private dech(double[] dArr) {
        this(dArr, 0, dArr.length);
    }

    public dech(double[] dArr, int i, int i2) {
        this.b = dArr;
        this.c = i;
        this.d = i2;
    }

    public static decg a(int i) {
        dbsk.e(i >= 0, "Invalid initialCapacity: %s", i);
        return new decg(i);
    }

    public final int b() {
        return this.d - this.c;
    }

    public final boolean c() {
        return this.d == this.c;
    }

    public final double d(int i) {
        dbsk.z(i, b());
        return this.b[this.c + i];
    }

    public final double[] e() {
        return Arrays.copyOfRange(this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dech)) {
            return false;
        }
        dech dechVar = (dech) obj;
        if (b() != dechVar.b()) {
            return false;
        }
        for (int i = 0; i < b(); i++) {
            if (Double.doubleToLongBits(d(i)) != Double.doubleToLongBits(dechVar.d(i))) {
                return false;
            }
        }
        return true;
    }

    public final dech f(int i, int i2) {
        dbsk.u(i, i2, b());
        if (i == i2) {
            return a;
        }
        double[] dArr = this.b;
        int i3 = this.c;
        return new dech(dArr, i + i3, i3 + i2);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.c; i2 < this.d; i2++) {
            i = (i * 31) + decb.a(this.b[i2]);
        }
        return i;
    }

    Object readResolve() {
        return c() ? a : this;
    }

    public final String toString() {
        if (c()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(b() * 5);
        sb.append('[');
        sb.append(this.b[this.c]);
        int i = this.c;
        while (true) {
            i++;
            if (i < this.d) {
                sb.append(", ");
                sb.append(this.b[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    Object writeReplace() {
        return (this.c > 0 || this.d < this.b.length) ? new dech(e()) : this;
    }
}
