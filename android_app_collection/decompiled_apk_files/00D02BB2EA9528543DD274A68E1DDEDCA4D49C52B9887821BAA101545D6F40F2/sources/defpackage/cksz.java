package defpackage;
/* compiled from: PG */
/* renamed from: cksz  reason: default package */
/* loaded from: classes4.dex */
public final class cksz {
    public static int a(dgau dgauVar, dpdp dpdpVar) {
        dpdn dpdnVar = dpdn.SIDE_LEFT;
        int ordinal = dgauVar.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            return 2;
        }
        if (ordinal == 5) {
            switch (dpdpVar.ordinal()) {
                case 1:
                    return 3;
                case 2:
                    return 4;
                case 3:
                    return 5;
                case 4:
                case 8:
                    return 7;
                case 5:
                    return 6;
                case 6:
                    return 2;
                case 7:
                    return 8;
                default:
                    return 1;
            }
        } else if (ordinal == 29) {
            return 11;
        } else {
            switch (ordinal) {
                case 7:
                    return 6;
                case 8:
                case 9:
                    return 3;
                case 10:
                    return 7;
                case 11:
                    return 8;
                case 12:
                    return 9;
                default:
                    switch (ordinal) {
                        case 15:
                        case 16:
                        case 17:
                            return 10;
                        default:
                            return 1;
                    }
            }
        }
    }

    public static int b(dpdn dpdnVar) {
        dgau dgauVar = dgau.MANEUVER_UNKNOWN;
        dpdp dpdpVar = dpdp.TURN_UNKNOWN;
        int ordinal = dpdnVar.ordinal();
        if (ordinal != 0) {
            return ordinal != 1 ? 1 : 3;
        }
        return 2;
    }
}
