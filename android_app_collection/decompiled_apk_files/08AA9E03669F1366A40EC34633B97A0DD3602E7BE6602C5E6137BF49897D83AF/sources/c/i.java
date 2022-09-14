package c;

import java.util.concurrent.TimeUnit;
/* compiled from: ForwardingTimeout.java */
/* loaded from: classes.dex */
public class i extends u {

    /* renamed from: a  reason: collision with root package name */
    private u f1289a;

    public i(u uVar) {
        if (uVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f1289a = uVar;
    }

    public final u a() {
        return this.f1289a;
    }

    public final i a(u uVar) {
        if (uVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f1289a = uVar;
        return this;
    }

    @Override // c.u
    public u timeout(long j, TimeUnit timeUnit) {
        return this.f1289a.timeout(j, timeUnit);
    }

    @Override // c.u
    public long timeoutNanos() {
        return this.f1289a.timeoutNanos();
    }

    @Override // c.u
    public boolean hasDeadline() {
        return this.f1289a.hasDeadline();
    }

    @Override // c.u
    public long deadlineNanoTime() {
        return this.f1289a.deadlineNanoTime();
    }

    @Override // c.u
    public u deadlineNanoTime(long j) {
        return this.f1289a.deadlineNanoTime(j);
    }

    @Override // c.u
    public u clearTimeout() {
        return this.f1289a.clearTimeout();
    }

    @Override // c.u
    public u clearDeadline() {
        return this.f1289a.clearDeadline();
    }

    @Override // c.u
    public void throwIfReached() {
        this.f1289a.throwIfReached();
    }
}
