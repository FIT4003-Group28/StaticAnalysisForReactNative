package defpackage;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cumu  reason: default package */
/* loaded from: classes5.dex */
public final class cumu implements ctuk {
    private final Context a;

    public cumu(Context context) {
        this.a = context;
    }

    @Override // defpackage.ctuk
    public final ctuj a() {
        return new cunn(this.a);
    }

    @Override // defpackage.ctuk
    public final String b() {
        return "rich_card";
    }

    @Override // defpackage.ctuk
    public final dehn<cugu> c(ctyy ctyyVar, cugu cuguVar) {
        return deha.a(cuguVar);
    }

    @Override // defpackage.ctuk
    public final void d(ctyy ctyyVar, cugu cuguVar, ctxo ctxoVar) {
        ctxm r = ctxn.r();
        r.g(36);
        r.n(ctyyVar.b().e());
        r.o(ctyyVar.c().J());
        r.p(cuguVar.a());
        r.d(cuguVar.c());
        ctxoVar.b(r.a());
    }

    @Override // defpackage.ctuk
    public final void e(ctyy ctyyVar, cugu cuguVar, ctxo ctxoVar) {
        ctxm r = ctxn.r();
        r.g(35);
        r.n(ctyyVar.b().e());
        r.o(ctyyVar.c().J());
        r.p(cuguVar.a());
        r.d(cuguVar.c());
        ctxoVar.b(r.a());
    }

    @Override // defpackage.ctuk
    public final void f(ctyy ctyyVar) {
        deha.a(true);
    }

    @Override // defpackage.ctuk
    public final void g(ConversationId conversationId) {
        deha.a(true);
    }
}
