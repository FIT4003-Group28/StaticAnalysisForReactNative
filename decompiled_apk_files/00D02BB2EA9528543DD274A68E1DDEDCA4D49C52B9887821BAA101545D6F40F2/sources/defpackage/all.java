package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: all  reason: default package */
/* loaded from: classes2.dex */
public final class all implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ Callable b;
    final /* synthetic */ ReentrantLock c;
    final /* synthetic */ AtomicBoolean d;
    final /* synthetic */ Condition e;

    public all(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
        this.a = atomicReference;
        this.b = callable;
        this.c = reentrantLock;
        this.d = atomicBoolean;
        this.e = condition;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.set(((ala) this.b).call());
        } catch (Exception unused) {
        }
        this.c.lock();
        try {
            this.d.set(false);
            this.e.signal();
        } finally {
            this.c.unlock();
        }
    }
}
