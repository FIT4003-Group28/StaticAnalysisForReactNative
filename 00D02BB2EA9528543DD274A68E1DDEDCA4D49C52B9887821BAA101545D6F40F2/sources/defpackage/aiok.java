package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.HashMap;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aiok  reason: default package */
/* loaded from: classes2.dex */
public final class aiok {
    public final Set<ainq> b = dcnm.g();
    private final HashMap<dbsg<btlu>, aioi> c = new HashMap<>();
    public final Set a = dcnm.g();

    public final dcep<aioj> a(dbsg<btlu> dbsgVar, PersonId personId) {
        aioi b = b(dbsgVar);
        if (!b.a.containsKey(personId)) {
            return dcmr.a;
        }
        return dcep.K(b.a.get(personId));
    }

    public final synchronized aioi b(dbsg<btlu> dbsgVar) {
        if (this.c.containsKey(dbsgVar)) {
            return this.c.get(dbsgVar);
        }
        aioi aioiVar = new aioi();
        this.c.put(dbsgVar, aioiVar);
        return aioiVar;
    }

    public final void c(final dbsg<btlu> dbsgVar, final dbsg<PersonId> dbsgVar2) {
        for (ainq ainqVar : this.b) {
            final aioh aiohVar = ainqVar.a;
            ainqVar.b.execute(new Runnable(aiohVar, dbsgVar, dbsgVar2) { // from class: aino
                private final aioh a;
                private final dbsg b;
                private final dbsg c;

                {
                    this.a = aiohVar;
                    this.b = dbsgVar;
                    this.c = dbsgVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    aioh aiohVar2 = this.a;
                    dbsg<btlu> dbsgVar3 = this.b;
                    dbsg<PersonId> dbsgVar4 = this.c;
                    bvrj.UI_THREAD.d();
                    if (!dbsgVar4.a()) {
                        for (btlu btluVar : aiohVar2.a.g()) {
                            aiohVar2.k(dbsg.i(btluVar), dbpy.a);
                        }
                        aiohVar2.k(dbpy.a, dbpy.a);
                        return;
                    }
                    aiohVar2.k(dbsgVar3, dbsgVar4);
                }
            });
        }
    }
}
