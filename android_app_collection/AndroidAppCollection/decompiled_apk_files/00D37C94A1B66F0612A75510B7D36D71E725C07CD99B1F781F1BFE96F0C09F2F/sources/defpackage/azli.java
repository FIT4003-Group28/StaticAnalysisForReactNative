package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azli  reason: default package */
/* loaded from: classes2.dex */
final class azli extends AtomicLong implements ayot, ayoa, bamf {
    private static final long serialVersionUID = 7759721921468635667L;
    final bame a;
    final ayqe b;
    final AtomicReference c = new AtomicReference();
    aypg d;

    public azli(bame bameVar, ayqe ayqeVar) {
        this.a = bameVar;
        this.b = ayqeVar;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        azof.j(this.c, this, bamfVar);
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        try {
            bamd bamdVar = (bamd) this.b.a(obj);
            ayrd.b(bamdVar, "the mapper returned a null Publisher");
            bamdVar.ad(this);
        } catch (Throwable th) {
            bapv.j(th);
            this.a.b(th);
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        this.d.qr();
        azof.f(this.c);
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        this.d = aypgVar;
        this.a.f(this);
    }

    @Override // defpackage.bame
    public final void sm() {
        this.a.sm();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        azof.a(this.c, this, j);
    }
}
