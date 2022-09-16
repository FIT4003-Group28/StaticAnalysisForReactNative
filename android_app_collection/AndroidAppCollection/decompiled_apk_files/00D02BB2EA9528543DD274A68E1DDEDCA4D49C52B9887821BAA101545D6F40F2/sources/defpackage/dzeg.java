package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dzeg  reason: default package */
/* loaded from: classes6.dex */
final class dzeg implements Future<Object> {
    final dzak a;

    public dzeg(dzak dzakVar) {
        this.a = dzakVar;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.a.SQ();
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
