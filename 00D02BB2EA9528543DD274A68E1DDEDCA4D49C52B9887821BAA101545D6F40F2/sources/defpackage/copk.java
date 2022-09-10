package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.NearbyAlertRequest;
/* compiled from: PG */
/* renamed from: copk  reason: default package */
/* loaded from: classes5.dex */
public final class copk extends cooo<copo> {
    final /* synthetic */ NearbyAlertRequest a;
    final /* synthetic */ PendingIntent k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copk(Api api, GoogleApiClient googleApiClient, NearbyAlertRequest nearbyAlertRequest, PendingIntent pendingIntent) {
        super(api, googleApiClient);
        this.a = nearbyAlertRequest;
        this.k = pendingIntent;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cnnq cnnqVar) {
        copo copoVar = (copo) cnnqVar;
        coop coopVar = new coop(this);
        ((copc) copoVar.L()).g(this.a, copoVar.a, this.k, coopVar);
    }
}
