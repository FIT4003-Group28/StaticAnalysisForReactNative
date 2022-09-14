package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.GetLastAttestationResultResponse;
/* compiled from: PG */
/* renamed from: cpai  reason: default package */
/* loaded from: classes5.dex */
public final class cpai implements Parcelable.Creator<GetLastAttestationResultResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetLastAttestationResultResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 2) {
                cnwm.d(parcel, readInt);
            } else {
                j = cnwm.k(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new GetLastAttestationResultResponse(i, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetLastAttestationResultResponse[] newArray(int i) {
        return new GetLastAttestationResultResponse[i];
    }
}
