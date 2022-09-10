package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: bhmy  reason: default package */
/* loaded from: classes3.dex */
final class bhmy implements cqkn<qjc> {
    final /* synthetic */ bhmz a;

    public bhmy(bhmz bhmzVar) {
        this.a = bhmzVar;
    }

    @Override // defpackage.cqkn
    public final /* bridge */ /* synthetic */ void a(qjc qjcVar, View view) {
        aag aagVar;
        qjc qjcVar2 = qjcVar;
        View a = cqhu.a(view.getRootView(), ihx.b);
        if (a != null && (aagVar = (aag) ((RecyclerView) a).l) != null) {
            this.a.e = aagVar.ad();
        }
        ((qjg) qjcVar2).OQ(!qjcVar2.b().booleanValue());
        dcdc<bhmi> g = this.a.g();
        bhmz bhmzVar = this.a;
        int size = bhmzVar.b.a().size();
        bhmzVar.e = Math.min(Math.max(bhmzVar.e, 0), size - 1);
        igw b = bhmzVar.b.a().get(bhmzVar.e).b();
        if (!(b instanceof bhmi)) {
            bvoo.h("ModCarousel contained items which were not an instance of the NearbyStationItemViewModel", new Object[0]);
        }
        bhmi bhmiVar = (bhmi) b;
        int i = bhmzVar.e;
        while (true) {
            if (i >= size) {
                break;
            }
            bhmi bhmiVar2 = (bhmi) bhmzVar.b.a().get(i).b();
            if (bhmiVar2.i().booleanValue()) {
                bhmiVar = bhmiVar2;
                break;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= g.size()) {
                bhmzVar.e = 0;
                break;
            } else if (g.get(i2).equals(bhmiVar)) {
                bhmzVar.e = i2;
                break;
            } else {
                i2++;
            }
        }
        this.a.f(g);
        cqkx.p(this.a);
    }
}
