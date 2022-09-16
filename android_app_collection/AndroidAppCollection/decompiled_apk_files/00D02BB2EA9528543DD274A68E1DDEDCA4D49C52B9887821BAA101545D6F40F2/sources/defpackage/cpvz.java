package defpackage;

import java.util.ArrayList;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: cpvz  reason: default package */
/* loaded from: classes5.dex */
public final class cpvz {
    public static <D extends Number, M extends Number> cpvn a(String str, D[] dArr, M[] mArr) {
        int length = mArr.length;
        cpwl.e(dArr.length == length, "domains and measures must be the same length");
        Double[] dArr2 = new Double[length];
        for (int i = 0; i < mArr.length; i++) {
            dArr2[i] = (Double) mArr[i];
        }
        int length2 = dArr.length;
        Double[] dArr3 = new Double[length2];
        Double valueOf = Double.valueOf(Double.NEGATIVE_INFINITY);
        int i2 = 0;
        boolean z = true;
        while (i2 < dArr.length) {
            Double valueOf2 = Double.valueOf(dArr[i2].doubleValue());
            dArr3[i2] = valueOf2;
            z &= valueOf2.doubleValue() > valueOf.doubleValue();
            i2++;
            valueOf = valueOf2;
        }
        if (!z) {
            ArrayList b = cpwi.b(length2);
            for (int i3 = 0; i3 < length2; i3++) {
                b.add(new cpvy(dArr3[i3], dArr2[i3]));
            }
            cpvn cpvnVar = new cpvn(str, b);
            cpvm.c(cpvnVar);
            Collections.sort(cpvnVar.e, new cpvx(cpvnVar.d(cpvf.c)));
            return cpvnVar;
        }
        cpvn cpvnVar2 = new cpvn(str, new cpvu(new cpvw(dArr2, dArr3), length2));
        cpvm.c(cpvnVar2);
        return cpvnVar2;
    }
}
