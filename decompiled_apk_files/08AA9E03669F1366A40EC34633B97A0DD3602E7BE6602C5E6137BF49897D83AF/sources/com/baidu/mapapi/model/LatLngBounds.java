package com.baidu.mapapi.model;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class LatLngBounds implements Parcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new b();
    public final LatLng northeast;
    public final LatLng southwest;

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private double f1761a;

        /* renamed from: b  reason: collision with root package name */
        private double f1762b;

        /* renamed from: c  reason: collision with root package name */
        private double f1763c;

        /* renamed from: d  reason: collision with root package name */
        private double f1764d;
        private boolean e = true;

        public LatLngBounds build() {
            return new LatLngBounds(new LatLng(this.f1762b, this.f1764d), new LatLng(this.f1761a, this.f1763c));
        }

        public Builder include(LatLng latLng) {
            if (latLng == null) {
                return this;
            }
            if (this.e) {
                this.e = false;
                double d2 = latLng.latitude;
                this.f1761a = d2;
                this.f1762b = d2;
                double d3 = latLng.longitude;
                this.f1763c = d3;
                this.f1764d = d3;
            }
            double d4 = latLng.latitude;
            double d5 = latLng.longitude;
            if (d4 < this.f1761a) {
                this.f1761a = d4;
            }
            if (d4 > this.f1762b) {
                this.f1762b = d4;
            }
            if (d5 < this.f1763c) {
                this.f1763c = d5;
            }
            if (d5 > this.f1764d) {
                this.f1764d = d5;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public LatLngBounds(Parcel parcel) {
        this.northeast = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.southwest = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
    }

    LatLngBounds(LatLng latLng, LatLng latLng2) {
        this.northeast = latLng;
        this.southwest = latLng2;
    }

    public boolean contains(LatLng latLng) {
        if (latLng == null) {
            return false;
        }
        double d2 = this.southwest.latitude;
        double d3 = this.northeast.latitude;
        double d4 = this.southwest.longitude;
        double d5 = this.northeast.longitude;
        double d6 = latLng.latitude;
        double d7 = latLng.longitude;
        return d6 >= d2 && d6 <= d3 && d7 >= d4 && d7 <= d5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLng getCenter() {
        return new LatLng(((this.northeast.latitude - this.southwest.latitude) / 2.0d) + this.southwest.latitude, ((this.northeast.longitude - this.southwest.longitude) / 2.0d) + this.southwest.longitude);
    }

    public String toString() {
        return "southwest: " + this.southwest.latitude + ", " + this.southwest.longitude + "\nnortheast: " + this.northeast.latitude + ", " + this.northeast.longitude;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.northeast, i);
        parcel.writeParcelable(this.southwest, i);
    }
}
