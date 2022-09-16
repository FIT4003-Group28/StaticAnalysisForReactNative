package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aopc  reason: default package */
/* loaded from: classes.dex */
public class aopc extends aopa implements aope, tmi {
    public aopc() {
        dvv dvvVar = dvv.a;
        throw null;
    }

    private final aoov cy() {
        aoov aoovVar = ((aopd) this.instance).l;
        if (aoovVar.c) {
            aoov clone = aoovVar.clone();
            ((aopd) this.instance).l = clone;
            return clone;
        }
        return aoovVar;
    }

    private final void cz(aopg aopgVar) {
        if (aopgVar.a == mo50getDefaultInstanceForType()) {
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    @Override // defpackage.aopa, defpackage.aoqt
    /* renamed from: a */
    public final aopd mo48buildPartial() {
        if (this.isBuilt) {
            return (aopd) this.instance;
        }
        ((aopd) this.instance).l.f();
        return (aopd) super.mo48buildPartial();
    }

    @Deprecated
    public final void cf(Iterable iterable) {
        copyOnWrite();
        apjj apjjVar = (apjj) this.instance;
        apjj apjjVar2 = apjj.a;
        aopu aopuVar = apjjVar.c;
        if (!aopuVar.c()) {
            apjjVar.c = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll(iterable, (List) apjjVar.c);
    }

    public final void cg(Iterable iterable) {
        copyOnWrite();
        apjj apjjVar = (apjj) this.instance;
        apjj apjjVar2 = apjj.a;
        aopu aopuVar = apjjVar.b;
        if (!aopuVar.c()) {
            apjjVar.b = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll(iterable, (List) apjjVar.b);
    }

    public final void ch(arai araiVar) {
        copyOnWrite();
        arag aragVar = (arag) this.instance;
        arag aragVar2 = arag.a;
        araiVar.getClass();
        aragVar.a();
        aragVar.c.add(araiVar);
    }

    public final void ci(Iterable iterable) {
        copyOnWrite();
        asaj asajVar = (asaj) this.instance;
        asaj asajVar2 = asaj.a;
        aopu aopuVar = asajVar.F;
        if (!aopuVar.c()) {
            asajVar.F = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll(iterable, (List) asajVar.F);
    }

    public final void cj(Iterable iterable) {
        copyOnWrite();
        aslq aslqVar = (aslq) this.instance;
        aslq aslqVar2 = aslq.a;
        aslqVar.a();
        aonk.addAll(iterable, (List) aslqVar.e);
    }

    public final void ck(aslt asltVar) {
        copyOnWrite();
        aslq aslqVar = (aslq) this.instance;
        aslq aslqVar2 = aslq.a;
        asltVar.getClass();
        aslqVar.a();
        aslqVar.e.add(asltVar);
    }

    public final void cl(asls aslsVar) {
        copyOnWrite();
        aslq aslqVar = (aslq) this.instance;
        aslq aslqVar2 = aslq.a;
        aslsVar.getClass();
        aslqVar.e();
        aslqVar.f.add(aslsVar);
    }

    public final void cm(atra atraVar) {
        copyOnWrite();
        atrc atrcVar = (atrc) this.instance;
        aopr aoprVar = atrc.a;
        atraVar.getClass();
        atrcVar.a();
        atrcVar.e.g(atraVar.e);
    }

    public final void cn(aunb aunbVar) {
        copyOnWrite();
        audk audkVar = (audk) this.instance;
        audk audkVar2 = audk.a;
        aunbVar.getClass();
        aopu aopuVar = audkVar.w;
        if (!aopuVar.c()) {
            audkVar.w = aopi.mutableCopy(aopuVar);
        }
        audkVar.w.add(aunbVar);
    }

    public final void co(aunb aunbVar) {
        copyOnWrite();
        auxn auxnVar = (auxn) this.instance;
        auxn auxnVar2 = auxn.a;
        aunbVar.getClass();
        aopu aopuVar = auxnVar.c;
        if (!aopuVar.c()) {
            auxnVar.c = aopi.mutableCopy(aopuVar);
        }
        auxnVar.c.add(aunbVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aopa
    public final void copyOnWriteInternal() {
        super.copyOnWriteInternal();
        aopd aopdVar = (aopd) this.instance;
        aopdVar.l = aopdVar.l.clone();
    }

    public final void cp(avhm avhmVar) {
        copyOnWrite();
        avhn avhnVar = (avhn) this.instance;
        avhn avhnVar2 = avhn.a;
        avhmVar.getClass();
        avhnVar.a();
        avhnVar.c.add(avhmVar);
    }

    public final awdn cq(int i) {
        return (awdn) ((awdu) this.instance).c.get(i);
    }

    public final void cr(aopa aopaVar) {
        copyOnWrite();
        aqfa aqfaVar = (aqfa) this.instance;
        avhc avhcVar = (avhc) aopaVar.mo39build();
        aqfa aqfaVar2 = aqfa.a;
        avhcVar.getClass();
        aopu aopuVar = aqfaVar.x;
        if (!aopuVar.c()) {
            aqfaVar.x = aopi.mutableCopy(aopuVar);
        }
        aqfaVar.x.add(avhcVar);
    }

    public final void cs(aopc aopcVar) {
        copyOnWrite();
        arag aragVar = (arag) this.instance;
        arai araiVar = (arai) aopcVar.mo39build();
        arag aragVar2 = arag.a;
        araiVar.getClass();
        aragVar.a();
        aragVar.c.add(araiVar);
    }

    public final void ct(aopa aopaVar) {
        copyOnWrite();
        aslq aslqVar = (aslq) this.instance;
        asls aslsVar = (asls) aopaVar.mo39build();
        aslq aslqVar2 = aslq.a;
        aslsVar.getClass();
        aslqVar.e();
        aslqVar.f.add(aslsVar);
    }

    public final void cu(aopa aopaVar) {
        copyOnWrite();
        audg audgVar = (audg) this.instance;
        audf audfVar = (audf) aopaVar.mo39build();
        audg audgVar2 = audg.a;
        audfVar.getClass();
        audgVar.a();
        audgVar.i.add(audfVar);
    }

    public final void cv(aopa aopaVar) {
        copyOnWrite();
        auex auexVar = (auex) this.instance;
        avhc avhcVar = (avhc) aopaVar.mo39build();
        auex auexVar2 = auex.a;
        avhcVar.getClass();
        aopu aopuVar = auexVar.v;
        if (!aopuVar.c()) {
            auexVar.v = aopi.mutableCopy(aopuVar);
        }
        auexVar.v.add(avhcVar);
    }

    public final void cw(aopa aopaVar) {
        copyOnWrite();
        avhn avhnVar = (avhn) this.instance;
        avhm avhmVar = (avhm) aopaVar.mo39build();
        avhn avhnVar2 = avhn.a;
        avhmVar.getClass();
        avhnVar.a();
        avhnVar.c.add(avhmVar);
    }

    public final void cx(int i, aopa aopaVar) {
        copyOnWrite();
        awda awdaVar = (awda) this.instance;
        awdx awdxVar = (awdx) aopaVar.mo39build();
        awda awdaVar2 = awda.a;
        awdxVar.getClass();
        aopu aopuVar = awdaVar.e;
        if (!aopuVar.c()) {
            awdaVar.e = aopi.mutableCopy(aopuVar);
        }
        awdaVar.e.set(i, awdxVar);
    }

    public final void d(aooq aooqVar) {
        aopg checkIsLite;
        checkIsLite = aopi.checkIsLite(aooqVar);
        cz(checkIsLite);
        copyOnWrite();
        aoov cy = cy();
        cy.b.remove(checkIsLite.d);
        if (cy.b.isEmpty()) {
            cy.d = false;
        }
    }

    public final void e(aooq aooqVar, Object obj) {
        aopg checkIsLite;
        checkIsLite = aopi.checkIsLite(aooqVar);
        cz(checkIsLite);
        copyOnWrite();
        aoov cy = cy();
        aopf aopfVar = checkIsLite.d;
        if (aopfVar.d) {
            if (aopfVar.a() == aosk.ENUM) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    arrayList.add(checkIsLite.d(obj2));
                }
                obj = arrayList;
            }
        } else {
            obj = checkIsLite.d(obj);
        }
        cy.n(aopfVar, obj);
    }

    @Override // defpackage.aope
    public final Object qm(aooq aooqVar) {
        return ((aopd) this.instance).qm(aooqVar);
    }

    @Override // defpackage.aope
    public final boolean qn(aooq aooqVar) {
        return ((aopd) this.instance).qn(aooqVar);
    }

    public aopc(aopd aopdVar) {
        super(aopdVar);
    }
}
