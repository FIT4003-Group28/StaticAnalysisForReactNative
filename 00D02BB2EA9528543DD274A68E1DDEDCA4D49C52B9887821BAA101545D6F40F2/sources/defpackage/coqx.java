package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: coqx  reason: default package */
/* loaded from: classes5.dex */
public final class coqx extends coqj<Status> {
    final /* synthetic */ long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coqx(GoogleApiClient googleApiClient, long j) {
        super(googleApiClient);
        this.a = j;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(coqt coqtVar) {
        coqt coqtVar2 = coqtVar;
        long j = this.a;
        coqtVar2.K();
        p(new Status(corc.b(((coqr) coqtVar2.L()).h(j))));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return status;
    }
}
