package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: clcm  reason: default package */
/* loaded from: classes.dex */
public final class clcm extends cla implements IInterface {
    public clcm(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    public final Bundle e(String str, Bundle bundle) {
        Parcel a = a();
        a.writeString(str);
        clc.e(a, bundle);
        Parcel Si = Si(2, a);
        Bundle bundle2 = (Bundle) clc.d(Si, Bundle.CREATOR);
        Si.recycle();
        return bundle2;
    }

    public final Bundle f(Account account, String str, Bundle bundle) {
        Parcel a = a();
        clc.e(a, account);
        a.writeString(str);
        clc.e(a, bundle);
        Parcel Si = Si(5, a);
        Bundle bundle2 = (Bundle) clc.d(Si, Bundle.CREATOR);
        Si.recycle();
        return bundle2;
    }

    public final Bundle g(Bundle bundle) {
        Parcel a = a();
        clc.e(a, bundle);
        Parcel Si = Si(6, a);
        Bundle bundle2 = (Bundle) clc.d(Si, Bundle.CREATOR);
        Si.recycle();
        return bundle2;
    }

    public final Bundle h(String str) {
        Parcel a = a();
        a.writeString(str);
        Parcel Si = Si(8, a);
        Bundle bundle = (Bundle) clc.d(Si, Bundle.CREATOR);
        Si.recycle();
        return bundle;
    }
}
