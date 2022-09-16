package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.model.m;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DrmInitData implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = new m(12);
    public final SchemeData[] a;
    public final String b;
    public final int c;
    private int d;

    public DrmInitData(Parcel parcel) {
        this.b = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) pxi.y((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.a = schemeDataArr;
        this.c = schemeDataArr.length;
    }

    public final SchemeData a(int i) {
        return this.a[i];
    }

    public final DrmInitData b(String str) {
        return pxi.M(this.b, str) ? this : new DrmInitData(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        SchemeData schemeData = (SchemeData) obj;
        SchemeData schemeData2 = (SchemeData) obj2;
        if (phk.a.equals(schemeData.a)) {
            return !phk.a.equals(schemeData2.a) ? 1 : 0;
        }
        return schemeData.a.compareTo(schemeData2.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DrmInitData drmInitData = (DrmInitData) obj;
            if (pxi.M(this.b, drmInitData.b) && Arrays.equals(this.a, drmInitData.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i == 0) {
            String str = this.b;
            int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
            this.d = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeTypedArray(this.a, 0);
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class SchemeData implements Parcelable {
        public static final Parcelable.Creator CREATOR = new m(13);
        public final UUID a;
        public final String b;
        public final String c;
        public final byte[] d;
        private int e;

        public SchemeData(Parcel parcel) {
            this.a = new UUID(parcel.readLong(), parcel.readLong());
            this.b = parcel.readString();
            String readString = parcel.readString();
            int i = pxi.a;
            this.c = readString;
            this.d = parcel.createByteArray();
        }

        public final boolean a() {
            return this.d != null;
        }

        public final boolean b(UUID uuid) {
            return phk.a.equals(this.a) || uuid.equals(this.a);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return pxi.M(this.b, schemeData.b) && pxi.M(this.c, schemeData.c) && pxi.M(this.a, schemeData.a) && Arrays.equals(this.d, schemeData.d);
        }

        public final int hashCode() {
            int i = this.e;
            if (i == 0) {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                int hashCode2 = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + Arrays.hashCode(this.d);
                this.e = hashCode2;
                return hashCode2;
            }
            return i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.a.getMostSignificantBits());
            parcel.writeLong(this.a.getLeastSignificantBits());
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeByteArray(this.d);
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            ptx.a(uuid);
            this.a = uuid;
            this.b = str;
            ptx.a(str2);
            this.c = str2;
            this.d = bArr;
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }
    }

    public DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.b = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.a = schemeDataArr;
        this.c = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public DrmInitData(List list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(null, true, schemeDataArr);
    }
}
