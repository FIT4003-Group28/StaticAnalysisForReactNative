package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.UdcCacheRequest;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpef  reason: default package */
/* loaded from: classes5.dex */
public final class cpef extends cpep<cper> {
    final /* synthetic */ UdcCacheRequest a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpef(GoogleApiClient googleApiClient, UdcCacheRequest udcCacheRequest) {
        super(googleApiClient);
        this.a = udcCacheRequest;
    }

    @Override // defpackage.cpep
    protected final void a(Context context, cpeb cpebVar) {
        cpebVar.g(new cpee(this), this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return new cper(status, null);
    }
}
