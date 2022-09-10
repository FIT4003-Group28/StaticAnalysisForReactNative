package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: azie  reason: default package */
/* loaded from: classes3.dex */
public final class azie implements axwe {
    private final azof a;
    private final axwq b;
    private final cqat c;
    private final ckcw d;

    public azie(azof azofVar, axwq axwqVar, cqat cqatVar, ckcw ckcwVar) {
        this.a = azofVar;
        this.b = axwqVar;
        this.c = cqatVar;
        this.d = ckcwVar;
    }

    @Override // defpackage.axwe
    public final dcdc<azwc> a() {
        bvrj.UI_THREAD.d();
        return this.a.a(azxm.g);
    }

    @Override // defpackage.axwe
    public final void b(azwc azwcVar) {
        bvrj.UI_THREAD.d();
        ((ckco) this.d.a(ckeo.d)).a(ckek.a(1));
        this.a.g(azxm.g, f(azwcVar));
    }

    @Override // defpackage.axwe
    public final void c(azwc azwcVar) {
        bvrj.UI_THREAD.d();
        ((ckco) this.d.a(ckeo.d)).a(ckek.a(2));
        this.a.j(f(azwcVar));
    }

    @Override // defpackage.axwe
    public final void d(List<azwc> list) {
        bvrj.UI_THREAD.d();
        ((ckco) this.d.a(ckeo.d)).b(ckek.a(2), list.size());
        this.a.k(dcdc.q(dcbg.b(list).s(new dbrn(this) { // from class: azid
            private final azie a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.f((azwc) obj);
            }
        })));
    }

    @Override // defpackage.axwe
    public final void e() {
        bvrj.UI_THREAD.d();
        ((ckco) this.d.a(ckeo.d)).a(ckek.a(3));
        this.b.s(null);
    }

    public final azwc f(azwc azwcVar) {
        dojz s = azwcVar.s();
        if (s == null) {
            s = dojz.c;
        }
        azwb i = azwcVar.i();
        dokg ca = dokh.d.ca(azwcVar.j());
        dojy ca2 = dojz.c.ca(s);
        long b = this.c.b();
        if (ca2.c) {
            ca2.bF();
            ca2.c = false;
        }
        dojz dojzVar = (dojz) ca2.b;
        dojzVar.a |= 1;
        dojzVar.b = b;
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dokh dokhVar = (dokh) ca.b;
        dojz bK = ca2.bK();
        bK.getClass();
        dokhVar.c = bK;
        dokhVar.a |= 2;
        i.c(ca.bK());
        return i.b();
    }
}
