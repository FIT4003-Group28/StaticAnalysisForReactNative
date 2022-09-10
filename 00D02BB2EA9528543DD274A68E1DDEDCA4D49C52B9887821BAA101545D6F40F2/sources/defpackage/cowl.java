package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cowl  reason: default package */
/* loaded from: classes.dex */
public final class cowl extends cous<couj> {
    final /* synthetic */ coui a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cowl(GoogleApiClient googleApiClient, coui couiVar) {
        super(googleApiClient);
        this.a = couiVar;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cowh cowhVar) {
        cowhVar.U(this, this.a.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return new cowk(status);
    }
}
