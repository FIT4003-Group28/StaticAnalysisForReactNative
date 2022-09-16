package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: adbo  reason: default package */
/* loaded from: classes.dex */
public final class adbo {
    private final List a;
    private final adbn b;
    private final String c;

    public adbo(atdl atdlVar, String str) {
        amuk s;
        this.c = str;
        List arrayList = new ArrayList();
        if (atdlVar == null || !atdlVar.b) {
            aopa createBuilder = atda.a.createBuilder();
            createBuilder.copyOnWrite();
            atda atdaVar = (atda) createBuilder.instance;
            atdaVar.c = 2;
            atdaVar.b |= 1;
            createBuilder.aw(f("^(?i)microsoft.*", "^(?i)xbox.*"));
            atda atdaVar2 = (atda) createBuilder.mo39build();
            if (adih.b(str)) {
                aopa createBuilder2 = atda.a.createBuilder();
                createBuilder2.copyOnWrite();
                atda atdaVar3 = (atda) createBuilder2.instance;
                atdaVar3.c = 1;
                atdaVar3.b = 1 | atdaVar3.b;
                createBuilder2.aw(f("^lge$", "(^476700$|^\\d\\d(lm|ls|pa|pm).*|^global$|^mediabh.*|^mediabp530.*|^tm.*)"));
                createBuilder2.aw(f("^samsung$", "^(bd|ht)$"));
                createBuilder2.aw(f("^vizio$", "^e.*_a0$"));
                createBuilder2.aw(f("^sharp$", "^(le650u|le657e|le65xx|le747e|le757e|le757u|le857e)$"));
                createBuilder2.aw(f("^funai$", "^philips$"));
                createBuilder2.aw(f("^(tivo|tivo_comhem)$", "^series4$"));
                if ("k".equals(str)) {
                    createBuilder2.aw(f("^Amazon$", "^.*$"));
                    createBuilder2.aw(f("^Element$", "^(EL4KAMZ4317|EL4KAMZ5017|EL4KAMZ5517|EL4KAMZ6517|EL4KAMZ4317T|EL4KAMZ5017T|EL4KAMZ5517T|EL4KAMZ6517T)$"));
                    createBuilder2.aw(f("^Westinghouse$", "^(WA43UFA1001|WA50UFA1001|WA55UFA1001|WA65UFA1001|WA43UFT1001|WA50UFT1001|WA55UFT1001|WA65UFT1001)$"));
                    createBuilder2.aw(f("^Toshiba$", "^(49LF421U19|43LF421U19|32LF221U19|49LF421C19|43LF421C19|32LF221C19|43LF621U19|50LF621U19|55LF621U19|43LF621C19|50LF621C19|55LF621C19|43LF711U20|50LF711U20|55LF711U20|43LF711C20|50LF711C20|55LF711C20)$"));
                    createBuilder2.aw(f("^Insignia$", "^(NS-43DF710NA19|NS-50DF710NA19|NS-55DF710NA19|NS-43DF710CA19|NS-50DF710CA19|NS-55DF710CA19|NS-24DF310NA19|NS-32DF310NA19|NS-39DF510NA19|NS-24DF310CA19|NS-32DF310CA19|NS-39DF510CA19)$"));
                    createBuilder2.aw(f("^Grundig$", "^(43 GUW 7060|43 GUB 7060|43 GUT 7060|43 GUB 7062|43 GUB 7065|43 GUB 7066|43 GUT 7099|43 GUB 7067|43 GUT 7077|43 VLX 7020|43 VLX 7010|49 GUW 7060|49 GUT 7060|49 GUB 7060|49 GUB 7062|49 GUB 7065|49 GUB 7066|49 GUT 7099|49 GUB 7067|49 GUT 7077|49 VLX 7020|49 VLX 7010|55 GUW 7060|55 GUT 7060|55 GUB 7060|55 GUB 7062|55 GUB 7065|55 GUB 7066|55 GUT 7099|55 GUB 7067|55 GUT 7077|55 VLX 7020|55 VLX 7010|65 GUB 7066|65 GUB 7060|65 GUW 7060|65 GUT 7060|65 GUB 7062|65 GUB 7065|65 GUT 7077|65 VLX 7020|65 VLX 7010|55 GOB 9099 OLED|65 GOB 9099 OLED|55 GOB 9089 OLED|65 GOB 9089 OLED|32 GFB 6062|32 GFB 6065|32 GFB 6066|32 GFB 6067|32 GFB 6060|32 GFW 6060|32 VLE 6020|32 GFB 6064|32 VLE 6010|40 GFB 6065|40 GFB 6062|40 GFB 6066|40 GFB 6067|40 GFB 6060|40 GFW 6060|40 VLE 6020|40 GFB 6064|40 VLE 6010|43 GFB 6060|43 GFB 6065|43 GFB 6062|43 GFB 6066|43 GFB 6067|43 GFW 6060|43 VLE 6020|43 GFB 6064|43 VLE 6010|43UHDEGA|49UHDEGA|55UHDEGA|55UHDNGA|65UHDNGA|55UHDOGA|65UHDOGA|32FHDCGA|40FHDCGA|43FHDCGA)$"));
                    createBuilder2.aw(f("^(Onida)$", "^(32HIF|43FIF)$"));
                    createBuilder2.aw(f("^(Anker)$", "^AK-D3000111$"));
                    createBuilder2.aw(f("^(JVC)$", "^(LT-40CF890|LT-49CF890|LT-55CF890)$"));
                }
                if ("up".equals(str)) {
                    createBuilder2.ax(f("^(?i)microsoft.*", "^(?i)xbox\\sone.*"));
                    createBuilder2.ax(f("^(?i)roku.*", ".*"));
                    createBuilder2.ax(f("^(?i)apple.*", ".*"));
                    createBuilder2.ax(f("^(?i)lg.*", "(?i)(^\\d\\d\\w[km]\\w{2,7}$|^oled\\d\\d\\w[89]\\w{0,3}$)"));
                    createBuilder2.ax(f("^(?i)samsung.*", "(?i)(\\bU\\w{1}\\d{2}R\\w{1}\\d{4}\\b|\\bQ\\w{1}\\d{2}\\w{1}\\d{2,3}R\\w{1}\\b)"));
                    createBuilder2.ax(f("^(?i)hisense.*", "(?i)(^hu.*f$)"));
                    createBuilder2.aw(f("^(?i)samsung.*", "(?i)(\\bU\\w{1}\\d{2}[KM]\\w{1}\\d{4}\\b)"));
                    createBuilder2.aw(f("^(?i)sony.*", "(?i)(blu-ray disc player)"));
                    createBuilder2.aw(f("^(?i)echostar.*", "(?i)(\\bXiP\\d{3}\\b)"));
                }
                s = amuk.s((atda) createBuilder2.mo39build(), atdaVar2);
            } else {
                s = amuk.r(atdaVar2);
            }
            this.a = s;
        } else {
            List list = atdlVar.c;
            this.a = Collections.unmodifiableList(true != list.isEmpty() ? list : arrayList);
        }
        this.b = new adbn();
    }

    private final boolean d(adbm adbmVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            atcz atczVar = (atcz) it.next();
            adbn adbnVar = this.b;
            atczVar.getClass();
            int T = almu.T(atczVar.c);
            if (T != 0 && T != 1) {
                int i = adbmVar.d;
                int T2 = almu.T(atczVar.c);
                if (T2 == 0) {
                    T2 = 1;
                }
                if (i != T2) {
                    continue;
                }
            }
            if (adbnVar.a(adbmVar.a, atczVar.d) && adbnVar.a(adbmVar.b, atczVar.e) && adbnVar.a(adbmVar.c, atczVar.f)) {
                return true;
            }
        }
        return false;
    }

    private final atda e(int i) {
        for (atda atdaVar : this.a) {
            int S = almu.S(atdaVar.c);
            if (S == 0) {
                S = 1;
                continue;
            }
            if (S == i) {
                return atdaVar;
            }
        }
        return null;
    }

    private static final atcz f(String str, String str2) {
        aopa createBuilder = atcz.a.createBuilder();
        createBuilder.copyOnWrite();
        atcz atczVar = (atcz) createBuilder.instance;
        atczVar.c = 2;
        atczVar.b |= 1;
        createBuilder.copyOnWrite();
        atcz atczVar2 = (atcz) createBuilder.instance;
        atczVar2.b = 2 | atczVar2.b;
        atczVar2.d = str;
        createBuilder.copyOnWrite();
        atcz atczVar3 = (atcz) createBuilder.instance;
        atczVar3.b |= 4;
        atczVar3.e = str2;
        return (atcz) createBuilder.mo39build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(int i, adbm adbmVar) {
        atda e = e(i);
        if (e == null || e.d.size() == 0) {
            return true;
        }
        return d(adbmVar, e.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(int i, adbm adbmVar) {
        atda e = e(i);
        if (e == null || e.e.size() == 0) {
            return false;
        }
        return d(adbmVar, e.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(int i, adbm adbmVar) {
        return !b(i, adbmVar) && a(i, adbmVar);
    }
}
