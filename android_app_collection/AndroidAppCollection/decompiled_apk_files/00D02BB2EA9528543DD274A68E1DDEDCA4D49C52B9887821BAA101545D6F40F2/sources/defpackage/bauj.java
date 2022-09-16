package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bauj  reason: default package */
/* loaded from: classes3.dex */
public final class bauj implements hzz {
    final /* synthetic */ baup a;

    public bauj(baup baupVar) {
        this.a = baupVar;
    }

    @Override // defpackage.hzz
    public final void a(dagb dagbVar) {
        Integer num;
        baup baupVar = this.a;
        if (baupVar.aJ()) {
            num = Integer.valueOf(true != baupVar.d.getEnableFeatureParameters().aT ? 2 : 3);
        } else {
            num = null;
        }
        if (this.a.ax == null || num == null || dagbVar.d != num.intValue()) {
            return;
        }
        this.a.ax.v();
    }

    @Override // defpackage.hzz
    public final void b(dagb dagbVar) {
    }

    @Override // defpackage.hzz
    public final void c(dagb dagbVar) {
        ff J = this.a.J();
        if (this.a.b.e().isEmpty() || J == null || !this.a.b.e().get(dagbVar.d).a().toString().equals(J.getString(R.string.YOUR_PLACES_UPCOMING_TRIPS_RESERVATIONS)) || !this.a.ae.f()) {
            return;
        }
        this.a.g.y().g();
        cqkx.p(this.a.b.e().get(dagbVar.d));
    }
}
