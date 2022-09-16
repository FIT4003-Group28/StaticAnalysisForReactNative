package defpackage;
/* compiled from: PG */
/* renamed from: avxv  reason: default package */
/* loaded from: classes2.dex */
public enum avxv implements aopm {
    EFFECTS_FEATURE_UNKNOWN(0),
    EFFECTS_FEATURE_DOT_ON_FILTER_ICON(1),
    EFFECTS_FEATURE_DOT_ON_EFFECT_THUMBNAIL(2),
    EFFECTS_FEATURE_INSTANT_DYNAMIC_KAZOO(3),
    EFFECTS_FEATURE_KAZOO_TEXT_REELS_EDIT(4),
    EFFECTS_FEATURE_ADVANCED_TEXT_REELS_EDIT(5),
    EFFECTS_FEATURE_KAZOO_OUTPUT_EVENTS(6),
    EFFECTS_FEATURE_TEXT_BG_ROUNDED_CORNERS(7),
    EFFECTS_FEATURE_REELS_CAMERA_PRESETS(8),
    EFFECTS_FEATURE_REELS_CAMERA_DEFAULT_PRESET(9);
    
    private final int l;

    avxv(int i) {
        this.l = i;
    }

    public static aopo a() {
        return avxs.d;
    }

    public static avxv b(int i) {
        switch (i) {
            case 0:
                return EFFECTS_FEATURE_UNKNOWN;
            case 1:
                return EFFECTS_FEATURE_DOT_ON_FILTER_ICON;
            case 2:
                return EFFECTS_FEATURE_DOT_ON_EFFECT_THUMBNAIL;
            case 3:
                return EFFECTS_FEATURE_INSTANT_DYNAMIC_KAZOO;
            case 4:
                return EFFECTS_FEATURE_KAZOO_TEXT_REELS_EDIT;
            case 5:
                return EFFECTS_FEATURE_ADVANCED_TEXT_REELS_EDIT;
            case 6:
                return EFFECTS_FEATURE_KAZOO_OUTPUT_EVENTS;
            case 7:
                return EFFECTS_FEATURE_TEXT_BG_ROUNDED_CORNERS;
            case 8:
                return EFFECTS_FEATURE_REELS_CAMERA_PRESETS;
            case 9:
                return EFFECTS_FEATURE_REELS_CAMERA_DEFAULT_PRESET;
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
