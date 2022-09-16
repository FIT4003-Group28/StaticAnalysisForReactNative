package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: spl  reason: default package */
/* loaded from: classes4.dex */
public final class spl implements ThreadFactory {
    public final HashSet a = new HashSet();
    private final ThreadFactory b;

    public spl(ThreadFactory threadFactory) {
        this.b = threadFactory;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ArrayList a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        Thread newThread = this.b.newThread(new Runnable() { // from class: spk
            @Override // java.lang.Runnable
            public final void run() {
                spl splVar = spl.this;
                try {
                    runnable.run();
                    synchronized (splVar) {
                        splVar.a.remove(Thread.currentThread());
                    }
                } catch (Throwable th) {
                    synchronized (splVar) {
                        splVar.a.remove(Thread.currentThread());
                        throw th;
                    }
                }
            }
        });
        synchronized (this) {
            this.a.add(newThread);
        }
        return newThread;
    }
}
