package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayzs  reason: default package */
/* loaded from: classes2.dex */
public final class ayzs extends AtomicInteger implements ayoa, bamf {
    private static final long serialVersionUID = -4945480365982832967L;
    final bame a;
    final AtomicLong b = new AtomicLong();
    final AtomicReference c = new AtomicReference();
    final ayzr e = new ayzr(this);
    final azoj d = new azoj();

    public ayzs(bame bameVar) {
        this.a = bameVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        azof.f(this.e);
        axzl.h(this.a, th, this, this.d);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        axzl.i(this.a, obj, this, this.d);
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        azof.j(this.c, this.b, bamfVar);
    }

    @Override // defpackage.bamf
    public final void si() {
        azof.f(this.c);
        azof.f(this.e);
    }

    @Override // defpackage.bame
    public final void sm() {
        azof.f(this.e);
        axzl.f(this.a, this, this.d);
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        azof.a(this.c, this.b, j);
    }
}
