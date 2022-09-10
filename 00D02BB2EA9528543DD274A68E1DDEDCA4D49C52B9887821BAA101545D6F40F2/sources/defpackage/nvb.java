package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: nvb  reason: default package */
/* loaded from: classes7.dex */
public class nvb implements cjyx {
    private final cjzt a;
    private final List<cjyv<?>> b;
    @dzsi
    private final dthb c;
    private final cjtd d;

    public nvb(cjzo cjzoVar, Context context, cjzt cjztVar, cjys cjysVar) {
        this.a = cjztVar;
        List<dtkx> list = cjysVar.a;
        this.b = dchl.f(list.size());
        for (dtkx dtkxVar : list) {
            cjzq<?> b = cjzp.b(cjzoVar, context, cjztVar, dtkxVar);
            if (b != null) {
                this.b.add(cjyv.a(b, cjzp.c(cjzoVar, dtkxVar), cjzp.d(cjzoVar, dtkxVar)));
            }
        }
        this.c = cjysVar.b;
        cjta cjtaVar = new cjta();
        cjtaVar.b = cjysVar.d;
        cjtaVar.g(cjysVar.c);
        cjtaVar.f = cjysVar.e;
        this.d = cjtaVar.a();
    }

    @Override // defpackage.cjyx
    public List<cjyv<?>> a() {
        return this.b;
    }

    @Override // defpackage.cjyx
    public Boolean b() {
        return Boolean.valueOf(this.c != null);
    }

    @Override // defpackage.cjyx
    public cqkl c(cjqm cjqmVar) {
        if (b().booleanValue()) {
            cjzt cjztVar = this.a;
            cjztVar.c.j(this.c, nxc.a(cjztVar.a, cjztVar.b, cjqmVar));
        }
        return cqkl.a;
    }

    @Override // defpackage.cjyx
    public cjtd d() {
        return this.d;
    }
}
