package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: copi  reason: default package */
/* loaded from: classes5.dex */
public final class copi extends cooo<copo> {
    final /* synthetic */ PendingIntent a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copi(Api api, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(api, googleApiClient);
        this.a = pendingIntent;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cnnq cnnqVar) {
        copo copoVar = (copo) cnnqVar;
        coop coopVar = new coop(this);
        ((copc) copoVar.L()).h(copoVar.a, this.a, coopVar);
    }
}
