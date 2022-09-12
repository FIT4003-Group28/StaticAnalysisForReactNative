package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentProviderClient;
import android.content.Context;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cvpn  reason: default package */
/* loaded from: classes5.dex */
public final class cvpn implements cvpm {
    public Context a;

    @Override // defpackage.cvpm
    public final Set<String> a() {
        int i = 0;
        if (!cvpo.c(this.a, "android.permission.GET_ACCOUNTS") || cvpo.b()) {
            Object[] objArr = new Object[0];
            if (cvpg.a(2)) {
                cvpg.c("DeviceAccountsUtilImpl", "Try to retrieve accounts list from Accounts ContentProvider.", objArr);
            }
            ContentProviderClient acquireContentProviderClient = this.a.getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
            try {
                if (acquireContentProviderClient == null) {
                    throw new cvpl();
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
                    throw new cvpl(e);
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
}
