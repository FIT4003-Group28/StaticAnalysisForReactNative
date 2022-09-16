package h;

import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
final class o extends w {

    /* renamed from: a  reason: collision with root package name */
    private w f10178a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f10179b;

    /* renamed from: c  reason: collision with root package name */
    private long f10180c;

    /* renamed from: d  reason: collision with root package name */
    private long f10181d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f10178a.timeout(this.f10181d, TimeUnit.NANOSECONDS);
        if (this.f10179b) {
            this.f10178a.deadlineNanoTime(this.f10180c);
        } else {
            this.f10178a.clearDeadline();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(w wVar) {
        long deadlineNanoTime;
        this.f10178a = wVar;
        this.f10179b = wVar.hasDeadline();
        this.f10180c = this.f10179b ? wVar.deadlineNanoTime() : -1L;
        this.f10181d = wVar.timeoutNanos();
        wVar.timeout(w.minTimeout(this.f10181d, timeoutNanos()), TimeUnit.NANOSECONDS);
        if (this.f10179b && hasDeadline()) {
            deadlineNanoTime = Math.min(deadlineNanoTime(), this.f10180c);
        } else if (!hasDeadline()) {
            return;
        } else {
            deadlineNanoTime = deadlineNanoTime();
        }
        wVar.deadlineNanoTime(deadlineNanoTime);
    }
}
