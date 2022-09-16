package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: umj  reason: default package */
/* loaded from: classes4.dex */
public final class umj {
    public final Queue a = new ArrayDeque();
    public final umi b;

    public umj(umi umiVar) {
        this.b = umiVar;
    }

    public final void a() {
        uwp.f();
        while (!this.a.isEmpty()) {
            ((Runnable) this.a.remove()).run();
        }
    }
}
