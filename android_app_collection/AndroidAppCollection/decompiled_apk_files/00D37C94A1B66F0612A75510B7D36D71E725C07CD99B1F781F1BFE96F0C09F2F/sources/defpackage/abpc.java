package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: abpc  reason: default package */
/* loaded from: classes.dex */
final class abpc extends ne {
    final /* synthetic */ abpd a;

    public abpc(abpd abpdVar) {
        this.a = abpdVar;
    }

    @Override // defpackage.ne
    public final void i(RecyclerView recyclerView, int i) {
        abpd abpdVar = this.a;
        if (recyclerView == abpdVar.a()) {
            abpdVar.i = i;
            if (i == 1) {
                abpdVar.h = false;
            } else if (!abpdVar.h || abpdVar.G()) {
                abpdVar.h = false;
            } else {
                abpdVar.h();
            }
            abpdVar.D(!abpdVar.j());
        } else if (recyclerView != abpdVar.b()) {
        } else {
            abpdVar.F();
            abpdVar.k = i;
            if (i == 1) {
                abpdVar.j = false;
            } else if (abpdVar.H()) {
                abpdVar.j = false;
            } else if (abpdVar.j) {
                abpdVar.i();
            } else {
                abpdVar.E();
            }
        }
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        abpd abpdVar = this.a;
        if (recyclerView != abpdVar.a() || i2 >= 0) {
            return;
        }
        abpdVar.D(!abpdVar.j());
    }
}
