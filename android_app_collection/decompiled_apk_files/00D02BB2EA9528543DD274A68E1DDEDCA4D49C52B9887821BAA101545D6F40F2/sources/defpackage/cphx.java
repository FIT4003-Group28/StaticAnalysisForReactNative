package defpackage;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cphx  reason: default package */
/* loaded from: classes5.dex */
public final class cphx extends cphn<cphy> {
    final /* synthetic */ Uri a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cphx(GoogleApiClient googleApiClient, Uri uri) {
        super(googleApiClient);
        this.a = uri;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cpjw cpjwVar) {
        ((cpiy) cpjwVar.L()).h(new cpjr(this), this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return new cphy(status);
    }
}
