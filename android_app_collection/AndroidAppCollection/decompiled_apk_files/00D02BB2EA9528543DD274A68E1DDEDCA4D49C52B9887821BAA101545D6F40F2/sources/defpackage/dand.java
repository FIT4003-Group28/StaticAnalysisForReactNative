package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: dand  reason: default package */
/* loaded from: classes5.dex */
final class dand<ResultT> {
    private final Object a = new Object();
    private Queue<danc<ResultT>> b;
    private boolean c;

    public final void a(danc<ResultT> dancVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(dancVar);
        }
    }

    public final void b(danb<ResultT> danbVar) {
        danc<ResultT> poll;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        poll = this.b.poll();
                        if (poll == null) {
                            this.c = false;
                            return;
                        }
                    }
                    poll.a(danbVar);
                }
            }
        }
    }
}
