package c.e.a.b.e.b;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public abstract class g extends c.e.a.b.d.b.a implements d {
    public g() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // c.e.a.b.d.b.a
    protected boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            a((com.google.android.gms.common.b) c.e.a.b.d.b.c.a(parcel, com.google.android.gms.common.b.CREATOR), (c) c.e.a.b.d.b.c.a(parcel, c.CREATOR));
        } else if (i == 4) {
            c((Status) c.e.a.b.d.b.c.a(parcel, Status.CREATOR));
        } else if (i == 6) {
            b((Status) c.e.a.b.d.b.c.a(parcel, Status.CREATOR));
        } else if (i == 7) {
            a((Status) c.e.a.b.d.b.c.a(parcel, Status.CREATOR), (GoogleSignInAccount) c.e.a.b.d.b.c.a(parcel, GoogleSignInAccount.CREATOR));
        } else if (i != 8) {
            return false;
        } else {
            a((l) c.e.a.b.d.b.c.a(parcel, l.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
