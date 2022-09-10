package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentProviderClient;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: cmrb  reason: default package */
/* loaded from: classes.dex */
public final class cmrb extends cmrh {
    public static String a(Context context, Account account, String str, Bundle bundle) {
        return b(context, account, str, bundle).b;
    }

    public static TokenData b(Context context, Account account, String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("handle_notification", true);
        try {
            TokenData h = cmrh.h(context, account, str, bundle);
            cnnk.f(context);
            return h;
        } catch (cmrj e) {
            cnnk.b(e.a, context);
            throw new cmrl();
        } catch (UserRecoverableAuthException unused) {
            cnnk.f(context);
            throw new cmrl();
        }
    }

    public static void c(Context context, String str) {
        cnwc.i("Calling this from your main thread can lead to deadlock");
        cmrh.m(context, 8400000);
        Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        if (!bundle.containsKey(cmrh.b)) {
            bundle.putString(cmrh.b, str2);
        }
        cxju.c(context);
        if (dxyq.b() && cmrh.i(context)) {
            cmrq a = cmrr.a(context);
            final ClearTokenRequest clearTokenRequest = new ClearTokenRequest();
            clearTokenRequest.b = str;
            cntc builder = cntd.builder();
            builder.b = new Feature[]{cmqy.a};
            builder.a = new cnsr(clearTokenRequest) { // from class: cmsb
                private final ClearTokenRequest a;

                {
                    this.a = clearTokenRequest;
                }

                @Override // defpackage.cnsr
                public final void a(Object obj, Object obj2) {
                    ((cmrz) ((cmrs) obj).L()).f(new cmsg((cpct) obj2), this.a);
                }
            };
            builder.c = 1513;
            try {
                cmrh.k(((cnof) a).d(builder.a()), "clear token");
                return;
            } catch (cnob unused) {
            }
        }
        cmrh.n(context, cmrh.c, new cmrd(str, bundle));
    }

    public static Account[] d(Context context) {
        cnwc.l("com.google");
        int i = cnmr.c;
        cnnl.d(context, 8400000);
        if (Build.VERSION.SDK_INT >= 23) {
            cnwc.a(context);
            ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
            try {
                if (acquireContentProviderClient == null) {
                    throw new RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
                }
                try {
                    Bundle call = acquireContentProviderClient.call("get_accounts", "com.google", new Bundle());
                    if (call == null) {
                        throw new RemoteException("Null result from AccountChimeraContentProvider");
                    }
                    Parcelable[] parcelableArray = call.getParcelableArray("accounts");
                    if (parcelableArray != null) {
                        Account[] accountArr = new Account[parcelableArray.length];
                        for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                            accountArr[i2] = (Account) parcelableArray[i2];
                        }
                        return accountArr;
                    }
                    throw new RemoteException("Key_Accounts is Null");
                } catch (RemoteException e) {
                    throw e;
                } catch (Exception e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    throw new RemoteException(valueOf.length() != 0 ? "Accounts ContentProvider failed: ".concat(valueOf) : new String("Accounts ContentProvider failed: "));
                }
            } finally {
                acquireContentProviderClient.release();
            }
        }
        return AccountManager.get(context).getAccountsByType("com.google");
    }

    public static TokenData e(Context context, Account account, String str) {
        return cmrh.h(context, account, str, null);
    }
}
