package defpackage;

import android.view.Choreographer;
/* compiled from: PG */
/* renamed from: anp  reason: default package */
/* loaded from: classes2.dex */
public final class anp {
    private final Choreographer a = Choreographer.getInstance();

    public final void a(final Runnable runnable) {
        this.a.postFrameCallback(new Choreographer.FrameCallback(runnable) { // from class: ano
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                this.a.run();
            }
        });
    }
}
