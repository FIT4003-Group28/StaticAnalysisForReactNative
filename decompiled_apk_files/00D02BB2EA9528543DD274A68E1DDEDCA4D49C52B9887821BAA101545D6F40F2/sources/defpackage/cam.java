package defpackage;

import java.util.Queue;
/* compiled from: PG */
/* renamed from: cam  reason: default package */
/* loaded from: classes4.dex */
final class cam<A> {
    private static final Queue<cam<?>> a = cjp.h(0);
    private int b;
    private int c;
    private A d;

    private cam() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <A> cam<A> a(A a2, int i, int i2) {
        cam<A> camVar;
        Queue<cam<?>> queue = a;
        synchronized (queue) {
            camVar = (cam<A>) queue.poll();
        }
        if (camVar == null) {
            camVar = new cam<>();
        }
        ((cam) camVar).d = a2;
        ((cam) camVar).c = i;
        ((cam) camVar).b = i2;
        return camVar;
    }

    public final void b() {
        Queue<cam<?>> queue = a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cam) {
            cam camVar = (cam) obj;
            if (this.c == camVar.c && this.b == camVar.b && this.d.equals(camVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d.hashCode();
    }
}
