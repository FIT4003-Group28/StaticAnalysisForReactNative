package defpackage;

import android.accounts.Account;
import java.util.List;
/* compiled from: PG */
/* renamed from: uqz  reason: default package */
/* loaded from: classes4.dex */
final class uqz implements ankb {
    final /* synthetic */ ura a;

    public uqz(ura uraVar) {
        this.a = uraVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        for (Account account : (List) obj) {
            this.a.h(account);
        }
    }
}
