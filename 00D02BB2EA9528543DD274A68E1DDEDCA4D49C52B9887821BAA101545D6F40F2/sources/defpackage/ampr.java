package defpackage;

import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ampr  reason: default package */
/* loaded from: classes2.dex */
public final class ampr implements Comparator<alvz> {
    private final IdentityHashMap<alvz, Integer> a;

    public ampr(amqk amqkVar, alyt alytVar) {
        List<alvz> list = alytVar.e;
        dbsk.s(list);
        this.a = new IdentityHashMap<>(list.size());
        alyr i = alytVar.i();
        while (i.hasNext()) {
            alvz next = i.next();
            this.a.put(next, Integer.valueOf(amqkVar.b(next).E));
        }
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(alvz alvzVar, alvz alvzVar2) {
        alvz alvzVar3 = alvzVar;
        alvz alvzVar4 = alvzVar2;
        Integer num = this.a.get(alvzVar3);
        Integer num2 = this.a.get(alvzVar4);
        dbzx dbzxVar = dbzx.b;
        int i = 0;
        int intValue = num == null ? 0 : num.intValue();
        if (num2 != null) {
            i = num2.intValue();
        }
        return dbzxVar.c(intValue, i).c(alvzVar3.b(), alvzVar4.b()).c(alvzVar3.c(), alvzVar4.c()).i();
    }
}
