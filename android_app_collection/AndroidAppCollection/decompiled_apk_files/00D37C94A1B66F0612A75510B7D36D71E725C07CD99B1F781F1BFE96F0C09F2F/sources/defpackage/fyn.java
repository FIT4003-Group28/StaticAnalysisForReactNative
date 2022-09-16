package defpackage;

import android.view.Choreographer;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: fyn  reason: default package */
/* loaded from: classes3.dex */
public final class fyn {
    static final fym a = new fym();
    public static final AtomicBoolean b = new AtomicBoolean();
    public static final Choreographer.FrameCallback c = fyl.a;

    public static void a() {
        ylr.c();
        if (b.compareAndSet(false, true)) {
            Choreographer.getInstance().postFrameCallback(c);
        }
    }

    public static void b() {
        ylr.c();
        if (b.compareAndSet(true, false)) {
            Choreographer.getInstance().removeFrameCallback(c);
        }
    }
}
