package defpackage;

import android.location.Location;
import android.os.Bundle;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: ahtb  reason: default package */
/* loaded from: classes2.dex */
final class ahtb implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ ahtc a;

    public ahtb(ahtc ahtcVar) {
        this.a = ahtcVar;
    }

    @Override // defpackage.cnpv
    public final void Ph(@dzsi Bundle bundle) {
        int i = ckfu.a;
        ahtc ahtcVar = this.a;
        Location lastLocation = ahtcVar.b.getLastLocation(ahtcVar.a);
        if (lastLocation != null) {
            deig<GmmLocation> deigVar = this.a.c;
            amvs amvsVar = new amvs();
            amvsVar.j(lastLocation);
            deigVar.j(amvsVar.d());
        } else {
            this.a.c.k(new IllegalStateException("location unavailable"));
        }
        this.a.a.disconnect();
    }

    @Override // defpackage.cnsi
    public final void Pi(ConnectionResult connectionResult) {
        this.a.c.k(new IllegalStateException("location unavailable"));
        this.a.a.disconnect();
    }

    @Override // defpackage.cnpv
    public final void Pj(int i) {
        this.a.c.k(new IllegalStateException("location unavailable"));
        this.a.a.disconnect();
    }
}
