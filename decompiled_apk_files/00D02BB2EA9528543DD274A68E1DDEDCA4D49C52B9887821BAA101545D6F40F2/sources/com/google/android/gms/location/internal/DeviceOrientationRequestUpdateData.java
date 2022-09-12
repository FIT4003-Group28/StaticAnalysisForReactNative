package com.google.android.gms.location.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DeviceOrientationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceOrientationRequestUpdateData> CREATOR = new coma();
    int a;
    DeviceOrientationRequestInternal b;
    coks c;
    comz d;

    public DeviceOrientationRequestUpdateData(int i, DeviceOrientationRequestInternal deviceOrientationRequestInternal, IBinder iBinder, IBinder iBinder2) {
        coks cokqVar;
        this.a = i;
        this.b = deviceOrientationRequestInternal;
        comz comzVar = null;
        if (iBinder == null) {
            cokqVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            if (queryLocalInterface instanceof coks) {
                cokqVar = (coks) queryLocalInterface;
            } else {
                cokqVar = new cokq(iBinder);
            }
        }
        this.c = cokqVar;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface2 instanceof comz) {
                comzVar = (comz) queryLocalInterface2;
            } else {
                comzVar = new comx(iBinder2);
            }
        }
        this.d = comzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DeviceOrientationRequestUpdateData a(coks coksVar) {
        return new DeviceOrientationRequestUpdateData(2, null, coksVar, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.u(parcel, 2, this.b, i);
        coks coksVar = this.c;
        IBinder iBinder = null;
        cnwn.p(parcel, 3, coksVar == null ? null : coksVar.asBinder());
        comz comzVar = this.d;
        if (comzVar != null) {
            iBinder = comzVar.asBinder();
        }
        cnwn.p(parcel, 4, iBinder);
        cnwn.c(parcel, d);
    }
}
