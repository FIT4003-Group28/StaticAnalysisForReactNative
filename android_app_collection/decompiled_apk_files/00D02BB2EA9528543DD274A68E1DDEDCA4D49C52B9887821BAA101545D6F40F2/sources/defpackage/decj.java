package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: decj  reason: default package */
/* loaded from: classes.dex */
public final class decj implements Serializable {
    public static final decj a = new decj(new int[0]);
    public final int b;
    private final int[] c;

    private decj(int[] iArr) {
        this(iArr, iArr.length);
    }

    public decj(int[] iArr, int i) {
        this.c = iArr;
        this.b = i;
    }

    public static decj a(int i) {
        return new decj(new int[]{i});
    }

    public static decj b(Collection<Integer> collection) {
        return collection.isEmpty() ? a : new decj(decl.l(collection));
    }

    public static deci c(int i) {
        dbsk.e(i >= 0, "Invalid initialCapacity: %s", i);
        return new deci(i);
    }

    public static deci d() {
        return new deci(10);
    }

    public static decj h(int... iArr) {
        int length = iArr.length;
        dbsk.b(length <= 2147483646, "the total number of elements must fit in an int");
        int[] iArr2 = new int[length + 1];
        iArr2[0] = 0;
        System.arraycopy(iArr, 0, iArr2, 1, length);
        return new decj(iArr2);
    }

    public final boolean e() {
        return this.b == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof decj)) {
            return false;
        }
        decj decjVar = (decj) obj;
        if (this.b != decjVar.b) {
            return false;
        }
        for (int i = 0; i < this.b; i++) {
            if (f(i) != decjVar.f(i)) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i) {
        dbsk.z(i, this.b);
        return this.c[i];
    }

    public final int[] g() {
        return Arrays.copyOfRange(this.c, 0, this.b);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    Object readResolve() {
        return e() ? a : this;
    }

    public final String toString() {
        if (e()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(this.b * 5);
        sb.append('[');
        sb.append(this.c[0]);
        for (int i = 1; i < this.b; i++) {
            sb.append(", ");
            sb.append(this.c[i]);
        }
        sb.append(']');
        return sb.toString();
    }

    Object writeReplace() {
        return this.b < this.c.length ? new decj(g()) : this;
    }
}
