package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.RemoveGeofencingRequest;
import java.util.List;
/* compiled from: PG */
/* renamed from: comw  reason: default package */
/* loaded from: classes.dex */
public final class comw implements coki {
    @Override // defpackage.coki
    public final cnoh<Status> a(GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return googleApiClient.execute(new comt(googleApiClient, geofencingRequest, pendingIntent));
    }

    @Override // defpackage.coki
    public final cnoh<Status> b(GoogleApiClient googleApiClient, List<String> list) {
        cnwc.n(list, "geofence can't be null.");
        cnwc.e(!list.isEmpty(), "Geofences must contains at least one id.");
        return googleApiClient.execute(new comu(googleApiClient, new RemoveGeofencingRequest(list, null, "")));
    }
}
