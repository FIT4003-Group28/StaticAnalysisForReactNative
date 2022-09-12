package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.model.LatLngBounds;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ckul  reason: default package */
/* loaded from: classes4.dex */
public final class ckul implements GoogleApiClient.ConnectionCallbacks {
    final /* synthetic */ ckum a;

    public ckul(ckum ckumVar) {
        this.a = ckumVar;
    }

    @Override // defpackage.cnpv
    public final void Ph(@dzsi Bundle bundle) {
        String str;
        LatLngBounds latLngBounds;
        long j;
        synchronized (this.a.b) {
            ckum ckumVar = this.a;
            str = ckumVar.c;
            latLngBounds = ckumVar.d;
            j = ckumVar.e;
        }
        ckum ckumVar2 = this.a;
        dbsk.s(latLngBounds);
        cnoa<copa> cnoaVar = cool.a;
        GoogleApiClient googleApiClient = ckumVar2.a;
        cnwc.n(latLngBounds, "bounds == null");
        cnwc.e(true, "maxResults <= 0");
        googleApiClient.enqueue(new cooy(cool.c, googleApiClient, latLngBounds)).i(new ckuk(ckumVar2, str, j));
    }

    @Override // defpackage.cnpv
    public final void Pj(int i) {
    }
}
