package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dvum  reason: default package */
/* loaded from: classes.dex */
public enum dvum implements dsrb {
    NEVER(0),
    BASE_MAP(1),
    SEARCH_MAP(2),
    CATEGORICAL_SEARCH_MAP(3),
    AFTER_NAVIGATION_COMPLETE(4),
    GUIDE_PAGE(5),
    ROVER_PAGE(6),
    MYMAPS_OPENED(7),
    MY_LOCATION_BUTTON_CLICKED(8),
    BLUE_DOT_CLICKED(9),
    DIRECTION_FAB_BUTTON_CLICKED(10),
    COMPASS_MODE_ENABLED(11),
    PREDICTED_DESTINATION_DISMISSED(12),
    SPEED_DIAL_CARD_DISMISSED(13),
    TRANSIT_DIRECTIONS_DETAILS(14),
    PROMOTED_PLACES(15),
    BASEMAP_JAMCIDENTS(16),
    NEARBY_TRANSIT_TODAY_EXTENSION_USED(17),
    TRAVEL_TIMES_TODAY_EXTENSION_USED(18),
    NEARBY_TRAFFIC_TODAY_EXTENSION_USED(19),
    NO_TODAY_EXTENSIONS_USED(20),
    TRAFFIC_LAYER(21),
    PLACES_TAB(22),
    DRIVING_TAB(23),
    TRANSIT_TAB(24),
    TRANSIT_TAB_REALTIME_CALLOUT(25),
    TRANSPORTATION_TAB(55),
    INFORMAL_TRANSIT_TAB(44),
    DIRECTIONS_CYCLING(64),
    DIRECTIONS_DRIVING(26),
    DIRECTIONS_TWO_WHEELER(27),
    DIRECTIONS_WALKING(33),
    DIRECTIONS_TRANSIT_RESULTS(28),
    DIRECTIONS_TOP_LEVEL_ALERT_DETAILS(65),
    AFTER_WALKING_NAV_END(34),
    AFTER_AUGMENTED_REALITY_WALK_NAV_COMPLETE(29),
    EXPLORE_TAB(30),
    GROUP_DINING_SHORTLIST(31),
    DIRECTIONS_PARK_AND_RIDE_RESULTS(32),
    COMMUTE_DRIVING_IMMERSIVE(35),
    COMMUTE_TRANSIT_IMMERSIVE(36),
    EV_STATION_ATTRIBUTES_SEEN(37),
    BUSINESS_MESSAGING_INBOX(38),
    PERSONAL_SCORE(39),
    BUSINESS_MESSAGING_NOT_USED(40),
    ROAD_PROBLEM_REPORTED(41),
    FACTUAL_UGC_REPORTED(42),
    INFERRED_HOME_WORK_REJECTED(43),
    AFTER_OFF_ROUTE_ALERTS_NO_USAGE(45),
    AFTER_OFF_ROUTE_ALERTS_LOW_USAGE(46),
    AFTER_OFF_ROUTE_ALERTS_MEDIUM_USAGE(47),
    AFTER_OFF_ROUTE_ALERTS_HIGH_USAGE(48),
    SAFETY_LAYER(49),
    SAFETY_LAYER_NOT_VISIBLE(50),
    SAFETY_LAYER_NOT_USED(51),
    REVIEW_POSTED(52),
    PHOTO_UPLOADED(53),
    TIMELINE_AFTER_ONE_MINUTE_OR_CLOSE(54),
    STREETVIEW_SESSION(56),
    DARK_MODE_HOME_SCREEN(57),
    DARK_MODE_PLACEHSEET(58),
    DARK_MODE_OPT_OUT(59),
    TWO_DIRECTION_OPT_OUT(60),
    REVIEW_PRIVATE_REPLY_RECEIVED(61),
    AUGMENTED_REALITY_WALKING_NAV_SESSION(62),
    AUGMENTED_REALITY_LIGHTHOUSE_SESSION(63),
    CONTRIBUTE_TAB(66),
    MERCHANT_MESSAGING_INBOX(67),
    MERCHANT_MESSAGING_OPT_OUT(68),
    MERCHANT_CALLS_MAIN_PAGE(69),
    MERCHANT_CALLS_OPT_OUT(70);
    
    public final int at;

    dvum(int i) {
        this.at = i;
    }

    public static dvum b(int i) {
        switch (i) {
            case 0:
                return NEVER;
            case 1:
                return BASE_MAP;
            case 2:
                return SEARCH_MAP;
            case 3:
                return CATEGORICAL_SEARCH_MAP;
            case 4:
                return AFTER_NAVIGATION_COMPLETE;
            case 5:
                return GUIDE_PAGE;
            case 6:
                return ROVER_PAGE;
            case 7:
                return MYMAPS_OPENED;
            case 8:
                return MY_LOCATION_BUTTON_CLICKED;
            case 9:
                return BLUE_DOT_CLICKED;
            case 10:
                return DIRECTION_FAB_BUTTON_CLICKED;
            case 11:
                return COMPASS_MODE_ENABLED;
            case 12:
                return PREDICTED_DESTINATION_DISMISSED;
            case 13:
                return SPEED_DIAL_CARD_DISMISSED;
            case 14:
                return TRANSIT_DIRECTIONS_DETAILS;
            case 15:
                return PROMOTED_PLACES;
            case 16:
                return BASEMAP_JAMCIDENTS;
            case 17:
                return NEARBY_TRANSIT_TODAY_EXTENSION_USED;
            case 18:
                return TRAVEL_TIMES_TODAY_EXTENSION_USED;
            case 19:
                return NEARBY_TRAFFIC_TODAY_EXTENSION_USED;
            case 20:
                return NO_TODAY_EXTENSIONS_USED;
            case 21:
                return TRAFFIC_LAYER;
            case 22:
                return PLACES_TAB;
            case 23:
                return DRIVING_TAB;
            case 24:
                return TRANSIT_TAB;
            case 25:
                return TRANSIT_TAB_REALTIME_CALLOUT;
            case 26:
                return DIRECTIONS_DRIVING;
            case 27:
                return DIRECTIONS_TWO_WHEELER;
            case 28:
                return DIRECTIONS_TRANSIT_RESULTS;
            case 29:
                return AFTER_AUGMENTED_REALITY_WALK_NAV_COMPLETE;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return EXPLORE_TAB;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return GROUP_DINING_SHORTLIST;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return DIRECTIONS_PARK_AND_RIDE_RESULTS;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return DIRECTIONS_WALKING;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return AFTER_WALKING_NAV_END;
            case 35:
                return COMMUTE_DRIVING_IMMERSIVE;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return COMMUTE_TRANSIT_IMMERSIVE;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return EV_STATION_ATTRIBUTES_SEEN;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return BUSINESS_MESSAGING_INBOX;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return PERSONAL_SCORE;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return BUSINESS_MESSAGING_NOT_USED;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return ROAD_PROBLEM_REPORTED;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return FACTUAL_UGC_REPORTED;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return INFERRED_HOME_WORK_REJECTED;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return INFORMAL_TRANSIT_TAB;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return AFTER_OFF_ROUTE_ALERTS_NO_USAGE;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return AFTER_OFF_ROUTE_ALERTS_LOW_USAGE;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return AFTER_OFF_ROUTE_ALERTS_MEDIUM_USAGE;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return AFTER_OFF_ROUTE_ALERTS_HIGH_USAGE;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return SAFETY_LAYER;
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                return SAFETY_LAYER_NOT_VISIBLE;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return SAFETY_LAYER_NOT_USED;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return REVIEW_POSTED;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return PHOTO_UPLOADED;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                return TIMELINE_AFTER_ONE_MINUTE_OR_CLOSE;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return TRANSPORTATION_TAB;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                return STREETVIEW_SESSION;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                return DARK_MODE_HOME_SCREEN;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                return DARK_MODE_PLACEHSEET;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                return DARK_MODE_OPT_OUT;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                return TWO_DIRECTION_OPT_OUT;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                return REVIEW_PRIVATE_REPLY_RECEIVED;
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                return AUGMENTED_REALITY_WALKING_NAV_SESSION;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                return AUGMENTED_REALITY_LIGHTHOUSE_SESSION;
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                return DIRECTIONS_CYCLING;
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                return DIRECTIONS_TOP_LEVEL_ALERT_DETAILS;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return CONTRIBUTE_TAB;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                return MERCHANT_MESSAGING_INBOX;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                return MERCHANT_MESSAGING_OPT_OUT;
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                return MERCHANT_CALLS_MAIN_PAGE;
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                return MERCHANT_CALLS_OPT_OUT;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dvul.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.at;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.at);
    }
}
