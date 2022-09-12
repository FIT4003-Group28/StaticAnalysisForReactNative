package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/* compiled from: PG */
/* renamed from: chta  reason: default package */
/* loaded from: classes4.dex */
public final class chta {
    public final HashSet<chxr> a = new HashSet<>();
    public String b = null;
    public final Map<Integer, ArrayList<chxr>> c = new HashMap();

    public final void a(int i, Collection<chxr> collection) {
        bvrj.UI_THREAD.c();
        Map<Integer, ArrayList<chxr>> map = this.c;
        Integer valueOf = Integer.valueOf(i);
        ArrayList<chxr> arrayList = map.get(valueOf);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.c.put(valueOf, arrayList);
        }
        for (chxr chxrVar : collection) {
            if (this.a.add(chxrVar)) {
                arrayList.add(chxrVar);
            }
        }
    }

    public final dbsg<Integer> b(chxr chxrVar) {
        for (Map.Entry<Integer, ArrayList<chxr>> entry : this.c.entrySet()) {
            int intValue = entry.getKey().intValue();
            if (entry.getValue().remove(chxrVar)) {
                this.a.remove(chxrVar);
                return dbsg.i(Integer.valueOf(intValue));
            }
        }
        return dbpy.a;
    }
}
