package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsResult;
/* compiled from: PG */
/* renamed from: mvl  reason: default package */
/* loaded from: classes7.dex */
final class mvl implements GoogleApiClient.ConnectionCallbacks {
    final /* synthetic */ mvn a;

    public mvl(mvn mvnVar) {
        this.a = mvnVar;
    }

    @Override // defpackage.cnpv
    public final void Ph(@dzsi Bundle bundle) {
        final mvn mvnVar = this.a;
        if (!mvnVar.c) {
            colo coloVar = LocationServices.SettingsApi;
            GoogleApiClient googleApiClient = mvnVar.a;
            colg colgVar = new colg();
            LocationRequest create = LocationRequest.create();
            create.setPriority(100);
            colgVar.b(create);
            colgVar.a = true;
            coloVar.a(googleApiClient, colgVar.a()).i(new cnon(mvnVar) { // from class: mvk
                private final mvn a;

                {
                    this.a = mvnVar;
                }

                @Override // defpackage.cnon
                public final void Om(cnom cnomVar) {
                    this.a.f((LocationSettingsResult) cnomVar);
                }
            });
        }
    }

    @Override // defpackage.cnpv
    public final void Pj(int i) {
    }
}
