package defpackage;
/* compiled from: PG */
/* renamed from: aydc  reason: default package */
/* loaded from: classes2.dex */
public final class aydc {
    public static volatile ayqe a;
    public static volatile ayqe b;

    private aydc() {
    }

    public static final azqy a(azqy azqyVar) {
        return ((azri) azqyVar).intercepted();
    }

    public static Object b(azra azraVar, Object obj, azsg azsgVar) {
        return azsgVar.invoke(obj, azraVar);
    }

    public static azra c(azra azraVar, azrb azrbVar) {
        azrbVar.getClass();
        if (azst.c(azraVar.getKey(), azrbVar)) {
            if (azraVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type E");
            }
            return azraVar;
        }
        return null;
    }

    public static azrd d(azra azraVar, azrb azrbVar) {
        azrbVar.getClass();
        return azst.c(azraVar.getKey(), azrbVar) ? azre.a : azraVar;
    }

    public static azrd e(azra azraVar, azrd azrdVar) {
        azrdVar.getClass();
        return aydb.b(azraVar, azrdVar);
    }
}
