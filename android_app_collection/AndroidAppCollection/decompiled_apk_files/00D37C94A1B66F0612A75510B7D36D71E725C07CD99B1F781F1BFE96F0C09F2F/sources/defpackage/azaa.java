package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azaa  reason: default package */
/* loaded from: classes2.dex */
final class azaa extends AtomicReference implements Runnable, bamf {
    private static final long serialVersionUID = -2809475196591179431L;
    final bame a;
    volatile boolean b;

    public azaa(bame bameVar) {
        this.a = bameVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() != ayqi.a) {
            if (this.b) {
                this.a.c(0L);
                lazySet(ayqj.INSTANCE);
                this.a.sm();
                return;
            }
            lazySet(ayqj.INSTANCE);
            this.a.b(new aypp("Can't deliver value due to lack of requests"));
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        ayqi.c(this);
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            this.b = true;
        }
    }
}
