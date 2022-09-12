package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
/* compiled from: PG */
/* renamed from: comg  reason: default package */
/* loaded from: classes5.dex */
final class comg extends comp {
    final /* synthetic */ LocationRequest a;
    final /* synthetic */ LocationListener k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public comg(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        super(googleApiClient);
        this.a = locationRequest;
        this.k = locationListener;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(conr conrVar) {
        conrVar.V(this.a, cnse.a(this.k, core.b(), LocationListener.class.getSimpleName()), new comq(this));
    }
}
