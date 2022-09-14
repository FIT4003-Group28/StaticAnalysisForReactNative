package h;

import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class i extends w {

    /* renamed from: a  reason: collision with root package name */
    private w f10149a;

    public i(w wVar) {
        if (wVar != null) {
            this.f10149a = wVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final i a(w wVar) {
        if (wVar != null) {
            this.f10149a = wVar;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final w a() {
        return this.f10149a;
    }

    @Override // h.w
    public w clearDeadline() {
        return this.f10149a.clearDeadline();
    }

    @Override // h.w
    public w clearTimeout() {
        return this.f10149a.clearTimeout();
    }

    @Override // h.w
    public long deadlineNanoTime() {
        return this.f10149a.deadlineNanoTime();
    }

    @Override // h.w
    public w deadlineNanoTime(long j) {
        return this.f10149a.deadlineNanoTime(j);
    }

    @Override // h.w
    public boolean hasDeadline() {
        return this.f10149a.hasDeadline();
    }

    @Override // h.w
    public void throwIfReached() {
        this.f10149a.throwIfReached();
    }

    @Override // h.w
    public w timeout(long j, TimeUnit timeUnit) {
        return this.f10149a.timeout(j, timeUnit);
    }

    @Override // h.w
    public long timeoutNanos() {
        return this.f10149a.timeoutNanos();
    }
}
