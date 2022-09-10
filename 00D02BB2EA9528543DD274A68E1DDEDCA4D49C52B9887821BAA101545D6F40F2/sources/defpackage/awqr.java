package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awqr  reason: default package */
/* loaded from: classes3.dex */
public final class awqr implements begq {
    final /* synthetic */ awtn a;
    final /* synthetic */ awqz b;

    public awqr(awqz awqzVar, awtn awtnVar) {
        this.b = awqzVar;
        this.a = awtnVar;
    }

    @Override // defpackage.begq
    public final void a(dwcy dwcyVar) {
        awtn awtnVar;
        bvrj.UI_THREAD.c();
        awtn f = this.b.h.f();
        if (f == null) {
            ((ckco) this.b.a.a(ckif.a)).a(ckie.a(3));
        } else if (!akqq.v(f.c(), this.a.c(), 10.0d)) {
            ((ckco) this.b.a.a(ckif.a)).a(ckie.a(4));
        } else if (!dwcyVar.d) {
            dvyw dvywVar = dwcyVar.b;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
            if (dvywVar.o.size() == 0) {
                ((ckco) this.b.a.a(ckif.a)).a(ckie.a(6));
                return;
            }
            awqz awqzVar = this.b;
            ily ilyVar = new ily();
            dvyw dvywVar2 = dwcyVar.b;
            if (dvywVar2 == null) {
                dvywVar2 = dvyw.bv;
            }
            ilyVar.E(dvywVar2);
            awqzVar.o = ilyVar.d();
            if (dbsj.d(f.e())) {
                awtm i = f.i();
                dvyw dvywVar3 = dwcyVar.b;
                if (dvywVar3 == null) {
                    dvywVar3 = dvyw.bv;
                }
                i.e(dvywVar3.i);
                f = i.k();
                this.b.k(f);
            }
            awqz awqzVar2 = this.b;
            awqe p = awqzVar2.p();
            if (p != null && (awtnVar = p.ar) != null && awtnVar.k() == f.k()) {
                p.g(f);
                p.i(awqzVar2.o);
            }
            ((ckco) this.b.a.a(ckif.a)).a(ckie.a(1));
        } else {
            ((ckco) this.b.a.a(ckif.a)).a(ckie.a(5));
        }
    }

    @Override // defpackage.begq
    public final void b() {
        ((ckco) this.b.a.a(ckif.a)).a(ckie.a(2));
    }
}
