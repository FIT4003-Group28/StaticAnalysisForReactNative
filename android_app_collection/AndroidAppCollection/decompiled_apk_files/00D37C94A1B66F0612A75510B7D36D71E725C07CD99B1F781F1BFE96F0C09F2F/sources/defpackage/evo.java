package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: evo  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class evo implements acvm {
    private final /* synthetic */ int s;
    public static final /* synthetic */ evo r = new evo(17);
    public static final /* synthetic */ evo q = new evo(16);
    public static final /* synthetic */ evo p = new evo(15);
    public static final /* synthetic */ evo o = new evo(14);
    public static final /* synthetic */ evo n = new evo(13);
    public static final /* synthetic */ evo m = new evo(12);
    public static final /* synthetic */ evo l = new evo(11);
    public static final /* synthetic */ evo k = new evo(10);
    public static final /* synthetic */ evo j = new evo(9);
    public static final /* synthetic */ evo i = new evo(8);
    public static final /* synthetic */ evo h = new evo(7);
    public static final /* synthetic */ evo g = new evo(6);
    public static final /* synthetic */ evo f = new evo(5);
    public static final /* synthetic */ evo e = new evo(4);
    public static final /* synthetic */ evo d = new evo(3);
    public static final /* synthetic */ evo c = new evo(2);
    public static final /* synthetic */ evo b = new evo(1);
    public static final /* synthetic */ evo a = new evo();

    private /* synthetic */ evo() {
    }

    private /* synthetic */ evo(int i2) {
        this.s = i2;
    }

    @Override // defpackage.acvm
    public final Map a(Object obj) {
        String str = "1";
        switch (this.s) {
            case 0:
                return amup.k("csn", ((actu) obj).a());
            case 1:
                ewa ewaVar = (ewa) obj;
                return Collections.singletonMap("bres_d", Integer.toString(0));
            case 2:
                ahhw ahhwVar = (ahhw) obj;
                afw afwVar = new afw(2);
                aika aikaVar = aika.NEW;
                wxq wxqVar = wxq.AD_INTERRUPT_ACQUIRED;
                int ordinal = ahhwVar.c().ordinal();
                if (ordinal == 4) {
                    afwVar.put("cpn", ahhwVar.e());
                    afwVar.put("ad_cpn", ahhwVar.k());
                    afwVar.put("target_cpn", ahhwVar.k());
                    if (ahhwVar.a() != null) {
                        afwVar.put("target_video_id", ahhwVar.a().B());
                    }
                } else if (ordinal != 7) {
                    return null;
                } else {
                    afwVar.put("cpn", ahhwVar.e());
                }
                return afwVar;
            case 3:
                return Collections.singletonMap("cir", Integer.toString(alwb.n(((aebq) obj).a)));
            case 4:
                return Collections.singletonMap("crm", Integer.toString(alwb.l(((aebr) obj).a)));
            case 5:
                aecw aecwVar = (aecw) obj;
                HashMap hashMap = new HashMap();
                hashMap.put("one", str);
                return hashMap;
            case 6:
                return Collections.singletonMap("ohrtt", Long.toString(((aedf) obj).a));
            case 7:
                aedo aedoVar = (aedo) obj;
                return Collections.singletonMap("orec", str);
            case 8:
                aedt aedtVar = (aedt) obj;
                return Collections.singletonMap("oubpr", str);
            case 9:
                return Collections.singletonMap("outi", ((aedu) obj).a);
            case 10:
                aesr aesrVar = (aesr) obj;
                FormatStreamModel f2 = aesrVar.f();
                if (f2 == null) {
                    f2 = aesrVar.e();
                }
                if (f2 == null) {
                    return null;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("fmt", String.valueOf(f2.e()));
                if (true != f2.J()) {
                    str = "0";
                }
                hashMap2.put("mod_local", str);
                return hashMap2;
            case 11:
                HashMap hashMap3 = new HashMap();
                hashMap3.put("cmt", String.valueOf(((ahgv) obj).a));
                return hashMap3;
            case 12:
                if (!((ahgx) obj).a) {
                    return null;
                }
                HashMap hashMap4 = new HashMap();
                hashMap4.put("mod_pft", "cache");
                return hashMap4;
            case 13:
                HashMap hashMap5 = new HashMap();
                if (((ahgz) obj).a) {
                    hashMap5.put("mod_adap", str);
                }
                return hashMap5;
            case 14:
                ahhw ahhwVar2 = (ahhw) obj;
                HashMap hashMap6 = new HashMap();
                aika aikaVar2 = aika.NEW;
                aiim aiimVar = aiim.START;
                int ordinal2 = ahhwVar2.c().ordinal();
                if (ordinal2 != 2 && ordinal2 != 7) {
                    return null;
                }
                String e2 = ahhwVar2.e();
                PlayerResponseModel b2 = ahhwVar2.b();
                if (e2 == null || b2 == null) {
                    return null;
                }
                if (!b2.B().isEmpty()) {
                    hashMap6.put("docid", b2.B());
                }
                hashMap6.put("cpn", e2);
                return hashMap6;
            case 15:
                aika aikaVar3 = aika.NEW;
                aiim aiimVar2 = aiim.START;
                String str2 = "jp";
                switch (((aiin) obj).a().ordinal()) {
                    case 0:
                        str2 = "st";
                        break;
                    case 1:
                        str2 = "n";
                        break;
                    case 2:
                        str2 = "p";
                        break;
                    case 3:
                        str2 = "ap";
                        break;
                    case 4:
                        str2 = "an";
                        break;
                    case 5:
                        str2 = "rt";
                        break;
                    case 6:
                    case 7:
                        break;
                    default:
                        str2 = null;
                        break;
                }
                if (str2 == null) {
                    return null;
                }
                HashMap hashMap7 = new HashMap();
                hashMap7.put("yt_wt", str2);
                return hashMap7;
            case 16:
                aikd aikdVar = (aikd) obj;
                HashMap hashMap8 = new HashMap();
                String str3 = aikdVar.g;
                if (!TextUtils.isEmpty(str3)) {
                    hashMap8.put("docid", str3);
                }
                if (!TextUtils.isEmpty(aikdVar.b)) {
                    hashMap8.put("cpn", aikdVar.b);
                }
                return hashMap8;
            default:
                ajpx ajpxVar = (ajpx) obj;
                int a2 = ajpxVar.a();
                StringBuilder sb = new StringBuilder(16);
                sb.append("th");
                sb.append(a2);
                sb.append("_tt");
                return Collections.singletonMap(sb.toString(), Integer.toString(ajpxVar.a));
        }
    }
}
