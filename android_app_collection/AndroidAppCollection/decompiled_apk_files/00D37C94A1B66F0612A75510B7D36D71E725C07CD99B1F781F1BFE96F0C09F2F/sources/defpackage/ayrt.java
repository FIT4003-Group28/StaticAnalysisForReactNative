package defpackage;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayrt  reason: default package */
/* loaded from: classes2.dex */
public final class ayrt extends AtomicReference implements ayom, aypg {
    public static final Object a = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue b;

    public ayrt(Queue queue) {
        this.b = queue;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.b.offer(azoq.b(th));
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        Queue queue = this.b;
        azoq azoqVar = azoq.a;
        queue.offer(obj);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() == ayqi.a;
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (ayqi.c(this)) {
            this.b.offer(a);
        }
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.b.offer(azoq.a);
    }
}
