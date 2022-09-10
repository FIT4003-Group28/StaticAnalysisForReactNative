package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cpjb  reason: default package */
/* loaded from: classes5.dex */
public final class cpjb extends cphn<cpjc> {
    final /* synthetic */ String a;
    final /* synthetic */ String k;
    final /* synthetic */ byte[] l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpjb(GoogleApiClient googleApiClient, String str, String str2, byte[] bArr) {
        super(googleApiClient);
        this.a = str;
        this.k = str2;
        this.l = bArr;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cpjw cpjwVar) {
        ((cpiy) cpjwVar.L()).e(new cpjv(this), this.a, this.k, this.l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return new cpjc(status);
    }
}
