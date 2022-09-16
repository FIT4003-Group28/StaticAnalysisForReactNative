package com.google.android.libraries.youtube.player.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class HeartbeatClient$HeartbeatClientState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aiqg(5);
    public final arzt a;
    public final byte[] b;
    public final String c;
    public final long d;
    public final int e;

    public HeartbeatClient$HeartbeatClientState(Parcel parcel) {
        this.a = (arzt) ((ParcelableMessageLite) parcel.readParcelable(ParcelableMessageLite.class.getClassLoader())).a(arzt.a);
        byte[] bArr = new byte[parcel.readInt()];
        this.b = bArr;
        parcel.readByteArray(bArr);
        this.c = zgh.h(parcel.readString());
        this.d = parcel.readLong();
        this.e = parcel.readInt();
    }

    public HeartbeatClient$HeartbeatClientState(arzt arztVar, byte[] bArr, String str, long j, int i) {
        this.a = arztVar;
        this.b = bArr;
        this.c = str;
        this.d = j;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new ParcelableMessageLite(this.a), 0);
        parcel.writeInt(this.b.length);
        parcel.writeByteArray(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
    }
}
