package defpackage;
/* compiled from: PG */
/* renamed from: aoos  reason: default package */
/* loaded from: classes2.dex */
final class aoos implements angt<aogb, aoge> {
    private final gfv a;
    private final angz b;
    private final angv c;
    private final aoqb d;
    private final Runnable e;

    public aoos(gfv gfvVar, angz angzVar, angv angvVar, aoqb aoqbVar, Runnable runnable) {
        this.a = gfvVar;
        this.b = angzVar;
        this.c = angvVar;
        this.d = aoqbVar;
        this.e = runnable;
    }

    @Override // defpackage.angt
    public final void a(angu<aogb, aoge> anguVar) {
        dvat dvatVar;
        dvat dvatVar2;
        bvrj.UI_THREAD.c();
        aouv aouvVar = (aouv) anguVar;
        angs<D> angsVar = aouvVar.c;
        angf angfVar = (angf) angsVar;
        if (angfVar.a == angr.ABSENT) {
            this.c.c((aogb) aouvVar.b, dbpy.a);
        } else if (angfVar.a == angr.PENDING_PARTIAL_DATA && this.d.n()) {
            this.e.run();
            aoge aogeVar = (aoge) angsVar.f();
            dbsg<aogy> s = this.d.s();
            dbsg<ilo> r = this.d.r();
            dbsg dbsgVar = dbpy.a;
            if (s.a() && r.a()) {
                aogf a = s.b().a();
                String str = r.b().h().g;
                dcdc<dvay> b = aogeVar.b();
                int size = b.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        dvay dvayVar = b.get(i);
                        dvax b2 = dvax.b(dvayVar.m);
                        if (b2 == null) {
                            b2 = dvax.UNKNOWN;
                        }
                        if (b2 == dvax.STOP) {
                            dwyn dwynVar = dvayVar.f;
                            if (dwynVar == null) {
                                dwynVar = dwyn.d;
                            }
                            dwyn dwynVar2 = dvayVar.g;
                            if (dwynVar2 == null) {
                                dwynVar2 = dwyn.d;
                            }
                            if (!aogf.d(dwynVar, dwynVar2).equals(a)) {
                                continue;
                            } else {
                                if (dvayVar.b == 7) {
                                    dvatVar = (dvat) dvayVar.c;
                                } else {
                                    dvatVar = dvat.g;
                                }
                                if (dvatVar.b.size() != 0) {
                                    if (dvayVar.b == 7) {
                                        dvatVar2 = (dvat) dvayVar.c;
                                    } else {
                                        dvatVar2 = dvat.g;
                                    }
                                    dvyw dvywVar = dvatVar2.b.get(0).b;
                                    if (dvywVar == null) {
                                        dvywVar = dvyw.bv;
                                    }
                                    if (dvywVar.g.equals(str)) {
                                        dvap dvapVar = dvayVar.e;
                                        if (dvapVar == null) {
                                            dvapVar = dvap.d;
                                        }
                                        dbsgVar = dbsg.i(aoha.d(dvapVar));
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        i++;
                    } else {
                        dbsgVar = dbpy.a;
                        break;
                    }
                }
            }
            this.a.Nw(anhf.b(dbsgVar));
            return;
        }
        this.b.a(this.d.b());
    }
}
