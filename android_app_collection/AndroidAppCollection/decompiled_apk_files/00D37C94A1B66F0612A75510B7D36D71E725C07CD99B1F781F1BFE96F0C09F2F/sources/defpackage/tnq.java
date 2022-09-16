package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: tnq  reason: default package */
/* loaded from: classes4.dex */
public final class tnq {
    private final Map a;
    private final aoos b = aoos.b();

    public tnq(Map map) {
        this.a = map;
    }

    public final void a(aopd aopdVar, List list, aoqt aoqtVar, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            azqb azqbVar = (azqb) this.a.get(Integer.valueOf(num.intValue()));
            tnp tnpVar = azqbVar == null ? null : (tnp) azqbVar.get();
            if (tnpVar != null) {
                ankt a = tnpVar.a((aoqu) aopdVar.qm(this.b.d((aopd) aopdVar.mo50getDefaultInstanceForType(), num.intValue())));
                a.getClass();
                if (tnp.a.equals(a)) {
                    continue;
                } else if (aoqtVar != null) {
                    try {
                        ((tno) anlz.y(a)).a(aoqtVar);
                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    list2.add(a);
                }
            }
        }
    }
}
