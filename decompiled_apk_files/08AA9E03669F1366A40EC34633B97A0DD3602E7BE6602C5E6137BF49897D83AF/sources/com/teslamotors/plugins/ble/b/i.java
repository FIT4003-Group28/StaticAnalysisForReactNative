package com.teslamotors.plugins.ble.b;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: VehicleScanResult.java */
/* loaded from: classes.dex */
public class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new Parcelable.Creator<i>() { // from class: com.teslamotors.plugins.ble.b.i.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public i[] newArray(int i) {
            return new i[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public boolean f5221a;

    /* renamed from: b  reason: collision with root package name */
    public String f5222b;

    /* renamed from: c  reason: collision with root package name */
    public int f5223c;

    /* renamed from: d  reason: collision with root package name */
    public f f5224d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public i(boolean z, String str, int i, f fVar) {
        this.f5221a = z;
        this.f5222b = str;
        this.f5223c = i;
        this.f5224d = fVar;
    }

    protected i(Parcel parcel) {
        this.f5221a = parcel.readByte() != 0;
        this.f5222b = parcel.readString();
        this.f5223c = parcel.readInt();
        this.f5224d = (f) parcel.readParcelable(e.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f5221a ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f5222b);
        parcel.writeInt(this.f5223c);
        parcel.writeParcelable(this.f5224d, i);
    }
}
