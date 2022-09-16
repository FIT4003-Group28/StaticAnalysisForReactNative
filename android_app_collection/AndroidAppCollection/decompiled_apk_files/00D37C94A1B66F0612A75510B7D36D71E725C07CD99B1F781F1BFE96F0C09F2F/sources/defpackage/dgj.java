package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: dgj  reason: default package */
/* loaded from: classes3.dex */
public final class dgj {
    public final dgg a;
    public final dgi b = new dgi();
    public final ArrayList c = new ArrayList();
    public boolean d = false;
    public boolean e = false;
    public dfq f;

    public dgj(dgg dggVar) {
        this.a = dggVar;
    }

    public final void a(dgp dgpVar, dgp dgpVar2, String str) {
        if (!this.e) {
            dgi dgiVar = this.b;
            dgiVar.a.add(dgpVar);
            dgiVar.b.add(dgpVar2);
            dgiVar.c.add(str);
            this.c.add(dgpVar);
            this.c.add(dgpVar2);
            return;
        }
        throw new RuntimeException("Trying to add binding after DataFlowGraph has already been activated.");
    }

    public final void b() {
        if (!this.d) {
            return;
        }
        this.d = false;
        this.a.c(this);
        dgi dgiVar = this.b;
        for (int i = 0; i < dgiVar.a.size(); i++) {
            dgp dgpVar = (dgp) dgiVar.a.get(i);
            dgp dgpVar2 = (dgp) dgiVar.b.get(i);
            String str = (String) dgiVar.c.get(i);
            if (dgpVar2.g(str) == dgpVar) {
                dgi.a(dgpVar, dgpVar2, str);
            }
        }
    }
}
