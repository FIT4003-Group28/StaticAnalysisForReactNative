package defpackage;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwna  reason: default package */
/* loaded from: classes5.dex */
public final class cwna implements cwmx {
    public static final /* synthetic */ int a = 0;
    private final Context b;
    private final BroadcastReceiver c;
    private final OnAccountsUpdateListener d;

    static {
        cwjy.a();
    }

    public cwna(Context context, cwll cwllVar, OnAccountsUpdateListener onAccountsUpdateListener) {
        dbsk.s(context);
        this.b = context.getApplicationContext();
        this.d = onAccountsUpdateListener;
        this.c = new cwmz(this, cwllVar);
    }

    @Override // defpackage.cwmx
    public final void a() {
        this.b.registerReceiver(this.c, new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
    }

    @Override // defpackage.cwmx
    public final void b() {
        this.b.unregisterReceiver(this.c);
    }

    public final void c(Account[] accountArr) {
        this.d.onAccountsUpdated(accountArr);
    }
}
