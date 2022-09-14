package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: ddjr  reason: default package */
/* loaded from: classes.dex */
public enum ddjr implements dsrb {
    NONE(0),
    UNKNOWN(1),
    WEB_SEARCH(2),
    WEB_SEARCH_VOICE(3),
    GOOGLE_NOW_NAVIGATION(4),
    GOOGLE_NOW_COMMUTE_NOTIFICATION(14),
    GOOGLE_NOW_LOCAL_DISCOVERY(6),
    DIRECTIONS_WIDGET(5),
    ENROUTE(7),
    FOZZY_PARSE(8),
    FREE_NAV_LAUNCHER_SHORTCUT(9),
    FREE_NAV_DRIVING_NOTIFICATION(10),
    FREE_NAV_BY_VOICE(11),
    NAVIGATE_NFC_BEAM(12),
    EMAIL_FOR_LOCAL_DISCOVERY(13),
    EMAIL_UGC_IMPACT(26),
    TRAFFIC_HUB_LAUNCHER_SHORTCUT(15),
    TRAFFIC_HUB_AREA_TRAFFIC_WARM_UP_NOTIFICATION(16),
    TRAFFIC_HUB_AREA_TRAFFIC_NOTIFICATION(17),
    TRAFFIC_HUB_COMMUTE_AREA_TRAFFIC_NOTIFICATION(25),
    TRAFFIC_HUB_TRAFFIC_INCIDENT_NOTIFICATION(18),
    CAR_OVERVIEW_ODELAY(19),
    CAR_OVERVIEW_IMPLICIT_DESTINATIONS(20),
    CAR_OVERVIEW_OFFLINE(22),
    GSA_OFFLINE_SEARCH(21),
    GMAIL_LINKIFIED_ADDRESS(23),
    GMM_COPIED_LINK_CARD(24),
    IGMM_IMESSAGE(27),
    LOCAL_GUIDES_IN_APP_CAMPAIGN(28),
    YOUTUBE(29),
    MAPS_LITE(30),
    YOUTUBE_WATCH(31),
    GMM_PLACE_SHARE(32);
    
    public final int H;

    ddjr(int i) {
        this.H = i;
    }

    public static ddjr b(int i) {
        switch (i) {
            case 0:
                return NONE;
            case 1:
                return UNKNOWN;
            case 2:
                return WEB_SEARCH;
            case 3:
                return WEB_SEARCH_VOICE;
            case 4:
                return GOOGLE_NOW_NAVIGATION;
            case 5:
                return DIRECTIONS_WIDGET;
            case 6:
                return GOOGLE_NOW_LOCAL_DISCOVERY;
            case 7:
                return ENROUTE;
            case 8:
                return FOZZY_PARSE;
            case 9:
                return FREE_NAV_LAUNCHER_SHORTCUT;
            case 10:
                return FREE_NAV_DRIVING_NOTIFICATION;
            case 11:
                return FREE_NAV_BY_VOICE;
            case 12:
                return NAVIGATE_NFC_BEAM;
            case 13:
                return EMAIL_FOR_LOCAL_DISCOVERY;
            case 14:
                return GOOGLE_NOW_COMMUTE_NOTIFICATION;
            case 15:
                return TRAFFIC_HUB_LAUNCHER_SHORTCUT;
            case 16:
                return TRAFFIC_HUB_AREA_TRAFFIC_WARM_UP_NOTIFICATION;
            case 17:
                return TRAFFIC_HUB_AREA_TRAFFIC_NOTIFICATION;
            case 18:
                return TRAFFIC_HUB_TRAFFIC_INCIDENT_NOTIFICATION;
            case 19:
                return CAR_OVERVIEW_ODELAY;
            case 20:
                return CAR_OVERVIEW_IMPLICIT_DESTINATIONS;
            case 21:
                return GSA_OFFLINE_SEARCH;
            case 22:
                return CAR_OVERVIEW_OFFLINE;
            case 23:
                return GMAIL_LINKIFIED_ADDRESS;
            case 24:
                return GMM_COPIED_LINK_CARD;
            case 25:
                return TRAFFIC_HUB_COMMUTE_AREA_TRAFFIC_NOTIFICATION;
            case 26:
                return EMAIL_UGC_IMPACT;
            case 27:
                return IGMM_IMESSAGE;
            case 28:
                return LOCAL_GUIDES_IN_APP_CAMPAIGN;
            case 29:
                return YOUTUBE;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return MAPS_LITE;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return YOUTUBE_WATCH;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return GMM_PLACE_SHARE;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return ddjq.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.H;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.H);
    }
}
