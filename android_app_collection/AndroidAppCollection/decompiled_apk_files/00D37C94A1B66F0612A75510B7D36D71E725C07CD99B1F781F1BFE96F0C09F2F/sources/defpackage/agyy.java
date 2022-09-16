package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agyy  reason: default package */
/* loaded from: classes.dex */
public final class agyy implements agxs {
    public final agxs a;
    public Executor b;

    public agyy(agxs agxsVar, Executor executor) {
        this.a = agxsVar;
        this.b = executor;
    }

    @Override // defpackage.agxs
    public final void c(final boolean z) {
        this.b.execute(new Runnable() { // from class: agyt
            @Override // java.lang.Runnable
            public final void run() {
                agyy agyyVar = agyy.this;
                agyyVar.a.c(z);
            }
        });
    }

    @Override // defpackage.agxs
    public final void d(final Map map) {
        this.b.execute(new Runnable() { // from class: agyx
            @Override // java.lang.Runnable
            public final void run() {
                agyy agyyVar = agyy.this;
                agyyVar.a.d(map);
            }
        });
    }

    @Override // defpackage.agxs
    public final void e(agqz agqzVar) {
        this.b.execute(new agyu(this, agqzVar, 1));
    }

    @Override // defpackage.agxs
    public final void f(agqz agqzVar) {
        this.b.execute(new agyu(this, agqzVar));
    }

    @Override // defpackage.agxs
    public final void g(final agqz agqzVar, final boolean z) {
        this.b.execute(new Runnable() { // from class: agyw
            @Override // java.lang.Runnable
            public final void run() {
                agyy agyyVar = agyy.this;
                agyyVar.a.g(agqzVar, z);
            }
        });
    }

    @Override // defpackage.agxs
    public final void h(agqz agqzVar) {
        this.b.execute(new agyu(this, agqzVar, 2));
    }

    @Override // defpackage.agxs
    public final void i(agqz agqzVar) {
        this.b.execute(new agyu(this, agqzVar, 3));
    }

    @Override // defpackage.agxs
    public final void j(agqz agqzVar) {
        this.b.execute(new agyu(this, agqzVar, 4));
    }

    @Override // defpackage.agxs
    public final void k(agqz agqzVar) {
        this.b.execute(new agyu(this, agqzVar, 5));
    }

    @Override // defpackage.agxs
    public final void l(final agqz agqzVar, final atsg atsgVar, final agqe agqeVar) {
        this.b.execute(new Runnable() { // from class: agyv
            @Override // java.lang.Runnable
            public final void run() {
                agyy agyyVar = agyy.this;
                agyyVar.a.l(agqzVar, atsgVar, agqeVar);
            }
        });
    }

    @Override // defpackage.agxs
    public final void m(agqz agqzVar) {
        this.b.execute(new agyu(this, agqzVar, 6));
    }
}
