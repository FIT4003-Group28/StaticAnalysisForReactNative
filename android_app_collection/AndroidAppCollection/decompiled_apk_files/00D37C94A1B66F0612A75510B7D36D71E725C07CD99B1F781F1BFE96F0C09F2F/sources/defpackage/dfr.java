package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: PG */
/* renamed from: dfr  reason: default package */
/* loaded from: classes3.dex */
public abstract class dfr extends dfi {
    private final dgj a;

    public dfr() {
        if (dgg.a == null) {
            dgd dgdVar = new dgd();
            dgg.a = new dgg(dgdVar);
            dgdVar.c = dgg.a;
        }
        dgj dgjVar = new dgj(dgg.a);
        this.a = dgjVar;
        dfq dfqVar = new dfq(this);
        if (dgjVar.f == null) {
            dgjVar.f = dfqVar;
            return;
        }
        throw new RuntimeException("Overriding existing listener!");
    }

    @Override // defpackage.dfg
    public final void d() {
        if (!e()) {
            return;
        }
        this.a.b();
    }

    @Override // defpackage.dfg
    public final boolean e() {
        return this.a.d;
    }

    @Override // defpackage.dfg
    public final void f(dem demVar) {
        if (!j()) {
            g();
            return;
        }
        i();
        k(demVar);
        dgj dgjVar = this.a;
        dgi dgiVar = dgjVar.b;
        for (int i = 0; i < dgiVar.a.size(); i++) {
            dgp dgpVar = (dgp) dgiVar.a.get(i);
            dgp dgpVar2 = (dgp) dgiVar.b.get(i);
            String str = (String) dgiVar.c.get(i);
            dgp g = dgpVar2.g(str);
            if (g != null) {
                dgi.a(g, dgpVar2, str);
            }
            if (dgpVar.b == null) {
                dgpVar.b = new ArrayList();
            }
            dgpVar.b.add(dgpVar2);
            if (dgpVar2.a == null) {
                dgpVar2.a = new LinkedHashMap();
            }
            dgpVar2.a.put(str, dgpVar);
        }
        dgjVar.e = true;
        dgjVar.d = true;
        dgjVar.a.b(dgjVar);
    }

    protected abstract void k(dem demVar);

    public final void l(dgp dgpVar, dgp dgpVar2) {
        this.a.a(dgpVar, dgpVar2, "default_input");
    }

    public final void m(dgp dgpVar, dgp dgpVar2, String str) {
        this.a.a(dgpVar, dgpVar2, str);
    }
}
