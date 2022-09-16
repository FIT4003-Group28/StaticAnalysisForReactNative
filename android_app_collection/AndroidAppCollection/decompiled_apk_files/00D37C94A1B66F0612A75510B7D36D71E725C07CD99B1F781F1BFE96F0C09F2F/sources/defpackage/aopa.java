package defpackage;

import com.google.protos.youtube.api.innertube.ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint;
import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
import com.google.protos.youtube.api.innertube.ShortsCreationEndpointOuterClass$ShortsCreationEndpoint;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aopa  reason: default package */
/* loaded from: classes.dex */
public class aopa extends aonj implements aoqv {
    private final aopi defaultInstance;
    public aopi instance;
    protected boolean isBuilt;

    public aopa() {
        dnl dnlVar = dnl.a;
        throw null;
    }

    private void mergeFromInstance(aopi aopiVar, aopi aopiVar2) {
        aore.a.b(aopiVar).g(aopiVar, aopiVar2);
    }

    public final void A(String str, tqz tqzVar) {
        str.getClass();
        tqzVar.getClass();
        copyOnWrite();
        trb trbVar = trb.a;
        ((trb) this.instance).a().put(str, tqzVar);
    }

    public final void B(String str) {
        str.getClass();
        copyOnWrite();
        trb trbVar = trb.a;
        ((trb) this.instance).a().remove(str);
    }

    public final void C(aono aonoVar) {
        copyOnWrite();
        uio uioVar = (uio) this.instance;
        uio uioVar2 = uio.a;
        aonoVar.getClass();
        aopu aopuVar = uioVar.b;
        if (!aopuVar.c()) {
            uioVar.b = aopi.mutableCopy(aopuVar);
        }
        uioVar.b.add(aonoVar);
    }

    public final void D(String str) {
        copyOnWrite();
        uip uipVar = (uip) this.instance;
        uip uipVar2 = uip.a;
        str.getClass();
        uipVar.a();
        uipVar.b.add(str);
    }

    public final void E(String str) {
        copyOnWrite();
        vcd vcdVar = (vcd) this.instance;
        vcd vcdVar2 = vcd.a;
        str.getClass();
        aopu aopuVar = vcdVar.c;
        if (!aopuVar.c()) {
            vcdVar.c = aopi.mutableCopy(aopuVar);
        }
        vcdVar.c.add(str);
    }

    public final void F(String str, vcd vcdVar) {
        str.getClass();
        vcdVar.getClass();
        copyOnWrite();
        vch vchVar = vch.a;
        ((vch) this.instance).a().put(str, vcdVar);
    }

    public final void G(Iterable iterable) {
        copyOnWrite();
        alcw alcwVar = (alcw) this.instance;
        alcw alcwVar2 = alcw.a;
        aopu aopuVar = alcwVar.R;
        if (!aopuVar.c()) {
            alcwVar.R = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll(iterable, (List) alcwVar.R);
    }

    public final void H(int i, amds amdsVar) {
        amdsVar.getClass();
        copyOnWrite();
        amdp amdpVar = amdp.a;
        ((amdp) this.instance).a().put(Integer.valueOf(i), amdsVar);
    }

    public final void I(amkg amkgVar) {
        copyOnWrite();
        amkh amkhVar = (amkh) this.instance;
        amkh amkhVar2 = amkh.a;
        amkgVar.getClass();
        aopu aopuVar = amkhVar.d;
        if (!aopuVar.c()) {
            amkhVar.d = aopi.mutableCopy(aopuVar);
        }
        amkhVar.d.add(amkgVar);
    }

    public final void J(anfc anfcVar) {
        copyOnWrite();
        anfd anfdVar = (anfd) this.instance;
        anfd anfdVar2 = anfd.a;
        anfcVar.getClass();
        aopu aopuVar = anfdVar.b;
        if (!aopuVar.c()) {
            anfdVar.b = aopi.mutableCopy(aopuVar);
        }
        anfdVar.b.add(anfcVar);
    }

    public final void K(aoob aoobVar) {
        copyOnWrite();
        anva anvaVar = (anva) this.instance;
        anva anvaVar2 = anva.a;
        anvaVar.a();
        anvaVar.d.add(aoobVar);
    }

    public final void L(Iterable iterable) {
        copyOnWrite();
        aofy aofyVar = (aofy) this.instance;
        aofy aofyVar2 = aofy.a;
        aopq aopqVar = aofyVar.f;
        if (!aopqVar.c()) {
            aofyVar.f = aopi.mutableCopy(aopqVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            aofyVar.f.g(((aoet) it.next()).getNumber());
        }
    }

    public final void M(aosz aoszVar) {
        copyOnWrite();
        aota aotaVar = (aota) this.instance;
        aopr aoprVar = aota.a;
        aoszVar.getClass();
        aopq aopqVar = aotaVar.c;
        if (!aopqVar.c()) {
            aotaVar.c = aopi.mutableCopy(aopqVar);
        }
        aotaVar.c.g(aoszVar.A);
    }

    public final void N(aotb aotbVar) {
        copyOnWrite();
        aota aotaVar = (aota) this.instance;
        aopr aoprVar = aota.a;
        aotbVar.getClass();
        aopu aopuVar = aotaVar.d;
        if (!aopuVar.c()) {
            aotaVar.d = aopi.mutableCopy(aopuVar);
        }
        aotaVar.d.add(aotbVar);
    }

    public final void O(aota aotaVar) {
        copyOnWrite();
        aotb aotbVar = (aotb) this.instance;
        aopr aoprVar = aotb.a;
        aotaVar.getClass();
        aopu aopuVar = aotbVar.d;
        if (!aopuVar.c()) {
            aotbVar.d = aopi.mutableCopy(aopuVar);
        }
        aotbVar.d.add(aotaVar);
    }

    public final void P(aosz aoszVar) {
        copyOnWrite();
        aotb aotbVar = (aotb) this.instance;
        aopr aoprVar = aotb.a;
        aoszVar.getClass();
        aopq aopqVar = aotbVar.c;
        if (!aopqVar.c()) {
            aotbVar.c = aopi.mutableCopy(aopqVar);
        }
        aotbVar.c.g(aoszVar.A);
    }

    public final void Q(aota aotaVar) {
        copyOnWrite();
        aotc aotcVar = (aotc) this.instance;
        aotc aotcVar2 = aotc.a;
        aotaVar.getClass();
        aotcVar.c = aotaVar;
        aotcVar.b = 2;
    }

    public final void R(aosz aoszVar) {
        copyOnWrite();
        aotc aotcVar = (aotc) this.instance;
        aotc aotcVar2 = aotc.a;
        aotcVar.c = Integer.valueOf(aoszVar.A);
        aotcVar.b = 1;
    }

    public final void S(aotb aotbVar) {
        copyOnWrite();
        aotc aotcVar = (aotc) this.instance;
        aotc aotcVar2 = aotc.a;
        aotbVar.getClass();
        aotcVar.c = aotbVar;
        aotcVar.b = 3;
    }

    public final void T(long j) {
        copyOnWrite();
        aotf aotfVar = (aotf) this.instance;
        aotf aotfVar2 = aotf.a;
        aotfVar.a();
        aotfVar.l.f(j);
    }

    public final void U(float f) {
        copyOnWrite();
        aotm aotmVar = (aotm) this.instance;
        aotm aotmVar2 = aotm.a;
        aopp aoppVar = aotmVar.e;
        if (!aoppVar.c()) {
            aotmVar.e = aopi.mutableCopy(aoppVar);
        }
        aotmVar.e.h(f);
    }

    public final void V(int i) {
        copyOnWrite();
        aoub aoubVar = (aoub) this.instance;
        aoub aoubVar2 = aoub.a;
        aoubVar.a();
        aoubVar.b.remove(i);
    }

    public final void W(Iterable iterable) {
        copyOnWrite();
        aoue aoueVar = (aoue) this.instance;
        aoue aoueVar2 = aoue.a;
        aopu aopuVar = aoueVar.b;
        if (!aopuVar.c()) {
            aoueVar.b = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll(iterable, (List) aoueVar.b);
    }

    public final void X(aopa aopaVar) {
        copyOnWrite();
        rqj rqjVar = (rqj) this.instance;
        rqk rqkVar = (rqk) aopaVar.mo39build();
        rqj rqjVar2 = rqj.a;
        rqkVar.getClass();
        aopu aopuVar = rqjVar.b;
        if (!aopuVar.c()) {
            rqjVar.b = aopi.mutableCopy(aopuVar);
        }
        rqjVar.b.add(rqkVar);
    }

    public final apsj Y(int i) {
        return (apsj) ((apsm) this.instance).m.get(i);
    }

    public final void Z(int i, aopa aopaVar) {
        copyOnWrite();
        apsm apsmVar = (apsm) this.instance;
        apsj apsjVar = (apsj) aopaVar.mo39build();
        apsm apsmVar2 = apsm.a;
        apsjVar.getClass();
        aopu aopuVar = apsmVar.m;
        if (!aopuVar.c()) {
            apsmVar.m = aopi.mutableCopy(aopuVar);
        }
        apsmVar.m.set(i, apsjVar);
    }

    public final void aA(atcl atclVar) {
        copyOnWrite();
        atdi atdiVar = (atdi) this.instance;
        aopr aoprVar = atdi.a;
        atclVar.getClass();
        aopq aopqVar = atdiVar.c;
        if (!aopqVar.c()) {
            atdiVar.c = aopi.mutableCopy(aopqVar);
        }
        atdiVar.c.g(atclVar.i);
    }

    public final void aB(Iterable iterable) {
        copyOnWrite();
        atep atepVar = (atep) this.instance;
        atep atepVar2 = atep.a;
        atepVar.a();
        aonk.addAll(iterable, (List) atepVar.c);
    }

    public final void aC(aopa aopaVar) {
        copyOnWrite();
        atep atepVar = (atep) this.instance;
        aten atenVar = (aten) aopaVar.mo39build();
        atep atepVar2 = atep.a;
        atenVar.getClass();
        atepVar.a();
        atepVar.c.add(atenVar);
    }

    public final void aD(int i, aopa aopaVar) {
        copyOnWrite();
        atep atepVar = (atep) this.instance;
        aten atenVar = (aten) aopaVar.mo39build();
        atep atepVar2 = atep.a;
        atenVar.getClass();
        atepVar.a();
        atepVar.c.set(i, atenVar);
    }

    public final void aE(atrf atrfVar) {
        copyOnWrite();
        atrf atrfVar2 = (atrf) this.instance;
        atrf atrfVar3 = atrf.a;
        atrfVar.getClass();
        aopu aopuVar = atrfVar2.f;
        if (!aopuVar.c()) {
            atrfVar2.f = aopi.mutableCopy(aopuVar);
        }
        atrfVar2.f.add(atrfVar);
    }

    public final void aF(atxn atxnVar) {
        copyOnWrite();
        atxm atxmVar = (atxm) this.instance;
        atxm atxmVar2 = atxm.a;
        atxnVar.getClass();
        aopu aopuVar = atxmVar.b;
        if (!aopuVar.c()) {
            atxmVar.b = aopi.mutableCopy(aopuVar);
        }
        atxmVar.b.add(atxnVar);
    }

    public final void aG(aues auesVar) {
        copyOnWrite();
        aueq aueqVar = (aueq) this.instance;
        aueq aueqVar2 = aueq.a;
        auesVar.getClass();
        aopu aopuVar = aueqVar.d;
        if (!aopuVar.c()) {
            aueqVar.d = aopi.mutableCopy(aopuVar);
        }
        aueqVar.d.add(auesVar);
    }

    public final void aH(String str) {
        copyOnWrite();
        auoh auohVar = (auoh) this.instance;
        auoh auohVar2 = auoh.a;
        str.getClass();
        aopu aopuVar = auohVar.d;
        if (!aopuVar.c()) {
            auohVar.d = aopi.mutableCopy(aopuVar);
        }
        auohVar.d.add(str);
    }

    public final void aI(Iterable iterable) {
        copyOnWrite();
        auqh auqhVar = (auqh) this.instance;
        auqh auqhVar2 = auqh.a;
        auqhVar.a();
        aonk.addAll(iterable, (List) auqhVar.d);
    }

    public final void aJ(auqk auqkVar) {
        copyOnWrite();
        auqh auqhVar = (auqh) this.instance;
        auqh auqhVar2 = auqh.a;
        auqkVar.getClass();
        auqhVar.a();
        auqhVar.d.add(auqkVar);
    }

    public final void aK(aopa aopaVar) {
        copyOnWrite();
        auqh auqhVar = (auqh) this.instance;
        auqk auqkVar = (auqk) aopaVar.mo39build();
        auqh auqhVar2 = auqh.a;
        auqkVar.getClass();
        auqhVar.a();
        auqhVar.d.add(auqkVar);
    }

    public final void aL(aopc aopcVar) {
        copyOnWrite();
        aurm aurmVar = (aurm) this.instance;
        aunb aunbVar = (aunb) aopcVar.mo39build();
        aurm aurmVar2 = aurm.a;
        aunbVar.getClass();
        aurmVar.a();
        aurmVar.d.add(aunbVar);
    }

    public final aurp aM(int i) {
        return (aurp) ((aurt) this.instance).f.get(i);
    }

    public final auwf aN(int i) {
        return (auwf) ((auwe) this.instance).c.get(i);
    }

    public final void aO(int i, aopa aopaVar) {
        copyOnWrite();
        auwe auweVar = (auwe) this.instance;
        auwf auwfVar = (auwf) aopaVar.mo39build();
        auwe auweVar2 = auwe.a;
        auwfVar.getClass();
        auweVar.a();
        auweVar.c.set(i, auwfVar);
    }

    public final void aP(auwz auwzVar) {
        copyOnWrite();
        auxj auxjVar = (auxj) this.instance;
        auxj auxjVar2 = auxj.a;
        auwzVar.getClass();
        aopu aopuVar = auxjVar.c;
        if (!aopuVar.c()) {
            auxjVar.c = aopi.mutableCopy(aopuVar);
        }
        auxjVar.c.add(auwzVar);
    }

    public final void aQ(auxq auxqVar) {
        copyOnWrite();
        auxr auxrVar = (auxr) this.instance;
        auxr auxrVar2 = auxr.a;
        auxqVar.getClass();
        auxrVar.a();
        auxrVar.c.add(auxqVar);
    }

    public final void aR(Iterable iterable) {
        copyOnWrite();
        aven avenVar = (aven) this.instance;
        aven avenVar2 = aven.a;
        aopu aopuVar = avenVar.h;
        if (!aopuVar.c()) {
            avenVar.h = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll(iterable, (List) avenVar.h);
    }

    public final void aS(int i) {
        copyOnWrite();
        avgq avgqVar = (avgq) this.instance;
        avgq avgqVar2 = avgq.a;
        aopq aopqVar = avgqVar.p;
        if (!aopqVar.c()) {
            avgqVar.p = aopi.mutableCopy(aopqVar);
        }
        avgqVar.p.g(i - 2);
    }

    public final void aT(arag aragVar) {
        copyOnWrite();
        avny avnyVar = (avny) this.instance;
        avny avnyVar2 = avny.a;
        aragVar.getClass();
        aopu aopuVar = avnyVar.f;
        if (!aopuVar.c()) {
            avnyVar.f = aopi.mutableCopy(aopuVar);
        }
        avnyVar.f.add(aragVar);
    }

    public final void aU(aopa aopaVar) {
        copyOnWrite();
        avxl avxlVar = (avxl) this.instance;
        avxk avxkVar = (avxk) aopaVar.mo39build();
        avxl avxlVar2 = avxl.a;
        avxkVar.getClass();
        aopu aopuVar = avxlVar.c;
        if (!aopuVar.c()) {
            avxlVar.c = aopi.mutableCopy(aopuVar);
        }
        avxlVar.c.add(avxkVar);
    }

    public final void aV(avxz avxzVar) {
        copyOnWrite();
        avyg avygVar = (avyg) this.instance;
        avyg avygVar2 = avyg.a;
        avxzVar.getClass();
        aopu aopuVar = avygVar.c;
        if (!aopuVar.c()) {
            avygVar.c = aopi.mutableCopy(aopuVar);
        }
        avygVar.c.add(avxzVar);
    }

    public final void aW(avyd avydVar) {
        copyOnWrite();
        avyg avygVar = (avyg) this.instance;
        avyg avygVar2 = avyg.a;
        avydVar.getClass();
        aopu aopuVar = avygVar.d;
        if (!aopuVar.c()) {
            avygVar.d = aopi.mutableCopy(aopuVar);
        }
        avygVar.d.add(avydVar);
    }

    public final void aX(awkb awkbVar) {
        copyOnWrite();
        awkc awkcVar = (awkc) this.instance;
        awkc awkcVar2 = awkc.a;
        awkbVar.getClass();
        aopu aopuVar = awkcVar.e;
        if (!aopuVar.c()) {
            awkcVar.e = aopi.mutableCopy(aopuVar);
        }
        awkcVar.e.add(awkbVar);
    }

    public final void aY(String str, awnf awnfVar) {
        awnfVar.getClass();
        copyOnWrite();
        awne awneVar = (awne) this.instance;
        awne awneVar2 = awne.a;
        aoqp aoqpVar = awneVar.c;
        if (!aoqpVar.b) {
            awneVar.c = aoqpVar.a();
        }
        awneVar.c.put(str, awnfVar);
    }

    public final void aZ(String str) {
        str.getClass();
        copyOnWrite();
        awtd awtdVar = (awtd) this.instance;
        awtd awtdVar2 = awtd.a;
        aoqp aoqpVar = awtdVar.d;
        if (!aoqpVar.b) {
            awtdVar.d = aoqpVar.a();
        }
        awtdVar.d.put(str, true);
    }

    public final void aa(Iterable iterable) {
        copyOnWrite();
        aqeq aqeqVar = (aqeq) this.instance;
        aqeq aqeqVar2 = aqeq.a;
        aopu aopuVar = aqeqVar.c;
        if (!aopuVar.c()) {
            aqeqVar.c = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll(iterable, (List) aqeqVar.c);
    }

    public final void ab(arag aragVar) {
        copyOnWrite();
        aqft aqftVar = (aqft) this.instance;
        aqft aqftVar2 = aqft.a;
        aragVar.getClass();
        aqftVar.a();
        aqftVar.g.add(aragVar);
    }

    public final void ac(String str) {
        copyOnWrite();
        aqwu aqwuVar = (aqwu) this.instance;
        aopr aoprVar = aqwu.a;
        str.getClass();
        aopu aopuVar = aqwuVar.Z;
        if (!aopuVar.c()) {
            aqwuVar.Z = aopi.mutableCopy(aopuVar);
        }
        aqwuVar.Z.add(str);
    }

    public final void ad(aopc aopcVar) {
        copyOnWrite();
        aqyd aqydVar = (aqyd) this.instance;
        aunb aunbVar = (aunb) aopcVar.mo39build();
        aqyd aqydVar2 = aqyd.a;
        aunbVar.getClass();
        aqydVar.a();
        aqydVar.c.add(aunbVar);
    }

    public final void ae(int i, aopc aopcVar) {
        copyOnWrite();
        aqyd aqydVar = (aqyd) this.instance;
        aunb aunbVar = (aunb) aopcVar.mo39build();
        aqyd aqydVar2 = aqyd.a;
        aunbVar.getClass();
        aqydVar.a();
        aqydVar.c.set(i, aunbVar);
    }

    public final void af(Iterable iterable) {
        copyOnWrite();
        arln arlnVar = (arln) this.instance;
        arln arlnVar2 = arln.a;
        aopu aopuVar = arlnVar.d;
        if (!aopuVar.c()) {
            arlnVar.d = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll(iterable, (List) arlnVar.d);
    }

    public final void ag(aopa aopaVar) {
        copyOnWrite();
        armc armcVar = (armc) this.instance;
        arlw arlwVar = (arlw) aopaVar.mo39build();
        armc armcVar2 = armc.a;
        arlwVar.getClass();
        armcVar.a();
        armcVar.c.add(arlwVar);
    }

    public final void ah(Iterable iterable) {
        copyOnWrite();
        arrj arrjVar = (arrj) this.instance;
        arrj arrjVar2 = arrj.a;
        aopu aopuVar = arrjVar.f;
        if (!aopuVar.c()) {
            arrjVar.f = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll(iterable, (List) arrjVar.f);
    }

    public final void ai(int i) {
        copyOnWrite();
        arub arubVar = (arub) this.instance;
        arub arubVar2 = arub.a;
        aopq aopqVar = arubVar.e;
        if (!aopqVar.c()) {
            arubVar.e = aopi.mutableCopy(aopqVar);
        }
        arubVar.e.g(i - 1);
    }

    public final aqzx aj(int i) {
        return (aqzx) ((asan) this.instance).e.get(i);
    }

    public final void ak(aqzx aqzxVar) {
        copyOnWrite();
        asan asanVar = (asan) this.instance;
        asan asanVar2 = asan.a;
        aqzxVar.getClass();
        asanVar.a();
        asanVar.e.add(aqzxVar);
    }

    public final void al(Iterable iterable) {
        copyOnWrite();
        asan asanVar = (asan) this.instance;
        asan asanVar2 = asan.a;
        asanVar.a();
        aonk.addAll(iterable, (List) asanVar.e);
    }

    public final void am(Iterable iterable) {
        copyOnWrite();
        asan asanVar = (asan) this.instance;
        asan asanVar2 = asan.a;
        asanVar.b();
        aonk.addAll(iterable, (List) asanVar.d);
    }

    public final void an(aqzx aqzxVar) {
        copyOnWrite();
        asan asanVar = (asan) this.instance;
        asan asanVar2 = asan.a;
        aqzxVar.getClass();
        asanVar.b();
        asanVar.d.add(aqzxVar);
    }

    public final void ao(Iterable iterable) {
        copyOnWrite();
        asis asisVar = (asis) this.instance;
        asis asisVar2 = asis.a;
        aopu aopuVar = asisVar.b;
        if (!aopuVar.c()) {
            asisVar.b = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll(iterable, (List) asisVar.b);
    }

    public final void ap(aske askeVar) {
        copyOnWrite();
        asjj asjjVar = (asjj) this.instance;
        asjj asjjVar2 = asjj.a;
        askeVar.getClass();
        asjjVar.a();
        asjjVar.f.add(askeVar);
    }

    public final void aq(aopa aopaVar) {
        copyOnWrite();
        asjj asjjVar = (asjj) this.instance;
        aske askeVar = (aske) aopaVar.mo39build();
        asjj asjjVar2 = asjj.a;
        askeVar.getClass();
        asjjVar.a();
        asjjVar.f.add(askeVar);
    }

    public final void ar(aopc aopcVar) {
        copyOnWrite();
        askq askqVar = (askq) this.instance;
        askp askpVar = (askp) aopcVar.mo39build();
        askq askqVar2 = askq.a;
        askpVar.getClass();
        aopu aopuVar = askqVar.d;
        if (!aopuVar.c()) {
            askqVar.d = aopi.mutableCopy(aopuVar);
        }
        askqVar.d.add(askpVar);
    }

    public final void as(asnp asnpVar) {
        copyOnWrite();
        asnq asnqVar = (asnq) this.instance;
        asnq asnqVar2 = asnq.a;
        asnpVar.getClass();
        aopu aopuVar = asnqVar.j;
        if (!aopuVar.c()) {
            asnqVar.j = aopi.mutableCopy(aopuVar);
        }
        asnqVar.j.add(asnpVar);
    }

    public final apok at() {
        return (apok) ((asur) this.instance).g.get(0);
    }

    public final void au(String str, boolean z) {
        copyOnWrite();
        asxn asxnVar = (asxn) this.instance;
        asxn asxnVar2 = asxn.a;
        aoqp aoqpVar = asxnVar.d;
        if (!aoqpVar.b) {
            asxnVar.d = aoqpVar.a();
        }
        asxnVar.d.put(str, Boolean.valueOf(z));
    }

    public final void av(atbl atblVar) {
        copyOnWrite();
        atbi atbiVar = (atbi) this.instance;
        atbi atbiVar2 = atbi.a;
        atblVar.getClass();
        aopu aopuVar = atbiVar.b;
        if (!aopuVar.c()) {
            atbiVar.b = aopi.mutableCopy(aopuVar);
        }
        atbiVar.b.add(atblVar);
    }

    public final void aw(atcz atczVar) {
        copyOnWrite();
        atda atdaVar = (atda) this.instance;
        atda atdaVar2 = atda.a;
        atczVar.getClass();
        aopu aopuVar = atdaVar.e;
        if (!aopuVar.c()) {
            atdaVar.e = aopi.mutableCopy(aopuVar);
        }
        atdaVar.e.add(atczVar);
    }

    @Deprecated
    public final void ax(atcz atczVar) {
        copyOnWrite();
        atda atdaVar = (atda) this.instance;
        atda atdaVar2 = atda.a;
        atczVar.getClass();
        aopu aopuVar = atdaVar.d;
        if (!aopuVar.c()) {
            atdaVar.d = aopi.mutableCopy(aopuVar);
        }
        atdaVar.d.add(atczVar);
    }

    public final void ay(atdf atdfVar) {
        copyOnWrite();
        atdk atdkVar = (atdk) this.instance;
        atdk atdkVar2 = atdk.a;
        atdfVar.getClass();
        aopu aopuVar = atdkVar.l;
        if (!aopuVar.c()) {
            atdkVar.l = aopi.mutableCopy(aopuVar);
        }
        atdkVar.l.add(atdfVar);
    }

    public final void az(atdi atdiVar) {
        copyOnWrite();
        atdk atdkVar = (atdk) this.instance;
        atdk atdkVar2 = atdk.a;
        atdiVar.getClass();
        aopu aopuVar = atdkVar.i;
        if (!aopuVar.c()) {
            atdkVar.i = aopi.mutableCopy(aopuVar);
        }
        atdkVar.i.add(atdiVar);
    }

    public final void bA(aopa aopaVar) {
        copyOnWrite();
        axax axaxVar = (axax) this.instance;
        axav axavVar = (axav) aopaVar.mo39build();
        axax axaxVar2 = axax.a;
        axavVar.getClass();
        axaxVar.a();
        axaxVar.f.add(axavVar);
    }

    public final void bB(Iterable iterable) {
        copyOnWrite();
        axcm axcmVar = (axcm) this.instance;
        axcm axcmVar2 = axcm.a;
        aopu aopuVar = axcmVar.c;
        if (!aopuVar.c()) {
            axcmVar.c = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll(iterable, (List) axcmVar.c);
    }

    public final void bC(Iterable iterable) {
        copyOnWrite();
        azze azzeVar = (azze) this.instance;
        azze azzeVar2 = azze.a;
        aopu aopuVar = azzeVar.c;
        if (!aopuVar.c()) {
            azzeVar.c = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll(iterable, (List) azzeVar.c);
    }

    public final void bD(Iterable iterable) {
        copyOnWrite();
        azze azzeVar = (azze) this.instance;
        azze azzeVar2 = azze.a;
        aopu aopuVar = azzeVar.d;
        if (!aopuVar.c()) {
            azzeVar.d = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll(iterable, (List) azzeVar.d);
    }

    public final azzi bE(int i) {
        return (azzi) ((azzj) this.instance).m.get(i);
    }

    public final azzi bF(int i) {
        return (azzi) ((azzj) this.instance).o.get(i);
    }

    public final azzi bG(int i) {
        return (azzi) ((azzj) this.instance).l.get(i);
    }

    public final azzi bH(int i) {
        return (azzi) ((azzj) this.instance).k.get(i);
    }

    public final azzi bI(int i) {
        return (azzi) ((azzj) this.instance).h.get(i);
    }

    public final azzi bJ(int i) {
        return (azzi) ((azzj) this.instance).i.get(i);
    }

    public final azzi bK(int i) {
        return (azzi) ((azzj) this.instance).j.get(i);
    }

    public final void bL(Iterable iterable) {
        copyOnWrite();
        azzj azzjVar = (azzj) this.instance;
        azzj azzjVar2 = azzj.a;
        azzjVar.a();
        aonk.addAll(iterable, (List) azzjVar.m);
    }

    public final void bM(Iterable iterable) {
        copyOnWrite();
        azzj azzjVar = (azzj) this.instance;
        azzj azzjVar2 = azzj.a;
        azzjVar.b();
        aonk.addAll(iterable, (List) azzjVar.o);
    }

    public final void bN(Iterable iterable) {
        copyOnWrite();
        azzj azzjVar = (azzj) this.instance;
        azzj azzjVar2 = azzj.a;
        aopu aopuVar = azzjVar.r;
        if (!aopuVar.c()) {
            azzjVar.r = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll(iterable, (List) azzjVar.r);
    }

    public final void bO(Iterable iterable) {
        copyOnWrite();
        azzj azzjVar = (azzj) this.instance;
        azzj azzjVar2 = azzj.a;
        aopu aopuVar = azzjVar.q;
        if (!aopuVar.c()) {
            azzjVar.q = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll(iterable, (List) azzjVar.q);
    }

    public final void bP(Iterable iterable) {
        copyOnWrite();
        azzj azzjVar = (azzj) this.instance;
        azzj azzjVar2 = azzj.a;
        azzjVar.c();
        aonk.addAll(iterable, (List) azzjVar.l);
    }

    public final void bQ(Iterable iterable) {
        copyOnWrite();
        azzj azzjVar = (azzj) this.instance;
        azzj azzjVar2 = azzj.a;
        azzjVar.d();
        aonk.addAll(iterable, (List) azzjVar.k);
    }

    public final void bR(Iterable iterable) {
        copyOnWrite();
        azzj azzjVar = (azzj) this.instance;
        azzj azzjVar2 = azzj.a;
        azzjVar.e();
        aonk.addAll(iterable, (List) azzjVar.h);
    }

    public final void bS(Iterable iterable) {
        copyOnWrite();
        azzj azzjVar = (azzj) this.instance;
        azzj azzjVar2 = azzj.a;
        azzjVar.f();
        aonk.addAll(iterable, (List) azzjVar.i);
    }

    public final void bT(Iterable iterable) {
        copyOnWrite();
        azzj azzjVar = (azzj) this.instance;
        azzj azzjVar2 = azzj.a;
        azzjVar.g();
        aonk.addAll(iterable, (List) azzjVar.j);
    }

    public final void bU(int i, azzi azziVar) {
        copyOnWrite();
        azzj azzjVar = (azzj) this.instance;
        azzj azzjVar2 = azzj.a;
        azziVar.getClass();
        azzjVar.a();
        azzjVar.m.set(i, azziVar);
    }

    public final void bV(int i, azzi azziVar) {
        copyOnWrite();
        azzj azzjVar = (azzj) this.instance;
        azzj azzjVar2 = azzj.a;
        azziVar.getClass();
        azzjVar.b();
        azzjVar.o.set(i, azziVar);
    }

    public final void bW(int i, azzi azziVar) {
        copyOnWrite();
        azzj azzjVar = (azzj) this.instance;
        azzj azzjVar2 = azzj.a;
        azziVar.getClass();
        azzjVar.c();
        azzjVar.l.set(i, azziVar);
    }

    public final void bX(int i, azzi azziVar) {
        copyOnWrite();
        azzj azzjVar = (azzj) this.instance;
        azzj azzjVar2 = azzj.a;
        azziVar.getClass();
        azzjVar.d();
        azzjVar.k.set(i, azziVar);
    }

    public final void bY(int i, azzi azziVar) {
        copyOnWrite();
        azzj azzjVar = (azzj) this.instance;
        azzj azzjVar2 = azzj.a;
        azziVar.getClass();
        azzjVar.e();
        azzjVar.h.set(i, azziVar);
    }

    public final void bZ(int i, azzi azziVar) {
        copyOnWrite();
        azzj azzjVar = (azzj) this.instance;
        azzj azzjVar2 = azzj.a;
        azziVar.getClass();
        azzjVar.f();
        azzjVar.i.set(i, azziVar);
    }

    public final void ba(String str) {
        copyOnWrite();
        awtg awtgVar = (awtg) this.instance;
        awtg awtgVar2 = awtg.a;
        aoqp aoqpVar = awtgVar.d;
        if (!aoqpVar.b) {
            awtgVar.d = aoqpVar.a();
        }
        awtgVar.d.put(str, true);
    }

    public final void bb(String str, int i) {
        str.getClass();
        copyOnWrite();
        awti awtiVar = awti.a;
        ((awti) this.instance).a().put(str, Integer.valueOf(i));
    }

    public final void bc(String str, awtp awtpVar) {
        str.getClass();
        awtpVar.getClass();
        copyOnWrite();
        awts awtsVar = awts.a;
        ((awts) this.instance).a().put(str, awtpVar);
    }

    public final void bd(Iterable iterable) {
        copyOnWrite();
        awub awubVar = (awub) this.instance;
        awub awubVar2 = awub.a;
        aopq aopqVar = awubVar.f;
        if (!aopqVar.c()) {
            awubVar.f = aopi.mutableCopy(aopqVar);
        }
        aonk.addAll(iterable, (List) awubVar.f);
    }

    public final void be(Iterable iterable) {
        copyOnWrite();
        awub awubVar = (awub) this.instance;
        awub awubVar2 = awub.a;
        aopq aopqVar = awubVar.e;
        if (!aopqVar.c()) {
            awubVar.e = aopi.mutableCopy(aopqVar);
        }
        aonk.addAll(iterable, (List) awubVar.e);
    }

    public final void bf(String str, long j) {
        str.getClass();
        copyOnWrite();
        awuj awujVar = (awuj) this.instance;
        awuj awujVar2 = awuj.a;
        aoqp aoqpVar = awujVar.d;
        if (!aoqpVar.b) {
            awujVar.d = aoqpVar.a();
        }
        awujVar.d.put(str, Long.valueOf(j));
    }

    public final void bg(String str, int i) {
        str.getClass();
        copyOnWrite();
        awuj awujVar = (awuj) this.instance;
        awuj awujVar2 = awuj.a;
        aoqp aoqpVar = awujVar.j;
        if (!aoqpVar.b) {
            awujVar.j = aoqpVar.a();
        }
        awujVar.j.put(str, Integer.valueOf(i));
    }

    public final void bh(String str, int i) {
        str.getClass();
        copyOnWrite();
        awuj awujVar = (awuj) this.instance;
        awuj awujVar2 = awuj.a;
        aoqp aoqpVar = awujVar.h;
        if (!aoqpVar.b) {
            awujVar.h = aoqpVar.a();
        }
        awujVar.h.put(str, Integer.valueOf(i));
    }

    public final void bi(String str, int i) {
        str.getClass();
        copyOnWrite();
        awuj awujVar = (awuj) this.instance;
        awuj awujVar2 = awuj.a;
        aoqp aoqpVar = awujVar.i;
        if (!aoqpVar.b) {
            awujVar.i = aoqpVar.a();
        }
        awujVar.i.put(str, Integer.valueOf(i));
    }

    public final void bj(String str, long j) {
        str.getClass();
        copyOnWrite();
        awuj awujVar = (awuj) this.instance;
        awuj awujVar2 = awuj.a;
        aoqp aoqpVar = awujVar.k;
        if (!aoqpVar.b) {
            awujVar.k = aoqpVar.a();
        }
        awujVar.k.put(str, Long.valueOf(j));
    }

    public final void bk(String str, boolean z) {
        str.getClass();
        copyOnWrite();
        awuj awujVar = awuj.a;
        ((awuj) this.instance).a().put(str, Boolean.valueOf(z));
    }

    public final void bl(String str, int i) {
        str.getClass();
        copyOnWrite();
        awus awusVar = awus.a;
        ((awus) this.instance).a().put(str, Integer.valueOf(i));
    }

    public final void bm(String str, int i) {
        str.getClass();
        copyOnWrite();
        awus awusVar = awus.a;
        ((awus) this.instance).b().put(str, Integer.valueOf(i));
    }

    public final void bn(String str, boolean z) {
        str.getClass();
        copyOnWrite();
        awus awusVar = awus.a;
        ((awus) this.instance).c().put(str, Boolean.valueOf(z));
    }

    public final void bo(String str, int i) {
        str.getClass();
        copyOnWrite();
        awus awusVar = awus.a;
        ((awus) this.instance).d().put(str, Integer.valueOf(i));
    }

    public final void bp(String str, long j) {
        str.getClass();
        copyOnWrite();
        awus awusVar = awus.a;
        ((awus) this.instance).e().put(str, Long.valueOf(j));
    }

    public final void bq(String str, int i) {
        str.getClass();
        copyOnWrite();
        awus awusVar = awus.a;
        ((awus) this.instance).f().put(str, Integer.valueOf(i));
    }

    public final void br(String str, long j) {
        str.getClass();
        copyOnWrite();
        awus awusVar = awus.a;
        ((awus) this.instance).g().put(str, Long.valueOf(j));
    }

    public final void bs(String str, int i) {
        str.getClass();
        copyOnWrite();
        awux awuxVar = (awux) this.instance;
        awux awuxVar2 = awux.a;
        aoqp aoqpVar = awuxVar.l;
        if (!aoqpVar.b) {
            awuxVar.l = aoqpVar.a();
        }
        awuxVar.l.put(str, Integer.valueOf(i));
    }

    public final void bt(String str, int i) {
        str.getClass();
        copyOnWrite();
        awux awuxVar = (awux) this.instance;
        awux awuxVar2 = awux.a;
        aoqp aoqpVar = awuxVar.m;
        if (!aoqpVar.b) {
            awuxVar.m = aoqpVar.a();
        }
        awuxVar.m.put(str, Integer.valueOf(i));
    }

    public final void bu(String str, boolean z) {
        str.getClass();
        copyOnWrite();
        awux awuxVar = (awux) this.instance;
        awux awuxVar2 = awux.a;
        aoqp aoqpVar = awuxVar.n;
        if (!aoqpVar.b) {
            awuxVar.n = aoqpVar.a();
        }
        awuxVar.n.put(str, Boolean.valueOf(z));
    }

    @Override // defpackage.aoqt
    /* renamed from: build */
    public final aopi mo39build() {
        aopi mo48buildPartial = mo48buildPartial();
        if (mo48buildPartial.isInitialized()) {
            return mo48buildPartial;
        }
        throw newUninitializedMessageException(mo48buildPartial);
    }

    @Override // defpackage.aoqt
    /* renamed from: buildPartial */
    public aopi mo48buildPartial() {
        if (this.isBuilt) {
            return this.instance;
        }
        this.instance.makeImmutable();
        this.isBuilt = true;
        return this.instance;
    }

    public final void bv(String str, awuz awuzVar) {
        str.getClass();
        awuzVar.getClass();
        copyOnWrite();
        awvb awvbVar = (awvb) this.instance;
        awvb awvbVar2 = awvb.a;
        aoqp aoqpVar = awvbVar.d;
        if (!aoqpVar.b) {
            awvbVar.d = aoqpVar.a();
        }
        awvbVar.d.put(str, awuzVar);
    }

    public final void bw(String str, boolean z) {
        str.getClass();
        copyOnWrite();
        awvh awvhVar = (awvh) this.instance;
        awvh awvhVar2 = awvh.a;
        aoqp aoqpVar = awvhVar.d;
        if (!aoqpVar.b) {
            awvhVar.d = aoqpVar.a();
        }
        awvhVar.d.put(str, Boolean.valueOf(z));
    }

    public final void bx(String str, long j) {
        str.getClass();
        copyOnWrite();
        awvh awvhVar = (awvh) this.instance;
        awvh awvhVar2 = awvh.a;
        aoqp aoqpVar = awvhVar.e;
        if (!aoqpVar.b) {
            awvhVar.e = aoqpVar.a();
        }
        awvhVar.e.put(str, Long.valueOf(j));
    }

    public final void by(String str, awvk awvkVar) {
        str.getClass();
        awvkVar.getClass();
        copyOnWrite();
        awvj awvjVar = (awvj) this.instance;
        awvj awvjVar2 = awvj.a;
        aoqp aoqpVar = awvjVar.c;
        if (!aoqpVar.b) {
            awvjVar.c = aoqpVar.a();
        }
        awvjVar.c.put(str, awvkVar);
    }

    public final void bz(long j) {
        copyOnWrite();
        awvk awvkVar = (awvk) this.instance;
        awvk awvkVar2 = awvk.a;
        aopt aoptVar = awvkVar.b;
        if (!aoptVar.c()) {
            awvkVar.b = aopi.mutableCopy(aoptVar);
        }
        awvkVar.b.f(j);
    }

    public final void ca(int i, azzi azziVar) {
        copyOnWrite();
        azzj azzjVar = (azzj) this.instance;
        azzj azzjVar2 = azzj.a;
        azziVar.getClass();
        azzjVar.g();
        azzjVar.j.set(i, azziVar);
    }

    public final void cb(int i) {
        copyOnWrite();
        baar baarVar = (baar) this.instance;
        baar baarVar2 = baar.a;
        aopq aopqVar = baarVar.c;
        if (!aopqVar.c()) {
            baarVar.c = aopi.mutableCopy(aopqVar);
        }
        baarVar.c.g(i);
    }

    public final void cc(int i) {
        copyOnWrite();
        baar baarVar = (baar) this.instance;
        baar baarVar2 = baar.a;
        aopq aopqVar = baarVar.b;
        if (!aopqVar.c()) {
            baarVar.b = aopi.mutableCopy(aopqVar);
        }
        baarVar.b.g(i);
    }

    public final void cd(Map map) {
        copyOnWrite();
        bapx bapxVar = (bapx) this.instance;
        bapx bapxVar2 = bapx.a;
        aoqp aoqpVar = bapxVar.d;
        if (!aoqpVar.b) {
            bapxVar.d = aoqpVar.a();
        }
        bapxVar.d.putAll(map);
    }

    public final void ce(aopa aopaVar) {
        copyOnWrite();
        arzm arzmVar = (arzm) this.instance;
        arzj arzjVar = (arzj) aopaVar.mo39build();
        arzm arzmVar2 = arzm.a;
        arzjVar.getClass();
        aopu aopuVar = arzmVar.d;
        if (!aopuVar.c()) {
            arzmVar.d = aopi.mutableCopy(aopuVar);
        }
        arzmVar.d.add(arzjVar);
    }

    public final aopa clear() {
        this.instance = (aopi) this.instance.dynamicMethod(aoph.NEW_MUTABLE_INSTANCE);
        return this;
    }

    public final void copyOnWrite() {
        if (this.isBuilt) {
            copyOnWriteInternal();
            this.isBuilt = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void copyOnWriteInternal() {
        aopi aopiVar = (aopi) this.instance.dynamicMethod(aoph.NEW_MUTABLE_INSTANCE);
        mergeFromInstance(aopiVar, this.instance);
        this.instance = aopiVar;
    }

    public final void f(aoob aoobVar) {
        copyOnWrite();
        dob dobVar = (dob) this.instance;
        dob dobVar2 = dob.a;
        aopu aopuVar = dobVar.c;
        if (!aopuVar.c()) {
            dobVar.c = aopi.mutableCopy(aopuVar);
        }
        dobVar.c.add(aoobVar);
    }

    public final void g(int i, long j) {
        copyOnWrite();
        fcy fcyVar = (fcy) this.instance;
        fcy fcyVar2 = fcy.a;
        aoqp aoqpVar = fcyVar.g;
        if (!aoqpVar.b) {
            fcyVar.g = aoqpVar.a();
        }
        fcyVar.g.put(Integer.valueOf(i), Long.valueOf(j));
    }

    @Override // defpackage.aoqv
    /* renamed from: getDefaultInstanceForType */
    public aopi mo50getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    public final fcv h(String str, fcv fcvVar) {
        str.getClass();
        Map unmodifiableMap = Collections.unmodifiableMap(((fda) this.instance).j);
        return unmodifiableMap.containsKey(str) ? (fcv) unmodifiableMap.get(str) : fcvVar;
    }

    public final void i(String str, fcv fcvVar) {
        str.getClass();
        fcvVar.getClass();
        copyOnWrite();
        fda fdaVar = (fda) this.instance;
        fda fdaVar2 = fda.a;
        aoqp aoqpVar = fdaVar.j;
        if (!aoqpVar.b) {
            fdaVar.j = aoqpVar.a();
        }
        fdaVar.j.put(str, fcvVar);
    }

    @Override // defpackage.aoqv
    public final boolean isInitialized() {
        return aopi.isInitialized(this.instance, false);
    }

    public final void j(String str, fgp fgpVar) {
        fgpVar.getClass();
        copyOnWrite();
        fgu fguVar = (fgu) this.instance;
        fgu fguVar2 = fgu.a;
        aoqp aoqpVar = fguVar.f;
        if (!aoqpVar.b) {
            fguVar.f = aoqpVar.a();
        }
        fguVar.f.put(str, fgpVar);
    }

    public final void k(String str, long j) {
        str.getClass();
        copyOnWrite();
        hwp hwpVar = (hwp) this.instance;
        hwp hwpVar2 = hwp.a;
        aoqp aoqpVar = hwpVar.f;
        if (!aoqpVar.b) {
            hwpVar.f = aoqpVar.a();
        }
        hwpVar.f.put(str, Long.valueOf(j));
    }

    public final void l(Iterable iterable) {
        copyOnWrite();
        orh orhVar = (orh) this.instance;
        orh orhVar2 = orh.a;
        aopu aopuVar = orhVar.c;
        if (!aopuVar.c()) {
            orhVar.c = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll(iterable, (List) orhVar.c);
    }

    public final void m(Iterable iterable) {
        copyOnWrite();
        orv orvVar = (orv) this.instance;
        orv orvVar2 = orv.a;
        aopq aopqVar = orvVar.f;
        if (!aopqVar.c()) {
            orvVar.f = aopi.mutableCopy(aopqVar);
        }
        aonk.addAll(iterable, (List) orvVar.f);
    }

    public final void n(Iterable iterable) {
        copyOnWrite();
        rqi rqiVar = (rqi) this.instance;
        rqi rqiVar2 = rqi.a;
        rqiVar.a();
        aonk.addAll(iterable, (List) rqiVar.h);
    }

    public final rqg o(int i) {
        return (rqg) ((rqk) this.instance).e.get(i);
    }

    public final rqo p(int i) {
        return (rqo) ((rqk) this.instance).f.get(i);
    }

    public final void q(Iterable iterable) {
        copyOnWrite();
        rqk rqkVar = (rqk) this.instance;
        rqk rqkVar2 = rqk.a;
        aopu aopuVar = rqkVar.D;
        if (!aopuVar.c()) {
            rqkVar.D = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll(iterable, (List) rqkVar.D);
    }

    public final void r(rqf rqfVar) {
        copyOnWrite();
        rqk rqkVar = (rqk) this.instance;
        rqg rqgVar = (rqg) rqfVar.mo39build();
        rqk rqkVar2 = rqk.a;
        rqgVar.getClass();
        rqkVar.a();
        rqkVar.e.add(rqgVar);
    }

    public final void s(rqo rqoVar) {
        copyOnWrite();
        rqk rqkVar = (rqk) this.instance;
        rqk rqkVar2 = rqk.a;
        rqoVar.getClass();
        rqkVar.b();
        rqkVar.f.add(rqoVar);
    }

    public final void t(int i, rqf rqfVar) {
        copyOnWrite();
        rqk rqkVar = (rqk) this.instance;
        rqg rqgVar = (rqg) rqfVar.mo39build();
        rqk rqkVar2 = rqk.a;
        rqgVar.getClass();
        rqkVar.a();
        rqkVar.e.set(i, rqgVar);
    }

    public final void u(int i, rqo rqoVar) {
        copyOnWrite();
        rqk rqkVar = (rqk) this.instance;
        rqk rqkVar2 = rqk.a;
        rqoVar.getClass();
        rqkVar.b();
        rqkVar.f.set(i, rqoVar);
    }

    public final void v(Iterable iterable) {
        copyOnWrite();
        rqm rqmVar = (rqm) this.instance;
        rqm rqmVar2 = rqm.a;
        aopt aoptVar = rqmVar.c;
        if (!aoptVar.c()) {
            rqmVar.c = aopi.mutableCopy(aoptVar);
        }
        aonk.addAll(iterable, (List) rqmVar.c);
    }

    public final void w(Iterable iterable) {
        copyOnWrite();
        rqm rqmVar = (rqm) this.instance;
        rqm rqmVar2 = rqm.a;
        aopt aoptVar = rqmVar.b;
        if (!aoptVar.c()) {
            rqmVar.b = aopi.mutableCopy(aoptVar);
        }
        aonk.addAll(iterable, (List) rqmVar.b);
    }

    public final void x(tpo tpoVar) {
        copyOnWrite();
        tpp tppVar = (tpp) this.instance;
        tpp tppVar2 = tpp.a;
        tpoVar.getClass();
        tppVar.a();
        tppVar.h.add(tpoVar);
    }

    public final void y(String str, tqm tqmVar) {
        str.getClass();
        tqmVar.getClass();
        copyOnWrite();
        tqt tqtVar = tqt.a;
        ((tqt) this.instance).a().put(str, tqmVar);
    }

    public final void z(String str) {
        str.getClass();
        copyOnWrite();
        tqt tqtVar = tqt.a;
        ((tqt) this.instance).a().remove(str);
    }

    /* renamed from: clear  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ aoqt m41clear() {
        clear();
        return this;
    }

    @Override // defpackage.aonj, defpackage.aoqt
    /* renamed from: clone  reason: collision with other method in class */
    public aopa mo43clone() {
        aopa mo51newBuilderForType = mo50getDefaultInstanceForType().mo51newBuilderForType();
        mo51newBuilderForType.mergeFrom(mo48buildPartial());
        return mo51newBuilderForType;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aonj
    public aopa internalMergeFrom(aopi aopiVar) {
        return mergeFrom(aopiVar);
    }

    @Override // defpackage.aonj
    /* renamed from: mergeFrom  reason: collision with other method in class */
    public aopa mo45mergeFrom(aoog aoogVar, aoos aoosVar) {
        copyOnWrite();
        try {
            aore.a.b(this.instance).h(this.instance, aooh.p(aoogVar), aoosVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    public aopa(aopi aopiVar) {
        this.defaultInstance = aopiVar;
        this.instance = (aopi) aopiVar.dynamicMethod(aoph.NEW_MUTABLE_INSTANCE);
        this.isBuilt = false;
    }

    public aopa(char[][] cArr, short[] sArr) {
        this(apax.a);
    }

    public aopa(byte[][][] bArr, char[] cArr) {
        this(apcy.a);
    }

    public aopa(short[] sArr, int[] iArr) {
        this(apcx.a);
    }

    public aopa(float[][][] fArr, byte[] bArr) {
        this(apda.a);
    }

    public aopa(short[][][] sArr, int[] iArr) {
        this(apde.a);
    }

    public aopa mergeFrom(aopi aopiVar) {
        copyOnWrite();
        mergeFromInstance(this.instance, aopiVar);
        return this;
    }

    public aopa(short[][] sArr, boolean[] zArr) {
        this(apdd.a);
    }

    public aopa(short[][] sArr, byte[][] bArr) {
        this(apdg.a);
    }

    public aopa(short[][][] sArr, float[] fArr) {
        this(apfz.a);
    }

    @Override // defpackage.aonj
    /* renamed from: mergeFrom  reason: collision with other method in class */
    public aopa mo46mergeFrom(byte[] bArr, int i, int i2) {
        return mo47mergeFrom(bArr, i, i2, aoos.a());
    }

    public aopa(short[] sArr, char[][] cArr) {
        this(apny.a);
    }

    public aopa(short[] sArr, float[] fArr) {
        this(apsm.a);
    }

    public aopa(short[][][] sArr, char[][] cArr) {
        this(apsv.a);
    }

    @Override // defpackage.aonj
    /* renamed from: mergeFrom  reason: collision with other method in class */
    public aopa mo47mergeFrom(byte[] bArr, int i, int i2, aoos aoosVar) {
        copyOnWrite();
        try {
            aore.a.b(this.instance).i(this.instance, bArr, i, i + i2, new aonp(aoosVar));
            return this;
        } catch (aopx e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw aopx.j();
        }
    }

    public aopa(short[][] sArr, short[][] sArr2) {
        this(apvj.a);
    }

    public aopa(short[][] sArr, boolean[][] zArr) {
        this(apwx.a);
    }

    public aopa(short[][][] sArr, int[][] iArr) {
        this(apwz.a);
    }

    public aopa(short[] sArr, float[][] fArr) {
        this(aqcw.a);
    }

    public aopa(short[] sArr, int[][] iArr) {
        this(aqeq.a);
    }

    public aopa(float[][] fArr) {
        this(aqes.a);
    }

    public aopa(float[] fArr, byte[] bArr) {
        this(aqft.a);
    }

    public aopa(byte[][] bArr, short[] sArr) {
        this(aqke.b);
    }

    public aopa(float[][] fArr, char[] cArr) {
        this(aqmb.a);
    }

    public aopa(char[] cArr, int[] iArr) {
        this(aqnp.a);
    }

    public aopa(boolean[][][] zArr, byte[] bArr) {
        this(aqns.a);
    }

    public aopa(char[][][] cArr, int[] iArr) {
        this(aqpm.a);
    }

    public aopa(char[][] cArr, boolean[] zArr) {
        this(aqpu.a);
    }

    public aopa(char[][] cArr, byte[][] bArr) {
        this(aqqh.a);
    }

    public aopa(char[][][] cArr, float[] fArr) {
        this(aqqy.a);
    }

    public aopa(char[] cArr, char[][] cArr2) {
        this(aqqz.a);
    }

    public aopa(char[] cArr, float[] fArr) {
        this(aqrk.a);
    }

    public aopa(char[][][] cArr, char[][] cArr2) {
        this(aqsf.a);
    }

    public aopa(char[][] cArr, short[][] sArr) {
        this(aqsc.a);
    }

    public aopa(char[][] cArr, boolean[][] zArr) {
        this(aqsm.a);
    }

    public aopa(char[][][] cArr, int[][] iArr) {
        this(aquq.a);
    }

    public aopa(char[] cArr, float[][] fArr) {
        this(aqwb.a);
    }

    public aopa(char[] cArr, int[][] iArr) {
        this(aqwu.b);
    }

    public aopa(byte[] bArr) {
        this(aqyd.a);
    }

    public aopa(byte[][][] bArr) {
        this(aqyh.a);
    }

    public aopa(char[][][] cArr, char[] cArr2) {
        this(arba.a);
    }

    public aopa(byte[] bArr, char[] cArr) {
        this(arbt.a);
    }

    public aopa(short[][] sArr, short[] sArr2) {
        this(arkm.a);
    }

    public aopa(byte[][] bArr, byte[] bArr2) {
        this(arla.a);
    }

    public aopa(int[] iArr, int[] iArr2) {
        this(arle.a);
    }

    public aopa(int[][][] iArr, int[] iArr2) {
        this(arln.a);
    }

    public aopa(int[][][] iArr, float[] fArr) {
        this(arly.a);
    }

    public aopa(int[] iArr, float[] fArr) {
        this(armc.a);
    }

    public aopa(int[][] iArr, byte[][] bArr) {
        this(armx.a);
    }

    public aopa(int[][] iArr, boolean[] zArr) {
        this(armz.a);
    }

    public aopa(int[] iArr, char[][] cArr) {
        this(arnn.a);
    }

    public aopa(int[][][] iArr, char[][] cArr) {
        this(arnq.a);
    }

    public aopa(int[][][] iArr, int[][] iArr2) {
        this(aroi.a);
    }

    public aopa(int[] iArr, int[][] iArr2) {
        this(aror.a);
    }

    public aopa(int[][] iArr, boolean[][] zArr) {
        this(arow.a);
    }

    public aopa(int[][] iArr, short[][] sArr) {
        this(aroy.a);
    }

    public aopa(char[] cArr) {
        this(aroz.a);
    }

    public aopa(char[][][] cArr) {
        this(arpy.a);
    }

    public aopa(short[][][] sArr, char[] cArr) {
        this(arqg.a);
    }

    public aopa(char[] cArr, char[] cArr2) {
        this(arql.a);
    }

    public aopa(int[][] iArr, short[] sArr) {
        this(arqq.a);
    }

    public aopa(char[][] cArr, byte[] bArr) {
        this(arqu.a);
    }

    public aopa(boolean[] zArr, int[] iArr) {
        this(arrj.a);
    }

    public aopa(boolean[][][] zArr, int[] iArr) {
        this(arrv.a);
    }

    public aopa(boolean[][][] zArr, float[] fArr) {
        this(arst.a);
    }

    public aopa(boolean[] zArr, float[] fArr) {
        this(arub.a);
    }

    public aopa(boolean[][] zArr, byte[][] bArr) {
        this(arui.a);
    }

    public aopa(boolean[][] zArr, boolean[] zArr2) {
        this(aruk.a);
    }

    public aopa(boolean[] zArr, char[][] cArr) {
        this(arvd.a);
    }

    public aopa(boolean[][][] zArr, char[][] cArr) {
        this(arxe.a);
    }

    public aopa(boolean[][][] zArr, int[][] iArr) {
        this(arye.a);
    }

    public aopa(boolean[] zArr, int[][] iArr) {
        this(arym.a);
    }

    public aopa(boolean[][] zArr, boolean[][] zArr2) {
        this(aryo.a);
    }

    public aopa(boolean[][] zArr, short[][] sArr) {
        this(aryr.a);
    }

    public aopa(boolean[] zArr) {
        this(arzb.a);
    }

    public aopa(boolean[][][] zArr) {
        this(arzg.a);
    }

    public aopa(float[][][] fArr, char[] cArr) {
        this(arzj.a);
    }

    public aopa(boolean[] zArr, char[] cArr) {
        this(arzl.a);
    }

    public aopa(byte[][][] bArr, short[] sArr) {
        this(arzm.a);
    }

    public aopa(boolean[][] zArr, byte[] bArr) {
        this(arzo.b);
    }

    public aopa(char[][] cArr, int[] iArr) {
        this(asag.a);
    }

    public aopa(char[] cArr, boolean[] zArr) {
        this(asah.a);
    }

    public aopa(char[] cArr, byte[][] bArr) {
        this(asan.a);
    }

    public aopa(char[][] cArr, float[] fArr) {
        this(asas.a);
    }

    public aopa(char[][][] cArr, byte[][] bArr) {
        this(asax.a);
    }

    public aopa(char[][][] cArr, boolean[] zArr) {
        this(asbb.a);
    }

    public aopa(char[][] cArr, char[][] cArr2) {
        this(asbv.a);
    }

    public aopa(char[] cArr, short[][] sArr) {
        this(asby.a);
    }

    public aopa(char[] cArr, boolean[][] zArr) {
        this(ascj.a);
    }

    public aopa(char[][] cArr, int[][] iArr) {
        this(asci.a);
    }

    public aopa(char[][][] cArr, boolean[][] zArr) {
        this(asdf.a);
    }

    public aopa(char[][][] cArr, short[][] sArr) {
        this(asdh.a);
    }

    public aopa(int[] iArr) {
        this(asfk.a);
    }

    public aopa(int[][][] iArr) {
        this(asfn.a);
    }

    public aopa(boolean[][][] zArr, char[] cArr) {
        this(asfp.a);
    }

    public aopa(int[] iArr, char[] cArr) {
        this(asfs.a);
    }

    public aopa(float[][] fArr, short[] sArr) {
        this(asgs.a);
    }

    public aopa(int[][] iArr, byte[] bArr) {
        this(ashd.a);
    }

    public aopa(byte[][] bArr, int[] iArr) {
        this(asih.a);
    }

    public aopa(byte[] bArr, boolean[] zArr) {
        this(asis.a);
    }

    public aopa(byte[] bArr, byte[][] bArr2) {
        this(asjj.a);
    }

    public aopa(byte[][] bArr, float[] fArr) {
        this(asjm.a);
    }

    public aopa(byte[][][] bArr, byte[][] bArr2) {
        this(askq.a);
    }

    public aopa(byte[][][] bArr, boolean[] zArr) {
        this(asnq.a);
    }

    public aopa(byte[][] bArr, char[][] cArr) {
        this(asnx.a);
    }

    public aopa(byte[] bArr, short[][] sArr) {
        this(assu.a);
    }

    public aopa(byte[] bArr, boolean[][] zArr) {
        this(asur.a);
    }

    public aopa(byte[][] bArr, int[][] iArr) {
        this(aswi.a);
    }

    public aopa(byte[][][] bArr, boolean[][] zArr) {
        this(asxn.a);
    }

    public aopa(byte[][][] bArr, short[][] sArr) {
        this(asyx.a);
    }

    public aopa(float[] fArr) {
        this(atbi.a);
    }

    public aopa(float[][][] fArr) {
        this(atbv.a);
    }

    public aopa(byte[] bArr, short[] sArr) {
        this(atcp.a);
    }

    public aopa(float[] fArr, char[] cArr) {
        this(atda.a);
    }

    public aopa(char[][][] cArr, short[] sArr) {
        this(atdk.a);
    }

    public aopa(float[][] fArr, byte[] bArr) {
        this(atdi.b);
    }

    public aopa(short[][] sArr, int[] iArr) {
        this(atep.a);
    }

    public aopa(short[] sArr, boolean[] zArr) {
        this(atgn.a);
    }

    public aopa(short[] sArr, byte[][] bArr) {
        this(atha.a);
    }

    public aopa(short[][] sArr, float[] fArr) {
        this(ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.a);
    }

    public aopa(short[][][] sArr, byte[][] bArr) {
        this(atjk.a);
    }

    public aopa(short[][][] sArr, boolean[] zArr) {
        this(atpe.a);
    }

    public aopa(short[][] sArr, char[][] cArr) {
        this(atqg.a);
    }

    public aopa(short[] sArr, short[][] sArr2) {
        this(atqh.a);
    }

    public aopa(short[] sArr, boolean[][] zArr) {
        this(atrf.a);
    }

    public aopa(short[][] sArr, int[][] iArr) {
        this(atrj.a);
    }

    public aopa(short[][][] sArr, boolean[][] zArr) {
        this(atrk.a);
    }

    public aopa(short[][][] sArr, short[][] sArr2) {
        this(atsn.a);
    }

    public aopa(short[] sArr) {
        this(atxg.a);
    }

    public aopa(short[][][] sArr) {
        this(atxm.a);
    }

    public aopa(int[][][] iArr, char[] cArr) {
        this(atyq.a);
    }

    public aopa(short[] sArr, char[] cArr) {
        this(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.a);
    }

    public aopa(boolean[][] zArr, short[] sArr) {
        this(aueq.a);
    }

    public aopa(short[][] sArr, byte[] bArr) {
        this(aufe.a);
    }

    public aopa(float[] fArr, int[] iArr) {
        this(aufu.a);
    }

    public aopa(float[][][] fArr, int[] iArr) {
        this(auoh.a);
    }

    public aopa(float[][][] fArr, float[] fArr2) {
        this(auqh.a);
    }

    public aopa(float[] fArr, float[] fArr2) {
        this(aurm.a);
    }

    public aopa(float[][] fArr, byte[][] bArr) {
        this(aurt.a);
    }

    public aopa(float[][] fArr, boolean[] zArr) {
        this(auuu.a);
    }

    public aopa(float[] fArr, char[][] cArr) {
        this(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.a);
    }

    public aopa(float[][][] fArr, char[][] cArr) {
        this(auwe.a);
    }

    public aopa(float[][][] fArr, int[][] iArr) {
        this(auwg.a);
    }

    public aopa(float[] fArr, int[][] iArr) {
        this(auxj.a);
    }

    public aopa(float[][] fArr, boolean[][] zArr) {
        this(auxr.a);
    }

    public aopa(float[][] fArr, short[][] sArr) {
        this(auzj.a);
    }

    public aopa(byte[][] bArr) {
        this(aven.a);
    }

    public aopa(byte[] bArr, byte[] bArr2) {
        this(avfu.a);
    }

    public aopa(char[] cArr, short[] sArr) {
        this(avgq.a);
    }

    public aopa(byte[][] bArr, char[] cArr) {
        this(avkq.a);
    }

    public aopa(short[][][] sArr, short[] sArr2) {
        this(avny.a);
    }

    public aopa(byte[][][] bArr, byte[] bArr2) {
        this(avsz.a);
    }

    public aopa(int[][] iArr, int[] iArr2) {
        this(avud.a);
    }

    public aopa(int[] iArr, boolean[] zArr) {
        this(avxl.a);
    }

    public aopa(int[] iArr, byte[][] bArr) {
        this(avxr.a);
    }

    public aopa(int[][] iArr, float[] fArr) {
        this(avye.a);
    }

    public aopa(int[][][] iArr, byte[][] bArr) {
        this(avyg.a);
    }

    public aopa(int[][][] iArr, boolean[] zArr) {
        this(avzc.a);
    }

    public aopa(int[][] iArr, char[][] cArr) {
        this(avzb.a);
    }

    public aopa(int[] iArr, short[][] sArr) {
        this(avyy.a);
    }

    public aopa(int[] iArr, boolean[][] zArr) {
        this(awba.a);
    }

    public aopa(int[][] iArr, int[][] iArr2) {
        this(awir.a);
    }

    public aopa(int[][][] iArr, boolean[][] zArr) {
        this(awkc.a);
    }

    public aopa(int[][][] iArr, short[][] sArr) {
        this(awki.a);
    }

    public aopa(char[][] cArr) {
        this(awma.a);
    }

    public aopa(char[] cArr, byte[] bArr) {
        this(awne.a);
    }

    public aopa(short[] sArr, short[] sArr2) {
        this(awnv.a);
    }

    public aopa(char[][] cArr, char[] cArr2) {
        this(awny.a);
    }

    public aopa(int[][][] iArr, short[] sArr) {
        this(awqq.a);
    }

    public aopa(char[][][] cArr, byte[] bArr) {
        this(awqr.a);
    }

    public aopa(boolean[][] zArr, int[] iArr) {
        this(awqv.a);
    }

    public aopa(boolean[] zArr, boolean[] zArr2) {
        this(awqy.a);
    }

    public aopa(boolean[] zArr, byte[][] bArr) {
        this(awsq.a);
    }

    public aopa(boolean[][] zArr, float[] fArr) {
        this(awsv.a);
    }

    public aopa(boolean[][][] zArr, byte[][] bArr) {
        this(awtd.a);
    }

    public aopa(boolean[][][] zArr, boolean[] zArr2) {
        this(awtg.a);
    }

    public aopa(boolean[][] zArr, char[][] cArr) {
        this(awti.a);
    }

    public aopa(boolean[] zArr, short[][] sArr) {
        this(awtp.a);
    }

    public aopa(boolean[] zArr, boolean[][] zArr2) {
        this(awts.a);
    }

    public aopa(boolean[][] zArr, int[][] iArr) {
        this(awua.a);
    }

    public aopa(boolean[][][] zArr, boolean[][] zArr2) {
        this(awub.a);
    }

    public aopa(boolean[][][] zArr, short[][] sArr) {
        this(awuj.a);
    }

    public aopa(int[][] iArr) {
        this(awus.a);
    }

    public aopa(int[] iArr, byte[] bArr) {
        this(awux.a);
    }

    public aopa(boolean[] zArr, short[] sArr) {
        this(awvb.a);
    }

    public aopa(int[][] iArr, char[] cArr) {
        this(awvh.a);
    }

    public aopa(float[][][] fArr, short[] sArr) {
        this(awvj.a);
    }

    public aopa(int[][][] iArr, byte[] bArr) {
        this(awvk.a);
    }

    public aopa(byte[][][] bArr, int[] iArr) {
        this(awwf.a);
    }

    public aopa(byte[][] bArr, boolean[] zArr) {
        this(awwi.a);
    }

    public aopa(byte[][] bArr, byte[][] bArr2) {
        this(awxa.a);
    }

    public aopa(byte[][][] bArr, float[] fArr) {
        this(awww.a);
    }

    public aopa(byte[] bArr, char[][] cArr) {
        this(awxf.a);
    }

    public aopa(byte[] bArr, float[] fArr) {
        this(awxg.a);
    }

    public aopa(byte[][][] bArr, char[][] cArr) {
        this(awzl.a);
    }

    public aopa(byte[][] bArr, short[][] sArr) {
        this(awzt.b);
    }

    public aopa(byte[][] bArr, boolean[][] zArr) {
        this(awzx.b);
    }

    public aopa(byte[][][] bArr, int[][] iArr) {
        this(axad.b);
    }

    public aopa(byte[] bArr, float[][] fArr) {
        this(axax.a);
    }

    public aopa(byte[] bArr, int[][] iArr) {
        this(axaz.b);
    }

    public aopa(short[][] sArr) {
        this(axbx.a);
    }

    public aopa(short[] sArr, byte[] bArr) {
        this(axca.a);
    }

    public aopa(int[] iArr, short[] sArr) {
        this(axch.a);
    }

    public aopa(short[][] sArr, char[] cArr) {
        this(axcm.a);
    }

    public aopa(boolean[][][] zArr, short[] sArr) {
        this(axcx.b);
    }

    public aopa(short[][][] sArr, byte[] bArr) {
        this(axcy.a);
    }

    public aopa(float[][] fArr, int[] iArr) {
        this(azyx.a);
    }

    public aopa(float[] fArr, boolean[] zArr) {
        this(azze.a);
    }

    public aopa(float[] fArr, byte[][] bArr) {
        this(azzj.a);
    }

    public aopa(float[][] fArr, float[] fArr2) {
        this(azzl.a);
    }

    public aopa(float[][][] fArr, byte[][] bArr) {
        this(azzv.a);
    }

    public aopa(float[][][] fArr, boolean[] zArr) {
        this(azzw.a);
    }

    public aopa(float[][] fArr, char[][] cArr) {
        this(baaa.a);
    }

    public aopa(float[] fArr, short[][] sArr) {
        this(baae.a);
    }

    public aopa(float[] fArr, boolean[][] zArr) {
        this(baal.a);
    }

    public aopa(float[][] fArr, int[][] iArr) {
        this(baao.a);
    }

    public aopa(float[][][] fArr, boolean[][] zArr) {
        this(baaq.a);
    }

    public aopa(float[][][] fArr, short[][] sArr) {
        this(baap.a);
    }

    public aopa(boolean[][] zArr) {
        this(baar.a);
    }

    public aopa(boolean[] zArr, byte[] bArr) {
        this(bapx.a);
    }

    public aopa(float[] fArr, short[] sArr) {
        this(baqb.a);
    }

    public aopa(boolean[][] zArr, char[] cArr) {
        this(baqe.a);
    }

    public aopa(byte[] bArr, int[] iArr) {
        this(baqg.a);
    }
}
