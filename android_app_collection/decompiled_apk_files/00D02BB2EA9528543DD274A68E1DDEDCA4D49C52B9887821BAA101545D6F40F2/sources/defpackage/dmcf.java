package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dmcf  reason: default package */
/* loaded from: classes6.dex */
public enum dmcf implements dsrb {
    ERROR(0),
    MUTE(1),
    UNMUTE(2),
    SHOW_TRAFFIC(3),
    HIDE_TRAFFIC(4),
    SHOW_SATELLITE(5),
    HIDE_SATELLITE(6),
    SHOW_ALTERNATES(7),
    ROUTE_OVERVIEW(8),
    EXIT_NAVIGATION(9),
    HELP(10),
    QUERY_NEXT_TURN(11),
    DISTANCE_TO_NEXT_TURN(12),
    TIME_TO_NEXT_TURN(13),
    DISTANCE_TO_DESTINATION(14),
    TIME_TO_DESTINATION(15),
    ETA(16),
    GO_BACK(17),
    MY_LOCATION(18),
    SHOW_DIRECTIONS_LIST(19),
    SEND_FEEDBACK(20),
    QUERY_CURRENT_ROAD(21),
    TRAFFIC_REPORT(22),
    DISTANCE_REMAINING_ON_CURRENT_ROAD(23),
    SEARCH(24),
    SHOW_NEXT_TURN(25),
    SHOW_DESTINATION(26),
    QUERY_DESTINATION(27),
    FOLLOW_MODE(28),
    ARE_WE_THERE_YET_EASTER_EGG(29),
    BLATHER(30),
    SHOW_MAP(31),
    ACCEPT_SUGGESTION(32),
    DECLINE_SUGGESTION(33),
    OMEGA(34),
    AVOID_TOLLS(35),
    ALLOW_TOLLS(36),
    AVOID_FERRIES(37),
    ALLOW_FERRIES(38),
    AVOID_HIGHWAYS(39),
    ALLOW_HIGHWAYS(40),
    REPORT_CRASH(41),
    REPORT_SPEED_TRAP(42),
    REPORT_SPEED_CAMERA(43),
    REPORT_TRAFFIC_JAM(44),
    REPORT_POLICE(45),
    REPORT_HAZARD(46),
    RESUME_NAVIGATION(47),
    REPORT_ROAD_CLOSURE(48),
    CLEAR_SEARCH_RESULTS(49),
    REMOVE_NEXT_STOP(50),
    OPEN_DESTINATION_INPUT(51),
    OPEN_SIGN_IN_MENU(52);
    
    public final int ab;

    dmcf(int i) {
        this.ab = i;
    }

    public static dmcf b(int i) {
        switch (i) {
            case 0:
                return ERROR;
            case 1:
                return MUTE;
            case 2:
                return UNMUTE;
            case 3:
                return SHOW_TRAFFIC;
            case 4:
                return HIDE_TRAFFIC;
            case 5:
                return SHOW_SATELLITE;
            case 6:
                return HIDE_SATELLITE;
            case 7:
                return SHOW_ALTERNATES;
            case 8:
                return ROUTE_OVERVIEW;
            case 9:
                return EXIT_NAVIGATION;
            case 10:
                return HELP;
            case 11:
                return QUERY_NEXT_TURN;
            case 12:
                return DISTANCE_TO_NEXT_TURN;
            case 13:
                return TIME_TO_NEXT_TURN;
            case 14:
                return DISTANCE_TO_DESTINATION;
            case 15:
                return TIME_TO_DESTINATION;
            case 16:
                return ETA;
            case 17:
                return GO_BACK;
            case 18:
                return MY_LOCATION;
            case 19:
                return SHOW_DIRECTIONS_LIST;
            case 20:
                return SEND_FEEDBACK;
            case 21:
                return QUERY_CURRENT_ROAD;
            case 22:
                return TRAFFIC_REPORT;
            case 23:
                return DISTANCE_REMAINING_ON_CURRENT_ROAD;
            case 24:
                return SEARCH;
            case 25:
                return SHOW_NEXT_TURN;
            case 26:
                return SHOW_DESTINATION;
            case 27:
                return QUERY_DESTINATION;
            case 28:
                return FOLLOW_MODE;
            case 29:
                return ARE_WE_THERE_YET_EASTER_EGG;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return BLATHER;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return SHOW_MAP;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return ACCEPT_SUGGESTION;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return DECLINE_SUGGESTION;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return OMEGA;
            case 35:
                return AVOID_TOLLS;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return ALLOW_TOLLS;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return AVOID_FERRIES;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return ALLOW_FERRIES;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return AVOID_HIGHWAYS;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return ALLOW_HIGHWAYS;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return REPORT_CRASH;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return REPORT_SPEED_TRAP;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return REPORT_SPEED_CAMERA;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return REPORT_TRAFFIC_JAM;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return REPORT_POLICE;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return REPORT_HAZARD;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return RESUME_NAVIGATION;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return REPORT_ROAD_CLOSURE;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return CLEAR_SEARCH_RESULTS;
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                return REMOVE_NEXT_STOP;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return OPEN_DESTINATION_INPUT;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return OPEN_SIGN_IN_MENU;
            default:
                return null;
        }
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.ab;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.ab);
    }
}
