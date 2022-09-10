package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.auth.UserRecoverableAuthException;
/* compiled from: PG */
/* renamed from: cmrf  reason: default package */
/* loaded from: classes5.dex */
public final class cmrf implements cmrg<Boolean> {
    final /* synthetic */ String a;

    public cmrf(String str) {
        this.a = str;
    }

    @Override // defpackage.cmrg
    public final /* bridge */ /* synthetic */ Boolean a(IBinder iBinder) {
        clcm clcmVar;
        if (iBinder == null) {
            clcmVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            clcmVar = queryLocalInterface instanceof clcm ? (clcm) queryLocalInterface : new clcm(iBinder);
        }
        Bundle h = clcmVar.h(this.a);
        cmrh.o(h);
        String string = h.getString("Error");
        Intent intent = (Intent) h.getParcelable("userRecoveryIntent");
        cmuj a = cmuj.a(string);
        if (cmuj.SUCCESS.equals(a)) {
            return true;
        }
        if (!cmuj.b(a)) {
            throw new cmra(string);
        }
        String valueOf = String.valueOf(a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("isUserRecoverableError status: ");
        sb.append(valueOf);
        sb.toString();
        throw new UserRecoverableAuthException(string, intent);
    }
}
