package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aswi  reason: default package */
/* loaded from: classes2.dex */
public final class aswi extends asvw {
    final asxv h;
    private final asxw i;

    public aswi(btrm btrmVar, bvjj bvjjVar, araa araaVar, asxw asxwVar, aufc aufcVar, Executor executor, asvx asvxVar) {
        super(btrmVar, bvjjVar, araaVar, true, aufcVar, executor, asvxVar);
        this.h = new aswh(this);
        this.i = asxwVar;
    }

    @Override // defpackage.asvw, defpackage.asmo
    public final void b() {
        super.b();
        this.i.F(this.h);
        btrm btrmVar = this.a;
        dceq a = dcet.a();
        a.b(crhd.class, new aswj(crhd.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.asvw, defpackage.asmo
    public final void c() {
        this.a.a(this);
        this.i.G(this.h);
        super.c();
    }
}
