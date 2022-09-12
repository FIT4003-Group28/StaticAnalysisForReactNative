package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
/* compiled from: PG */
/* renamed from: conv  reason: default package */
/* loaded from: classes5.dex */
final class conv extends cole<LocationSettingsResult> {
    final /* synthetic */ LocationSettingsRequest a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public conv(GoogleApiClient googleApiClient, LocationSettingsRequest locationSettingsRequest) {
        super(googleApiClient);
        this.a = locationSettingsRequest;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(conr conrVar) {
        conrVar.Z(this.a, this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return new LocationSettingsResult(status, null);
    }
}
