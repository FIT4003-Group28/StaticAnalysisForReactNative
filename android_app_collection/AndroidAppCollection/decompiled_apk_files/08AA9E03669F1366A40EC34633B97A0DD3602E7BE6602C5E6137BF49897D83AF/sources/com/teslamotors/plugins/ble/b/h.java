package com.teslamotors.plugins.ble.b;

import android.os.Parcel;
import android.os.Parcelable;
import d.a.c.a;
import java.util.HashMap;
import java.util.Map;
/* compiled from: Status.java */
/* loaded from: classes.dex */
public class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new Parcelable.Creator<h>() { // from class: com.teslamotors.plugins.ble.b.h.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public h[] newArray(int i) {
            return new h[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public Boolean f5217a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f5218b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f5219c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f5220d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public String k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public long q;
    public int r;
    public double s;
    public boolean t;
    public boolean u;
    public String v;
    public f w;
    public boolean x;
    public Map<String, Boolean> y = new HashMap();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public h() {
    }

    protected h(Parcel parcel) {
        this.f5217a = (Boolean) parcel.readSerializable();
        this.f5218b = (Boolean) parcel.readSerializable();
        this.f5219c = (Boolean) parcel.readSerializable();
        this.f5220d = (Boolean) parcel.readSerializable();
        this.e = (Boolean) parcel.readSerializable();
        this.f = (Boolean) parcel.readSerializable();
        this.g = (Boolean) parcel.readSerializable();
        boolean z = true;
        this.h = parcel.readByte() != 0;
        this.i = parcel.readByte() != 0;
        this.j = parcel.readByte() != 0;
        this.k = parcel.readString();
        this.l = parcel.readInt();
        this.m = parcel.readByte() != 0;
        this.n = parcel.readByte() != 0;
        this.o = parcel.readByte() != 0;
        this.p = parcel.readByte() != 0;
        this.q = parcel.readLong();
        this.r = parcel.readInt();
        this.s = parcel.readDouble();
        this.t = parcel.readByte() != 0;
        this.u = parcel.readByte() != 0;
        this.v = parcel.readString();
        this.w = (f) parcel.readParcelable(f.class.getClassLoader());
        this.x = parcel.readByte() == 0 ? false : z;
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.y.put(parcel.readString(), (Boolean) parcel.readSerializable());
        }
    }

    public void a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        if (bool != null) {
            this.f5217a = bool;
        }
        if (bool2 != null) {
            this.f5218b = bool2;
        }
        if (bool3 != null) {
            this.f5219c = bool3;
        }
        if (bool4 != null) {
            this.f5220d = bool4;
        }
        if (bool5 != null) {
            this.e = bool5;
        }
        if (bool6 != null) {
            this.f = bool6;
        }
        if (bool7 != null) {
            this.g = bool7;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f5217a);
        parcel.writeSerializable(this.f5218b);
        parcel.writeSerializable(this.f5219c);
        parcel.writeSerializable(this.f5220d);
        parcel.writeSerializable(this.e);
        parcel.writeSerializable(this.f);
        parcel.writeSerializable(this.g);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeString(this.k);
        parcel.writeInt(this.l);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.p ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.q);
        parcel.writeInt(this.r);
        parcel.writeDouble(this.s);
        parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.u ? (byte) 1 : (byte) 0);
        parcel.writeString(this.v);
        parcel.writeParcelable(this.w, i);
        parcel.writeByte(this.x ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.y.size());
        for (Map.Entry<String, Boolean> entry : this.y.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeSerializable(entry.getValue());
        }
    }

    public int a() {
        int i;
        int i2 = a.b.phone_key_status_not_paired;
        int i3 = 0;
        if (this.w == null || this.w.f5214a == null) {
            i = 0;
        } else {
            i = 0;
            for (Map.Entry<String, e> entry : this.w.f5214a.entrySet()) {
                i3++;
                if (entry.getValue().f5211b) {
                    i++;
                }
            }
        }
        if (this.t) {
            if (i3 > 0) {
                i2 = a.b.phone_key_status_disconnected;
            }
            if (i <= 0) {
                return i2;
            }
            int i4 = a.b.phone_key_status_connecting;
            if (!this.u || this.l <= 0) {
                return i4;
            }
            if (this.m) {
                return a.b.phone_key_status_connected;
            }
            return a.b.phone_key_status_needs_permissions;
        }
        return a.b.phone_key_status_bluetooth_disabled;
    }
}
