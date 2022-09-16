package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.GeofencingRequest;
/* compiled from: PG */
/* renamed from: comt  reason: default package */
/* loaded from: classes5.dex */
final class comt extends comv {
    final /* synthetic */ GeofencingRequest a;
    final /* synthetic */ PendingIntent k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public comt(GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.a = geofencingRequest;
        this.k = pendingIntent;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(conr conrVar) {
        conrVar.S(this.a, this.k, this);
    }
}
