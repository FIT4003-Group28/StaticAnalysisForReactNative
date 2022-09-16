package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.BadgeInfo;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.tapandpay.firstparty.TransactionInfo;
/* compiled from: PG */
/* renamed from: cozw  reason: default package */
/* loaded from: classes5.dex */
public final class cozw implements Parcelable.Creator<BadgeInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BadgeInfo createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        byte[] bArr = null;
        TokenStatus tokenStatus = null;
        String str2 = null;
        TransactionInfo transactionInfo = null;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 2:
                    bArr = cnwm.s(parcel, readInt);
                    break;
                case 3:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 4:
                    tokenStatus = (TokenStatus) cnwm.q(parcel, readInt, TokenStatus.CREATOR);
                    break;
                case 5:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 6:
                    transactionInfo = (TransactionInfo) cnwm.q(parcel, readInt, TransactionInfo.CREATOR);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new BadgeInfo(str, bArr, i, tokenStatus, str2, transactionInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BadgeInfo[] newArray(int i) {
        return new BadgeInfo[i];
    }
}
