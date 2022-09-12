package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dnnv  reason: default package */
/* loaded from: classes.dex */
public enum dnnv implements dsrb {
    UNKNOWN_HOTEL_HIGHLIGHT_TYPE(0),
    HIGHLIGHT_BUSINESS_FAVORITE(1),
    HIGHLIGHT_COUPLE_FAVORITE(2),
    HIGHLIGHT_DESIGNER_VIBE(3),
    HIGHLIGHT_FAMILY_FAVORITE(4),
    HIGHLIGHT_FREE_BREAKFAST(5),
    HIGHLIGHT_FREE_PARKING(6),
    HIGHLIGHT_FREE_WIFI(7),
    HIGHLIGHT_GREAT_BREAKFAST(8),
    HIGHLIGHT_GREAT_DINING(9),
    HIGHLIGHT_GREAT_LOCATION(10),
    HIGHLIGHT_GREAT_NATURE_AND_OUTDOORS(11),
    HIGHLIGHT_GREAT_NIGHTLIFE(12),
    HIGHLIGHT_GREAT_POOL(13),
    HIGHLIGHT_GREAT_ROOMS(14),
    HIGHLIGHT_GREAT_SERVICE(15),
    HIGHLIGHT_GREAT_SLEEP(16),
    HIGHLIGHT_GREAT_VIEWS_FROM_ROOMS(17),
    HIGHLIGHT_GREAT_WELLNESS(18),
    HIGHLIGHT_HAS_AIR_CONDITIONING(19),
    HIGHLIGHT_HAS_BAR_OR_LOUNGE(20),
    HIGHLIGHT_HAS_BEACH_ACCESS(21),
    HIGHLIGHT_HAS_GYM(22),
    HIGHLIGHT_HAS_HOT_TUB(23),
    HIGHLIGHT_HAS_POOL(24),
    HIGHLIGHT_HAS_RESTAURANT(25),
    HIGHLIGHT_HAS_SPA(26),
    HIGHLIGHT_LUXURIOUS_VIBE(27),
    HIGHLIGHT_MODERN_VIBE(28),
    HIGHLIGHT_NEAR_CITY_CENTER(29),
    HIGHLIGHT_NEAR_POI_DRIVING(30),
    HIGHLIGHT_NEAR_POI_TRANSIT(31),
    HIGHLIGHT_NEAR_POI_WALKING(32),
    HIGHLIGHT_NEAR_PUBLIC_TRANSIT(33),
    HIGHLIGHT_PETS_ALLOWED(34),
    HIGHLIGHT_POPULAR_WITH_USER_COUNTRY(35),
    HIGHLIGHT_SOLO_FAVORITE(36),
    HIGHLIGHT_TOP_RATED_BED_AND_BREAKFAST(37),
    HIGHLIGHT_TOP_RATED_BOUTIQUE_HOTEL(38),
    HIGHLIGHT_TOP_RATED_HOSTEL(39),
    HIGHLIGHT_TOP_RATED_MOTEL(40),
    HIGHLIGHT_TOP_RATED_RESORT(41),
    HIGHLIGHT_USER_FAVORITE(42);
    
    private final int R;

    dnnv(int i) {
        this.R = i;
    }

    public static dnnv b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_HOTEL_HIGHLIGHT_TYPE;
            case 1:
                return HIGHLIGHT_BUSINESS_FAVORITE;
            case 2:
                return HIGHLIGHT_COUPLE_FAVORITE;
            case 3:
                return HIGHLIGHT_DESIGNER_VIBE;
            case 4:
                return HIGHLIGHT_FAMILY_FAVORITE;
            case 5:
                return HIGHLIGHT_FREE_BREAKFAST;
            case 6:
                return HIGHLIGHT_FREE_PARKING;
            case 7:
                return HIGHLIGHT_FREE_WIFI;
            case 8:
                return HIGHLIGHT_GREAT_BREAKFAST;
            case 9:
                return HIGHLIGHT_GREAT_DINING;
            case 10:
                return HIGHLIGHT_GREAT_LOCATION;
            case 11:
                return HIGHLIGHT_GREAT_NATURE_AND_OUTDOORS;
            case 12:
                return HIGHLIGHT_GREAT_NIGHTLIFE;
            case 13:
                return HIGHLIGHT_GREAT_POOL;
            case 14:
                return HIGHLIGHT_GREAT_ROOMS;
            case 15:
                return HIGHLIGHT_GREAT_SERVICE;
            case 16:
                return HIGHLIGHT_GREAT_SLEEP;
            case 17:
                return HIGHLIGHT_GREAT_VIEWS_FROM_ROOMS;
            case 18:
                return HIGHLIGHT_GREAT_WELLNESS;
            case 19:
                return HIGHLIGHT_HAS_AIR_CONDITIONING;
            case 20:
                return HIGHLIGHT_HAS_BAR_OR_LOUNGE;
            case 21:
                return HIGHLIGHT_HAS_BEACH_ACCESS;
            case 22:
                return HIGHLIGHT_HAS_GYM;
            case 23:
                return HIGHLIGHT_HAS_HOT_TUB;
            case 24:
                return HIGHLIGHT_HAS_POOL;
            case 25:
                return HIGHLIGHT_HAS_RESTAURANT;
            case 26:
                return HIGHLIGHT_HAS_SPA;
            case 27:
                return HIGHLIGHT_LUXURIOUS_VIBE;
            case 28:
                return HIGHLIGHT_MODERN_VIBE;
            case 29:
                return HIGHLIGHT_NEAR_CITY_CENTER;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return HIGHLIGHT_NEAR_POI_DRIVING;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return HIGHLIGHT_NEAR_POI_TRANSIT;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return HIGHLIGHT_NEAR_POI_WALKING;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return HIGHLIGHT_NEAR_PUBLIC_TRANSIT;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return HIGHLIGHT_PETS_ALLOWED;
            case 35:
                return HIGHLIGHT_POPULAR_WITH_USER_COUNTRY;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return HIGHLIGHT_SOLO_FAVORITE;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return HIGHLIGHT_TOP_RATED_BED_AND_BREAKFAST;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return HIGHLIGHT_TOP_RATED_BOUTIQUE_HOTEL;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return HIGHLIGHT_TOP_RATED_HOSTEL;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return HIGHLIGHT_TOP_RATED_MOTEL;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return HIGHLIGHT_TOP_RATED_RESORT;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return HIGHLIGHT_USER_FAVORITE;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dnnu.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.R;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.R);
    }
}
