package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azmq  reason: default package */
/* loaded from: classes2.dex */
final class azmq implements Future {
    final aypg a;

    public azmq(aypg aypgVar) {
        this.a = aypgVar;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.a.qr();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return false;
    }
}
