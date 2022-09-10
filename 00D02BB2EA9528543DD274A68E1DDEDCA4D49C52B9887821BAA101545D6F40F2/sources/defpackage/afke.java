package defpackage;

import java.util.Collection;
import java.util.List;
/* compiled from: PG */
/* renamed from: afke  reason: default package */
/* loaded from: classes2.dex */
public class afke {
    private final List<duqi> a;
    private final bunm b;

    public afke(bunm bunmVar, Collection collection) {
        this.b = bunmVar;
        this.a = dcdc.r(collection);
    }

    protected void a(duqm duqmVar) {
    }

    public final void b(String str, deig<duqp> deigVar) {
        bvrj.UI_THREAD.c();
        duqm bZ = duqn.n.bZ();
        List<duqi> list = this.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duqn duqnVar = (duqn) bZ.b;
        dsrf dsrfVar = duqnVar.c;
        if (!dsrfVar.a()) {
            duqnVar.c = dsqw.cg(dsrfVar);
        }
        for (duqi duqiVar : list) {
            duqnVar.c.h(duqiVar.M);
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duqn duqnVar2 = (duqn) bZ.b;
        str.getClass();
        duqnVar2.a |= 1;
        duqnVar2.b = str;
        a(bZ);
        this.b.a(bZ.bK(), new afkc(deigVar), bvrj.UI_THREAD);
    }
}
