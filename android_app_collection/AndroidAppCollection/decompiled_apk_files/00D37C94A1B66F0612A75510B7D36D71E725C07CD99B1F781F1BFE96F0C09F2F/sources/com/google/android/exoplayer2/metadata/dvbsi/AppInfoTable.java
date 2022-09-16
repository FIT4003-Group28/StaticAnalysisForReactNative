package com.google.android.exoplayer2.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.model.m;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = new m(15);
    public final int a;
    public final String b;

    public AppInfoTable(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ Format a() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void b(pjd pjdVar) {
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
        sb.append("Ait(controlCode=");
        sb.append(i);
        sb.append(",url=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.a);
    }
}
