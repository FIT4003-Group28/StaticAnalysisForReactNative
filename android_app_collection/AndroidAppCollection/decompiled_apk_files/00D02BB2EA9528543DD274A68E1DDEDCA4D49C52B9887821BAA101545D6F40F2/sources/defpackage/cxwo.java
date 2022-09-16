package defpackage;

import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cxwo  reason: default package */
/* loaded from: classes5.dex */
public final class cxwo implements cxwu {
    private final cxwr a;
    private final cxww b;
    private final cxwt c;
    private final Map<String, Integer> d;
    private final Map<String, ResolveInfo> e;
    private List<cxwm> f;

    public cxwo(cxwn cxwnVar) {
        dbsk.s(cxwnVar.a);
        this.a = new cxwr(cxwnVar.a);
        this.b = new cxww(cxwnVar.a);
        this.e = new HashMap();
        List<cxwm> list = null;
        int i = 1;
        if (cxwnVar.b == null) {
            dbsk.t(null, "If no intentEntries, must set intent.");
            dbsk.t(null, "If no intentEntries, must set priorities.");
            List<ResolveInfo> queryIntentActivities = cxwnVar.a.getPackageManager().queryIntentActivities(null, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                cxwj d = cxwk.d();
                d.a = resolveInfo;
                cxwk a = d.a();
                arrayList.add(a);
                this.e.put(a.a(), resolveInfo);
            }
            this.f = arrayList;
            this.d = null;
        } else {
            dbsk.b(true, "Can not be set with intentEntries.");
            dbsk.b(true, "Can not be set with intentEntries.");
            this.f = cxwnVar.b;
            this.d = new HashMap();
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                this.d.put(this.f.get(i2).a(), Integer.valueOf(this.f.size() - i2));
            }
        }
        cxwt cxwtVar = new cxwt(this.d);
        this.c = cxwtVar;
        List<cxwm> list2 = this.f;
        cxwr cxwrVar = this.a;
        cxww cxwwVar = this.b;
        Map<String, Integer> map = this.d;
        if (list2 != null) {
            cxwtVar.a(list2);
            Iterator<cxwm> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (cxwrVar.a.getInt(it.next().a(), 0) > 0) {
                        cxwrVar.b(list2);
                        HashMap hashMap = new HashMap();
                        for (cxwm cxwmVar : list2) {
                            hashMap.put(cxwmVar, Integer.valueOf(cxwrVar.a.getInt(cxwmVar.a(), 0)));
                        }
                        HashMap hashMap2 = new HashMap();
                        cxwrVar.b(list2);
                        Number number = (Number) hashMap.get(list2.get(0));
                        int i3 = 0;
                        int i4 = 1;
                        while (i3 < list2.size()) {
                            Number number2 = (Number) hashMap.get(list2.get(i3));
                            if (!number2.equals(number)) {
                                i4 += 2;
                            }
                            hashMap2.put(list2.get(i3), Integer.valueOf(i4));
                            i3++;
                            number = number2;
                        }
                        cxwwVar.b(list2);
                        HashMap hashMap3 = new HashMap();
                        for (cxwm cxwmVar2 : list2) {
                            hashMap3.put(cxwmVar2, Long.valueOf(cxwwVar.a.getLong(cxwmVar2.a(), 0L)));
                        }
                        HashMap hashMap4 = new HashMap();
                        cxwwVar.b(list2);
                        Number number3 = (Number) hashMap3.get(list2.get(0));
                        for (int i5 = 0; i5 < list2.size(); i5++) {
                            Number number4 = (Number) hashMap3.get(list2.get(i5));
                            Long l = (Long) number4;
                            if (l.longValue() == 0 || System.currentTimeMillis() - l.longValue() < 2592000000L) {
                                i = !number4.equals(number3) ? i + 1 : i;
                                hashMap4.put(list2.get(i5), Integer.valueOf(i));
                                number3 = number4;
                            } else {
                                hashMap4.put(list2.get(i5), Integer.valueOf(i + 3));
                            }
                        }
                        HashMap hashMap5 = new HashMap();
                        for (cxwm cxwmVar3 : list2) {
                            double intValue = ((Integer) hashMap2.get(cxwmVar3)).intValue();
                            double intValue2 = ((Integer) hashMap4.get(cxwmVar3)).intValue();
                            double doubleValue = cxsg.c.f().doubleValue();
                            Double.isNaN(intValue2);
                            Double.isNaN(intValue);
                            hashMap5.put(cxwmVar3, Double.valueOf(intValue + (intValue2 * doubleValue)));
                        }
                        ArrayList arrayList2 = new ArrayList(hashMap5.entrySet());
                        Collections.sort(arrayList2, new cxxc(map));
                        ArrayList arrayList3 = new ArrayList();
                        int size = arrayList2.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            arrayList3.add((cxwm) ((Map.Entry) arrayList2.get(i6)).getKey());
                        }
                        list = cxxd.a(arrayList3);
                    }
                } else {
                    cxwtVar.a(list2);
                    Collections.sort(list2, new cxws(cxwtVar));
                    list = cxxd.a(list2);
                    break;
                }
            }
        }
        this.f = list;
    }

    @Override // defpackage.cxwu
    public final List<cxwm> a() {
        return this.f;
    }

    @Override // defpackage.cxwu
    public final void b(cxwm cxwmVar) {
        this.a.a(cxwmVar.a());
        this.b.a(cxwmVar.a());
    }
}
