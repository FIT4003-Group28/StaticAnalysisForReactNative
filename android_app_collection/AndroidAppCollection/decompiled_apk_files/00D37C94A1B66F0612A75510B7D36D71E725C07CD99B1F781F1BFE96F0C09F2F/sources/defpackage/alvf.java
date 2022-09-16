package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: alvf  reason: default package */
/* loaded from: classes.dex */
public final class alvf {
    private final Object a = new Object();
    private Queue b;
    private boolean c;

    public final void a(alve alveVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(alveVar);
        }
    }

    public final void b(alvd alvdVar) {
        alve alveVar;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        alveVar = (alve) this.b.poll();
                        if (alveVar == null) {
                            this.c = false;
                            return;
                        }
                    }
                    alveVar.a(alvdVar);
                }
            }
        }
    }
}
