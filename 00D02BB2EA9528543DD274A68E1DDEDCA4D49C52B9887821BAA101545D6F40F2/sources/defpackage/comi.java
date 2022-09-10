package defpackage;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
/* compiled from: PG */
/* renamed from: comi  reason: default package */
/* loaded from: classes5.dex */
final class comi extends comp {
    final /* synthetic */ LocationRequestInternal a;
    final /* synthetic */ LocationListener k;
    final /* synthetic */ Looper l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public comi(GoogleApiClient googleApiClient, LocationRequestInternal locationRequestInternal, LocationListener locationListener, Looper looper) {
        super(googleApiClient);
        this.a = locationRequestInternal;
        this.k = locationListener;
        this.l = looper;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(conr conrVar) {
        conr conrVar2 = conrVar;
        comq comqVar = new comq(this);
        LocationRequestInternal locationRequestInternal = this.a;
        cnsd<LocationListener> a = cnse.a(this.k, core.a(this.l), LocationListener.class.getSimpleName());
        synchronized (conrVar2.t) {
            conn connVar = conrVar2.t;
            connVar.f.a();
            conm a2 = connVar.a(a);
            if (a2 != null) {
                connVar.f.b().k(LocationRequestUpdateData.a(locationRequestInternal, a2, comqVar));
            }
        }
    }
}
