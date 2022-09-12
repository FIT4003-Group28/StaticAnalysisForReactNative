package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: arxm  reason: default package */
/* loaded from: classes2.dex */
public final class arxm {
    final /* synthetic */ dccx a;
    final /* synthetic */ arxl b;
    final /* synthetic */ AtomicInteger c;
    final /* synthetic */ arxp d;

    public arxm(arxp arxpVar, dccx dccxVar, arxl arxlVar, AtomicInteger atomicInteger) {
        this.d = arxpVar;
        this.a = dccxVar;
        this.b = arxlVar;
        this.c = atomicInteger;
    }

    public final void a() {
        this.a.g(this.b.b());
        b();
    }

    public final void b() {
        if (this.c.decrementAndGet() == 0) {
            this.d.c.a(this.a.f());
        }
    }
}
