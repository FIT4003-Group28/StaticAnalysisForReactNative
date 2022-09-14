package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: beox  reason: default package */
/* loaded from: classes3.dex */
public class beox extends beoj {
    public final beos b;
    private final cqfd c;
    private final beoh k;
    private final dgfy l;

    public beox(ff ffVar, cqhn cqhnVar, bgyb bgybVar, beot beotVar, beoh beohVar, bepv bepvVar, beid beidVar, Executor executor, String str, bwrs<bvrt<benb>> bwrsVar, dgfy dgfyVar, bwrs<ilo> bwrsVar2, jic jicVar) {
        super(ffVar, cqhnVar, bgybVar, bepvVar, bwrsVar, beidVar, bwrsVar2, executor);
        this.c = new beow(this);
        beor a = beotVar.a.a();
        beot.a(a, 1);
        beot.a(str, 2);
        beot.a(dgfyVar, 3);
        beot.a(bwrsVar2, 4);
        beot.a(jicVar, 5);
        this.b = new beos(a, str, dgfyVar, bwrsVar2, jicVar);
        this.k = beohVar;
        this.l = dgfyVar;
    }

    @Override // defpackage.beoj, defpackage.beol
    public void a() {
        super.a();
        q();
    }

    @Override // defpackage.benp
    public List<cqix<?>> c() {
        dccx<cqix<?>> F = dcdc.F();
        p(F);
        F.g(cqgr.fT(new bekb(), this.b));
        beog beogVar = this.a;
        if (beogVar != null) {
            beogVar.g(F);
        }
        return F.f();
    }

    @Override // defpackage.benp
    public cqfd i() {
        return this.c;
    }

    @Override // defpackage.beol
    public void n() {
        super.n();
        beoh beohVar = this.k;
        String str = this.l.d;
        bwrs<bvrt<benb>> bwrsVar = this.g;
        bwrs<ilo> bwrsVar2 = this.h;
        ddda dddaVar = ddda.df;
        ddda dddaVar2 = ddda.dg;
        ff ffVar = (ff) ((dxjd) beohVar.a).a;
        beoh.a(ffVar, 1);
        apnm a = beohVar.b.a();
        beoh.a(a, 2);
        beoh.a(beohVar.c.a(), 3);
        bgyj a2 = beohVar.d.a();
        beoh.a(a2, 4);
        beib a3 = beohVar.e.a();
        beoh.a(a3, 5);
        cjqy a4 = beohVar.g.a();
        beoh.a(a4, 7);
        Executor a5 = beohVar.h.a();
        beoh.a(a5, 8);
        beoh.a(bwrsVar, 10);
        beoh.a(this, 11);
        beoh.a(bwrsVar2, 12);
        beoh.a(dddaVar, 13);
        beoh.a(dddaVar2, 14);
        this.a = new beog(ffVar, a, a2, a3, beohVar.f.a(), a4, a5, str, bwrsVar, this, bwrsVar2, dddaVar, dddaVar2);
    }
}
