package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cqsq  reason: default package */
/* loaded from: classes.dex */
final class cqsq {
    private final cqss[] a;
    private final int[][] b;

    public cqsq(int[][] iArr, cqss[] cqssVarArr) {
        this.a = cqssVarArr;
        this.b = iArr;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            cqsq cqsqVar = (cqsq) obj;
            if (Arrays.deepEquals(this.b, cqsqVar.b) && Arrays.equals(this.a, cqsqVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.deepHashCode(this.b) * 31) + Arrays.hashCode(this.a);
    }
}
