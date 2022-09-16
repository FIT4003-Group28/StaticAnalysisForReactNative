package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.model.m;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = new m(18);
    public final String a;
    public final String b;

    public VorbisComment(Parcel parcel) {
        String readString = parcel.readString();
        int i = pxi.a;
        this.a = readString;
        this.b = parcel.readString();
    }

    public VorbisComment(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ Format a() {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void b(pjd pjdVar) {
        char c;
        String str = this.a;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            pjdVar.a = this.b;
        } else if (c == 1) {
            pjdVar.b = this.b;
        } else if (c == 2) {
            pjdVar.c = this.b;
        } else if (c == 3) {
            pjdVar.d = this.b;
        } else if (c != 4) {
        } else {
            pjdVar.e = this.b;
        }
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] c() {
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
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (this.a.equals(vorbisComment.a) && this.b.equals(vorbisComment.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 527) * 31) + this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
