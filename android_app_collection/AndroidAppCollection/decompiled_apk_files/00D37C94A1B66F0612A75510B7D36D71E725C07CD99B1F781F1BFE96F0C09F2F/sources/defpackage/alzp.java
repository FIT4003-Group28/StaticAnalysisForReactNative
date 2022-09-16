package defpackage;

import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.AccountActionResult;
import com.google.apps.tiktok.account.api.controller.ActivityAccountState;
import com.google.apps.tiktok.account.api.controller.ValidationResult;
import com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: alzp  reason: default package */
/* loaded from: classes.dex */
class alzp implements amfi {
    final /* synthetic */ alzt a;

    public alzp(alzt alztVar) {
        this.a = alztVar;
    }

    @Override // defpackage.amfi
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        Throwable amaaVar;
        alzu alzuVar = (alzu) ((ProtoParsers$ParcelableProto) obj).a(alzu.a, this.a.i);
        if (!alzuVar.equals(this.a.l)) {
            return;
        }
        this.a.g();
        ActivityAccountState activityAccountState = this.a.c;
        boolean z = th instanceof alzx;
        if (z) {
            amaaVar = (alzx) th;
        } else {
            amaaVar = new amaa(th);
        }
        activityAccountState.m(amaaVar);
        if ((alzuVar.b & 2) != 0) {
            AccountId b = AccountId.b(alzuVar.d);
            if (!z) {
                ((amzw) ((amzw) ((amzw) alzt.a.f()).h(th)).i("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$1", "onFailure", 174, "AccountControllerImpl.java")).s("Failed to use %s.", b);
            } else {
                ((amzw) ((amzw) ((amzw) alzt.a.e()).h(th)).i("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$1", "onFailure", 171, "AccountControllerImpl.java")).s("Failed to use %s.", b);
            }
        }
        this.a.j();
    }

    @Override // defpackage.amfi
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        AccountId accountId;
        AccountActionResult accountActionResult = (AccountActionResult) obj2;
        alzu alzuVar = (alzu) ((ProtoParsers$ParcelableProto) obj).a(alzu.a, this.a.i);
        if (!alzuVar.equals(this.a.l)) {
            return;
        }
        boolean z = false;
        if ((alzuVar.b & 2) != 0) {
            aqxo.y(accountActionResult.a.a() == alzuVar.d);
            accountId = AccountId.b(alzuVar.d);
        } else if (accountActionResult.d != null) {
            if (!this.a.c.j()) {
                this.a.c.n();
            }
            Intent intent = accountActionResult.d;
            if (this.a.c.j()) {
                amad.a(intent, AccountId.b(this.a.c.g()));
            }
            this.a.b.c().b(intent);
            return;
        } else if (accountActionResult.c == null) {
            this.a.c.m(new amab());
            this.a.g();
            this.a.j();
            return;
        } else {
            accountId = accountActionResult.a;
        }
        ValidationResult validationResult = accountActionResult.c;
        validationResult.getClass();
        if (validationResult.c()) {
            ActivityAccountState activityAccountState = this.a.c;
            AccountId accountId2 = accountActionResult.a;
            ambp ambpVar = accountActionResult.b;
            if (activityAccountState.k(accountId2.a(), ambpVar, 2)) {
                activityAccountState.a.b(accountId2, ambpVar);
                amav amavVar = activityAccountState.a;
                aqxo.y(ambpVar != null);
                aqxo.y(!ambpVar.equals(ambp.a));
                if ((ambpVar.b & 256) != 0) {
                    z = true;
                }
                aqxo.y(z);
                amlp l = amna.l("onAccountReady");
                try {
                    String str = ambpVar.i;
                    amas amasVar = new amas(new amat(accountId2));
                    amzs it = ((amyg) amavVar.a).iterator();
                    while (it.hasNext()) {
                        ((amau) it.next()).a(amasVar);
                    }
                    Iterator it2 = amavVar.b.iterator();
                    while (it2.hasNext()) {
                        ((amau) it2.next()).a(amasVar);
                    }
                    l.close();
                    activityAccountState.i();
                    activityAccountState.a.a(accountId2, ambpVar);
                } catch (Throwable th) {
                    try {
                        l.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
            this.a.g();
        } else {
            if (validationResult.b()) {
                this.a.c.n();
            }
            Intent a = validationResult.a();
            amad.a(a, accountId);
            a.putExtra("$tiktok$for_requirement_activity", true);
            a.putExtra("$tiktok$canRestartAccountSelector", this.a.k.b);
            a.addFlags(65536);
            this.a.b.b().b(a);
        }
        this.a.j();
    }
}
