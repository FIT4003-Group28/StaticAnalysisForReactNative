package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azjr  reason: default package */
/* loaded from: classes2.dex */
final class azjr extends AtomicReference implements ayom, aypg {
    private static final long serialVersionUID = -312246233408980075L;
    final ayom a;
    final aypx b;
    final AtomicReference c = new AtomicReference();
    final AtomicReference d = new AtomicReference();

    public azjr(ayom ayomVar, aypx aypxVar) {
        this.a = ayomVar;
        this.b = aypxVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        ayqi.c(this.d);
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        Object obj2 = get();
        if (obj2 != null) {
            try {
                Object a = this.b.a(obj, obj2);
                ayrd.b(a, "The combiner returned a null value");
                this.a.c(a);
            } catch (Throwable th) {
                bapv.j(th);
                qr();
                this.a.b(th);
            }
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) this.c.get());
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this.c);
        ayqi.c(this.d);
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        ayqi.g(this.c, aypgVar);
    }

    @Override // defpackage.ayom
    public final void sm() {
        ayqi.c(this.d);
        this.a.sm();
    }
}
