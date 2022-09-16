package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.DataItemParcelable;
import com.google.android.gms.wearable.internal.PutDataResponse;
/* compiled from: PG */
/* renamed from: cpjk  reason: default package */
/* loaded from: classes5.dex */
public final class cpjk implements Parcelable.Creator<PutDataResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PutDataResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        DataItemParcelable dataItemParcelable = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                dataItemParcelable = (DataItemParcelable) cnwm.q(parcel, readInt, DataItemParcelable.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new PutDataResponse(i, dataItemParcelable);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PutDataResponse[] newArray(int i) {
        return new PutDataResponse[i];
    }
}
