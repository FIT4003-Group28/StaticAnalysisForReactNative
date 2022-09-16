package defpackage;

import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: edm  reason: default package */
/* loaded from: classes3.dex */
public class edm implements wqg {
    private final wqf a;
    private final xdu b;
    public edl c;
    public edk d;
    private final xci e;
    private final aqtb f;
    private final edb g;

    public edm(edb edbVar, wqf wqfVar, xdu xduVar, xci xciVar, aqtb aqtbVar, edl edlVar, edk edkVar) {
        this.g = edbVar;
        this.a = wqfVar;
        this.b = xduVar;
        this.e = xciVar;
        this.f = aqtbVar;
        this.c = edlVar;
        this.d = edkVar;
    }

    @Override // defpackage.wqg
    public final xci a() {
        throw null;
    }

    @Override // defpackage.wqg
    public void b() {
    }

    @Override // defpackage.wqg
    public void qH() {
    }

    @Override // defpackage.wqg
    public void qI() {
        ViewGroup a = this.c.a();
        if (a == null) {
            this.a.c(this.b, this.e, new wuo("No view available when trying to start rendering"));
            return;
        }
        ajrs a2 = this.d.a();
        if (a2 == null) {
            this.a.c(this.b, this.e, new wuo("No presentContext available when trying to start rendering"));
            return;
        }
        a.addView(this.g.a());
        a.setVisibility(0);
        this.g.a().setVisibility(0);
        edb edbVar = this.g;
        ampq ampqVar = this.e.i;
        aqtb aqtbVar = this.f;
        if (ampqVar.h()) {
            aopa createBuilder = asjj.a.createBuilder();
            createBuilder.copyOnWrite();
            asjj asjjVar = (asjj) createBuilder.instance;
            asjjVar.t = (asit) ampqVar.c();
            asjjVar.c |= 1024;
            a2.c = (asjj) createBuilder.mo39build();
        }
        a2.a(edbVar.a);
        ajhl ajhlVar = edbVar.b;
        ajin ajinVar = (ajin) edbVar.c.get();
        ajhlVar.oK(a2, ajhh.a(aqtbVar));
        this.a.a(this.b, this.e);
    }

    @Override // defpackage.wqg
    public void qJ(int i) {
        ViewGroup a;
        try {
            this.g.b.qZ(null);
            this.g.a().setVisibility(8);
            a = this.c.a();
        } catch (wuo e) {
            wwf.a(this.b, e.getMessage());
        }
        if (a == null) {
            throw new wuo("No view available when trying to reset container");
        }
        a.removeAllViews();
        a.setVisibility(8);
        this.a.d(this.b, this.e, i);
    }
}
