package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.internal.LocationRequestInternal;
/* compiled from: PG */
/* renamed from: comm  reason: default package */
/* loaded from: classes5.dex */
final class comm extends comp {
    final /* synthetic */ LocationRequestInternal a;
    final /* synthetic */ PendingIntent k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public comm(GoogleApiClient googleApiClient, LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.a = locationRequestInternal;
        this.k = pendingIntent;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(conr conrVar) {
        conrVar.W(this.a, this.k, new comq(this));
    }
}
