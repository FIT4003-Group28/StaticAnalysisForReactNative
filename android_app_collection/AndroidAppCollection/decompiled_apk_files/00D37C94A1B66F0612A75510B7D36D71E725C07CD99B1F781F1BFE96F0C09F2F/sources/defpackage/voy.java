package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: voy  reason: default package */
/* loaded from: classes4.dex */
final class voy {
    static final Object[] a;
    static final voy b;
    public final Object[] c;
    private final int d;

    static {
        Object[] objArr = new Object[0];
        a = objArr;
        b = new voy(objArr);
    }

    public voy(Object... objArr) {
        this.c = objArr;
        this.d = Arrays.hashCode(objArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof voy) {
            voy voyVar = (voy) obj;
            return this.d == voyVar.d && Arrays.equals(this.c, voyVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return Arrays.toString(this.c);
    }
}
