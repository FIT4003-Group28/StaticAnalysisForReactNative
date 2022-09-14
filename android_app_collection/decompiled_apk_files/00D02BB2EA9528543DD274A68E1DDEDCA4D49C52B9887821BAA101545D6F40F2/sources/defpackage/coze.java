package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;
import com.google.android.gms.signin.internal.SignInResponse;
/* compiled from: PG */
/* renamed from: coze  reason: default package */
/* loaded from: classes5.dex */
public abstract class coze extends clb implements cozf {
    public coze() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) clc.d(parcel, ConnectionResult.CREATOR);
                AuthAccountResult authAccountResult = (AuthAccountResult) clc.d(parcel, AuthAccountResult.CREATOR);
                break;
            case 4:
                Status status = (Status) clc.d(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) clc.d(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) clc.d(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) clc.d(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                b((SignInResponse) clc.d(parcel, SignInResponse.CREATOR));
                break;
            case 9:
                RecordConsentByConsentResultResponse recordConsentByConsentResultResponse = (RecordConsentByConsentResultResponse) clc.d(parcel, RecordConsentByConsentResultResponse.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
