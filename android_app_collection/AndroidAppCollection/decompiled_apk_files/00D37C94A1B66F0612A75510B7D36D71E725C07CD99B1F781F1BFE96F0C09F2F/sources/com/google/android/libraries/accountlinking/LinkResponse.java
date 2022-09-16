package com.google.android.libraries.accountlinking;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class LinkResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new rxi(8);
    public final boolean a;
    public final String b;

    public LinkResponse(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.o(parcel, 1, this.a);
        tqj.F(parcel, 2, this.b);
        tqj.n(parcel, m);
    }
}
