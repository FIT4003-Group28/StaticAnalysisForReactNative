package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: cvq  reason: default package */
/* loaded from: classes5.dex */
final class cvq implements cvt {
    private final cua a;
    private final dujz b;
    private djiq c;
    private final cvp d;
    private final btrm e;
    private final AtomicBoolean f;

    public cvq(cua cuaVar, dujz dujzVar, btrm btrmVar, gga ggaVar) {
        int i = ctz.a;
        this.c = djiq.d;
        this.f = new AtomicBoolean(false);
        this.a = cuaVar;
        this.b = dujzVar;
        this.e = btrmVar;
        this.d = new cvp(cuaVar, ggaVar);
    }

    @Override // defpackage.cvt
    public final void a(djiq djiqVar) {
        int a = dqet.a(djiqVar.a);
        if (a == 0 || a != 3 || djiqVar.b.size() == 0) {
            return;
        }
        djiq djiqVar2 = this.c;
        if (djiqVar2.b.size() == djiqVar.b.size()) {
            for (int i = 0; i < djiqVar2.b.size(); i++) {
                if (djiqVar2.b.get(i).b.equals(djiqVar.b.get(i).b)) {
                }
            }
            return;
        }
        this.c = djiqVar;
        this.a.a(ctz.c(djiqVar, 2, this.b.h, true, dtyi.cn, dtyi.co));
        if (this.f.get()) {
            return;
        }
        this.f.set(true);
        btrm btrmVar = this.e;
        cvp cvpVar = this.d;
        dceq a2 = dcet.a();
        a2.b(ege.class, new cvr(0, ege.class, cvpVar, bvrj.UI_THREAD));
        a2.b(cxd.class, new cvr(1, cxd.class, cvpVar, bvrj.UI_THREAD));
        btrmVar.g(cvpVar, a2.a());
    }

    @Override // defpackage.cvt
    public final void b() {
        this.a.b();
        this.c = djiq.d;
        if (this.f.get()) {
            this.f.set(false);
            this.e.a(this.d);
        }
    }
}
