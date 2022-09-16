package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayse  reason: default package */
/* loaded from: classes2.dex */
final class ayse implements ayns {
    final AtomicReference a;
    final ayns b;

    public ayse(AtomicReference atomicReference, ayns aynsVar) {
        this.a = atomicReference;
        this.b = aynsVar;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.b.b(th);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.i(this.a, aypgVar);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        this.b.sm();
    }
}
