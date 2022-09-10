package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bmbq  reason: default package */
/* loaded from: classes3.dex */
public class bmbq implements bmbg {
    public final bnxa a;
    private final bego b;
    private dcdc<bmbh> c;
    private Runnable d;

    public bmbq(bego begoVar, bnxa bnxaVar) {
        dcqe dcqeVar = cjtd.a;
        this.b = begoVar;
        this.a = bnxaVar;
        this.c = dcdc.e();
        this.d = bmbn.a;
    }

    @Override // defpackage.bmbg
    public List<bmbh> a() {
        return this.c;
    }

    @Override // defpackage.bmbg
    public Boolean b() {
        return Boolean.valueOf(this.b.h());
    }

    @Override // defpackage.bmbg
    public cqkl c() {
        this.d.run();
        return cqkl.a;
    }

    public Boolean d() {
        return Boolean.valueOf(!this.c.isEmpty());
    }

    public void e(dglq dglqVar) {
        boolean h = this.b.h();
        dglq a = bmbd.a(dglqVar);
        dccx F = dcdc.F();
        for (dgls dglsVar : a.c) {
            F.g(new bmbr(dglsVar, h));
        }
        this.c = F.f();
    }

    public void t(final bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            u();
            return;
        }
        cjta c = cjtd.c(iloVar.bZ());
        c.d = dtxo.Z;
        c.a();
        this.d = new Runnable(this, bwrsVar) { // from class: bmbo
            private final bmbq a;
            private final bwrs b;

            {
                this.a = this;
                this.b = bwrsVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bmbq bmbqVar = this.a;
                bmbqVar.a.a(this.b).a();
            }
        };
    }

    public void u() {
        dcqe dcqeVar = cjtd.a;
        this.d = bmbp.a;
    }
}
