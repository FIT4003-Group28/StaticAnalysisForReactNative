package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;
/* compiled from: PG */
/* renamed from: coqw  reason: default package */
/* loaded from: classes5.dex */
final class coqw extends coqj<corb> {
    final /* synthetic */ UploadRequest a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coqw(GoogleApiClient googleApiClient, UploadRequest uploadRequest) {
        super(googleApiClient);
        this.a = uploadRequest;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(coqt coqtVar) {
        coqt coqtVar2 = coqtVar;
        UploadRequest uploadRequest = this.a;
        coqtVar2.K();
        if (uploadRequest.a != null) {
            UploadRequestResult g = ((coqr) coqtVar2.L()).g(uploadRequest);
            p(new corb(new Status(corc.b(g.a)), g.b));
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return new corb(status, -1L);
    }
}
