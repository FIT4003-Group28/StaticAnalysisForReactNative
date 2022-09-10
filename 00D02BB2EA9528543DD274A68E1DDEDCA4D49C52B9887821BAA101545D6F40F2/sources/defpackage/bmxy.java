package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: bmxy  reason: default package */
/* loaded from: classes3.dex */
final class bmxy extends cqqw {
    final /* synthetic */ bmya a;

    public bmxy(bmya bmyaVar) {
        this.a = bmyaVar;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        abs absVar = recyclerView.l;
        if (!(absVar instanceof aag)) {
            return;
        }
        dbsk.s(absVar);
        aag aagVar = (aag) absVar;
        boolean z = aagVar.ae() == aagVar.aN() + (-1);
        bmya bmyaVar = this.a;
        if (bmyaVar.d == z) {
            return;
        }
        bmyaVar.d = z;
        if (!bmyaVar.b().booleanValue()) {
            return;
        }
        this.a.r();
    }
}
