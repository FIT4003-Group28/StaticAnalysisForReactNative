package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.GeofencingRequest;
import java.util.List;
/* compiled from: PG */
@Deprecated
/* renamed from: coki  reason: default package */
/* loaded from: classes.dex */
public interface coki {
    cnoh<Status> a(GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent);

    cnoh<Status> b(GoogleApiClient googleApiClient, List<String> list);
}
