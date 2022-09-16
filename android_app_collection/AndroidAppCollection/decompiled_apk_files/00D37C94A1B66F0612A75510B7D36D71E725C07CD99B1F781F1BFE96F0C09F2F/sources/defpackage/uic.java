package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentProviderClient;
import android.content.Context;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: uic  reason: default package */
/* loaded from: classes4.dex */
public final class uic implements uib {
    public Context a;

    @Override // defpackage.uib
    public final Set a() {
        int i = 0;
        if (ake.c(this.a, "android.permission.GET_ACCOUNTS") != 0 || uid.b()) {
            Object[] objArr = new Object[0];
            if (urq.e(2)) {
                urq.c("DeviceAccountsUtilImpl", "Try to retrieve accounts list from Accounts ContentProvider.", objArr);
            }
            ContentProviderClient acquireContentProviderClient = this.a.getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
            try {
                if (acquireContentProviderClient == null) {
                    throw new uia();
                }
                try {
                    Parcelable[] parcelableArray = acquireContentProviderClient.call("get_accounts", "com.google", null).getParcelableArray("accounts");
                    HashSet hashSet = new HashSet();
                    int length = parcelableArray.length;
                    while (i < length) {
                        hashSet.add(((Account) parcelableArray[i]).name);
                        i++;
                    }
                    return hashSet;
                } catch (Exception e) {
                    throw new uia(e);
                }
            } finally {
                acquireContentProviderClient.release();
            }
        }
        HashSet hashSet2 = new HashSet();
        Account[] accountsByType = AccountManager.get(this.a).getAccountsByType("com.google");
        int length2 = accountsByType.length;
        while (i < length2) {
            hashSet2.add(accountsByType[i].name);
            i++;
        }
        return hashSet2;
    }

    @Override // defpackage.uib
    public final boolean b(String str) {
        try {
            return a().contains(str);
        } catch (uia e) {
            urq.d("DeviceAccountsUtilImpl", e, "HasCorrespondingAccountOnDevice falled back to true", new Object[0]);
            return true;
        }
    }
}
