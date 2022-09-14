package com.teslamotors.plugins.ble.b;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PeripheralInfo.java */
/* loaded from: classes.dex */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() { // from class: com.teslamotors.plugins.ble.b.e.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public e[] newArray(int i) {
            return new e[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public String f5210a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5211b;

    /* renamed from: c  reason: collision with root package name */
    public String f5212c;

    /* renamed from: d  reason: collision with root package name */
    public int f5213d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected e(Parcel parcel) {
        this.f5210a = parcel.readString();
        this.f5211b = parcel.readByte() != 0;
        this.f5212c = parcel.readString();
        this.f5213d = parcel.readInt();
    }

    public e(com.teslamotors.plugins.ble.a.c cVar) {
        this.f5210a = "?";
        this.f5211b = cVar.b();
        this.f5212c = cVar.d();
        this.f5213d = cVar.c();
    }

    public e(String str, boolean z, String str2, int i) {
        this.f5210a = str;
        this.f5211b = z;
        this.f5212c = str2;
        this.f5213d = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5210a);
        parcel.writeByte(this.f5211b ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f5212c);
        parcel.writeInt(this.f5213d);
    }
}
