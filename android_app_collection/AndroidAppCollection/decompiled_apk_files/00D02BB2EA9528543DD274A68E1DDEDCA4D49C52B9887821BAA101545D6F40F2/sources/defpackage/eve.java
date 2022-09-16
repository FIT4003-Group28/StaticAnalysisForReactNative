package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eve  reason: default package */
/* loaded from: classes6.dex */
public final class eve<T> implements dzsj<T> {
    final /* synthetic */ evf a;
    private final int b;

    public eve(evf evfVar, int i) {
        this.a = evfVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        aswk aswkVar;
        aswk aswkVar2;
        Object obj2;
        aszs aszsVar;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return (T) asyc.a(this.a.l.a);
            }
            if (i == 2) {
                int i2 = asyc.a;
                return (T) false;
            } else if (i != 3) {
                return i != 4 ? (T) this.a.c() : (T) this.a.b();
            } else {
                evf evfVar = this.a;
                Object obj11 = evfVar.d;
                if (obj11 instanceof dxjf) {
                    synchronized (obj11) {
                        obj10 = evfVar.d;
                        if (obj10 instanceof dxjf) {
                            obj10 = dbsg.i(evfVar.b());
                            dxjc.d(evfVar.d, obj10);
                            evfVar.d = obj10;
                        }
                    }
                    obj11 = obj10;
                }
                return (T) ((dbsg) obj11);
            }
        }
        evf evfVar2 = this.a;
        Object obj12 = evfVar2.k;
        if (obj12 instanceof dxjf) {
            synchronized (obj12) {
                obj = evfVar2.k;
                if (obj instanceof dxjf) {
                    Object obj13 = evfVar2.j;
                    if (obj13 instanceof dxjf) {
                        synchronized (obj13) {
                            obj2 = evfVar2.j;
                            if (obj2 instanceof dxjf) {
                                asxm b = evfVar2.b();
                                Object obj14 = evfVar2.b;
                                if (obj14 instanceof dxjf) {
                                    synchronized (obj14) {
                                        obj9 = evfVar2.b;
                                        if (obj9 instanceof dxjf) {
                                            btrm rz = evfVar2.l.eW.a.rz();
                                            dxjg.e(rz);
                                            bvjj rB = evfVar2.l.eW.a.rB();
                                            dxjg.e(rB);
                                            araj ck = evfVar2.l.ck();
                                            aufc sB = evfVar2.l.eW.a.sB();
                                            dxjg.e(sB);
                                            evfVar2.l.eW.jq();
                                            asxm b2 = evfVar2.b();
                                            Executor sU = evfVar2.l.eW.a.sU();
                                            dxjg.e(sU);
                                            dxjg.e(evfVar2.l.eW.a.rp());
                                            obj9 = asyc.i(rz, rB, ck, sB, b2, sU, evfVar2.l.eW.pZ());
                                            dxjc.d(evfVar2.b, obj9);
                                            evfVar2.b = obj9;
                                        }
                                    }
                                    obj14 = obj9;
                                }
                                aswi aswiVar = (aswi) obj14;
                                askx c = evfVar2.c();
                                Object obj15 = evfVar2.c;
                                if (obj15 instanceof dxjf) {
                                    synchronized (obj15) {
                                        obj8 = evfVar2.c;
                                        if (obj8 instanceof dxjf) {
                                            dxjg.e(evfVar2.l.eW.a.rB());
                                            aswz aswzVar = evfVar2.a;
                                            asxm b3 = evfVar2.b();
                                            btrm rz2 = evfVar2.l.eW.a.rz();
                                            dxjg.e(rz2);
                                            askx c2 = evfVar2.c();
                                            akox ap = evfVar2.l.ap();
                                            dxio c3 = dxjc.c(evfVar2.l.H());
                                            cjqy tr = evfVar2.l.eW.a.tr();
                                            dxjg.e(tr);
                                            dxjg.e(evfVar2.l.eW.a.rp());
                                            aufc sB2 = evfVar2.l.eW.a.sB();
                                            dxjg.e(sB2);
                                            dxio c4 = dxjc.c(evfVar2.l.eW.hj());
                                            Executor sU2 = evfVar2.l.eW.a.sU();
                                            dxjg.e(sU2);
                                            obj8 = asyc.h(aswzVar, b3, rz2, c2, ap, c3, tr, sB2, c4, sU2);
                                            dxjc.d(evfVar2.c, obj8);
                                            evfVar2.c = obj8;
                                        }
                                    }
                                    obj15 = obj8;
                                }
                                asxe asxeVar = (asxe) obj15;
                                asxg d = evfVar2.d();
                                aszs e = evfVar2.e();
                                Object obj16 = evfVar2.e;
                                if (obj16 instanceof dxjf) {
                                    synchronized (obj16) {
                                        obj7 = evfVar2.e;
                                        if (obj7 instanceof dxjf) {
                                            ftt fttVar = evfVar2.l;
                                            rb rbVar = fttVar.a;
                                            axrx p = fttVar.p();
                                            axrg aH = evfVar2.l.eW.aH();
                                            aswz aswzVar2 = evfVar2.a;
                                            bvjj rB2 = evfVar2.l.eW.a.rB();
                                            dxjg.e(rB2);
                                            aswkVar2 = aswkVar;
                                            aszsVar = e;
                                            obj7 = new aswn(rbVar, p, aH, aswzVar2, new asme(aswzVar2, rB2, dxjc.c(evfVar2.l.eW.k()), evfVar2.l.ea()), evfVar2.b());
                                            dxjc.d(evfVar2.e, obj7);
                                            evfVar2.e = obj7;
                                        } else {
                                            aswkVar2 = aswkVar;
                                            aszsVar = e;
                                        }
                                    }
                                    obj16 = obj7;
                                } else {
                                    aswkVar2 = aswkVar;
                                    aszsVar = e;
                                }
                                aswn aswnVar = (aswn) obj16;
                                Object obj17 = evfVar2.f;
                                if (obj17 instanceof dxjf) {
                                    synchronized (obj17) {
                                        obj6 = evfVar2.f;
                                        if (obj6 instanceof dxjf) {
                                            asxm b4 = evfVar2.b();
                                            btrm rz3 = evfVar2.l.eW.a.rz();
                                            dxjg.e(rz3);
                                            obj6 = new aslx(b4, rz3);
                                            dxjc.d(evfVar2.f, obj6);
                                            evfVar2.f = obj6;
                                        }
                                    }
                                    obj17 = obj6;
                                }
                                aslx aslxVar = (aslx) obj17;
                                Object obj18 = evfVar2.h;
                                if (obj18 instanceof dxjf) {
                                    synchronized (obj18) {
                                        obj4 = evfVar2.h;
                                        if (obj4 instanceof dxjf) {
                                            dxio c5 = dxjc.c(evfVar2.l.eW.f());
                                            ckcw rU = evfVar2.l.eW.a.rU();
                                            dxjg.e(rU);
                                            btvo rp = evfVar2.l.eW.a.rp();
                                            dxjg.e(rp);
                                            cqat rR = evfVar2.l.eW.a.rR();
                                            dxjg.e(rR);
                                            aswz aswzVar3 = evfVar2.a;
                                            asxm b5 = evfVar2.b();
                                            ftt fttVar2 = evfVar2.l;
                                            rb rbVar2 = fttVar2.a;
                                            btrm rz4 = fttVar2.eW.a.rz();
                                            dxjg.e(rz4);
                                            bvjj rB3 = evfVar2.l.eW.a.rB();
                                            dxjg.e(rB3);
                                            akfa rK = evfVar2.l.eW.a.rK();
                                            dxjg.e(rK);
                                            akox ap2 = evfVar2.l.ap();
                                            broq V = evfVar2.l.V();
                                            bvrb tn = evfVar2.l.eW.a.tn();
                                            dxjg.e(tn);
                                            Object obj19 = evfVar2.g;
                                            if (obj19 instanceof dxjf) {
                                                synchronized (obj19) {
                                                    obj5 = evfVar2.g;
                                                    if (obj5 instanceof dxjf) {
                                                        bvrb tn2 = evfVar2.l.eW.a.tn();
                                                        dxjg.e(tn2);
                                                        btrm rz5 = evfVar2.l.eW.a.rz();
                                                        dxjg.e(rz5);
                                                        cqat rR2 = evfVar2.l.eW.a.rR();
                                                        dxjg.e(rR2);
                                                        btvo rp2 = evfVar2.l.eW.a.rp();
                                                        dxjg.e(rp2);
                                                        cjqq tp = evfVar2.l.eW.a.tp();
                                                        dxjg.e(tp);
                                                        aufc sB3 = evfVar2.l.eW.a.sB();
                                                        dxjg.e(sB3);
                                                        obj5 = asyc.c(tn2, rz5, rR2, rp2, tp, sB3, evfVar2.b(), evfVar2.l.ap(), evfVar2.l.a);
                                                        dxjc.d(evfVar2.g, obj5);
                                                        evfVar2.g = obj5;
                                                    }
                                                }
                                                obj19 = obj5;
                                            }
                                            brdi rj = evfVar2.l.eW.rj();
                                            dxjg.e(evfVar2.l.eW.a.rK());
                                            dxjg.e(evfVar2.l.eW.a.rB());
                                            obj4 = asyc.d(c5, rU, rp, rR, aswzVar3, b5, rbVar2, rz4, rB3, rK, ap2, V, tn, (atzg) obj19, rj, new atyq());
                                            dxjc.d(evfVar2.h, obj4);
                                            evfVar2.h = obj4;
                                        }
                                    }
                                    obj18 = obj4;
                                }
                                asxk asxkVar = (asxk) obj18;
                                Object obj20 = evfVar2.i;
                                if (obj20 instanceof dxjf) {
                                    synchronized (obj20) {
                                        obj3 = evfVar2.i;
                                        if (obj3 instanceof dxjf) {
                                            btvo rp3 = evfVar2.l.eW.a.rp();
                                            dxjg.e(rp3);
                                            obj3 = asyc.g(rp3, evfVar2.l.EW(), evfVar2.b());
                                            dxjc.d(evfVar2.i, obj3);
                                            evfVar2.i = obj3;
                                        }
                                    }
                                    obj20 = obj3;
                                }
                                obj2 = asyc.e(b, aswiVar, c, asxeVar, d, aszsVar, aswnVar, aslxVar, asxkVar, (aslu) obj20);
                                dxjg.f(obj2);
                                dxjc.d(evfVar2.j, obj2);
                                evfVar2.j = obj2;
                            } else {
                                aswkVar2 = aswkVar;
                            }
                        }
                        obj13 = obj2;
                    } else {
                        aswkVar2 = aswkVar;
                    }
                    aswk aswkVar3 = new aswk((List) obj13, evfVar2.b(), evfVar2.e());
                    dxjc.d(evfVar2.k, aswkVar3);
                    evfVar2.k = aswkVar3;
                    obj = aswkVar3;
                }
            }
            obj12 = obj;
        }
        return (T) ((aswk) obj12);
    }
}
