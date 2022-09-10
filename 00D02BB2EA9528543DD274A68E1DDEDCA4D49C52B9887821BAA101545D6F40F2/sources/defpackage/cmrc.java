package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.auth.TokenData;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cmrc  reason: default package */
/* loaded from: classes5.dex */
public final class cmrc implements cmrg<TokenData> {
    final /* synthetic */ Account a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;

    public cmrc(Account account, String str, Bundle bundle) {
        this.a = account;
        this.b = str;
        this.c = bundle;
    }

    @Override // defpackage.cmrg
    public final /* bridge */ /* synthetic */ TokenData a(IBinder iBinder) {
        clcm clcmVar;
        if (iBinder == null) {
            clcmVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            clcmVar = queryLocalInterface instanceof clcm ? (clcm) queryLocalInterface : new clcm(iBinder);
        }
        Bundle f = clcmVar.f(this.a, this.b, this.c);
        cmrh.o(f);
        return cmrh.j(f);
    }
}
