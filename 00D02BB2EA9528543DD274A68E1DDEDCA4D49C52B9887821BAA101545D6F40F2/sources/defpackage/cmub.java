package defpackage;

import android.os.Parcel;
import com.google.android.filament.R;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cmub  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmub extends clb implements cmuc {
    public cmub() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) clc.d(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) clc.d(parcel, Status.CREATOR);
                d();
                break;
            case 102:
                b((Status) clc.d(parcel, Status.CREATOR));
                break;
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                c((Status) clc.d(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
