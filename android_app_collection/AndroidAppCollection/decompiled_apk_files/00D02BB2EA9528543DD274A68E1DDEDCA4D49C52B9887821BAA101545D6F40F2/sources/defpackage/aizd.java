package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aizd  reason: default package */
/* loaded from: classes2.dex */
public final class aizd {
    public static final dcqe a = dcqe.c("aizd");
    public final cqat b;
    public final cjqy c;
    public final ConcurrentHashMap<dbsg<btlu>, Map<PersonId, aizc>> d = new ConcurrentHashMap<>();

    public aizd(cqat cqatVar, cjqy cjqyVar) {
        this.b = cqatVar;
        this.c = cjqyVar;
    }

    public final boolean a(dbsg<btlu> dbsgVar, PersonId personId) {
        bvrj.UI_THREAD.c();
        Map<PersonId, aizc> map = this.d.get(dbsgVar);
        return map != null && map.containsKey(personId);
    }

    public final void b(dbsg<btlu> dbsgVar, dbsg<aink> dbsgVar2, PersonId personId, int i, long j) {
        bvrj.UI_THREAD.c();
        Map<PersonId, aizc> map = this.d.get(dbsgVar);
        if (map == null) {
            map = new HashMap<>();
            this.d.put(dbsgVar, map);
        }
        if (map.containsKey(personId)) {
            bvoo.h("Cannot log already loading person as started loading.", new Object[0]);
        } else {
            map.put(personId, new aizc(this, personId, dbsgVar2, i, j));
        }
    }

    public final void c(dbsg<btlu> dbsgVar, PersonId personId, int i) {
        dbsg<eaow> dbsgVar2;
        bvrj.UI_THREAD.c();
        Map<PersonId, aizc> map = this.d.get(dbsgVar);
        aizc aizcVar = map == null ? null : map.get(personId);
        if (map == null || aizcVar == null) {
            return;
        }
        bvrj.UI_THREAD.c();
        if (aizcVar.e) {
            bvoo.h("Cannot log state for something twice", new Object[0]);
        } else {
            dnom dnomVar = aizcVar.a;
            if (dnomVar.c) {
                dnomVar.bF();
                dnomVar.c = false;
            }
            dnop dnopVar = (dnop) dnomVar.b;
            dnop dnopVar2 = dnop.j;
            dnopVar.g = i - 1;
            dnopVar.a |= 16;
            dnom dnomVar2 = aizcVar.a;
            int a2 = decl.a(TimeUnit.MILLISECONDS.toSeconds(aizcVar.f.b.e()));
            if (dnomVar2.c) {
                dnomVar2.bF();
                dnomVar2.c = false;
            }
            dnop dnopVar3 = (dnop) dnomVar2.b;
            dnopVar3.a |= 32;
            dnopVar3.h = a2;
            if (aizcVar.c.a()) {
                dbsgVar2 = aizcVar.c.b().p(eapd.a());
            } else {
                dbsgVar2 = dbpy.a;
            }
            if (dbsgVar2.a()) {
                dnom dnomVar3 = aizcVar.a;
                int a3 = decl.a(dbsgVar2.b().g());
                if (dnomVar3.c) {
                    dnomVar3.bF();
                    dnomVar3.c = false;
                }
                dnop dnopVar4 = (dnop) dnomVar3.b;
                dnopVar4.a |= 64;
                dnopVar4.i = a3;
            }
            aizd aizdVar = aizcVar.f;
            aizdVar.c.u(new aizb(aizcVar, aizdVar.b));
            aizcVar.e = true;
        }
        map.remove(personId);
    }
}
