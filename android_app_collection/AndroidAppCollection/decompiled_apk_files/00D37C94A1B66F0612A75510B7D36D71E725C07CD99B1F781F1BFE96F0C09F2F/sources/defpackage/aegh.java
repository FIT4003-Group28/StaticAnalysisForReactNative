package defpackage;

import java.security.Key;
/* compiled from: PG */
/* renamed from: aegh  reason: default package */
/* loaded from: classes.dex */
public final class aegh extends afla {
    private final amqo a;
    private final Key b;
    private final afkf c;
    private final aadd d;
    private final aeai e;
    private final afjz f;

    public aegh(amqo amqoVar, Key key, afkf afkfVar, aadd aaddVar, afjz afjzVar, aeai aeaiVar) {
        amqoVar.getClass();
        this.a = amqoVar;
        this.b = key;
        this.c = afkfVar;
        aaddVar.getClass();
        this.d = aaddVar;
        this.f = afjzVar;
        this.e = aeaiVar;
    }

    @Override // defpackage.afla
    public final asv a(asv asvVar) {
        axd ayjVar;
        pde pdeVar = (pde) this.a.get();
        if (pdeVar != null) {
            atdy atdyVar = this.d.a().i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            aqwr aqwrVar = atdyVar.c;
            if (aqwrVar == null) {
                aqwrVar = aqwr.a;
            }
            int i = aqwrVar.b;
            if (this.f.B()) {
                ayjVar = new aeak(this.b.getEncoded(), new pdg(pdeVar, i), new byte[4096], this.e);
            } else {
                ayjVar = new ayj(this.b.getEncoded(), new pdg(pdeVar, i), new byte[4096]);
            }
            return new pdh(pdeVar, asvVar, new ayk(this.b.getEncoded(), new pdt("Cache")), ayjVar, 6, this.c);
        }
        return asvVar;
    }
}
