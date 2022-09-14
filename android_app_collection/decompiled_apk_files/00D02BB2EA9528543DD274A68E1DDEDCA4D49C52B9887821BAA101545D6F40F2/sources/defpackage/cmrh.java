package defpackage;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.Feature;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: cmrh  reason: default package */
/* loaded from: classes.dex */
public class cmrh {
    public static final String b = "androidPackageName";
    public static final String[] a = {"com.google", "com.google.work", "cn.google"};
    public static final ComponentName c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    static {
        cmqw.a("GoogleAuthUtil");
    }

    public static String f(Context context, Account account, String str) {
        return g(context, account, str, new Bundle());
    }

    public static String g(Context context, Account account, String str, Bundle bundle) {
        a(account);
        return h(context, account, str, bundle).b;
    }

    public static TokenData h(Context context, final Account account, final String str, Bundle bundle) {
        cnwc.i("Calling this from your main thread can lead to deadlock");
        cnwc.m(str, "Scope cannot be empty or null.");
        a(account);
        m(context, 8400000);
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        String str3 = b;
        if (TextUtils.isEmpty(bundle2.getString(str3))) {
            bundle2.putString(str3, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        cxju.c(context);
        if (dxyq.b() && i(context)) {
            cmrq a2 = cmrr.a(context);
            cnwc.n(account, "Account name cannot be null!");
            cnwc.m(str, "Scope cannot be null!");
            cntc builder = cntd.builder();
            builder.b = new Feature[]{cmqy.a};
            builder.a = new cnsr(account, str, bundle2) { // from class: cmsa
                private final Account a;
                private final String b;
                private final Bundle c;

                {
                    this.a = account;
                    this.b = str;
                    this.c = bundle2;
                }

                @Override // defpackage.cnsr
                public final void a(Object obj, Object obj2) {
                    ((cmrz) ((cmrs) obj).L()).e(new cmsf((cpct) obj2), this.a, this.b, this.c);
                }
            };
            builder.c = 1512;
            try {
                Bundle bundle3 = (Bundle) k(((cnof) a2).d(builder.a()), "token retrieval");
                o(bundle3);
                return j(bundle3);
            } catch (cnob unused) {
            }
        }
        return (TokenData) n(context, c, new cmrc(account, str, bundle2));
    }

    public static boolean i(Context context) {
        if (cnmq.a.j(context, 17895000) != 0) {
            return false;
        }
        String str = context.getApplicationInfo().packageName;
        for (String str2 : dxyq.a.a().a().a) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static TokenData j(Bundle bundle) {
        TokenData tokenData;
        bundle.setClassLoader(TokenData.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            bundle2.setClassLoader(TokenData.class.getClassLoader());
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        cmuj a2 = cmuj.a(string);
        if (!cmuj.b(a2)) {
            if (cmuj.NETWORK_ERROR.equals(a2) || cmuj.SERVICE_UNAVAILABLE.equals(a2) || cmuj.INTNERNAL_ERROR.equals(a2) || cmuj.AUTH_SECURITY_ERROR.equals(a2)) {
                throw new IOException(string);
            }
            throw new cmra(string);
        }
        String valueOf = String.valueOf(a2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("isUserRecoverableError status: ");
        sb.append(valueOf);
        sb.toString();
        throw new UserRecoverableAuthException(string, intent);
    }

    public static <ResultT> ResultT k(cpcq<ResultT> cpcqVar, String str) {
        try {
            return (ResultT) cpda.d(cpcqVar);
        } catch (InterruptedException e) {
            throw new IOException(String.format("Interrupted while waiting for the task of %s to finish.", str), e);
        } catch (CancellationException e2) {
            throw new IOException(String.format("Canceled while waiting for the task of %s to finish.", str), e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof cnob) {
                throw ((cnob) cause);
            }
            throw new IOException(String.format("Unable to get a result for %s due to ExecutionException.", str), e3);
        }
    }

    public static String l(Context context, String str) {
        cnwc.m(str, "accountName must be provided");
        cnwc.i("Calling this from your main thread can lead to deadlock");
        m(context, 8400000);
        return g(context, new Account(str, "com.google"), "^^_account_id_^^", new Bundle());
    }

    public static void m(Context context, int i) {
        try {
            cnnl.d(context.getApplicationContext(), i);
        } catch (cnni e) {
            throw new cmra(e.getMessage());
        } catch (cnnj e2) {
            throw new cmrj(e2.a, e2.getMessage(), new Intent(e2.b));
        }
    }

    public static <T> T n(Context context, ComponentName componentName, cmrg<T> cmrgVar) {
        cnml cnmlVar = new cnml();
        cnva a2 = cnva.a(context);
        try {
            try {
                if (a2.b(new cnuz(componentName), cnmlVar, "GoogleAuthUtil")) {
                    try {
                        cnwc.i("BlockingServiceConnection.getService() called on main thread");
                        if (!cnmlVar.a) {
                            cnmlVar.a = true;
                            return cmrgVar.a(cnmlVar.b.take());
                        }
                        throw new IllegalStateException("Cannot call get on this connection more than once");
                    } catch (RemoteException | InterruptedException e) {
                        throw new IOException("Error on service connection.", e);
                    }
                }
                throw new IOException("Could not bind to service.");
            } finally {
                a2.c(componentName, cnmlVar);
            }
        } catch (SecurityException e2) {
            e2.getMessage();
            throw new IOException("SecurityException while binding to Auth service.", e2);
        }
    }

    public static <T> void o(T t) {
        if (t != null) {
            return;
        }
        throw new IOException("Service unavailable.");
    }

    private static void a(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (!TextUtils.isEmpty(account.name)) {
            String[] strArr = a;
            int length = strArr.length;
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
