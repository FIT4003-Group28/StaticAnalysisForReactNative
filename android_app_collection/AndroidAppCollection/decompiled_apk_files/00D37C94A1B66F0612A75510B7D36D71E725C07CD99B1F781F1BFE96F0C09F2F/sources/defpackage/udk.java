package defpackage;

import android.content.Intent;
import java.util.Set;
/* compiled from: PG */
/* renamed from: udk  reason: default package */
/* loaded from: classes4.dex */
public final class udk implements udj {
    private final ucs a;
    private final uen b;
    private final uib c;
    private final uiy d;
    private final ues e;

    public udk(ucs ucsVar, uen uenVar, uib uibVar, uiy uiyVar, ues uesVar) {
        this.a = ucsVar;
        this.b = uenVar;
        this.c = uibVar;
        this.d = uiyVar;
        this.e = uesVar;
    }

    @Override // defpackage.udj
    public final /* synthetic */ int a(Intent intent) {
        return 10;
    }

    @Override // defpackage.udj
    public final void b(Intent intent, ubz ubzVar, long j) {
        uev.e("AccountChangedIntentHandler", "Account changed event received.", new Object[0]);
        this.e.b(aojs.LOGIN_ACCOUNTS_CHANGED).i();
        try {
            Set a = this.c.a();
            for (ucp ucpVar : this.a.c()) {
                if (!a.contains(ucpVar.b)) {
                    this.b.a(ucpVar, true);
                }
            }
        } catch (uia e) {
            this.e.c(37).i();
            uev.c("AccountChangedIntentHandler", e, "Account cleanup skipped due to error getting device accounts", new Object[0]);
        }
        if (!axqh.a.get().b()) {
            this.d.a(aomi.ACCOUNT_CHANGED);
        }
    }

    @Override // defpackage.udj
    public final boolean c(Intent intent) {
        return "android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(intent.getAction());
    }
}
