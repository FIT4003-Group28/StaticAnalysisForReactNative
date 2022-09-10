package defpackage;

import android.content.Context;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: cuka  reason: default package */
/* loaded from: classes5.dex */
public final class cuka {
    public final ctss a;
    public final Context b;
    public final ctog c;

    public cuka(ctss ctssVar, Context context) {
        this.a = ctssVar;
        this.b = context;
        this.c = ctog.a(context);
    }

    public final dehn<cujt> a(ctyy ctyyVar, cukn cuknVar, cugu cuguVar, String str, ctmn ctmnVar, int i) {
        ctog ctogVar = this.c;
        ctxm r = ctxn.r();
        r.g(31);
        r.n(ctyyVar.b().e());
        r.o(ctyyVar.c().J());
        r.p(cuguVar.a());
        r.d(cuguVar.c());
        ctogVar.b(r.a());
        ctss ctssVar = this.a;
        UUID randomUUID = UUID.randomUUID();
        cukf cukfVar = new cukf(ctyyVar, str, cuknVar, i);
        Context context = this.b;
        dehn<cujt> a = ctssVar.a(randomUUID, cukfVar, deha.a(new cujw(context, new cukc(context, null))), ctyyVar, ctmnVar, true);
        deha.q(a, new cujy(this, ctyyVar, cuguVar), dege.a);
        return a;
    }
}
