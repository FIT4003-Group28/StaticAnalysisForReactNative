package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class LocationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rfn(10);
    public final int a;
    public final LocationRequestInternal b;
    public final PendingIntent c;
    public final String d;
    private final rge e;
    private final rgb f;
    private final rgm g;

    public LocationRequestUpdateData(int i, LocationRequestInternal locationRequestInternal, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        rge rgeVar;
        rgb rgbVar;
        this.a = i;
        this.b = locationRequestInternal;
        rgm rgmVar = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface instanceof rge) {
                rgeVar = (rge) queryLocalInterface;
            } else {
                rgeVar = new rgc(iBinder);
            }
        } else {
            rgeVar = null;
        }
        this.e = rgeVar;
        this.c = pendingIntent;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface2 instanceof rgb) {
                rgbVar = (rgb) queryLocalInterface2;
            } else {
                rgbVar = new rfz(iBinder2);
            }
        } else {
            rgbVar = null;
        }
        this.f = rgbVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface3 instanceof rgm) {
                rgmVar = (rgm) queryLocalInterface3;
            } else {
                rgmVar = new rgk(iBinder3);
            }
        }
        this.g = rgmVar;
        this.d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [rgb, android.os.IBinder] */
    public static LocationRequestUpdateData a(rgb rgbVar, rgm rgmVar) {
        if (rgmVar == null) {
            rgmVar = null;
        }
        return new LocationRequestUpdateData(2, null, null, rgbVar, null, rgmVar, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.E(parcel, 2, this.b, i);
        rge rgeVar = this.e;
        IBinder iBinder = null;
        tqj.y(parcel, 3, rgeVar == null ? null : rgeVar.asBinder());
        tqj.E(parcel, 4, this.c, i);
        rgb rgbVar = this.f;
        tqj.y(parcel, 5, rgbVar == null ? null : rgbVar.asBinder());
        rgm rgmVar = this.g;
        if (rgmVar != null) {
            iBinder = rgmVar.asBinder();
        }
        tqj.y(parcel, 6, iBinder);
        tqj.F(parcel, 8, this.d);
        tqj.n(parcel, m);
    }
}
