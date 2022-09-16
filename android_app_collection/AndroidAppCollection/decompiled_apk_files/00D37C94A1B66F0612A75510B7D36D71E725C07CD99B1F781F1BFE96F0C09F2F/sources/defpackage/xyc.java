package defpackage;

import j$.util.DesugarCollections;
import java.util.IdentityHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xyc  reason: default package */
/* loaded from: classes4.dex */
public final class xyc {
    public final Map a = DesugarCollections.synchronizedMap(new IdentityHashMap());

    public final apoj a(aqca aqcaVar) {
        apoj apojVar = (apoj) this.a.get(aqcaVar);
        if (apojVar == null) {
            apok apokVar = aqcaVar.c;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            if ((apokVar.b & 1) == 0) {
                return null;
            }
            apok apokVar2 = aqcaVar.c;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar2 = apokVar2.c;
            return apojVar2 == null ? apoj.a : apojVar2;
        }
        return apojVar;
    }

    public final void b(aqca aqcaVar, apoj apojVar) {
        this.a.put(aqcaVar, apojVar);
    }

    public final boolean c(aqca aqcaVar) {
        if (!this.a.containsKey(aqcaVar)) {
            apok apokVar = aqcaVar.c;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            if ((apokVar.b & 1) == 0) {
                return false;
            }
        }
        return true;
    }
}
