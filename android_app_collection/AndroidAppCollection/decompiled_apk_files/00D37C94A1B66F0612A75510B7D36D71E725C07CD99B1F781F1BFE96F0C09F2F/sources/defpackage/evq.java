package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: evq  reason: default package */
/* loaded from: classes3.dex */
public final class evq implements acvm {
    private final /* synthetic */ int a;

    public evq() {
    }

    public evq(int i) {
        this.a = i;
    }

    @Override // defpackage.acvm
    public final /* bridge */ /* synthetic */ Map a(Object obj) {
        String str = "";
        String str2 = "1";
        afw afwVar = null;
        switch (this.a) {
            case 0:
                return ((aaoe) obj).a();
            case 1:
                evi eviVar = (evi) obj;
                String str3 = true != eviVar.a ? "cold" : "frozen";
                if (true == eviVar.b) {
                    str2 = "0";
                }
                return amup.l("yt_lt", str3, "yt_fi", str2);
            case 2:
                return Collections.singletonMap("yt_intent", ((evk) obj).a());
            case 3:
                wyv wyvVar = (wyv) obj;
                afw afwVar2 = new afw(1);
                afwVar2.put("mod_ad", str2);
                return afwVar2;
            case 4:
                wxr wxrVar = (wxr) obj;
                afw afwVar3 = new afw(1);
                aika aikaVar = aika.NEW;
                wxq wxqVar = wxq.AD_INTERRUPT_ACQUIRED;
                int ordinal = wxrVar.a().ordinal();
                if (ordinal == 1) {
                    afwVar = new afw(5);
                    afwVar.put("mod_ad_pr", str2);
                    if (!TextUtils.isEmpty(wxrVar.c().l())) {
                        afwVar.put("ad_at", wxrVar.c().l());
                    }
                    afwVar.put("ad_docid", zgh.h(wxrVar.c().n()));
                    afwVar.put("yt_abt", Integer.toString(wxrVar.b().d));
                    for (asmc asmcVar : wxrVar.c().z()) {
                        afwVar.put(asmcVar.e, asmcVar.c == 2 ? (String) asmcVar.d : str);
                    }
                } else if (ordinal == 3) {
                    afwVar3.put("yt_abt", Integer.toString(wxrVar.b().d));
                    return afwVar3;
                }
                return afwVar;
            case 5:
                afw afwVar4 = new afw(1);
                String str4 = ((wya) obj).a;
                afwVar4.put("ad_cpn", null);
                return afwVar4;
            case 6:
                wyf wyfVar = (wyf) obj;
                afw afwVar5 = new afw(1);
                String str5 = wyfVar.a;
                afwVar5.put("ad_cpn", null);
                String str6 = wyfVar.b;
                afwVar5.put("cpn", null);
                return afwVar5;
            case 7:
                wxo wxoVar = (wxo) obj;
                afw afwVar6 = new afw();
                afwVar6.put("ad_cr", wxoVar.a().k);
                if (wxoVar.b() != null) {
                    str = wxoVar.b().l;
                }
                afwVar6.put("ad_cpn", str);
                return afwVar6;
            case 8:
                HashMap hashMap = new HashMap();
                String str7 = ((wyn) obj).a;
                hashMap.put("pb_h", null);
                return hashMap;
            case 9:
                HashMap hashMap2 = new HashMap();
                String str8 = ((wyl) obj).a;
                hashMap2.put("pb_h", null);
                return hashMap2;
            default:
                new HashMap();
                int i = wwt.d;
                int i2 = ((wym) obj).a;
                throw null;
        }
    }
}
