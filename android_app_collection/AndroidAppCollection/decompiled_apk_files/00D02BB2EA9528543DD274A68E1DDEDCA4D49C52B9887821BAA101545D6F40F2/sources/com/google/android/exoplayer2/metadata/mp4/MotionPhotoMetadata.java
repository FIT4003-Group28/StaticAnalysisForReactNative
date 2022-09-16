package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new cmcz();
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public MotionPhotoMetadata(long j, long j2, long j3) {
        this.a = 0L;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final Format a() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final byte[] b() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
            if (this.a == motionPhotoMetadata.a && this.b == motionPhotoMetadata.b && this.c == motionPhotoMetadata.c && this.d == motionPhotoMetadata.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((decn.a(this.a) + 527) * 31) + decn.a(this.b)) * 31) + decn.a(this.c)) * 31) + decn.a(this.d);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        StringBuilder sb = new StringBuilder(167);
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(j);
        sb.append(", photoSize=");
        sb.append(j2);
        sb.append(", videoStartPosition=");
        sb.append(j3);
        sb.append(", videoSize=");
        sb.append(j4);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
    }
}
