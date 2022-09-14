package com.facebook.react.uimanager.h1;
/* loaded from: classes.dex */
enum b {
    OPACITY,
    SCALE_X,
    SCALE_Y,
    SCALE_XY;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b a(String str) {
        char c2;
        switch (str.hashCode()) {
            case -1267206133:
                if (str.equals("opacity")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1910893003:
                if (str.equals("scaleXY")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 != 0) {
            if (c2 == 1) {
                return SCALE_X;
            }
            if (c2 == 2) {
                return SCALE_Y;
            }
            if (c2 == 3) {
                return SCALE_XY;
            }
            throw new IllegalArgumentException("Unsupported animated property: " + str);
        }
        return OPACITY;
    }
}
