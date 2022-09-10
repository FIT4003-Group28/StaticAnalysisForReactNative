package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import defpackage.cnom;
/* compiled from: PG */
/* renamed from: cpep  reason: default package */
/* loaded from: classes5.dex */
abstract class cpep<R extends cnom> extends cnpg<R, cpes> {
    /* JADX INFO: Access modifiers changed from: protected */
    public cpep(GoogleApiClient googleApiClient) {
        super(cpdo.c, googleApiClient);
    }

    protected abstract void a(Context context, cpeb cpebVar);

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cpes cpesVar) {
        cpes cpesVar2 = cpesVar;
        a(cpesVar2.c, (cpeb) cpesVar2.L());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cnpg, defpackage.cnph
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        super.p((cnom) obj);
    }
}
