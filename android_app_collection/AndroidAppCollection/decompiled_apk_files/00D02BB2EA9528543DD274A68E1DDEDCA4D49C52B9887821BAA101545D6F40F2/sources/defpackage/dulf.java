package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dulf  reason: default package */
/* loaded from: classes6.dex */
public enum dulf implements dsrb {
    LOAD_ODELAY(3),
    WRITE_REVIEW(6),
    VIEW_PLACE_ON_MAP(7),
    OPEN_PUBLIC_PROFILE(11),
    SET_PLACE_ALIAS(12),
    LOAD_ODELAY_IN_DIRECTIONS_START_PAGE(15),
    LOAD_BUILDING_DIRECTORY(17),
    LOAD_MAPS_ACTIVITIES(18),
    DISMISS_CARD(19),
    SHOW_MAP(20),
    SEND_DISMISS_TODO(21),
    SHOW_OFFLINE_MAP_SELECTION(22),
    SHOW_PLACE(23),
    UPDATE_DIRECTIONS_STATE(24),
    UPDATE_DIRECTIONS_STATE_WITH_RENDERABLE(28),
    UPDATE_DIRECTIONS_STATE_WITH_LOCATION_DESCRIPTOR(30),
    UPDATE_DIRECTIONS_STATE_WITH_WAYPOINT_ON_MAP(31),
    INVOKE_EXTERNAL_APP(25),
    LOAD_USER_REVIEWS(26),
    LOAD_NEARBY_STATION(27),
    START_FEEDBACK_FLOW(29),
    TACTILE_SEARCH(32),
    SHOW_PLACE_WITH_ALIAS_AND_QUERY(33),
    SELECT_MY_MAP(34),
    OPEN_MY_MAPS_LIST(35),
    OPEN_CITY_EXPERT_DIALOG(36),
    SHOW_PLACE_WITH_OMNIBOX_TITLE(38),
    VIEW_ALL_ALIASES(39),
    DELETE_PLACE_ALIAS(40),
    LOAD_PROFILE(41),
    VIEW_PHOTOS(42),
    DELETE_HOME_WORK_IN_PROFILE(43),
    LOAD_USER_PHOTOS(44),
    LOAD_ODELAY_FOR_NEW_ROVER_PAGE(45),
    LOAD_ODELAY_FOR_HYBRID_MAP_VIEW(51),
    LOAD_MAPS_ACTIVITIES_LOCATION_HISTORY(46),
    VIEW_ALL_SAVED_PLACES(47),
    VIEW_PHOTOS_SHOW_EDIT_DELETE_BUTTONS(48),
    TRIGGER_WEB_APP_ACTIVITY_SETTING(49),
    LOCATION_HISTORY_SETTINGS(50),
    START_OMEGA(52),
    LOAD_TRANSIT_ALERTS(53),
    LOAD_TRANSIT_SCHEMATIC_MAP(54),
    LOAD_ODELAY_WITH_PARTIAL_ENCLOSING_CARD(55),
    LOAD_PHOTOS(56),
    LOAD_ODELAY_FOR_CORRIDOR(57),
    RECORD_ROVER_NOTIFICATION_OPT_IN_LAST_DISMISSED(58),
    OPT_INTO_ROVER_NOTIFICATIONS(59),
    LOAD_NEARBY_TRANSIT(60),
    LOAD_USER_FACTUAL_EDITS(61),
    LOAD_OFFERING_DETAILS(62),
    VIEW_PHOTOS_PLAY_VIDEOS(63),
    LOAD_PLACE_LIST(64),
    LOAD_USER_QA_CONTRIBUTIONS(65),
    SHOW_EVENT_SHEET_ACTION_DEPRECATED_VOTE_PHOTO(66),
    LOAD_KNOWLEDGE_ENTITY_EDIT_SUMMARIES_ACTION(67),
    DEPRECATED_1(1),
    DEPRECATED_13(13),
    DEPRECATED_14(14),
    DEPRECATED_2(2);
    
    public final int ai;

    dulf(int i) {
        this.ai = i;
    }

    public static dulf b(int i) {
        switch (i) {
            case 1:
                return DEPRECATED_1;
            case 2:
                return DEPRECATED_2;
            case 3:
                return LOAD_ODELAY;
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 16:
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            default:
                return null;
            case 6:
                return WRITE_REVIEW;
            case 7:
                return VIEW_PLACE_ON_MAP;
            case 11:
                return OPEN_PUBLIC_PROFILE;
            case 12:
                return SET_PLACE_ALIAS;
            case 13:
                return DEPRECATED_13;
            case 14:
                return DEPRECATED_14;
            case 15:
                return LOAD_ODELAY_IN_DIRECTIONS_START_PAGE;
            case 17:
                return LOAD_BUILDING_DIRECTORY;
            case 18:
                return LOAD_MAPS_ACTIVITIES;
            case 19:
                return DISMISS_CARD;
            case 20:
                return SHOW_MAP;
            case 21:
                return SEND_DISMISS_TODO;
            case 22:
                return SHOW_OFFLINE_MAP_SELECTION;
            case 23:
                return SHOW_PLACE;
            case 24:
                return UPDATE_DIRECTIONS_STATE;
            case 25:
                return INVOKE_EXTERNAL_APP;
            case 26:
                return LOAD_USER_REVIEWS;
            case 27:
                return LOAD_NEARBY_STATION;
            case 28:
                return UPDATE_DIRECTIONS_STATE_WITH_RENDERABLE;
            case 29:
                return START_FEEDBACK_FLOW;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return UPDATE_DIRECTIONS_STATE_WITH_LOCATION_DESCRIPTOR;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return UPDATE_DIRECTIONS_STATE_WITH_WAYPOINT_ON_MAP;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return TACTILE_SEARCH;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return SHOW_PLACE_WITH_ALIAS_AND_QUERY;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return SELECT_MY_MAP;
            case 35:
                return OPEN_MY_MAPS_LIST;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return OPEN_CITY_EXPERT_DIALOG;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return SHOW_PLACE_WITH_OMNIBOX_TITLE;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return VIEW_ALL_ALIASES;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return DELETE_PLACE_ALIAS;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return LOAD_PROFILE;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return VIEW_PHOTOS;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return DELETE_HOME_WORK_IN_PROFILE;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return LOAD_USER_PHOTOS;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return LOAD_ODELAY_FOR_NEW_ROVER_PAGE;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return LOAD_MAPS_ACTIVITIES_LOCATION_HISTORY;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return VIEW_ALL_SAVED_PLACES;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return VIEW_PHOTOS_SHOW_EDIT_DELETE_BUTTONS;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return TRIGGER_WEB_APP_ACTIVITY_SETTING;
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                return LOCATION_HISTORY_SETTINGS;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return LOAD_ODELAY_FOR_HYBRID_MAP_VIEW;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return START_OMEGA;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return LOAD_TRANSIT_ALERTS;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                return LOAD_TRANSIT_SCHEMATIC_MAP;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return LOAD_ODELAY_WITH_PARTIAL_ENCLOSING_CARD;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                return LOAD_PHOTOS;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                return LOAD_ODELAY_FOR_CORRIDOR;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                return RECORD_ROVER_NOTIFICATION_OPT_IN_LAST_DISMISSED;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                return OPT_INTO_ROVER_NOTIFICATIONS;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                return LOAD_NEARBY_TRANSIT;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                return LOAD_USER_FACTUAL_EDITS;
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                return LOAD_OFFERING_DETAILS;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                return VIEW_PHOTOS_PLAY_VIDEOS;
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                return LOAD_PLACE_LIST;
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                return LOAD_USER_QA_CONTRIBUTIONS;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return SHOW_EVENT_SHEET_ACTION_DEPRECATED_VOTE_PHOTO;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                return LOAD_KNOWLEDGE_ENTITY_EDIT_SUMMARIES_ACTION;
        }
    }

    public static dsrd c() {
        return dule.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.ai;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.ai);
    }
}
