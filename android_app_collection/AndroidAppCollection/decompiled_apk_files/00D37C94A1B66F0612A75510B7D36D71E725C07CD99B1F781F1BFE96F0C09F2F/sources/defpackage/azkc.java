package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azkc  reason: default package */
/* loaded from: classes2.dex */
public abstract class azkc extends AtomicInteger implements bamf {
    private static final long serialVersionUID = 3100232009247827843L;
    final bame a;
    final azkb[] b;
    volatile boolean e;
    final azoj c = new azoj();
    final AtomicLong d = new AtomicLong();
    final AtomicInteger f = new AtomicInteger();

    public azkc(bame bameVar, int i, int i2) {
        this.a = bameVar;
        azkb[] azkbVarArr = new azkb[i];
        for (int i3 = 0; i3 < i; i3++) {
            azkbVarArr[i3] = new azkb(this, i2);
        }
        this.b = azkbVarArr;
        this.f.lazySet(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        for (azkb azkbVar : this.b) {
            azkbVar.e = null;
        }
    }

    public abstract void b();

    public abstract void d();

    public abstract void f(Throwable th);

    public abstract void g(azkb azkbVar, Object obj);

    @Override // defpackage.bamf
    public final void si() {
        if (!this.e) {
            this.e = true;
            for (azkb azkbVar : this.b) {
                azof.f(azkbVar);
            }
            if (getAndIncrement() != 0) {
                return;
            }
            a();
        }
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            ayno.a(this.d, j);
            b();
        }
    }
}
