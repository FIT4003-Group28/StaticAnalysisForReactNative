package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aapp  reason: default package */
/* loaded from: classes.dex */
public final class aapp implements aapo {
    private final snc a;
    private final Map b = new ConcurrentHashMap();

    public aapp(snc sncVar) {
        this.a = sncVar;
    }

    @Override // defpackage.aapo
    public final void a(aopa aopaVar, arpa arpaVar) {
        if (arpaVar == null || (arpaVar.b & 131072) == 0) {
            return;
        }
        if (aopaVar != null) {
            aroz arozVar = ((aroy) aopaVar.instance).f;
            if (arozVar == null) {
                arozVar = aroz.a;
            }
            if (arozVar.d.size() != 0) {
                Set keySet = this.b.keySet();
                aroz arozVar2 = ((aroy) aopaVar.instance).f;
                if (arozVar2 == null) {
                    arozVar2 = aroz.a;
                }
                keySet.removeAll(arozVar2.d);
            }
        }
        Map map = this.b;
        aqgk aqgkVar = arpaVar.g;
        if (aqgkVar == null) {
            aqgkVar = aqgk.a;
        }
        long d = this.a.d();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aqgk aqgkVar2 = arpaVar.g;
        if (aqgkVar2 == null) {
            aqgkVar2 = aqgk.a;
        }
        map.put(aqgkVar, Long.valueOf(d + timeUnit.toMillis(aqgkVar2.b)));
    }

    @Override // defpackage.aapo
    public final void b(aopa aopaVar) {
        if (this.b.isEmpty() || aopaVar == null) {
            return;
        }
        aroz arozVar = ((aroy) aopaVar.instance).f;
        if (arozVar == null) {
            arozVar = aroz.a;
        }
        aopa mo52toBuilder = arozVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        ((aroz) mo52toBuilder.instance).d = aroz.emptyProtobufList();
        for (Map.Entry entry : this.b.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= this.a.d()) {
                this.b.remove(entry.getKey());
            } else {
                aqgk aqgkVar = (aqgk) entry.getKey();
                mo52toBuilder.copyOnWrite();
                aroz arozVar2 = (aroz) mo52toBuilder.instance;
                aqgkVar.getClass();
                aopu aopuVar = arozVar2.d;
                if (!aopuVar.c()) {
                    arozVar2.d = aopi.mutableCopy(aopuVar);
                }
                arozVar2.d.add(aqgkVar);
            }
        }
        aopaVar.copyOnWrite();
        aroy aroyVar = (aroy) aopaVar.instance;
        aroz arozVar3 = (aroz) mo52toBuilder.mo39build();
        arozVar3.getClass();
        aroyVar.f = arozVar3;
        aroyVar.b |= 16;
    }
}
