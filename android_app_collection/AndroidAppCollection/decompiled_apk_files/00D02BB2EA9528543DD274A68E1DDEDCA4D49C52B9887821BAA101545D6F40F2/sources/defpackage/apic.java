package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: apic  reason: default package */
/* loaded from: classes2.dex */
public class apic implements apho {
    private final gga a;
    private final bwqv b;
    private final aphj c;
    private final aoxq d;
    private final dcdn<aoxp, bwrs<aoyg>> e;

    public apic(gga ggaVar, bwqv bwqvVar, aphj aphjVar, aoxq aoxqVar, dcdn<aoxp, bwrs<aoyg>> dcdnVar) {
        this.a = ggaVar;
        this.b = bwqvVar;
        this.c = aphjVar;
        this.d = aoxqVar;
        this.e = dcdnVar;
    }

    @Override // defpackage.apho
    public List<aphp> a() {
        dcpd<Map.Entry<aoxp, bwrs<aoyg>>> dcpdVar;
        dbsg dbsgVar;
        final HashMap hashMap = new HashMap();
        dcpd<Map.Entry<aoxp, bwrs<aoyg>>> it = this.e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<aoxp, bwrs<aoyg>> next = it.next();
            aoxp key = next.getKey();
            String b = this.d.b(key);
            ddho c = this.d.c(key, aoxm.a);
            int intValue = aoxq.b.getOrDefault(key.a(), Integer.valueOf(aoxq.a)).intValue();
            String str = (String) this.d.d(key, aoxk.a);
            bwrs<aoyg> value = next.getValue();
            aoyg c2 = value.c();
            dbsk.s(c2);
            dcdc<aoxt> c3 = c2.c();
            int size = c3.size();
            if (size != 0) {
                CharSequence c4 = this.c.c(size, 3);
                int size2 = c3.size();
                int i = 0;
                while (true) {
                    if (i < size2) {
                        aoxt aoxtVar = c3.get(i);
                        i++;
                        dcpdVar = it;
                        if (!aoxtVar.a().bJ().equals(dwfl.w)) {
                            dwfl dwflVar = aoxtVar.a().h().G;
                            if (dwflVar == null) {
                                dwflVar = dwfl.w;
                            }
                            String str2 = dwflVar.h;
                            if (!str2.startsWith("http:") || !str2.startsWith("https:")) {
                                String valueOf = String.valueOf(str2);
                                str2 = valueOf.length() != 0 ? "https:".concat(valueOf) : new String("https:");
                            }
                            dbsgVar = dbsg.i(str2);
                        } else {
                            it = dcpdVar;
                        }
                    } else {
                        dcpdVar = it;
                        dbsgVar = dbpy.a;
                        break;
                    }
                }
                hashMap.put(new apie(b, c4, (String) dbsgVar.c(str), intValue, this.a, this.b, value, c), Integer.valueOf(size));
                it = dcpdVar;
            }
        }
        return dcmw.a.g(new dbrn(hashMap) { // from class: apib
            private final Map a;

            {
                this.a = hashMap;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Integer num = (Integer) this.a.get((aphp) obj);
                dbsk.s(num);
                return num;
            }
        }).o(hashMap.keySet());
    }
}
