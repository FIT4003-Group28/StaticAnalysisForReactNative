package defpackage;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
/* compiled from: PG */
/* renamed from: cnsx  reason: default package */
/* loaded from: classes5.dex */
public final class cnsx extends BasePendingResult<Status> {
    @Deprecated
    public cnsx(Looper looper) {
        super(looper);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Status d(Status status) {
        return status;
    }

    public cnsx(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }
}
