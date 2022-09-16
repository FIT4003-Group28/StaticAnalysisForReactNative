package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aacl  reason: default package */
/* loaded from: classes.dex */
public final class aacl implements aaci {
    public static final Comparator a = utr.g;
    private final Set b;
    private final Executor c;

    public aacl(Set set, Executor executor) {
        aqxo.y(!set.isEmpty());
        this.b = set;
        this.c = executor;
    }

    @Override // defpackage.aaci
    public final aach a(cer cerVar) {
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        amzs it = ((amyt) this.b).iterator();
        while (it.hasNext()) {
            aach a2 = ((aaci) it.next()).a(cerVar);
            arrayList.add(a2.b());
            arrayList2.add(a2.a());
        }
        return new aack(anii.h(anlz.w(arrayList), new ydy(12), this.c), (aacm) Collections.max(arrayList2, a));
    }
}
