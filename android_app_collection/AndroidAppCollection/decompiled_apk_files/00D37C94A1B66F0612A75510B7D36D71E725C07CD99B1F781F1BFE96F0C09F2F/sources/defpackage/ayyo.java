package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayyo  reason: default package */
/* loaded from: classes2.dex */
public final class ayyo extends AtomicLong implements bamf, aypg {
    private static final long serialVersionUID = -4453897557930727610L;
    final ayys a;
    final bame b;
    Object c;
    final AtomicLong d = new AtomicLong();
    boolean e;
    boolean f;

    public ayyo(ayys ayysVar, bame bameVar) {
        this.a = ayysVar;
        this.b = bameVar;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() == Long.MIN_VALUE;
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.a.g(this);
            this.a.d();
            this.c = null;
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        qr();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (!azof.h(j) || ayno.b(this, j) == Long.MIN_VALUE) {
            return;
        }
        ayno.a(this.d, j);
        this.a.d();
        this.a.i.b(this);
    }
}
