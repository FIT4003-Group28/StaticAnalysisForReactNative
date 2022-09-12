package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.TransactionInfo;
/* compiled from: PG */
/* renamed from: cpay  reason: default package */
/* loaded from: classes5.dex */
public final class cpay implements Parcelable.Creator<TransactionInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TransactionInfo createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 3) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b == 4) {
                i3 = cnwm.i(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                i4 = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new TransactionInfo(i, i2, i3, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TransactionInfo[] newArray(int i) {
        return new TransactionInfo[i];
    }
}
