package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dpkj  reason: default package */
/* loaded from: classes6.dex */
public enum dpkj implements dsrb {
    UNKNOWN_APPEARANCE(0),
    PRIMARY_RESULT(1),
    SECONDARY_RESULT(2),
    MINOR_RESULT(3),
    RELATED_PLACE(4),
    AREA_RESULT(5),
    NORMAL_RESULT(6),
    AD_TIER_1(9),
    AD_TIER_2(10),
    AD_TIER_3(11),
    AD_NOT_RENDERED(12),
    PROMOTED_OFFER(13),
    DEPRECATED_14(14),
    DEPRECATED_15(15),
    DEPRECATED_16(16),
    DEPRECATED_17(17),
    DEPRECATED_18(18),
    PROMOTED_LISTING(19),
    RELATED_PLACE_SECONDARY(20),
    GENERIC_INTERACTIVE(21),
    INCIDENT_ROAD_CLOSED(22),
    INCIDENT_ACCIDENT(23),
    INCIDENT_CONSTRUCTION(24),
    INCIDENT_OTHER(25),
    INCIDENT_SPEED_TRAP(35),
    SPOTLIT_PIN(26),
    DEPRECATED_INLINE_AD(27),
    PROMOTED_FEATURE(28),
    CHAIN_AD(29),
    CHAIN_AD_COUNTERFACTUAL(30),
    PROMOTED_POI(31),
    LODGING(32),
    PICO_PINLET(33),
    ANNOTATED(34),
    BOOSTED(36),
    PROMOTED_AGGREGATOR(37),
    PROMOTED_MANUFACTURER(38),
    PROMOTED_LOGOLESS_FIRST_PARTY(39),
    STREAMING_SEARCH_RESULT(40),
    INJECTED_SEARCH_RESULT(41);
    
    public final int O;

    dpkj(int i) {
        this.O = i;
    }

    public static dpkj b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_APPEARANCE;
            case 1:
                return PRIMARY_RESULT;
            case 2:
                return SECONDARY_RESULT;
            case 3:
                return MINOR_RESULT;
            case 4:
                return RELATED_PLACE;
            case 5:
                return AREA_RESULT;
            case 6:
                return NORMAL_RESULT;
            case 7:
            case 8:
            default:
                return null;
            case 9:
                return AD_TIER_1;
            case 10:
                return AD_TIER_2;
            case 11:
                return AD_TIER_3;
            case 12:
                return AD_NOT_RENDERED;
            case 13:
                return PROMOTED_OFFER;
            case 14:
                return DEPRECATED_14;
            case 15:
                return DEPRECATED_15;
            case 16:
                return DEPRECATED_16;
            case 17:
                return DEPRECATED_17;
            case 18:
                return DEPRECATED_18;
            case 19:
                return PROMOTED_LISTING;
            case 20:
                return RELATED_PLACE_SECONDARY;
            case 21:
                return GENERIC_INTERACTIVE;
            case 22:
                return INCIDENT_ROAD_CLOSED;
            case 23:
                return INCIDENT_ACCIDENT;
            case 24:
                return INCIDENT_CONSTRUCTION;
            case 25:
                return INCIDENT_OTHER;
            case 26:
                return SPOTLIT_PIN;
            case 27:
                return DEPRECATED_INLINE_AD;
            case 28:
                return PROMOTED_FEATURE;
            case 29:
                return CHAIN_AD;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return CHAIN_AD_COUNTERFACTUAL;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return PROMOTED_POI;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return LODGING;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return PICO_PINLET;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return ANNOTATED;
            case 35:
                return INCIDENT_SPEED_TRAP;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return BOOSTED;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return PROMOTED_AGGREGATOR;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return PROMOTED_MANUFACTURER;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return PROMOTED_LOGOLESS_FIRST_PARTY;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return STREAMING_SEARCH_RESULT;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return INJECTED_SEARCH_RESULT;
        }
    }

    public static dsrd c() {
        return dpki.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.O;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.O);
    }
}
