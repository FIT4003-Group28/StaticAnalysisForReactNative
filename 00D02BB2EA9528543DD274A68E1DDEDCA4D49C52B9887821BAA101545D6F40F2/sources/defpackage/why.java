package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: why  reason: default package */
/* loaded from: classes7.dex */
final class why implements degu<Void> {
    final /* synthetic */ whz a;

    public why(whz whzVar) {
        this.a = whzVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi Void r4) {
        whz whzVar = this.a;
        cqkx.p(whzVar);
        gga ggaVar = whzVar.b.get();
        if (ggaVar == null || !ggaVar.aZ) {
            return;
        }
        if (!whzVar.b() && !whzVar.c.d(ggaVar)) {
            return;
        }
        ckos.a(ggaVar.findViewById(16908290), ggaVar.getString(true != whzVar.b() ? R.string.SAVED_TRIPS_PROD_TRIP_REMOVED : R.string.SAVED_TRIPS_PROD_TRIP_SAVED), 0).c();
    }
}
