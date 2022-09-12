package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import defpackage.cnom;
/* compiled from: PG */
/* renamed from: cmqm  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmqm<T extends cnom> extends cmql<Status> {
    public cmqm(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return status;
    }
}
