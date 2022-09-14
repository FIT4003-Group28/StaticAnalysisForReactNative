package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class TaxiInfo implements Parcelable {
    public static final Parcelable.Creator<TaxiInfo> CREATOR = new h();

    /* renamed from: a  reason: collision with root package name */
    private float f1799a;

    /* renamed from: b  reason: collision with root package name */
    private String f1800b;

    /* renamed from: c  reason: collision with root package name */
    private int f1801c;

    /* renamed from: d  reason: collision with root package name */
    private int f1802d;
    private float e;
    private float f;

    public TaxiInfo() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TaxiInfo(Parcel parcel) {
        this.f1799a = parcel.readFloat();
        this.f1800b = parcel.readString();
        this.f1801c = parcel.readInt();
        this.f1802d = parcel.readInt();
        this.e = parcel.readFloat();
        this.f = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDesc() {
        return this.f1800b;
    }

    public int getDistance() {
        return this.f1801c;
    }

    public int getDuration() {
        return this.f1802d;
    }

    public float getPerKMPrice() {
        return this.e;
    }

    public float getStartPrice() {
        return this.f;
    }

    public float getTotalPrice() {
        return this.f1799a;
    }

    public void setDesc(String str) {
        this.f1800b = str;
    }

    public void setDistance(int i) {
        this.f1801c = i;
    }

    public void setDuration(int i) {
        this.f1802d = i;
    }

    public void setPerKMPrice(float f) {
        this.e = f;
    }

    public void setStartPrice(float f) {
        this.f = f;
    }

    public void setTotalPrice(float f) {
        this.f1799a = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f1799a);
        parcel.writeString(this.f1800b);
        parcel.writeInt(this.f1801c);
        parcel.writeInt(this.f1802d);
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
    }
}
