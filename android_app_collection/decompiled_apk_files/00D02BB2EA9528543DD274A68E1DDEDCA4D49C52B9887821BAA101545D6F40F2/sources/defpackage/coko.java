package defpackage;

import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: coko  reason: default package */
/* loaded from: classes5.dex */
public final class coko {
    private final List<ParcelableGeofence> b = new ArrayList();
    public int a = 5;
    private final String c = "";

    public final GeofencingRequest a() {
        cnwc.e(!this.b.isEmpty(), "No geofence has been added to this request.");
        return new GeofencingRequest(this.b, this.a, this.c);
    }

    public final void b(ParcelableGeofence parcelableGeofence) {
        cnwc.e(true, "Geofence must be created using Geofence.Builder.");
        this.b.add(parcelableGeofence);
    }
}
