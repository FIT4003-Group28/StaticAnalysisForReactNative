package defpackage;

import android.view.Choreographer;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dfv  reason: default package */
/* loaded from: classes3.dex */
public abstract class dfv {
    public final AtomicReference a = new AtomicReference();
    private Runnable b;
    private Choreographer.FrameCallback c;

    public final Choreographer.FrameCallback a() {
        if (this.c == null) {
            this.c = new dft(this);
        }
        return this.c;
    }

    public final Runnable b() {
        if (this.b == null) {
            this.b = new dfu(this);
        }
        return this.b;
    }

    public abstract void c(long j);

    public final void d(long j) {
        this.a.getAndSet(null);
        czu.t();
        try {
            c(j);
        } finally {
        }
    }
}
