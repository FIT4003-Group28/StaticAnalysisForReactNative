package defpackage;
/* compiled from: PG */
/* renamed from: dvxj  reason: default package */
/* loaded from: classes6.dex */
public enum dvxj implements dsrb {
    PIXEL_15(0),
    PIXEL_22(1),
    PIXEL_30(2),
    PIXEL_44(3),
    PX_19_BG_LIGHT(4),
    PX_30_BG_LIGHT(5),
    PX_38_BG_LIGHT(6),
    PX_60_BG_LIGHT(7),
    PX_38_BG_DARK(8),
    PX_60_BG_DARK(9),
    PX_76_BG_DARK(10),
    PX_120_BG_DARK(11),
    SVG_LIGHT(12),
    SVG_DARK(13),
    PX_22_BG_LIGHT(14),
    PX_33_BG_LIGHT(15),
    PX_44_BG_LIGHT(16),
    PX_66_BG_LIGHT(17),
    SVG_INCIDENT_LIGHT(18),
    SVG_ROAD_SHIELD(19);
    
    public final int u;

    dvxj(int i) {
        this.u = i;
    }

    public static dvxj b(int i) {
        switch (i) {
            case 0:
                return PIXEL_15;
            case 1:
                return PIXEL_22;
            case 2:
                return PIXEL_30;
            case 3:
                return PIXEL_44;
            case 4:
                return PX_19_BG_LIGHT;
            case 5:
                return PX_30_BG_LIGHT;
            case 6:
                return PX_38_BG_LIGHT;
            case 7:
                return PX_60_BG_LIGHT;
            case 8:
                return PX_38_BG_DARK;
            case 9:
                return PX_60_BG_DARK;
            case 10:
                return PX_76_BG_DARK;
            case 11:
                return PX_120_BG_DARK;
            case 12:
                return SVG_LIGHT;
            case 13:
                return SVG_DARK;
            case 14:
                return PX_22_BG_LIGHT;
            case 15:
                return PX_33_BG_LIGHT;
            case 16:
                return PX_44_BG_LIGHT;
            case 17:
                return PX_66_BG_LIGHT;
            case 18:
                return SVG_INCIDENT_LIGHT;
            case 19:
                return SVG_ROAD_SHIELD;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dvxi.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.u;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.u);
    }
}
