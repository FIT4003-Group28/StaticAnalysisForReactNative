package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class RemoveGeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoveGeofencingRequest> CREATOR = new coln();
    public final List<String> a;
    public final PendingIntent b;
    public final String c;

    public RemoveGeofencingRequest(List<String> list, PendingIntent pendingIntent, String str) {
        List<String> unmodifiableList;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.a = unmodifiableList;
        this.b = pendingIntent;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.w(parcel, 1, this.a);
        cnwn.u(parcel, 2, this.b, i);
        cnwn.k(parcel, 3, this.c, false);
        cnwn.c(parcel, d);
    }
}
