package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;
import com.google.android.gms.signin.internal.SignInResponse;
/* compiled from: PG */
/* renamed from: rua  reason: default package */
/* loaded from: classes4.dex */
public class rua extends dvd implements IInterface {
    public rua() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public void c(SignInResponse signInResponse) {
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) dve.a(parcel, ConnectionResult.CREATOR);
                AuthAccountResult authAccountResult = (AuthAccountResult) dve.a(parcel, AuthAccountResult.CREATOR);
                break;
            case 4:
                Status status = (Status) dve.a(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) dve.a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) dve.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) dve.a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                c((SignInResponse) dve.a(parcel, SignInResponse.CREATOR));
                break;
            case 9:
                RecordConsentByConsentResultResponse recordConsentByConsentResultResponse = (RecordConsentByConsentResultResponse) dve.a(parcel, RecordConsentByConsentResultResponse.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
