package defpackage;
/* compiled from: PG */
/* renamed from: uil  reason: default package */
/* loaded from: classes4.dex */
public final class uil implements aopr {
    private final /* synthetic */ int a;

    public uil() {
    }

    public uil(int i) {
        this.a = i;
    }

    @Override // defpackage.aopr
    public final /* bridge */ /* synthetic */ Object convert(Object obj) {
        switch (this.a) {
            case 0:
                aomi a = aomi.a(((Integer) obj).intValue());
                return a == null ? aomi.REGISTRATION_REASON_UNSPECIFIED : a;
            case 1:
                aomb a2 = aomb.a(((Integer) obj).intValue());
                return a2 == null ? aomb.FETCH_REASON_UNSPECIFIED : a2;
            case 2:
                alze a3 = alze.a(((Integer) obj).intValue());
                return a3 == null ? alze.OWNER_USER_TYPE_UNKNOWN : a3;
            case 3:
                aout b = aout.b(((Integer) obj).intValue());
                return b == null ? aout.SUBTYPE_NONE : b;
            case 4:
                aosz b2 = aosz.b(((Integer) obj).intValue());
                return b2 == null ? aosz.CB_NONE : b2;
            case 5:
                aosz b3 = aosz.b(((Integer) obj).intValue());
                return b3 == null ? aosz.CB_NONE : b3;
            case 6:
                aovh b4 = aovh.b(((Integer) obj).intValue());
                return b4 == null ? aovh.ABOUT_THIS_AD_CALLBACK_ACTION_UNSPECIFIED : b4;
            case 7:
                aovv b5 = aovv.b(((Integer) obj).intValue());
                return b5 == null ? aovv.ACCESSIBILITY_SERVICE_TYPES_UNSPECIFIED : b5;
            case 8:
                aoxn b6 = aoxn.b(((Integer) obj).intValue());
                return b6 == null ? aoxn.REGISTERED_GAIA_SERVICES_UNSPECIFIED : b6;
            case 9:
                apel b7 = apel.b(((Integer) obj).intValue());
                return b7 == null ? apel.ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_UNKNOWN : b7;
            case 10:
                apgb b8 = apgb.b(((Integer) obj).intValue());
                return b8 == null ? apgb.ANDROID_NON_CRITICAL_SCHEDULER_INITIALIZATION_BLOCK_UNKNOWN : b8;
            case 11:
                apgb b9 = apgb.b(((Integer) obj).intValue());
                return b9 == null ? apgb.ANDROID_NON_CRITICAL_SCHEDULER_INITIALIZATION_BLOCK_UNKNOWN : b9;
            case 12:
                apkc b10 = apkc.b(((Integer) obj).intValue());
                return b10 == null ? apkc.BACKGROUND_PLAYBACK_BUTTON_TYPE_UNKNOWN : b10;
            case 13:
                aoxn b11 = aoxn.b(((Integer) obj).intValue());
                return b11 == null ? aoxn.REGISTERED_GAIA_SERVICES_UNSPECIFIED : b11;
            case 14:
                attl b12 = attl.b(((Integer) obj).intValue());
                return b12 == null ? attl.UNKNOWN_FORMAT_TYPE : b12;
            case 15:
                apwf b13 = apwf.b(((Integer) obj).intValue());
                return b13 == null ? apwf.CONN_DEFAULT : b13;
            case 16:
                athb b14 = athb.b(((Integer) obj).intValue());
                return b14 == null ? athb.MOBILE_CONNECTION_TYPE_UNKNOWN : b14;
            case 17:
                aqvi b15 = aqvi.b(((Integer) obj).intValue());
                return b15 == null ? aqvi.ENGAGEMENT_PANEL_SNAP_STATE_UNKNOWN : b15;
            case 18:
                aqws b16 = aqws.b(((Integer) obj).intValue());
                return b16 == null ? aqws.EXO_PLAYER_CONFIG_FEATURES_UNSPECIFIED : b16;
            case 19:
                aqwv b17 = aqwv.b(((Integer) obj).intValue());
                return b17 == null ? aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_UNSPECIFIED : b17;
            default:
                ason b18 = ason.b(((Integer) obj).intValue());
                return b18 == null ? ason.UNKNOWN : b18;
        }
    }
}
