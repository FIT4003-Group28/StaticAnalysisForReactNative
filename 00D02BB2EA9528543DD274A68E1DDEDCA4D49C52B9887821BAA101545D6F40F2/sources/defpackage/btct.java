package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: btct  reason: default package */
/* loaded from: classes4.dex */
public class btct implements btcq {
    private final gga a;
    private final bvjj b;
    private final btvo c;
    private final bwqv d;
    private final dcdc<cqss> e = dcdc.i(ibm.x(), ibm.E(), ibm.S(), ibm.M());
    private final List<Locale> f;

    public btct(gga ggaVar, bvjj bvjjVar, btvo btvoVar, bwqv bwqvVar, List<Locale> list) {
        this.a = ggaVar;
        this.b = bvjjVar;
        this.c = btvoVar;
        this.d = bwqvVar;
        this.f = list;
    }

    private static boolean d(Locale locale) {
        return locale.getLanguage().equals(Locale.ENGLISH.getLanguage());
    }

    @Override // defpackage.btcq
    public List<cqix<?>> a() {
        int i;
        ArrayList arrayList = new ArrayList();
        dkmu dkmuVar = this.c.getLanguageSettingParameters().h;
        if (dkmuVar == null) {
            dkmuVar = dkmu.e;
        }
        ArrayList<dkmt> arrayList2 = new ArrayList(dkmuVar.c);
        Iterator it = arrayList2.iterator();
        while (true) {
            if (it.hasNext()) {
                if (d(Locale.forLanguageTag(((dkmt) it.next()).c))) {
                    break;
                }
            } else {
                dkms bZ = dkmt.d.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dkmt dkmtVar = (dkmt) bZ.b;
                dkmtVar.a |= 2;
                dkmtVar.c = "en-us";
                String displayLanguage = Locale.ENGLISH.getDisplayLanguage();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dkmt dkmtVar2 = (dkmt) bZ.b;
                displayLanguage.getClass();
                dkmtVar2.a |= 1;
                dkmtVar2.b = displayLanguage;
                arrayList2.add(bZ.bK());
            }
        }
        List<Locale> list = this.f;
        ArrayList arrayList3 = new ArrayList();
        Locale locale = null;
        for (Locale locale2 : list) {
            if (d(locale2) && locale == null) {
                locale = locale2;
            }
            arrayList3.add(locale2);
        }
        for (dkmt dkmtVar3 : arrayList2) {
            Locale forLanguageTag = Locale.forLanguageTag(dkmtVar3.c);
            if (true == d(forLanguageTag)) {
                locale = forLanguageTag;
            }
            if (!arrayList3.contains(forLanguageTag)) {
                arrayList3.add(forLanguageTag);
            }
        }
        if (locale == null || locale.getCountry().isEmpty()) {
            locale = new Locale("en", "us");
        }
        arrayList3.remove(locale);
        arrayList3.add(1, locale);
        Collections.sort(arrayList2, new btcr(arrayList3));
        for (i = 0; i < arrayList2.size(); i++) {
            dkmt dkmtVar4 = (dkmt) arrayList2.get(i);
            Locale forLanguageTag2 = Locale.forLanguageTag(dkmtVar4.c);
            String str = dkmtVar4.b;
            dcdc<cqss> dcdcVar = this.e;
            arrayList.add(cqgr.fT(new btck(), new btcs(forLanguageTag2, str, dcdcVar.get(i % dcdcVar.size()), this.a, this.b, this.d)));
        }
        return arrayList;
    }

    @Override // defpackage.btcq
    public cqkl b() {
        this.b.S(bvjk.T, true);
        bszv.ba(this.a, new btbx());
        return cqkl.a;
    }

    @Override // defpackage.btcq
    public cqkl c() {
        this.b.S(bvjk.T, true);
        btcb btcbVar = (btcb) this.a.K();
        if (btcbVar != null) {
            btcbVar.aT();
        }
        return cqkl.a;
    }
}
