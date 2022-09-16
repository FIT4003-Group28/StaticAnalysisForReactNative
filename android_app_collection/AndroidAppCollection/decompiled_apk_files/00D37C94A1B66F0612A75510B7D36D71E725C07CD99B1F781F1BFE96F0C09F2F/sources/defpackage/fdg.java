package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import java.util.List;
/* compiled from: PG */
/* renamed from: fdg  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fdg implements vlp {
    private final /* synthetic */ int v;
    public static final /* synthetic */ fdg u = new fdg(20);
    public static final /* synthetic */ fdg t = new fdg(19);
    public static final /* synthetic */ fdg s = new fdg(18);
    public static final /* synthetic */ fdg r = new fdg(17);
    public static final /* synthetic */ fdg q = new fdg(16);
    public static final /* synthetic */ fdg p = new fdg(15);
    public static final /* synthetic */ fdg o = new fdg(14);
    public static final /* synthetic */ fdg n = new fdg(13);
    public static final /* synthetic */ fdg m = new fdg(12);
    public static final /* synthetic */ fdg l = new fdg(11);
    public static final /* synthetic */ fdg k = new fdg(10);
    public static final /* synthetic */ fdg j = new fdg(9);
    public static final /* synthetic */ fdg i = new fdg(8);
    public static final /* synthetic */ fdg h = new fdg(7);
    public static final /* synthetic */ fdg g = new fdg(6);
    public static final /* synthetic */ fdg f = new fdg(5);
    public static final /* synthetic */ fdg e = new fdg(4);
    public static final /* synthetic */ fdg d = new fdg(3);
    public static final /* synthetic */ fdg c = new fdg(2);
    public static final /* synthetic */ fdg b = new fdg(1);
    public static final /* synthetic */ fdg a = new fdg();

    private /* synthetic */ fdg() {
    }

    private /* synthetic */ fdg(int i2) {
        this.v = i2;
    }

    @Override // defpackage.vlp
    public final aoqu a(vlq vlqVar, aoqu aoquVar) {
        int i2 = 0;
        switch (this.v) {
            case 0:
                amvn amvnVar = fdl.a;
                aopa mo52toBuilder = ((fda) aoquVar).mo52toBuilder();
                fdl.f(mo52toBuilder, new fdd(vlqVar, 3), new fdd(vlqVar, 2), new fdd(vlqVar), new fdi(vlqVar));
                return (fda) mo52toBuilder.mo39build();
            case 1:
                amvn amvnVar2 = fdl.a;
                aopa mo52toBuilder2 = ((fcy) aoquVar).mo52toBuilder();
                fdl.g(mo52toBuilder2, new fdd(vlqVar, 3), new fdd(vlqVar), new fdi(vlqVar));
                return (fcy) mo52toBuilder2.mo39build();
            case 2:
                fgl fglVar = (fgl) aoquVar;
                aopa createBuilder = fgl.a.createBuilder();
                if (vlqVar.e(etk.AUTONAV_TOGGLE_USER_EDU_TRIGGERS_REMAINING)) {
                    int a2 = vlqVar.a(etk.AUTONAV_TOGGLE_USER_EDU_TRIGGERS_REMAINING, 1);
                    createBuilder.copyOnWrite();
                    fgl fglVar2 = (fgl) createBuilder.instance;
                    fglVar2.b |= 1;
                    fglVar2.c = a2;
                }
                return (fgl) createBuilder.mo39build();
            case 3:
                fng fngVar = (fng) aoquVar;
                String[] strArr = fnd.a;
                return fng.a;
            case 4:
                aopa mo52toBuilder3 = ((hwp) aoquVar).mo52toBuilder();
                int a3 = vlqVar.a("TEXT_COLOR", 0);
                mo52toBuilder3.copyOnWrite();
                ((hwp) mo52toBuilder3.instance).g = a3;
                int a4 = vlqVar.a("BACKGROUND_COLOR", 0);
                mo52toBuilder3.copyOnWrite();
                ((hwp) mo52toBuilder3.instance).h = a4;
                int a5 = vlqVar.a("ALIGNMENT", 4);
                mo52toBuilder3.copyOnWrite();
                ((hwp) mo52toBuilder3.instance).i = a5;
                int a6 = vlqVar.a("FONT_FAMILY", 0);
                mo52toBuilder3.copyOnWrite();
                ((hwp) mo52toBuilder3.instance).j = a6;
                return (hwp) mo52toBuilder3.mo39build();
            case 5:
                aopa mo52toBuilder4 = ((hwp) aoquVar).mo52toBuilder();
                String d2 = vlqVar.d("MOST_RECENT_PRESET_EFFECT_ID", null);
                mo52toBuilder4.copyOnWrite();
                d2.getClass();
                ((hwp) mo52toBuilder4.instance).k = d2;
                return (hwp) mo52toBuilder4.mo39build();
            case 6:
                aopa mo52toBuilder5 = ((hwp) aoquVar).mo52toBuilder();
                String d3 = vlqVar.d("recent_stickers", null);
                mo52toBuilder5.copyOnWrite();
                d3.getClass();
                ((hwp) mo52toBuilder5.instance).m = d3;
                return (hwp) mo52toBuilder5.mo39build();
            case 7:
                aopa mo52toBuilder6 = ((hwp) aoquVar).mo52toBuilder();
                boolean f2 = vlqVar.f("REEL_WELCOME_V2_ALREADY_SEEN", false);
                mo52toBuilder6.copyOnWrite();
                ((hwp) mo52toBuilder6.instance).n = f2;
                return (hwp) mo52toBuilder6.mo39build();
            case 8:
                llo lloVar = (llo) aoquVar;
                String[] strArr2 = llp.a;
                aopa mo52toBuilder7 = lloVar.mo52toBuilder();
                lln llnVar = lloVar.c;
                if (llnVar == null) {
                    llnVar = lln.a;
                }
                aopa mo52toBuilder8 = llnVar.mo52toBuilder();
                if (vlqVar.e(etk.PIP_POLICY)) {
                    boolean f3 = vlqVar.f(etk.PIP_POLICY, true);
                    mo52toBuilder8.copyOnWrite();
                    lln llnVar2 = (lln) mo52toBuilder8.instance;
                    llnVar2.b |= 1;
                    llnVar2.c = f3;
                }
                mo52toBuilder7.copyOnWrite();
                llo lloVar2 = (llo) mo52toBuilder7.instance;
                lln llnVar3 = (lln) mo52toBuilder8.mo39build();
                llnVar3.getClass();
                lloVar2.c = llnVar3;
                lloVar2.b |= 1;
                return (llo) mo52toBuilder7.mo39build();
            case 9:
                nwo nwoVar = (nwo) aoquVar;
                fdd fddVar = new fdd(vlqVar, 4);
                fdd fddVar2 = new fdd(vlqVar, 5);
                fdi fdiVar = new fdi(vlqVar, 2);
                amum amumVar = new amum();
                amumVar.f(nwp.FLOATY_BAR_TUTORIAL_LAST_SHOWN_TIMESTAMP, new fdf(fdiVar, fddVar2, 13));
                amumVar.f(nwp.FLOATY_BAR_TUTORIAL_SHOWN_COUNT, new fdf(fdiVar, fddVar, 14));
                amvn amvnVar3 = nwn.a;
                aopa createBuilder2 = nwo.a.createBuilder();
                ymf.g(amvnVar3, createBuilder2, amumVar.b());
                return (nwo) createBuilder2.mo39build();
            case 10:
                awtd awtdVar = (awtd) aoquVar;
                String d4 = vlqVar.d("pre_incognito_signed_in_user_id", "");
                if (TextUtils.isEmpty(d4)) {
                    return awtdVar;
                }
                aopa mo52toBuilder9 = awtdVar.mo52toBuilder();
                mo52toBuilder9.copyOnWrite();
                awtd awtdVar2 = (awtd) mo52toBuilder9.instance;
                d4.getClass();
                awtdVar2.b |= 1;
                awtdVar2.c = d4;
                return (awtd) mo52toBuilder9.mo39build();
            case 11:
                aopa mo52toBuilder10 = ((awte) aoquVar).mo52toBuilder();
                if (vlqVar.e("last_ad_time")) {
                    long b2 = vlqVar.b("last_ad_time", 0L);
                    mo52toBuilder10.copyOnWrite();
                    awte awteVar = (awte) mo52toBuilder10.instance;
                    awteVar.b = 1 | awteVar.b;
                    awteVar.c = b2;
                }
                if (vlqVar.e("last_ad_signals_adid")) {
                    String d5 = vlqVar.d("last_ad_signals_adid", null);
                    mo52toBuilder10.copyOnWrite();
                    awte awteVar2 = (awte) mo52toBuilder10.instance;
                    d5.getClass();
                    awteVar2.b = 2 | awteVar2.b;
                    awteVar2.d = d5;
                }
                if (vlqVar.e("last_ad_signals_lat")) {
                    boolean f4 = vlqVar.f("last_ad_signals_lat", false);
                    mo52toBuilder10.copyOnWrite();
                    awte awteVar3 = (awte) mo52toBuilder10.instance;
                    awteVar3.b = 4 | awteVar3.b;
                    awteVar3.e = f4;
                }
                if (vlqVar.e("last_ad_signals_timestamp")) {
                    long b3 = vlqVar.b("last_ad_signals_timestamp", 0L);
                    mo52toBuilder10.copyOnWrite();
                    awte awteVar4 = (awte) mo52toBuilder10.instance;
                    awteVar4.b |= 16;
                    awteVar4.g = b3;
                }
                if (vlqVar.e("last_ad_signals_identity")) {
                    String d6 = vlqVar.d("last_ad_signals_identity", null);
                    mo52toBuilder10.copyOnWrite();
                    awte awteVar5 = (awte) mo52toBuilder10.instance;
                    d6.getClass();
                    awteVar5.b |= 8;
                    awteVar5.f = d6;
                }
                return (awte) mo52toBuilder10.mo39build();
            case 12:
                awtg awtgVar = (awtg) aoquVar;
                if (!vlqVar.e("preview_tooltip_image_preview_tool")) {
                    return awtgVar;
                }
                aopa mo52toBuilder11 = awtgVar.mo52toBuilder();
                long b4 = vlqVar.b("preview_tooltip_image_preview_tool", 0L);
                mo52toBuilder11.copyOnWrite();
                awtg awtgVar2 = (awtg) mo52toBuilder11.instance;
                awtgVar2.b |= 1;
                awtgVar2.c = b4;
                return (awtg) mo52toBuilder11.mo39build();
            case 13:
                aouc aoucVar = (aouc) aoquVar;
                if (!vlqVar.e("com.google.android.libraries.youtube.innertube.pref.startup_uncaught_exception_count")) {
                    return aoucVar;
                }
                aopa mo52toBuilder12 = aoucVar.mo52toBuilder();
                int a7 = vlqVar.a("com.google.android.libraries.youtube.innertube.pref.startup_uncaught_exception_count", 0);
                mo52toBuilder12.copyOnWrite();
                aouc aoucVar2 = (aouc) mo52toBuilder12.instance;
                aoucVar2.b |= 1;
                aoucVar2.c = a7;
                return (aouc) mo52toBuilder12.mo39build();
            case 14:
                aoud aoudVar = (aoud) aoquVar;
                if (!vlqVar.e("version")) {
                    return aoudVar;
                }
                aopa mo52toBuilder13 = aoudVar.mo52toBuilder();
                String d7 = vlqVar.d("version", "");
                mo52toBuilder13.copyOnWrite();
                aoud aoudVar2 = (aoud) mo52toBuilder13.instance;
                d7.getClass();
                aoudVar2.b |= 1;
                aoudVar2.c = d7;
                return (aoud) mo52toBuilder13.mo39build();
            case 15:
                aopa mo52toBuilder14 = ((znc) aoquVar).mo52toBuilder();
                int a8 = vlqVar.a("camera_facing", 0);
                mo52toBuilder14.copyOnWrite();
                ((znc) mo52toBuilder14.instance).b = a8;
                return (znc) mo52toBuilder14.mo39build();
            case 16:
                aopa mo52toBuilder15 = ((awtk) aoquVar).mo52toBuilder();
                if (vlqVar.e("innertube_safety_mode_enabled")) {
                    boolean f5 = vlqVar.f("innertube_safety_mode_enabled", false);
                    mo52toBuilder15.copyOnWrite();
                    awtk awtkVar = (awtk) mo52toBuilder15.instance;
                    awtkVar.b |= 1;
                    awtkVar.c = f5;
                }
                return (awtk) mo52toBuilder15.mo39build();
            case 17:
                aopa mo52toBuilder16 = ((aotz) aoquVar).mo52toBuilder();
                String d8 = vlqVar.d("SHARED_PREF_STREAM_CONFIG_KEY", "");
                mo52toBuilder16.copyOnWrite();
                aotz aotzVar = (aotz) mo52toBuilder16.instance;
                d8.getClass();
                aotzVar.b |= 1;
                aotzVar.c = d8;
                boolean f6 = vlqVar.f("PREF_HAS_SEEN_ORIENTATION_TOOLTIP", false);
                mo52toBuilder16.copyOnWrite();
                aotz aotzVar2 = (aotz) mo52toBuilder16.instance;
                aotzVar2.b |= 8;
                aotzVar2.f = f6;
                boolean f7 = vlqVar.f("HAS_SEEN_SCREENCAST_TOOLTIP", false);
                mo52toBuilder16.copyOnWrite();
                aotz aotzVar3 = (aotz) mo52toBuilder16.instance;
                aotzVar3.b |= 2;
                aotzVar3.d = f7;
                boolean f8 = vlqVar.f("IS_FIRST_STREAM", true);
                mo52toBuilder16.copyOnWrite();
                aotz aotzVar4 = (aotz) mo52toBuilder16.instance;
                aotzVar4.b |= 4;
                aotzVar4.e = f8;
                int a9 = vlqVar.a("SHARED_PREF_PORTRAIT_COUNT_KEY", 0);
                mo52toBuilder16.copyOnWrite();
                aotz aotzVar5 = (aotz) mo52toBuilder16.instance;
                aotzVar5.b |= 16;
                aotzVar5.g = a9;
                long b5 = vlqVar.b("SHARED_PREF_LS_TIMESTAMP_KEY", 0L);
                mo52toBuilder16.copyOnWrite();
                aotz aotzVar6 = (aotz) mo52toBuilder16.instance;
                aotzVar6.b |= 32;
                aotzVar6.h = b5;
                return (aotz) mo52toBuilder16.mo39build();
            case 18:
                aopa mo52toBuilder17 = ((awtn) aoquVar).mo52toBuilder();
                long b6 = vlqVar.b("interaction_logging_client_side_ve_counter", 10000L);
                mo52toBuilder17.copyOnWrite();
                awtn awtnVar = (awtn) mo52toBuilder17.instance;
                awtnVar.b |= 16;
                awtnVar.g = b6;
                return (awtn) mo52toBuilder17.mo39build();
            case 19:
                aopa mo52toBuilder18 = ((awtn) aoquVar).mo52toBuilder();
                long b7 = vlqVar.b("foreground_heartbeat_index", -1L);
                mo52toBuilder18.copyOnWrite();
                awtn awtnVar2 = (awtn) mo52toBuilder18.instance;
                awtnVar2.b = 1 | awtnVar2.b;
                awtnVar2.c = b7;
                if (vlqVar.e("LastCrashException")) {
                    aoob x = aoob.x(Base64.decode(vlqVar.d("LastCrashException", ""), 0));
                    mo52toBuilder18.copyOnWrite();
                    awtn awtnVar3 = (awtn) mo52toBuilder18.instance;
                    awtnVar3.b |= 2;
                    awtnVar3.d = x;
                }
                if (vlqVar.e("LastCrashTimestamp")) {
                    long b8 = vlqVar.b("LastCrashTimestamp", -1L);
                    mo52toBuilder18.copyOnWrite();
                    awtn awtnVar4 = (awtn) mo52toBuilder18.instance;
                    awtnVar4.b |= 4;
                    awtnVar4.e = b8;
                }
                return (awtn) mo52toBuilder18.mo39build();
            default:
                aopa mo52toBuilder19 = ((aoub) aoquVar).mo52toBuilder();
                if (vlqVar.e("screenIds")) {
                    String[] split = vlqVar.d("screenIds", "").split(",");
                    String[] split2 = vlqVar.d("screenNames", "").split(",");
                    List h2 = amqf.b(',').h(vlqVar.d("deviceIds", ""));
                    while (i2 < split.length) {
                        String str = split[i2];
                        if (!TextUtils.isEmpty(str) && i2 < h2.size() && !TextUtils.isEmpty((CharSequence) h2.get(i2))) {
                            aopa createBuilder3 = aoua.a.createBuilder();
                            createBuilder3.copyOnWrite();
                            aoua aouaVar = (aoua) createBuilder3.instance;
                            str.getClass();
                            aouaVar.b |= 1;
                            aouaVar.c = str;
                            String str2 = (String) h2.get(i2);
                            createBuilder3.copyOnWrite();
                            aoua aouaVar2 = (aoua) createBuilder3.instance;
                            str2.getClass();
                            aouaVar2.b |= 4;
                            aouaVar2.e = str2;
                            String str3 = i2 < split2.length ? split2[i2] : "";
                            createBuilder3.copyOnWrite();
                            aoua aouaVar3 = (aoua) createBuilder3.instance;
                            str3.getClass();
                            aouaVar3.b |= 2;
                            aouaVar3.d = str3;
                            aoua aouaVar4 = (aoua) createBuilder3.mo39build();
                            mo52toBuilder19.copyOnWrite();
                            aoub aoubVar = (aoub) mo52toBuilder19.instance;
                            aouaVar4.getClass();
                            aoubVar.a();
                            aoubVar.b.add(aouaVar4);
                        }
                        i2++;
                    }
                }
                return (aoub) mo52toBuilder19.mo39build();
        }
    }
}
