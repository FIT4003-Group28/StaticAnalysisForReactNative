package defpackage;
/* compiled from: PG */
/* renamed from: asjm  reason: default package */
/* loaded from: classes2.dex */
public final class asjm<T> extends btrh<T> {
    public asjm(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        final asjl asjlVar = (asjl) this.a;
        crhp crhpVar = (crhp) obj;
        asjk asjkVar = asjk.WAIT_FOR_ON_CREATE;
        int ordinal = asjlVar.ap.i.ordinal();
        if (ordinal == 0) {
            bvoo.h("Impossible WAIT_FOR_ON_CREATE", new Object[0]);
            return;
        }
        boolean z = true;
        if (ordinal == 1) {
            if (!crhpVar.b()) {
                asjlVar.ap.i = asjk.WAIT_FOR_PREREQUISITE_DIALOGS;
                asjlVar.g();
                return;
            }
            asjlVar.ap.i = asjk.WAIT_FOR_OLD_SERVICE_STOP;
            if (asjlVar.ap.i != asjk.WAIT_FOR_OLD_SERVICE_STOP) {
                z = false;
            }
            dbsk.l(z);
            bvoo.k(new asjj(crhpVar));
            asjlVar.ag.d(false);
        } else if (ordinal == 2) {
            if (crhpVar.b()) {
                return;
            }
            asjlVar.ap.i = asjk.WAIT_FOR_PREREQUISITE_DIALOGS;
            asjlVar.g();
        } else if (ordinal == 3) {
            asjlVar.g();
        } else if (ordinal == 4) {
            asjlVar.i();
        } else if (ordinal != 5 || !crhpVar.b()) {
        } else {
            asjlVar.ap.i = asjk.DONE;
            crfo crfoVar = asjlVar.ap.q;
            dbsk.s(crfoVar);
            final arym arymVar = crfoVar.a;
            final gga ggaVar = asjlVar.aE;
            dbsk.s(ggaVar);
            asjlVar.al.b(new Runnable(asjlVar, arymVar, ggaVar) { // from class: asjf
                private final asjl a;
                private final arym b;
                private final gga c;

                {
                    this.a = asjlVar;
                    this.b = arymVar;
                    this.c = ggaVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ges gesVar;
                    asjl asjlVar2 = this.a;
                    arym arymVar2 = this.b;
                    gga ggaVar2 = this.c;
                    if (asjlVar2.aD) {
                        if (arymVar2 == arym.FREE_NAV) {
                            gesVar = (ges) gfp.a(aswz.class, null);
                        } else {
                            crfo crfoVar2 = asjlVar2.ap.q;
                            boolean z2 = crfoVar2 != null ? crfoVar2.a().j().b : false;
                            atlr bZ = atls.k.bZ();
                            crfo crfoVar3 = asjlVar2.ap.q;
                            dbsk.s(crfoVar3);
                            String c = crfoVar3.a().a.c();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            atls atlsVar = (atls) bZ.b;
                            c.getClass();
                            int i = atlsVar.a | 1;
                            atlsVar.a = i;
                            atlsVar.b = c;
                            boolean z3 = asjlVar2.ah.g;
                            int i2 = i | 2;
                            atlsVar.a = i2;
                            atlsVar.c = z3;
                            asjo asjoVar = asjlVar2.ap;
                            boolean z4 = asjoVar.k;
                            int i3 = i2 | 4;
                            atlsVar.a = i3;
                            atlsVar.d = z4;
                            boolean z5 = asjoVar.l;
                            int i4 = i3 | 16;
                            atlsVar.a = i4;
                            atlsVar.f = z5;
                            boolean z6 = asjoVar.m;
                            int i5 = i4 | 64;
                            atlsVar.a = i5;
                            atlsVar.h = z6;
                            int i6 = i5 | 32;
                            atlsVar.a = i6;
                            atlsVar.g = z2;
                            boolean z7 = asjoVar.n;
                            int i7 = i6 | 128;
                            atlsVar.a = i7;
                            atlsVar.i = z7;
                            boolean z8 = asjoVar.o;
                            atlsVar.a = i7 | 256;
                            atlsVar.j = z8;
                            gesVar = (ges) gfp.a(atbq.class, atbq.aJ(bZ.bK()));
                        }
                        ggaVar2.D(gesVar);
                        return;
                    }
                    asjlVar2.ap.i = asjk.WAIT_FOR_SERVICE_START;
                }
            }, bvrj.UI_THREAD);
        }
    }
}
