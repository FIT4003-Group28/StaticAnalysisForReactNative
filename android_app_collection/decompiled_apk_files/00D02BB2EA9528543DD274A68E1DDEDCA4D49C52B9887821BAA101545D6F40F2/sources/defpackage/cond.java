package defpackage;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.RemoveGeofencingRequest;
import com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
/* compiled from: PG */
/* renamed from: cond  reason: default package */
/* loaded from: classes5.dex */
public interface cond extends IInterface {
    void e(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, conb conbVar);

    void f(String[] strArr, conb conbVar, String str);

    void g(RemoveGeofencingRequest removeGeofencingRequest, conb conbVar);

    void h(PendingIntent pendingIntent);

    @Deprecated
    Location i();

    Location j(String str);

    void k(LocationRequestUpdateData locationRequestUpdateData);

    void l(boolean z);

    void m(Location location);

    void n(Location location, int i);

    void o(comz comzVar);

    LocationAvailability p(String str);

    void q(DeviceOrientationRequestUpdateData deviceOrientationRequestUpdateData);

    void r(LocationSettingsRequest locationSettingsRequest, conf confVar);

    void s(long j, PendingIntent pendingIntent);
}
