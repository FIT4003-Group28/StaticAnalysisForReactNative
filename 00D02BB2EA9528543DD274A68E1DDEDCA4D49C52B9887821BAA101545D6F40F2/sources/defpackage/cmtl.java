package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
/* compiled from: PG */
/* renamed from: cmtl  reason: default package */
/* loaded from: classes5.dex */
public final class cmtl implements Parcelable.Creator<SignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SignInAccount createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 4) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 7) {
                googleSignInAccount = (GoogleSignInAccount) cnwm.q(parcel, readInt, GoogleSignInAccount.CREATOR);
            } else if (b != 8) {
                cnwm.d(parcel, readInt);
            } else {
                str2 = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SignInAccount[] newArray(int i) {
        return new SignInAccount[i];
    }
}
