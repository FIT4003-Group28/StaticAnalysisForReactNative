package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GetRecentContextCall$Response extends AbstractSafeParcelable implements cnom {
    public static final Parcelable.Creator<GetRecentContextCall$Response> CREATOR = new cmpy();
    public Status a;
    public List<UsageInfo> b;
    @Deprecated
    public String[] c;

    public GetRecentContextCall$Response() {
    }

    public GetRecentContextCall$Response(Status status, List<UsageInfo> list, String[] strArr) {
        this.a = status;
        this.b = list;
        this.c = strArr;
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 1, this.a, i);
        cnwn.y(parcel, 2, this.b);
        cnwn.v(parcel, 3, this.c);
        cnwn.c(parcel, d);
    }
}
