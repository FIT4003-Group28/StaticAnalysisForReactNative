package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crnt  reason: default package */
/* loaded from: classes5.dex */
public final class crnt implements GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ deig a;
    final /* synthetic */ crnz b;

    public crnt(crnz crnzVar, deig deigVar) {
        this.b = crnzVar;
        this.a = deigVar;
    }

    @Override // defpackage.cnsi
    public final void Pi(ConnectionResult connectionResult) {
        dcdc<bzqb> dcdcVar = crnz.a;
        this.b.hashCode();
        int i = connectionResult.c;
        this.a.j(false);
    }
}
