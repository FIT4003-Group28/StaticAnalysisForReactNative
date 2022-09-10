package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: pye  reason: default package */
/* loaded from: classes7.dex */
final class pye extends pyg {
    final /* synthetic */ qcd a;
    final /* synthetic */ pyh b;

    public pye(pyh pyhVar, qcd qcdVar) {
        this.b = pyhVar;
        this.a = qcdVar;
    }

    @Override // defpackage.pyg, defpackage.amwy
    public final void a(int i) {
        this.b.o().c();
        if (i == 1) {
            this.b.l(this.a);
            this.b.k(R.string.SAVE_ROUTE_SUCCESS_TOAST);
            return;
        }
        this.b.m(this.a);
        this.b.k(R.string.SAVE_ROUTE_TILE_PIN_FAILED_TOAST);
    }
}
