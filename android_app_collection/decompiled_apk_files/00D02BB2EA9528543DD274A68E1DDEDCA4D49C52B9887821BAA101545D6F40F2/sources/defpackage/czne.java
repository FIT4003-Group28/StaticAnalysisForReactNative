package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: czne  reason: default package */
/* loaded from: classes5.dex */
final class czne implements czmx<Double> {
    int b = 0;
    double[] a = new double[5];

    @Override // defpackage.czmx
    public final dfed a() {
        dfdu bZ = dfdx.b.bZ();
        for (int i = 0; i < this.b; i++) {
            dfdv bZ2 = dfdw.d.bZ();
            double d = this.a[i];
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dfdw dfdwVar = (dfdw) bZ2.b;
            int i2 = dfdwVar.a | 1;
            dfdwVar.a = i2;
            dfdwVar.b = d;
            dfdwVar.a = i2 | 2;
            dfdwVar.c = 1L;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfdx dfdxVar = (dfdx) bZ.b;
            dfdw bK = bZ2.bK();
            bK.getClass();
            dsrj<dfdw> dsrjVar = dfdxVar.a;
            if (!dsrjVar.a()) {
                dfdxVar.a = dsqw.cl(dsrjVar);
            }
            dfdxVar.a.add(bK);
        }
        dfec bZ3 = dfed.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dfed dfedVar = (dfed) bZ3.b;
        dfdx bK2 = bZ.bK();
        bK2.getClass();
        dfedVar.b = bK2;
        dfedVar.a = 3;
        return bZ3.bK();
    }

    @Override // defpackage.czmx
    public final /* bridge */ /* synthetic */ void b(Double d) {
        Double d2 = d;
        int i = this.b + 1;
        double[] dArr = this.a;
        int length = dArr.length;
        if (i - length > 0) {
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if ((-2147483639) + i2 > 0) {
                if (i < 0) {
                    throw new OutOfMemoryError();
                }
                i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.a = Arrays.copyOf(dArr, i2);
        }
        this.a[this.b] = d2.doubleValue();
        this.b++;
    }

    public final String toString() {
        return ", count = " + this.b + ", value =" + Arrays.toString(this.a);
    }
}
