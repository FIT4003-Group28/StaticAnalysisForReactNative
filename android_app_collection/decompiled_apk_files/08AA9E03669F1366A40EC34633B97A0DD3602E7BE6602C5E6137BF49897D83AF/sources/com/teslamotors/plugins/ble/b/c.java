package com.teslamotors.plugins.ble.b;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: LogMessage.java */
/* loaded from: classes.dex */
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.teslamotors.plugins.ble.b.c.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c[] newArray(int i) {
            return new c[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f5202a;

    /* renamed from: b  reason: collision with root package name */
    private String f5203b;

    /* renamed from: c  reason: collision with root package name */
    private int f5204c;

    /* renamed from: d  reason: collision with root package name */
    private Exception f5205d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public c(String str, String str2, int i, Exception exc) {
        this.f5202a = str;
        this.f5203b = str2;
        this.f5204c = i;
        this.f5205d = exc;
    }

    protected c(Parcel parcel) {
        this.f5202a = parcel.readString();
        this.f5203b = parcel.readString();
        this.f5204c = parcel.readInt();
        this.f5205d = (Exception) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5202a);
        parcel.writeString(this.f5203b);
        parcel.writeInt(this.f5204c);
        parcel.writeSerializable(this.f5205d);
    }

    public String a() {
        return this.f5202a;
    }

    public String b() {
        return this.f5203b;
    }

    public int c() {
        return this.f5204c;
    }

    public Exception d() {
        return this.f5205d;
    }
}
