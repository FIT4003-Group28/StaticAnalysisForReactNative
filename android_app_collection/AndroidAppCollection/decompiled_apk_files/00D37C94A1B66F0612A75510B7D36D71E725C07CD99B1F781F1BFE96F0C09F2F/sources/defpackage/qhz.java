package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: qhz  reason: default package */
/* loaded from: classes4.dex */
public final class qhz {
    public static final String b = "androidPackageName";
    public static final String[] a = {"com.google", "com.google.work", "cn.google"};
    public static final ComponentName c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final saz d = qhp.c("GoogleAuthUtil");

    public static TokenData a(Bundle bundle) {
        TokenData tokenData;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        qiz a2 = qiz.a(string);
        if (!qiz.b(a2)) {
            if (qiz.NETWORK_ERROR.equals(a2) || qiz.SERVICE_UNAVAILABLE.equals(a2) || qiz.INTNERNAL_ERROR.equals(a2) || qiz.AUTH_SECURITY_ERROR.equals(a2)) {
                throw new IOException(string);
            }
            throw new qhr(string);
        }
        saz sazVar = d;
        String valueOf = String.valueOf(a2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("isUserRecoverableError status: ");
        sb.append(valueOf);
        sazVar.b("GoogleAuthUtil", sb.toString());
        throw new UserRecoverableAuthException(string, intent);
    }

    public static TokenData b(Context context, final Account account, final String str, Bundle bundle) {
        qnm.i("Calling this from your main thread can lead to deadlock");
        qnm.m(str, "Scope cannot be empty or null.");
        n(account);
        g(context, 8400000);
        final Bundle bundle2 = new Bundle(bundle);
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        String str3 = b;
        if (TextUtils.isEmpty(bundle2.getString(str3))) {
            bundle2.putString(str3, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        vbt.g(context);
        if (axqx.c() && i(context)) {
            qie j = qfl.j(context);
            qnm.n(account, "Account name cannot be null!");
            qnm.m(str, "Scope cannot be null!");
            qvx b2 = qvy.b();
            b2.b = new Feature[]{qhq.b};
            b2.a = new qvo() { // from class: qij
                @Override // defpackage.qvo
                public final void a(Object obj, Object obj2) {
                    ((qii) ((qif) obj).D()).h(new qig((rvh) obj2, 3, (char[]) null), account, str, bundle2);
                }
            };
            b2.c = 1512;
            try {
                Bundle bundle3 = (Bundle) d(((qst) j).v(b2.a()), "token retrieval");
                j(bundle3);
                return a(bundle3);
            } catch (qsp e) {
                h(e, "token retrieval");
            }
        }
        return (TokenData) c(context, c, new qhy() { // from class: qhs
            @Override // defpackage.qhy
            public final Object a(IBinder iBinder) {
                ose oseVar;
                Account account2 = account;
                String str4 = str;
                Bundle bundle4 = bundle2;
                String[] strArr = qhz.a;
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
                Parcel pv = oseVar.pv();
                dve.g(pv, account2);
                pv.writeString(str4);
                dve.g(pv, bundle4);
                Parcel pw = oseVar.pw(5, pv);
                Bundle bundle5 = (Bundle) dve.a(pw, Bundle.CREATOR);
                pw.recycle();
                if (bundle5 == null) {
                    throw new IOException("Service call returned null");
                }
                return qhz.a(bundle5);
            }
        });
    }

    public static Object c(Context context, ComponentName componentName, qhy qhyVar) {
        qrm qrmVar = new qrm();
        qxd a2 = qxd.a(context);
        try {
            try {
                if (a2.b(new qxc(componentName), qrmVar, "GoogleAuthUtil")) {
                    try {
                        qnm.i("BlockingServiceConnection.getService() called on main thread");
                        if (!qrmVar.a) {
                            qrmVar.a = true;
                            return qhyVar.a((IBinder) qrmVar.b.take());
                        }
                        throw new IllegalStateException("Cannot call get on this connection more than once");
                    } catch (RemoteException | InterruptedException e) {
                        throw new IOException("Error on service connection.", e);
                    }
                }
                throw new IOException("Could not bind to service.");
            } finally {
                a2.c(componentName, qrmVar);
            }
        } catch (SecurityException e2) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e2.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e2);
        }
    }

    public static Object d(rve rveVar, String str) {
        try {
            return rwd.d(rveVar);
        } catch (InterruptedException e) {
            String format = String.format("Interrupted while waiting for the task of %s to finish.", str);
            d.b(format, new Object[0]);
            throw new IOException(format, e);
        } catch (CancellationException e2) {
            String format2 = String.format("Canceled while waiting for the task of %s to finish.", str);
            d.b(format2, new Object[0]);
            throw new IOException(format2, e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof qsp) {
                throw ((qsp) cause);
            }
            String format3 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            d.b(format3, new Object[0]);
            throw new IOException(format3, e3);
        }
    }

    public static String e(Context context, Account account, String str) {
        return f(context, account, str, new Bundle());
    }

    public static String f(Context context, Account account, String str, Bundle bundle) {
        n(account);
        return b(context, account, str, bundle).b;
    }

    public static void g(Context context, int i) {
        try {
            qse.d(context.getApplicationContext(), i);
        } catch (GooglePlayServicesIncorrectManifestValueException e) {
            e = e;
            throw new qhr(e.getMessage(), e);
        } catch (qsc e2) {
            e = e2;
            throw new qhr(e.getMessage(), e);
        } catch (qsd e3) {
            throw new qia(e3.a, e3.getMessage(), new Intent(e3.b));
        }
    }

    public static void h(qsp qspVar, String str) {
        d.b("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(qspVar));
    }

    public static boolean i(Context context) {
        if (qrq.a.h(context, 17895000) != 0) {
            return false;
        }
        String str = context.getApplicationInfo().packageName;
        for (String str2 : axqx.a.get().a().b) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static void j(Object obj) {
        if (obj != null) {
            return;
        }
        d.b("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    @Deprecated
    public static String k(Context context, String str, String str2) {
        return e(context, new Account(str, "com.google"), str2);
    }

    public static Account[] l(Context context) {
        qnm.l("com.google");
        try {
            int i = qrr.c;
            qse.d(context, 8400000);
            if (Build.VERSION.SDK_INT >= 23) {
                qnm.b(context);
                ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
                if (acquireContentProviderClient == null) {
                    throw new RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
                }
                try {
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
                        d.c("RemoteException when fetching accounts", e);
                        throw e;
                    } catch (Exception e2) {
                        d.c("Exception when getting accounts", e2);
                        String valueOf = String.valueOf(e2.getMessage());
                        throw new RemoteException(valueOf.length() != 0 ? "Accounts ContentProvider failed: ".concat(valueOf) : new String("Accounts ContentProvider failed: "));
                    }
                } finally {
                    acquireContentProviderClient.release();
                }
            }
            return AccountManager.get(context).getAccountsByType("com.google");
        } catch (GooglePlayServicesIncorrectManifestValueException unused) {
            throw new qsc(18);
        }
    }

    public static Account[] m(Context context, final String[] strArr) {
        qnm.b(context);
        qnm.l("com.google");
        g(context, 8400000);
        vbt.g(context);
        if (axqx.b() && i(context)) {
            qie j = qfl.j(context);
            final GetAccountsRequest getAccountsRequest = new GetAccountsRequest("com.google", strArr);
            qvx b2 = qvy.b();
            b2.b = new Feature[]{qhq.c};
            b2.a = new qvo() { // from class: qil
                @Override // defpackage.qvo
                public final void a(Object obj, Object obj2) {
                    ((qii) ((qif) obj).D()).g(new qig((rvh) obj2, 2, (byte[]) null), GetAccountsRequest.this);
                }
            };
            b2.c = 1516;
            try {
                List list = (List) d(((qst) j).v(b2.a()), "Accounts retrieval");
                j(list);
                return (Account[]) list.toArray(new Account[0]);
            } catch (qsp e) {
                h(e, "Accounts retrieval");
            }
        }
        return (Account[]) c(context, c, new qhy() { // from class: qhu
            @Override // defpackage.qhy
            public final Object a(IBinder iBinder) {
                ose oseVar;
                Parcelable[] parcelableArray;
                String[] strArr2 = strArr;
                String[] strArr3 = qhz.a;
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
                Bundle bundle = new Bundle();
                bundle.putString("accountType", "com.google");
                bundle.putStringArray("account_features", strArr2);
                Parcel pv = oseVar.pv();
                dve.g(pv, bundle);
                Parcel pw = oseVar.pw(6, pv);
                Bundle bundle2 = (Bundle) dve.a(pw, Bundle.CREATOR);
                pw.recycle();
                if (bundle2 == null || (parcelableArray = bundle2.getParcelableArray("accounts")) == null) {
                    throw new IOException("Receive null result from service call.");
                }
                Account[] accountArr = new Account[parcelableArray.length];
                for (int i = 0; i < parcelableArray.length; i++) {
                    accountArr[i] = (Account) parcelableArray[i];
                }
                return accountArr;
            }
        });
    }

    private static void n(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (!TextUtils.isEmpty(account.name)) {
            String[] strArr = a;
            for (int i = 0; i < 3; i++) {
                if (strArr[i].equals(account.type)) {
                    return;
                }
            }
            throw new IllegalArgumentException("Account type not supported");
        }
        throw new IllegalArgumentException("Account name cannot be empty!");
    }
}
