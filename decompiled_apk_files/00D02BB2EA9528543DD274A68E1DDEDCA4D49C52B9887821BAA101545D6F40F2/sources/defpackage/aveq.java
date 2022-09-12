package defpackage;

import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: aveq  reason: default package */
/* loaded from: classes.dex */
final class aveq implements degu<List<btlu>> {
    final /* synthetic */ aver a;

    public aveq(aver averVar) {
        this.a = averVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (th instanceof akex) {
            ((ckcn) this.a.g.a(ckia.J)).a();
        } else {
            bvoo.i(new RuntimeException(th));
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(List<btlu> list) {
        List<btlu> list2 = list;
        for (btlu btluVar : list2) {
            if (btlu.e(btlu.h(btluVar))) {
                return;
            }
        }
        aver averVar = this.a;
        HashSet hashSet = new HashSet();
        for (avyy avyyVar : averVar.d.values()) {
            hashSet.addAll(avyyVar.c(list2));
        }
        averVar.f(hashSet);
    }
}
