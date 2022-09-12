package defpackage;
/* compiled from: PG */
/* renamed from: amhs  reason: default package */
/* loaded from: classes.dex */
public enum amhs {
    AT_CENTER,
    ABOVE_CENTER,
    RIGHT_OF_CENTER,
    BELOW_CENTER,
    LEFT_OF_CENTER,
    BOTTOM_RIGHT,
    BOTTOM_LEFT,
    TOP_RIGHT,
    TOP_LEFT;

    public static amhs a(int i) {
        switch (i) {
            case 5:
                return AT_CENTER;
            case 6:
                return LEFT_OF_CENTER;
            case 7:
                return RIGHT_OF_CENTER;
            case 8:
            case 12:
            default:
                throw new IllegalArgumentException("Unknown position");
            case 9:
                return ABOVE_CENTER;
            case 10:
                return TOP_LEFT;
            case 11:
                return TOP_RIGHT;
            case 13:
                return BELOW_CENTER;
            case 14:
                return BOTTOM_LEFT;
            case 15:
                return BOTTOM_RIGHT;
        }
    }
}
