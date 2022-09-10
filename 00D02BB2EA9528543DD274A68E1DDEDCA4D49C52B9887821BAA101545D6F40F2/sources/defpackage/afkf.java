package defpackage;

import android.content.Intent;
import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: afkf  reason: default package */
/* loaded from: classes2.dex */
public final class afkf {
    private final Map<duqi, afks> a = new EnumMap(duqi.class);
    private final Map<duqi, Map<duqi, afks>> b = new EnumMap(duqi.class);
    private final cjqy c;

    public afkf(cjqy cjqyVar) {
        dbsk.s(cjqyVar);
        this.c = cjqyVar;
    }

    public final void a(duqi duqiVar, afks afksVar) {
        this.a.put(duqiVar, afksVar);
    }

    public final void b(duqi duqiVar, duqi duqiVar2, afks afksVar) {
        Map<duqi, afks> map;
        if (!this.b.containsKey(duqiVar2)) {
            map = new EnumMap<>(duqi.class);
            this.b.put(duqiVar2, map);
        } else {
            map = this.b.get(duqiVar2);
        }
        map.put(duqiVar, afksVar);
    }

    public final dbsg<Runnable> d(duqp duqpVar, @dzsi duqi duqiVar, @dzsi Intent intent, @dzsi String str, @dzsi String str2) {
        duqk duqkVar = duqpVar.b;
        if (duqkVar == null) {
            duqkVar = duqk.d;
        }
        duqi b = duqi.b(duqkVar.b);
        if (b == null) {
            b = duqi.ERROR;
        }
        afks c = c(b, duqiVar);
        dbpy<Object> dbpyVar = dbpy.a;
        if (c != null) {
            this.c.s(str, null, c.b(), dukj.EXTERNAL_INVOCATION_COMPLETED, str2, true);
            try {
                return dbsg.j(c.a(intent, duqpVar));
            } catch (afkt e) {
                bvoo.f(new RuntimeException(e));
                return dbpyVar;
            }
        }
        return dbpyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final afks c(duqi duqiVar, @dzsi duqi duqiVar2) {
        if (duqiVar2 == null || duqiVar2 == duqiVar) {
            return this.a.get(duqiVar);
        }
        Map<duqi, afks> map = this.b.get(duqiVar2);
        if (map != null) {
            return map.get(duqiVar);
        }
        return null;
    }
}
