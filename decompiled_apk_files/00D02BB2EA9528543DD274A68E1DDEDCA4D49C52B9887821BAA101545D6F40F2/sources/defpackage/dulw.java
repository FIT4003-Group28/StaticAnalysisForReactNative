package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dulw  reason: default package */
/* loaded from: classes6.dex */
public enum dulw implements dsrb {
    INVALID_STYLE(0),
    BODY_TEXT(11),
    BODY_TEXT_WITH_TITLE(85),
    EXPLORE_ENTRY(20),
    SIGN_IN(28),
    LIST_ITEM(1),
    LIST_ITEM_COMPACT(2),
    LIST_ITEM_COMPACT_WITH_BUTTON(98),
    LIST_ITEM_WITH_PHOTO(18),
    LIST_ITEM_WITH_PHOTO_CAROUSEL(R.styleable.AppCompatTheme_textAppearanceListItem),
    LIST_ITEM_COLORED_BACKGROUND_WITH_PHOTO(29),
    LIST_ITEM_WITH_RIGHT_SQUARE_IMAGE(93),
    LIST_ITEM_WITH_DIVIDER(21),
    LIST_ITEM_WRAP_CONTENT_WITH_DIVIDER(23),
    LIST_ITEM_FAINT(64),
    LIST_ITEM_TWO_BUTTONS(96),
    BANNER_SIMPLE(56),
    TILED_ICON_EXPANDER(9),
    TILED_ICON_EXPANDER_WITH_TEXT_MORE_ELEMENT(19),
    TILED_ICON_EXPANDER_WITH_HEADER(24),
    TILED_ICON_WITH_TITLE(80),
    PLACE_SUMMARY(10),
    PLACE_SUMMARY_COMPACT(14),
    PLACE_SUMMARY_COMPACT_WITH_JUSTIFICATIONS(27),
    PLACE_SUMMARY_COMPACT_WITH_DIRECTIONS_ACTION(88),
    PLACE_SUMMARY_COMPACT_WITH_STAR_ACTION(89),
    PLACE_SNIPPET(22),
    PLACE_SNIPPET_CAROUSEL(R.styleable.AppCompatTheme_switchStyle),
    PLACE_SNIPPET_WITH_RIGHT_BUTTON(60),
    PLACE_SNIPPET_WITH_CATEGORY(40),
    PLACE_SNIPPET_WITH_CATEGORY_BLURRED(57),
    PLACE_SUMMARY_COMPACT_WITH_PHOTO(52),
    PLACE_SUMMARY_COMPACT_CAROUSEL(81),
    PLACE_SUMMARY_COMPACT_LIST_PHOTO_OVERLAY(66),
    PLACE_PHOTO_LIST(69),
    PLACE_PHOTO_LIST_SHORT(72),
    PLACE_PHOTO_LIST_SHORT_SCROLLABLE_WITH_LEFT_PADDING(75),
    PLACE_PHOTO_LIST_GALLERY(70),
    PLACE_PHOTO_LIST_GALLERY_2_ITEMS(71),
    PLACE_OR_GENERIC_PHOTO_CAROUSEL_4_ITEMS(76),
    PLACE_TITLE(84),
    PHOTO_LIST_GALLERY(90),
    DIRECTIONS_SUMMARY_COMPACT(43),
    DIRECTIONS_SUMMARY_COMPACT_WITHOUT_DURATION(44),
    BOARDED_TRANSIT_VEHICLE(51),
    PROFILE_SUMMARY_COMPACT(12),
    PROFILE_SUMMARY(15),
    PROFILE_SUMMARY_WITH_PHOTOS_LINK(61),
    PROFILE_ACTIVITY_OPTIONAL_RATING(37),
    PROFILE_ACTIVITY_REVIEW_WITH_RATING(38),
    PROFILE_ACTIVITY_THUMBS_UP_ON_REVIEW(99),
    PROFILE_ACTIVITY_USER_ACTION_BUTTONS(102),
    PROFILE_ACTIVITY_USER_ACTION_BUTTONS_WITH_REACTIONS(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle),
    USER_FACTUAL_EDIT_SNIPPET(97),
    USER_CONTRIBUTION_COUNTER(74),
    KNOWLEDGE_ENTITY_EDIT_SUMMARY(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle),
    RATING_PICKER(39),
    LOCAL_GUIDE_REVIEW_WITH_PADDING(94),
    HEADER_SIMPLE(3),
    HEADER_RIGHT_BODY(82),
    HEADER_BOLD(65),
    HEADER_BOLD_WITH_FOOTER(68),
    HEADER_BOLD_WITH_FOOTER_AND_IMAGE(77),
    HEADER_BOLD_WITH_FOOTER_WRAP_BODY(73),
    HEADER_COLORED_BACKGROUND(4),
    HEADER_COLORED_BACKGROUND_AD(25),
    HEADER_COLORED_BACKGROUND_WITH_AUTHORSHIP(35),
    HEADER_COLORED_BACKGROUND_WITH_CENTERED_TEXT(36),
    HEADER_COLORED_BACKGROUND_WITH_RIGHT_IMAGE(95),
    HEADER_BACKGROUND_IMAGE(5),
    HEADER_BACKGROUND_IMAGE_TALL(42),
    HEADER_BACKGROUND_IMAGE_WITH_HEADLINE(86),
    HEADER_BOTTOM_IMAGE(6),
    HEADER_BOTTOM_IMAGE_AD(26),
    HEADER_BOTTOM_IMAGE_WITH_AUTHORSHIP(31),
    HEADER_BOTTOM_IMAGE_SHORT_WITH_CENTERED_TEXT(32),
    HEADER_BOTTOM_IMAGE_MEDIUM_WITH_CENTERED_TEXT(33),
    HEADER_BOTTOM_IMAGE_TALL_WITH_CENTERED_TEXT(34),
    HEADER_RIGHT_IMAGE_WITH_AUTHORSHIP(105),
    HEADER_TOP_IMAGE_WITH_AUTHORSHIP(100),
    HEADER_TOP_IMAGE_WITH_PADDING(92),
    HEADER_HIGHLIGHTED_TEXT(45),
    FOOTER_SIMPLE(16),
    FOOTER_SIMPLE_WRAP_CONTENT(R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu),
    FOOTER_RIGHT_IMAGE(55),
    FOOTER_EXPAND(17),
    IMAGE_OVERLAID_TEXT(53),
    IMAGE_OVERLAID_TEXT_TWO_LINES(63),
    IMAGE_OVERLAID_TEXT_LEFT_AND_RIGHT(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader),
    IMAGE_OVERLAID_TEXT_WITH_HEADLINE(87),
    OFFLINE_MAP(58),
    IMAGE_BOTTOM_TEXT(54),
    AD_HELP(41),
    LIST_ITEM_MAJOR_ACTION(7),
    LIST_ITEM_MINOR_ACTION(8),
    PROFILE_ACTIVITY(13),
    PLACE_REVIEW_SOCIAL_REVIEW_ATTRIBUTES(46),
    PLACE_REVIEW_OWNER_RESPONSE(47),
    SECTION_HEADER(48),
    SECTION_HEADER_SMALL(104),
    SECTION_HEADER_TITLE_LINK(62),
    NEARBY_STATION_SUMMARY(49),
    NEARBY_STATION_SUMMARY_COMPACT(50),
    NO_NETWORK(59),
    BUTTON_WITH_SECONDARY_TEXT(67),
    TRANSIT_ALERT_SUMMARY(78),
    TRANSIT_SCHEMATIC_MAP_SUMMARY(79),
    PHOTO_GALLERY_ENTRY(83),
    OFFERING_EDIT_SNIPPET(R.styleable.AppCompatTheme_textColorAlertDialogListItem),
    EVERYDAY_TRIPS_DESTINATION_SUMMARY(R.styleable.AppCompatTheme_textColorSearchUrl),
    EXPERIMENTAL_ACTIVITY_PLACE_SUMMARY(1000),
    EXPERIMENTAL_PLACE_SUMMARY_LARGE_WITH_PHOTO(1001),
    EXPERIMENTAL_PLACE_SUMMARY_LARGE_WITH_PHOTO_WITH_DISTANCE(1002),
    EXPERIMENTAL_HEADER_BOLD_WITH_ANIMATED_IMAGE(1003);
    
    public final int bk;

    dulw(int i) {
        this.bk = i;
    }

    public static dulw b(int i) {
        switch (i) {
            case 0:
                return INVALID_STYLE;
            case 1:
                return LIST_ITEM;
            case 2:
                return LIST_ITEM_COMPACT;
            case 3:
                return HEADER_SIMPLE;
            case 4:
                return HEADER_COLORED_BACKGROUND;
            case 5:
                return HEADER_BACKGROUND_IMAGE;
            case 6:
                return HEADER_BOTTOM_IMAGE;
            case 7:
                return LIST_ITEM_MAJOR_ACTION;
            case 8:
                return LIST_ITEM_MINOR_ACTION;
            case 9:
                return TILED_ICON_EXPANDER;
            case 10:
                return PLACE_SUMMARY;
            case 11:
                return BODY_TEXT;
            case 12:
                return PROFILE_SUMMARY_COMPACT;
            case 13:
                return PROFILE_ACTIVITY;
            case 14:
                return PLACE_SUMMARY_COMPACT;
            case 15:
                return PROFILE_SUMMARY;
            case 16:
                return FOOTER_SIMPLE;
            case 17:
                return FOOTER_EXPAND;
            case 18:
                return LIST_ITEM_WITH_PHOTO;
            case 19:
                return TILED_ICON_EXPANDER_WITH_TEXT_MORE_ELEMENT;
            case 20:
                return EXPLORE_ENTRY;
            case 21:
                return LIST_ITEM_WITH_DIVIDER;
            case 22:
                return PLACE_SNIPPET;
            case 23:
                return LIST_ITEM_WRAP_CONTENT_WITH_DIVIDER;
            case 24:
                return TILED_ICON_EXPANDER_WITH_HEADER;
            case 25:
                return HEADER_COLORED_BACKGROUND_AD;
            case 26:
                return HEADER_BOTTOM_IMAGE_AD;
            case 27:
                return PLACE_SUMMARY_COMPACT_WITH_JUSTIFICATIONS;
            case 28:
                return SIGN_IN;
            case 29:
                return LIST_ITEM_COLORED_BACKGROUND_WITH_PHOTO;
            default:
                switch (i) {
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        return HEADER_BOTTOM_IMAGE_WITH_AUTHORSHIP;
                    case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                        return HEADER_BOTTOM_IMAGE_SHORT_WITH_CENTERED_TEXT;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        return HEADER_BOTTOM_IMAGE_MEDIUM_WITH_CENTERED_TEXT;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        return HEADER_BOTTOM_IMAGE_TALL_WITH_CENTERED_TEXT;
                    case 35:
                        return HEADER_COLORED_BACKGROUND_WITH_AUTHORSHIP;
                    case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                        return HEADER_COLORED_BACKGROUND_WITH_CENTERED_TEXT;
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        return PROFILE_ACTIVITY_OPTIONAL_RATING;
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        return PROFILE_ACTIVITY_REVIEW_WITH_RATING;
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        return RATING_PICKER;
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        return PLACE_SNIPPET_WITH_CATEGORY;
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        return AD_HELP;
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        return HEADER_BACKGROUND_IMAGE_TALL;
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        return DIRECTIONS_SUMMARY_COMPACT;
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        return DIRECTIONS_SUMMARY_COMPACT_WITHOUT_DURATION;
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        return HEADER_HIGHLIGHTED_TEXT;
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        return PLACE_REVIEW_SOCIAL_REVIEW_ATTRIBUTES;
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        return PLACE_REVIEW_OWNER_RESPONSE;
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        return SECTION_HEADER;
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        return NEARBY_STATION_SUMMARY;
                    case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                        return NEARBY_STATION_SUMMARY_COMPACT;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        return BOARDED_TRANSIT_VEHICLE;
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        return PLACE_SUMMARY_COMPACT_WITH_PHOTO;
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        return IMAGE_OVERLAID_TEXT;
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        return IMAGE_BOTTOM_TEXT;
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        return FOOTER_RIGHT_IMAGE;
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                        return BANNER_SIMPLE;
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        return PLACE_SNIPPET_WITH_CATEGORY_BLURRED;
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        return OFFLINE_MAP;
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        return NO_NETWORK;
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        return PLACE_SNIPPET_WITH_RIGHT_BUTTON;
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        return PROFILE_SUMMARY_WITH_PHOTOS_LINK;
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        return SECTION_HEADER_TITLE_LINK;
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        return IMAGE_OVERLAID_TEXT_TWO_LINES;
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                        return LIST_ITEM_FAINT;
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        return HEADER_BOLD;
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        return PLACE_SUMMARY_COMPACT_LIST_PHOTO_OVERLAY;
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        return BUTTON_WITH_SECONDARY_TEXT;
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        return HEADER_BOLD_WITH_FOOTER;
                    case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                        return PLACE_PHOTO_LIST;
                    case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                        return PLACE_PHOTO_LIST_GALLERY;
                    case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                        return PLACE_PHOTO_LIST_GALLERY_2_ITEMS;
                    case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                        return PLACE_PHOTO_LIST_SHORT;
                    case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                        return HEADER_BOLD_WITH_FOOTER_WRAP_BODY;
                    case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                        return USER_CONTRIBUTION_COUNTER;
                    case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                        return PLACE_PHOTO_LIST_SHORT_SCROLLABLE_WITH_LEFT_PADDING;
                    case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                        return PLACE_OR_GENERIC_PHOTO_CAROUSEL_4_ITEMS;
                    case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                        return HEADER_BOLD_WITH_FOOTER_AND_IMAGE;
                    case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                        return TRANSIT_ALERT_SUMMARY;
                    case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                        return TRANSIT_SCHEMATIC_MAP_SUMMARY;
                    case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                        return TILED_ICON_WITH_TITLE;
                    case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                        return PLACE_SUMMARY_COMPACT_CAROUSEL;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                        return HEADER_RIGHT_BODY;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                        return PHOTO_GALLERY_ENTRY;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                        return PLACE_TITLE;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                        return BODY_TEXT_WITH_TITLE;
                    case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                        return HEADER_BACKGROUND_IMAGE_WITH_HEADLINE;
                    case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                        return IMAGE_OVERLAID_TEXT_WITH_HEADLINE;
                    case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                        return PLACE_SUMMARY_COMPACT_WITH_DIRECTIONS_ACTION;
                    case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                        return PLACE_SUMMARY_COMPACT_WITH_STAR_ACTION;
                    case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                        return PHOTO_LIST_GALLERY;
                    default:
                        switch (i) {
                            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                                return HEADER_TOP_IMAGE_WITH_PADDING;
                            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                                return LIST_ITEM_WITH_RIGHT_SQUARE_IMAGE;
                            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                                return LOCAL_GUIDE_REVIEW_WITH_PADDING;
                            case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                                return HEADER_COLORED_BACKGROUND_WITH_RIGHT_IMAGE;
                            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                                return LIST_ITEM_TWO_BUTTONS;
                            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                                return USER_FACTUAL_EDIT_SNIPPET;
                            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                                return LIST_ITEM_COMPACT_WITH_BUTTON;
                            case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                                return PROFILE_ACTIVITY_THUMBS_UP_ON_REVIEW;
                            case 100:
                                return HEADER_TOP_IMAGE_WITH_AUTHORSHIP;
                            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                                return PLACE_SNIPPET_CAROUSEL;
                            case 102:
                                return PROFILE_ACTIVITY_USER_ACTION_BUTTONS;
                            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                                return LIST_ITEM_WITH_PHOTO_CAROUSEL;
                            case 104:
                                return SECTION_HEADER_SMALL;
                            case 105:
                                return HEADER_RIGHT_IMAGE_WITH_AUTHORSHIP;
                            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                                return IMAGE_OVERLAID_TEXT_LEFT_AND_RIGHT;
                            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                                return KNOWLEDGE_ENTITY_EDIT_SUMMARY;
                            case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                                return PROFILE_ACTIVITY_USER_ACTION_BUTTONS_WITH_REACTIONS;
                            case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                                return FOOTER_SIMPLE_WRAP_CONTENT;
                            case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                                return OFFERING_EDIT_SNIPPET;
                            case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                                return EVERYDAY_TRIPS_DESTINATION_SUMMARY;
                            default:
                                switch (i) {
                                    case 1000:
                                        return EXPERIMENTAL_ACTIVITY_PLACE_SUMMARY;
                                    case 1001:
                                        return EXPERIMENTAL_PLACE_SUMMARY_LARGE_WITH_PHOTO;
                                    case 1002:
                                        return EXPERIMENTAL_PLACE_SUMMARY_LARGE_WITH_PHOTO_WITH_DISTANCE;
                                    case 1003:
                                        return EXPERIMENTAL_HEADER_BOLD_WITH_ANIMATED_IMAGE;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static dsrd c() {
        return dulv.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.bk;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.bk);
    }
}
