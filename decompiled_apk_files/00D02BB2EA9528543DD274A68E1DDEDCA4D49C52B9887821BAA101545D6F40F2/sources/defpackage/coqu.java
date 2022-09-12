package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: coqu  reason: default package */
/* loaded from: classes5.dex */
final class coqu extends coqj<cora> {
    final /* synthetic */ Account a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coqu(GoogleApiClient googleApiClient, Account account) {
        super(googleApiClient);
        this.a = account;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(coqt coqtVar) {
        coqt coqtVar2 = coqtVar;
        Account account = this.a;
        coqtVar2.K();
        p(new cora(Status.a, ((coqr) coqtVar2.L()).e(account)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return new cora(status, null);
    }
}
