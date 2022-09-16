package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azjv  reason: default package */
/* loaded from: classes2.dex */
public final class azjv implements ayom {
    final azju a;
    final azml b;
    volatile boolean c;
    Throwable d;
    final AtomicReference e = new AtomicReference();

    public azjv(azju azjuVar, int i) {
        this.a = azjuVar;
        this.b = new azml(i);
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.d = th;
        this.c = true;
        this.a.f();
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        this.b.k(obj);
        this.a.f();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        ayqi.g(this.e, aypgVar);
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.c = true;
        this.a.f();
    }
}
