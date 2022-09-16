package com.google.protobuf.contrib.android;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ProtoParsers$InternalDontUse implements ProtoParsers$ParcelableProto {
    public static final Parcelable.Creator CREATOR = new alwc(13);
    private volatile byte[] a;
    private volatile aoqu b;

    public ProtoParsers$InternalDontUse(byte[] bArr, aoqu aoquVar) {
        boolean z = true;
        if (bArr == null && aoquVar == null) {
            z = false;
        }
        aqxo.q(z, "Must have a message or bytes");
        this.a = bArr;
        this.b = aoquVar;
    }

    @Override // com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto
    public final aoqu a(aoqu aoquVar, aoos aoosVar) {
        try {
            return b(aoquVar, aoosVar);
        } catch (aopx e) {
            throw new IllegalStateException(e);
        }
    }

    public final aoqu b(aoqu aoquVar, aoos aoosVar) {
        if (this.b == null) {
            this.b = aoquVar.mo52toBuilder().mo38mergeFrom(this.a, aoosVar).mo39build();
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            byte[] bArr = new byte[this.b.getSerializedSize()];
            try {
                this.b.writeTo(aool.ak(bArr));
                this.a = bArr;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        parcel.writeInt(this.a.length);
        parcel.writeByteArray(this.a);
    }
}
