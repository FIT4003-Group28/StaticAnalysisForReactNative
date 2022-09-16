package defpackage;

import android.accounts.Account;
import android.util.Log;
import java.util.List;
/* compiled from: PG */
/* renamed from: uqr  reason: default package */
/* loaded from: classes4.dex */
final class uqr implements ankb {
    final /* synthetic */ uqs a;

    public uqr(uqs uqsVar) {
        this.a = uqsVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        Log.e("OneGoogle", "Failed to load accounts", th);
        this.a.b.c(new Account[0]);
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.b.c((Account[]) ((List) obj).toArray(new Account[0]));
    }
}
