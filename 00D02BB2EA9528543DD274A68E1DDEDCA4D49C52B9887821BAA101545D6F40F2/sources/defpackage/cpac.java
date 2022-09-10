package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetActiveCardsForAccountResponse;
/* compiled from: PG */
/* renamed from: cpac  reason: default package */
/* loaded from: classes5.dex */
public final class cpac implements Parcelable.Creator<GetActiveCardsForAccountResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetActiveCardsForAccountResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        CardInfo[] cardInfoArr = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 2) {
                cnwm.d(parcel, readInt);
            } else {
                cardInfoArr = (CardInfo[]) cnwm.z(parcel, readInt, CardInfo.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new GetActiveCardsForAccountResponse(cardInfoArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetActiveCardsForAccountResponse[] newArray(int i) {
        return new GetActiveCardsForAccountResponse[i];
    }
}
