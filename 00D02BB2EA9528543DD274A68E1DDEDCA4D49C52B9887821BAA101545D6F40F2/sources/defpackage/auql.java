package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: auql  reason: default package */
/* loaded from: classes2.dex */
public final class auql {
    public final dzsj<bvjj> a;
    public final dzsj<akfa> b;
    @dzsi
    volatile Boolean c;
    private final dxio<auon> d;
    private final dxio<auom> e;
    private final Executor f;
    private final List<bvqg<auql>> g = new CopyOnWriteArrayList();

    public auql(dxio<auon> dxioVar, dxio<auom> dxioVar2, Executor executor, dzsj<bvjj> dzsjVar, dzsj<akfa> dzsjVar2) {
        this.d = dxioVar;
        this.e = dxioVar2;
        this.f = executor;
        this.a = dzsjVar;
        this.b = dzsjVar2;
    }

    private final void f() {
        for (bvqg<auql> bvqgVar : this.g) {
            bvqgVar.NU(this);
        }
    }

    public final void a(bvqg<auql> bvqgVar) {
        this.g.add(bvqgVar);
        bvqgVar.NU(this);
        if (this.c == null) {
            this.f.execute(new Runnable(this) { // from class: auqk
                private final auql a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    auql auqlVar = this.a;
                    auqlVar.d(auqlVar.a.a().o(bvjk.kt, auqlVar.b.a().j(), false));
                }
            });
        }
    }

    public final void b(bvqg<auql> bvqgVar) {
        this.g.remove(bvqgVar);
    }

    public final synchronized boolean c() {
        if (this.c == null) {
            return false;
        }
        return this.c.booleanValue();
    }

    public final synchronized void d(boolean z) {
        if (this.c == null) {
            this.c = Boolean.valueOf(z);
            if (this.c.booleanValue()) {
                f();
            }
        } else if (this.c.booleanValue() != z) {
            this.c = Boolean.valueOf(z);
            f();
        }
    }

    public final void e(int i, @dzsi String str) {
        if (this.e.a().a) {
            this.d.a().f(i, str);
        }
    }
}
