package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cgsr  reason: default package */
/* loaded from: classes4.dex */
public final class cgsr {
    public final Executor a;

    public cgsr(final bvrb bvrbVar) {
        this.a = dehx.b(new Executor(bvrbVar) { // from class: cgsq
            private final bvrb a;

            {
                this.a = bvrbVar;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.a.b(runnable, bvrj.BACKGROUND_THREADPOOL);
            }
        });
    }
}
