package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: gum  reason: default package */
/* loaded from: classes6.dex */
public final class gum {
    public final cjqy a;
    public final ddho b;
    public final ddho c;
    public final ddho d;
    public final ddho e;
    public final gul f;
    private final Executor g;
    private final cjqq h;
    private final axrx i;
    private final arag j;
    private final axru k;

    public gum(Executor executor, cjqy cjqyVar, cjqq cjqqVar, axrx axrxVar, arag aragVar, axru axruVar, ddho ddhoVar, ddho ddhoVar2, ddho ddhoVar3, ddho ddhoVar4, gul gulVar) {
        this.g = executor;
        this.a = cjqyVar;
        this.h = cjqqVar;
        this.i = axrxVar;
        this.j = aragVar;
        this.k = axruVar;
        this.b = ddhoVar;
        this.c = ddhoVar2;
        this.d = ddhoVar3;
        this.e = ddhoVar4;
        this.f = gulVar;
    }

    private final void d(ddho ddhoVar) {
        this.h.g().d(cjtd.a(ddhoVar));
    }

    public final void a() {
        if (!this.k.a("android.permission.ACCESS_COARSE_LOCATION")) {
            d(this.b);
            d(this.c);
            this.i.f(new guj(this));
            return;
        }
        b();
    }

    public final void b() {
        if (this.j.e()) {
            d(this.d);
            d(this.e);
            this.j.f(true, new guk(this));
            return;
        }
        c(true);
    }

    public final void c(final boolean z) {
        this.g.execute(new Runnable(this, z) { // from class: gui
            private final gum a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                gum gumVar = this.a;
                gumVar.f.a(this.b);
            }
        });
    }
}
