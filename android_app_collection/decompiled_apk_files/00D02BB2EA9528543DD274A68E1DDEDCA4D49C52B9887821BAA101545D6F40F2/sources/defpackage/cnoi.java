package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.cnom;
/* compiled from: PG */
/* renamed from: cnoi  reason: default package */
/* loaded from: classes5.dex */
public final class cnoi<R extends cnom> extends BasePendingResult<R> {
    private final R a;

    public cnoi(R r) {
        super((GoogleApiClient) null);
        this.a = r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R d(Status status) {
        return this.a;
    }
}
