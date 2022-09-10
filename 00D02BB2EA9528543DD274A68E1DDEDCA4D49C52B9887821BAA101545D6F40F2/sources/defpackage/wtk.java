package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wtk  reason: default package */
/* loaded from: classes7.dex */
public final class wtk implements degu<bxzs> {
    final /* synthetic */ Map a;
    final /* synthetic */ String b;
    final /* synthetic */ wto c;

    public wtk(wto wtoVar, Map map, String str) {
        this.c = wtoVar;
        this.a = map;
        this.b = str;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.c.g = null;
        this.c.f(wtl.UPDATE_FAILED);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(bxzs bxzsVar) {
        bxzs bxzsVar2 = bxzsVar;
        dcdg p = dcdn.p();
        for (bxzt bxztVar : this.a.values()) {
            String a = bxztVar.a();
            if (a.equals(this.b)) {
                bxztVar = bxzt.f(a, bxzsVar2, bxztVar.c(), bxztVar.d(), bxztVar.e());
            } else {
                a = bxztVar.a();
            }
            p.f(a, bxztVar);
        }
        this.c.c = p.b();
        this.c.g = null;
        this.c.f(wtl.UPDATE_SUCCEEDED);
    }
}
