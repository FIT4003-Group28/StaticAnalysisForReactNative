package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import defpackage.cnom;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: coeg  reason: default package */
/* loaded from: classes5.dex */
public abstract class coeg<R extends cnom> extends cnpg<R, coek> {
    public coeg(GoogleApiClient googleApiClient) {
        super(codv.c, googleApiClient);
    }

    protected abstract void a(coen coenVar);

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(coek coekVar) {
        coek coekVar2 = coekVar;
        Context context = coekVar2.c;
        a((coen) coekVar2.L());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cnpg, defpackage.cnph
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        super.p((cnom) obj);
    }
}
