package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.GetAvailableOtherPaymentMethodsResponse;
/* compiled from: PG */
/* renamed from: cpaf  reason: default package */
/* loaded from: classes5.dex */
public final class cpaf implements Parcelable.Creator<GetAvailableOtherPaymentMethodsResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetAvailableOtherPaymentMethodsResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int[] iArr = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 1) {
                cnwm.d(parcel, readInt);
            } else {
                iArr = cnwm.u(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new GetAvailableOtherPaymentMethodsResponse(iArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetAvailableOtherPaymentMethodsResponse[] newArray(int i) {
        return new GetAvailableOtherPaymentMethodsResponse[i];
    }
}
