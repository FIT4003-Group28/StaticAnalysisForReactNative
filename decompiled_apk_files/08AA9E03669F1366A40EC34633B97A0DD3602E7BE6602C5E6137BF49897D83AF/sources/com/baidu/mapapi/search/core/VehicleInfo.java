package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class VehicleInfo implements Parcelable {
    public static final Parcelable.Creator<VehicleInfo> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    private String f1803a;

    /* renamed from: b  reason: collision with root package name */
    private int f1804b;

    /* renamed from: c  reason: collision with root package name */
    private String f1805c;

    /* renamed from: d  reason: collision with root package name */
    private int f1806d;
    private int e;

    public VehicleInfo() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public VehicleInfo(Parcel parcel) {
        this.f1803a = parcel.readString();
        this.f1804b = parcel.readInt();
        this.f1805c = parcel.readString();
        this.f1806d = parcel.readInt();
        this.e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getPassStationNum() {
        return this.f1804b;
    }

    public String getTitle() {
        return this.f1805c;
    }

    public int getTotalPrice() {
        return this.e;
    }

    public String getUid() {
        return this.f1803a;
    }

    public int getZonePrice() {
        return this.f1806d;
    }

    public void setPassStationNum(int i) {
        this.f1804b = i;
    }

    public void setTitle(String str) {
        this.f1805c = str;
    }

    public void setTotalPrice(int i) {
        this.e = i;
    }

    public void setUid(String str) {
        this.f1803a = str;
    }

    public void setZonePrice(int i) {
        this.f1806d = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1803a);
        parcel.writeInt(this.f1804b);
        parcel.writeString(this.f1805c);
        parcel.writeInt(this.f1806d);
        parcel.writeInt(this.e);
    }
}
