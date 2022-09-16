package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: colu  reason: default package */
/* loaded from: classes5.dex */
public final class colu extends colv {
    final /* synthetic */ PendingIntent a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public colu(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.a = pendingIntent;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(conr conrVar) {
        conrVar.R(this.a);
        p(Status.a);
    }
}
