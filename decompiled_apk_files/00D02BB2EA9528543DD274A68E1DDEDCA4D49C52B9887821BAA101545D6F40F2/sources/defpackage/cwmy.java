package defpackage;

import android.accounts.Account;
import java.util.List;
/* compiled from: PG */
/* renamed from: cwmy  reason: default package */
/* loaded from: classes5.dex */
final class cwmy implements degu<List<Account>> {
    final /* synthetic */ cwmz a;

    public cwmy(cwmz cwmzVar) {
        this.a = cwmzVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        int i = cwna.a;
        this.a.b.c(new Account[0]);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(List<Account> list) {
        this.a.b.c((Account[]) list.toArray(new Account[0]));
    }
}
