package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aedd  reason: default package */
/* loaded from: classes2.dex */
public final class aedd implements awwn {
    final /* synthetic */ aede a;

    public aedd(aede aedeVar) {
        this.a = aedeVar;
    }

    @Override // defpackage.awwn
    @dzsi
    public final awwt a() {
        return aede.b;
    }

    @Override // defpackage.awwn
    public final void b(awwb awwbVar, awwp awwpVar) {
        dktk[] values;
        djsd djsdVar;
        diin diinVar;
        aede aedeVar = this.a;
        dbsg a = awwbVar.a(awvv.f);
        if (awwbVar.c(awvv.f).b() || !a.a()) {
            return;
        }
        HashMap d = dcjz.d();
        Iterator<dhxw> it = ((dvhu) a.b()).b.iterator();
        while (true) {
            int i = 2;
            if (it.hasNext()) {
                dhxw next = it.next();
                dpwr b = dpwr.b(next.b);
                if (b == null) {
                    b = dpwr.UNKNOWN_MAJOR_EVENT_CARD_PLACEMENT;
                }
                for (dhxz dhxzVar : next.c) {
                    if (aede.a.containsKey(b)) {
                        dcen N = dcep.N();
                        int a2 = dhxy.a(dhxzVar.a);
                        int i2 = a2 - 1;
                        if (a2 != 0) {
                            if (i2 == 0) {
                                if (dhxzVar.a == 1) {
                                    djsdVar = (djsd) dhxzVar.b;
                                } else {
                                    djsdVar = djsd.f;
                                }
                                dhxu dhxuVar = djsdVar.b;
                                if (dhxuVar == null) {
                                    dhxuVar = dhxu.s;
                                }
                                N.b(dhxuVar.c);
                            } else if (i2 == 2) {
                                if (dhxzVar.a == 4) {
                                    diinVar = (diin) dhxzVar.b;
                                } else {
                                    diinVar = diin.h;
                                }
                                for (dhxu dhxuVar2 : diinVar.e) {
                                    N.b(dhxuVar2.c);
                                }
                            }
                            for (String str : N.f()) {
                                Set set = (Set) d.get(str);
                                if (set == null) {
                                    set = dcnm.c();
                                }
                                set.add(aede.a.get(b));
                                d.put(str, set);
                            }
                        } else {
                            throw null;
                        }
                    }
                }
            } else {
                Set<String> keySet = aedeVar.e.keySet();
                Set keySet2 = d.keySet();
                dcpd it2 = ((dcng) dcnm.p(keySet, keySet2)).iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    for (dktk dktkVar : dktk.values()) {
                        aecm aecmVar = aedeVar.d;
                        int e = aecm.e(aedeVar, str2);
                        Iterator<aecg> it3 = aecmVar.a.iterator();
                        while (it3.hasNext()) {
                            aecg next2 = it3.next();
                            dktk b2 = dktk.b(next2.b);
                            if (b2 == null) {
                                b2 = dktk.UNKNOWN_ASSISTIVE_TAB_TYPE;
                            }
                            if (b2.equals(dktkVar) && next2.c == e) {
                                it3.remove();
                            }
                            i = 2;
                        }
                        if (!aecmVar.f(dktkVar, i)) {
                            aecmVar.g(dktkVar, i, false);
                        }
                    }
                }
                dcnk p = dcnm.p(keySet2, keySet);
                dktk a3 = aedeVar.d.a();
                dcpd it4 = ((dcng) p).iterator();
                while (it4.hasNext()) {
                    String str3 = (String) it4.next();
                    if (!d.containsKey(str3) || !((Set) d.get(str3)).contains(a3)) {
                        dktk[] values2 = dktk.values();
                        int length = values2.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                dktk dktkVar2 = values2[i3];
                                if (d.containsKey(str3) && ((Set) d.get(str3)).contains(dktkVar2)) {
                                    aedeVar.d.h(aedeVar, 2, dktkVar2, str3, aede.c);
                                    break;
                                }
                                i3++;
                            }
                        }
                    } else {
                        aedeVar.d.h(aedeVar, 2, a3, str3, aede.c);
                    }
                }
                aedeVar.e = d;
                return;
            }
        }
    }
}
