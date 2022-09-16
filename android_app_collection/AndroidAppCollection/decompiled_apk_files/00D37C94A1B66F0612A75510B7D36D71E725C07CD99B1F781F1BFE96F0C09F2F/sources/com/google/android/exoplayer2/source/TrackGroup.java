package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator CREATOR = new pot(19);
    public final int a;
    public final Format[] b;
    private int c;

    public TrackGroup(Parcel parcel) {
        int readInt = parcel.readInt();
        this.a = readInt;
        this.b = new Format[readInt];
        for (int i = 0; i < this.a; i++) {
            this.b[i] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }

    private static int b(int i) {
        return i | 16384;
    }

    private static String c(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void d(String str, String str2, String str3, int i) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 78 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i);
        sb.append(")");
        pns.e("TrackGroup", "", new IllegalStateException(sb.toString()));
    }

    public final Format a(int i) {
        return this.b[i];
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
            TrackGroup trackGroup = (TrackGroup) obj;
            if (this.a == trackGroup.a && Arrays.equals(this.b, trackGroup.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.b) + 527;
            this.c = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        for (int i2 = 0; i2 < this.a; i2++) {
            parcel.writeParcelable(this.b[i2], 0);
        }
    }

    public TrackGroup(Format... formatArr) {
        int length = formatArr.length;
        int i = 1;
        ptx.e(length > 0);
        this.b = formatArr;
        this.a = length;
        String c = c(formatArr[0].c);
        int b = b(formatArr[0].e);
        while (true) {
            Format[] formatArr2 = this.b;
            if (i < formatArr2.length) {
                if (c.equals(c(formatArr2[i].c))) {
                    if (b != b(this.b[i].e)) {
                        d("role flags", Integer.toBinaryString(this.b[0].e), Integer.toBinaryString(this.b[i].e), i);
                        return;
                    }
                    i++;
                } else {
                    Format[] formatArr3 = this.b;
                    d("languages", formatArr3[0].c, formatArr3[i].c, i);
                    return;
                }
            } else {
                return;
            }
        }
    }
}
