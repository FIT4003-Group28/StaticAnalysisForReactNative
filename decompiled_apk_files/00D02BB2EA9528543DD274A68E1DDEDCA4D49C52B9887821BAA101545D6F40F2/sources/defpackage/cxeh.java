package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
/* compiled from: PG */
/* renamed from: cxeh  reason: default package */
/* loaded from: classes5.dex */
final class cxeh extends ThreadLocal<WeakReference<ArrayDeque<cxdy>>> {
    final /* synthetic */ cxei a;

    public cxeh(cxei cxeiVar) {
        this.a = cxeiVar;
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ WeakReference<ArrayDeque<cxdy>> initialValue() {
        String concat;
        long id = Thread.currentThread().getId();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            concat = "UI Thread";
        } else {
            String valueOf = String.valueOf(Thread.currentThread().getName());
            concat = valueOf.length() != 0 ? "Thread: ".concat(valueOf) : new String("Thread: ");
        }
        cxdy cxdyVar = new cxdy(concat, id, 1);
        ArrayDeque<cxdy> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(cxdyVar);
        this.a.a.incrementAndGet();
        this.a.c.put(cxdyVar, arrayDeque);
        return new WeakReference<>(arrayDeque);
    }
}
