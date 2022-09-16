package defpackage;

import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.util.Log;
/* compiled from: PG */
/* renamed from: uqu  reason: default package */
/* loaded from: classes4.dex */
final class uqu implements uqq {
    private boolean a = false;
    private final OnAccountsUpdateListener b;
    private final AccountManager c;

    public uqu(Context context, upx upxVar, OnAccountsUpdateListener onAccountsUpdateListener) {
        this.b = onAccountsUpdateListener;
        this.c = AccountManager.get(context.getApplicationContext());
        if (ake.c(context, "android.permission.GET_ACCOUNTS") != 0) {
            upz upzVar = (upz) upxVar;
            amnt.g(amnt.d(new upy(upzVar, 2), upzVar.c), new sle(3), anjk.a);
        }
    }

    @Override // defpackage.uqq
    public final void a() {
        synchronized (this) {
            if (!this.a) {
                this.c.addOnAccountsUpdatedListener(this.b, null, false, new String[]{"com.google"});
                this.a = true;
            }
        }
    }

    @Override // defpackage.uqq
    public final void b() {
        synchronized (this) {
            if (this.a) {
                try {
                    this.c.removeOnAccountsUpdatedListener(this.b);
                } catch (IllegalArgumentException e) {
                    Log.w("OneGoogle", "Failed to remove an OnAccountsUpdatedListener", e);
                }
                this.a = false;
            }
        }
    }
}
