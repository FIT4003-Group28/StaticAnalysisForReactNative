package defpackage;

import android.accounts.Account;
import android.content.Context;
/* compiled from: PG */
/* renamed from: cxgi  reason: default package */
/* loaded from: classes5.dex */
public final class cxgi {
    private final cnjz a;

    public cxgi(Context context) {
        this.a = a(context, "FPOP_CLIENT", null);
    }

    protected static final cnjz a(Context context, String str, String str2) {
        return new cnjz(context, "FPOP_CLIENT", str2);
    }

    public final void b(int i, dsmd dsmdVar) {
        cnjv d = this.a.d(dsmdVar.bS());
        d.d(i - 1);
        d.a();
    }

    public cxgi(Context context, Account account) {
        this.a = a(context, "FPOP_CLIENT", account.name);
    }
}
