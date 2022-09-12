package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.ReserveResourceResponse;
/* compiled from: PG */
/* renamed from: cpas  reason: default package */
/* loaded from: classes5.dex */
public final class cpas implements Parcelable.Creator<ReserveResourceResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ReserveResourceResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 1) {
                cnwm.d(parcel, readInt);
            } else {
                str = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new ReserveResourceResponse(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ReserveResourceResponse[] newArray(int i) {
        return new ReserveResourceResponse[i];
    }
}
