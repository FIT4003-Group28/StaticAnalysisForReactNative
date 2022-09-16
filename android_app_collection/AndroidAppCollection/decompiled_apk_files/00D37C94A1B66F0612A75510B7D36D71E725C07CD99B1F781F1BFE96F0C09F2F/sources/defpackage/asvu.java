package defpackage;
/* compiled from: PG */
/* renamed from: asvu  reason: default package */
/* loaded from: classes2.dex */
public final class asvu implements aopr {
    private final /* synthetic */ int a;

    public asvu() {
    }

    public asvu(int i) {
        this.a = i;
    }

    @Override // defpackage.aopr
    public final /* bridge */ /* synthetic */ Object convert(Object obj) {
        switch (this.a) {
            case 0:
                aswa b = aswa.b(((Integer) obj).intValue());
                return b == null ? aswa.LOGGING_QUEUE_TYPE_UNKNOWN : b;
            case 1:
                atru b2 = atru.b(((Integer) obj).intValue());
                return b2 == null ? atru.OFFLINE_REFRESH_ACTION_UNKNOWN : b2;
            case 2:
                atcl b3 = atcl.b(((Integer) obj).intValue());
                return b3 == null ? atcl.DAY_OF_WEEK_UNKNOWN : b3;
            case 3:
                atra b4 = atra.b(((Integer) obj).intValue());
                return b4 == null ? atra.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_UNKNOWN : b4;
            case 4:
                apwf b5 = apwf.b(((Integer) obj).intValue());
                return b5 == null ? apwf.CONN_DEFAULT : b5;
            case 5:
                apgc b6 = apgc.b(((Integer) obj).intValue());
                return b6 == null ? apgc.ANDROID_ONESIE_HOT_CONFIG_FEATURES_UNKNOWN : b6;
            case 6:
                atyc b7 = atyc.b(((Integer) obj).intValue());
                return b7 == null ? atyc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_UNKNOWN : b7;
            case 7:
                aucb b8 = aucb.b(((Integer) obj).intValue());
                return b8 == null ? aucb.UNKNOWN : b8;
            case 8:
                auju b9 = auju.b(((Integer) obj).intValue());
                return b9 == null ? auju.QOE_HOT_CONFIG_FEATURES_UNSPECIFIED : b9;
            case 9:
                avxv b10 = avxv.b(((Integer) obj).intValue());
                return b10 == null ? avxv.EFFECTS_FEATURE_UNKNOWN : b10;
            case 10:
                awal b11 = awal.b(((Integer) obj).intValue());
                return b11 == null ? awal.UNKNOWN : b11;
            case 11:
                awzv b12 = awzv.b(((Integer) obj).intValue());
                return b12 == null ? awzv.CHANNEL_MENTION_STYLE_UNSPECIFIED : b12;
            case 12:
                axaa b13 = axaa.b(((Integer) obj).intValue());
                return b13 == null ? axaa.COMMENT_STYLE_UNSPECIFIED : b13;
            case 13:
                axae b14 = axae.b(((Integer) obj).intValue());
                return b14 == null ? axae.DAY_OF_WEEK_STYLE_UNSPECIFIED : b14;
            case 14:
                axbb b15 = axbb.b(((Integer) obj).intValue());
                return b15 == null ? axbb.LOCATION_STYLE_UNSPECIFIED : b15;
            case 15:
                auuv b16 = auuv.b(((Integer) obj).intValue());
                return b16 == null ? auuv.SHORTS_CREATION_SURFACE_UNKNOWN : b16;
            default:
                aotd b17 = aotd.b(((Integer) obj).intValue());
                return b17 == null ? aotd.UC_DEFAULT : b17;
        }
    }
}
