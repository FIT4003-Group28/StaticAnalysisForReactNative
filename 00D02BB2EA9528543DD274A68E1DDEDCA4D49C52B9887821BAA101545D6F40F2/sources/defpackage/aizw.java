package defpackage;

import android.location.Location;
/* compiled from: PG */
/* renamed from: aizw  reason: default package */
/* loaded from: classes2.dex */
final class aizw<TResult> implements cpcf<Location> {
    final /* synthetic */ aizx a;

    public aizw(aizx aizxVar) {
        this.a = aizxVar;
    }

    @Override // defpackage.cpcf
    public final void a(cpcq<Location> cpcqVar) {
        aizx aizxVar = this.a;
        Location d = cpcqVar.d();
        dzvx.b(d, "it.result");
        aizxVar.b = d.getLatitude();
        aizx aizxVar2 = this.a;
        Location d2 = cpcqVar.d();
        dzvx.b(d2, "it.result");
        aizxVar2.c = d2.getLongitude();
        cqkx.p(this.a);
    }
}
