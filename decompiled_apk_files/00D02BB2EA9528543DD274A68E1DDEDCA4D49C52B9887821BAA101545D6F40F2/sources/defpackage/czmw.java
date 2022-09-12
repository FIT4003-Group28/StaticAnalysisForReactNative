package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: czmw  reason: default package */
/* loaded from: classes5.dex */
final class czmw {
    static final Object[] a;
    public final Object[] b;
    private final int c;

    static {
        Object[] objArr = new Object[0];
        a = objArr;
        new czmw(objArr);
    }

    public czmw(Object... objArr) {
        this.b = objArr;
        this.c = Arrays.hashCode(objArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof czmw) {
            czmw czmwVar = (czmw) obj;
            return this.c == czmwVar.c && Arrays.equals(this.b, czmwVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return Arrays.toString(this.b);
    }
}
