package defpackage;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.RemoveGeofencingRequest;
import com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
/* compiled from: PG */
/* renamed from: conc  reason: default package */
/* loaded from: classes5.dex */
public final class conc extends cla implements cond {
    public conc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // defpackage.cond
    public final void e(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, conb conbVar) {
        Parcel a = a();
        clc.e(a, geofencingRequest);
        clc.e(a, pendingIntent);
        clc.f(a, conbVar);
        Sk(57, a);
    }

    @Override // defpackage.cond
    public final void f(String[] strArr, conb conbVar, String str) {
        Parcel a = a();
        a.writeStringArray(strArr);
        clc.f(a, conbVar);
        a.writeString(str);
        Sk(3, a);
    }

    @Override // defpackage.cond
    public final void g(RemoveGeofencingRequest removeGeofencingRequest, conb conbVar) {
        Parcel a = a();
        clc.e(a, removeGeofencingRequest);
        clc.f(a, conbVar);
        Sk(74, a);
    }

    @Override // defpackage.cond
    public final void h(PendingIntent pendingIntent) {
        Parcel a = a();
        clc.e(a, pendingIntent);
        Sk(6, a);
    }

    @Override // defpackage.cond
    public final Location i() {
        Parcel Si = Si(7, a());
        Location location = (Location) clc.d(Si, Location.CREATOR);
        Si.recycle();
        return location;
    }

    @Override // defpackage.cond
    public final Location j(String str) {
        Parcel a = a();
        a.writeString(str);
        Parcel Si = Si(80, a);
        Location location = (Location) clc.d(Si, Location.CREATOR);
        Si.recycle();
        return location;
    }

    @Override // defpackage.cond
    public final void k(LocationRequestUpdateData locationRequestUpdateData) {
        Parcel a = a();
        clc.e(a, locationRequestUpdateData);
        Sk(59, a);
    }

    @Override // defpackage.cond
    public final void l(boolean z) {
        Parcel a = a();
        a.writeInt(z ? 1 : 0);
        Sk(12, a);
    }

    @Override // defpackage.cond
    public final void m(Location location) {
        Parcel a = a();
        clc.e(a, location);
        Sk(13, a);
    }

    @Override // defpackage.cond
    public final void n(Location location, int i) {
        Parcel a = a();
        clc.e(a, location);
        a.writeInt(i);
        Sk(26, a);
    }

    @Override // defpackage.cond
    public final void o(comz comzVar) {
        Parcel a = a();
        clc.f(a, comzVar);
        Sk(67, a);
    }

    @Override // defpackage.cond
    public final LocationAvailability p(String str) {
        Parcel a = a();
        a.writeString(str);
        Parcel Si = Si(34, a);
        LocationAvailability locationAvailability = (LocationAvailability) clc.d(Si, LocationAvailability.CREATOR);
        Si.recycle();
        return locationAvailability;
    }

    @Override // defpackage.cond
    public final void q(DeviceOrientationRequestUpdateData deviceOrientationRequestUpdateData) {
        Parcel a = a();
        clc.e(a, deviceOrientationRequestUpdateData);
        Sk(75, a);
    }

    @Override // defpackage.cond
    public final void r(LocationSettingsRequest locationSettingsRequest, conf confVar) {
        Parcel a = a();
        clc.e(a, locationSettingsRequest);
        clc.f(a, confVar);
        a.writeString(null);
        Sk(63, a);
    }

    @Override // defpackage.cond
    public final void s(long j, PendingIntent pendingIntent) {
        Parcel a = a();
        a.writeLong(j);
        a.writeInt(1);
        clc.e(a, pendingIntent);
        Sk(5, a);
    }
}
