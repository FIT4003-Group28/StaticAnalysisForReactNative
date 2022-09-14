package defpackage;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: dwk  reason: default package */
/* loaded from: classes6.dex */
final class dwk {
    private static final dcep<String> a = dcep.K(Arrays.asList("sign_TL_JNT", "sign_BL_JNT"));
    private static final dcep<String> b = dcep.K(Arrays.asList("sign_TR_JNT", "sign_BR_JNT"));
    private static final dcep<String> c = dcep.K(Arrays.asList("near_back_JNT", "near_front_JNT", "far_street_JNT", "far_distance_JNT"));

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(dvh dvhVar, dtu dtuVar, float f) {
        dtu dtuVar2;
        float f2 = f + f + 2.0f;
        float f3 = f + 1.0f;
        HashSet hashSet = new HashSet();
        hashSet.addAll(a);
        hashSet.addAll(b);
        hashSet.addAll(c);
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < dtuVar.p(); i++) {
            String q = dtuVar.q(i);
            if (hashSet.contains(q)) {
                int r = dtuVar.r(i);
                int i2 = 4;
                if (r != -1) {
                    dtuVar2 = (dtu) sparseArray.get(r);
                    if (dtuVar2 == null) {
                        dtuVar2 = dtuVar.B(dvh.e(4, f2, f3));
                        dtuVar.o(dtuVar.q(r), dtuVar2);
                        sparseArray.append(r, dtuVar2);
                    }
                } else {
                    dtuVar2 = dtuVar;
                }
                if (a.contains(q)) {
                    i2 = 1;
                } else if (b.contains(q)) {
                    i2 = 2;
                } else if (c.contains(q)) {
                    i2 = 3;
                }
                dtu B = dtuVar2.B(dvh.e(i2, f2, f3));
                sparseArray.append(i, B);
                dtuVar.o(q, B);
            }
        }
    }
}
