package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: PG */
/* renamed from: yjj  reason: default package */
/* loaded from: classes4.dex */
public abstract class yjj implements yiw {
    public static final LinkedBlockingQueue a = new LinkedBlockingQueue();
    private final yiw b;

    public yjj(yiw yiwVar) {
        yiwVar.getClass();
        this.b = yiwVar;
    }

    private static yji c() {
        yji yjiVar = (yji) a.poll();
        return yjiVar != null ? yjiVar : new yji();
    }

    @Override // defpackage.yiw
    public final void a(Object obj, Exception exc) {
        yji c = c();
        c.a = this.b;
        c.b = obj;
        c.d = exc;
        c.c = null;
        c.e = false;
        d(c);
    }

    @Override // defpackage.yiw
    public final void b(Object obj, Object obj2) {
        yji c = c();
        c.a = this.b;
        c.b = obj;
        c.c = obj2;
        c.d = null;
        c.e = true;
        d(c);
    }

    protected abstract void d(Runnable runnable);
}
