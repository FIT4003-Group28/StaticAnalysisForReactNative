package com.baidu.mapapi.model;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class LatLng implements Parcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private static final String f1760a = "LatLng";
    public final double latitude;
    public final double latitudeE6;
    public final double longitude;
    public final double longitudeE6;

    public LatLng(double d2, double d3) {
        double d4 = d2 * 1000000.0d;
        double d5 = d3 * 1000000.0d;
        this.latitudeE6 = d4;
        this.longitudeE6 = d5;
        this.latitude = d4 / 1000000.0d;
        this.longitude = d5 / 1000000.0d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public LatLng(Parcel parcel) {
        this.latitude = parcel.readDouble();
        this.longitude = parcel.readDouble();
        this.latitudeE6 = parcel.readDouble();
        this.longitudeE6 = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((new String("latitude: ") + this.latitude) + ", longitude: ") + this.longitude;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.latitudeE6);
        parcel.writeDouble(this.longitudeE6);
    }
}
