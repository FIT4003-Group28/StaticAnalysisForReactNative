package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: agsx  reason: default package */
/* loaded from: classes.dex */
public final class agsx extends afla {
    private final aghe a;
    private final afjl b;
    private final afkf c;
    private final axxl d;

    public agsx(aghe agheVar, afjl afjlVar, afkf afkfVar, axxl axxlVar) {
        agheVar.getClass();
        this.a = agheVar;
        this.b = afjlVar;
        this.c = afkfVar;
        this.d = axxlVar;
    }

    @Override // defpackage.afla
    public final asv a(asv asvVar) {
        Boolean bool;
        aqxe aqxeVar = this.d.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45354110L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45354110L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45354110L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            return new agsu(this.a, this.b, this.c, asvVar);
        }
        asv agswVar = new agsw(asvVar);
        Iterator it = this.a.g().iterator();
        while (true) {
            asv asvVar2 = agswVar;
            if (!it.hasNext()) {
                return asvVar2;
            }
            agpz agpzVar = (agpz) it.next();
            agswVar = new pdh(agpzVar, asvVar2, this.b.a(agpzVar.n()), null, 4, this.c);
        }
    }
}
