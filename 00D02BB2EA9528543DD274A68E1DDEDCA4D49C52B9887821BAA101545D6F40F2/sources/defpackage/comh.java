package defpackage;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
/* compiled from: PG */
/* renamed from: comh  reason: default package */
/* loaded from: classes5.dex */
final class comh extends comp {
    final /* synthetic */ LocationRequest a;
    final /* synthetic */ LocationListener k;
    final /* synthetic */ Looper l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public comh(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        super(googleApiClient);
        this.a = locationRequest;
        this.k = locationListener;
        this.l = looper;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(conr conrVar) {
        conrVar.V(this.a, cnse.a(this.k, core.a(this.l), LocationListener.class.getSimpleName()), new comq(this));
    }
}
