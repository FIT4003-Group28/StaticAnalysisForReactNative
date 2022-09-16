package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cmtt  reason: default package */
/* loaded from: classes5.dex */
public final class cmtt extends cmtu<Status> {
    public cmtt(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cmtp cmtpVar) {
        cmtp cmtpVar2 = cmtpVar;
        ((cmud) cmtpVar2.L()).f(new cmts(this), cmtpVar2.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return status;
    }
}
