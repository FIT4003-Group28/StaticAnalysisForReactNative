package defpackage;

import android.util.SparseArray;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import com.google.android.gms.tapandpay.internal.firstparty.GetAllCardsRequest;
/* compiled from: PG */
/* renamed from: cpbh  reason: default package */
/* loaded from: classes5.dex */
final class cpbh extends cozt<cpbi> {
    public cpbh(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cpbg cpbgVar) {
        cpbj cpbjVar = new cpbj(this);
        ((cpbb) cpbgVar.L()).e(new GetAllCardsRequest(true, null), cpbjVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return new cpbi(status, new GetAllCardsResponse(null, null, null, null, new SparseArray(0)));
    }
}
