package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bfwo  reason: default package */
/* loaded from: classes3.dex */
public class bfwo implements bfwk, bcls {
    private final bcli a;
    private final bcku b;
    private final bckr c;
    private final bfwj d;
    private final cqhn e;
    private final Executor f;
    private final bfvz g;
    private final bcmk h;
    private final dxio<bbut> i;
    private volatile bfwn j;

    public bfwo(bcli bcliVar, bcku bckuVar, bckr bckrVar, bfwj bfwjVar, cqhn cqhnVar, Executor executor, bfvz bfvzVar, bcmk bcmkVar, dxio<bbut> dxioVar) {
        this.e = cqhnVar;
        this.f = executor;
        this.a = bcliVar;
        this.b = bckuVar;
        this.c = bckrVar;
        this.d = bfwjVar;
        this.g = bfvzVar;
        this.h = bcmkVar;
        this.i = dxioVar;
    }

    @Override // defpackage.bfwk
    public bclr a() {
        if (this.j == null) {
            return null;
        }
        return this.j.b;
    }

    @Override // defpackage.bfwk
    public bfwj b() {
        return this.d;
    }

    @Override // defpackage.bcls
    public void c(dspd dspdVar) {
        bvrj.UI_THREAD.c();
        if (this.j == null) {
            return;
        }
        this.i.a().G(bwrs.a(this.j.a), dspdVar);
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.d.t(bwrsVar);
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            return;
        }
        Executor executor = this.f;
        bckr bckrVar = this.c;
        bcku bckuVar = this.b;
        bfvz bfvzVar = this.g;
        bcli bcliVar = this.a;
        bfvz.a(bcliVar, 2);
        bfvz.a(bckuVar, 3);
        bfvz.a(bckrVar, 4);
        bcmm a = bfvzVar.a.a();
        bfvz.a(a, 5);
        this.j = new bfwn(executor, this, bckrVar, bckuVar, iloVar, new bfvy(iloVar, bcliVar, bckuVar, bckrVar, a), this.h);
    }

    @Override // defpackage.bega
    public void u() {
        this.d.u();
        this.j = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        bclr a = a();
        boolean z = false;
        if (a != null && a.e().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
