package defpackage;
/* compiled from: PG */
/* renamed from: xcs  reason: default package */
/* loaded from: classes7.dex */
public final class xcs {
    private final cqat a;
    private final ckcw b;
    @dzsi
    private eapd c = null;
    @dzsi
    private ckha d = null;

    public xcs(cqat cqatVar, ckcw ckcwVar) {
        this.a = cqatVar;
        this.b = ckcwVar;
    }

    @dzsi
    public static eapd b(Iterable<dopk> iterable) {
        long j = 0;
        for (dopk dopkVar : iterable) {
            for (doom doomVar : dopkVar.f) {
                for (dooo doooVar : doomVar.c) {
                    for (doog doogVar : doooVar.e) {
                        for (dood doodVar : doogVar.e) {
                            if ((doodVar.a & 512) != 0) {
                                dpuc dpucVar = doodVar.m;
                                if (dpucVar == null) {
                                    dpucVar = dpuc.c;
                                }
                                j = Math.max(j, dpucVar.b);
                            }
                        }
                    }
                }
            }
        }
        if (j != 0) {
            return new eapd(j);
        }
        return null;
    }

    private final void c(eaow eaowVar, ckha ckhaVar) {
        ((ckcp) this.b.a(ckhaVar)).a(eaowVar.b);
    }

    public final void a(@dzsi eapd eapdVar, ckha ckhaVar, ckha ckhaVar2) {
        eapd eapdVar2 = new eapd(this.a.b());
        eapd eapdVar3 = this.c;
        boolean z = false;
        if (eapdVar3 != null && !dbsd.a(eapdVar3, eapdVar)) {
            z = true;
        }
        if (eapdVar != null) {
            c(new eaow(eapdVar, eapdVar2), ckhaVar);
        }
        if (z) {
            eapd eapdVar4 = this.c;
            dbsk.s(eapdVar4);
            eaow eaowVar = new eaow(eapdVar4, eapdVar2);
            ckha ckhaVar3 = this.d;
            dbsk.s(ckhaVar3);
            c(eaowVar, ckhaVar3);
        }
        this.d = ckhaVar2;
        this.c = eapdVar;
    }
}
