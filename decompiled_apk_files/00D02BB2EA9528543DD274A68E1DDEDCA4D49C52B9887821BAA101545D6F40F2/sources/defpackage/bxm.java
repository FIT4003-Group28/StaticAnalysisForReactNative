package defpackage;

import defpackage.bxy;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: bxm  reason: default package */
/* loaded from: classes.dex */
abstract class bxm<T extends bxy> {
    private final Queue<T> a = cjp.h(20);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final T a() {
        T poll = this.a.poll();
        return poll == null ? c() : poll;
    }

    public final void b(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }

    public abstract T c();
}
