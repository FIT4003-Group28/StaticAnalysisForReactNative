package defpackage;
/* compiled from: PG */
/* renamed from: dkuo  reason: default package */
/* loaded from: classes.dex */
public enum dkuo implements dsrb {
    UNKNOWN_BUTTON_STYLE(0),
    ICON_24(1),
    ICON_26(2),
    ICON_28(3),
    TEXT(4),
    ICON_AND_TEXT(5),
    PILL_HIGHLIGHT(6);
    
    public final int h;

    dkuo(int i2) {
        this.h = i2;
    }

    public static dkuo b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_BUTTON_STYLE;
            case 1:
                return ICON_24;
            case 2:
                return ICON_26;
            case 3:
                return ICON_28;
            case 4:
                return TEXT;
            case 5:
                return ICON_AND_TEXT;
            case 6:
                return PILL_HIGHLIGHT;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dkun.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
