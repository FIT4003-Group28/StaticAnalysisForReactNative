package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.filament.R;
import com.google.android.gms.tapandpay.firstparty.BadgeInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.CardRewardsInfo;
import com.google.android.gms.tapandpay.firstparty.InAppCvmConfig;
import com.google.android.gms.tapandpay.firstparty.InStoreCvmConfig;
import com.google.android.gms.tapandpay.firstparty.IssuerInfo;
import com.google.android.gms.tapandpay.firstparty.OnlineAccountCardLinkInfo;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.tapandpay.firstparty.TransactionInfo;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cozx  reason: default package */
/* loaded from: classes5.dex */
public final class cozx implements Parcelable.Creator<CardInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CardInfo createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        byte[] bArr = null;
        String str2 = null;
        String str3 = null;
        TokenStatus tokenStatus = null;
        String str4 = null;
        Uri uri = null;
        IssuerInfo issuerInfo = null;
        String str5 = null;
        TransactionInfo transactionInfo = null;
        String str6 = null;
        byte[] bArr2 = null;
        InStoreCvmConfig inStoreCvmConfig = null;
        InAppCvmConfig inAppCvmConfig = null;
        String str7 = null;
        OnlineAccountCardLinkInfo[] onlineAccountCardLinkInfoArr = null;
        ArrayList arrayList = null;
        String str8 = null;
        String str9 = null;
        CardRewardsInfo cardRewardsInfo = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i7 = 0;
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
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 5:
                    str3 = cnwm.o(parcel, readInt);
                    break;
                case 6:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 7:
                    tokenStatus = (TokenStatus) cnwm.q(parcel, readInt, TokenStatus.CREATOR);
                    break;
                case 8:
                    str4 = cnwm.o(parcel, readInt);
                    break;
                case 9:
                    uri = (Uri) cnwm.q(parcel, readInt, Uri.CREATOR);
                    break;
                case 10:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 11:
                    i3 = cnwm.i(parcel, readInt);
                    break;
                case 12:
                    issuerInfo = (IssuerInfo) cnwm.q(parcel, readInt, IssuerInfo.CREATOR);
                    break;
                case 13:
                    str5 = cnwm.o(parcel, readInt);
                    break;
                case 14:
                case 19:
                default:
                    cnwm.d(parcel, readInt);
                    break;
                case 15:
                    transactionInfo = (TransactionInfo) cnwm.q(parcel, readInt, TransactionInfo.CREATOR);
                    break;
                case 16:
                    str6 = cnwm.o(parcel, readInt);
                    break;
                case 17:
                    bArr2 = cnwm.s(parcel, readInt);
                    break;
                case 18:
                    i4 = cnwm.i(parcel, readInt);
                    break;
                case 20:
                    i5 = cnwm.i(parcel, readInt);
                    break;
                case 21:
                    i6 = cnwm.i(parcel, readInt);
                    break;
                case 22:
                    inStoreCvmConfig = (InStoreCvmConfig) cnwm.q(parcel, readInt, InStoreCvmConfig.CREATOR);
                    break;
                case 23:
                    inAppCvmConfig = (InAppCvmConfig) cnwm.q(parcel, readInt, InAppCvmConfig.CREATOR);
                    break;
                case 24:
                    str7 = cnwm.o(parcel, readInt);
                    break;
                case 25:
                    onlineAccountCardLinkInfoArr = (OnlineAccountCardLinkInfo[]) cnwm.z(parcel, readInt, OnlineAccountCardLinkInfo.CREATOR);
                    break;
                case 26:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 27:
                    arrayList = cnwm.A(parcel, readInt, BadgeInfo.CREATOR);
                    break;
                case 28:
                    z2 = cnwm.g(parcel, readInt);
                    break;
                case 29:
                    z3 = cnwm.g(parcel, readInt);
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    j = cnwm.k(parcel, readInt);
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    j2 = cnwm.k(parcel, readInt);
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    z4 = cnwm.g(parcel, readInt);
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    j3 = cnwm.k(parcel, readInt);
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    str8 = cnwm.o(parcel, readInt);
                    break;
                case 35:
                    str9 = cnwm.o(parcel, readInt);
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    cardRewardsInfo = (CardRewardsInfo) cnwm.q(parcel, readInt, CardRewardsInfo.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    i7 = cnwm.i(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new CardInfo(str, bArr, str2, str3, i, tokenStatus, str4, uri, i2, i3, issuerInfo, str5, transactionInfo, str6, bArr2, i4, i5, i6, inStoreCvmConfig, inAppCvmConfig, str7, onlineAccountCardLinkInfoArr, z, arrayList, z2, z3, j, j2, z4, j3, str8, str9, cardRewardsInfo, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CardInfo[] newArray(int i) {
        return new CardInfo[i];
    }
}
