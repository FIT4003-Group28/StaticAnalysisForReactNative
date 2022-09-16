package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: aabv  reason: default package */
/* loaded from: classes2.dex */
final class aabv extends cqqw {
    @dzsi
    public aag a;
    final /* synthetic */ aaby b;

    public aabv(aaby aabyVar) {
        this.b = aabyVar;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        abs absVar = recyclerView.l;
        if (absVar instanceof aag) {
            aag aagVar = (aag) absVar;
            this.a = aagVar;
            if (this.a.aN() - (aagVar.af() + 1) > 10) {
                return;
            }
            aadt aadtVar = this.b.d;
            if (aadtVar.c() || aadtVar.f == null) {
                return;
            }
            dils a = aadtVar.e.a();
            dsqp dsqpVar = (dsqp) a.cu(5);
            dsqpVar.bC(a);
            dilr dilrVar = (dilr) dsqpVar;
            dspd dspdVar = aadtVar.f;
            dbsk.s(dspdVar);
            if (dilrVar.c) {
                dilrVar.bF();
                dilrVar.c = false;
            }
            dils dilsVar = (dils) dilrVar.b;
            dils dilsVar2 = dils.i;
            dspdVar.getClass();
            int i3 = dilsVar.a | 8;
            dilsVar.a = i3;
            dilsVar.e = dspdVar;
            dilsVar.g = null;
            dilsVar.a = i3 & (-65);
            aacn aacnVar = new aacn(dilrVar.bK());
            aadtVar.a(aacnVar);
            aadtVar.c.a(aacnVar);
            return;
        }
        bvoo.h("InfiniteScrollingListener applied to incorrect View.", new Object[0]);
    }
}
