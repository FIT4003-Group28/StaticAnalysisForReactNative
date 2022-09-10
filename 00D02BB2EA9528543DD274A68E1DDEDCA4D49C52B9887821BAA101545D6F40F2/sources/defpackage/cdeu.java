package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: cdeu  reason: default package */
/* loaded from: classes4.dex */
final class cdeu extends cqqw {
    final /* synthetic */ cdex a;

    public cdeu(cdex cdexVar) {
        this.a = cdexVar;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (this.a.d == cdew.SUCCESS_HAS_MORE_PAGES) {
            abs absVar = recyclerView.l;
            if (!(absVar instanceof aag)) {
                return;
            }
            aag aagVar = (aag) absVar;
            if (this.a.B()) {
                if (aagVar.ae() + 20 < aagVar.aN() - 1) {
                    return;
                }
            } else if (aagVar.ae() < aagVar.aN() - 1) {
                return;
            }
            this.a.d = cdew.FETCHING;
            this.a.b.i();
        }
    }
}
