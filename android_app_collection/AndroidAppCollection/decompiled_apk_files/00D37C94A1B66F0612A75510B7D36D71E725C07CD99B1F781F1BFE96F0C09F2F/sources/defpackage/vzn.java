package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.common.Feature;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: vzn  reason: default package */
/* loaded from: classes4.dex */
public final class vzn extends vzm {
    private final whp a;
    private final ConcurrentHashMap b;
    private final ynz c;

    public vzn(vzw vzwVar, Context context, ynz ynzVar, whp whpVar) {
        super(vzwVar, context);
        this.b = new ConcurrentHashMap();
        this.c = ynzVar;
        this.a = whpVar;
    }

    private final synchronized void k(String str) {
        try {
            try {
                Context context = this.c.a;
                qnm.i("Calling this from your main thread can lead to deadlock");
                qhz.g(context, 8400000);
                Bundle bundle = new Bundle();
                String str2 = context.getApplicationInfo().packageName;
                bundle.putString("clientPackageName", str2);
                if (!bundle.containsKey(qhz.b)) {
                    bundle.putString(qhz.b, str2);
                }
                vbt.g(context);
                if (axqx.c() && qhz.i(context)) {
                    qie j = qfl.j(context);
                    final ClearTokenRequest clearTokenRequest = new ClearTokenRequest();
                    clearTokenRequest.b = str;
                    qvx b = qvy.b();
                    b.b = new Feature[]{qhq.b};
                    b.a = new qvo() { // from class: qin
                        @Override // defpackage.qvo
                        public final void a(Object obj, Object obj2) {
                            ((qii) ((qif) obj).D()).a(new qip((rvh) obj2), ClearTokenRequest.this);
                        }
                    };
                    b.c = 1513;
                    try {
                        qhz.d(((qst) j).v(b.a()), "clear token");
                        return;
                    } catch (qsp e) {
                        qhz.h(e, "clear token");
                    }
                }
                qhz.c(context, qhz.c, new qhv(str, bundle));
            } catch (qhr e2) {
                zep.d("AuthTokenProvider: clearToken GoogleAuthException", e2);
            }
        } catch (IOException e3) {
            zep.d("AuthTokenProvider: clearToken IOException", e3);
        }
    }

    private static final String l(String str, String str2) {
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(str2 == null ? "" : str2.length() != 0 ? "-".concat(str2) : new String("-"));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private static final String m(AccountIdentity accountIdentity) {
        return l(accountIdentity.a(), (accountIdentity.h() || accountIdentity.l() == 3) ? accountIdentity.d() : null);
    }

    @Override // defpackage.vzm, defpackage.afvx
    /* renamed from: d */
    public final afvv a(AccountIdentity accountIdentity) {
        String m = m(accountIdentity);
        String str = (String) this.b.get(m);
        if (str == null) {
            synchronized (this) {
                String str2 = (String) this.b.get(m);
                if (str2 != null) {
                    return afvv.c(str2);
                }
                return f(new Account(accountIdentity.a(), "com.google"), c(accountIdentity));
            }
        }
        return afvv.c(str);
    }

    @Override // defpackage.vzm
    protected final String g(Account account, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("handle_notification", true);
        String l = l(account.name, bundle.getString("delegatee_user_id"));
        ynz ynzVar = this.c;
        String str = qhz.b(ynzVar.a, account, this.a.f, bundle).b;
        this.b.put(l, str);
        return str;
    }

    @Override // defpackage.vzm, defpackage.afvx
    /* renamed from: h */
    public final synchronized void b(AccountIdentity accountIdentity) {
        String m = m(accountIdentity);
        if (this.b.containsKey(m)) {
            k((String) this.b.get(m));
            this.b.remove(m);
        }
    }

    @Override // defpackage.vzm
    public final synchronized void i(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.b.remove(m((AccountIdentity) it.next()));
        }
    }
}
