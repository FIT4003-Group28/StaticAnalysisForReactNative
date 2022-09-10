package com.google.protobuf.contrib.android;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dssj;
import java.io.IOException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ProtoParsers$InternalDontUse<T extends dssj> implements ProtoParsers$ParcelableProto<T> {
    public static final Parcelable.Creator<ProtoParsers$InternalDontUse<?>> CREATOR = new dsuu();
    private volatile byte[] a;
    private volatile T b;

    public ProtoParsers$InternalDontUse(byte[] bArr, T t) {
        boolean z = true;
        if (bArr == null && t == null) {
            z = false;
        }
        dbsk.b(z, "Must have a message or bytes");
        this.a = bArr;
        this.b = t;
    }

    @Override // com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto
    public final T a(T t, dsqa dsqaVar) {
        try {
            return b(t, dsqaVar);
        } catch (dsrm e) {
            throw new IllegalStateException(e);
        }
    }

    public final T b(T t, dsqa dsqaVar) {
        if (this.b == null) {
            this.b = (T) t.Nn().bx(this.a, dsqaVar).bK();
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
            byte[] bArr = new byte[this.b.cb()];
            try {
                this.b.Pv(dspp.D(bArr));
                this.a = bArr;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        parcel.writeInt(this.a.length);
        parcel.writeByteArray(this.a);
    }
}
