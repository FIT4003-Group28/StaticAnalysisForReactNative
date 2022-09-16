package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
/* compiled from: PG */
/* renamed from: cmre  reason: default package */
/* loaded from: classes.dex */
public final class cmre implements cmrg<Account[]> {
    final /* synthetic */ String a = "com.google";
    final /* synthetic */ String[] b;

    public cmre(String[] strArr) {
        this.b = strArr;
    }

    @Override // defpackage.cmrg
    public final /* bridge */ /* synthetic */ Account[] a(IBinder iBinder) {
        clcm clcmVar;
        if (iBinder == null) {
            clcmVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            clcmVar = queryLocalInterface instanceof clcm ? (clcm) queryLocalInterface : new clcm(iBinder);
        }
        Bundle bundle = new Bundle();
        bundle.putString("accountType", this.a);
        bundle.putStringArray("account_features", this.b);
        Bundle g = clcmVar.g(bundle);
        cmrh.o(g);
        Parcelable[] parcelableArray = g.getParcelableArray("accounts");
        Account[] accountArr = new Account[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            accountArr[i] = (Account) parcelableArray[i];
        }
        return accountArr;
    }
}
