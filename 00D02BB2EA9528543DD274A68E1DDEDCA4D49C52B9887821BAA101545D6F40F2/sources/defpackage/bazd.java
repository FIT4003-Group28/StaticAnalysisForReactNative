package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bazd  reason: default package */
/* loaded from: classes3.dex */
final class bazd implements axwa {
    final /* synthetic */ baze a;

    public bazd(baze bazeVar) {
        this.a = bazeVar;
    }

    @Override // defpackage.axwa
    public final void a(List<azvo> list) {
        bvrj.UI_THREAD.c();
        dbyv O = dbyv.O(list.size(), 1);
        for (azvo azvoVar : list) {
            O.n(azvoVar.j(), azvoVar);
        }
        List<bayj> QI = this.a.QI();
        dbsk.s(QI);
        for (bazw bazwVar : dcft.i(QI, dbst.d(bazw.class))) {
            dnkc j = bazwVar.e.j();
            List c = O.c(j);
            if (!c.isEmpty()) {
                azvo azvoVar2 = (azvo) c.get(0);
                bazwVar.e = azvoVar2;
                O.G(j, azvoVar2);
            }
        }
    }
}
