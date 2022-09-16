package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: yma  reason: default package */
/* loaded from: classes4.dex */
public abstract class yma implements ymc, yly {
    public final amvn a;
    public volatile boolean b;
    private final Executor c;
    private final ymb d;
    private volatile boolean e;

    public yma(Executor executor, amvn amvnVar, ymb ymbVar) {
        this.c = executor;
        amvnVar.getClass();
        this.a = amvnVar;
        this.d = ymbVar;
        amzs it = amvnVar.iterator();
        while (it.hasNext()) {
            ((ylz) it.next()).a = this;
        }
    }

    @Override // defpackage.yly
    public final void a() {
        d();
    }

    protected abstract Runnable b();

    @Override // defpackage.ymc
    public void c() {
        throw null;
    }

    @Override // defpackage.ymc
    public final void d() {
        amzs it = this.a.iterator();
        while (it.hasNext()) {
            if (!((ylz) it.next()).c()) {
                return;
            }
        }
        if (this.b || this.e) {
            return;
        }
        this.e = true;
        this.c.execute(b());
        this.d.b(this);
    }
}
