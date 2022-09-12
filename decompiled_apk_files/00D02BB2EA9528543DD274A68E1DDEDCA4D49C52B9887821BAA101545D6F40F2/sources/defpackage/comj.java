package defpackage;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.internal.LocationRequestInternal;
/* compiled from: PG */
/* renamed from: comj  reason: default package */
/* loaded from: classes5.dex */
final class comj extends comp {
    final /* synthetic */ LocationRequestInternal a;
    final /* synthetic */ cola k;
    final /* synthetic */ Looper l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public comj(GoogleApiClient googleApiClient, LocationRequestInternal locationRequestInternal, cola colaVar, Looper looper) {
        super(googleApiClient);
        this.a = locationRequestInternal;
        this.k = colaVar;
        this.l = looper;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(conr conrVar) {
        conrVar.U(this.a, cnse.a(this.k, core.a(this.l), cola.class.getSimpleName()), new comq(this));
    }
}
