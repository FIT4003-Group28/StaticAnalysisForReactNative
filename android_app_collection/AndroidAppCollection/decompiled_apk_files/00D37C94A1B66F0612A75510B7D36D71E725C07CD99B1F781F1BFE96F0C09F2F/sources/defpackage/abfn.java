package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abfn  reason: default package */
/* loaded from: classes.dex */
final class abfn implements abfo {
    @Override // defpackage.abfo
    public final Map b(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap.put(((abfr) it.next()).c(), anlz.o());
        }
        return hashMap;
    }
}
