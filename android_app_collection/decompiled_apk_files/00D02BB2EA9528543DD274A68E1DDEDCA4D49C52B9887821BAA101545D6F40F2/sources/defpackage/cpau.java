package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.SeTransactionInfo;
import java.math.BigDecimal;
import java.math.BigInteger;
/* compiled from: PG */
/* renamed from: cpau  reason: default package */
/* loaded from: classes5.dex */
public final class cpau implements Parcelable.Creator<SeTransactionInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SeTransactionInfo createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        long j = 0;
        long j2 = 0;
        BigDecimal bigDecimal = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                j = cnwm.k(parcel, readInt);
            } else if (b == 2) {
                int c = cnwm.c(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (c == 0) {
                    bigDecimal = null;
                } else {
                    byte[] createByteArray = parcel.createByteArray();
                    int readInt2 = parcel.readInt();
                    parcel.setDataPosition(dataPosition + c);
                    bigDecimal = new BigDecimal(new BigInteger(createByteArray), readInt2);
                }
            } else if (b == 3) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 4) {
                j2 = cnwm.k(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new SeTransactionInfo(j, bigDecimal, str, j2, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SeTransactionInfo[] newArray(int i) {
        return new SeTransactionInfo[i];
    }
}
