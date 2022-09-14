package c.e.a.b.g;

import java.util.ArrayDeque;
import java.util.Queue;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a0<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f4598a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private Queue<z<TResult>> f4599b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4600c;

    public final void a(h<TResult> hVar) {
        z<TResult> poll;
        synchronized (this.f4598a) {
            if (this.f4599b != null && !this.f4600c) {
                this.f4600c = true;
                while (true) {
                    synchronized (this.f4598a) {
                        poll = this.f4599b.poll();
                        if (poll == null) {
                            this.f4600c = false;
                            return;
                        }
                    }
                    poll.a(hVar);
                }
            }
        }
    }

    public final void a(z<TResult> zVar) {
        synchronized (this.f4598a) {
            if (this.f4599b == null) {
                this.f4599b = new ArrayDeque();
            }
            this.f4599b.add(zVar);
        }
    }
}
