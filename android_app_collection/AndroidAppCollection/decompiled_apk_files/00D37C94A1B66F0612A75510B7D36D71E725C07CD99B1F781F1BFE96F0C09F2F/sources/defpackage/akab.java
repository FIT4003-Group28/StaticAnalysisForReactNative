package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: akab  reason: default package */
/* loaded from: classes.dex */
public final class akab {
    public final akad a = new akaa();
    final List b = new CopyOnWriteArrayList();

    public final List a(final List list) {
        final List list2 = (List) ayoi.Q(list).V(new ayqe() { // from class: ajzy
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                akab akabVar = akab.this;
                for (akad akadVar : akabVar.b) {
                    if (akadVar.e() != null && akadVar.e().a(obj)) {
                        return akadVar;
                    }
                }
                return akabVar.a;
            }
        }).aq().U();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
            ((akad) list2.get(i)).c();
        }
        final int size = list.size();
        if (size > 0) {
            arrayList.add(ayoi.z(new Callable() { // from class: ajzz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i2 = size;
                    List list3 = list2;
                    List list4 = list;
                    final ArrayList arrayList2 = new ArrayList(i2);
                    akac akacVar = new akac() { // from class: ajzx
                        @Override // defpackage.akac
                        public final void a(Object obj) {
                            arrayList2.add(obj);
                        }
                    };
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((akad) list3.get(i3)).b(list4.get(i3), akacVar);
                    }
                    return ayoi.Q(arrayList2);
                }
            }));
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyList();
        }
        return (List) (arrayList.size() == 1 ? (ayoi) arrayList.get(0) : ayoi.Q(arrayList).s(ayrb.a, aynx.a, aynx.a, false)).aq().U();
    }

    public final void b(akad akadVar) {
        if (akadVar == null) {
            return;
        }
        this.b.add(0, akadVar);
    }
}
