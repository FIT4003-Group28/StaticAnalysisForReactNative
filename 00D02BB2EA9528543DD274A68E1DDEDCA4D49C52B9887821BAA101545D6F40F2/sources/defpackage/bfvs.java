package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: bfvs  reason: default package */
/* loaded from: classes3.dex */
final class bfvs extends cqqw {
    final /* synthetic */ bfvv a;

    public bfvs(bfvv bfvvVar) {
        this.a = bfvvVar;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        abs absVar = recyclerView.l;
        if (absVar instanceof aag) {
            aag aagVar = (aag) absVar;
            dbsk.s(aagVar);
            if (this.a.a.a().j() != bege.OVERVIEW) {
                return;
            }
            int ac = aagVar.ac();
            int i3 = this.a.c;
            boolean z = false;
            if (ac <= i3 && i3 <= aagVar.ae()) {
                z = true;
            }
            bfvv bfvvVar = this.a;
            boolean z2 = bfvvVar.e;
            if (z2 == z && bfvvVar.d == z2) {
                return;
            }
            bfvvVar.e = z;
            bfvvVar.p(z);
        }
    }
}
