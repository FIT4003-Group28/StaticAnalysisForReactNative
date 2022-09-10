package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
/* compiled from: PG */
/* renamed from: conw  reason: default package */
/* loaded from: classes.dex */
public final class conw implements colo {
    @Override // defpackage.colo
    public final cnoh<LocationSettingsResult> a(GoogleApiClient googleApiClient, LocationSettingsRequest locationSettingsRequest) {
        return googleApiClient.enqueue(new conv(googleApiClient, locationSettingsRequest));
    }
}
