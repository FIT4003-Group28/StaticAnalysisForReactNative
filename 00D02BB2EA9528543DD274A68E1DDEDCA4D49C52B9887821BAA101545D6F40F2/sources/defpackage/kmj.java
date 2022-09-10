package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: kmj  reason: default package */
/* loaded from: classes7.dex */
public final class kmj extends nor {
    private static final cjsz e = new cjsz(dtxm.aV);
    public final not a;
    public final kdi b;
    public final nop c;
    public final dcdc<ldm> d;
    private final cqkj f;
    private final dnjf g;
    private final cqkf<koj> h;
    private final noo i;
    private final mij j;

    public kmj(cjqy cjqyVar, cjqq cjqqVar, kdi kdiVar, noo nooVar, nop nopVar, cqkj cqkjVar, not notVar, dcdc dcdcVar, dnjf dnjfVar, mij mijVar) {
        super(cjqyVar, cjqqVar);
        this.b = kdiVar;
        this.i = nooVar;
        this.c = nopVar;
        this.f = cqkjVar;
        this.a = notVar;
        this.d = dcdcVar;
        this.g = dnjfVar;
        this.j = mijVar;
        this.h = cqkjVar.d(new knx(), ((npb) notVar).b, false);
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        cqkf<koj> cqkfVar = this.h;
        Context context = this.f.d;
        noo nooVar = this.i;
        dnjf dnjfVar = this.g;
        dccx dccxVar = new dccx();
        int i = 0;
        int i2 = 0;
        while (i < dnjfVar.b.size()) {
            dccx dccxVar2 = new dccx();
            doex doexVar = dnjfVar.b.get(i);
            for (Iterator<dngk> it = doexVar.c.iterator(); it.hasNext(); it = it) {
                dccxVar2.g(new bevm(it.next(), this.f.d, i2, true, false, null, dnjfVar.c, dtxm.aD, dtxm.aF, dtxm.aE));
                i2++;
            }
            dccxVar.g(new kop(doexVar.b, i == dnjfVar.b.size() + (-1), new kmi(this, doexVar.d, doexVar.b), cjtd.a(dtxm.aY), new kok(dccxVar2.f(), cjtd.b)));
            i++;
        }
        cqkfVar.e(new koq(context, nooVar, dccxVar.f()));
    }

    @Override // defpackage.non
    public final noq b() {
        mio mioVar = this.j.a.a;
        mioVar.m(mioVar.q.k(), true);
        s(e);
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.h.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        t();
        this.j.a.a.n.D(null);
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
        this.h.h();
    }

    @Override // defpackage.non
    public final String g() {
        return "HostedEvStationsOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.a.b(noeVar, d());
    }
}
