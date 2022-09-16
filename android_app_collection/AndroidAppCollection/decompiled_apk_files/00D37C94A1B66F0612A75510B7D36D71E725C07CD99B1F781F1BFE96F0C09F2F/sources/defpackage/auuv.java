package defpackage;
/* compiled from: PG */
/* renamed from: auuv  reason: default package */
/* loaded from: classes2.dex */
public enum auuv implements aopm {
    SHORTS_CREATION_SURFACE_UNKNOWN(0),
    SHORTS_CREATION_SURFACE_VOD_WATCH_PAGE(1),
    SHORTS_CREATION_SURFACE_PIVOT(2),
    SHORTS_CREATION_SURFACE_GLOBAL(3),
    SHORTS_CREATION_SURFACE_SHORTS_PLAYER(4),
    SHORTS_CREATION_SURFACE_SHORTS_SHELF(5),
    SHORTS_CREATION_SURFACE_ZERO_STATE_UPLOADS(6),
    SHORTS_CREATION_SURFACE_BOTTOM_SHEET_CAMERA(7),
    SHORTS_CREATION_SURFACE_BOTTOM_SHEET_UPLOAD(8),
    SHORTS_CREATION_SURFACE_DEEP_LINKS(9),
    SHORTS_CREATION_SURFACE_PROMO(10);
    
    public final int l;

    auuv(int i) {
        this.l = i;
    }

    public static aopo a() {
        return aupm.u;
    }

    public static auuv b(int i) {
        switch (i) {
            case 0:
                return SHORTS_CREATION_SURFACE_UNKNOWN;
            case 1:
                return SHORTS_CREATION_SURFACE_VOD_WATCH_PAGE;
            case 2:
                return SHORTS_CREATION_SURFACE_PIVOT;
            case 3:
                return SHORTS_CREATION_SURFACE_GLOBAL;
            case 4:
                return SHORTS_CREATION_SURFACE_SHORTS_PLAYER;
            case 5:
                return SHORTS_CREATION_SURFACE_SHORTS_SHELF;
            case 6:
                return SHORTS_CREATION_SURFACE_ZERO_STATE_UPLOADS;
            case 7:
                return SHORTS_CREATION_SURFACE_BOTTOM_SHEET_CAMERA;
            case 8:
                return SHORTS_CREATION_SURFACE_BOTTOM_SHEET_UPLOAD;
            case 9:
                return SHORTS_CREATION_SURFACE_DEEP_LINKS;
            case 10:
                return SHORTS_CREATION_SURFACE_PROMO;
            default:
                return null;
        }
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
