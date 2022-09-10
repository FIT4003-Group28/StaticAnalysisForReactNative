package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: annb  reason: default package */
/* loaded from: classes2.dex */
public final class annb {
    public static final dcqe a = dcqe.c("annb");
    private final Map<dbsi<aogb, dbsg<String>>, anna> b = new HashMap();
    private final anlo c;

    public annb(anlo anloVar) {
        this.c = anloVar;
    }

    private final boolean e(aogb aogbVar) {
        return this.c.a(aogbVar);
    }

    private final anna f(aogb aogbVar, dbsg<String> dbsgVar) {
        dbsi<aogb, dbsg<String>> a2 = dbsi.a(aogbVar, dbsgVar);
        if (this.b.containsKey(a2)) {
            return this.b.get(a2);
        }
        anna annaVar = new anna(aogbVar, dbsgVar);
        this.b.put(a2, annaVar);
        return annaVar;
    }

    private static void g(anna annaVar, final anmn anmnVar) {
        final aogb aogbVar = annaVar.a;
        final dbsg<String> dbsgVar = annaVar.b;
        anmnVar.a.add(new Runnable(anmnVar, aogbVar, dbsgVar) { // from class: anml
            private final anmn a;
            private final aogb b;
            private final dbsg c;

            {
                this.a = anmnVar;
                this.b = aogbVar;
                this.c = dbsgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                anmn anmnVar2 = this.a;
                aogb aogbVar2 = this.b;
                dbsg<String> dbsgVar2 = this.c;
                for (anmo anmoVar : anmnVar2.b.c) {
                    anmoVar.a(aogbVar2);
                }
                anmnVar2.b.a.a(aogbVar2, dbsgVar2, new anmm(anmnVar2, aogbVar2, dbsgVar2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized dcdc<btzi<duzc, duzk>> a(aogb aogbVar, dbsg<String> dbsgVar) {
        dbsi a2 = dbsi.a(aogbVar, dbsgVar);
        if (!this.b.containsKey(a2)) {
            bvoo.h("Day without data: %s and ved %s", aogbVar, dbsgVar);
            return dcdc.e();
        }
        anna annaVar = this.b.get(a2);
        dcdc<btzi<duzc, duzk>> r = dcdc.r(annaVar.d);
        annaVar.d.clear();
        if (annaVar.c.isEmpty() && annaVar.d.isEmpty()) {
            this.b.remove(dbsi.a(annaVar.a, annaVar.b));
        }
        return r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(aogb aogbVar, dbsg<String> dbsgVar, btzi<duzc, duzk> btziVar, anmn anmnVar) {
        if (!e(aogbVar)) {
            anna f = f(aogbVar, dbsgVar);
            if (f.c.isEmpty()) {
                if (f.d.isEmpty()) {
                    f.d.add(btziVar);
                    g(f, anmnVar);
                    return;
                }
                f.d.add(btziVar);
                return;
            }
            f.c.add(btziVar);
            return;
        }
        anna f2 = f(aogbVar, dbsgVar);
        f2.e = false;
        f2.c.add(btziVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(anmn anmnVar) {
        for (anna annaVar : this.b.values()) {
            if (!annaVar.d.isEmpty()) {
                if (annaVar.d.isEmpty()) {
                    bvoo.h("Enqueueing postponed request for %s, even though there is no ongoing request", annaVar.a);
                }
                annaVar.e = true;
            } else if (!this.c.a(annaVar.a)) {
                annaVar.a();
                g(annaVar, anmnVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(aogb aogbVar, dbsg<String> dbsgVar, anmn anmnVar) {
        dbsg dbsgVar2;
        dbsi a2 = dbsi.a(aogbVar, dbsgVar);
        if (!this.b.containsKey(a2)) {
            dbsgVar2 = dbpy.a;
        } else {
            anna annaVar = this.b.get(a2);
            if (!annaVar.e || annaVar.c.isEmpty()) {
                dbsgVar2 = dbpy.a;
            } else if (e(aogbVar)) {
                annaVar.e = false;
                dbsgVar2 = dbpy.a;
            } else {
                annaVar.a();
                dbsgVar2 = dbsg.i(annaVar);
            }
        }
        if (!dbsgVar2.a()) {
            return;
        }
        g((anna) dbsgVar2.b(), anmnVar);
    }
}
