package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.reporting.OptInRequest;
/* compiled from: PG */
/* renamed from: coqv  reason: default package */
/* loaded from: classes5.dex */
public final class coqv extends coqj<Status> {
    final /* synthetic */ OptInRequest a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coqv(GoogleApiClient googleApiClient, OptInRequest optInRequest) {
        super(googleApiClient);
        this.a = optInRequest;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(coqt coqtVar) {
        coqt coqtVar2 = coqtVar;
        OptInRequest optInRequest = this.a;
        coqtVar2.K();
        p(new Status(corc.a(coqd.a(((coqr) coqtVar2.L()).f(optInRequest)))));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return status;
    }
}
