package android.arch.a.a;

import java.util.concurrent.Executor;
/* compiled from: ArchTaskExecutor.java */
/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f44a;

    /* renamed from: d  reason: collision with root package name */
    private static final Executor f45d = new Executor() { // from class: android.arch.a.a.a.1
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.a().b(runnable);
        }
    };
    private static final Executor e = new Executor() { // from class: android.arch.a.a.a.2
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.a().a(runnable);
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private c f47c = new b();

    /* renamed from: b  reason: collision with root package name */
    private c f46b = this.f47c;

    private a() {
    }

    public static a a() {
        if (f44a != null) {
            return f44a;
        }
        synchronized (a.class) {
            if (f44a == null) {
                f44a = new a();
            }
        }
        return f44a;
    }

    @Override // android.arch.a.a.c
    public void a(Runnable runnable) {
        this.f46b.a(runnable);
    }

    @Override // android.arch.a.a.c
    public void b(Runnable runnable) {
        this.f46b.b(runnable);
    }

    @Override // android.arch.a.a.c
    public boolean b() {
        return this.f46b.b();
    }
}
