package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agph  reason: default package */
/* loaded from: classes.dex */
public final class agph implements agry {
    private final agux a;
    private final agvq b;
    private final ahdn c;
    private final yni d;
    private final agrf e;

    public agph(agux aguxVar, agvq agvqVar, agrf agrfVar, ahdn ahdnVar, yni yniVar) {
        this.a = aguxVar;
        this.b = agvqVar;
        this.e = agrfVar;
        this.c = ahdnVar;
        this.d = yniVar;
    }

    @Override // defpackage.agry
    public final agrx a(atrf atrfVar) {
        return agrx.a;
    }

    @Override // defpackage.agry
    public final ankt b(afvm afvmVar, atrf atrfVar) {
        agru agruVar;
        agqo a;
        agru agruVar2;
        String g = aakj.g(atrfVar.d);
        if (!g.isEmpty()) {
            atrc atrcVar = atrfVar.e;
            if (atrcVar == null) {
                atrcVar = atrc.b;
            }
            awkr awkrVar = (awkr) atrcVar.qm(awkr.b);
            int aq = akel.aq(atrfVar.c);
            if (aq == 0) {
                aq = 1;
            }
            int i = aq - 1;
            if (i != 1) {
                if (i == 2) {
                    agvx a2 = this.e.a();
                    if (!afvmVar.d().equals(a2.q())) {
                        agruVar2 = agru.b;
                    } else {
                        aglj A = a2.A();
                        if (A == null) {
                            agruVar2 = agru.b;
                        } else if (A.D(g, 2)) {
                            A.v(g);
                            this.d.f(new agoa(g));
                            agruVar2 = agru.a;
                        } else {
                            agruVar2 = agru.b;
                        }
                    }
                    return anlz.q(agruVar2);
                }
                Object[] objArr = new Object[2];
                int aq2 = akel.aq(atrfVar.c);
                if (aq2 == 0) {
                    aq2 = 1;
                }
                objArr[0] = Integer.valueOf(aq2 - 1);
                objArr[1] = 151;
                zep.e("Could not handle action: %s for type %s", objArr);
                return anlz.q(agru.c);
            }
            agvx a3 = this.e.a();
            if (!afvmVar.d().equals(a3.q())) {
                agruVar = agru.b;
            } else {
                aglj A2 = a3.A();
                if (A2 == null) {
                    agruVar = agru.b;
                } else {
                    this.c.b(true);
                    attl b = attl.b(awkrVar.e);
                    if (b == null) {
                        b = attl.UNKNOWN_FORMAT_TYPE;
                    }
                    attl attlVar = b;
                    String str = awkrVar.h;
                    byte[] I = (awkrVar.c & 1) != 0 ? awkrVar.d.I() : null;
                    agqv p = A2.p(g);
                    if (p == null || p.s()) {
                        if (A2.c(g) == null) {
                            int i2 = awkrVar.c;
                            if ((i2 & 4) == 0 || (i2 & 8) == 0) {
                                try {
                                    a = this.a.a(g);
                                } catch (ExecutionException unused) {
                                    agruVar = agru.c;
                                }
                            } else {
                                awky awkyVar = awkrVar.f;
                                if (awkyVar == null) {
                                    awkyVar = awky.a;
                                }
                                awjj awjjVar = awkrVar.g;
                                if (awjjVar == null) {
                                    awjjVar = awjj.a;
                                }
                                aopa createBuilder = atsl.a.createBuilder();
                                String str2 = awkyVar.e;
                                createBuilder.copyOnWrite();
                                atsl atslVar = (atsl) createBuilder.instance;
                                str2.getClass();
                                atslVar.b |= 1;
                                atslVar.c = str2;
                                String str3 = awkyVar.g;
                                createBuilder.copyOnWrite();
                                atsl atslVar2 = (atsl) createBuilder.instance;
                                str3.getClass();
                                atslVar2.b |= 8;
                                atslVar2.f = str3;
                                long seconds = TimeUnit.MILLISECONDS.toSeconds(awkyVar.h);
                                createBuilder.copyOnWrite();
                                atsl atslVar3 = (atsl) createBuilder.instance;
                                atslVar3.b |= 32;
                                atslVar3.h = seconds;
                                int i3 = awkyVar.i;
                                createBuilder.copyOnWrite();
                                atsl atslVar4 = (atsl) createBuilder.instance;
                                atslVar4.b |= 8192;
                                atslVar4.o = i3;
                                String a4 = ahdq.a(awkyVar.i);
                                createBuilder.copyOnWrite();
                                atsl atslVar5 = (atsl) createBuilder.instance;
                                a4.getClass();
                                atslVar5.b |= 16;
                                atslVar5.g = a4;
                                long j = awkyVar.m;
                                createBuilder.copyOnWrite();
                                atsl atslVar6 = (atsl) createBuilder.instance;
                                atslVar6.b |= 64;
                                atslVar6.i = j;
                                awku awkuVar = awkyVar.q;
                                if (awkuVar == null) {
                                    awkuVar = awku.a;
                                }
                                String str4 = awkuVar.c;
                                createBuilder.copyOnWrite();
                                atsl atslVar7 = (atsl) createBuilder.instance;
                                str4.getClass();
                                atslVar7.b |= 1024;
                                atslVar7.l = str4;
                                awku awkuVar2 = awkyVar.q;
                                if (awkuVar2 == null) {
                                    awkuVar2 = awku.a;
                                }
                                String str5 = awkuVar2.d;
                                createBuilder.copyOnWrite();
                                atsl atslVar8 = (atsl) createBuilder.instance;
                                str5.getClass();
                                atslVar8.b |= 2048;
                                atslVar8.m = str5;
                                awku awkuVar3 = awkyVar.q;
                                if (awkuVar3 == null) {
                                    awkuVar3 = awku.a;
                                }
                                String str6 = awkuVar3.e;
                                createBuilder.copyOnWrite();
                                atsl atslVar9 = (atsl) createBuilder.instance;
                                str6.getClass();
                                atslVar9.b |= 4096;
                                atslVar9.n = str6;
                                avhn avhnVar = awkyVar.j;
                                if (avhnVar == null) {
                                    avhnVar = avhn.a;
                                }
                                createBuilder.copyOnWrite();
                                atsl atslVar10 = (atsl) createBuilder.instance;
                                avhnVar.getClass();
                                atslVar10.d = avhnVar;
                                atslVar10.b |= 2;
                                aopa createBuilder2 = atqf.a.createBuilder();
                                aopa createBuilder3 = atqe.a.createBuilder();
                                String str7 = awjjVar.e;
                                createBuilder3.copyOnWrite();
                                atqe atqeVar = (atqe) createBuilder3.instance;
                                str7.getClass();
                                atqeVar.b |= 1;
                                atqeVar.c = str7;
                                String str8 = awjjVar.f;
                                createBuilder3.copyOnWrite();
                                atqe atqeVar2 = (atqe) createBuilder3.instance;
                                str8.getClass();
                                atqeVar2.b |= 4;
                                atqeVar2.e = str8;
                                avhn avhnVar2 = awjjVar.g;
                                if (avhnVar2 == null) {
                                    avhnVar2 = avhn.a;
                                }
                                createBuilder3.copyOnWrite();
                                atqe atqeVar3 = (atqe) createBuilder3.instance;
                                avhnVar2.getClass();
                                atqeVar3.d = avhnVar2;
                                atqeVar3.b |= 2;
                                createBuilder2.copyOnWrite();
                                atqf atqfVar = (atqf) createBuilder2.instance;
                                atqe atqeVar4 = (atqe) createBuilder3.mo39build();
                                atqeVar4.getClass();
                                atqfVar.c = atqeVar4;
                                atqfVar.b |= 1;
                                atqf atqfVar2 = (atqf) createBuilder2.mo39build();
                                createBuilder.copyOnWrite();
                                atsl atslVar11 = (atsl) createBuilder.instance;
                                atqfVar2.getClass();
                                atslVar11.e = atqfVar2;
                                atslVar11.b |= 4;
                                aopc aopcVar = (aopc) arag.a.createBuilder();
                                aopc aopcVar2 = (aopc) arai.a.createBuilder();
                                awma awmaVar = awkyVar.k;
                                if (awmaVar == null) {
                                    awmaVar = awma.a;
                                }
                                String str9 = awmaVar.c;
                                aopcVar2.copyOnWrite();
                                arai araiVar = (arai) aopcVar2.instance;
                                str9.getClass();
                                araiVar.b |= 1;
                                araiVar.c = str9;
                                aopcVar.ch((arai) aopcVar2.mo39build());
                                createBuilder.copyOnWrite();
                                atsl atslVar12 = (atsl) createBuilder.instance;
                                arag aragVar = (arag) aopcVar.mo39build();
                                aragVar.getClass();
                                atslVar12.k = aragVar;
                                atslVar12.b |= 512;
                                a = agqo.c((atsl) createBuilder.mo39build());
                            }
                            if (A2.ac(a, attlVar, str, this.b.U(attlVar), agqn.OFFLINE_IMMEDIATELY, 0, I, agqe.ACTIVE)) {
                                agqa agqaVar = a.a;
                                if (agqaVar != null) {
                                    if (A2.c.b(agqaVar.a) == null) {
                                        A2.c.c(agqaVar);
                                    } else {
                                        A2.c.d(agqaVar);
                                    }
                                }
                                a3.m().w(g, true);
                                agruVar = agru.a;
                            } else {
                                agruVar = agru.c;
                            }
                        } else {
                            A2.R(g, agqe.ACTIVE, attlVar, str, 0, I);
                            A2.E(g);
                            A2.V(g, agqe.ACTIVE);
                            a3.m().w(g, true);
                            agruVar = agru.a;
                        }
                    } else if (p.u() && (!p.a() || p.y() || p.t() || p.r())) {
                        a3.l().c(g);
                        A2.V(g, agqe.ACTIVE);
                        A2.x(g);
                        a3.m().w(g, true);
                        agruVar = agru.a;
                    } else if (!p.e) {
                        A2.E(g);
                        a3.m().w(g, false);
                        agruVar = agru.a;
                    } else {
                        agruVar = agru.a;
                    }
                }
            }
            return anlz.q(agruVar);
        }
        return anlz.q(agru.c);
    }

    @Override // defpackage.agry
    public final ankt c(afvm afvmVar, amuk amukVar) {
        throw new UnsupportedOperationException();
    }
}
