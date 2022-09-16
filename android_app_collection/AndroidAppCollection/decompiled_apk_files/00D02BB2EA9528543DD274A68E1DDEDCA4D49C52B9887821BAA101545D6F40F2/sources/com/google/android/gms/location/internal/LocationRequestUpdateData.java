package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LocationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationRequestUpdateData> CREATOR = new cont();
    int a;
    LocationRequestInternal b;
    coky c;
    PendingIntent d;
    cokv e;
    comz f;

    public LocationRequestUpdateData(int i, LocationRequestInternal locationRequestInternal, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        coky cokwVar;
        cokv coktVar;
        this.a = i;
        this.b = locationRequestInternal;
        comz comzVar = null;
        if (iBinder == null) {
            cokwVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface instanceof coky) {
                cokwVar = (coky) queryLocalInterface;
            } else {
                cokwVar = new cokw(iBinder);
            }
        }
        this.c = cokwVar;
        this.d = pendingIntent;
        if (iBinder2 == null) {
            coktVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface2 instanceof cokv) {
                coktVar = (cokv) queryLocalInterface2;
            } else {
                coktVar = new cokt(iBinder2);
            }
        }
        this.e = coktVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface3 instanceof comz) {
                comzVar = (comz) queryLocalInterface3;
            } else {
                comzVar = new comx(iBinder3);
            }
        }
        this.f = comzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LocationRequestUpdateData a(LocationRequestInternal locationRequestInternal, coky cokyVar, comz comzVar) {
        return new LocationRequestUpdateData(1, locationRequestInternal, cokyVar, null, null, comzVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [coky, android.os.IBinder] */
    public static LocationRequestUpdateData b(coky cokyVar, comz comzVar) {
        if (comzVar == null) {
            comzVar = null;
        }
        return new LocationRequestUpdateData(2, null, cokyVar, null, null, comzVar);
    }

    public static LocationRequestUpdateData c(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent, comz comzVar) {
        return new LocationRequestUpdateData(1, locationRequestInternal, null, pendingIntent, null, comzVar.asBinder());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LocationRequestUpdateData d(cokv cokvVar, comz comzVar) {
        return new LocationRequestUpdateData(2, null, null, null, cokvVar, comzVar != null ? comzVar.asBinder() : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.u(parcel, 2, this.b, i);
        coky cokyVar = this.c;
        IBinder iBinder = null;
        cnwn.p(parcel, 3, cokyVar == null ? null : cokyVar.asBinder());
        cnwn.u(parcel, 4, this.d, i);
        cokv cokvVar = this.e;
        cnwn.p(parcel, 5, cokvVar == null ? null : cokvVar.asBinder());
        comz comzVar = this.f;
        if (comzVar != null) {
            iBinder = comzVar.asBinder();
        }
        cnwn.p(parcel, 6, iBinder);
        cnwn.c(parcel, d);
    }
}
