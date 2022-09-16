package defpackage;

import android.accounts.AccountManager;
import android.content.Context;
/* compiled from: PG */
/* renamed from: amgc  reason: default package */
/* loaded from: classes.dex */
public final class amgc implements axou {
    private final azqb a;

    public amgc(azqb azqbVar) {
        this.a = azqbVar;
    }

    public static AccountManager b(Context context) {
        AccountManager accountManager = (AccountManager) context.getSystemService("account");
        axzl.o(accountManager);
        return accountManager;
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final AccountManager get() {
        return b((Context) ((axov) this.a).a);
    }
}
