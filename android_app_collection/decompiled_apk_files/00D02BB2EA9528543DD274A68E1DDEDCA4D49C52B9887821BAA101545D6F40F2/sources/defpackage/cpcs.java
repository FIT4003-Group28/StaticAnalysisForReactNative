package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpcs  reason: default package */
/* loaded from: classes.dex */
public final class cpcs<TResult> {
    private final Object a = new Object();
    private Queue<cpcr<TResult>> b;
    private boolean c;

    public final void a(cpcr<TResult> cpcrVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(cpcrVar);
        }
    }

    public final void b(cpcq<TResult> cpcqVar) {
        cpcr<TResult> poll;
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
                    poll.a(cpcqVar);
                }
            }
        }
    }
}
