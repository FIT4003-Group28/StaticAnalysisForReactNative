package defpackage;
/* compiled from: PG */
/* renamed from: dhiz  reason: default package */
/* loaded from: classes6.dex */
public enum dhiz implements dsrb {
    UNKNOWN_CONTEXT(0),
    BLUE_DOT_CLICK(1),
    PLACE_PICKER_BUTTON_CLICK(2),
    GUIDE_PAGE(3),
    HIGH_CONFIDENCE_CLICK(4),
    PLACE_PAGE_NOT_HERE_CLICK(5),
    HERE_NOTIFICATION_SHOWN(6),
    DIRECTIONS_START_PAGE(7),
    PLACE_PAGE_SAVE_CURRENT_LOCATION(8);
    
    public final int j;

    dhiz(int i) {
        this.j = i;
    }

    public static dhiz b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CONTEXT;
            case 1:
                return BLUE_DOT_CLICK;
            case 2:
                return PLACE_PICKER_BUTTON_CLICK;
            case 3:
                return GUIDE_PAGE;
            case 4:
                return HIGH_CONFIDENCE_CLICK;
            case 5:
                return PLACE_PAGE_NOT_HERE_CLICK;
            case 6:
                return HERE_NOTIFICATION_SHOWN;
            case 7:
                return DIRECTIONS_START_PAGE;
            case 8:
                return PLACE_PAGE_SAVE_CURRENT_LOCATION;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dhiy.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
