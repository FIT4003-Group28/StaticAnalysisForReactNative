package com.google.android.gms.location.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class DeviceOrientationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rfn(7);
    int a;
    DeviceOrientationRequestInternal b;
    rfy c;
    rgm d;

    public DeviceOrientationRequestUpdateData(int i, DeviceOrientationRequestInternal deviceOrientationRequestInternal, IBinder iBinder, IBinder iBinder2) {
        rfy rfwVar;
        this.a = i;
        this.b = deviceOrientationRequestInternal;
        rgm rgmVar = null;
        if (iBinder == null) {
            rfwVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            if (queryLocalInterface instanceof rfy) {
                rfwVar = (rfy) queryLocalInterface;
            } else {
                rfwVar = new rfw(iBinder);
            }
        }
        this.c = rfwVar;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface2 instanceof rgm) {
                rgmVar = (rgm) queryLocalInterface2;
            } else {
                rgmVar = new rgk(iBinder2);
            }
        }
        this.d = rgmVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.E(parcel, 2, this.b, i);
        rfy rfyVar = this.c;
        IBinder iBinder = null;
        tqj.y(parcel, 3, rfyVar == null ? null : rfyVar.asBinder());
        rgm rgmVar = this.d;
        if (rgmVar != null) {
            iBinder = rgmVar.asBinder();
        }
        tqj.y(parcel, 4, iBinder);
        tqj.n(parcel, m);
    }
}
