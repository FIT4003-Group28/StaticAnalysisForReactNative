package com.google.android.libraries.video.editablevideo;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.video.media.VideoMetaData;
import java.util.Iterator;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class EditableVideoEdits implements Parcelable {
    public static final Parcelable.Creator CREATOR = new rxi(15);
    public final boolean a;
    public final long b;
    public final long c;
    public final long d;
    public String e;
    public long f;
    public long g;
    public boolean h;
    public int i;
    public long j;
    public long k;
    public Uri l;
    public boolean m;
    public float n;
    public double o;
    public double p;
    public double q;
    public double r;

    public EditableVideoEdits(Parcel parcel) {
        boolean z = true;
        this.h = true;
        this.j = 0L;
        this.k = Long.MAX_VALUE;
        this.a = parcel.readByte() != 0;
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.h = parcel.readByte() != 0;
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        this.i = parcel.readInt();
        this.e = parcel.readString();
        this.l = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.j = parcel.readLong();
        this.n = parcel.readFloat();
        this.d = parcel.readLong();
        this.m = parcel.readByte() == 0 ? false : z;
        this.o = parcel.readDouble();
        this.p = parcel.readDouble();
        this.q = parcel.readDouble();
        this.r = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeInt(this.i);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.l, i);
        parcel.writeLong(this.j);
        parcel.writeFloat(this.n);
        parcel.writeLong(this.d);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.o);
        parcel.writeDouble(this.p);
        parcel.writeDouble(this.q);
        parcel.writeDouble(this.r);
    }

    public EditableVideoEdits(VideoMetaData videoMetaData, long j, long j2, boolean z) {
        Iterator vsiVar;
        long j3;
        boolean z2 = true;
        this.h = true;
        this.j = 0L;
        this.k = Long.MAX_VALUE;
        this.b = j;
        if (j2 <= 0 || j2 >= j) {
            this.c = Math.max(0L, j2);
        } else {
            StringBuilder sb = new StringBuilder(142);
            sb.append("Max video duration ");
            sb.append(j2);
            sb.append(" smaller than min video duration ");
            sb.append(j);
            sb.append(". Enforcing specified min video duration for both.");
            vqy.d(sb.toString());
            this.c = j;
        }
        long j4 = videoMetaData.g;
        int[] iArr = videoMetaData.j;
        if (iArr != null) {
            vsiVar = new vqd(iArr);
        } else {
            vsiVar = new vsi(videoMetaData.i.length);
        }
        if (vsiVar.hasNext()) {
            long l = videoMetaData.l(((Integer) vsiVar.next()).intValue());
            long j5 = 0;
            while (vsiVar.hasNext()) {
                long l2 = videoMetaData.l(((Integer) vsiVar.next()).intValue());
                j5 = Math.max(j5, l2 - l);
                l = l2;
            }
            j3 = Math.max(j5, j4 - l);
        } else {
            j3 = 0;
        }
        boolean z3 = j4 > this.b;
        if (z) {
            z3 &= j3 > 6000000 ? false : z2;
        }
        this.a = z3;
        this.d = j3;
        this.f = 0L;
        long j6 = this.c;
        this.g = j6 > 0 ? Math.min(j4, j6) : j4;
        this.i = 0;
        this.e = null;
        this.j = 0L;
        this.n = 0.3f;
        this.l = null;
    }
}
