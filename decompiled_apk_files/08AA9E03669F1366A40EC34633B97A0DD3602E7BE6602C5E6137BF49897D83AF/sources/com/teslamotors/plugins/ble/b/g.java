package com.teslamotors.plugins.ble.b;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PublicKeyInfo.java */
/* loaded from: classes.dex */
public class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new Parcelable.Creator<g>() { // from class: com.teslamotors.plugins.ble.b.g.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public g[] newArray(int i) {
            return new g[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    String f5215a;

    /* renamed from: b  reason: collision with root package name */
    byte[] f5216b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected g(Parcel parcel) {
        this.f5215a = parcel.readString();
        this.f5216b = parcel.createByteArray();
    }

    public g(String str, byte[] bArr) {
        this.f5215a = str;
        this.f5216b = bArr;
    }

    public String a() {
        return this.f5215a;
    }

    public byte[] b() {
        return this.f5216b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5215a);
        parcel.writeByteArray(this.f5216b);
    }
}
