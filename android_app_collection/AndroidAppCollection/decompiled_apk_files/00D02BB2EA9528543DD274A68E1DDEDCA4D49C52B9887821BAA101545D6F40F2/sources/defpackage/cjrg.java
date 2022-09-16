package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cjrg  reason: default package */
/* loaded from: classes4.dex */
class cjrg implements dbrn<dnow, dpkj> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ dpkj a(dnow dnowVar) {
        dnow dnowVar2 = dnowVar;
        dnow dnowVar3 = dnow.PRIMARY_RESULT;
        switch (dnowVar2.ordinal()) {
            case 0:
                return dpkj.PRIMARY_RESULT;
            case 1:
                return dpkj.SECONDARY_RESULT;
            case 2:
                return dpkj.MINOR_RESULT;
            case 3:
                return dpkj.RELATED_PLACE;
            case 4:
                return dpkj.AREA_RESULT;
            case 5:
                return dpkj.NORMAL_RESULT;
            case 6:
                return dpkj.AD_TIER_1;
            case 7:
                return dpkj.AD_TIER_2;
            case 8:
                return dpkj.AD_TIER_3;
            case 9:
                return dpkj.AD_NOT_RENDERED;
            case 10:
                return dpkj.PROMOTED_OFFER;
            case 11:
                return dpkj.DEPRECATED_14;
            case 12:
                return dpkj.DEPRECATED_15;
            case 13:
                return dpkj.DEPRECATED_16;
            case 14:
                return dpkj.DEPRECATED_17;
            case 15:
                return dpkj.DEPRECATED_18;
            case 16:
                return dpkj.PROMOTED_LISTING;
            case 17:
                return dpkj.RELATED_PLACE_SECONDARY;
            case 18:
                return dpkj.GENERIC_INTERACTIVE;
            case 19:
                return dpkj.INCIDENT_ROAD_CLOSED;
            case 20:
                return dpkj.INCIDENT_ACCIDENT;
            case 21:
                return dpkj.INCIDENT_CONSTRUCTION;
            case 22:
                return dpkj.INCIDENT_OTHER;
            case 23:
                return dpkj.INCIDENT_SPEED_TRAP;
            case 24:
                return dpkj.SPOTLIT_PIN;
            case 25:
                return dpkj.DEPRECATED_INLINE_AD;
            case 26:
                return dpkj.PROMOTED_FEATURE;
            case 27:
                return dpkj.CHAIN_AD;
            case 28:
                return dpkj.CHAIN_AD_COUNTERFACTUAL;
            case 29:
                return dpkj.PROMOTED_POI;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return dpkj.LODGING;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return dpkj.PICO_PINLET;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return dpkj.ANNOTATED;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return dpkj.BOOSTED;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return dpkj.PROMOTED_AGGREGATOR;
            case 35:
                return dpkj.PROMOTED_MANUFACTURER;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return dpkj.PROMOTED_LOGOLESS_FIRST_PARTY;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return dpkj.STREAMING_SEARCH_RESULT;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return dpkj.INJECTED_SEARCH_RESULT;
            default:
                String valueOf = String.valueOf(dnowVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown enum value: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
