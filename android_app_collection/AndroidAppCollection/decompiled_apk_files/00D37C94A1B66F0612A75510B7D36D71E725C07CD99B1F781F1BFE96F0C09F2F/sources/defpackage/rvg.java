package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rvg  reason: default package */
/* loaded from: classes4.dex */
public final class rvg {
    private final Object a = new Object();
    private Queue b;
    private boolean c;

    public final void a(rvf rvfVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(rvfVar);
        }
    }

    public final void b(rve rveVar) {
        rvf rvfVar;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        rvfVar = (rvf) this.b.poll();
                        if (rvfVar == null) {
                            this.c = false;
                            return;
                        }
                    }
                    rvfVar.a(rveVar);
                }
            }
        }
    }
}
