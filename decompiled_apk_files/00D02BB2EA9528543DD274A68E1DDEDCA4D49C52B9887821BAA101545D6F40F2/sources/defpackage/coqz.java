package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.reporting.SendDataRequest;
/* compiled from: PG */
/* renamed from: coqz  reason: default package */
/* loaded from: classes5.dex */
public final class coqz extends coqj<Status> {
    final /* synthetic */ Account a;
    final /* synthetic */ SendDataRequest k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coqz(GoogleApiClient googleApiClient, Account account, SendDataRequest sendDataRequest) {
        super(googleApiClient);
        this.a = account;
        this.k = sendDataRequest;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(coqt coqtVar) {
        coqt coqtVar2 = coqtVar;
        Account account = this.a;
        SendDataRequest sendDataRequest = this.k;
        coqtVar2.K();
        p(new Status(((coqr) coqtVar2.L()).j(account, sendDataRequest)));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return status;
    }
}
