package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: cwin  reason: default package */
/* loaded from: classes5.dex */
public final class cwin {
    public final Queue<Runnable> a = new ArrayDeque();
    public final cwim b;

    public cwin(cwim cwimVar) {
        this.b = cwimVar;
    }

    public final void a() {
        czhz.b();
        while (!this.a.isEmpty()) {
            this.a.remove().run();
        }
    }
}
