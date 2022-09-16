package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: yjg  reason: default package */
/* loaded from: classes4.dex */
public abstract class yjg {
    protected final azpo b = azpo.W();

    protected abstract void a();

    @Deprecated
    public final void b(Executor executor) {
        executor.execute(new Runnable() { // from class: yjf
            @Override // java.lang.Runnable
            public final void run() {
                yjg.this.c();
            }
        });
    }

    public final synchronized void c() {
        azpo azpoVar = this.b;
        if (azpoVar.c.get() != azpo.b || azpoVar.e != null) {
            azpo azpoVar2 = this.b;
            if (azpoVar2.c.get() != azpo.b || azpoVar2.e == null) {
                a();
                this.b.sm();
            }
        }
    }
}
