package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.GetConnectedNodesResponse;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cpio  reason: default package */
/* loaded from: classes5.dex */
public final class cpio implements Parcelable.Creator<GetConnectedNodesResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetConnectedNodesResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                arrayList = cnwm.A(parcel, readInt, NodeParcelable.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new GetConnectedNodesResponse(i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetConnectedNodesResponse[] newArray(int i) {
        return new GetConnectedNodesResponse[i];
    }
}
