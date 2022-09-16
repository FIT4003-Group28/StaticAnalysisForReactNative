package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import defpackage.cnnz;
/* compiled from: PG */
/* renamed from: coon  reason: default package */
/* loaded from: classes5.dex */
public abstract class coon<A extends cnnz> extends coom<cood, A> {
    public coon(Api api, GoogleApiClient googleApiClient) {
        super(api, googleApiClient);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return new cood(DataHolder.h(status.g));
    }
}
