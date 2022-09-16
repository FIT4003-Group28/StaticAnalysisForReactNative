package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wtj  reason: default package */
/* loaded from: classes7.dex */
public final class wtj implements degu<List<bxzt>> {
    final /* synthetic */ deig a;
    final /* synthetic */ wto b;

    public wtj(wto wtoVar, deig deigVar) {
        this.b = wtoVar;
        this.a = deigVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (!(th instanceof CancellationException)) {
            wto wtoVar = this.b;
            wtoVar.d = null;
            wtoVar.c = dcmn.a;
            this.b.f(wtl.LOADING_FAILED);
        }
        this.a.k(th);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi List<bxzt> list) {
        List<bxzt> list2 = list;
        dcdg p = dcdn.p();
        if (list2 != null) {
            for (bxzt bxztVar : list2) {
                p.f(bxztVar.a(), bxztVar);
            }
        }
        dcdn b = p.b();
        this.b.c = b;
        this.a.j(b);
        this.b.f(wtl.LOADING_SUCCEEDED);
    }
}
