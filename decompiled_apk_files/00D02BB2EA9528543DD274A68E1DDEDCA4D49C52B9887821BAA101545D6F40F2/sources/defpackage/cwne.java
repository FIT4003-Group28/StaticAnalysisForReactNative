package defpackage;

import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.Feature;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cwne  reason: default package */
/* loaded from: classes5.dex */
final class cwne implements cwmx {
    public static final /* synthetic */ int a = 0;
    private boolean b = false;
    private final OnAccountsUpdateListener c;
    private final AccountManager d;

    static {
        cwjy.a();
    }

    public cwne(Context context, cwll cwllVar, OnAccountsUpdateListener onAccountsUpdateListener) {
        this.c = onAccountsUpdateListener;
        this.d = AccountManager.get(context.getApplicationContext());
        if (akm.d(context, "android.permission.GET_ACCOUNTS") != 0) {
            final cwlp cwlpVar = (cwlp) cwllVar;
            dbae.c(dbae.e(new Callable(cwlpVar) { // from class: cwlo
                private final cwlp a;

                {
                    this.a = cwlpVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = this.a.b;
                    cnwc.a(context2);
                    cmrh.m(context2, 11400000);
                    String str = context2.getApplicationInfo().packageName;
                    cxju.c(context2);
                    if (dxyq.b() && cmrh.i(context2)) {
                        cmrq a2 = cmrr.a(context2);
                        cnwc.n(str, "Client package name cannot be null!");
                        cntc builder = cntd.builder();
                        builder.b = new Feature[]{cmqy.b};
                        builder.a = new cnsr(str) { // from class: cmsc
                            private final String a;

                            {
                                this.a = str;
                            }

                            @Override // defpackage.cnsr
                            public final void a(Object obj, Object obj2) {
                                ((cmrz) ((cmrs) obj).L()).g(new cmsh((cpct) obj2), this.a);
                            }
                        };
                        builder.c = 1514;
                        try {
                            Bundle bundle = (Bundle) cmrh.k(((cnof) a2).d(builder.a()), "google accounts access request");
                            String string = bundle.getString("Error");
                            Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
                            cmuj a3 = cmuj.a(string);
                            if (cmuj.SUCCESS.equals(a3)) {
                                return true;
                            }
                            if (cmuj.b(a3)) {
                                String valueOf = String.valueOf(a3);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                                sb.append("isUserRecoverableError status: ");
                                sb.append(valueOf);
                                sb.toString();
                                throw new UserRecoverableAuthException(string, intent);
                            }
                            throw new cmra(string);
                        } catch (cnob unused) {
                        }
                    }
                    return (Boolean) cmrh.n(context2, cmrh.c, new cmrf(str));
                }
            }, cwlpVar.c), new cwnd(), dege.a);
        }
    }

    @Override // defpackage.cwmx
    public final void a() {
        synchronized (this) {
            if (!this.b) {
                this.d.addOnAccountsUpdatedListener(this.c, null, false, new String[]{"com.google"});
                this.b = true;
            }
        }
    }

    @Override // defpackage.cwmx
    public final void b() {
        synchronized (this) {
            if (this.b) {
                try {
                    this.d.removeOnAccountsUpdatedListener(this.c);
                } catch (IllegalArgumentException unused) {
                }
                this.b = false;
            }
        }
    }
}
