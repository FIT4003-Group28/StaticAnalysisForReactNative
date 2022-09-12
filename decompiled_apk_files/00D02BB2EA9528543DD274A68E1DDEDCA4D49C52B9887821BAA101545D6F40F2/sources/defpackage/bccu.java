package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bccu  reason: default package */
/* loaded from: classes3.dex */
public class bccu {
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.dcdc<defpackage.bcdf> a(defpackage.dcdc<defpackage.bcdh> r13, @defpackage.dzsi defpackage.dcdc<defpackage.bcdf> r14) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bccu.a(dcdc, dcdc):dcdc");
    }

    private static boolean b(float f) {
        return f >= 0.999f;
    }

    private static boolean c(float f) {
        return !b(f);
    }

    private static void d(int i, List<Float> list, List<bcct> list2) {
        if (b(list.get(i).floatValue())) {
            list2.add(bcct.SINGLE);
            list2.add(bcct.DOUBLE);
        } else if (i < 2 || !b(list.get(i - 2).floatValue()) || !c(list.get(i - 1).floatValue())) {
            list2.add(bcct.TRIPLE);
        } else {
            list2.add(bcct.TRIPLE_FLIP);
        }
    }
}
