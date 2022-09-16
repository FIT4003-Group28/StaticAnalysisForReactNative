package defpackage;

import com.google.apps.tiktok.account.AccountId;
/* compiled from: PG */
/* renamed from: amgy  reason: default package */
/* loaded from: classes.dex */
public final class amgy {
    public final amhc a;
    public final amhu b;

    public amgy(amhc amhcVar, ampq ampqVar, amhu amhuVar) {
        this.a = amhcVar;
        if (ampqVar.h()) {
            aqxo.y(ampqVar.c() instanceof abp);
        }
        this.b = amhuVar;
    }

    public final amgx a(AccountId accountId) {
        ai aiVar = new ai(this.b, new amgw(this, accountId));
        String valueOf = String.valueOf(accountId == null ? "null" : Integer.valueOf(accountId.a()));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("tt_activity_account_retained:");
        sb.append(valueOf);
        return (amgx) aiVar.b(sb.toString(), amgx.class);
    }

    public final Object b(AccountId accountId) {
        Object obj;
        amgx a = a(accountId);
        synchronized (a.f) {
            if (a.g == null) {
                dwn b = ((amgv) awwc.u(a.d.a(a.e), amgv.class)).b();
                x xVar = a.a;
                a.g = new eak(b.a, b.b);
            }
            obj = a.g;
        }
        return obj;
    }
}
