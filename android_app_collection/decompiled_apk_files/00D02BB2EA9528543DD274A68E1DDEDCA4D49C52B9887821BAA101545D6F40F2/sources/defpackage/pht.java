package defpackage;

import java.util.Collections;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: pht  reason: default package */
/* loaded from: classes7.dex */
public final class pht<T> extends btrh<T> {
    public pht(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        pfn pfnVar;
        dbsg dbsgVar;
        phs phsVar = (phs) this.a;
        pfp pfpVar = (pfp) obj;
        if (!phsVar.b.c()) {
            return;
        }
        if (pfpVar.b - 1 != 0) {
            pfnVar = pfn.CONTEXT_ENDED;
        } else {
            pfnVar = pfn.CONTEXT_STARTED;
        }
        ilo iloVar = pfpVar.a;
        dcep<String> as = iloVar.as();
        dkjk dkjkVar = phsVar.b.a.getExploreMapParametersWithoutLogging().b;
        if (dkjkVar == null) {
            dkjkVar = dkjk.b;
        }
        if (!Collections.disjoint(as, dkjkVar.a)) {
            dbsgVar = dbpy.a;
        } else {
            akqq aj = iloVar.aj();
            if (aj != null) {
                akqi ai = iloVar.ai();
                dghx bZ = dghy.e.bZ();
                String o = ai.o();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dghy dghyVar = (dghy) bZ.b;
                o.getClass();
                dghyVar.a |= 1;
                dghyVar.b = o;
                if (ai.b == 0) {
                    String decsVar = ai.n().toString();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dghy dghyVar2 = (dghy) bZ.b;
                    decsVar.getClass();
                    dghyVar2.a |= 2;
                    dghyVar2.c = decsVar;
                }
                dfof bZ2 = dfoi.h.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dfoi dfoiVar = (dfoi) bZ2.b;
                dghy bK = bZ.bK();
                bK.getClass();
                dfoiVar.b = bK;
                dfoiVar.a |= 1;
                dgbj bZ3 = dgbk.d.bZ();
                double d = aj.a;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dgbk dgbkVar = (dgbk) bZ3.b;
                int i = dgbkVar.a | 1;
                dgbkVar.a = i;
                dgbkVar.b = d;
                double d2 = aj.b;
                dgbkVar.a = i | 2;
                dgbkVar.c = d2;
                dgbk bK2 = bZ3.bK();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dfoi dfoiVar2 = (dfoi) bZ2.b;
                bK2.getClass();
                dfoiVar2.c = bK2;
                dfoiVar2.a |= 2;
                String n = iloVar.n();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dfoi dfoiVar3 = (dfoi) bZ2.b;
                n.getClass();
                dfoiVar3.a |= 4;
                dfoiVar3.d = n;
                String uri = iloVar.ax().build().toString();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dfoi dfoiVar4 = (dfoi) bZ2.b;
                uri.getClass();
                dfoiVar4.a |= 8;
                dfoiVar4.e = uri;
                boolean aW = iloVar.aW();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dfoi dfoiVar5 = (dfoi) bZ2.b;
                dfoiVar5.a |= 32;
                dfoiVar5.g = aW;
                if ((iloVar.h().c & 512) != 0) {
                    dpxf cz = iloVar.cz();
                    dfog bZ4 = dfoh.f.bZ();
                    dpxe dpxeVar = cz.d;
                    if (dpxeVar == null) {
                        dpxeVar = dpxe.g;
                    }
                    int i2 = dpxeVar.c;
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dfoh dfohVar = (dfoh) bZ4.b;
                    dfohVar.a |= 1;
                    dfohVar.b = i2;
                    dpxe dpxeVar2 = cz.d;
                    if (dpxeVar2 == null) {
                        dpxeVar2 = dpxe.g;
                    }
                    int i3 = dpxeVar2.d;
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dfoh dfohVar2 = (dfoh) bZ4.b;
                    dfohVar2.a |= 2;
                    dfohVar2.c = i3;
                    dpxe dpxeVar3 = cz.d;
                    if (dpxeVar3 == null) {
                        dpxeVar3 = dpxe.g;
                    }
                    int i4 = dpxeVar3.e;
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dfoh dfohVar3 = (dfoh) bZ4.b;
                    dfohVar3.a |= 4;
                    dfohVar3.d = i4;
                    dpxe dpxeVar4 = cz.d;
                    if (dpxeVar4 == null) {
                        dpxeVar4 = dpxe.g;
                    }
                    int i5 = dpxeVar4.f;
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dfoh dfohVar4 = (dfoh) bZ4.b;
                    dfohVar4.a |= 8;
                    dfohVar4.e = i5;
                    dfoh bK3 = bZ4.bK();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dfoi dfoiVar6 = (dfoi) bZ2.b;
                    bK3.getClass();
                    dfoiVar6.f = bK3;
                    dfoiVar6.a |= 16;
                }
                long micros = TimeUnit.MILLISECONDS.toMicros(phsVar.a.b());
                dfol bZ5 = dfoo.e.bZ();
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                dfoo dfooVar = (dfoo) bZ5.b;
                dfooVar.b = 3;
                dfooVar.a |= 1;
                if (pfnVar == pfn.CONTEXT_STARTED) {
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dfoo dfooVar2 = (dfoo) bZ5.b;
                    dfooVar2.a |= 2;
                    dfooVar2.c = micros;
                } else {
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dfoo dfooVar3 = (dfoo) bZ5.b;
                    dfooVar3.a |= 4;
                    dfooVar3.d = micros;
                }
                dfoj dfojVar = (dfoj) dfok.f.bZ();
                dfnz bZ6 = dfoc.d.bZ();
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                dfoc dfocVar = (dfoc) bZ6.b;
                dfocVar.b = 1;
                dfocVar.a |= 1;
                dfoc dfocVar2 = (dfoc) bZ6.b;
                dfocVar2.c = 1;
                dfocVar2.a |= 2;
                if (dfojVar.c) {
                    dfojVar.bF();
                    dfojVar.c = false;
                }
                dfok dfokVar = (dfok) dfojVar.b;
                dfoc bK4 = bZ6.bK();
                bK4.getClass();
                dfokVar.b = bK4;
                dfokVar.a |= 1;
                ddya bZ7 = ddyb.e.bZ();
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                ddyb ddybVar = (ddyb) bZ7.b;
                int i6 = ddybVar.a | 1;
                ddybVar.a = i6;
                ddybVar.b = micros;
                int i7 = i6 | 2;
                ddybVar.a = i7;
                ddybVar.c = 0;
                ddybVar.a = i7 | 4;
                ddybVar.d = 0;
                ddyb bK5 = bZ7.bK();
                if (dfojVar.c) {
                    dfojVar.bF();
                    dfojVar.c = false;
                }
                dfok dfokVar2 = (dfok) dfojVar.b;
                bK5.getClass();
                dfokVar2.d = bK5;
                dfokVar2.a |= 4;
                dfoo bK6 = bZ5.bK();
                bK6.getClass();
                dfokVar2.e = bK6;
                dfokVar2.a |= 16;
                String o2 = iloVar.ai().o();
                if (dfojVar.c) {
                    dfojVar.bF();
                    dfojVar.c = false;
                }
                dfok dfokVar3 = (dfok) dfojVar.b;
                o2.getClass();
                dfokVar3.a |= 2;
                dfokVar3.c = o2;
                dsqv<dfok, dfoe> dsqvVar = dfoe.e;
                dfod bZ8 = dfoe.d.bZ();
                if (bZ8.c) {
                    bZ8.bF();
                    bZ8.c = false;
                }
                dfoe dfoeVar = (dfoe) bZ8.b;
                dfoeVar.c = 1;
                dfoeVar.a |= 2;
                dfoi bK7 = bZ2.bK();
                bK7.getClass();
                dfoeVar.b = bK7;
                dfoeVar.a |= 1;
                dfojVar.k(dsqvVar, bZ8.bK());
                dbsgVar = dbsg.i((dfok) dfojVar.bK());
            } else {
                dbsgVar = dbpy.a;
            }
        }
        if (!dbsgVar.a()) {
            return;
        }
        dfok dfokVar4 = (dfok) dbsgVar.b();
        pfe<dfoe> pfeVar = phsVar.c;
        if (pfeVar == null) {
            return;
        }
        pfeVar.a(new pfo<>(pfl.a(dfokVar4, dfoe.e), pfnVar));
    }
}
