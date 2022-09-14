package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
/* compiled from: PG */
/* renamed from: dben  reason: default package */
/* loaded from: classes5.dex */
final class dben<T> extends PhantomReference<T> {
    private final Runnable a;

    public dben(T t, ReferenceQueue<T> referenceQueue, Runnable runnable) {
        super(t, referenceQueue);
        this.a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a.run();
    }
}
