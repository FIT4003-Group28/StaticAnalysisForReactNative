package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcff  reason: default package */
/* loaded from: classes5.dex */
final class dcff implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object[] a;
    private final Object[] b;
    private final Object[] c;
    private final int[] d;
    private final int[] e;

    private dcff(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = objArr3;
        this.d = iArr;
        this.e = iArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcff a(dcfg<?, ?, ?> dcfgVar, int[] iArr, int[] iArr2) {
        return new dcff(dcfgVar.u().toArray(), dcfgVar.t().toArray(), dcfgVar.s().toArray(), iArr, iArr2);
    }

    Object readResolve() {
        Object[] objArr = this.c;
        int length = objArr.length;
        if (length == 0) {
            return dcnt.b;
        }
        int i = 0;
        if (length == 1) {
            return new dcno(this.a[0], this.b[0], objArr[0]);
        }
        dccx dccxVar = new dccx(length);
        while (true) {
            Object[] objArr2 = this.c;
            if (i < objArr2.length) {
                dccxVar.g(dcfg.q(this.a[this.d[i]], this.b[this.e[i]], objArr2[i]));
                i++;
            } else {
                return dcmv.v(dccxVar.f(), dcep.M(this.a), dcep.M(this.b));
            }
        }
    }
}
