package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;
/* compiled from: PG */
/* renamed from: cpat  reason: default package */
/* loaded from: classes5.dex */
public final class cpat implements Parcelable.Creator<RetrieveInAppPaymentCredentialResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RetrieveInAppPaymentCredentialResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        byte[] bArr = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 2:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 3:
                    bArr = cnwm.s(parcel, readInt);
                    break;
                case 4:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 5:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 6:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 7:
                    str3 = cnwm.o(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new RetrieveInAppPaymentCredentialResponse(str, bArr, i, i2, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RetrieveInAppPaymentCredentialResponse[] newArray(int i) {
        return new RetrieveInAppPaymentCredentialResponse[i];
    }
}
