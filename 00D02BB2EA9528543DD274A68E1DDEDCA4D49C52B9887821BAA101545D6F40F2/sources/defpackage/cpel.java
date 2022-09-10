package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpel  reason: default package */
/* loaded from: classes5.dex */
public abstract class cpel extends cpep<cpdp> {
    protected final cpek k;

    public cpel(GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.k = new cpek(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return new cpej(status);
    }
}
