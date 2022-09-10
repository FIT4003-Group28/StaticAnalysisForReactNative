package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: nbx  reason: default package */
/* loaded from: classes7.dex */
final class nbx implements nar {
    final /* synthetic */ ncb a;

    public nbx(ncb ncbVar) {
        this.a = ncbVar;
    }

    @Override // defpackage.nar
    public final void a(int i) {
        if (i >= this.a.b.a()) {
            ncb ncbVar = this.a;
            ncbVar.e.k(ncbVar.d.getString(R.string.CAR_ALTERNATE_ROUTE_PREVIEW_FAILED_TOAST), 0);
            return;
        }
        this.a.b.p(i);
    }

    @Override // defpackage.nar
    public final void b(int i) {
        if (i >= this.a.b.a()) {
            ncb ncbVar = this.a;
            ncbVar.e.k(ncbVar.d.getString(R.string.CAR_ALTERNATE_ROUTE_SELECT_FAILED_TOAST), 0);
            return;
        }
        if (this.a.m() && this.a.b.o() != i) {
            this.a.b.p(i);
        }
        this.a.b.n(i);
        this.a.a.c();
    }
}
