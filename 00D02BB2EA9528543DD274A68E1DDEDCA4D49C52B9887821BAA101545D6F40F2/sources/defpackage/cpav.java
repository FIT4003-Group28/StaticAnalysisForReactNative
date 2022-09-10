package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.OnlineAccountCardLinkInfo;
import com.google.android.gms.tapandpay.firstparty.TokenInfo;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
/* compiled from: PG */
/* renamed from: cpav  reason: default package */
/* loaded from: classes5.dex */
public final class cpav implements Parcelable.Creator<TokenInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TokenInfo createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        TokenStatus tokenStatus = null;
        String str3 = null;
        Uri uri = null;
        byte[] bArr = null;
        OnlineAccountCardLinkInfo[] onlineAccountCardLinkInfoArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 2:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 3:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 4:
                    tokenStatus = (TokenStatus) cnwm.q(parcel, readInt, TokenStatus.CREATOR);
                    break;
                case 5:
                    str3 = cnwm.o(parcel, readInt);
                    break;
                case 6:
                    uri = (Uri) cnwm.q(parcel, readInt, Uri.CREATOR);
                    break;
                case 7:
                    bArr = cnwm.s(parcel, readInt);
                    break;
                case 8:
                    onlineAccountCardLinkInfoArr = (OnlineAccountCardLinkInfo[]) cnwm.z(parcel, readInt, OnlineAccountCardLinkInfo.CREATOR);
                    break;
                case 9:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 10:
                    z = cnwm.g(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new TokenInfo(str, str2, i, tokenStatus, str3, uri, bArr, onlineAccountCardLinkInfoArr, i2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TokenInfo[] newArray(int i) {
        return new TokenInfo[i];
    }
}
