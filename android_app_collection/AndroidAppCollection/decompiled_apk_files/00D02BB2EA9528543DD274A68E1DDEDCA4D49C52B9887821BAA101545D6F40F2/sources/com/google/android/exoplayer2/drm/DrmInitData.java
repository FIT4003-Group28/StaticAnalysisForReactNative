package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new cltn();
    public final String a;
    private final SchemeData[] b;
    private int c;

    public DrmInitData(Parcel parcel) {
        this.a = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) cmny.c((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.b = schemeDataArr;
        int length = schemeDataArr.length;
    }

    public final DrmInitData a(String str) {
        return cmny.b(this.a, str) ? this : new DrmInitData(str, false, this.b);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        return cllt.a.equals(schemeData3.a) ? !cllt.a.equals(schemeData4.a) ? 1 : 0 : schemeData3.a.compareTo(schemeData4.a);
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
            if (cmny.b(this.a, drmInitData.a) && Arrays.equals(this.b, drmInitData.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            String str = this.a;
            int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.b);
            this.c = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeTypedArray(this.b, 0);
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new clto();
        public final UUID a;
        public final String b;
        public final String c;
        public final byte[] d;
        private int e;

        public SchemeData(Parcel parcel) {
            this.a = new UUID(parcel.readLong(), parcel.readLong());
            this.b = parcel.readString();
            String readString = parcel.readString();
            int i = cmny.a;
            this.c = readString;
            this.d = parcel.createByteArray();
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
            return cmny.b(this.b, schemeData.b) && cmny.b(this.c, schemeData.c) && cmny.b(this.a, schemeData.a) && Arrays.equals(this.d, schemeData.d);
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

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            cmmn.f(uuid);
            this.a = uuid;
            this.b = null;
            this.c = str;
            this.d = bArr;
        }
    }

    public DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.a = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.b = schemeDataArr;
        int length = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }
}
