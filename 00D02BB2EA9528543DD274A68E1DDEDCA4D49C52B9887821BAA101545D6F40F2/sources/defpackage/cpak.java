package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.GetSeChipTransactionsResponse;
import com.google.android.gms.tapandpay.firstparty.SeTransactionInfo;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cpak  reason: default package */
/* loaded from: classes5.dex */
public final class cpak implements Parcelable.Creator<GetSeChipTransactionsResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetSeChipTransactionsResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 1) {
                cnwm.d(parcel, readInt);
            } else {
                arrayList = cnwm.A(parcel, readInt, SeTransactionInfo.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new GetSeChipTransactionsResponse(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetSeChipTransactionsResponse[] newArray(int i) {
        return new GetSeChipTransactionsResponse[i];
    }
}
