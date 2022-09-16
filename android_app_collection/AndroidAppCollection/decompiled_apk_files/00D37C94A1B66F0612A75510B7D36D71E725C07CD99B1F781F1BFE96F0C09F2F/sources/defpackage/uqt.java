package defpackage;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
/* compiled from: PG */
/* renamed from: uqt  reason: default package */
/* loaded from: classes4.dex */
final class uqt implements uqq {
    private final Context a;
    private final BroadcastReceiver b;
    private final OnAccountsUpdateListener c;

    public uqt(Context context, upx upxVar, OnAccountsUpdateListener onAccountsUpdateListener) {
        this.a = context.getApplicationContext();
        this.c = onAccountsUpdateListener;
        this.b = new uqs(this, upxVar);
    }

    @Override // defpackage.uqq
    public final void a() {
        this.a.registerReceiver(this.b, new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
    }

    @Override // defpackage.uqq
    public final void b() {
        this.a.unregisterReceiver(this.b);
    }

    public final void c(Account[] accountArr) {
        this.c.onAccountsUpdated(accountArr);
    }
}
