package c.e.a.a.i;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
class k implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f3714a;

    /* loaded from: classes.dex */
    static class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final Runnable f3715b;

        a(Runnable runnable) {
            this.f3715b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f3715b.run();
            } catch (Exception e2) {
                c.e.a.a.i.u.a.a("Executor", "Background execution failure.", (Throwable) e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Executor executor) {
        this.f3714a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f3714a.execute(new a(runnable));
    }
}
