package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dnmu  reason: default package */
/* loaded from: classes.dex */
public enum dnmu implements dsrb {
    PROPERTY_UNKNOWN(0),
    PROPERTY_GOOGLE(1),
    PROPERTY_HOTELS(74),
    PROPERTY_GMM_OLD(78),
    PROPERTY_GMM(89),
    PROPERTY_TACTILE(81),
    PROPERTY_TACTILE_EMBED(90),
    PROPERTY_HANGOUTS(93),
    PROPERTY_MAPS_ACTIVITIES(94),
    PROPERTY_EARTH(96),
    PROPERTY_MAPS_API_V3(98),
    PROPERTY_CUSTOM_ANALYSIS(100),
    PROPERTY_GOOGLE_PLUS_LOCAL(R.styleable.AppCompatTheme_switchStyle),
    PROPERTY_PLACES_API(R.styleable.AppCompatTheme_textAppearanceListItem),
    PROPERTY_LOCAL_ACTIONS_BATCH(104),
    PROPERTY_MAPS_LITE_DESKTOP(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle),
    PROPERTY_MAPS_LITE_MOBILE(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle),
    PROPERTY_GOOGLE_NOW(R.styleable.AppCompatTheme_textColorSearchUrl),
    PROPERTY_REVIEWS_WIDGET(R.styleable.AppCompatTheme_toolbarNavigationButtonStyle),
    PROPERTY_REVIEWS_WIDGET_BASIC_HTML(127),
    PROPERTY_BIGTOP(R.styleable.AppCompatTheme_toolbarStyle),
    PROPERTY_GEOCODING_API(R.styleable.AppCompatTheme_tooltipForegroundColor),
    PROPERTY_IMAGERY_VIEWER(R.styleable.AppCompatTheme_tooltipFrameBackground),
    PROPERTY_TRAVEL_HOTELS_GCS_REVIEWS_BATCH(R.styleable.AppCompatTheme_viewInflaterClass),
    PROPERTY_GOOGLE_MY_BUSINESS(R.styleable.AppCompatTheme_windowFixedHeightMajor),
    PROPERTY_GOOGLE_MY_BUSINESS_API(R.styleable.AppCompatTheme_windowMinWidthMajor),
    PROPERTY_LOCAL_SEARCH_UI_OWNER_REPLY(146),
    PROPERTY_GOOGLE_MY_BUSINESS_DASHBOARD(147),
    PROPERTY_GOOGLE_MY_BUSINESS_REVIEWS_CENTRE(148),
    PROPERTY_GOOGLE_MY_BUSINESS_ANDROID(149),
    PROPERTY_GOOGLE_MY_BUSINESS_IOS(150),
    PROPERTY_NOTIFICATIONS_BATCH(R.styleable.AppCompatTheme_windowFixedWidthMajor),
    PROPERTY_ASSISTANT(R.styleable.AppCompatTheme_windowMinWidthMinor),
    PROPERTY_ONTHEGO(128),
    PROPERTY_GEO_METRIC(129),
    PROPERTY_PRESTO(131),
    PROPERTY_IOS_GSA(132),
    PROPERTY_PLACE_QA_NOTIFICATIONS(134),
    PROPERTY_GEO_AR(135),
    PROPERTY_MERCHANT_NOTIFICATIONS_GSA(138),
    PROPERTY_MAPS_LITE_PWA(140),
    PROPERTY_GEO_DISCOVERY_NOTIFICATION(143),
    PROPERTY_ANDROID_ONBOARDING(151),
    PROPERTY_RIDDLER_FOLLOW_ON(152),
    PROPERTY_GEO_DISCOVERY_EXEMPLAR_FLOW(153),
    PROPERTY_TAKEOUT(154),
    PROPERTY_LOCAL_SERVICES_API(156),
    PROPERTY_USER_POSTS_RAP(157),
    PROPERTY_GEO_REVIEW_AT_A_PLACE_NOTIFICATION(158),
    PROPERTY_MY_ACCOUNT_DASHBOARD(160),
    PROPERTY_HOTELS_SEARCH(161),
    PROPERTY_MAPS_COMPANION(162),
    PROPERTY_ADS_INTEGRITY(163),
    PROPERTY_LENS_APP(164),
    PROPERTY_UGC_BADGES(165),
    PROPERTY_GEO_SERVICE_RECOMMENDATION_POST_INTERACTION_NOTIFICATION(167),
    PROPERTY_INTERNAL_TESTING(168),
    PROPERTY_MAPS_PERSONALIZATION_SERVER(169),
    PROPERTY_TRAVEL_DESTINATIONS(170),
    PROPERTY_CHATTY_QUOTES(171),
    PROPERTY_GEO_UGC_CONTENT_FEEDBACK(174),
    PROPERTY_GEO_PEOPLE_FOLLOW(176),
    PROPERTY_POST_REVIEW_THUMBS_UP_NOTIFICATION(177),
    PROPERTY_ADS_BATCH(181),
    PROPERTY_ROADS_UGC_EDITOR(184),
    PROPERTY_PHOTOS(32),
    PROPERTY_GMB_REVIEWS_SUPPORT_SERVICE(185);
    
    public final int ap;

    dnmu(int i) {
        this.ap = i;
    }

    public static dnmu b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PROPERTY_GOOGLE;
            }
            if (i == 89) {
                return PROPERTY_GMM;
            }
            if (i == 90) {
                return PROPERTY_TACTILE_EMBED;
            }
            if (i == 93) {
                return PROPERTY_HANGOUTS;
            }
            if (i == 94) {
                return PROPERTY_MAPS_ACTIVITIES;
            }
            if (i == 100) {
                return PROPERTY_CUSTOM_ANALYSIS;
            }
            if (i == 101) {
                return PROPERTY_GOOGLE_PLUS_LOCAL;
            }
            if (i == 103) {
                return PROPERTY_PLACES_API;
            }
            if (i == 104) {
                return PROPERTY_LOCAL_ACTIONS_BATCH;
            }
            if (i == 107) {
                return PROPERTY_MAPS_LITE_DESKTOP;
            }
            if (i == 108) {
                return PROPERTY_MAPS_LITE_MOBILE;
            }
            if (i == 124) {
                return PROPERTY_GOOGLE_MY_BUSINESS_API;
            }
            if (i == 125) {
                return PROPERTY_ASSISTANT;
            }
            if (i == 131) {
                return PROPERTY_PRESTO;
            }
            if (i == 132) {
                return PROPERTY_IOS_GSA;
            }
            switch (i) {
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    return PROPERTY_PHOTOS;
                case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                    return PROPERTY_HOTELS;
                case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                    return PROPERTY_GMM_OLD;
                case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                    return PROPERTY_TACTILE;
                case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                    return PROPERTY_EARTH;
                case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                    return PROPERTY_MAPS_API_V3;
                case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                    return PROPERTY_GOOGLE_NOW;
                case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                    return PROPERTY_REVIEWS_WIDGET;
                case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                    return PROPERTY_BIGTOP;
                case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                    return PROPERTY_GEOCODING_API;
                case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                    return PROPERTY_IMAGERY_VIEWER;
                case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                    return PROPERTY_TRAVEL_HOTELS_GCS_REVIEWS_BATCH;
                case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                    return PROPERTY_GOOGLE_MY_BUSINESS;
                case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                    return PROPERTY_NOTIFICATIONS_BATCH;
                case 134:
                    return PROPERTY_PLACE_QA_NOTIFICATIONS;
                case 135:
                    return PROPERTY_GEO_AR;
                case 138:
                    return PROPERTY_MERCHANT_NOTIFICATIONS_GSA;
                case 140:
                    return PROPERTY_MAPS_LITE_PWA;
                case 143:
                    return PROPERTY_GEO_DISCOVERY_NOTIFICATION;
                case 146:
                    return PROPERTY_LOCAL_SEARCH_UI_OWNER_REPLY;
                case 147:
                    return PROPERTY_GOOGLE_MY_BUSINESS_DASHBOARD;
                case 148:
                    return PROPERTY_GOOGLE_MY_BUSINESS_REVIEWS_CENTRE;
                case 149:
                    return PROPERTY_GOOGLE_MY_BUSINESS_ANDROID;
                case 150:
                    return PROPERTY_GOOGLE_MY_BUSINESS_IOS;
                case 151:
                    return PROPERTY_ANDROID_ONBOARDING;
                case 152:
                    return PROPERTY_RIDDLER_FOLLOW_ON;
                case 153:
                    return PROPERTY_GEO_DISCOVERY_EXEMPLAR_FLOW;
                case 154:
                    return PROPERTY_TAKEOUT;
                case 156:
                    return PROPERTY_LOCAL_SERVICES_API;
                case 157:
                    return PROPERTY_USER_POSTS_RAP;
                case 158:
                    return PROPERTY_GEO_REVIEW_AT_A_PLACE_NOTIFICATION;
                case 160:
                    return PROPERTY_MY_ACCOUNT_DASHBOARD;
                case 161:
                    return PROPERTY_HOTELS_SEARCH;
                case 162:
                    return PROPERTY_MAPS_COMPANION;
                case 163:
                    return PROPERTY_ADS_INTEGRITY;
                case 164:
                    return PROPERTY_LENS_APP;
                case 165:
                    return PROPERTY_UGC_BADGES;
                case 167:
                    return PROPERTY_GEO_SERVICE_RECOMMENDATION_POST_INTERACTION_NOTIFICATION;
                case 168:
                    return PROPERTY_INTERNAL_TESTING;
                case 169:
                    return PROPERTY_MAPS_PERSONALIZATION_SERVER;
                case 170:
                    return PROPERTY_TRAVEL_DESTINATIONS;
                case 171:
                    return PROPERTY_CHATTY_QUOTES;
                case 174:
                    return PROPERTY_GEO_UGC_CONTENT_FEEDBACK;
                case 176:
                    return PROPERTY_GEO_PEOPLE_FOLLOW;
                case 177:
                    return PROPERTY_POST_REVIEW_THUMBS_UP_NOTIFICATION;
                case 181:
                    return PROPERTY_ADS_BATCH;
                case 184:
                    return PROPERTY_ROADS_UGC_EDITOR;
                case 185:
                    return PROPERTY_GMB_REVIEWS_SUPPORT_SERVICE;
                default:
                    switch (i) {
                        case 127:
                            return PROPERTY_REVIEWS_WIDGET_BASIC_HTML;
                        case 128:
                            return PROPERTY_ONTHEGO;
                        case 129:
                            return PROPERTY_GEO_METRIC;
                        default:
                            return null;
                    }
            }
        }
        return PROPERTY_UNKNOWN;
    }

    public static dsrd c() {
        return dnmt.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.ap;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.ap);
    }
}
