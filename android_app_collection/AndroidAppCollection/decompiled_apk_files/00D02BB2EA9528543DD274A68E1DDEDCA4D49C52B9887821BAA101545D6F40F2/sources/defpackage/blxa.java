package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: blxa  reason: default package */
/* loaded from: classes3.dex */
final class blxa extends cqqw {
    final /* synthetic */ blxc a;

    public blxa(blxc blxcVar) {
        this.a = blxcVar;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        abs absVar = recyclerView.l;
        boolean z = false;
        if (absVar instanceof aag) {
            aag aagVar = (aag) absVar;
            if (aagVar.ae() == aagVar.aN() - 1) {
                z = true;
            }
        }
        this.a.ak(i2, z);
    }
}
