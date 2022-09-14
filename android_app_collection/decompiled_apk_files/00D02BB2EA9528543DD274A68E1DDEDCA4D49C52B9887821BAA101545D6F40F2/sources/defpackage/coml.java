package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
/* compiled from: PG */
/* renamed from: coml  reason: default package */
/* loaded from: classes5.dex */
final class coml extends comp {
    final /* synthetic */ LocationRequest a;
    final /* synthetic */ PendingIntent k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coml(GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.a = locationRequest;
        this.k = pendingIntent;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(conr conrVar) {
        comq comqVar = new comq(this);
        LocationRequest locationRequest = this.a;
        PendingIntent pendingIntent = this.k;
        conn connVar = conrVar.t;
        connVar.f.a();
        connVar.f.b().k(LocationRequestUpdateData.c(LocationRequestInternal.a(locationRequest), pendingIntent, comqVar));
    }
}
