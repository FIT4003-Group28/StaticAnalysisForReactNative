package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fad  reason: default package */
/* loaded from: classes6.dex */
public final class fad<T> implements dzsj<T> {
    final /* synthetic */ fae a;
    private final int b;

    public fad(fae faeVar, int i) {
        this.a = faeVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        asla aslaVar;
        atdm atdmVar;
        atdp atdpVar;
        atdr atdrVar;
        atdw atdwVar;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        Object obj21;
        Object obj22;
        switch (this.b) {
            case 0:
                bwqv rD = this.a.z.eW.a.rD();
                dxjg.e(rD);
                return (T) new crmu(rD);
            case 1:
                fae faeVar = this.a;
                bwqv rD2 = faeVar.z.eW.a.rD();
                dxjg.e(rD2);
                Context b = faeVar.z.eW.a.b();
                dxjg.e(b);
                Executor sU = faeVar.z.eW.a.sU();
                dxjg.e(sU);
                Executor sV = faeVar.z.eW.a.sV();
                dxjg.e(sV);
                dxio c = dxjc.c(faeVar.z.eW.cD());
                cqat rR = faeVar.z.eW.a.rR();
                dxjg.e(rR);
                return (T) new crmt(rD2, b, sU, sV, c, rR);
            case 2:
                fae faeVar2 = this.a;
                return (T) new aruq(faeVar2.z.eW.V(), faeVar2.z.eW.I(), faeVar2.d());
            case 3:
                fae faeVar3 = this.a;
                return (T) new aruv(faeVar3.z.eW.I(), faeVar3.z.eW.at());
            case 4:
                return (T) this.a.e();
            case 5:
                fae faeVar4 = this.a;
                dzsj<Context> I = faeVar4.z.eW.I();
                dzsj<cqhn> il = faeVar4.z.eW.il();
                dzsj<aruv> d = faeVar4.d();
                dzsj dzsjVar = faeVar4.b;
                if (dzsjVar == null) {
                    dzsjVar = new fad(faeVar4, 6);
                    faeVar4.b = dzsjVar;
                }
                dzsj dzsjVar2 = dzsjVar;
                fyu fyuVar = faeVar4.z.eW;
                dzsj dzsjVar3 = fyuVar.dF;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fxy(fyuVar, 693);
                    fyuVar.dF = dzsjVar3;
                }
                dzsj<ataf> h = faeVar4.h();
                dzsj dzsjVar4 = faeVar4.c;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new fad(faeVar4, 8);
                    faeVar4.c = dzsjVar4;
                }
                return (T) new arvi(I, il, d, dzsjVar2, dzsjVar3, h, dzsjVar4, dxjh.c(faeVar4.z.m()), faeVar4.z.eW.kb(), faeVar4.z.eW.Q());
            case 6:
                return (T) this.a.f();
            case 7:
                fae faeVar5 = this.a;
                return (T) new ataf(faeVar5.a, faeVar5.b(), faeVar5.a, faeVar5.z.cJ(), faeVar5.g());
            case 8:
                return (T) new arve();
            case 9:
                fae faeVar6 = this.a;
                Object obj23 = faeVar6.d;
                if (obj23 instanceof dxjf) {
                    synchronized (obj23) {
                        obj = faeVar6.d;
                        if (obj instanceof dxjf) {
                            obj = audy.a(faeVar6.z.a);
                            dxjc.d(faeVar6.d, obj);
                            faeVar6.d = obj;
                        }
                    }
                    obj23 = obj;
                }
                return (T) ((atmj) obj23);
            case 10:
                fae faeVar7 = this.a;
                Object obj24 = faeVar7.e;
                if (obj24 instanceof dxjf) {
                    synchronized (obj24) {
                        obj2 = faeVar7.e;
                        if (obj2 instanceof dxjf) {
                            obj2 = audy.b();
                            dxjg.f(obj2);
                            dxjc.d(faeVar7.e, obj2);
                            faeVar7.e = obj2;
                        }
                    }
                    obj24 = obj2;
                }
                return (T) ((atnb) obj24);
            case 11:
                fae faeVar8 = this.a;
                Object obj25 = faeVar8.f;
                if (obj25 instanceof dxjf) {
                    synchronized (obj25) {
                        obj3 = faeVar8.f;
                        if (obj3 instanceof dxjf) {
                            auds audsVar = new auds();
                            audsVar.b();
                            obj3 = audsVar.a();
                            dxjg.f(obj3);
                            dxjc.d(faeVar8.f, obj3);
                            faeVar8.f = obj3;
                        }
                    }
                    obj25 = obj3;
                }
                return (T) ((atnc) obj25);
            case 12:
                fae faeVar9 = this.a;
                Object obj26 = faeVar9.g;
                if (obj26 instanceof dxjf) {
                    synchronized (obj26) {
                        obj4 = faeVar9.g;
                        if (obj4 instanceof dxjf) {
                            obj4 = audv.a();
                            dxjg.f(obj4);
                            dxjc.d(faeVar9.g, obj4);
                            faeVar9.g = obj4;
                        }
                    }
                    obj26 = obj4;
                }
                return (T) ((atne) obj26);
            case 13:
                fae faeVar10 = this.a;
                Object obj27 = faeVar10.h;
                if (obj27 instanceof dxjf) {
                    synchronized (obj27) {
                        obj5 = faeVar10.h;
                        if (obj5 instanceof dxjf) {
                            ftt fttVar = faeVar10.z;
                            rb rbVar = fttVar.a;
                            bvly sG = fttVar.eW.sG();
                            bvlo sF = faeVar10.z.eW.sF();
                            btvo rp = faeVar10.z.eW.a.rp();
                            dxjg.e(rp);
                            obj5 = atdz.a(rbVar, sG, sF, rp.getDirectionsExperimentsParameters().l);
                            dxjc.d(faeVar10.h, obj5);
                            faeVar10.h = obj5;
                        }
                    }
                    obj27 = obj5;
                }
                return (T) ((atee) obj27);
            case 14:
                fae faeVar11 = this.a;
                Object obj28 = faeVar11.i;
                if (obj28 instanceof dxjf) {
                    synchronized (obj28) {
                        obj6 = faeVar11.i;
                        if (obj6 instanceof dxjf) {
                            ftt fttVar2 = faeVar11.z;
                            rb rbVar2 = fttVar2.a;
                            btvo rp2 = fttVar2.eW.a.rp();
                            dxjg.e(rp2);
                            if (rp2.getDirectionsExperimentsParameters().l) {
                                Resources resources = rbVar2.getResources();
                                obj6 = atdz.b(rbVar2, resources.getColor(R.color.google_white), resources.getColor(R.color.google_green300), resources.getColor(R.color.google_green300), resources.getColor(R.color.google_white), resources.getColor(R.color.google_green300), resources.getColor(R.color.google_green300));
                            } else {
                                Resources resources2 = rbVar2.getResources();
                                obj6 = atdz.b(rbVar2, resources2.getColor(R.color.quantum_greywhite1000), resources2.getColor(R.color.qu_google_green_400), resources2.getColor(R.color.quantum_greywhite1000), resources2.getColor(R.color.quantum_greywhite1000), resources2.getColor(R.color.quantum_googgreen), resources2.getColor(R.color.quantum_greywhite1000));
                            }
                            dxjc.d(faeVar11.i, obj6);
                            faeVar11.i = obj6;
                        }
                    }
                    obj28 = obj6;
                }
                return (T) ((ated) obj28);
            case 15:
                return (T) false;
            case 16:
                fae faeVar12 = this.a;
                return (T) new zrl(faeVar12.z.eW.fr(), dxjh.c(faeVar12.z.da()), faeVar12.z.eW.V());
            case 17:
                fae faeVar13 = this.a;
                return (T) new arlw(faeVar13.z.B(), dxjc.c(faeVar13.z.eW.im()), faeVar13.z.wk(), faeVar13.z.tL());
            case 18:
                fae faeVar14 = this.a;
                Object obj29 = faeVar14.j;
                if (obj29 instanceof dxjf) {
                    synchronized (obj29) {
                        obj7 = faeVar14.j;
                        if (obj7 instanceof dxjf) {
                            obj7 = audy.c(faeVar14.z.a);
                            dxjc.d(faeVar14.j, obj7);
                            faeVar14.j = obj7;
                        }
                    }
                    obj29 = obj7;
                }
                return (T) ((atsr) obj29);
            case 19:
                fae faeVar15 = this.a;
                Object obj30 = faeVar15.k;
                if (obj30 instanceof dxjf) {
                    synchronized (obj30) {
                        obj8 = faeVar15.k;
                        if (obj8 instanceof dxjf) {
                            obj8 = dbsg.i(faeVar15.c());
                            dxjc.d(faeVar15.k, obj8);
                            faeVar15.k = obj8;
                        }
                    }
                    obj30 = obj8;
                }
                return (T) ((dbsg) obj30);
            case 20:
                return (T) dbsg.i(this.a.c());
            case 21:
                return (T) new ajae(this.a.z.cp());
            case 22:
                return (T) new atus(this.a.z.eW.jm());
            case 23:
                fae faeVar16 = this.a;
                return (T) new atuw(faeVar16.z.eW.kb(), faeVar16.z.eW.o(), faeVar16.z.eW.oH(), faeVar16.z.eW.oJ());
            case 24:
                return (T) this.a.c();
            case 25:
                fae faeVar17 = this.a;
                Object obj31 = faeVar17.y;
                if (obj31 instanceof dxjf) {
                    synchronized (obj31) {
                        obj9 = faeVar17.y;
                        if (obj9 instanceof dxjf) {
                            atdd c2 = faeVar17.c();
                            Object obj32 = faeVar17.l;
                            if (obj32 instanceof dxjf) {
                                synchronized (obj32) {
                                    obj22 = faeVar17.l;
                                    if (obj22 instanceof dxjf) {
                                        btrm rz = faeVar17.z.eW.a.rz();
                                        dxjg.e(rz);
                                        bvjj rB = faeVar17.z.eW.a.rB();
                                        dxjg.e(rB);
                                        araj ck = faeVar17.z.ck();
                                        aufc sB = faeVar17.z.eW.a.sB();
                                        dxjg.e(sB);
                                        btvo rp3 = faeVar17.z.eW.a.rp();
                                        dxjg.e(rp3);
                                        Executor sU2 = faeVar17.z.eW.a.sU();
                                        dxjg.e(sU2);
                                        asvx pZ = faeVar17.z.eW.pZ();
                                        araa n = ck.n();
                                        rp3.getNavigationParameters().L();
                                        asvz asvzVar = new asvz(rz, rB, n, sB, sU2, pZ);
                                        dxjc.d(faeVar17.l, asvzVar);
                                        faeVar17.l = asvzVar;
                                        obj22 = asvzVar;
                                    }
                                }
                                obj32 = obj22;
                            }
                            asvz asvzVar2 = (asvz) obj32;
                            asla l = faeVar17.l();
                            Object obj33 = faeVar17.m;
                            if (obj33 instanceof dxjf) {
                                synchronized (obj33) {
                                    obj21 = faeVar17.m;
                                    if (obj21 instanceof dxjf) {
                                        atbq atbqVar = faeVar17.a;
                                        btrm rz2 = faeVar17.z.eW.a.rz();
                                        dxjg.e(rz2);
                                        cjqy tr = faeVar17.z.eW.a.tr();
                                        dxjg.e(tr);
                                        cjqq tp = faeVar17.z.eW.a.tp();
                                        dxjg.e(tp);
                                        atdd c3 = faeVar17.c();
                                        asla l2 = faeVar17.l();
                                        final dxio c4 = dxjc.c(faeVar17.z.cu());
                                        akox ap = faeVar17.z.ap();
                                        hwc bB = faeVar17.z.bB();
                                        alhv sr = faeVar17.z.eW.sr();
                                        final dxio c5 = dxjc.c(faeVar17.z.H());
                                        fyu fyuVar2 = faeVar17.z.eW;
                                        dzsj dzsjVar5 = fyuVar2.dG;
                                        if (dzsjVar5 == null) {
                                            aslaVar = l;
                                            dzsjVar5 = new fxy(fyuVar2, 695);
                                            fyuVar2.dG = dzsjVar5;
                                        } else {
                                            aslaVar = l;
                                        }
                                        atdm atdmVar2 = new atdm(atbqVar, rz2, tr, tp, c3, l2, btsp.b(new dbty(c4) { // from class: atdg
                                            private final dxio a;

                                            {
                                                this.a = c4;
                                            }

                                            @Override // defpackage.dbty
                                            public final Object a() {
                                                return ((afwr) this.a.a()).l();
                                            }
                                        }), ap, bB, sr, btsp.b(new dbty(c5) { // from class: atdh
                                            private final dxio a;

                                            {
                                                this.a = c5;
                                            }

                                            @Override // defpackage.dbty
                                            public final Object a() {
                                                return ((qbt) this.a.a()).f();
                                            }
                                        }), dxjc.c(dzsjVar5), 0);
                                        dxjc.d(faeVar17.m, atdmVar2);
                                        faeVar17.m = atdmVar2;
                                        obj21 = atdmVar2;
                                    } else {
                                        aslaVar = l;
                                    }
                                }
                                obj33 = obj21;
                            } else {
                                aslaVar = l;
                            }
                            atdm atdmVar3 = (atdm) obj33;
                            Object obj34 = faeVar17.o;
                            if (obj34 instanceof dxjf) {
                                synchronized (obj34) {
                                    obj19 = faeVar17.o;
                                    if (obj19 instanceof dxjf) {
                                        atbq atbqVar2 = faeVar17.a;
                                        atdd c6 = faeVar17.c();
                                        btrm rz3 = faeVar17.z.eW.a.rz();
                                        dxjg.e(rz3);
                                        atbq atbqVar3 = faeVar17.a;
                                        bvjj rB2 = faeVar17.z.eW.a.rB();
                                        dxjg.e(rB2);
                                        asme asmeVar = new asme(atbqVar3, rB2, dxjc.c(faeVar17.z.eW.k()), faeVar17.z.ea());
                                        atls m = faeVar17.m();
                                        Object obj35 = faeVar17.n;
                                        if (obj35 instanceof dxjf) {
                                            synchronized (obj35) {
                                                obj20 = faeVar17.n;
                                                if (obj20 instanceof dxjf) {
                                                    gga wk = faeVar17.z.wk();
                                                    atdmVar = atdmVar3;
                                                    cjqq tp2 = faeVar17.z.eW.a.tp();
                                                    dxjg.e(tp2);
                                                    obj20 = new atcb(wk, tp2);
                                                    dxjc.d(faeVar17.n, obj20);
                                                    faeVar17.n = obj20;
                                                } else {
                                                    atdmVar = atdmVar3;
                                                }
                                            }
                                            obj35 = obj20;
                                        } else {
                                            atdmVar = atdmVar3;
                                        }
                                        obj19 = new atbz(atbqVar2, c6, rz3, asmeVar, m, (atcb) obj35);
                                        dxjc.d(faeVar17.o, obj19);
                                        faeVar17.o = obj19;
                                    } else {
                                        atdmVar = atdmVar3;
                                    }
                                }
                                obj34 = obj19;
                            } else {
                                atdmVar = atdmVar3;
                            }
                            atbz atbzVar = (atbz) obj34;
                            Object obj36 = faeVar17.p;
                            if (obj36 instanceof dxjf) {
                                synchronized (obj36) {
                                    obj18 = faeVar17.p;
                                    if (obj18 instanceof dxjf) {
                                        atbq atbqVar4 = faeVar17.a;
                                        atdd c7 = faeVar17.c();
                                        atbq atbqVar5 = faeVar17.a;
                                        gga wk2 = faeVar17.z.wk();
                                        btvo rp4 = faeVar17.z.eW.a.rp();
                                        dxjg.e(rp4);
                                        btrm rz4 = faeVar17.z.eW.a.rz();
                                        dxjg.e(rz4);
                                        btyh sJ = faeVar17.z.eW.a.sJ();
                                        dxjg.e(sJ);
                                        atdp atdpVar2 = new atdp(atbqVar4, c7, atbqVar5, wk2, rp4, rz4, sJ);
                                        dxjc.d(faeVar17.p, atdpVar2);
                                        faeVar17.p = atdpVar2;
                                        obj18 = atdpVar2;
                                    }
                                }
                                obj36 = obj18;
                            }
                            atdp atdpVar3 = (atdp) obj36;
                            Object obj37 = faeVar17.q;
                            if (obj37 instanceof dxjf) {
                                synchronized (obj37) {
                                    obj17 = faeVar17.q;
                                    if (obj17 instanceof dxjf) {
                                        atdd c8 = faeVar17.c();
                                        btrm rz5 = faeVar17.z.eW.a.rz();
                                        dxjg.e(rz5);
                                        obj17 = new atdr(c8, rz5);
                                        dxjc.d(faeVar17.q, obj17);
                                        faeVar17.q = obj17;
                                    }
                                }
                                obj37 = obj17;
                            }
                            atdr atdrVar2 = (atdr) obj37;
                            Object obj38 = faeVar17.r;
                            if (obj38 instanceof dxjf) {
                                synchronized (obj38) {
                                    obj16 = faeVar17.r;
                                    if (obj16 instanceof dxjf) {
                                        atdw atdwVar2 = new atdw(faeVar17.a, faeVar17.c(), faeVar17.z.eg(), faeVar17.m().b);
                                        dxjc.d(faeVar17.r, atdwVar2);
                                        faeVar17.r = atdwVar2;
                                        obj16 = atdwVar2;
                                    }
                                }
                                obj38 = obj16;
                            }
                            atdw atdwVar3 = (atdw) obj38;
                            Object obj39 = faeVar17.t;
                            if (obj39 instanceof dxjf) {
                                synchronized (obj39) {
                                    obj14 = faeVar17.t;
                                    if (obj14 instanceof dxjf) {
                                        cqat rR2 = faeVar17.z.eW.a.rR();
                                        dxjg.e(rR2);
                                        ckcw rU = faeVar17.z.eW.a.rU();
                                        dxjg.e(rU);
                                        atbq atbqVar6 = faeVar17.a;
                                        atdd c9 = faeVar17.c();
                                        btrm rz6 = faeVar17.z.eW.a.rz();
                                        dxjg.e(rz6);
                                        broq V = faeVar17.z.V();
                                        akox ap2 = faeVar17.z.ap();
                                        bvrb tn = faeVar17.z.eW.a.tn();
                                        dxjg.e(tn);
                                        akfa rK = faeVar17.z.eW.a.rK();
                                        dxjg.e(rK);
                                        bvjj rB3 = faeVar17.z.eW.a.rB();
                                        dxjg.e(rB3);
                                        dxio c10 = dxjc.c(faeVar17.z.eW.f());
                                        ftt fttVar3 = faeVar17.z;
                                        rb rbVar3 = fttVar3.a;
                                        btvo rp5 = fttVar3.eW.a.rp();
                                        dxjg.e(rp5);
                                        Object obj40 = faeVar17.s;
                                        if (obj40 instanceof dxjf) {
                                            synchronized (obj40) {
                                                obj15 = faeVar17.s;
                                                if (obj15 instanceof dxjf) {
                                                    ftt fttVar4 = faeVar17.z;
                                                    rb rbVar4 = fttVar4.a;
                                                    bvrb tn2 = fttVar4.eW.a.tn();
                                                    dxjg.e(tn2);
                                                    btrm rz7 = faeVar17.z.eW.a.rz();
                                                    dxjg.e(rz7);
                                                    cqat rR3 = faeVar17.z.eW.a.rR();
                                                    dxjg.e(rR3);
                                                    btvo rp6 = faeVar17.z.eW.a.rp();
                                                    dxjg.e(rp6);
                                                    cjqq tp3 = faeVar17.z.eW.a.tp();
                                                    dxjg.e(tp3);
                                                    aufc sB2 = faeVar17.z.eW.a.sB();
                                                    dxjg.e(sB2);
                                                    atdwVar = atdwVar3;
                                                    atdrVar = atdrVar2;
                                                    atdpVar = atdpVar3;
                                                    atzk atzkVar = new atzk(rbVar4, tn2, rz7, rR3, rp6, tp3, sB2, faeVar17.c(), 2, faeVar17.z.ap().aj(), new aluu(rp6.getVectorMapsParameters().h, faeVar17.z.a.getResources().getColor(R.color.ad_badge_background_yellow), rp6.getCategoricalSearchParameters().u()));
                                                    dxjc.d(faeVar17.s, atzkVar);
                                                    faeVar17.s = atzkVar;
                                                    obj15 = atzkVar;
                                                } else {
                                                    atdpVar = atdpVar3;
                                                    atdrVar = atdrVar2;
                                                    atdwVar = atdwVar3;
                                                }
                                            }
                                            obj40 = obj15;
                                        } else {
                                            atdpVar = atdpVar3;
                                            atdrVar = atdrVar2;
                                            atdwVar = atdwVar3;
                                        }
                                        final brdi rj = faeVar17.z.eW.rj();
                                        dxjg.e(faeVar17.z.eW.a.rK());
                                        dxjg.e(faeVar17.z.eW.a.rB());
                                        atyq atyqVar = new atyq();
                                        int i = rp5.getEnrouteParameters().b;
                                        rj.getClass();
                                        atai ataiVar = new atai(rR2, rU, atbqVar6, c9, rz6, V, ap2, tn, rK, rB3, c10, rbVar3, (atzg) obj40, i, new brcw(rj) { // from class: atdy
                                            private final brdi a;

                                            {
                                                this.a = rj;
                                            }

                                            @Override // defpackage.brcw
                                            public final void a() {
                                                this.a.c();
                                            }
                                        }, rp5, atyqVar);
                                        dxjc.d(faeVar17.t, ataiVar);
                                        faeVar17.t = ataiVar;
                                        obj14 = ataiVar;
                                    } else {
                                        atdpVar = atdpVar3;
                                        atdrVar = atdrVar2;
                                        atdwVar = atdwVar3;
                                    }
                                }
                                obj39 = obj14;
                            } else {
                                atdpVar = atdpVar3;
                                atdrVar = atdrVar2;
                                atdwVar = atdwVar3;
                            }
                            atai ataiVar2 = (atai) obj39;
                            Object obj41 = faeVar17.u;
                            if (obj41 instanceof dxjf) {
                                synchronized (obj41) {
                                    obj13 = faeVar17.u;
                                    if (obj13 instanceof dxjf) {
                                        btwd sb = faeVar17.z.eW.a.sb();
                                        dxjg.e(sb);
                                        obj13 = sb.t() ? new atag(faeVar17.z.EW().e(), faeVar17.c()) : null;
                                        dxjc.d(faeVar17.u, obj13);
                                        faeVar17.u = obj13;
                                    }
                                }
                                obj41 = obj13;
                            }
                            atag atagVar = (atag) obj41;
                            atly j = faeVar17.j();
                            atmi k = faeVar17.k();
                            Object obj42 = faeVar17.v;
                            if (obj42 instanceof dxjf) {
                                synchronized (obj42) {
                                    obj12 = faeVar17.v;
                                    if (obj12 instanceof dxjf) {
                                        atbq atbqVar7 = faeVar17.a;
                                        atdd c11 = faeVar17.c();
                                        cqat rR4 = faeVar17.z.eW.a.rR();
                                        dxjg.e(rR4);
                                        btrm rz8 = faeVar17.z.eW.a.rz();
                                        dxjg.e(rz8);
                                        atdx atdxVar = new atdx(atbqVar7, c11, rR4, rz8, false);
                                        dxjc.d(faeVar17.v, atdxVar);
                                        faeVar17.v = atdxVar;
                                        obj12 = atdxVar;
                                    }
                                }
                                obj42 = obj12;
                            }
                            atdx atdxVar2 = (atdx) obj42;
                            atdn atdnVar = new atdn((arre) faeVar17.i());
                            Object obj43 = faeVar17.w;
                            if (obj43 instanceof dxjf) {
                                synchronized (obj43) {
                                    obj11 = faeVar17.w;
                                    if (obj11 instanceof dxjf) {
                                        akox ap3 = faeVar17.z.ap();
                                        ftt fttVar5 = faeVar17.z;
                                        rb rbVar5 = fttVar5.a;
                                        btrm rz9 = fttVar5.eW.a.rz();
                                        dxjg.e(rz9);
                                        cjqy tr2 = faeVar17.z.eW.a.tr();
                                        dxjg.e(tr2);
                                        bvjj rB4 = faeVar17.z.eW.a.rB();
                                        dxjg.e(rB4);
                                        btvo rp7 = faeVar17.z.eW.a.rp();
                                        dxjg.e(rp7);
                                        cqat rR5 = faeVar17.z.eW.a.rR();
                                        dxjg.e(rR5);
                                        obj11 = new auea(ap3, rbVar5, rz9, tr2, rB4, rp7, rR5);
                                        dxjc.d(faeVar17.w, obj11);
                                        faeVar17.w = obj11;
                                    }
                                }
                                obj43 = obj11;
                            }
                            auea aueaVar = (auea) obj43;
                            Object obj44 = faeVar17.x;
                            if (obj44 instanceof dxjf) {
                                synchronized (obj44) {
                                    Object obj45 = faeVar17.x;
                                    if (obj45 instanceof dxjf) {
                                        faeVar17.c();
                                        dxjg.e(faeVar17.z.eW.a.rz());
                                        dxjg.e(faeVar17.z.eW.a.rR());
                                        faeVar17.z.eW.bg();
                                        faeVar17.z.eW.cu();
                                        dxjg.e(faeVar17.z.eW.a.rK());
                                        obj45 = null;
                                        dxjc.d(faeVar17.x, null);
                                        faeVar17.x = null;
                                    }
                                    obj10 = obj45;
                                }
                                obj44 = obj10;
                            }
                            atds atdsVar = (atds) obj44;
                            faeVar17.z.eW.qT();
                            Executor sU3 = faeVar17.z.eW.a.sU();
                            dxjg.e(sU3);
                            btvo rp8 = faeVar17.z.eW.a.rp();
                            dxjg.e(rp8);
                            dccx F = dcdc.F();
                            F.g(c2);
                            F.g(asvzVar2);
                            F.g(aslaVar);
                            F.g(atdmVar);
                            F.g(atbzVar);
                            F.g(atdpVar);
                            F.g(atdrVar);
                            F.g(atdwVar);
                            F.g(ataiVar2);
                            F.g(atdxVar2);
                            F.g(aueaVar);
                            if (atagVar != null) {
                                F.g(atagVar);
                            }
                            F.g(atdnVar);
                            F.g(j);
                            F.g(k);
                            atan atanVar = new atan(F.f(), c2, sU3, rp8);
                            dxjc.d(faeVar17.y, atanVar);
                            faeVar17.y = atanVar;
                            obj9 = atanVar;
                        }
                    }
                    obj31 = obj9;
                }
                return (T) ((atan) obj31);
            default:
                return (T) this.a.l();
        }
    }
}
