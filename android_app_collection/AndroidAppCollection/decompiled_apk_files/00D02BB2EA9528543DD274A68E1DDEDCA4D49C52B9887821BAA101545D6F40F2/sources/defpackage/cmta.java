package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cmta  reason: default package */
/* loaded from: classes5.dex */
abstract class cmta extends cnpg<cmte, cmsv> {
    public cmta(GoogleApiClient googleApiClient) {
        super(cmsq.b, googleApiClient);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final cmte a(Status status) {
        return new cmte(status);
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cmsv cmsvVar) {
        cmsv cmsvVar2 = cmsvVar;
        Context context = cmsvVar2.c;
        e((cmsy) cmsvVar2.L());
    }

    @Override // defpackage.cnpg, defpackage.cnph
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        super.p((cnom) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return a(status);
    }

    protected abstract void e(cmsy cmsyVar);
}
