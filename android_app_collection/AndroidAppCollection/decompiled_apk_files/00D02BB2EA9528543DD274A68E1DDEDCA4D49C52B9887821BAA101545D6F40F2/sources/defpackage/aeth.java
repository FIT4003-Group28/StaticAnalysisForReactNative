package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: aeth  reason: default package */
/* loaded from: classes2.dex */
final class aeth implements ink {
    final /* synthetic */ aeti a;

    public aeth(aeti aetiVar) {
        this.a = aetiVar;
    }

    @Override // defpackage.ink
    public final void a(ilo iloVar) {
        this.a.q(iloVar);
    }

    @Override // defpackage.ink
    public final void b(ilo iloVar) {
        int indexOf = this.a.ar.k().indexOf(iloVar);
        if (indexOf == -1) {
            bvoo.h("Placemark index not found: %s", iloVar);
            return;
        }
        aeti aetiVar = this.a;
        RecyclerView a = aetiVar.am.a(aetiVar.b.c());
        if (a == null) {
            return;
        }
        a.n(indexOf);
    }
}
