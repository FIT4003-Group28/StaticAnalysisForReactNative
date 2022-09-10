package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: cnqs  reason: default package */
/* loaded from: classes5.dex */
final class cnqs implements GoogleApiClient.ConnectionCallbacks {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ cnsx b;
    final /* synthetic */ cnqx c;

    public cnqs(cnqx cnqxVar, AtomicReference atomicReference, cnsx cnsxVar) {
        this.c = cnqxVar;
        this.a = atomicReference;
        this.b = cnsxVar;
    }

    @Override // defpackage.cnpv
    public final void Ph(Bundle bundle) {
        cnqx cnqxVar = this.c;
        GoogleApiClient googleApiClient = (GoogleApiClient) this.a.get();
        cnwc.a(googleApiClient);
        cnqxVar.d(googleApiClient, this.b, true);
    }

    @Override // defpackage.cnpv
    public final void Pj(int i) {
    }
}
