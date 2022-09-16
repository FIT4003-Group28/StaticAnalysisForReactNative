package defpackage;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.AccountControllerImpl$AccountControllerLifecycleObserver;
import com.google.apps.tiktok.account.api.controller.ActivityAccountState;
/* compiled from: PG */
/* renamed from: alzs  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class alzs implements abw {
    public final /* synthetic */ AccountControllerImpl$AccountControllerLifecycleObserver a;
    private final /* synthetic */ int b;

    public /* synthetic */ alzs(AccountControllerImpl$AccountControllerLifecycleObserver accountControllerImpl$AccountControllerLifecycleObserver) {
        this.a = accountControllerImpl$AccountControllerLifecycleObserver;
    }

    public /* synthetic */ alzs(AccountControllerImpl$AccountControllerLifecycleObserver accountControllerImpl$AccountControllerLifecycleObserver, int i) {
        this.b = i;
        this.a = accountControllerImpl$AccountControllerLifecycleObserver;
    }

    @Override // defpackage.abw
    public final void a(Object obj) {
        Class cls;
        Throwable th = null;
        if (this.b == 0) {
            ActivityResult activityResult = (ActivityResult) obj;
            alzt alztVar = this.a.a;
            int i = activityResult.a;
            Intent intent = activityResult.b;
            if (i == -1) {
                alztVar.k(AccountId.b(intent.getIntExtra("new_account_id", -1)));
            } else {
                if (intent != null) {
                    if (intent.getBooleanExtra("restart_account_selector", false)) {
                        alztVar.f();
                        aqxo.z(alztVar.k.b, "Activity not configured for account selection.");
                        amlp l = amna.l("Switch Account Interactive");
                        try {
                            amuk amukVar = alztVar.k.c;
                            int i2 = ((amxx) amukVar).c - 1;
                            while (true) {
                                if (i2 < 0) {
                                    cls = null;
                                    break;
                                } else if (amap.class.isAssignableFrom((Class) amukVar.get(i2))) {
                                    cls = (Class) amukVar.get(i2);
                                    break;
                                } else {
                                    i2--;
                                }
                            }
                            aqxo.z(cls != null, "No interactive selector found.");
                            amuk r = amuk.r(cls);
                            r.getClass();
                            aqxo.y(true ^ r.isEmpty());
                            int i3 = ((amxx) r).c;
                            for (int i4 = 0; i4 < i3; i4++) {
                                Class cls2 = (Class) r.get(i4);
                                aqxo.u(amap.class.isAssignableFrom(cls2), "selector %s is not an interactive selector", cls2);
                            }
                            alztVar.i(null, alztVar.e.a(amaq.a(alztVar.b.a()), r));
                            l.close();
                            alztVar.g();
                        } catch (Throwable th2) {
                            try {
                                l.close();
                            } catch (Throwable unused) {
                            }
                            throw th2;
                        }
                    }
                }
                if (intent != null) {
                    th = (Throwable) intent.getSerializableExtra("account_error");
                }
                ActivityAccountState activityAccountState = alztVar.c;
                if (th == null) {
                    th = new amac();
                }
                activityAccountState.m(th);
                alztVar.g();
            }
            alztVar.j();
            return;
        }
        ActivityResult activityResult2 = (ActivityResult) obj;
        alzt alztVar2 = this.a.a;
        int i5 = activityResult2.a;
        Intent intent2 = activityResult2.b;
        if (i5 == -1) {
            alztVar2.k(AccountId.b(intent2.getIntExtra("new_account_id", -1)));
        } else {
            if (!alztVar2.c.j()) {
                if (intent2 != null) {
                    th = (Throwable) intent2.getSerializableExtra("account_error");
                }
                ActivityAccountState activityAccountState2 = alztVar2.c;
                if (th == null) {
                    th = new amac();
                }
                activityAccountState2.m(th);
            }
            alztVar2.g();
        }
        alztVar2.j();
    }
}
