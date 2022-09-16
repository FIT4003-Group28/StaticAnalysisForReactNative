package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.UserRecoverableAuthException;
/* compiled from: PG */
/* renamed from: qhx  reason: default package */
/* loaded from: classes4.dex */
public final class qhx implements qhy {
    final /* synthetic */ String a;

    public qhx(String str) {
        this.a = str;
    }

    @Override // defpackage.qhy
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        ose oseVar;
        if (iBinder == null) {
            oseVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            if (queryLocalInterface instanceof ose) {
                oseVar = (ose) queryLocalInterface;
            } else {
                oseVar = new ose(iBinder);
            }
        }
        String str = this.a;
        Parcel pv = oseVar.pv();
        pv.writeString(str);
        Parcel pw = oseVar.pw(8, pv);
        Bundle bundle = (Bundle) dve.a(pw, Bundle.CREATOR);
        pw.recycle();
        qhz.j(bundle);
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        qiz a = qiz.a(string);
        if (qiz.SUCCESS.equals(a)) {
            return true;
        }
        if (qiz.b(a)) {
            saz sazVar = qhz.d;
            String valueOf = String.valueOf(a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("isUserRecoverableError status: ");
            sb.append(valueOf);
            sazVar.b("GoogleAuthUtil", sb.toString());
            throw new UserRecoverableAuthException(string, intent);
        }
        throw new qhr(string);
    }
}
