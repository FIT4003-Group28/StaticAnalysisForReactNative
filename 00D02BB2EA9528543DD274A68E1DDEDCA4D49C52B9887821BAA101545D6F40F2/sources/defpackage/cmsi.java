package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmsi  reason: default package */
/* loaded from: classes5.dex */
final class cmsi extends cmrv {
    final /* synthetic */ cpct a;

    public cmsi(cpct cpctVar) {
        this.a = cpctVar;
    }

    @Override // defpackage.cmrw
    public final void b(Status status, List<Account> list) {
        cntf.c(status, list, this.a);
    }
}
