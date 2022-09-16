package defpackage;

import android.util.Pair;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: jji  reason: default package */
/* loaded from: classes3.dex */
public final class jji implements acth {
    public static final amup a = amup.l("downloads_page_downloads_item_section_identifier", acuo.b(51721), "downloads_page_recommendations_item_section_identifier", acuo.b(51722));
    public final acti b;
    public int g = 0;
    public final Map d = new HashMap();
    public final Map c = new HashMap();
    public final Map e = new HashMap();
    public final Map f = new HashMap();

    public jji(acti actiVar) {
        this.b = actiVar;
    }

    public static boolean e(auxq auxqVar) {
        apzg apzgVar;
        if (auxqVar.c == 6) {
            apzgVar = (apzg) auxqVar.d;
        } else {
            apzgVar = apzg.a;
        }
        return apzgVar.qn(DownloadsPageEndpointOuterClass.downloadsPageEndpoint);
    }

    public static final boolean f(auxq auxqVar) {
        auxs auxsVar;
        if (auxqVar.c == 3) {
            auxsVar = (auxs) auxqVar.d;
        } else {
            auxsVar = auxs.a;
        }
        aumx aumxVar = auxsVar.c;
        if (aumxVar == null) {
            aumxVar = aumx.a;
        }
        ajfz g = ajna.g(aumxVar);
        return g != null && ((Boolean) llm.p(g, jgl.s, false)).booleanValue();
    }

    public final acup a(String str, aoqu aoquVar) {
        auxs auxsVar;
        apzg apzgVar;
        if (aoquVar instanceof auxr) {
            return acuo.b(42355);
        }
        if (aoquVar instanceof auxq) {
            auxq auxqVar = (auxq) aoquVar;
            boolean z = true;
            if (!e(auxqVar) && !f(auxqVar)) {
                z = false;
            }
            aqxo.p(z);
            aqpa aqpaVar = aqpa.FILTER_TYPE_UNSPECIFIED;
            if (!e(auxqVar)) {
                if (auxqVar.c == 3) {
                    auxsVar = (auxs) auxqVar.d;
                } else {
                    auxsVar = auxs.a;
                }
                aumx aumxVar = auxsVar.c;
                if (aumxVar == null) {
                    aumxVar = aumx.a;
                }
                ajfz g = ajna.g(aumxVar);
                if (g != null) {
                    aqpaVar = llm.l(g);
                }
            } else {
                if (auxqVar.c == 6) {
                    apzgVar = (apzg) auxqVar.d;
                } else {
                    apzgVar = apzg.a;
                }
                aqpaVar = aqpa.b(((aqpb) apzgVar.qm(DownloadsPageEndpointOuterClass.downloadsPageEndpoint)).c);
                if (aqpaVar == null) {
                    aqpaVar = aqpa.FILTER_TYPE_UNSPECIFIED;
                }
            }
            int ordinal = aqpaVar.ordinal();
            if (ordinal == 2) {
                return acuo.b(48083);
            }
            if (ordinal == 3) {
                return acuo.b(48084);
            }
            return acuo.b(48082);
        } else if (aoquVar instanceof aqei) {
            return acuo.b(42357);
        } else {
            if (aoquVar instanceof aqfa) {
                if ("downloads_page_downloads_item_section_identifier".equals(str)) {
                    return acuo.b(42356);
                }
                if (!"downloads_page_recommendations_item_section_identifier".equals(str)) {
                    return null;
                }
                return acuo.b(51723);
            } else if (!(aoquVar instanceof atqb)) {
                return null;
            } else {
                return acuo.b(69464);
            }
        }
    }

    public final awbs b(String str, aoqu aoquVar) {
        acup a2;
        if (this.c.containsKey(str) && (a2 = a(str, aoquVar)) != null) {
            Pair create = Pair.create((awbs) this.c.get(str), aoquVar);
            if (!this.f.containsKey(str) || !((Set) this.f.get(str)).contains(aoquVar)) {
                if (this.e.containsKey(str)) {
                    Map map = (Map) this.e.get(str);
                    if (map.containsKey(aoquVar)) {
                        return this.b.j(create, a2, ((Integer) map.get(aoquVar)).intValue());
                    }
                }
                return null;
            }
            return this.b.h(create, a2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.awbs c(defpackage.acup r3, defpackage.aoqu r4) {
        /*
            r2 = this;
            int r3 = r3.a
            r0 = 0
            r1 = 51723(0xca0b, float:7.248E-41)
            if (r3 == r1) goto L9
            return r0
        L9:
            boolean r3 = r4 instanceof defpackage.aqfa
            if (r3 == 0) goto L24
            aqfa r4 = (defpackage.aqfa) r4
            avxe r3 = r4.u
            if (r3 != 0) goto L15
            avxe r3 = defpackage.avxe.a
        L15:
            int r3 = r3.b
            r3 = r3 & 1
            if (r3 == 0) goto L24
            avxe r3 = r4.u
            if (r3 != 0) goto L21
            avxe r3 = defpackage.avxe.a
        L21:
            java.lang.String r3 = r3.c
            goto L25
        L24:
            r3 = r0
        L25:
            if (r3 == 0) goto L34
            acti r4 = r2.b
            r0 = 7111(0x1bc7, float:9.965E-42)
            acup r0 = defpackage.acuo.b(r0)
            awbs r3 = r4.h(r3, r0)
            return r3
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jji.c(acup, aoqu):awbs");
    }

    public final void d(String str, aoqu aoquVar) {
        Set set;
        if (!this.f.containsKey(str)) {
            set = new HashSet();
            this.f.put(str, set);
        } else {
            set = (Set) this.f.get(str);
        }
        set.add(aoquVar);
    }

    @Override // defpackage.acth
    public final acti oi() {
        return this.b;
    }
}
