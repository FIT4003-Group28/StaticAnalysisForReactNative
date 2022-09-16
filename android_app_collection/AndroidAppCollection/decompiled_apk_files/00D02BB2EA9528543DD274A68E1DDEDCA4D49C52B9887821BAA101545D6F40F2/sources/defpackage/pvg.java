package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: pvg  reason: default package */
/* loaded from: classes7.dex */
public final class pvg<T> extends btrh<T> {
    private final int d;

    public pvg(Class<?> cls, T t) {
        super(cls, t);
        this.d = 10;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        switch (this.d) {
            case 0:
                ((pus) this.a).a((amqo) obj);
                return;
            case 1:
                ((pus) this.a).a.bD((amqp) obj);
                return;
            case 2:
                srj srjVar = (srj) obj;
                puy puyVar = ((pus) this.a).a;
                gek gekVar = puyVar.bg;
                dbsk.s(gekVar);
                puyVar.bU(12, gekVar.c, false, false, true);
                return;
            case 3:
                srd srdVar = (srd) obj;
                prx prxVar = ((pus) this.a).a.d;
                if (prxVar == null) {
                    return;
                }
                prxVar.k(5, true, null);
                return;
            case 4:
                src srcVar = (src) obj;
                prx prxVar2 = ((pus) this.a).a.d;
                if (prxVar2 == null) {
                    return;
                }
                prxVar2.k(5, true, null);
                return;
            case 5:
                ((pus) this.a).b((ahjy) obj);
                return;
            case 6:
                puy puyVar2 = ((pus) this.a).a;
                amub amubVar = ((alco) obj).a;
                bvrj.UI_THREAD.c();
                if (!puyVar2.aD) {
                    return;
                }
                gga ggaVar = puyVar2.aE;
                dbsk.s(ggaVar);
                if (amubVar == puyVar2.aT.aU(ggaVar)) {
                    return;
                }
                puyVar2.bB.b(amubVar.c);
                return;
            case 7:
                pus pusVar = (pus) this.a;
                alhw alhwVar = (alhw) obj;
                synchronized (pusVar.a.aT) {
                    pusVar.a.aT.ag();
                }
                return;
            case 8:
                aldu alduVar = (aldu) obj;
                pvk pvkVar = ((pus) this.a).a.bh;
                if (pvkVar == null) {
                    return;
                }
                pvkVar.c.t(alduVar.a());
                return;
            case 9:
                azre azreVar = (azre) obj;
                final puy puyVar3 = ((pus) this.a).a;
                puyVar3.ag.b(new Runnable(puyVar3) { // from class: pur
                    private final puy a;

                    {
                        this.a = puyVar3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.bt();
                    }
                }, bvrj.BACKGROUND_THREADPOOL);
                return;
            default:
                pus pusVar2 = (pus) this.a;
                sri sriVar = (sri) obj;
                synchronized (pusVar2.a.aT) {
                    if (sriVar.b != null) {
                        dowr dowrVar = pusVar2.a.aT.h().g;
                        if (dowrVar == null) {
                            dowrVar = dowr.m;
                        }
                        dowi ca = dowr.m.ca(dowrVar);
                        srh srhVar = sriVar.b;
                        if (srhVar != null) {
                            for (Map.Entry<vux, Integer> entry : srhVar.a.entrySet()) {
                                vuz.b(ca, entry);
                            }
                        }
                        dwal ca2 = dwao.R.ca(pusVar2.a.aT.h());
                        if (ca2.c) {
                            ca2.bF();
                            ca2.c = false;
                        }
                        dwao dwaoVar = (dwao) ca2.b;
                        dowr bK = ca.bK();
                        bK.getClass();
                        dwaoVar.g = bK;
                        dwaoVar.a |= 4;
                        pusVar2.a.aT.R(ca2.bK());
                    }
                }
                return;
        }
    }

    public pvg(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }
}
