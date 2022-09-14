package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dqgh  reason: default package */
/* loaded from: classes6.dex */
public enum dqgh implements dsrb {
    UNDEFINED(0),
    NAME(1),
    LOCAL_LANGUAGE_NAME(35),
    NEW_NAME(36),
    ADDRESS(2),
    CATEGORY(14),
    WEBSITE(4),
    BUSINESS_JOBS(55),
    CLOSED(9),
    DOES_NOT_EXIST(10),
    PRIVATE(18),
    SPAM(29),
    MOVED(30),
    DUPLICATE(31),
    VERIFIED_EXISTENCE(37),
    CLOSED_UNKNOWN(44),
    TEMPORARILY_CLOSED(56),
    NOT_OPEN_YET(46),
    PHONE_NUMBER(3),
    BUSINESS_HOURS(8),
    SECONDARY_HOURS(57),
    SPECIAL_HOURS(39),
    OPENING_DATE(40),
    ACCESS_POINT(28),
    POINT(5),
    POLYLINE(6),
    POLYGON(7),
    SERVICE_AREA(51),
    ROAD_DIRECTIONALITY(11),
    ROAD_NOT_PASSABLE(19),
    ROAD_CONSTRUCTION(20),
    ROAD_COARSE_CATEGORY(47),
    MISSING_ROAD_NETWORK(53),
    ROAD_RESTRICTION(16),
    TURN_RESTRICTION(17),
    TRANSIT_SCHEDULE(12),
    DEPRECATED_15(15),
    SIGNAGE_REFERENCE(21),
    LANDMARK_REFERENCE(23),
    TEXT_TO_SPEECH_APPROACHING(24),
    TEXT_TO_SPEECH_GUIDANCE(25),
    LANE_GUIDANCE_INSTRUCTION(26),
    LANE_CONFIGURATION(27),
    GUIDANCE_UNNECESSARY_INSTRUCTION(32),
    PHOTO(33),
    SCALABLE_ATTRIBUTE(34),
    MENU_URL(38),
    RESERVATION_URL(41),
    ORDER_AHEAD_URL(42),
    APPOINTMENT_URL(43),
    SHOP_ONLINE_URL(58),
    INDEPENDENT_ESTABLISHMENT_IN(45),
    MERCHANT_DESCRIPTION(49),
    ELECTRIC_VEHICLE_CHARGING(50),
    VANITY_NAME(52),
    NEIGHBORHOOD_BOUNDARIES(54),
    OTHER(13);
    
    public final int af;

    dqgh(int i) {
        this.af = i;
    }

    public static dqgh b(int i) {
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return NAME;
            case 2:
                return ADDRESS;
            case 3:
                return PHONE_NUMBER;
            case 4:
                return WEBSITE;
            case 5:
                return POINT;
            case 6:
                return POLYLINE;
            case 7:
                return POLYGON;
            case 8:
                return BUSINESS_HOURS;
            case 9:
                return CLOSED;
            case 10:
                return DOES_NOT_EXIST;
            case 11:
                return ROAD_DIRECTIONALITY;
            case 12:
                return TRANSIT_SCHEDULE;
            case 13:
                return OTHER;
            case 14:
                return CATEGORY;
            case 15:
                return DEPRECATED_15;
            case 16:
                return ROAD_RESTRICTION;
            case 17:
                return TURN_RESTRICTION;
            case 18:
                return PRIVATE;
            case 19:
                return ROAD_NOT_PASSABLE;
            case 20:
                return ROAD_CONSTRUCTION;
            case 21:
                return SIGNAGE_REFERENCE;
            case 22:
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
            default:
                return null;
            case 23:
                return LANDMARK_REFERENCE;
            case 24:
                return TEXT_TO_SPEECH_APPROACHING;
            case 25:
                return TEXT_TO_SPEECH_GUIDANCE;
            case 26:
                return LANE_GUIDANCE_INSTRUCTION;
            case 27:
                return LANE_CONFIGURATION;
            case 28:
                return ACCESS_POINT;
            case 29:
                return SPAM;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return MOVED;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return DUPLICATE;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return GUIDANCE_UNNECESSARY_INSTRUCTION;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return PHOTO;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return SCALABLE_ATTRIBUTE;
            case 35:
                return LOCAL_LANGUAGE_NAME;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return NEW_NAME;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return VERIFIED_EXISTENCE;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return MENU_URL;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return SPECIAL_HOURS;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return OPENING_DATE;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return RESERVATION_URL;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return ORDER_AHEAD_URL;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return APPOINTMENT_URL;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return CLOSED_UNKNOWN;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return INDEPENDENT_ESTABLISHMENT_IN;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return NOT_OPEN_YET;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return ROAD_COARSE_CATEGORY;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return MERCHANT_DESCRIPTION;
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                return ELECTRIC_VEHICLE_CHARGING;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return SERVICE_AREA;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return VANITY_NAME;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return MISSING_ROAD_NETWORK;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                return NEIGHBORHOOD_BOUNDARIES;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return BUSINESS_JOBS;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                return TEMPORARILY_CLOSED;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                return SECONDARY_HOURS;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                return SHOP_ONLINE_URL;
        }
    }

    public static dsrd c() {
        return dqgg.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.af;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.af);
    }
}
