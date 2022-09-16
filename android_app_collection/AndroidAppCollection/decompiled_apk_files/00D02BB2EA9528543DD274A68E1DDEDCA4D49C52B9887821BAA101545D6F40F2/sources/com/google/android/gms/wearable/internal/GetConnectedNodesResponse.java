package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GetConnectedNodesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetConnectedNodesResponse> CREATOR = new cpio();
    public final int a;
    public final List<NodeParcelable> b;

    public GetConnectedNodesResponse(int i, List<NodeParcelable> list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.y(parcel, 3, this.b);
        cnwn.c(parcel, d);
    }
}
