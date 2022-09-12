package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import defpackage.cnom;
/* compiled from: PG */
/* renamed from: cmql  reason: default package */
/* loaded from: classes5.dex */
abstract class cmql<T extends cnom> extends cnpg<T, cmqj> {
    public cmql(GoogleApiClient googleApiClient) {
        super(cmps.b, googleApiClient);
    }

    protected abstract void a(cmqf cmqfVar);

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cmqj cmqjVar) {
        a((cmqf) cmqjVar.L());
    }

    @Override // defpackage.cnpg, defpackage.cnph
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        super.p((cnom) obj);
    }
}
