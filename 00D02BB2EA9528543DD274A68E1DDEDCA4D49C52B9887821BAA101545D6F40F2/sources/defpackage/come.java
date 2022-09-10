package defpackage;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: come  reason: default package */
/* loaded from: classes5.dex */
final class come extends comp {
    final /* synthetic */ Location a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public come(GoogleApiClient googleApiClient, Location location) {
        super(googleApiClient);
        this.a = location;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(conr conrVar) {
        Location location = this.a;
        conn connVar = conrVar.t;
        connVar.f.a();
        connVar.f.b().m(location);
        p(Status.a);
    }
}
