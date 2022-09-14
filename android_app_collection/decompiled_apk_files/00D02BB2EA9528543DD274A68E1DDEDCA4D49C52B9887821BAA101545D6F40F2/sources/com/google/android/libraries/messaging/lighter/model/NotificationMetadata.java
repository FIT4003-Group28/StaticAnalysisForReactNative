package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class NotificationMetadata implements Parcelable {
    public static final Parcelable.Creator<NotificationMetadata> CREATOR = new cugz();
    public final HashMap<String, byte[]> a;

    public NotificationMetadata(HashMap<String, byte[]> hashMap) {
        this.a = hashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NotificationMetadata)) {
            return false;
        }
        return this.a.equals(((NotificationMetadata) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.a);
    }
}
