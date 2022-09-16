package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dwyd  reason: default package */
/* loaded from: classes6.dex */
public enum dwyd implements dsrb {
    UNKNOWN_ENTRY_POINT(0),
    PLACE_PAGE(1),
    PLACE_PAGE_CAROUSEL_ZERO_STATE(24),
    PLACE_PAGE_CAROUSEL_ADD_PHOTOS_PROMINENT(26),
    PLACE_PAGE_HERO_IMAGE_PROMO(23),
    PLACE_PAGE_PHOTO_UPDATES(47),
    GALLERY(2),
    GALLERY_TAB_ZERO_STATE(25),
    PHOTO_TAKEN_NOTIFICATION(3),
    PHOTO_VIEWER(6),
    ADD_A_PLACE(8),
    SHARE_INTENT(9),
    REVIEW(10),
    BE_THE_FIRST_PHOTO_NOTIFICATION(11),
    REPORT_A_PROBLEM(12),
    PUBLISH_PRIVATE_PHOTO(13),
    PUBLISH_PRIVATE_PHOTO_NOTIFICATION(16),
    PUBLISH_PRIVATE_PHOTO_NUDGE(17),
    PUBLISH_PRIVATE_PHOTO_IN_THANKS_PAGE(36),
    TODO_LIST(14),
    TODO_LIST_THUMBNAIL(30),
    LOCAL_UNIVERSAL(15),
    REVIEW_PAGE(4),
    DEPRECATED_5(5),
    DEPRECATED_7(7),
    DEPRECATED_18(18),
    UGC_TASK_SETS(19),
    OFFERING(20),
    LOCAL_GUIDES_WIDGET(21),
    PLACE_STORY(22),
    EVENT_SHEET(27),
    VISUAL_EXPLORE(28),
    INLINE_PHOTO_TAKEN_NOTIFICATION(29),
    EXPERIENCE_SHEET(31),
    CONSTELLATIONS_LIST_ITEM(32),
    EVENTS_UGC(33),
    TODO_LIST_BUTTON(34),
    MERCHANT_MODE_TOOLBAR(35),
    BUSINESS_MESSAGING_COMPOSE_BOX(37),
    MERCHANT_MODE_CREATE_POST_WEBVIEW(38),
    MENU_TAB(39),
    HOME_SCREEN_CONTRIBUTE_TAB(40),
    MERCHANT_MODE_ADD_MENU_PHOTOS(41),
    MERCHANT_MODE_MENU_TAB(42),
    MERCHANT_MODE_CREATE_CONTENT(43),
    MERCHANT_EXPERIENCE_MENU(44),
    CREATOR_PROFILE(45),
    MERCHANT_EXPERIENCE_TASK_CARDS(46),
    YOUR_EXPLORE_FEED(48),
    CONTRIBUTE_TAB_CAMPAIGN_CARD(49),
    PLACE_PAGE_MERCHANT_MODE_MENU_HIGHLIGHTS_CAROUSEL(50);
    
    public final int Z;

    dwyd(int i) {
        this.Z = i;
    }

    public static dwyd b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ENTRY_POINT;
            case 1:
                return PLACE_PAGE;
            case 2:
                return GALLERY;
            case 3:
                return PHOTO_TAKEN_NOTIFICATION;
            case 4:
                return REVIEW_PAGE;
            case 5:
                return DEPRECATED_5;
            case 6:
                return PHOTO_VIEWER;
            case 7:
                return DEPRECATED_7;
            case 8:
                return ADD_A_PLACE;
            case 9:
                return SHARE_INTENT;
            case 10:
                return REVIEW;
            case 11:
                return BE_THE_FIRST_PHOTO_NOTIFICATION;
            case 12:
                return REPORT_A_PROBLEM;
            case 13:
                return PUBLISH_PRIVATE_PHOTO;
            case 14:
                return TODO_LIST;
            case 15:
                return LOCAL_UNIVERSAL;
            case 16:
                return PUBLISH_PRIVATE_PHOTO_NOTIFICATION;
            case 17:
                return PUBLISH_PRIVATE_PHOTO_NUDGE;
            case 18:
                return DEPRECATED_18;
            case 19:
                return UGC_TASK_SETS;
            case 20:
                return OFFERING;
            case 21:
                return LOCAL_GUIDES_WIDGET;
            case 22:
                return PLACE_STORY;
            case 23:
                return PLACE_PAGE_HERO_IMAGE_PROMO;
            case 24:
                return PLACE_PAGE_CAROUSEL_ZERO_STATE;
            case 25:
                return GALLERY_TAB_ZERO_STATE;
            case 26:
                return PLACE_PAGE_CAROUSEL_ADD_PHOTOS_PROMINENT;
            case 27:
                return EVENT_SHEET;
            case 28:
                return VISUAL_EXPLORE;
            case 29:
                return INLINE_PHOTO_TAKEN_NOTIFICATION;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return TODO_LIST_THUMBNAIL;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return EXPERIENCE_SHEET;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return CONSTELLATIONS_LIST_ITEM;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return EVENTS_UGC;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return TODO_LIST_BUTTON;
            case 35:
                return MERCHANT_MODE_TOOLBAR;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return PUBLISH_PRIVATE_PHOTO_IN_THANKS_PAGE;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return BUSINESS_MESSAGING_COMPOSE_BOX;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return MERCHANT_MODE_CREATE_POST_WEBVIEW;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return MENU_TAB;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return HOME_SCREEN_CONTRIBUTE_TAB;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return MERCHANT_MODE_ADD_MENU_PHOTOS;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return MERCHANT_MODE_MENU_TAB;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return MERCHANT_MODE_CREATE_CONTENT;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return MERCHANT_EXPERIENCE_MENU;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return CREATOR_PROFILE;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return MERCHANT_EXPERIENCE_TASK_CARDS;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return PLACE_PAGE_PHOTO_UPDATES;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return YOUR_EXPLORE_FEED;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return CONTRIBUTE_TAB_CAMPAIGN_CARD;
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                return PLACE_PAGE_MERCHANT_MODE_MENU_HIGHLIGHTS_CAROUSEL;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dwyc.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.Z;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.Z);
    }
}
