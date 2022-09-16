package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessResponse;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse;
/* compiled from: PG */
/* renamed from: rxb  reason: default package */
/* loaded from: classes4.dex */
public class rxb extends dvd implements IInterface {
    public rxb() {
        super("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    public void a(Status status) {
    }

    public void b(Status status, GetClientTokenResponse getClientTokenResponse) {
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.readInt();
                MaskedWallet maskedWallet = (MaskedWallet) dve.a(parcel, MaskedWallet.CREATOR);
                Bundle bundle = (Bundle) dve.a(parcel, Bundle.CREATOR);
                return true;
            case 2:
                parcel.readInt();
                FullWallet fullWallet = (FullWallet) dve.a(parcel, FullWallet.CREATOR);
                Bundle bundle2 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                return true;
            case 3:
                parcel.readInt();
                dve.j(parcel);
                Bundle bundle3 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                return true;
            case 4:
                parcel.readInt();
                Bundle bundle4 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                return true;
            case 5:
            default:
                return false;
            case 6:
                parcel.readInt();
                dve.j(parcel);
                Bundle bundle5 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                return true;
            case 7:
                Status status = (Status) dve.a(parcel, Status.CREATOR);
                GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse = (GetBuyFlowInitializationTokenResponse) dve.a(parcel, GetBuyFlowInitializationTokenResponse.CREATOR);
                Bundle bundle6 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                return true;
            case 8:
                Bundle bundle7 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                a((Status) dve.a(parcel, Status.CREATOR));
                return true;
            case 9:
                Status status2 = (Status) dve.a(parcel, Status.CREATOR);
                dve.j(parcel);
                Bundle bundle8 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                return true;
            case 10:
                Bundle bundle9 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                b((Status) dve.a(parcel, Status.CREATOR), (GetClientTokenResponse) dve.a(parcel, GetClientTokenResponse.CREATOR));
                return true;
            case 11:
                Status status3 = (Status) dve.a(parcel, Status.CREATOR);
                Bundle bundle10 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                return true;
            case 12:
                Status status4 = (Status) dve.a(parcel, Status.CREATOR);
                WebPaymentData webPaymentData = (WebPaymentData) dve.a(parcel, WebPaymentData.CREATOR);
                Bundle bundle11 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                return true;
            case 13:
                Status status5 = (Status) dve.a(parcel, Status.CREATOR);
                Bundle bundle12 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                return true;
            case 14:
                Status status6 = (Status) dve.a(parcel, Status.CREATOR);
                PaymentData paymentData = (PaymentData) dve.a(parcel, PaymentData.CREATOR);
                Bundle bundle13 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                return true;
            case 15:
                Status status7 = (Status) dve.a(parcel, Status.CREATOR);
                GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse = (GetSaveInstrumentDetailsResponse) dve.a(parcel, GetSaveInstrumentDetailsResponse.CREATOR);
                Bundle bundle14 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                return true;
            case 16:
                Status status8 = (Status) dve.a(parcel, Status.CREATOR);
                SetUpBiometricAuthenticationKeysResponse setUpBiometricAuthenticationKeysResponse = (SetUpBiometricAuthenticationKeysResponse) dve.a(parcel, SetUpBiometricAuthenticationKeysResponse.CREATOR);
                Bundle bundle15 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                return true;
            case 17:
                Status status9 = (Status) dve.a(parcel, Status.CREATOR);
                WarmUpUiProcessResponse warmUpUiProcessResponse = (WarmUpUiProcessResponse) dve.a(parcel, WarmUpUiProcessResponse.CREATOR);
                Bundle bundle16 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                return true;
            case 18:
                parcel.readInt();
                Bundle bundle17 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                return true;
            case 19:
                Status status10 = (Status) dve.a(parcel, Status.CREATOR);
                PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse = (PaymentCardRecognitionIntentResponse) dve.a(parcel, PaymentCardRecognitionIntentResponse.CREATOR);
                Bundle bundle18 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                return true;
        }
    }
}
