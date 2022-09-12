package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: comd  reason: default package */
/* loaded from: classes5.dex */
final class comd extends comp {
    final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public comd(GoogleApiClient googleApiClient, boolean z) {
        super(googleApiClient);
        this.a = z;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(conr conrVar) {
        conrVar.t.b(this.a);
        p(Status.a);
    }
}
