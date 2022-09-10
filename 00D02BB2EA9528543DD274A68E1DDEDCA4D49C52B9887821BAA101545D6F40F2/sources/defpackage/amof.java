package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: amof  reason: default package */
/* loaded from: classes.dex */
public final class amof extends btnc<alyh, amod> {
    public final List<amod> a;
    final /* synthetic */ amoh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amof(amoh amohVar) {
        super(Integer.MAX_VALUE);
        this.b = amohVar;
        this.a = new ArrayList();
    }

    @Override // defpackage.btnc
    protected final /* bridge */ /* synthetic */ void d(alyh alyhVar, amod amodVar) {
        amod amodVar2 = amodVar;
        amoh.l(this.b, amodVar2.b);
        amoh.m(this.b, amodVar2.c);
        if (amodVar2.a != null) {
            amodVar2.b = 0;
            amodVar2.c = 0;
            amoh amohVar = this.b;
            amohVar.b--;
            g(amodVar2);
        }
    }

    public final btnb<alyh, amod> f() {
        btna<alyh, amod> r = r();
        if (r.hasNext()) {
            return r.next();
        }
        return null;
    }

    public final void g(amod amodVar) {
        this.a.add(amodVar);
    }

    public final void h() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            amod amodVar = this.a.get(i);
            amodVar.a.q();
            amoh.l(this.b, amodVar.b);
            amoh.m(this.b, amodVar.c);
        }
        this.a.clear();
    }
}
