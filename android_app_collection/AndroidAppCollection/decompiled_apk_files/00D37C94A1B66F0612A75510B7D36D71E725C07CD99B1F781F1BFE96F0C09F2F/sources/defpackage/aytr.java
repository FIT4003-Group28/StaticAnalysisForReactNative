package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: aytr  reason: default package */
/* loaded from: classes2.dex */
final class aytr implements ayns {
    private final aypf a;
    private final AtomicBoolean b;
    private final ayns c;

    public aytr(aypf aypfVar, AtomicBoolean atomicBoolean, ayns aynsVar) {
        this.a = aypfVar;
        this.b = atomicBoolean;
        this.c = aynsVar;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        if (this.b.compareAndSet(false, true)) {
            this.a.qr();
            this.c.b(th);
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        this.a.d(aypgVar);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        if (this.b.compareAndSet(false, true)) {
            this.a.qr();
            this.c.sm();
        }
    }
}
