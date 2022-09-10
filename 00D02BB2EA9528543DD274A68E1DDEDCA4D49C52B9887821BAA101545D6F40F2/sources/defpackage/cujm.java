package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cujm  reason: default package */
/* loaded from: classes5.dex */
public final class cujm implements degu<cujt> {
    final /* synthetic */ cukp a;
    final /* synthetic */ cugu b;
    final /* synthetic */ ctyy c;
    final /* synthetic */ cujn d;

    public cujm(cujn cujnVar, cukp cukpVar, cugu cuguVar, ctyy ctyyVar) {
        this.d = cujnVar;
        this.a = cukpVar;
        this.b = cuguVar;
        this.c = ctyyVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        dyiy dyiyVar = dyiy.OK;
        ConversationId.IdType idType = ConversationId.IdType.ONE_TO_ONE;
        int ordinal = dyjb.c(th).p.ordinal();
        if (ordinal == 3 || ordinal == 5) {
            cuko h = this.a.h();
            h.b(2);
            cukp a = h.a();
            cugi n = this.b.n();
            cugk c = cugl.c();
            ((cudv) c).a = "photos";
            c.b(cuiq.a(a).b());
            n.s(c.a());
            this.d.f.a(this.c).f(n.a());
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cujt cujtVar) {
    }
}
