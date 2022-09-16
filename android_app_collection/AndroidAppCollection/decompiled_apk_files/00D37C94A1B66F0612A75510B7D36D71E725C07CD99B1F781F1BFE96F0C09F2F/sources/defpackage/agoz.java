package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: agoz  reason: default package */
/* loaded from: classes.dex */
public final class agoz implements agry {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final aahf d;
    private final snc e;
    private final yni f;

    public agoz(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, snc sncVar, yni yniVar, aahf aahfVar) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.e = sncVar;
        this.f = yniVar;
        this.d = aahfVar;
    }

    private final agru d(afvm afvmVar, String str, atrc atrcVar) {
        amuk r;
        int ak;
        atse u;
        int ak2;
        agvx a = ((agrf) this.c.get()).a();
        if (!afvmVar.d().equals(a.q())) {
            return agru.b;
        }
        aglj A = a.A();
        if (A == null) {
            return agru.b;
        }
        try {
            ampq ampqVar = (ampq) a.m().h(str).get(30L, TimeUnit.SECONDS);
            if (ampqVar.h()) {
                PlayerResponseModel m = A.m(str);
                if (m == null || (u = m.u()) == null || (ak2 = akel.ak(u.h)) == 0 || ak2 != 2) {
                    try {
                        PlayerResponseModel l = ((ahdl) this.a.get()).l(str, 2, ((atym) atrcVar.qm(atym.b)).d.I());
                        boolean G = A.G(str, l, this.e.c(), true, (aanz) this.b.get());
                        atse u2 = l.u();
                        boolean z = false;
                        if (aijr.i(l.t()) && u2 != null && (ak = akel.ak(u2.h)) != 0 && ak == 2) {
                            z = true;
                        }
                        if (!z) {
                            A.V(str, agqe.CANNOT_OFFLINE);
                            this.f.f(new agog((agqv) ampqVar.c(), atsg.NOT_PLAYABLE));
                        }
                        if (!G || !z) {
                            return agru.c;
                        }
                        agrt a2 = agru.a();
                        a2.a = 2;
                        atym atymVar = (atym) atrcVar.qm(atym.b);
                        int i = (atymVar.c & 64) != 0 ? atymVar.i : -1;
                        aopc aopcVar = (aopc) atrcVar.mo52toBuilder();
                        aopcVar.copyOnWrite();
                        atrc atrcVar2 = (atrc) aopcVar.instance;
                        atrcVar2.c |= 1;
                        atrcVar2.d = i;
                        atrc atrcVar3 = (atrc) aopcVar.mo39build();
                        aopa createBuilder = atrf.a.createBuilder();
                        createBuilder.copyOnWrite();
                        atrf atrfVar = (atrf) createBuilder.instance;
                        atrfVar.c = 1;
                        atrfVar.b |= 1;
                        String f = aakj.f(120, str);
                        createBuilder.copyOnWrite();
                        atrf atrfVar2 = (atrf) createBuilder.instance;
                        f.getClass();
                        atrfVar2.b |= 2;
                        atrfVar2.d = f;
                        createBuilder.copyOnWrite();
                        atrf atrfVar3 = (atrf) createBuilder.instance;
                        atrcVar3.getClass();
                        atrfVar3.e = atrcVar3;
                        atrfVar3.b |= 4;
                        atrf atrfVar4 = (atrf) createBuilder.mo39build();
                        VideoStreamingData videoStreamingData = l.c;
                        if (videoStreamingData == null || videoStreamingData.o().isEmpty()) {
                            r = amuk.r(atrfVar4);
                        } else {
                            aopa createBuilder2 = atrf.a.createBuilder();
                            createBuilder2.copyOnWrite();
                            atrf atrfVar5 = (atrf) createBuilder2.instance;
                            atrfVar5.c = 1;
                            atrfVar5.b |= 1;
                            String f2 = aakj.f(146, str);
                            createBuilder2.copyOnWrite();
                            atrf atrfVar6 = (atrf) createBuilder2.instance;
                            f2.getClass();
                            atrfVar6.b |= 2;
                            atrfVar6.d = f2;
                            createBuilder2.copyOnWrite();
                            atrf atrfVar7 = (atrf) createBuilder2.instance;
                            atrcVar3.getClass();
                            atrfVar7.e = atrcVar3;
                            atrfVar7.b |= 4;
                            createBuilder2.aE(atrfVar4);
                            r = amuk.r((atrf) createBuilder2.mo39build());
                        }
                        a2.b(r);
                        return a2.a();
                    } catch (aart unused) {
                        return agru.c;
                    }
                }
                return agru.a;
            }
            return agru.c;
        } catch (InterruptedException | ExecutionException | TimeoutException unused2) {
            return agru.b;
        }
    }

    @Override // defpackage.agry
    public final agrx a(atrf atrfVar) {
        return agrx.a;
    }

    @Override // defpackage.agry
    public final ankt b(afvm afvmVar, atrf atrfVar) {
        amuk q;
        agru a;
        String g = aakj.g(atrfVar.d);
        int aq = akel.aq(atrfVar.c);
        if (aq == 0) {
            aq = 1;
        }
        int i = aq - 1;
        if (i == 1) {
            atrc atrcVar = atrfVar.e;
            if (atrcVar == null) {
                atrcVar = atrc.b;
            }
            return anlz.q(d(afvmVar, g, atrcVar));
        } else if (i == 2) {
            atrc atrcVar2 = atrfVar.e;
            if (atrcVar2 == null) {
                atrcVar2 = atrc.b;
            }
            agvx a2 = ((agrf) this.c.get()).a();
            if (!afvmVar.d().equals(a2.q())) {
                a = agru.b;
            } else if (a2.A() == null) {
                a = agru.b;
            } else {
                agrt a3 = agru.a();
                a3.a = 2;
                aahe a4 = this.d.a(afvmVar);
                String f = aakj.f(146, g);
                if (((aajj) a4.f(f).W()) != null) {
                    aopc aopcVar = (aopc) atrcVar2.mo52toBuilder();
                    if (!new aops(((atrc) aopcVar.instance).e, atrc.a).contains(atra.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK)) {
                        aopcVar.cm(atra.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK);
                    }
                    aopa createBuilder = atrf.a.createBuilder();
                    createBuilder.copyOnWrite();
                    atrf atrfVar2 = (atrf) createBuilder.instance;
                    atrfVar2.c = 2;
                    atrfVar2.b = 1 | atrfVar2.b;
                    createBuilder.copyOnWrite();
                    atrf atrfVar3 = (atrf) createBuilder.instance;
                    f.getClass();
                    atrfVar3.b = 2 | atrfVar3.b;
                    atrfVar3.d = f;
                    createBuilder.copyOnWrite();
                    atrf atrfVar4 = (atrf) createBuilder.instance;
                    atrc atrcVar3 = (atrc) aopcVar.mo39build();
                    atrcVar3.getClass();
                    atrfVar4.e = atrcVar3;
                    atrfVar4.b |= 4;
                    q = amuk.r((atrf) createBuilder.mo39build());
                } else {
                    q = amuk.q();
                }
                a3.b(q);
                a = a3.a();
            }
            return anlz.q(a);
        } else {
            Object[] objArr = new Object[2];
            int aq2 = akel.aq(atrfVar.c);
            if (aq2 == 0) {
                aq2 = 1;
            }
            objArr[0] = Integer.valueOf(aq2 - 1);
            objArr[1] = 119;
            zep.e("Could not handle action: %s for type %s", objArr);
            return anlz.q(agru.c);
        }
    }

    @Override // defpackage.agry
    public final ankt c(afvm afvmVar, amuk amukVar) {
        throw new UnsupportedOperationException();
    }
}
