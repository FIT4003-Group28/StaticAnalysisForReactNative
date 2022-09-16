package defpackage;
/* compiled from: PG */
/* renamed from: amhb  reason: default package */
/* loaded from: classes2.dex */
enum amhb {
    SECONDARY_FIRST,
    TRAILING_EDGE_ALIGNED,
    CENTERED,
    LEADING_EDGE_ALIGNED,
    PRIMARY_FIRST;
    
    private static final dcqe f = dcqe.c("amhb");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amhb c(dmpm dmpmVar) {
        switch (dmpmVar.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 11:
                return SECONDARY_FIRST;
            case 1:
            case 12:
                return TRAILING_EDGE_ALIGNED;
            case 2:
            case 13:
                return CENTERED;
            case 3:
            case 14:
                return LEADING_EDGE_ALIGNED;
            case 4:
            case 8:
            case 9:
            case 10:
            case 15:
                return PRIMARY_FIRST;
            default:
                bvoo.h("Saw TiePointPosition encountered that isn't handled. Saw %s. Defaulting to a horizontal alignment of PRIMARY_FIRST.", dmpmVar);
                return PRIMARY_FIRST;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amhb d(dmpm dmpmVar) {
        switch (dmpmVar.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return SECONDARY_FIRST;
            case 5:
            case 8:
                return LEADING_EDGE_ALIGNED;
            case 6:
            case 9:
                return CENTERED;
            case 7:
            case 10:
                return TRAILING_EDGE_ALIGNED;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return PRIMARY_FIRST;
            default:
                bvoo.h("Saw TiePointPosition encountered that isn't handled. Saw %s. Defaulting to a vertical alignment of CENTERED.", dmpmVar);
                return CENTERED;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float a(float f2, float f3) {
        float f4;
        float max = Math.max(f2, f3);
        dmpm dmpmVar = dmpm.BOTTOM_RIGHT_TO_TOP_LEFT;
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return (max - f2) / 2.0f;
            }
            if (ordinal == 2) {
                return 0.0f;
            }
            if (ordinal != 3) {
                if (ordinal != 4) {
                    bvoo.h("Unsupported callout label alignment alignment: %s", this);
                }
                f4 = -f3;
            } else {
                f4 = f2 - max;
            }
            return f4 / 2.0f;
        }
        return f3 / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float b(float f2, float f3) {
        float max = Math.max(f2, f3);
        dmpm dmpmVar = dmpm.BOTTOM_RIGHT_TO_TOP_LEFT;
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return (max - f3) / 2.0f;
            }
            if (ordinal == 2) {
                return 0.0f;
            }
            if (ordinal == 3) {
                return (f3 - max) / 2.0f;
            }
            if (ordinal == 4) {
                return f2 / 2.0f;
            }
            bvoo.h("Unsupported callout label alignment alignment: %s", this);
            return 0.0f;
        }
        return (-f2) / 2.0f;
    }
}
