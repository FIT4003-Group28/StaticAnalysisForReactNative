package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new pot(4);
    public final String a;
    public final String b;
    public final String c;

    public CommentFrame(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = pxi.a;
        this.a = readString;
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CommentFrame commentFrame = (CommentFrame) obj;
            if (pxi.M(this.b, commentFrame.b) && pxi.M(this.a, commentFrame.a) && pxi.M(this.c, commentFrame.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        String str = this.f;
        String str2 = this.a;
        String str3 = this.b;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": language=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeString(this.a);
        parcel.writeString(this.c);
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
