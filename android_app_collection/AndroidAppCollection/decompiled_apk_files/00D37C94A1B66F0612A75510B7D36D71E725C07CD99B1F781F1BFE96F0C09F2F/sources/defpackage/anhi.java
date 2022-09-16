package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: anhi  reason: default package */
/* loaded from: classes.dex */
public final class anhi implements Serializable {
    private static final anhi b = new anhi(new int[0]);
    public final int a;
    private final int[] c;

    public anhi(int[] iArr) {
        int length = iArr.length;
        this.c = iArr;
        this.a = length;
    }

    public final int a(int i) {
        aqxo.G(i, this.a);
        return this.c[i];
    }

    public final boolean b() {
        return this.a == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof anhi)) {
            return false;
        }
        anhi anhiVar = (anhi) obj;
        if (this.a != anhiVar.a) {
            return false;
        }
        for (int i = 0; i < this.a; i++) {
            if (a(i) != anhiVar.a(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.a; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    Object readResolve() {
        return b() ? b : this;
    }

    public final String toString() {
        if (b()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(this.a * 5);
        sb.append('[');
        sb.append(this.c[0]);
        for (int i = 1; i < this.a; i++) {
            sb.append(", ");
            sb.append(this.c[i]);
        }
        sb.append(']');
        return sb.toString();
    }

    Object writeReplace() {
        int i = this.a;
        int[] iArr = this.c;
        return i < iArr.length ? new anhi(Arrays.copyOfRange(iArr, 0, i)) : this;
    }
}
