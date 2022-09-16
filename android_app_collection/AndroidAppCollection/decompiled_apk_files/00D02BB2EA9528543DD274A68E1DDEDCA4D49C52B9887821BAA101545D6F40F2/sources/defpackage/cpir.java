package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.GetLocalNodeResponse;
import com.google.android.gms.wearable.internal.NodeParcelable;
/* compiled from: PG */
/* renamed from: cpir  reason: default package */
/* loaded from: classes5.dex */
public final class cpir implements Parcelable.Creator<GetLocalNodeResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetLocalNodeResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        NodeParcelable nodeParcelable = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                nodeParcelable = (NodeParcelable) cnwm.q(parcel, readInt, NodeParcelable.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new GetLocalNodeResponse(i, nodeParcelable);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetLocalNodeResponse[] newArray(int i) {
        return new GetLocalNodeResponse[i];
    }
}
