package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cmjn  reason: default package */
/* loaded from: classes5.dex */
public final class cmjn {
    public final int a;
    private final cmjm[] b;
    private int c;

    public cmjn(cmjm... cmjmVarArr) {
        this.b = cmjmVarArr;
        this.a = cmjmVarArr.length;
    }

    public final cmjm a(int i) {
        return this.b[i];
    }

    public final cmjm[] b() {
        return (cmjm[]) this.b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.equals(this.b, ((cmjn) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.b) + 527;
            this.c = hashCode;
            return hashCode;
        }
        return i;
    }
}
