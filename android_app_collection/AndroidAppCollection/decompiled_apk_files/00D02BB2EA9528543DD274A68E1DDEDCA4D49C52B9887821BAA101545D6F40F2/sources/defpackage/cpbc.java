package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.filament.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetActiveAccountResponse;
import com.google.android.gms.tapandpay.firstparty.GetActiveCardsForAccountResponse;
import com.google.android.gms.tapandpay.firstparty.GetActiveTokensForAccountResponse;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import com.google.android.gms.tapandpay.firstparty.GetAvailableOtherPaymentMethodsResponse;
import com.google.android.gms.tapandpay.firstparty.GetContactlessSetupStatusResponse;
import com.google.android.gms.tapandpay.firstparty.GetFelicaTosAcceptanceResponse;
import com.google.android.gms.tapandpay.firstparty.GetLastAttestationResultResponse;
import com.google.android.gms.tapandpay.firstparty.GetNotificationSettingsResponse;
import com.google.android.gms.tapandpay.firstparty.GetSeChipTransactionsResponse;
import com.google.android.gms.tapandpay.firstparty.GetSecurityParamsResponse;
import com.google.android.gms.tapandpay.firstparty.RefreshSeCardsResponse;
import com.google.android.gms.tapandpay.firstparty.ReserveResourceResponse;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tapandpay.issuer.TokenStatus;
import com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig;
/* compiled from: PG */
/* renamed from: cpbc  reason: default package */
/* loaded from: classes5.dex */
public abstract class cpbc extends clb implements cpbd {
    public cpbc() {
        super("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                Status status = (Status) clc.d(parcel, Status.CREATOR);
                R();
                return true;
            case 3:
                Bundle bundle = (Bundle) clc.d(parcel, Bundle.CREATOR);
                s((Status) clc.d(parcel, Status.CREATOR));
                return true;
            case 4:
                b((Status) clc.d(parcel, Status.CREATOR), (GetAllCardsResponse) clc.d(parcel, GetAllCardsResponse.CREATOR));
                return true;
            case 5:
                Status status2 = (Status) clc.d(parcel, Status.CREATOR);
                Q();
                return true;
            case 6:
                Status status3 = (Status) clc.d(parcel, Status.CREATOR);
                e();
                return true;
            case 7:
            case 16:
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            default:
                return false;
            case 8:
                c((Status) clc.d(parcel, Status.CREATOR), (GetActiveAccountResponse) clc.d(parcel, GetActiveAccountResponse.CREATOR));
                return true;
            case 9:
                Status status4 = (Status) clc.d(parcel, Status.CREATOR);
                O();
                return true;
            case 10:
                d();
                return true;
            case 11:
                Status status5 = (Status) clc.d(parcel, Status.CREATOR);
                clc.a(parcel);
                l();
                return true;
            case 12:
                Status status6 = (Status) clc.d(parcel, Status.CREATOR);
                P();
                return true;
            case 13:
                Status status7 = (Status) clc.d(parcel, Status.CREATOR);
                clc.a(parcel);
                F();
                return true;
            case 14:
                Status status8 = (Status) clc.d(parcel, Status.CREATOR);
                G();
                return true;
            case 15:
                Status status9 = (Status) clc.d(parcel, Status.CREATOR);
                GetActiveCardsForAccountResponse getActiveCardsForAccountResponse = (GetActiveCardsForAccountResponse) clc.d(parcel, GetActiveCardsForAccountResponse.CREATOR);
                f();
                return true;
            case 17:
                Status status10 = (Status) clc.d(parcel, Status.CREATOR);
                RetrieveInAppPaymentCredentialResponse retrieveInAppPaymentCredentialResponse = (RetrieveInAppPaymentCredentialResponse) clc.d(parcel, RetrieveInAppPaymentCredentialResponse.CREATOR);
                t();
                return true;
            case 18:
                Status status11 = (Status) clc.d(parcel, Status.CREATOR);
                parcel.readString();
                i();
                return true;
            case 19:
                Status status12 = (Status) clc.d(parcel, Status.CREATOR);
                parcel.readString();
                h();
                return true;
            case 20:
                Status status13 = (Status) clc.d(parcel, Status.CREATOR);
                TokenStatus tokenStatus = (TokenStatus) clc.d(parcel, TokenStatus.CREATOR);
                S();
                return true;
            case 21:
                Status status14 = (Status) clc.d(parcel, Status.CREATOR);
                clc.a(parcel);
                m();
                return true;
            case 22:
                Status status15 = (Status) clc.d(parcel, Status.CREATOR);
                u();
                return true;
            case 23:
                Status status16 = (Status) clc.d(parcel, Status.CREATOR);
                parcel.readString();
                N();
                return true;
            case 24:
                Status status17 = (Status) clc.d(parcel, Status.CREATOR);
                parcel.readString();
                o();
                return true;
            case 25:
                Status status18 = (Status) clc.d(parcel, Status.CREATOR);
                n();
                return true;
            case 26:
                Status status19 = (Status) clc.d(parcel, Status.CREATOR);
                clc.a(parcel);
                B();
                return true;
            case 27:
                Status status20 = (Status) clc.d(parcel, Status.CREATOR);
                GetSecurityParamsResponse getSecurityParamsResponse = (GetSecurityParamsResponse) clc.d(parcel, GetSecurityParamsResponse.CREATOR);
                L();
                return true;
            case 28:
                Status status21 = (Status) clc.d(parcel, Status.CREATOR);
                GetNotificationSettingsResponse getNotificationSettingsResponse = (GetNotificationSettingsResponse) clc.d(parcel, GetNotificationSettingsResponse.CREATOR);
                z();
                return true;
            case 29:
                Status status22 = (Status) clc.d(parcel, Status.CREATOR);
                A();
                return true;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                Status status23 = (Status) clc.d(parcel, Status.CREATOR);
                GetAvailableOtherPaymentMethodsResponse getAvailableOtherPaymentMethodsResponse = (GetAvailableOtherPaymentMethodsResponse) clc.d(parcel, GetAvailableOtherPaymentMethodsResponse.CREATOR);
                j();
                return true;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                Status status24 = (Status) clc.d(parcel, Status.CREATOR);
                GetActiveTokensForAccountResponse getActiveTokensForAccountResponse = (GetActiveTokensForAccountResponse) clc.d(parcel, GetActiveTokensForAccountResponse.CREATOR);
                g();
                return true;
            case 35:
                Status status25 = (Status) clc.d(parcel, Status.CREATOR);
                GetSeChipTransactionsResponse getSeChipTransactionsResponse = (GetSeChipTransactionsResponse) clc.d(parcel, GetSeChipTransactionsResponse.CREATOR);
                K();
                return true;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                Status status26 = (Status) clc.d(parcel, Status.CREATOR);
                ReserveResourceResponse reserveResourceResponse = (ReserveResourceResponse) clc.d(parcel, ReserveResourceResponse.CREATOR);
                I();
                return true;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                Status status27 = (Status) clc.d(parcel, Status.CREATOR);
                H();
                return true;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                Status status28 = (Status) clc.d(parcel, Status.CREATOR);
                M();
                return true;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                Status status29 = (Status) clc.d(parcel, Status.CREATOR);
                GetFelicaTosAcceptanceResponse getFelicaTosAcceptanceResponse = (GetFelicaTosAcceptanceResponse) clc.d(parcel, GetFelicaTosAcceptanceResponse.CREATOR);
                p();
                return true;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                Status status30 = (Status) clc.d(parcel, Status.CREATOR);
                q();
                return true;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                Status status31 = (Status) clc.d(parcel, Status.CREATOR);
                RefreshSeCardsResponse refreshSeCardsResponse = (RefreshSeCardsResponse) clc.d(parcel, RefreshSeCardsResponse.CREATOR);
                J();
                return true;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                Status status32 = (Status) clc.d(parcel, Status.CREATOR);
                GetGlobalActionCardsResponse getGlobalActionCardsResponse = (GetGlobalActionCardsResponse) clc.d(parcel, GetGlobalActionCardsResponse.CREATOR);
                r();
                return true;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                Status status33 = (Status) clc.d(parcel, Status.CREATOR);
                parcel.readString();
                x();
                return true;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                Status status34 = (Status) clc.d(parcel, Status.CREATOR);
                C();
                return true;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                Status status35 = (Status) clc.d(parcel, Status.CREATOR);
                D();
                return true;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                Status status36 = (Status) clc.d(parcel, Status.CREATOR);
                GetLastAttestationResultResponse getLastAttestationResultResponse = (GetLastAttestationResultResponse) clc.d(parcel, GetLastAttestationResultResponse.CREATOR);
                w();
                return true;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                Status status37 = (Status) clc.d(parcel, Status.CREATOR);
                QuickAccessWalletConfig quickAccessWalletConfig = (QuickAccessWalletConfig) clc.d(parcel, QuickAccessWalletConfig.CREATOR);
                E();
                return true;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                Status status38 = (Status) clc.d(parcel, Status.CREATOR);
                GetContactlessSetupStatusResponse getContactlessSetupStatusResponse = (GetContactlessSetupStatusResponse) clc.d(parcel, GetContactlessSetupStatusResponse.CREATOR);
                k();
                return true;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                Status status39 = (Status) clc.d(parcel, Status.CREATOR);
                clc.a(parcel);
                v();
                return true;
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                Status status40 = (Status) clc.d(parcel, Status.CREATOR);
                TokenInfo[] tokenInfoArr = (TokenInfo[]) parcel.createTypedArray(TokenInfo.CREATOR);
                y();
                return true;
        }
    }
}
