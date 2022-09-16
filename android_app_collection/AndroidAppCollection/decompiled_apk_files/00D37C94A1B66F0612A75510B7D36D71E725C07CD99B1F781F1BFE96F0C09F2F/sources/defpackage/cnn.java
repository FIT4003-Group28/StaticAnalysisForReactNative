package defpackage;

import java.util.Queue;
/* compiled from: PG */
/* renamed from: cnn  reason: default package */
/* loaded from: classes2.dex */
public final class cnn {
    private static final Queue a = cvd.h(0);
    private int b;
    private int c;
    private Object d;

    private cnn() {
    }

    public static cnn b(Object obj) {
        cnn cnnVar;
        Queue queue = a;
        synchronized (queue) {
            cnnVar = (cnn) queue.poll();
        }
        if (cnnVar == null) {
            cnnVar = new cnn();
        }
        cnnVar.d = obj;
        cnnVar.c = 0;
        cnnVar.b = 0;
        return cnnVar;
    }

    public final void a() {
        Queue queue = a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cnn) {
            cnn cnnVar = (cnn) obj;
            int i = cnnVar.c;
            int i2 = cnnVar.b;
            if (this.d.equals(cnnVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
