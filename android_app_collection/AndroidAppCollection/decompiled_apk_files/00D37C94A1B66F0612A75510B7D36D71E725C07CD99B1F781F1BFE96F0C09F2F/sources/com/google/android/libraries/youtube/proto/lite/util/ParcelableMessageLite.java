package com.google.android.libraries.youtube.proto.lite.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class ParcelableMessageLite implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aiqg(17);
    private aoqu a;
    private byte[] b;

    public ParcelableMessageLite(Parcel parcel) {
        this.b = parcel.createByteArray();
    }

    public ParcelableMessageLite(aoqu aoquVar) {
        this.a = aoquVar;
    }

    public final aoqu a(aoqu aoquVar) {
        if (this.a == null && this.b != null) {
            try {
                this.a = aoquVar.mo51newBuilderForType().mo38mergeFrom(this.b, aoos.b()).mo39build();
                this.b = null;
            } catch (aopx e) {
                Log.e("MessageLite", "Failed to deserialize", e);
            }
        }
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParcelableMessageLite(");
        aoqu aoquVar = this.a;
        if (aoquVar != null) {
            sb.append(aoquVar);
        } else if (this.b != null) {
            sb.append("byte[");
            sb.append(this.b.length);
            sb.append("]");
        } else {
            sb.append("null");
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aoqu aoquVar;
        if (this.b == null && (aoquVar = this.a) != null) {
            this.b = aoquVar.toByteArray();
            this.a = null;
        }
        parcel.writeByteArray(this.b);
    }
}
