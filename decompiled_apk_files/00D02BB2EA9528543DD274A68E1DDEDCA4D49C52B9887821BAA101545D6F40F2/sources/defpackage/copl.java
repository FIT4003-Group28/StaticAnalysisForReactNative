package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.PlaceRequest;
/* compiled from: PG */
/* renamed from: copl  reason: default package */
/* loaded from: classes5.dex */
public final class copl extends cooo<copo> {
    final /* synthetic */ PlaceRequest a;
    final /* synthetic */ PendingIntent k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copl(Api api, GoogleApiClient googleApiClient, PlaceRequest placeRequest, PendingIntent pendingIntent) {
        super(api, googleApiClient);
        this.a = placeRequest;
        this.k = pendingIntent;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cnnq cnnqVar) {
        copo copoVar = (copo) cnnqVar;
        coop coopVar = new coop(this);
        ((copc) copoVar.L()).e(this.a, copoVar.a, this.k, coopVar);
    }
}
