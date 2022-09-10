package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.internal.PlacesParams;
/* compiled from: PG */
/* renamed from: copc  reason: default package */
/* loaded from: classes5.dex */
public final class copc extends cla implements IInterface {
    public copc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
    }

    public final void e(PlaceRequest placeRequest, PlacesParams placesParams, PendingIntent pendingIntent, copf copfVar) {
        Parcel a = a();
        clc.e(a, placeRequest);
        clc.e(a, placesParams);
        clc.e(a, pendingIntent);
        clc.f(a, copfVar);
        Sk(2, a);
    }

    public final void f(PlacesParams placesParams, PendingIntent pendingIntent, copf copfVar) {
        Parcel a = a();
        clc.e(a, placesParams);
        clc.e(a, pendingIntent);
        clc.f(a, copfVar);
        Sk(3, a);
    }

    public final void g(NearbyAlertRequest nearbyAlertRequest, PlacesParams placesParams, PendingIntent pendingIntent, copf copfVar) {
        Parcel a = a();
        clc.e(a, nearbyAlertRequest);
        clc.e(a, placesParams);
        clc.e(a, pendingIntent);
        clc.f(a, copfVar);
        Sk(4, a);
    }

    public final void h(PlacesParams placesParams, PendingIntent pendingIntent, copf copfVar) {
        Parcel a = a();
        clc.e(a, placesParams);
        clc.e(a, pendingIntent);
        clc.f(a, copfVar);
        Sk(5, a);
    }
}
