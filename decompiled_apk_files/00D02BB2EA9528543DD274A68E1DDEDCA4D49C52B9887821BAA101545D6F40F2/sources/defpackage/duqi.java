package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: duqi  reason: default package */
/* loaded from: classes6.dex */
public enum duqi implements dsrb {
    ERROR(1),
    MAP(2),
    SEARCH(3),
    LOCATION_DETAILS(4),
    DIRECTIONS_DEFAULT(5),
    DIRECTIONS_NAVIGATION(6),
    DIRECTIONS_TRIP_DETAILS(7),
    DIRECTIONS_COMMUTE_IMMERSIVE(28),
    DIRECTIONS_TWO_WHEELER(31),
    DIRECTIONS_TRANSIT_NAVIGATION(35),
    DIRECTIONS_NAVIGATION_NAVGO(36),
    URL_REDIRECTION_BROWSER(8),
    URL_REDIRECTION_WEBVIEW(9),
    PLACE_DETAILS_BASIC(10),
    PLACE_DETAILS_FULL(11),
    STREET_VIEW(12),
    HANDLE_MFE_URL(13),
    MAPS_ENGINE_MAP(14),
    LOCATION_SHARING(15),
    LOCATION_SHARING_REQUEST_LOCATION(30),
    REPORT_A_PROBLEM(16),
    START_PAGE_ROVER(17),
    ADD_A_PLACE(18),
    TRANSIT_NETWORK(19),
    TRANSIT_RADAR(20),
    TRANSIT_NEARBY(21),
    LABELED_PLACES(22),
    OPEN_PLACE_LIST(23),
    SHOW_MAJOR_EVENT(24),
    OPEN_UGC_TASKS_PAGE(25),
    DISPLAY_MAJOR_EVENT(26),
    DISPLAY_TIMELINE(27),
    SOCIAL_PLANNING(29),
    DISPLAY_EXPERIENCE(33),
    HOME_SCREEN(34),
    MEDIA_INTEGRATION_SETUP(37),
    SETTINGS_COMMUTE(38),
    TODO_LIST(39);
    
    public final int M;

    duqi(int i) {
        this.M = i;
    }

    public static duqi b(int i) {
        switch (i) {
            case 1:
                return ERROR;
            case 2:
                return MAP;
            case 3:
                return SEARCH;
            case 4:
                return LOCATION_DETAILS;
            case 5:
                return DIRECTIONS_DEFAULT;
            case 6:
                return DIRECTIONS_NAVIGATION;
            case 7:
                return DIRECTIONS_TRIP_DETAILS;
            case 8:
                return URL_REDIRECTION_BROWSER;
            case 9:
                return URL_REDIRECTION_WEBVIEW;
            case 10:
                return PLACE_DETAILS_BASIC;
            case 11:
                return PLACE_DETAILS_FULL;
            case 12:
                return STREET_VIEW;
            case 13:
                return HANDLE_MFE_URL;
            case 14:
                return MAPS_ENGINE_MAP;
            case 15:
                return LOCATION_SHARING;
            case 16:
                return REPORT_A_PROBLEM;
            case 17:
                return START_PAGE_ROVER;
            case 18:
                return ADD_A_PLACE;
            case 19:
                return TRANSIT_NETWORK;
            case 20:
                return TRANSIT_RADAR;
            case 21:
                return TRANSIT_NEARBY;
            case 22:
                return LABELED_PLACES;
            case 23:
                return OPEN_PLACE_LIST;
            case 24:
                return SHOW_MAJOR_EVENT;
            case 25:
                return OPEN_UGC_TASKS_PAGE;
            case 26:
                return DISPLAY_MAJOR_EVENT;
            case 27:
                return DISPLAY_TIMELINE;
            case 28:
                return DIRECTIONS_COMMUTE_IMMERSIVE;
            case 29:
                return SOCIAL_PLANNING;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return LOCATION_SHARING_REQUEST_LOCATION;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return DIRECTIONS_TWO_WHEELER;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
            default:
                return null;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return DISPLAY_EXPERIENCE;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return HOME_SCREEN;
            case 35:
                return DIRECTIONS_TRANSIT_NAVIGATION;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return DIRECTIONS_NAVIGATION_NAVGO;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return MEDIA_INTEGRATION_SETUP;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return SETTINGS_COMMUTE;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return TODO_LIST;
        }
    }

    public static dsrd c() {
        return duqh.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.M;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.M);
    }
}
