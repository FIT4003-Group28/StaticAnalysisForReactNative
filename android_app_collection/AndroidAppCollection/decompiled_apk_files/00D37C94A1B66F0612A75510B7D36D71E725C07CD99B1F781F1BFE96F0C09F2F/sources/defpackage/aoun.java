package defpackage;
/* compiled from: PG */
/* renamed from: aoun  reason: default package */
/* loaded from: classes.dex */
public enum aoun implements aopm {
    UNKNOWN_COMPONENT_APPEARANCE(0),
    FULLSCREEN_COMPONENT_APPEARANCE(1),
    BOTTOM_SHEET_COMPONENT_APPEARANCE(2),
    BOTTOM_NAV_DRAWER_COMPONENT_APPEARANCE(3),
    SIDE_DRAWER_ABOVE_COMPONENT_APPEARANCE(4),
    SIDE_DRAWER_SIDE_BY_SIDE_COMPONENT_APPEARANCE(5),
    SIDE_DRAWER_SIDE_BY_SIDE_MINIMIZED_COMPONENT_APPEARANCE(6),
    BOTTOM_DRAWER_COMPONENT_APPEARANCE(7),
    POPOVER_COMPONENT_APPEARANCE(8),
    POPUP_COMPONENT_APPEARANCE(9),
    APP_SPECIFIC_COMPONENT_APPEARANCE(10),
    CLICKABLE_SNACKBAR_COMPONENT_APPEARANCE(11),
    NON_CLICKABLE_SNACKBAR_COMPONENT_APPEARANCE(12);
    
    public final int n;

    aoun(int i) {
        this.n = i;
    }

    public static aopo a() {
        return aotr.c;
    }

    public static aoun b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_COMPONENT_APPEARANCE;
            case 1:
                return FULLSCREEN_COMPONENT_APPEARANCE;
            case 2:
                return BOTTOM_SHEET_COMPONENT_APPEARANCE;
            case 3:
                return BOTTOM_NAV_DRAWER_COMPONENT_APPEARANCE;
            case 4:
                return SIDE_DRAWER_ABOVE_COMPONENT_APPEARANCE;
            case 5:
                return SIDE_DRAWER_SIDE_BY_SIDE_COMPONENT_APPEARANCE;
            case 6:
                return SIDE_DRAWER_SIDE_BY_SIDE_MINIMIZED_COMPONENT_APPEARANCE;
            case 7:
                return BOTTOM_DRAWER_COMPONENT_APPEARANCE;
            case 8:
                return POPOVER_COMPONENT_APPEARANCE;
            case 9:
                return POPUP_COMPONENT_APPEARANCE;
            case 10:
                return APP_SPECIFIC_COMPONENT_APPEARANCE;
            case 11:
                return CLICKABLE_SNACKBAR_COMPONENT_APPEARANCE;
            case 12:
                return NON_CLICKABLE_SNACKBAR_COMPONENT_APPEARANCE;
            default:
                return null;
        }
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
