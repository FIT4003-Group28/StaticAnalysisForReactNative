package defpackage;
/* compiled from: PG */
/* renamed from: nma  reason: default package */
/* loaded from: classes7.dex */
public final class nma {
    private static final dcqe a = dcqe.c("nma");

    public static int a(@dzsi dpjs dpjsVar, boolean z) {
        if (!z) {
            if (dpjsVar == null) {
                return 6;
            }
            int ordinal = dpjsVar.ordinal();
            if (ordinal == 1) {
                return 4;
            }
            return ordinal != 2 ? 6 : 5;
        } else if (dpjsVar == null) {
            bvoo.h("Offline suggestions should be home or work.", new Object[0]);
            return 1;
        } else {
            int ordinal2 = dpjsVar.ordinal();
            if (ordinal2 == 1) {
                return 2;
            }
            if (ordinal2 == 2) {
                return 3;
            }
            bvoo.h("Offline suggestions should be home or work.", new Object[0]);
            return 1;
        }
    }
}
