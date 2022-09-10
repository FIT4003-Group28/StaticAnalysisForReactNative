package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
/* compiled from: PG */
/* renamed from: comn  reason: default package */
/* loaded from: classes5.dex */
final class comn extends comp {
    final /* synthetic */ LocationListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public comn(GoogleApiClient googleApiClient, LocationListener locationListener) {
        super(googleApiClient);
        this.a = locationListener;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(conr conrVar) {
        cnsb b = cnse.b(this.a, LocationListener.class.getSimpleName());
        comq comqVar = new comq(this);
        conn connVar = conrVar.t;
        connVar.f.a();
        synchronized (connVar.c) {
            conm remove = connVar.c.remove(b);
            if (remove != null) {
                remove.b();
                connVar.f.b().k(LocationRequestUpdateData.b(remove, comqVar));
            }
        }
    }
}
