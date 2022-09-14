package com.teslamotors.plugins.ble.b;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: CommandResult.java */
/* loaded from: classes.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.teslamotors.plugins.ble.b.a.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a[] newArray(int i) {
            return new a[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public b f5193a;

    /* renamed from: b  reason: collision with root package name */
    public String f5194b;

    /* renamed from: c  reason: collision with root package name */
    public int f5195c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public a(b bVar, String str, int i) {
        this.f5193a = bVar;
        this.f5194b = str;
        this.f5195c = i;
    }

    protected a(Parcel parcel) {
        this.f5193a = (b) parcel.readSerializable();
        this.f5194b = parcel.readString();
        this.f5195c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f5193a);
        parcel.writeString(this.f5194b);
        parcel.writeInt(this.f5195c);
    }
}
