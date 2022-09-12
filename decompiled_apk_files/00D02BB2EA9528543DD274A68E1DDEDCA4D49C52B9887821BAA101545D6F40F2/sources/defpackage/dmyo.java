package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dmyo  reason: default package */
/* loaded from: classes.dex */
public enum dmyo implements dsrb {
    UNKNOWN(0),
    BASEMAP_EDITING(19),
    BASEMAP_EDITING_SATELLITE(25),
    BROADCASTERS(24),
    BROADCASTERS_SATELLITE(34),
    CATEGORICAL_RESULTS_FOCUSED(26),
    CATEGORICAL_RESULTS_FOCUSED_DARK(33),
    DRIVING_FOCUSED(21),
    EARTH_LOW_DENSITY(1),
    EARTH_LOWER_DENSITY(2),
    EARTH_LOWEST_DENSITY(3),
    NAVIGATION(4),
    NAVIGATION_EMBEDDED_AUTO(22),
    NAVIGATION_EMBEDDED_AUTO_LOW_LIGHT(23),
    NAVIGATION_FREENAV(14),
    NAVIGATION_FREENAV_LOW_LIGHT(17),
    NAVIGATION_MUTED(13),
    NAVIGATION_LOW_LIGHT(5),
    NAVIGATION_SATELLITE(6),
    NON_ROADMAP(7),
    ROADMAP(8),
    ROADMAP_AMBIACTIVE(15),
    ROADMAP_AMBIACTIVE_LOW_BIT(16),
    ROADMAP_DARK(27),
    ROADMAP_GLASS(9),
    ROADMAP_MUTED(10),
    ROADMAP_SATELLITE(11),
    ROADMAP_INFO_LAYER(35),
    ROADMAP_INFO_LAYER_DARK(36),
    ROUTE_OVERVIEW(20),
    ROUTE_OVERVIEW_DARK(28),
    SAFETY(31),
    SAFETY_DARK(32),
    TERRAIN(12),
    TERRAIN_DARK(29),
    TRANSIT_FOCUSED(18),
    TRANSIT_FOCUSED_DARK(30);
    
    public final int L;

    dmyo(int i) {
        this.L = i;
    }

    public static dmyo b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return EARTH_LOW_DENSITY;
            case 2:
                return EARTH_LOWER_DENSITY;
            case 3:
                return EARTH_LOWEST_DENSITY;
            case 4:
                return NAVIGATION;
            case 5:
                return NAVIGATION_LOW_LIGHT;
            case 6:
                return NAVIGATION_SATELLITE;
            case 7:
                return NON_ROADMAP;
            case 8:
                return ROADMAP;
            case 9:
                return ROADMAP_GLASS;
            case 10:
                return ROADMAP_MUTED;
            case 11:
                return ROADMAP_SATELLITE;
            case 12:
                return TERRAIN;
            case 13:
                return NAVIGATION_MUTED;
            case 14:
                return NAVIGATION_FREENAV;
            case 15:
                return ROADMAP_AMBIACTIVE;
            case 16:
                return ROADMAP_AMBIACTIVE_LOW_BIT;
            case 17:
                return NAVIGATION_FREENAV_LOW_LIGHT;
            case 18:
                return TRANSIT_FOCUSED;
            case 19:
                return BASEMAP_EDITING;
            case 20:
                return ROUTE_OVERVIEW;
            case 21:
                return DRIVING_FOCUSED;
            case 22:
                return NAVIGATION_EMBEDDED_AUTO;
            case 23:
                return NAVIGATION_EMBEDDED_AUTO_LOW_LIGHT;
            case 24:
                return BROADCASTERS;
            case 25:
                return BASEMAP_EDITING_SATELLITE;
            case 26:
                return CATEGORICAL_RESULTS_FOCUSED;
            case 27:
                return ROADMAP_DARK;
            case 28:
                return ROUTE_OVERVIEW_DARK;
            case 29:
                return TERRAIN_DARK;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return TRANSIT_FOCUSED_DARK;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return SAFETY;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return SAFETY_DARK;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return CATEGORICAL_RESULTS_FOCUSED_DARK;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return BROADCASTERS_SATELLITE;
            case 35:
                return ROADMAP_INFO_LAYER;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return ROADMAP_INFO_LAYER_DARK;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dmyn.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.L;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.L);
    }
}
