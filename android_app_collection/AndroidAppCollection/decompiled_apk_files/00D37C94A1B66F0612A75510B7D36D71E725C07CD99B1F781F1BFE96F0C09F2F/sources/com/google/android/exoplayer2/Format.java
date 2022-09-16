package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.ColorInfo;
import com.google.android.apps.youtube.embeddedplayer.service.model.m;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Format implements Parcelable {
    public static final Parcelable.Creator CREATOR = new m(11);
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final Class E;
    private int F;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    public final Metadata j;
    public final String k;
    public final String l;
    public final int m;
    public final List n;
    public final DrmInitData o;
    public final long p;
    public final int q;
    public final int r;
    public final float s;
    public final int t;
    public final float u;
    public final byte[] v;
    public final int w;
    public final ColorInfo x;
    public final int y;
    public final int z;

    public Format(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        int readInt = parcel.readInt();
        this.f = readInt;
        int readInt2 = parcel.readInt();
        this.g = readInt2;
        this.h = readInt2 != -1 ? readInt2 : readInt;
        this.i = parcel.readString();
        this.j = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readInt();
        int readInt3 = parcel.readInt();
        this.n = new ArrayList(readInt3);
        for (int i = 0; i < readInt3; i++) {
            this.n.add((byte[]) ptx.a(parcel.createByteArray()));
        }
        DrmInitData drmInitData = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.o = drmInitData;
        this.p = parcel.readLong();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = parcel.readFloat();
        this.t = parcel.readInt();
        this.u = parcel.readFloat();
        Class cls = null;
        this.v = pxi.T(parcel) ? parcel.createByteArray() : null;
        this.w = parcel.readInt();
        this.x = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.y = parcel.readInt();
        this.z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = drmInitData != null ? pof.class : cls;
    }

    public final int a() {
        int i;
        int i2 = this.q;
        if (i2 == -1 || (i = this.r) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final pis b() {
        return new pis(this);
    }

    public final Format c(Class cls) {
        pis b = b();
        b.D = cls;
        return b.a();
    }

    @Deprecated
    public final Format d(int i, int i2) {
        pis b = b();
        b.A = i;
        b.B = i2;
        return b.a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e(Format format) {
        if (this.n.size() == format.n.size()) {
            for (int i = 0; i < this.n.size(); i++) {
                if (!Arrays.equals((byte[]) this.n.get(i), (byte[]) format.n.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Format format = (Format) obj;
            int i2 = this.F;
            if ((i2 == 0 || (i = format.F) == 0 || i2 == i) && this.d == format.d && this.e == format.e && this.f == format.f && this.g == format.g && this.m == format.m && this.p == format.p && this.q == format.q && this.r == format.r && this.t == format.t && this.w == format.w && this.y == format.y && this.z == format.z && this.A == format.A && this.B == format.B && this.C == format.C && this.D == format.D && Float.compare(this.s, format.s) == 0 && Float.compare(this.u, format.u) == 0 && pxi.M(this.E, format.E) && pxi.M(this.a, format.a) && pxi.M(this.b, format.b) && pxi.M(this.i, format.i) && pxi.M(this.k, format.k) && pxi.M(this.l, format.l) && pxi.M(this.c, format.c) && Arrays.equals(this.v, format.v) && pxi.M(this.j, format.j) && pxi.M(this.x, format.x) && pxi.M(this.o, format.o) && e(format)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.F;
        if (i == 0) {
            String str = this.a;
            int i2 = 0;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31;
            String str4 = this.i;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.j;
            int hashCode5 = (hashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.k;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.l;
            int hashCode7 = (((((((((((((((((((((((((((((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.m) * 31) + ((int) this.p)) * 31) + this.q) * 31) + this.r) * 31) + Float.floatToIntBits(this.s)) * 31) + this.t) * 31) + Float.floatToIntBits(this.u)) * 31) + this.w) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31;
            Class cls = this.E;
            if (cls != null) {
                i2 = cls.hashCode();
            }
            int i3 = hashCode7 + i2;
            this.F = i3;
            return i3;
        }
        return i;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.k;
        String str4 = this.l;
        String str5 = this.i;
        int i = this.h;
        String str6 = this.c;
        int i2 = this.q;
        int i3 = this.r;
        float f = this.s;
        int i4 = this.y;
        int i5 = this.z;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 104 + length2 + length3 + length4 + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.i);
        boolean z = false;
        parcel.writeParcelable(this.j, 0);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeInt(this.m);
        int size = this.n.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) this.n.get(i2));
        }
        parcel.writeParcelable(this.o, 0);
        parcel.writeLong(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeFloat(this.s);
        parcel.writeInt(this.t);
        parcel.writeFloat(this.u);
        if (this.v != null) {
            z = true;
        }
        pxi.L(parcel, z);
        byte[] bArr = this.v;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.w);
        parcel.writeParcelable(this.x, i);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
    }

    public Format(pis pisVar) {
        this.a = pisVar.a;
        this.b = pisVar.b;
        this.c = pxi.F(pisVar.c);
        this.d = pisVar.d;
        this.e = pisVar.e;
        int i = pisVar.f;
        this.f = i;
        int i2 = pisVar.g;
        this.g = i2;
        this.h = i2 != -1 ? i2 : i;
        this.i = pisVar.h;
        this.j = pisVar.i;
        this.k = pisVar.j;
        this.l = pisVar.k;
        this.m = pisVar.l;
        List list = pisVar.m;
        this.n = list == null ? Collections.emptyList() : list;
        DrmInitData drmInitData = pisVar.n;
        this.o = drmInitData;
        this.p = pisVar.o;
        this.q = pisVar.p;
        this.r = pisVar.q;
        this.s = pisVar.r;
        int i3 = pisVar.s;
        int i4 = 0;
        this.t = i3 == -1 ? 0 : i3;
        float f = pisVar.t;
        this.u = f == -1.0f ? 1.0f : f;
        this.v = pisVar.u;
        this.w = pisVar.v;
        this.x = pisVar.w;
        this.y = pisVar.x;
        this.z = pisVar.y;
        this.A = pisVar.z;
        int i5 = pisVar.A;
        this.B = i5 == -1 ? 0 : i5;
        int i6 = pisVar.B;
        this.C = i6 != -1 ? i6 : i4;
        this.D = pisVar.C;
        Class cls = pisVar.D;
        if (cls != null || drmInitData == null) {
            this.E = cls;
        } else {
            this.E = pof.class;
        }
    }
}
