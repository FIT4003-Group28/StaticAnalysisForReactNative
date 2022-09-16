package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: czgq  reason: default package */
/* loaded from: classes5.dex */
public enum czgq implements dsrb {
    UNKNOWN(0),
    PEOPLE_PLAYGROUND_EXAMPLE(1),
    MAPS_PLACE_SHEET_SHARE_BUTTON(4),
    MAPS_PLACE_SHEET_ADDRESS_SHARE_BUTTON(5),
    MAPS_PLAN_SHARE_BUTTON(6),
    MAPS_MY_MAPS_SHARE_BUTTON(7),
    MAPS_DIRECTIONS_DETAILS_SHEET_SHARE_BUTTON(8),
    MAPS_SAVED_PARKING_PLACE_SHEET_SHARE_BUTTON(9),
    MAPS_REVIEW_SHARE_BUTTON(10),
    MAPS_WRITE_REVIEW_THANK_YOU_PAGE_SHARE_BUTTON(11),
    MAPS_USER_CONTRIBUTIONS_SHARE_CONTRIBUTIONS_PAGE_BUTTON(12),
    MAPS_PUBLIC_CONTRIBUTIONS_SHARE_CONTRIBUTIONS_PAGE_BUTTON(13),
    MAPS_UGC_TASKS_TOOLBAR_SHARE_BUTTON(14),
    MAPS_PLACE_SHEET_LOCAL_POST_STREAM_SHARE_BUTTON(15),
    MAPS_LOCAL_POST_LEAF_PAGE_SHARE_BUTTON(16),
    MAPS_LOCAL_STREAM_SHARE_BUTTON(17),
    MAPS_EDIT_PLACE_LIST_SAVE_BUTTON(25),
    MAPS_PLACE_LIST_DETAILS_SHARE_BUTTON(18),
    MAPS_PLACE_LIST_DETAILS_SHARE_THIRD_PARTY_BUTTON(19),
    MAPS_PLACE_LIST_SHARING_OPTIONS_ADD_PARTICIPANTS_BUTTON(24),
    MAPS_STREET_VIEW_SHARE_BUTTON(20),
    MAPS_EXPERIENCE_DETAILS_ON_MAP_CARD_SHARE_BUTTON(21),
    MAPS_EXPERIENCE_DETAILS_TITLE_SHARE_BUTTON(22),
    MAPS_LOCAL_POST_VIDEO_LIGHTBOX_SHARE_BUTTON(23),
    MAPS_LOCATION_SHARING_DEFAULT(35),
    MAPS_JOURNEY_SHARING_DEFAULT(36),
    PHOTOS_DIRECT_DEFAULT(26),
    PHOTOS_DIRECT_GRID(28),
    PHOTOS_DIRECT_ADD_TO_CONVERSATION(29),
    PHOTOS_DIRECT_ADD_TO_PENDING_CONVERSATION(39),
    PHOTOS_ALBUM_DEFAULT(27),
    PHOTOS_ALBUM_NEW(30),
    PHOTOS_ALBUM_ADD_PERSON(31),
    PHOTOS_PARTNER_SHARING(32),
    PHOTOS_3P(34),
    GMAIL_COMPOSE_ENTRY(33),
    GMAIL_COMPOSE_CC(37),
    GMAIL_COMPOSE_BCC(38);
    
    public final int M;

    czgq(int i) {
        this.M = i;
    }

    public static czgq b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PEOPLE_PLAYGROUND_EXAMPLE;
            }
            switch (i) {
                case 4:
                    return MAPS_PLACE_SHEET_SHARE_BUTTON;
                case 5:
                    return MAPS_PLACE_SHEET_ADDRESS_SHARE_BUTTON;
                case 6:
                    return MAPS_PLAN_SHARE_BUTTON;
                case 7:
                    return MAPS_MY_MAPS_SHARE_BUTTON;
                case 8:
                    return MAPS_DIRECTIONS_DETAILS_SHEET_SHARE_BUTTON;
                case 9:
                    return MAPS_SAVED_PARKING_PLACE_SHEET_SHARE_BUTTON;
                case 10:
                    return MAPS_REVIEW_SHARE_BUTTON;
                case 11:
                    return MAPS_WRITE_REVIEW_THANK_YOU_PAGE_SHARE_BUTTON;
                case 12:
                    return MAPS_USER_CONTRIBUTIONS_SHARE_CONTRIBUTIONS_PAGE_BUTTON;
                case 13:
                    return MAPS_PUBLIC_CONTRIBUTIONS_SHARE_CONTRIBUTIONS_PAGE_BUTTON;
                case 14:
                    return MAPS_UGC_TASKS_TOOLBAR_SHARE_BUTTON;
                case 15:
                    return MAPS_PLACE_SHEET_LOCAL_POST_STREAM_SHARE_BUTTON;
                case 16:
                    return MAPS_LOCAL_POST_LEAF_PAGE_SHARE_BUTTON;
                case 17:
                    return MAPS_LOCAL_STREAM_SHARE_BUTTON;
                case 18:
                    return MAPS_PLACE_LIST_DETAILS_SHARE_BUTTON;
                case 19:
                    return MAPS_PLACE_LIST_DETAILS_SHARE_THIRD_PARTY_BUTTON;
                case 20:
                    return MAPS_STREET_VIEW_SHARE_BUTTON;
                case 21:
                    return MAPS_EXPERIENCE_DETAILS_ON_MAP_CARD_SHARE_BUTTON;
                case 22:
                    return MAPS_EXPERIENCE_DETAILS_TITLE_SHARE_BUTTON;
                case 23:
                    return MAPS_LOCAL_POST_VIDEO_LIGHTBOX_SHARE_BUTTON;
                case 24:
                    return MAPS_PLACE_LIST_SHARING_OPTIONS_ADD_PARTICIPANTS_BUTTON;
                case 25:
                    return MAPS_EDIT_PLACE_LIST_SAVE_BUTTON;
                case 26:
                    return PHOTOS_DIRECT_DEFAULT;
                case 27:
                    return PHOTOS_ALBUM_DEFAULT;
                case 28:
                    return PHOTOS_DIRECT_GRID;
                case 29:
                    return PHOTOS_DIRECT_ADD_TO_CONVERSATION;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    return PHOTOS_ALBUM_NEW;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    return PHOTOS_ALBUM_ADD_PERSON;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    return PHOTOS_PARTNER_SHARING;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    return GMAIL_COMPOSE_ENTRY;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    return PHOTOS_3P;
                case 35:
                    return MAPS_LOCATION_SHARING_DEFAULT;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    return MAPS_JOURNEY_SHARING_DEFAULT;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    return GMAIL_COMPOSE_CC;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    return GMAIL_COMPOSE_BCC;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    return PHOTOS_DIRECT_ADD_TO_PENDING_CONVERSATION;
                default:
                    return null;
            }
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return czgp.a;
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
