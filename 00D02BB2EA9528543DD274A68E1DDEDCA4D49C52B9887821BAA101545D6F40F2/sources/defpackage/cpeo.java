package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpeo  reason: default package */
/* loaded from: classes5.dex */
public abstract class cpeo extends cpep<cpdr> {
    protected final cpen k;

    public cpeo(GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.k = new cpen(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return new cpem(status);
    }
}
