package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.udc.UdcCacheResponse;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bbpd  reason: default package */
/* loaded from: classes3.dex */
public class bbpd implements bbnh, bbly, bwrr {
    public bbdt a;
    public boolean b;
    private final bwrs<ilo> c;
    private final Runnable d;
    private final btvo e;
    private final dxio<bsvm> f;
    private final dxio<bbdv> g;
    private final dxio<bber> h;
    private final cklf i;
    private final bbol j;
    private final bbpc k;
    private List<bblx> l;

    public bbpd(btvo btvoVar, dxio<bsvm> dxioVar, dxio<ache> dxioVar2, dxio<bbdv> dxioVar3, dxio<bber> dxioVar4, cklf cklfVar, cqhn cqhnVar, bbol bbolVar, bwrs<ilo> bwrsVar, Runnable runnable, @dzsi dehn<UdcCacheResponse> dehnVar, bbpc bbpcVar) {
        this.e = btvoVar;
        this.f = dxioVar;
        this.g = dxioVar3;
        this.h = dxioVar4;
        this.i = cklfVar;
        this.j = bbolVar;
        this.c = bwrsVar;
        this.d = runnable;
        this.l = u(bwrsVar.c(), bbolVar);
        this.k = bbpcVar;
        if (dehnVar != null) {
            deha.q(dehnVar, new bbpb(this, dxioVar3, bwrsVar, runnable), dege.a);
        } else {
            this.b = true;
        }
        ilo c = bwrsVar.c();
        dbsk.s(c);
        bbdt D = dxioVar3.a().D(c);
        this.a = D;
        if (D != bbdt.GOOD_STATE || dxioVar4.a().a()) {
            return;
        }
        dxioVar4.a().b(20);
    }

    private static dcdc<bblx> u(@dzsi ilo iloVar, bbol bbolVar) {
        if (iloVar == null) {
            return dcdc.e();
        }
        dqbi dqbiVar = iloVar.h().bg;
        if (dqbiVar == null) {
            dqbiVar = dqbi.g;
        }
        dsrj<dqbq> dsrjVar = dqbiVar.c;
        ArrayList arrayList = new ArrayList(dsrjVar.size());
        for (dqbq dqbqVar : dsrjVar) {
            dxio a = ((dxjh) bbolVar.a).a();
            bbol.a(a, 1);
            Activity activity = (Activity) ((dxjd) bbolVar.b).a;
            bbol.a(activity, 2);
            cjqy a2 = bbolVar.c.a();
            bbol.a(a2, 3);
            bbol.a(dqbqVar, 4);
            arrayList.add(new bbok(a, activity, a2, dqbqVar));
        }
        return dcdc.r(arrayList);
    }

    @Override // defpackage.bbnh
    public String a() {
        return (String) dbsg.j(this.c.c()).h(bboy.a).c("");
    }

    @Override // defpackage.bbnh
    public Integer b() {
        return (Integer) ((dbsg) dbsg.j(this.c.c()).h(bboz.a).b()).h(bbpa.a).c(0);
    }

    @Override // defpackage.bbnh
    public cqkl c() {
        this.d.run();
        return cqkl.a;
    }

    @Override // defpackage.bbnh
    public cqkl d() {
        this.f.a().C(this.c);
        return cqkl.a;
    }

    @Override // defpackage.bbnh
    public Boolean e() {
        boolean z = false;
        if (this.b && !f().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bbnh
    public Boolean f() {
        ilo c = this.c.c();
        dbsk.s(c);
        return Boolean.valueOf(!c.h);
    }

    @Override // defpackage.bbnh
    public cqkl g() {
        bber a = this.h.a();
        bwrs<ilo> bwrsVar = this.c;
        gga ggaVar = a.a;
        bwqv bwqvVar = a.b;
        bbep bbepVar = new bbep();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "cp", bwrsVar);
        bbepVar.B(bundle);
        ggaVar.D(bbepVar);
        return cqkl.a;
    }

    @Override // defpackage.bbnh
    public Boolean h() {
        return Boolean.valueOf(this.e.getEnableFeatureParameters().aQ);
    }

    @Override // defpackage.bbnh
    public Boolean i() {
        return Boolean.valueOf(this.e.getLocalPreferencesParameters().a);
    }

    @Override // defpackage.bbnh
    public cqkl j() {
        this.i.a("android_personal_score");
        return cqkl.a;
    }

    @Override // defpackage.bbnh
    public Boolean k() {
        return false;
    }

    @Override // defpackage.bbnh
    public Boolean m(bbdt... bbdtVarArr) {
        boolean z = false;
        for (bbdt bbdtVar : bbdtVarArr) {
            z = z || this.a == bbdtVar;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bbnh
    public bbdt n() {
        return this.a;
    }

    @Override // defpackage.bbly
    public List<bblx> o() {
        return this.l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r0 != 7) goto L7;
     */
    @Override // defpackage.bbnh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.cqkl p() {
        /*
            r2 = this;
            bbdt r0 = defpackage.bbdt.LOW_CONFIDENCE
            bbdt r0 = r2.a
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == r1) goto L16
            r1 = 2
            if (r0 == r1) goto L12
            r1 = 7
            if (r0 == r1) goto L16
            goto L19
        L12:
            r2.c()
            goto L19
        L16:
            r2.g()
        L19:
            cqkl r0 = defpackage.cqkl.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbpd.p():cqkl");
    }

    @Override // defpackage.bbnh
    @dzsi
    public cjtd q() {
        ddho ddhoVar;
        bbdt bbdtVar = bbdt.LOW_CONFIDENCE;
        int ordinal = this.a.ordinal();
        if (ordinal == 0) {
            ddhoVar = dtxy.bn;
        } else if (ordinal == 1) {
            ddhoVar = dtxy.br;
        } else if (ordinal == 2) {
            ddhoVar = dtxy.by;
        } else if (ordinal != 3) {
            ddhoVar = ordinal != 7 ? null : dtxy.bt;
        } else {
            ddhoVar = dtxy.bw;
        }
        if (ddhoVar == null) {
            return null;
        }
        cjta b = cjtd.b();
        b.d = ddhoVar;
        ilo c = this.c.c();
        dbsk.s(c);
        this.g.a().I(c, b);
        return b.a();
    }

    @Override // defpackage.bbnh
    @dzsi
    public cjtd r() {
        ddho ddhoVar;
        bbdt bbdtVar = bbdt.LOW_CONFIDENCE;
        int ordinal = this.a.ordinal();
        if (ordinal == 1) {
            ddhoVar = dtxy.bs;
        } else if (ordinal != 2) {
            ddhoVar = ordinal != 7 ? null : dtxy.bu;
        } else {
            ddhoVar = dtxy.bz;
        }
        if (ddhoVar != null) {
            return cjtd.a(ddhoVar);
        }
        return null;
    }

    @Override // defpackage.bbnh
    public cqkl s() {
        bbdw e = bbdx.e();
        ((bbdr) e).a = this.c;
        e.c(this.e.getEnableFeatureParameters().aL);
        this.g.a().m(e.a());
        return cqkl.a;
    }

    @Override // defpackage.bwrr
    /* renamed from: t */
    public void PV(@dzsi ilo iloVar) {
        if (iloVar != null) {
            this.a = this.g.a().D(iloVar);
        }
        this.l = u(iloVar, this.j);
        cqkx.p(this);
        ((bbda) this.k).g();
    }
}
