package com.teslamotors.plugins.ble.b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PeripheralMap.java */
/* loaded from: classes.dex */
public class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() { // from class: com.teslamotors.plugins.ble.b.f.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public f[] newArray(int i) {
            return new f[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public Map<String, e> f5214a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected f(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f5214a = new HashMap();
        for (int i = 0; i < readInt; i++) {
            this.f5214a.put(parcel.readString(), (e) parcel.readParcelable(e.class.getClassLoader()));
        }
    }

    public f() {
        this.f5214a = new HashMap();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5214a.size());
        for (Map.Entry<String, e> entry : this.f5214a.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeParcelable(entry.getValue(), i);
        }
    }
}
