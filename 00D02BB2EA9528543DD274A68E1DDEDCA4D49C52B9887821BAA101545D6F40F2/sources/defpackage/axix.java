package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axix  reason: default package */
/* loaded from: classes3.dex */
final class axix {
    public static final dqaw a;
    public final String b;
    public final Map<String, crzo<axoj>> c;
    public dbsg<dqar> d = null;
    public Map<String, dqau> e = new HashMap();
    public Map<String, crzo<axoj>> f = new HashMap();
    public final Map<String, crzo<axoj>> g = new HashMap();
    public final Map<String, Integer> h = new HashMap();

    static {
        dqav bZ = dqaw.d.bZ();
        dfqe dfqeVar = dfqe.UNDEFINED_STATE;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqaw dqawVar = (dqaw) bZ.b;
        dqawVar.b = dfqeVar.f;
        dqawVar.a |= 1;
        dqaw.b(dqawVar);
        a = bZ.bK();
    }

    public axix(String str, final axgi axgiVar, Executor executor) {
        this.b = str;
        dchm dchmVar = new dchm();
        dchmVar.j();
        this.c = dchmVar.e();
        dbsk.l(axgiVar.i.equals(str));
        executor.execute(new Runnable(this, axgiVar) { // from class: axit
            private final axix a;
            private final axgi b;

            {
                this.a = this;
                this.b = axgiVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final axix axixVar = this.a;
                this.b.f.c(new aa(axixVar) { // from class: axiw
                    private final axix a;

                    {
                        this.a = axixVar;
                    }

                    @Override // defpackage.aa
                    public final void m(Object obj) {
                        axix axixVar2 = this.a;
                        axixVar2.d = axix.a((dqas) obj, axixVar2.d);
                    }
                });
            }
        });
    }

    public static dbsg<dqar> a(dqas dqasVar, @dzsi dbsg<dqar> dbsgVar) {
        if (dbsgVar == null || dbsgVar.a()) {
            if ((dqasVar.a & 2) == 0) {
                return dbpy.a;
            }
            dqar dqarVar = dqasVar.b;
            if (dqarVar == null) {
                dqarVar = dqar.d;
            }
            return dbsg.i(dqarVar);
        }
        return dbsgVar;
    }

    public final crzo<axoj> b(String str, dqaw dqawVar) {
        crzo<axoj> crzoVar = this.c.get(str);
        if (crzoVar != null) {
            axoj l = crzoVar.a.l();
            dbsk.s(l);
            l.a(dqawVar);
            l.a = false;
            crzoVar.a(l);
            return crzoVar;
        }
        crzo<axoj> crzoVar2 = new crzo<>(new axoj(dqawVar));
        this.c.put(str, crzoVar2);
        return crzoVar2;
    }

    @dzsi
    public final crzo<axoj> c(String str) {
        return this.c.get(str);
    }

    public final synchronized void d(String str, dqaw dqawVar) {
        crzo<axoj> b = b(str, dqawVar);
        if (this.h.containsKey(str)) {
            Map<String, Integer> map = this.h;
            map.put(str, Integer.valueOf(map.get(str).intValue() + 1));
            return;
        }
        this.g.put(str, b);
        this.h.put(str, 1);
    }
}
