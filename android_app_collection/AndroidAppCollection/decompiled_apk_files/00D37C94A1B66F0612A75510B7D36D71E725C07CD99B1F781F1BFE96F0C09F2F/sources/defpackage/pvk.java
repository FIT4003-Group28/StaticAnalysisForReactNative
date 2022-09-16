package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: pvk  reason: default package */
/* loaded from: classes4.dex */
public final class pvk {
    private final pvj[] a;
    private int b;

    public pvk(pvj... pvjVarArr) {
        this.a = pvjVarArr;
        int length = pvjVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.equals(this.a, ((pvk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.a) + 527;
            this.b = hashCode;
            return hashCode;
        }
        return i;
    }
}
