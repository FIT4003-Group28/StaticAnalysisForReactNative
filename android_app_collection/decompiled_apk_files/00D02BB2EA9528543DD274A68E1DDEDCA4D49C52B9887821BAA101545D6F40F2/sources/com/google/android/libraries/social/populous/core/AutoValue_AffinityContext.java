package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_AffinityContext extends C$AutoValue_AffinityContext implements Parcelable {
    public static final Parcelable.Creator<AutoValue_AffinityContext> CREATOR = new cycm();

    public AutoValue_AffinityContext(Parcel parcel) {
        super(parcel.readByte() == 1 ? Integer.valueOf(parcel.readInt()) : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a == null ? (byte) 0 : (byte) 1);
        Integer num = this.a;
        if (num != null) {
            parcel.writeInt(num.intValue());
        }
    }

    public AutoValue_AffinityContext(Integer num) {
        super(num);
    }
}
