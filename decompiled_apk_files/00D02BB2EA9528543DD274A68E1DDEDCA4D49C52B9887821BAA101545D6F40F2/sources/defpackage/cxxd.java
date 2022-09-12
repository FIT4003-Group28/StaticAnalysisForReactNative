package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxxd  reason: default package */
/* loaded from: classes5.dex */
public final class cxxd {
    public static List<cxwm> a(List<cxwm> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            cxwm cxwmVar = list.get(i);
            if (i < 3) {
                arrayList.add(cxwmVar);
            } else if (cxwmVar instanceof cxwl) {
                arrayList2.add(cxwmVar);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.addAll(3 - arrayList2.size(), arrayList2);
            return arrayList.subList(0, 3);
        }
        return arrayList;
    }
}
