package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bzpp  reason: default package */
/* loaded from: classes4.dex */
public final class bzpp implements GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ bzpv a;

    public bzpp(bzpv bzpvVar) {
        this.a = bzpvVar;
    }

    @Override // defpackage.cnsi
    public final void Pi(ConnectionResult connectionResult) {
        int i = bzpv.f;
        bzpv.c(this.a.c);
        bzpv bzpvVar = this.a;
        bzpvVar.b(bzpvVar.b.b);
    }
}
