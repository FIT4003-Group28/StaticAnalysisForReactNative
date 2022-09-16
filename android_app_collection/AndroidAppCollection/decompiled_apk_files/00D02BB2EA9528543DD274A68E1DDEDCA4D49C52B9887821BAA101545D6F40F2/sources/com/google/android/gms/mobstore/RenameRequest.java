package com.google.android.gms.mobstore;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class RenameRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RenameRequest> CREATOR = new cotx();
    public final Uri a;
    public final Uri b;

    public RenameRequest(Uri uri, Uri uri2) {
        this.a = uri;
        this.b = uri2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 1, this.a, i);
        cnwn.u(parcel, 2, this.b, i);
        cnwn.c(parcel, d);
    }
}
