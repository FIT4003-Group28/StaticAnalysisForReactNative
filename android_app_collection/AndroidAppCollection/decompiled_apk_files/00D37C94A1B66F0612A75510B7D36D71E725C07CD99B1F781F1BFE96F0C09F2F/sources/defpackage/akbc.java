package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akbc  reason: default package */
/* loaded from: classes.dex */
public final class akbc implements akbe {
    private final aafo a;
    private final Map b;

    private akbc(aafo aafoVar, Map map) {
        aafoVar.getClass();
        this.a = aafoVar;
        this.b = map;
    }

    public static void b(dt dtVar, atep atepVar, aafo aafoVar, ajxz ajxzVar, Map map, acth acthVar, aakn aaknVar, lmm lmmVar) {
        akbc akbcVar = new akbc(aafoVar, map);
        if (aolu.n(atepVar, null, lmmVar, aaknVar)) {
            aopa mo52toBuilder = atepVar.mo52toBuilder();
            amuk m = aolu.m(atepVar, null, lmmVar, aaknVar);
            mo52toBuilder.copyOnWrite();
            ((atep) mo52toBuilder.instance).c = atep.emptyProtobufList();
            mo52toBuilder.aB(m);
            atepVar = (atep) mo52toBuilder.mo39build();
        }
        akbf akbfVar = new akbf();
        akbf.aL(akbfVar, atepVar, ajxzVar, acthVar, null);
        akbfVar.af = akbcVar;
        akbfVar.qw(dtVar.getSupportFragmentManager(), null);
    }

    public static void c(dt dtVar, atep atepVar, aafo aafoVar, ajxz ajxzVar, Map map) {
        b(dtVar, atepVar, aafoVar, ajxzVar, map, null, null, null);
    }

    private final Map d() {
        HashMap hashMap = new HashMap();
        Map map = this.b;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put(actk.b, Boolean.TRUE);
        return hashMap;
    }

    @Override // defpackage.akbe
    public final void a(aten atenVar) {
        if (atenVar == null) {
            return;
        }
        if (abgc.e(atenVar) != null) {
            this.a.c(abgc.e(atenVar), d());
        } else if (abgc.d(atenVar) == null) {
        } else {
            this.a.c(abgc.d(atenVar), d());
        }
    }
}
