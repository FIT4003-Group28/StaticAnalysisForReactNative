package defpackage;
/* compiled from: PG */
/* renamed from: baae  reason: default package */
/* loaded from: classes3.dex */
public final class baae {
    public static drcs a(baac baacVar) {
        baab baabVar = baab.FAVORITES;
        baac baacVar2 = baac.PRIVATE;
        drcs drcsVar = drcs.UNKNOWN_SHARING_STATE;
        int ordinal = baacVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return drcs.SHARED;
            }
            if (ordinal == 2) {
                return drcs.PUBLISHED;
            }
            if (ordinal == 3) {
                return drcs.UNKNOWN_SHARING_STATE;
            }
            throw new IllegalArgumentException("Unsupported sharing state");
        }
        return drcs.PRIVATE;
    }
}
