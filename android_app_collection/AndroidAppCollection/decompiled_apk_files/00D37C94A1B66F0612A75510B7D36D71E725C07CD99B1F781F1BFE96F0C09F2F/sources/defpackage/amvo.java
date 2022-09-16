package defpackage;

import java.util.Arrays;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: amvo  reason: default package */
/* loaded from: classes.dex */
public final class amvo {
    public static final amvq a(Comparator comparator, amvl amvlVar) {
        amyh amyhVar;
        Object[] objArr = amvlVar.a;
        int i = amvlVar.b;
        if (i == 0) {
            amyhVar = amvq.F(comparator);
        } else {
            amxp.d(objArr, i);
            Arrays.sort(objArr, 0, i, comparator);
            int i2 = 1;
            for (int i3 = 1; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                    objArr[i2] = obj;
                    i2++;
                }
            }
            Arrays.fill(objArr, i2, i, (Object) null);
            if (i2 < (objArr.length >> 1)) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            amyhVar = new amyh(amuk.j(objArr, i2), comparator);
        }
        amvlVar.b = amyhVar.size();
        amvlVar.c = true;
        return amyhVar;
    }

    public static final void b(Object[] objArr, amvl amvlVar) {
        amvlVar.i(objArr);
    }
}
