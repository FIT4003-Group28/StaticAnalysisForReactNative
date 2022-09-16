package defpackage;

import android.content.res.Configuration;
/* compiled from: PG */
/* renamed from: brzd  reason: default package */
/* loaded from: classes4.dex */
public class brzd implements brzb, bsks, aelb {
    private static final bskq a;
    private final bskt b;
    private final brzx c;
    @dzsi
    private brzc d;
    private boolean e;

    static {
        bskp f = bskq.f();
        bsjo bsjoVar = (bsjo) f;
        bsjoVar.a = dtya.F;
        bsjoVar.b = dtya.F;
        bsjoVar.c = dtya.A;
        bsjoVar.d = dtxp.y;
        bsjoVar.e = dtya.t;
        a = f.a();
    }

    public brzd(bskt bsktVar, aehr aehrVar, brzx brzxVar, cqhn cqhnVar, boolean z) {
        this.b = bsktVar;
        this.c = brzxVar;
        this.e = z;
    }

    private final void m(final bsjm bsjmVar) {
        if (bsjmVar != null) {
            brzx brzxVar = this.c;
            dcdc z = dcbg.b(bsjm.a).o(new dbsl(bsjmVar) { // from class: bsjj
                private final bsjm a;

                {
                    this.a = bsjmVar;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return this.a.i(((Integer) obj).intValue());
                }
            }).z();
            int i = 0;
            if (z.size() == 1) {
                i = ((Integer) z.get(0)).intValue();
            }
            brzxVar.c(bsjmVar, i);
        }
    }

    @Override // defpackage.aelb
    public void a(eapg eapgVar, eapg eapgVar2, ddho ddhoVar, cjqm cjqmVar) {
        throw null;
    }

    @Override // defpackage.brzb
    public bskr b() {
        return this.b;
    }

    @Override // defpackage.brzb
    public cqkl c() {
        brzc brzcVar = this.d;
        if (brzcVar != null) {
            brzcVar.g();
        }
        return cqkl.a;
    }

    @Override // defpackage.brzb
    @dzsi
    public brzv d() {
        if (this.c.e() != 0) {
            return this.c;
        }
        return null;
    }

    @Override // defpackage.brzb
    public Boolean e() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.brzb
    public void f(boolean z) {
        this.e = true;
    }

    public void g(@dzsi brzc brzcVar) {
        this.d = brzcVar;
        this.b.c(this);
        this.c.d(this);
    }

    @Override // defpackage.bsks
    public void h(bsjm bsjmVar, cjqm cjqmVar) {
        brzc brzcVar = this.d;
        if (brzcVar != null) {
            brzcVar.e(bsjmVar, ddda.aA, cjqmVar);
        }
        cqkx.p(this);
    }

    @Override // defpackage.bsks
    public void i(int i) {
        brzc brzcVar = this.d;
        if (brzcVar != null) {
            brzcVar.f(i);
        }
    }

    public void j(bsjm bsjmVar) {
        m(bsjmVar);
        this.b.d(a, bsjmVar);
    }

    public void k(bsjm bsjmVar) {
        m(bsjmVar);
        this.b.e(bsjmVar);
    }

    public void l(Configuration configuration) {
        this.b.b();
    }
}
