package com.baidu.mapapi.map;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.map.B;
/* loaded from: classes.dex */
public final class BaiduMapOptions implements Parcelable {
    public static final Parcelable.Creator<BaiduMapOptions> CREATOR = new e();

    /* renamed from: a  reason: collision with root package name */
    MapStatus f1556a;

    /* renamed from: b  reason: collision with root package name */
    boolean f1557b;

    /* renamed from: c  reason: collision with root package name */
    int f1558c;

    /* renamed from: d  reason: collision with root package name */
    boolean f1559d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    LogoPosition j;
    Point k;
    Point l;

    public BaiduMapOptions() {
        this.f1556a = new MapStatus(com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, new LatLng(39.914935d, 116.403119d), com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, 12.0f, null, null);
        this.f1557b = true;
        this.f1558c = 1;
        this.f1559d = true;
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = true;
        this.i = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaiduMapOptions(Parcel parcel) {
        this.f1556a = new MapStatus(com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, new LatLng(39.914935d, 116.403119d), com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, 12.0f, null, null);
        boolean z = true;
        this.f1557b = true;
        this.f1558c = 1;
        this.f1559d = true;
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = true;
        this.i = true;
        this.f1556a = (MapStatus) parcel.readParcelable(MapStatus.class.getClassLoader());
        this.f1557b = parcel.readByte() != 0;
        this.f1558c = parcel.readInt();
        this.f1559d = parcel.readByte() != 0;
        this.e = parcel.readByte() != 0;
        this.f = parcel.readByte() != 0;
        this.g = parcel.readByte() != 0;
        this.h = parcel.readByte() != 0;
        this.i = parcel.readByte() == 0 ? false : z;
        this.k = (Point) parcel.readParcelable(Point.class.getClassLoader());
        this.l = (Point) parcel.readParcelable(Point.class.getClassLoader());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B a() {
        return new B().a(this.f1556a.c()).a(this.f1557b).a(this.f1558c).b(this.f1559d).c(this.e).d(this.f).e(this.g);
    }

    public BaiduMapOptions compassEnabled(boolean z) {
        this.f1557b = z;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BaiduMapOptions logoPosition(LogoPosition logoPosition) {
        this.j = logoPosition;
        return this;
    }

    public BaiduMapOptions mapStatus(MapStatus mapStatus) {
        if (mapStatus != null) {
            this.f1556a = mapStatus;
        }
        return this;
    }

    public BaiduMapOptions mapType(int i) {
        this.f1558c = i;
        return this;
    }

    public BaiduMapOptions overlookingGesturesEnabled(boolean z) {
        this.f = z;
        return this;
    }

    public BaiduMapOptions rotateGesturesEnabled(boolean z) {
        this.f1559d = z;
        return this;
    }

    public BaiduMapOptions scaleControlEnabled(boolean z) {
        this.i = z;
        return this;
    }

    public BaiduMapOptions scaleControlPosition(Point point) {
        this.k = point;
        return this;
    }

    public BaiduMapOptions scrollGesturesEnabled(boolean z) {
        this.e = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1556a, i);
        parcel.writeByte(this.f1557b ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f1558c);
        parcel.writeByte(this.f1559d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.k, i);
        parcel.writeParcelable(this.l, i);
    }

    public BaiduMapOptions zoomControlsEnabled(boolean z) {
        this.h = z;
        return this;
    }

    public BaiduMapOptions zoomControlsPosition(Point point) {
        this.l = point;
        return this;
    }

    public BaiduMapOptions zoomGesturesEnabled(boolean z) {
        this.g = z;
        return this;
    }
}
