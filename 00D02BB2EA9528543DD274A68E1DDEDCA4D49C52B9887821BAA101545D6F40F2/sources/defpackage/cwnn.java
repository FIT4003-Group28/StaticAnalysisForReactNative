package defpackage;

import android.accounts.Account;
import java.util.List;
/* compiled from: PG */
/* renamed from: cwnn  reason: default package */
/* loaded from: classes5.dex */
final class cwnn implements degu<List<Account>> {
    final /* synthetic */ cwno a;

    public cwnn(cwno cwnoVar) {
        this.a = cwnoVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(List<Account> list) {
        for (Account account : list) {
            this.a.h(account);
        }
    }
}
