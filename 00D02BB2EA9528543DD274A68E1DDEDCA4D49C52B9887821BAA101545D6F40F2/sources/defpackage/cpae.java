package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
/* compiled from: PG */
/* renamed from: cpae  reason: default package */
/* loaded from: classes5.dex */
public final class cpae implements Parcelable.Creator<GetAllCardsResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetAllCardsResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        CardInfo[] cardInfoArr = null;
        AccountInfo accountInfo = null;
        String str = null;
        String str2 = null;
        SparseArray sparseArray = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                cardInfoArr = (CardInfo[]) cnwm.z(parcel, readInt, CardInfo.CREATOR);
            } else if (b == 3) {
                accountInfo = (AccountInfo) cnwm.q(parcel, readInt, AccountInfo.CREATOR);
            } else if (b == 4) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 5) {
                str2 = cnwm.o(parcel, readInt);
            } else if (b != 6) {
                cnwm.d(parcel, readInt);
            } else {
                int c = cnwm.c(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (c == 0) {
                    sparseArray = null;
                } else {
                    SparseArray sparseArray2 = new SparseArray();
                    int readInt2 = parcel.readInt();
                    for (int i = 0; i < readInt2; i++) {
                        sparseArray2.append(parcel.readInt(), parcel.readString());
                    }
                    parcel.setDataPosition(dataPosition + c);
                    sparseArray = sparseArray2;
                }
            }
        }
        cnwm.B(parcel, f);
        return new GetAllCardsResponse(cardInfoArr, accountInfo, str, str2, sparseArray);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetAllCardsResponse[] newArray(int i) {
        return new GetAllCardsResponse[i];
    }
}
