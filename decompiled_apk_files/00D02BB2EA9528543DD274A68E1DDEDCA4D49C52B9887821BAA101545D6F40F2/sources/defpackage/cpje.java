package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cpje  reason: default package */
/* loaded from: classes5.dex */
public final class cpje extends cphn<cpjg> {
    public cpje(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cpjw cpjwVar) {
        ((cpiy) cpjwVar.L()).f(new cpjs(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return new cpjg(status, new ArrayList());
    }
}
