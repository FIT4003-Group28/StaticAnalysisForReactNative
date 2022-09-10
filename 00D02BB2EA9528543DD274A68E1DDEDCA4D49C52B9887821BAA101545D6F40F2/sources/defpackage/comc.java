package defpackage;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: comc  reason: default package */
/* loaded from: classes5.dex */
final class comc extends comp {
    final /* synthetic */ Location a;
    final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public comc(GoogleApiClient googleApiClient, Location location, int i) {
        super(googleApiClient);
        this.a = location;
        this.k = i;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(conr conrVar) {
        Location location = this.a;
        int i = this.k;
        conn connVar = conrVar.t;
        connVar.f.a();
        connVar.f.b().n(location, i);
        p(Status.a);
    }
}
