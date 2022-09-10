package defpackage;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
/* compiled from: PG */
/* renamed from: comk  reason: default package */
/* loaded from: classes5.dex */
final class comk extends comp {
    final /* synthetic */ LocationRequest a;
    final /* synthetic */ cola k;
    final /* synthetic */ Looper l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public comk(GoogleApiClient googleApiClient, LocationRequest locationRequest, cola colaVar, Looper looper) {
        super(googleApiClient);
        this.a = locationRequest;
        this.k = colaVar;
        this.l = looper;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(conr conrVar) {
        conrVar.U(LocationRequestInternal.a(this.a), cnse.a(this.k, core.a(this.l), cola.class.getSimpleName()), new comq(this));
    }
}
