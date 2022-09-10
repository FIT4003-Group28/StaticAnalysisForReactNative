package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.RemoveGeofencingRequest;
/* compiled from: PG */
/* renamed from: comu  reason: default package */
/* loaded from: classes5.dex */
final class comu extends comv {
    final /* synthetic */ RemoveGeofencingRequest a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public comu(GoogleApiClient googleApiClient, RemoveGeofencingRequest removeGeofencingRequest) {
        super(googleApiClient);
        this.a = removeGeofencingRequest;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(conr conrVar) {
        conr conrVar2 = conrVar;
        RemoveGeofencingRequest removeGeofencingRequest = this.a;
        conrVar2.K();
        ((cond) conrVar2.L()).g(removeGeofencingRequest, new conp(this));
    }
}
